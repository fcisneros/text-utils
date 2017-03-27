package textutils.core.text.normalization.impl;


import textutils.core.text.normalization.Normalizer;

import java.util.regex.Pattern;

import static textutils.core.constants.UTFConfusablesConstant.WEIRD_ASTERISK_CHARS_REGEX;

/**
 * Normalize all asterisks characters found in the given string, replacing
 * them by a single char '*' and trimming final string.
 *
 * @author maca
 *
 */
public class UTFAsteriskNormalizer extends Normalizer {

	private Pattern p = Pattern.compile( WEIRD_ASTERISK_CHARS_REGEX + "+" );

	@Override
	protected String normalize( String str ) {
		return p.matcher( str ).replaceAll( "*" ).trim();
	}

}