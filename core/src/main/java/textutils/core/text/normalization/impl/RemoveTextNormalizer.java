package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;
import java.util.regex.Pattern;

/**
 * Removes all occurrences of the given text (exact complete word or phrase)
 *
 * @author fcisneros
 *
 */
public class RemoveTextNormalizer extends Normalizer {

	private Pattern p;

	public RemoveTextNormalizer( String text ) {
		this.p = Pattern.compile( "\\b" + text + "\\b" );
	}

	@Override
	protected String normalize( String str ) {
		return p.matcher( str ).replaceAll("");
	}
}
