package textutils.core.constants;

public class UTFConfusablesConstant
{

    public static final String WEIRD_DOUBLEQUOTES_CHARS =
            "\\u0022" + //QUOTATION MARK
            "\\u02BA" + //MODIFIER LETTER DOUBLE PRIME
            "\\u02DD" + //DOUBLE ACUTE ACCENT
            "\\u02EE" + //MODIFIER LETTER DOUBLE APOSTROPHE
            "\\u02F6" + //MODIFIER LETTER MIDDLE DOUBLE ACUTE ACCENT
            "\\u05F2" + //HEBREW LIGATURE YIDDISH DOUBLE YOD
            "\\u05F4" + //HEBREW PUNCTUATION GERSHAYIM
            "\\u1CD3" + //VEDIC SIGN NIHSHVASA
            "\\u201C" + //LEFT DOUBLE QUOTATION MARK
            "\\u201D" + //RIGHT DOUBLE QUOTATION MARK
            "\\u201F" + //DOUBLE HIGH-REVERSED-9 QUOTATION MARK
            "\\u2033" + //DOUBLE PRIME
            "\\u2036" + //REVERSED DOUBLE PRIME
            "\\u3003" + //DITTO MARK
            "\\uFF02" ;  //FULLWIDTH QUOTATION MARK
    public static final String WEIRD_DOUBLEQUOTES_REGEX = "["  + WEIRD_DOUBLEQUOTES_CHARS + "]";


    public static final String WEIRD_EXCLAMATION_CHARS =
            "\\u0021" + //EXCLAMATION MARK
            "\\u01C3" + //LATIN LETTER RETROFLEX CLICK
            "\\uFF01" ;  //FULLWIDTH EXCLAMATION MARK
    public static final String  WEIRD_EXCLAMATION_REGEX = "["  + WEIRD_EXCLAMATION_CHARS + "]";


    public static final String WEIRD_SINGLEQUOTE_CHARS =
            "\\u0027" + //APOSTROPHE
            "\\u0060" + //GRAVE ACCENT
            "\\uA78C" + //LATIN SMALL LETTER SALTILLO
            "\\u02BB" + //MODIFIER LETTER TURNED COMMA
            "\\u02BC" + //MODIFIER LETTER APOSTROPHE
            "\\u05D9" + //HEBREW LETTER YOD
            "\\u02B9" + //MODIFIER LETTER PRIME
            "\\u02BD" + //MODIFIER LETTER REVERSED COMMA
            "\\u02BE" + //MODIFIER LETTER RIGHT HALF RING
            "\\u02CA" + //MODIFIER LETTER ACUTE ACCENT
            "\\u02CB" + //MODIFIER LETTER GRAVE ACCENT
            "\\u07F4" + //NKO HIGH TONE APOSTROPHE
            "\\u07F5" + //NKO LOW TONE APOSTROPHE
            "\\u0374" + //GREEK NUMERAL SIGN
            "\\u05F3" + //HEBREW PUNCTUATION GERESH
            "\\u2019" + //RIGHT SINGLE QUOTATION MARK
            "\\u02F4" + //MODIFIER LETTER MIDDLE GRAVE ACCENT
            "\\u055A" + //ARMENIAN APOSTROPHE
            "\\u055D" + //ARMENIAN COMMA
            "\\u2018" + //LEFT SINGLE QUOTATION MARK
            "\\u201B" + //SINGLE HIGH-REVERSED-9 QUOTATION MARK
            "\\u2032" + //PRIME
            "\\u2035" + //REVERSED PRIME
            "\\u00B4" + //ACUTE ACCENT
            "\\u0384" + //GREEK TONOS
            "\\u1FBD" + //GREEK KORONIS
            "\\u1FBF" + //GREEK PSILI
            "\\u1FEF" + //GREEK VARIA
            "\\u1FFD" + //GREEK OXIA
            "\\u1FFE" + //GREEK DASIA
            "\\uFF07" + //FULLWIDTH APOSTROPHE
            "\\uFF40" ;  //FULLWIDTH GRAVE ACCENT
    public static final String  WEIRD_SINGLEQUOTE_REGEX = "["  + WEIRD_SINGLEQUOTE_CHARS + "]";

