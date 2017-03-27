package textutils.core.constants;

/**
 * Utility Class to hold common constants across all project
 *
 * @author fcisneros, maca
 *
 * TODO: Add documentation for each constant
 *
 */
public class NLPConstants {

    /**
     * Regex to recognize roman numbers
     */
    public static final String ROMAN_NUMBER_REGEX =
            "(m{1,4}(cm|cd|d?c{0,3})(xc|xl|l?x{0,3})(ix|iv|v?i{0,3})|m{0,4}(cm|c?d|d?c{1,3})(xc|xl|l?x{0,3})(ix|iv|v?i{0,3})|m{0,4}(cm|cd|d?c{0,3})(xc|x?l|l?x{1,3})(ix|iv|v?i{0,3})|m{0,4}(cm|cd|d?c{0,3})(xc|xl|l?x{0,3})(ix|i?v|v?i{1,3}))";
    /**
     *
     */
    public static final String WORD_REGEX = "^[a-zA-ZÑñáéíóúüÁÉÍÓÚÜÇçèëËÈ]+";
    /**
     *
     */
    public static final String NOT_ALPHANUMERIC_REGEX =	"[^a-zA-ZÑñáéíóúüÁÉÍÓÚÜèëËÈÇç ]";
    /**
     *
     */
    public static final String NOT_ALPHANUMERIC_REGEX_PLUS_OTHERS =	"[^ a-zA-ZÑñáéíóúüÁÉÍÓÚÜèëËÈÇç.\\-\"\\(\\)]";

    //public static final String URL_REGEX = ".*((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z0-9]{2,6}.*";
    //public static final String SIMPLE_URL_REGEX = "((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z0-9]{2,6}[^\\s]+";
    //public static final String SIMPLE_URL_REGEX ="((https?|ftp|file)://)?((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z0-9]{2,6}[^\\s]+";
    //public static final String SIMPLE_URL_REGEX ="(?i)\\b((?:[a-z][\\w-]+:(?:/{1,3}|[a-z0-9%])|www\\d{0,3}[.]|[a-z0-9.\\-]+[.][a-z]{2,4}/)(?:[^\\s()<>]+|\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\))+(?:\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\)|[^\\s`!()\\[\\]{};:'\".,<>?«»“”‘’]))";
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
    public static final String TOKEN_SEPARATOR = " ";
    /**
     *
     */
    public static final String BADUTFCHAR = "u\\d\\d\\d([ A-Z0-9a-z\\.-])?([ A-Z0-9a-z\\.-])?";
    /**
     *
     */
    public static final String EMAIL_REGEX = ".*([a-zA-Z0-9_\\-\\&\\*\\+='/\\{\\}~][a-zA-Z0-9_\\-\\.&\\*\\+='/\\{\\}~]*)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?).*";

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
