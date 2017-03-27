package textutils.core.text.normalization;


import textutils.core.text.normalization.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility builder class for TextNormalization tasks
 *
 * @author fcisneros
 *
 */
public class TextNormalizerBuilder {

    private List<Normalizer> normalizers = new ArrayList<Normalizer>();

    public TextNormalizer build() {
        return new TextNormalizer();
    }

    public TextNormalizerBuilder normalizeWhiteSpaces() {
        normalizers.add( new UTFWhitespaceNormalizer() );
        return this;
    }

    public TextNormalizerBuilder normalizeUTFs() {

        normalizers.add( new UTFAsteriskNormalizer() );
        normalizers.add( new UTFComaNormalizer() );
        normalizers.add( new UTFDotsNormalizer() );
        normalizers.add( new UTFDoubleQuotesNormalizer() );
        normalizers.add( new UTFExclamationNormalizer() );
        normalizers.add( new UTFHyphenNormalizer() );
        normalizers.add( new UTFLeftParNormalizer() );
        normalizers.add( new UTFPipeNormalizer() );
        normalizers.add( new UTFRightParNormalizer() );
        normalizers.add( new UTFSingleQuotesNormalizer() );
        normalizers.add( new UTFSlashNormalizer() );
        normalizers.add( new UTFWhitespaceNormalizer() );
        return this;
    }

    public TextNormalizerBuilder normalizeNewLines() {
        normalizers.add( new NewlineNormalizer() );
        return this;
    }

    public TextNormalizerBuilder removeNewLines() {
        normalizers.add( new RemoveNewLinesNormalizer() );
        return this;
    }

    public TextNormalizerBuilder removeAllFrom( String from ) {
        normalizers.add( new RemoveFromTextNormalizer( from ) );
        return this;
    }

    public TextNormalizerBuilder removeMediaTags() {
        normalizers.add( new RemoveMediaTagsNormalizer() );
        return this;
    }

    public TextNormalizerBuilder removePipes() {
        normalizers.add( new RemovePipesNormalizer() );
        return this;
    }

    public TextNormalizerBuilder removeURLs() {
        normalizers.add( new RemoveURLsNormalizer() );
        return this;
    }

    public TextNormalizerBuilder lowerCase() {
        normalizers.add( new LowerCaseNormalizer() );
        return this;
    }

    public TextNormalizerBuilder removeText( String text ) {
        normalizers.add( new RemoveTextNormalizer( text ) );
        return this;
    }

    public TextNormalizerBuilder capitalize() {
        normalizers.add( new CapitalizeNormalizer() );
        return this;
    }

    public TextNormalizerBuilder removeHtml() {
    	normalizers.add( new RemoveHtmlNormalizer() );
        return this;
    }

    public TextNormalizerBuilder customNormalizer( Normalizer normalizer ) {
        if( normalizer != null ) {
            normalizers.add( normalizer );
        }
        return this;
    }

    public class TextNormalizer {

        private TextNormalizer() {}

        public String apply( String str ) {

            String result = str;
            for( Normalizer n : normalizers ) {
                result = n.apply( result );
            }
            return result;
        }

        public List<String> apply( List<String> strs ) {

            List<String> sal = new ArrayList<>();

            for (String s: strs) {
                for( Normalizer n : normalizers ) {
                    s = n.apply( s );
                }
                sal.add( s );
            }

            return sal;
        }
    }
}
