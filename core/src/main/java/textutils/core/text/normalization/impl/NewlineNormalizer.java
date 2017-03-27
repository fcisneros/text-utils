package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;
import textutils.core.constants.NLPConstants;

import java.util.regex.Pattern;

/**
 * Normalize all new line characters found in the given string, replacing
 * them by a single newline char.
 *
 * @author fcisneros
 *
 */
public class NewlineNormalizer extends Normalizer {

	private Pattern p = Pattern.compile( NLPConstants.NEW_LINE_CHARS_REGEX );

	@Override
	protected String normalize( String str ) {
		return p.matcher( str ).replaceAll( NLPConstants.NEW_LINE );
	}

}
