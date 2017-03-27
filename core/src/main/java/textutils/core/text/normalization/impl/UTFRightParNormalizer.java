package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;
import textutils.core.constants.UTFConfusablesConstant;

import java.util.regex.Pattern;

/**
 * @author maca
 *
 */
public class UTFRightParNormalizer extends Normalizer {

	private Pattern p = Pattern.compile( UTFConfusablesConstant.WEIRD_RIGHT_PAR_CHARS_REGEX + "+" );

	@Override
	protected String normalize( String str ) {
		return p.matcher( str ).replaceAll( ")" ).trim();
	}

}