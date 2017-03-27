package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;

import java.util.regex.Pattern;


/**
 * Normalizer implementation to remove all the media tags like [video:3455] from
 * the given string and/replace them by the given replaceWith string.
 *
 * @author fcisneros
 *
 */
public class RemoveMediaTagsNormalizer extends Normalizer {

	private static final String MEDIA_TAGS_REGEX = "(\\[(video|imagen|image|foto)(:|=)(\\s*\\d*\\w*)\\])";

	private Pattern p = Pattern.compile( MEDIA_TAGS_REGEX );

	private String replaceWith = "";

	public RemoveMediaTagsNormalizer( String replaceWith ) {
		this.replaceWith = replaceWith;
	}

	public RemoveMediaTagsNormalizer() { }


	@Override
	protected String normalize( String str ) {
		return p.matcher( str ).replaceAll( replaceWith );
	}

}
