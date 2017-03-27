package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;
import textutils.core.constants.NLPConstants;
import textutils.core.constants.UTFConfusablesConstant;

import java.util.regex.Pattern;


/**
 * Normalize all whitespace characters found in the given string, replacing
 * them by a single whitespace char and trimming final string.
 *
 * @author fcisneros
 *
 */
public class UTFWhitespaceNormalizer extends Normalizer {

	private Pattern p = Pattern.compile( UTFConfusablesConstant.WHITESPACE_REGEX + "+" );

	@Override
	protected String normalize( String str ) {
		return p.matcher( str ).replaceAll( NLPConstants.WHITESPACE ).trim();
	}

}
