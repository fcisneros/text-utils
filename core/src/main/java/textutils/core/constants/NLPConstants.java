package textutils.core.constants;

/**
 * Utility Class to hold common constants across all project
 *
 * @author fcisneros
 *
 * TODO: Add documentation for each constant
 *
 */
public class NLPConstants {

    /**
     *
     */
    public static final String SIMPLE_URL_REGEX ="(?i)((?:[a-z][\\w-]+:(?:/{1,3}|[a-z0-9%])|www\\d{0,3}[.]|[a-z0-9.\\-]+[.][a-z]{2,4}/)(?:[^\\s()<>]+|\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\))+(?:\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\)|[^\\s`!()\\[\\]{};:'\".,<>?«»“”‘’]))";
    /**
     *
     */
    public static final String WHITESPACE = " ";

    /**
     *
     */
    public static final String WEIRDSPACE_TONEWLINE_REGEX = "\\u00A0"; // NO-BREAK SPACE (U+00A0)
    /**
     *
     */
    public static final String NEW_LINE = System.getProperty("line.separator");
    /**
     *
     */
    public static final String NEW_LINE_CHARS_REGEX = "[" + WEIRDSPACE_TONEWLINE_REGEX + NEW_LINE + "\r"+ "]+";

    /**
     *
     */
    public static final String LOWERCASE = "[a-záéíóúüç]" ;
    /**
     *
     */
    public static final String UPPERCASE = "[A-ZÁÉÍÓÚÜÇ]" ;
    /**
     *
     */
    public static final String WORDCHAR_REGEX = "[A-Za-záéíóúüÁÉÍÓÚÜçÇ]" ;
    /**
     *
     */
    public static final String NAME_PATTERN =
            WORDCHAR_REGEX+"(" + UPPERCASE + "*" +LOWERCASE + LOWERCASE+"*"+UPPERCASE+"|"+ LOWERCASE + "*"+
                    UPPERCASE + UPPERCASE + "*" + LOWERCASE + ")" + WORDCHAR_REGEX;
}
