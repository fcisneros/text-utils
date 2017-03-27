package textutils.pig.udf;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
import textutils.core.text.normalization.TextNormalizerBuilder;

import java.io.IOException;

/**
 * @author fcisneros on 27/03/17.
 */
public class SimpleTextNormalizer extends EvalFunc<String> {

    private TextNormalizerBuilder.TextNormalizer norm =
            new TextNormalizerBuilder()
                    .normalizeUTFs()
                    .removeURLs()
                    .removeNewLines()
                    .normalizeWhiteSpaces()
                    .build();

    @Override
    public String exec(Tuple tuple) throws IOException {
        if(tuple == null || tuple.size() != 1) {
            return null;
        }

        return norm.apply((tuple.get(0) == null) ? null : tuple.get(0).toString());
    }

}
