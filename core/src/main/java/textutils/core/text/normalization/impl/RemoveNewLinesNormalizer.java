package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;
import textutils.core.constants.NLPConstants;

import java.util.regex.Pattern;

/**
 * Removes all new line characters found in the given string, replacing
 * them by a white space.
 *
 * @author fcisneros
 *
 */
public class RemoveNewLinesNormalizer extends Normalizer {

	private Pattern p = Pattern.compile( NLPConstants.NEW_LINE_CHARS_REGEX );

	@Override
	protected String normalize( String str ) {
		return p.matcher( str ).replaceAll( NLPConstants.WHITESPACE );
	}

}
