package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;

public class LowerCaseNormalizer extends Normalizer {

	@Override
	protected String normalize( String str ) {
		return str.toLowerCase();
	}

}
