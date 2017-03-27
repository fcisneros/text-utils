package textutils.core.text.normalization.test;


import textutils.core.TestUtils;
import textutils.core.text.normalization.TextNormalizerBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for TextNormalizerBuilder
 *
 * @author fcisneros
 *
 */
public class TextNormalizerBuilderTest {

    @Test
    public void fixDfotdotbug() {
        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
                .normalizeUTFs()
                .build();
        String text;
        String result;

        text = "Documento";
        result = n.apply( text );
        assertNotNull( result );
        TestUtils.out("Before: " + text);
        TestUtils.out("After: " + result);
        assertTrue(text.equals(result));

        text = "Documento conteniendo inforamcion de la Comporación Financiera Internacional y otras cosas como Vicente Fernández";
        result = n.apply( text );
        assertNotNull( result );
        TestUtils.out("Before: " + text);
        TestUtils.out("After: " + result);
        assertTrue(text.equals(result));
    }


    @Test
    public void normalizeUTFsOk() {
        String text = "\u2041 \u2024 \u2011 \u201F \u0021 \u00B8 \u204E \u02BB \uFD3F \uFD3E \u3014 \u23A2 This has multiple and strange UTF chars between";

        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .normalizeUTFs()
            .build();

        String result = n.apply( text );

        assertNotNull( result );
        TestUtils.out("Before: " + text);
        TestUtils.out("After: " + result);

        assertTrue(result.contains("!") );
        assertTrue(result.contains("'"));
        assertTrue(result.contains("|"));
        assertTrue(result.contains("("));
        assertTrue(result.contains(")"));
        assertTrue(result.contains("*"));
        assertTrue(result.contains(","));
        assertTrue(result.contains("-"));
        assertTrue(result.contains("."));
        assertTrue(result.contains("/"));
        assertTrue(result.contains("\""));
        assertFalse(result.contains( "\u2011") );

    }

    @Test
    public void removeTextOk() {
        String text = "This text has a need word that need to be removed someneedchained";

        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .removeText( "need" )
            .normalizeWhiteSpaces()
            .build();

        String result = n.apply( text );
        assertEquals( "This text has a word that to be removed someneedchained", result );
    }

    @Test
    public void normalizeWhitespacesOk() {
        String text = "This has   \u200Amultiple and 	strange white spaces \u2001  between";

        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .normalizeWhiteSpaces()
            .build();

        String result = n.apply( text );
        assertEquals( "This has multiple and strange white spaces between", result );
    }

    @Test
    public void removeNewlinesOk() {
        String text = "This has \n  multiple new lines \r\n and  should\n\n be removed\n";

        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .removeNewLines()
            .normalizeWhiteSpaces()
            .build();

        String result = n.apply( text );
        assertEquals( "This has multiple new lines and should be removed", result );
    }

    @Test
    public void normalizeNewlinesOk() {
        String text = "This has\n\rmultiple and\u00A0 strange new lines \rbetween";

        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .normalizeNewLines()
            .build();

        String result = n.apply( text );
        assertEquals( "This has\nmultiple and\n strange new lines \nbetween", result );

        result = n.apply( "(invalid \r regex formed" );
        assertEquals( "(invalid \n regex formed", result );
    }

    @Test
    public void removeMediaTagsOk() {
        String text = "This text has [imagen:85408] media tags [video:85408] that should be[foto: ERL]removed";

        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .removeMediaTags()
            .build();

        String result = n.apply( text );
        assertEquals( "This text has  media tags  that should beremoved", result );
    }

    @Test
    public void removeURLsOk() {
        String text = "This text has some urls http://bit.ly/gXZfqN http://fb.me/NRKRnQWy that will be removed";

        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .removeURLs()
            .build();

        String result = n.apply( text );
        assertEquals( "This text has some urls   that will be removed", result );
    }

    @Test
    public void normalizeAllOk() {
        String text = "(This has\r\n  http://fb.me/NRKRnQWy [imagen:85408] \u200Amultiple and\u00A0 |	\tstrange white spaces \u2001  between";

        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .removeMediaTags()
            .removeURLs()
            .removePipes()
            .normalizeWhiteSpaces()
            .normalizeNewLines()
            .removeAllFrom( "between" )
            .build();

        String result = n.apply( text );
        assertEquals( "(This has multiple and\n strange white spaces ", result );
    }

    @Test
    public void removeFromStartPointOK() {
        String text = "(This text should be  removed after x point and beyond..";

        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .removeAllFrom( "after x" )
            .normalizeWhiteSpaces()
            .build();

        String result = n.apply( text );
        assertEquals( "(This text should be removed", result );
    }

    @Test
    public void removePipesOk() {
        String text = "(This text contains | pipes that will be || removed |||, hopefully";

        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .removePipes()
            .normalizeWhiteSpaces()
            .build();

        String result = n.apply( text );
        assertEquals( "(This text contains pipes that will be removed , hopefully", result );
    }

    @Test
    public void normalizeNullOk() {
        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .normalizeWhiteSpaces()
            .normalizeNewLines()
            .build();

        String result = n.apply((String) null );
        assertNotNull( result );
    }

    @Test
    public void emptyNormalizerOK() {
        String text = "Un texto sin estemizar con verbos y otras palabras clave";
        TextNormalizerBuilder.TextNormalizer n = new TextNormalizerBuilder()
            .build();

        String result = n.apply( text );
        assertNotNull( result );
        assertEquals( text, result );

    }
}
