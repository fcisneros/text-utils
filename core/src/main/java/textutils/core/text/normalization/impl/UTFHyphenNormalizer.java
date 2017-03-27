package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;

import java.util.regex.Pattern;

import static textutils.core.constants.UTFConfusablesConstant.WEIRD_HYPHEN_CHARS_REGEX;

/**
 * @author maca
 *
 */
public class UTFHyphenNormalizer extends Normalizer {

	private Pattern p = Pattern.compile( WEIRD_HYPHEN_CHARS_REGEX + "+" );

	@Override
	protected String normalize( String str ) {
		return p.matcher( str ).replaceAll( "-" ).trim();
	}

}