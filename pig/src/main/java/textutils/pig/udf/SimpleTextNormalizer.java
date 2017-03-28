package textutils.pig.udf;

import org.apache.commons.logging.Log;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.DataType;
import org.apache.pig.data.Tuple;
import textutils.core.text.normalization.TextNormalizerBuilder;

import java.io.IOException;

/**
 * Simple text normalization rules.
 *
 * @author fcisneros
 */
public class SimpleTextNormalizer extends EvalFunc<String> {

    private final Log log = getLogger();

    private Long count = 0L;

    private TextNormalizerBuilder.TextNormalizer norm =
            new TextNormalizerBuilder()
                    .removeHtml()
                    //.normalizeUTFs()
                    //.removeURLs()
                    .removeNewLines()
                    .normalizeWhiteSpaces()
                    .build();

    @Override
    public String exec(Tuple tuple) throws IOException {
        if(tuple == null || tuple.size() < 1 || tuple.get(0) == null) {
            return null;
        }

        final String text = DataType.toString(tuple.get(0));

        return norm.apply(text);
    }

}
