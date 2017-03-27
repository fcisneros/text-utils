package textutils.core.text.normalization;

import org.apache.commons.lang3.StringUtils;

/**
 * Abstract class to hold a simple template for text normalization
 *
 * @author fcisneros
 *
 */
public abstract class Normalizer {

	private static final String EMPTY = "";

	/**
	 * Apply the normalization on the given string
	 * @param str new normalized string
	 * @return
	 */
	public final String apply( String str ) {
		if( str == null || StringUtils.isEmpty( str ) ) {
			return EMPTY;
		}

		return normalize( str );
	}

	protected abstract String normalize( String str );

}
