package textutils.core.text.normalization.impl;


import textutils.core.text.normalization.Normalizer;
import org.apache.commons.lang3.text.WordUtils;

public class CapitalizeNormalizer extends Normalizer {

	@Override
	protected String normalize(String str) {
		return WordUtils.capitalizeFully( str );
	}

}
