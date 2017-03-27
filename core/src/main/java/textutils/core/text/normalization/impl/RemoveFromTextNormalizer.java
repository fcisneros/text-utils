package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;
/**
 * Normalizer implementation to remove all the remaining text from the given
 * starting point (from string).
 *
 * @author fcisneros
 *
 */
public class RemoveFromTextNormalizer extends Normalizer {

	private final String fromString;

	public RemoveFromTextNormalizer( String from ) {
		if( from == null || from.isEmpty() ) {
			throw new IllegalArgumentException( "Invalid starting point: " + from );
		}
		this.fromString = from;
	}

	@Override
	protected String normalize( String str ) {
		if( str.contains( fromString ) ) {
			return str.substring( 0, str.indexOf( fromString ) ) ;
		}

		return str;
	}

}
