package textutils.core.text.normalization.impl;

import textutils.core.text.normalization.Normalizer;
import org.jsoup.Jsoup;

public class RemoveHtmlNormalizer extends Normalizer {

	@Override
	protected String normalize(String str) {
		return Jsoup.parse(str).text();
	}

}
