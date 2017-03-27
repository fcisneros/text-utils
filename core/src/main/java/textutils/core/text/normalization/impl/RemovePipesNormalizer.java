package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;
import java.util.regex.Pattern;

public class RemovePipesNormalizer extends Normalizer {
	private Pattern p = Pattern.compile( "\\|+" );

	@Override
	protected String normalize( String str ) {
		return p.matcher( str ).replaceAll("");
	}
}