    /**
     * Weird Spaces
     */
    public static final String WHITESPACE_CHARS =  ""       /* dummy empty string for homogeneity */
            + "\\u0009" // CHARACTER TABULATION
            + "\\u0092" // Cancel char?
            + "\\u0093" // Cancel char?
            + "\\u0094" // Cancel char?
            + "\\u000A" // LINE FEED (LF)
            + "\\u000B" // LINE TABULATION
            + "\\u000C" // FORM FEED (FF)
            + "\\u000D" // CARRIAGE RETURN (CR)
            + "\\u0020" // SPACE
            + "\\u0085" // NEXT LINE (NEL)
            + "\\u1680" // OGHAM SPACE MARK
            + "\\u180E" // MONGOLIAN VOWEL SEPARATOR
            + "\\u2000" // EN QUAD
            + "\\u2001" // EM QUAD
            + "\\u2002" // EN SPACE
            + "\\u2003" // EM SPACE
            + "\\u2004" // THREE-PER-EM SPACE
            + "\\u2005" // FOUR-PER-EM SPACE
            + "\\u2006" // SIX-PER-EM SPACE
            + "\\u2007" // FIGURE SPACE
            + "\\u2008" // PUNCTUATION SPACE
            + "\\u2009" // THIN SPACE
            + "\\u200A" // HAIR SPACE
            + "\\u2028" // LINE SEPARATOR
            + "\\u2029" // PARAGRAPH SEPARATOR
            + "\\u202F" // NARROW NO-BREAK SPACE
            + "\\u205F" // MEDIUM MATHEMATICAL SPACE
            + "\\u3000"; // IDEOGRAPHIC SPACE
    public static final String WHITESPACE_REGEX = "["  + WHITESPACE_CHARS + "]";

    //	#	丨	ᅵ	ㅣ	⎜	⎟	⎢	⎥	⎪	⎮
    public static final String WEIRD_PIPE_CHARS =
            "\\u1175"   + //HANGUL JUNGSEONG I
            "\\u4E28"   + //CJK UNIFIED IDEOGRAPH-4E28
            "\\u3163"   + //HANGUL LETTER I
            "\\u239C"   + //LEFT PARENTHESIS EXTENSION
            "\\u239F"   + //RIGHT PARENTHESIS EXTENSION
            "\\u23A2"   + //LEFT SQUARE BRACKET EXTENSION
            "\\u23A5"   + //RIGHT SQUARE BRACKET EXTENSION
            "\\u23AA"   + //CURLY BRACKET EXTENSION
            "\\u23AE"   + //INTEGRAL EXTENSION
            "\\u31D1"   + //CJK STROKE S
            "\\u2F01"   ; //KANGXI RADICAL LINE
    public static final String  WEIRD_PIPE_CHARS_REGEX = "["  + WEIRD_PIPE_CHARS + "]";


    //	(	❨	❲	〔	﴾	［
    public static final String WEIRD_LEFT_PAR_CHARS =
            "\\u0028" +	 //LEFT PARENTHESIS
            "\\u2768" +	 //MEDIUM LEFT PARENTHESIS ORNAMENT
            "\\u2772" +	 //LIGHT LEFT TORTOISE SHELL BRACKET ORNAMENT
            "\\u3014" +	 //LEFT TORTOISE SHELL BRACKET
            "\\uFD3E" +	 //ORNATE LEFT PARENTHESIS
            "\\uFF3B" ;	 //FULLWIDTH LEFT SQUARE BRACKET
    public static final String  WEIRD_LEFT_PAR_CHARS_REGEX = "["  + WEIRD_LEFT_PAR_CHARS + "]";


    //	)	❩	❳	〕	﴿	］
    public static final String WEIRD_RIGHT_PAR_CHARS =
            "\\u0029" +	 //RIGHT PARENTHESIS
            "\\u2769" +	 //MEDIUM RIGHT PARENTHESIS ORNAMENT
            "\\u2773" +	 //LIGHT RIGHT TORTOISE SHELL BRACKET ORNAMENT	# →〕→
            "\\u3015" +	 //RIGHT TORTOISE SHELL BRACKET
            "\\uFD3F" +	 //ORNATE RIGHT PARENTHESIS
            "\\uFF3D" ;	 //FULLWIDTH RIGHT SQUARE BRACKET	# →〕→
    public static final String  WEIRD_RIGHT_PAR_CHARS_REGEX = "["  + WEIRD_RIGHT_PAR_CHARS + "]";


