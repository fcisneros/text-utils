package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;
import textutils.core.constants.NLPConstants;

import java.util.regex.Pattern;

public class RemoveURLsNormalizer extends Normalizer {

    // URLPattern.matcher( word ).matches()
    private Pattern p = Pattern.compile(NLPConstants.SIMPLE_URL_REGEX);// "https?:[^\\s]*" );

    @Override
    protected String normalize( String str ) {
        return p.matcher( str ).replaceAll( "" );
    }

}