    //	*	٭	⁎	∗
    public static final String WEIRD_ASTERISK_CHARS =
            "\\u002A" +	 //ASTERISK
            "\\u066D" +	 //ARABIC FIVE POINTED STAR
            "\\u204E" +	 //LOW ASTERISK
            "\\u2217" ;	 // ASTERISK OPERATOR
    public static final String  WEIRD_ASTERISK_CHARS_REGEX = "["  + WEIRD_ASTERISK_CHARS + "]";


    // ,	,	٫	‚	¸
    public static final String WEIRD_COMA_CHARS =
            "\\u002C" +	 //COMMA
            "\\u066B" +	 //ARABIC DECIMAL SEPARATOR
            "\\u201A" +	 //SINGLE LOW-9 QUOTATION MARK
            "\\u00B8" ;	 //CEDILLA
    public static final String  WEIRD_COMA_CHARS_REGEX = "["  + WEIRD_COMA_CHARS + "]";


    //-	˗	‐	‒	–	⁃	−	‑	﹘
    public static final String WEIRD_HYPHEN_CHARS =
            "\\u002D" +	 //HYPHEN-MINUS
            "\\u2CBA" +	 //COPTIC CAPITAL LETTER DIALECT-P NI	# →‒→
            "\\u02D7" +	 //MODIFIER LETTER MINUS SIGN
            "\\u2010" +	 //HYPHEN
            "\\u2012" +	 //FIGURE DASH
            "\\u2013" +	 //EN DASH
            "\\u2043" +	 //HYPHEN BULLET	# →‒→
            "\\u2212" +	 //MINUS SIGN
            "\\u2011" +	 //NON-BREAKING HYPHEN
            "\\uFE58" ;	 //SMALL EM DASH
    public static final String  WEIRD_HYPHEN_CHARS_REGEX = "["  + WEIRD_HYPHEN_CHARS + "]";


    //.	٠	۰	ꓸ	ꓻ	𝅭	۔	܁	܂	꘎	․
    public static final String WEIRD_DOT_CHARS =
            "\\u002E" +	 //FULL STOP
            "\\u0660" +	 //ARABIC-INDIC DIGIT ZERO
            "\\u06F0" +	 //EXTENDED ARABIC-INDIC DIGIT ZERO	# →‎٠‎→
            "\\uA4F8" +	 //LISU LETTER TONE MYA TI
            "\\uA4FB" +	 //LISU LETTER TONE MYA BO
            "\\u1D16" +	 //MUSICAL SYMBOL COMBINING AUGMENTATION DOT
            "\\u06D4" +	 //ARABIC FULL STOP
            "\\u0701" +	 //SYRIAC SUPRALINEAR FULL STOP
            "\\u0702" +	 //SYRIAC SUBLINEAR FULL STOP
            "\\uA60E" +	 //VAI FULL STOP
            "\\u10A50" +	 //KHAROSHTHI PUNCTUATION DOT
            "\\u2024" ;	 //ONE DOT LEADER
    public static final String  WEIRD_DOT_CHARS_REGEX = "["  + WEIRD_DOT_CHARS + "]";

    //	/	丿		〳	᜵	⁁	⁄	∕	╱	⧸
    public static final String WEIRD_SLASH_CHARS =
            "\\u002F" +	 //SOLIDUS
            "\\u4E3F" +	 //CJK UNIFIED IDEOGRAPH-4E3F	#
            "\\u2CC6" +	 //COPTIC CAPITAL LETTER OLD COPTIC ESH
            "\\u3033" +	 //VERTICAL KANA REPEAT MARK UPPER HALF
            "\\u1735" +	 //PHILIPPINE SINGLE PUNCTUATION
            "\\u2041" +	 //CARET INSERTION POINT
            "\\u2044" +	 //FRACTION SLASH
            "\\u2215" +	 //DIVISION SLASH
            "\\u2571" +	 //BOX DRAWINGS LIGHT DIAGONAL UPPER RIGHT TO LOWER LEFT
            "\\u29F8" +	 //BIG SOLIDUS
            "\\u31D3" +	 //CJK STROKE SP	# →→
            "\\u2F03" ;	 //KANGXI RADICAL SLASH
    public static final String  WEIRD_SLASH_CHARS_REGEX = "["  + WEIRD_SLASH_CHARS + "]";

}
