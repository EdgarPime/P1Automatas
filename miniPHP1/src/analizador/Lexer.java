/* The following code was generated by JFlex 1.4.3 on 30/03/18 10:52 PM */

package analizador;
import static analizador.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 30/03/18 10:52 PM from the specification file
 * <tt>C:/Users/Pimentel/Desktop/proyecto automatas/2da version/miniPHP1/src/analizador/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\42\1\40\2\0\1\42\22\0\1\42\1\16\1\41\1\0"+
    "\1\4\1\15\1\7\1\37\1\0\1\0\1\12\1\11\1\6\1\13"+
    "\1\5\1\14\12\2\1\0\1\3\1\17\1\10\1\20\1\35\1\0"+
    "\13\1\1\1\1\1\1\1\6\1\1\1\5\1\1\0\1\0\1\0"+
    "\1\0\1\1\1\0\1\21\1\1\1\34\1\23\1\30\1\1\1\1"+
    "\1\32\1\1\1\1\1\1\1\1\1\1\1\22\1\25\1\36\1\1"+
    "\1\26\1\31\1\33\1\1\1\1\1\1\1\24\2\1\1\0\1\27"+
    "\2\0\201\1\uff00\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\2\1\2\2\1\11\1\2\1\12\1\0"+
    "\1\13\3\0\2\2\1\0\1\14\3\0\4\12\1\0"+
    "\2\2\7\0\1\12\2\0\2\12\6\0\1\12\1\0"+
    "\2\2\10\0\2\12\2\0\2\12\1\0\1\2\1\0"+
    "\1\2\1\0\1\2\4\0\1\14\1\0\1\14\3\12"+
    "\15\0\1\2\2\0\2\2\2\12\5\0\1\15\1\14"+
    "\2\0\1\14\2\0\1\2\1\0\1\12\25\0\2\12"+
    "\2\0\2\12\3\0\1\14\2\0\1\14\2\0\1\12"+
    "\1\0\2\12\1\0\1\12\1\0\2\12\3\0\2\12"+
    "\1\0\1\12\2\0\3\12\5\0\5\12\2\0\3\12"+
    "\1\0\1\12\2\0\2\12\1\0\1\12\1\0\2\12"+
    "\1\0\7\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[214];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\43\0\106\0\43\0\151\0\214\0\43\0\43"+
    "\0\43\0\43\0\257\0\322\0\365\0\u0118\0\u013b\0\u015e"+
    "\0\u0181\0\151\0\43\0\u01a4\0\257\0\u01c7\0\u01ea\0\u020d"+
    "\0\u013b\0\43\0\u0230\0\u0253\0\u0276\0\u0299\0\u02bc\0\u02df"+
    "\0\u0302\0\u0325\0\u0348\0\u036b\0\u038e\0\u03b1\0\u03d4\0\u03f7"+
    "\0\u041a\0\u043d\0\u0460\0\u0483\0\u04a6\0\u04c9\0\u04ec\0\u050f"+
    "\0\u0532\0\u0555\0\u0578\0\u059b\0\u05be\0\u05e1\0\u0604\0\u0627"+
    "\0\u064a\0\u066d\0\u0690\0\u06b3\0\u06d6\0\u06f9\0\u071c\0\u073f"+
    "\0\u0762\0\u0785\0\u07a8\0\u07cb\0\u07ee\0\u0811\0\u0834\0\u0857"+
    "\0\u087a\0\u089d\0\u08c0\0\u08e3\0\u0906\0\u0929\0\u094c\0\u096f"+
    "\0\u0992\0\u09b5\0\u041a\0\u09d8\0\u0460\0\u09fb\0\u0a1e\0\u0a41"+
    "\0\u0a64\0\u0a87\0\u0aaa\0\u0acd\0\u0af0\0\u0b13\0\u0b36\0\u0b59"+
    "\0\u0b7c\0\u0b9f\0\u0bc2\0\u0be5\0\u0c08\0\u0c2b\0\u0c4e\0\u0c71"+
    "\0\u0c94\0\u0cb7\0\u0cda\0\u0cfd\0\u0d20\0\u0d43\0\u0d66\0\u0d89"+
    "\0\u0dac\0\u0be5\0\u08c0\0\u0dcf\0\u0df2\0\u0906\0\u0e15\0\u0e38"+
    "\0\u0e5b\0\u0e7e\0\u0ea1\0\u0ec4\0\u0ee7\0\u0f0a\0\u0f2d\0\u0f50"+
    "\0\u0f73\0\u0f96\0\u0fb9\0\u0fdc\0\u0fff\0\u1022\0\u1045\0\u1068"+
    "\0\u108b\0\u10ae\0\u10d1\0\u10f4\0\u1117\0\u113a\0\u115d\0\u1180"+
    "\0\u11a3\0\u11c6\0\u11e9\0\u120c\0\u122f\0\u1252\0\u1275\0\u1298"+
    "\0\u12bb\0\u0f73\0\u12de\0\u1301\0\u0fb9\0\u1324\0\u1347\0\u136a"+
    "\0\u138d\0\u13b0\0\u13d3\0\u13f6\0\u1419\0\u143c\0\u145f\0\u1482"+
    "\0\u14a5\0\u14c8\0\u14eb\0\u150e\0\u1531\0\u1554\0\u1577\0\u159a"+
    "\0\u15bd\0\u15e0\0\u1603\0\u1626\0\u1649\0\u166c\0\u168f\0\u16b2"+
    "\0\u16d5\0\u16f8\0\u171b\0\u173e\0\u1761\0\u1784\0\u17a7\0\u17ca"+
    "\0\u17ed\0\u1810\0\u1833\0\u1856\0\u1879\0\u189c\0\u18bf\0\u18e2"+
    "\0\u1905\0\u1928\0\u194b\0\u196e\0\u1991\0\u19b4\0\u19d7\0\u19fa"+
    "\0\u1a1d\0\u1a40\0\u1a63\0\u1a86\0\u1aa9\0\u1acc";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[214];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\3\2\1\6\1\7"+
    "\1\10\1\11\1\12\1\2\1\13\1\14\1\2\6\3"+
    "\1\2\1\15\3\3\1\16\1\2\1\3\1\2\1\17"+
    "\1\2\1\17\44\0\2\3\16\0\6\3\1\0\5\3"+
    "\1\0\1\3\1\0\1\20\1\0\1\20\1\0\1\21"+
    "\17\0\6\21\1\0\5\21\1\0\1\21\1\0\1\22"+
    "\1\0\1\22\10\0\1\23\36\0\1\24\33\0\1\25"+
    "\1\0\1\25\35\0\1\26\6\0\2\3\16\0\6\3"+
    "\1\0\4\3\1\27\1\0\1\3\1\0\1\20\1\0"+
    "\1\20\1\0\2\3\16\0\4\3\1\30\1\3\1\0"+
    "\5\3\1\0\1\3\1\0\1\20\1\0\1\20\1\0"+
    "\1\3\2\0\1\22\14\0\6\3\1\0\4\3\1\16"+
    "\1\0\1\3\1\0\1\31\1\0\1\31\40\0\1\20"+
    "\1\0\1\20\1\0\2\21\1\32\2\0\1\33\1\0"+
    "\1\34\5\0\1\35\1\36\1\37\6\21\1\0\5\21"+
    "\1\0\1\21\1\0\1\40\1\0\1\40\1\0\1\41"+
    "\17\0\6\41\1\0\5\41\1\0\1\41\1\0\1\24"+
    "\1\0\1\24\36\0\1\42\5\0\2\3\16\0\6\3"+
    "\1\0\2\3\1\43\2\3\1\0\1\3\1\0\1\20"+
    "\1\0\1\20\1\0\2\3\16\0\1\3\1\44\4\3"+
    "\1\0\5\3\1\0\1\3\1\0\1\20\1\0\1\20"+
    "\4\0\1\45\33\0\1\33\1\0\1\33\2\0\1\46"+
    "\1\32\1\47\3\0\1\37\5\50\21\0\1\51\1\52"+
    "\1\53\1\52\10\0\1\37\34\0\1\54\1\0\1\55"+
    "\2\0\1\56\1\57\7\0\1\60\1\61\2\0\1\62"+
    "\1\63\1\0\1\64\7\0\1\65\1\60\1\66\1\60"+
    "\2\0\1\54\1\0\1\55\2\0\1\56\1\60\10\0"+
    "\1\61\2\0\1\62\1\63\1\0\1\64\7\0\1\65"+
    "\1\60\1\66\1\60\3\0\1\32\2\0\1\33\1\0"+
    "\1\34\5\0\1\35\1\36\1\37\17\0\1\40\1\0"+
    "\1\40\1\0\2\41\16\0\6\41\1\0\5\41\1\0"+
    "\1\41\1\0\1\67\1\0\1\67\32\0\1\70\11\0"+
    "\2\3\16\0\4\3\1\71\1\3\1\0\5\3\1\0"+
    "\1\3\1\0\1\20\1\0\1\20\1\0\2\3\16\0"+
    "\6\3\1\0\1\3\1\72\3\3\1\0\1\3\1\0"+
    "\1\20\1\0\1\20\1\0\1\73\17\0\6\73\1\0"+
    "\5\73\1\0\1\73\1\0\1\45\1\0\1\45\2\0"+
    "\1\46\1\32\1\0\1\74\3\0\5\50\22\0\1\75"+
    "\1\0\1\75\1\0\1\76\17\0\6\76\1\0\5\76"+
    "\1\0\1\76\1\0\1\47\1\0\1\47\2\0\1\46"+
    "\1\32\1\77\4\0\5\50\22\0\1\50\1\0\1\50"+
    "\37\51\1\100\1\0\2\51\2\0\1\46\1\32\1\47"+
    "\4\0\5\50\21\0\1\51\1\52\1\53\1\52\40\53"+
    "\1\0\1\101\1\53\2\0\1\54\2\0\1\102\1\0"+
    "\1\56\11\0\1\61\2\0\1\62\1\63\1\0\1\64"+
    "\10\0\1\103\1\0\1\103\1\0\1\104\17\0\6\104"+
    "\1\0\5\104\1\0\1\104\1\0\1\55\1\0\1\55"+
    "\7\0\1\105\35\0\1\54\1\0\1\55\2\0\1\56"+
    "\10\0\1\60\1\61\2\0\1\62\1\63\1\0\1\64"+
    "\7\0\1\65\1\60\1\66\1\60\2\0\1\54\1\0"+
    "\1\55\2\0\1\56\11\0\1\61\2\0\1\62\1\63"+
    "\1\0\1\64\7\0\1\65\1\60\1\66\1\60\22\0"+
    "\1\106\45\0\1\63\43\0\1\105\43\0\1\105\13\0"+
    "\37\65\1\107\1\0\2\65\40\66\1\0\1\110\1\66"+
    "\40\0\1\67\1\0\1\67\36\0\1\111\5\0\1\3"+
    "\1\112\1\32\1\77\4\0\5\50\3\0\6\3\1\0"+
    "\5\3\1\0\1\3\1\113\1\114\1\115\1\114\1\0"+
    "\2\3\16\0\6\3\1\0\3\3\1\116\1\3\1\0"+
    "\1\3\1\0\1\20\1\0\1\20\1\0\2\73\1\32"+
    "\2\0\1\33\12\0\6\73\1\0\5\73\1\0\1\73"+
    "\1\0\1\117\1\0\1\117\2\0\1\120\43\0\1\32"+
    "\5\0\5\50\22\0\1\75\1\0\1\75\1\0\2\76"+
    "\1\32\4\0\1\52\5\50\3\0\6\76\1\0\5\76"+
    "\1\0\1\76\1\0\1\121\1\0\1\121\1\0\1\122"+
    "\17\0\6\122\1\0\5\122\1\0\1\122\1\0\1\77"+
    "\1\0\1\77\3\51\1\123\33\51\1\100\1\124\1\51"+
    "\1\100\3\53\1\125\34\53\1\124\2\101\2\0\1\126"+
    "\47\0\1\56\11\0\1\61\2\0\1\62\1\63\1\0"+
    "\1\64\10\0\1\103\1\0\1\103\1\0\2\104\4\0"+
    "\1\56\11\0\1\127\3\104\1\130\1\104\1\64\5\104"+
    "\1\0\1\104\1\0\1\103\1\0\1\103\4\0\1\131"+
    "\33\0\1\105\1\0\1\105\23\0\1\105\17\0\7\65"+
    "\1\132\11\65\1\133\2\65\1\134\1\135\1\65\1\136"+
    "\7\65\1\107\1\103\1\65\1\107\7\66\1\137\11\66"+
    "\1\140\2\66\1\141\1\142\1\66\1\143\10\66\1\103"+
    "\2\110\35\144\1\145\2\144\1\111\1\144\1\111\1\0"+
    "\1\3\1\112\1\32\1\0\1\74\3\0\5\50\3\0"+
    "\6\3\1\0\5\3\1\0\1\3\1\0\1\146\1\0"+
    "\1\146\37\113\1\147\1\0\2\113\2\0\1\46\1\32"+
    "\1\77\4\0\5\50\21\0\1\113\1\114\1\115\1\114"+
    "\40\115\1\0\1\150\1\115\1\0\1\151\1\3\16\0"+
    "\6\151\1\0\5\151\1\0\1\151\1\0\1\152\1\0"+
    "\1\152\3\0\1\32\2\0\1\33\31\0\1\117\1\0"+
    "\1\117\2\0\1\120\1\32\5\0\5\50\22\0\1\75"+
    "\1\0\1\75\3\0\1\32\4\0\1\52\5\50\22\0"+
    "\1\121\1\0\1\121\1\0\2\122\1\32\5\0\5\50"+
    "\3\0\6\122\1\0\5\122\1\0\1\122\1\0\1\75"+
    "\1\0\1\75\3\0\1\32\34\0\1\124\1\0\1\124"+
    "\2\0\1\126\4\0\1\56\11\0\1\61\2\0\1\62"+
    "\1\63\1\0\1\64\10\0\1\103\1\0\1\103\1\0"+
    "\2\104\4\0\1\56\11\0\1\127\1\153\2\104\1\130"+
    "\1\104\1\64\5\104\1\0\1\104\1\0\1\103\1\0"+
    "\1\103\1\0\2\104\4\0\1\56\11\0\1\127\3\104"+
    "\1\130\1\154\1\64\5\104\1\0\1\104\1\0\1\103"+
    "\1\0\1\103\1\0\1\155\17\0\6\155\1\0\5\155"+
    "\1\0\1\155\1\0\1\131\1\0\1\131\7\65\1\156"+
    "\27\65\1\107\1\0\24\65\1\157\14\65\1\107\1\0"+
    "\27\65\1\135\11\65\1\107\1\0\30\65\1\156\10\65"+
    "\1\107\1\0\31\65\1\156\7\65\1\107\1\0\2\65"+
    "\7\66\1\160\30\66\1\0\1\110\23\66\1\161\15\66"+
    "\1\0\1\110\26\66\1\142\12\66\1\0\1\110\27\66"+
    "\1\160\11\66\1\0\1\110\30\66\1\160\10\66\1\0"+
    "\1\110\1\66\35\144\1\145\2\144\1\0\22\144\1\162"+
    "\14\144\1\145\2\144\1\0\2\144\3\0\1\32\5\0"+
    "\5\50\22\0\1\146\1\0\1\146\3\113\1\163\1\113"+
    "\1\164\31\113\1\147\1\165\1\113\1\147\3\115\1\166"+
    "\1\115\1\167\32\115\1\165\2\150\1\0\2\151\5\0"+
    "\1\170\10\0\6\151\1\0\5\151\1\0\1\151\1\0"+
    "\1\171\1\0\1\171\1\0\1\172\17\0\6\172\1\0"+
    "\5\172\1\0\1\172\1\0\1\152\1\0\1\152\1\0"+
    "\2\104\4\0\1\56\11\0\1\127\1\104\1\154\1\104"+
    "\1\130\1\104\1\64\5\104\1\0\1\104\1\0\1\103"+
    "\1\0\1\103\1\0\2\104\1\0\1\131\2\0\1\56"+
    "\11\0\1\127\3\104\1\130\1\104\1\64\5\104\1\0"+
    "\1\104\1\0\1\173\1\0\1\173\1\0\2\155\5\0"+
    "\1\35\5\0\1\35\1\36\1\37\6\155\1\0\5\155"+
    "\1\0\1\155\1\0\1\174\1\0\1\174\4\65\1\175"+
    "\32\65\1\107\1\105\1\65\1\156\23\65\1\156\13\65"+
    "\1\107\1\0\2\65\4\66\1\176\33\66\1\105\1\110"+
    "\1\160\23\66\1\160\14\66\1\0\1\110\1\66\4\113"+
    "\1\177\32\113\1\147\1\200\1\201\1\164\3\0\1\32"+
    "\1\0\1\200\32\0\1\165\1\0\1\165\4\115\1\202"+
    "\32\115\1\203\1\200\1\150\1\167\2\0\1\204\1\32"+
    "\33\0\1\51\1\170\1\53\1\170\10\0\1\170\27\0"+
    "\1\171\1\0\1\171\1\0\2\172\5\0\1\170\10\0"+
    "\6\172\1\0\5\172\1\0\1\172\1\0\1\205\1\0"+
    "\1\205\4\0\1\131\2\0\1\56\11\0\1\61\2\0"+
    "\1\62\1\63\1\0\1\64\10\0\1\173\1\0\1\173"+
    "\10\0\1\35\5\0\1\35\1\36\1\37\17\0\1\174"+
    "\1\0\1\174\1\65\1\206\17\65\6\206\1\65\5\206"+
    "\1\65\1\206\1\107\1\131\1\65\1\175\1\66\1\207"+
    "\17\66\6\207\1\66\5\207\1\66\1\207\1\66\1\131"+
    "\1\110\1\176\1\113\1\210\17\113\6\210\1\113\5\210"+
    "\1\113\1\210\1\147\1\211\1\113\1\177\4\0\1\211"+
    "\32\0\1\51\1\200\1\53\1\200\37\201\1\212\1\0"+
    "\1\213\1\201\1\115\1\214\17\115\6\214\1\115\5\214"+
    "\1\115\1\214\1\115\1\211\1\150\1\202\37\203\1\215"+
    "\1\0\1\216\1\203\2\0\1\204\1\32\1\0\1\217"+
    "\32\0\1\124\1\0\1\124\10\0\1\170\27\0\1\205"+
    "\1\0\1\205\1\65\2\206\5\65\1\220\5\65\1\220"+
    "\1\221\1\222\6\206\1\65\5\206\1\65\1\206\1\107"+
    "\1\174\1\65\1\223\1\66\2\207\5\66\1\224\5\66"+
    "\1\224\1\225\1\226\6\207\1\66\5\207\1\66\1\207"+
    "\1\66\1\174\1\110\1\227\1\113\2\210\1\163\15\113"+
    "\6\210\1\113\5\210\1\113\1\210\1\147\1\124\1\113"+
    "\1\230\1\0\1\231\17\0\6\231\1\0\5\231\1\0"+
    "\1\231\1\0\1\211\1\0\1\211\3\201\1\232\1\201"+
    "\1\233\31\201\1\212\1\165\1\213\1\212\3\201\1\232"+
    "\33\201\1\212\1\124\2\213\1\115\2\214\1\166\15\115"+
    "\6\214\1\115\5\214\1\115\1\214\1\115\1\124\1\150"+
    "\1\234\3\203\1\235\33\203\1\215\1\124\1\216\1\215"+
    "\3\203\1\235\1\203\1\236\31\203\1\215\1\165\2\216"+
    "\2\0\1\237\40\0\10\65\1\222\26\65\1\107\1\0"+
    "\4\65\1\240\1\65\1\241\2\65\1\132\1\242\7\65"+
    "\1\243\1\133\2\65\1\134\1\135\1\65\1\136\7\65"+
    "\1\107\1\60\1\244\1\243\2\65\1\240\1\65\1\241"+
    "\2\65\1\132\1\243\10\65\1\133\2\65\1\134\1\135"+
    "\1\65\1\136\7\65\1\107\1\60\1\244\1\243\10\65"+
    "\1\220\5\65\1\220\1\221\1\222\16\65\1\107\1\174"+
    "\1\65\1\223\10\66\1\226\27\66\1\0\1\110\3\66"+
    "\1\245\1\66\1\246\2\66\1\137\1\247\7\66\1\250"+
    "\1\140\2\66\1\141\1\142\1\66\1\143\7\66\1\244"+
    "\1\60\1\110\1\250\2\66\1\245\1\66\1\246\2\66"+
    "\1\137\1\250\10\66\1\140\2\66\1\141\1\142\1\66"+
    "\1\143\7\66\1\244\1\60\1\110\1\250\10\66\1\224"+
    "\5\66\1\224\1\225\1\226\17\66\1\174\1\110\1\227"+
    "\3\113\1\163\33\113\1\147\1\124\1\113\1\230\1\0"+
    "\2\231\1\32\15\0\6\231\1\0\5\231\1\0\1\231"+
    "\1\0\1\124\1\0\1\124\4\201\1\251\32\201\1\212"+
    "\1\200\1\213\1\233\3\115\1\166\34\115\1\124\1\150"+
    "\1\234\4\203\1\252\32\203\1\215\1\200\1\216\1\236"+
    "\2\0\1\237\1\32\34\0\1\124\1\0\1\124\2\65"+
    "\1\240\2\65\1\253\1\65\1\132\11\65\1\133\2\65"+
    "\1\134\1\135\1\65\1\136\7\65\1\107\1\103\1\65"+
    "\1\107\1\65\1\254\17\65\6\254\1\65\5\254\1\65"+
    "\1\254\1\107\1\55\1\65\1\241\2\65\1\240\1\65"+
    "\1\241\2\65\1\132\10\65\1\243\1\133\2\65\1\134"+
    "\1\135\1\65\1\136\7\65\1\107\1\60\1\244\1\243"+
    "\2\65\1\240\1\65\1\241\2\65\1\132\11\65\1\133"+
    "\2\65\1\134\1\135\1\65\1\136\7\65\1\107\1\60"+
    "\1\244\1\243\37\244\1\255\1\0\1\255\1\244\2\66"+
    "\1\245\2\66\1\256\1\66\1\137\11\66\1\140\2\66"+
    "\1\141\1\142\1\66\1\143\10\66\1\103\2\110\1\66"+
    "\1\257\17\66\6\257\1\66\5\257\1\66\1\257\1\66"+
    "\1\55\1\110\1\246\2\66\1\245\1\66\1\246\2\66"+
    "\1\137\10\66\1\250\1\140\2\66\1\141\1\142\1\66"+
    "\1\143\7\66\1\244\1\60\1\110\1\250\2\66\1\245"+
    "\1\66\1\246\2\66\1\137\11\66\1\140\2\66\1\141"+
    "\1\142\1\66\1\143\7\66\1\244\1\60\1\110\1\250"+
    "\1\201\1\260\17\201\6\260\1\201\5\260\1\201\1\260"+
    "\1\212\1\211\1\213\1\251\1\203\1\261\17\203\6\261"+
    "\1\203\5\261\1\203\1\261\1\215\1\211\1\216\1\252"+
    "\2\65\1\262\34\65\1\107\1\0\3\65\2\254\4\65"+
    "\1\132\11\65\1\263\3\254\1\264\1\254\1\136\5\254"+
    "\1\65\1\254\1\107\1\103\1\65\1\107\7\244\1\265"+
    "\11\244\1\266\2\244\1\267\1\270\1\244\1\271\7\244"+
    "\1\255\1\103\2\255\2\66\1\272\35\66\1\0\1\110"+
    "\2\66\2\257\4\66\1\137\11\66\1\273\3\257\1\274"+
    "\1\257\1\143\5\257\1\66\1\257\1\66\1\103\2\110"+
    "\1\201\2\260\1\232\15\201\6\260\1\201\5\260\1\201"+
    "\1\260\1\212\1\124\2\213\1\203\2\261\1\235\15\203"+
    "\6\261\1\203\5\261\1\203\1\261\1\215\1\124\1\216"+
    "\1\215\2\65\1\262\4\65\1\132\11\65\1\133\2\65"+
    "\1\134\1\135\1\65\1\136\7\65\1\107\1\103\1\65"+
    "\1\107\1\65\2\254\4\65\1\132\11\65\1\263\1\275"+
    "\2\254\1\264\1\254\1\136\5\254\1\65\1\254\1\107"+
    "\1\103\1\65\1\107\1\65\2\254\4\65\1\132\11\65"+
    "\1\263\3\254\1\264\1\276\1\136\5\254\1\65\1\254"+
    "\1\107\1\103\1\65\1\107\7\244\1\277\27\244\1\255"+
    "\1\0\1\255\23\244\1\300\14\244\1\255\1\0\1\255"+
    "\26\244\1\270\11\244\1\255\1\0\1\255\27\244\1\277"+
    "\10\244\1\255\1\0\1\255\30\244\1\277\7\244\1\255"+
    "\1\0\1\255\1\244\2\66\1\272\4\66\1\137\11\66"+
    "\1\140\2\66\1\141\1\142\1\66\1\143\10\66\1\103"+
    "\2\110\1\66\2\257\4\66\1\137\11\66\1\273\1\301"+
    "\2\257\1\274\1\257\1\143\5\257\1\66\1\257\1\66"+
    "\1\103\2\110\1\66\2\257\4\66\1\137\11\66\1\273"+
    "\3\257\1\274\1\302\1\143\5\257\1\66\1\257\1\66"+
    "\1\103\2\110\1\65\2\254\4\65\1\132\11\65\1\263"+
    "\1\254\1\276\1\254\1\264\1\254\1\136\5\254\1\65"+
    "\1\254\1\107\1\103\1\65\1\107\1\65\2\254\1\65"+
    "\1\175\2\65\1\132\11\65\1\263\3\254\1\264\1\254"+
    "\1\136\5\254\1\65\1\254\1\107\1\173\1\65\1\303"+
    "\4\244\1\304\32\244\1\255\1\105\1\255\1\277\23\244"+
    "\1\277\13\244\1\255\1\0\1\255\1\244\1\66\2\257"+
    "\4\66\1\137\11\66\1\273\1\257\1\302\1\257\1\274"+
    "\1\257\1\143\5\257\1\66\1\257\1\66\1\103\2\110"+
    "\1\66\2\257\1\66\1\176\2\66\1\137\11\66\1\273"+
    "\3\257\1\274\1\257\1\143\5\257\1\66\1\257\1\66"+
    "\1\173\1\110\1\305\4\65\1\175\2\65\1\132\11\65"+
    "\1\133\2\65\1\134\1\135\1\65\1\136\7\65\1\107"+
    "\1\173\1\65\1\303\1\244\1\306\17\244\6\306\1\244"+
    "\5\306\1\244\1\306\1\255\1\131\1\255\1\304\4\66"+
    "\1\176\2\66\1\137\11\66\1\140\2\66\1\141\1\142"+
    "\1\66\1\143\10\66\1\173\1\110\1\305\1\244\2\306"+
    "\5\244\1\307\5\244\1\307\1\310\1\311\6\306\1\244"+
    "\5\306\1\244\1\306\1\255\1\174\1\255\1\312\10\244"+
    "\1\311\26\244\1\255\1\0\1\255\3\244\1\313\1\244"+
    "\1\314\2\244\1\265\1\315\7\244\1\316\1\266\2\244"+
    "\1\267\1\270\1\244\1\271\7\244\1\255\1\60\1\255"+
    "\1\316\2\244\1\313\1\244\1\314\2\244\1\265\1\316"+
    "\10\244\1\266\2\244\1\267\1\270\1\244\1\271\7\244"+
    "\1\255\1\60\1\255\1\316\10\244\1\307\5\244\1\307"+
    "\1\310\1\311\16\244\1\255\1\174\1\255\1\312\2\244"+
    "\1\313\2\244\1\317\1\244\1\265\11\244\1\266\2\244"+
    "\1\267\1\270\1\244\1\271\7\244\1\255\1\103\2\255"+
    "\1\244\1\320\17\244\6\320\1\244\5\320\1\244\1\320"+
    "\1\255\1\55\1\255\1\314\2\244\1\313\1\244\1\314"+
    "\2\244\1\265\10\244\1\316\1\266\2\244\1\267\1\270"+
    "\1\244\1\271\7\244\1\255\1\60\1\255\1\316\2\244"+
    "\1\313\1\244\1\314\2\244\1\265\11\244\1\266\2\244"+
    "\1\267\1\270\1\244\1\271\7\244\1\255\1\60\1\255"+
    "\1\316\2\244\1\321\34\244\1\255\1\0\1\255\2\244"+
    "\2\320\4\244\1\265\11\244\1\322\3\320\1\323\1\320"+
    "\1\271\5\320\1\244\1\320\1\255\1\103\2\255\2\244"+
    "\1\321\4\244\1\265\11\244\1\266\2\244\1\267\1\270"+
    "\1\244\1\271\7\244\1\255\1\103\2\255\1\244\2\320"+
    "\4\244\1\265\11\244\1\322\1\324\2\320\1\323\1\320"+
    "\1\271\5\320\1\244\1\320\1\255\1\103\2\255\1\244"+
    "\2\320\4\244\1\265\11\244\1\322\3\320\1\323\1\325"+
    "\1\271\5\320\1\244\1\320\1\255\1\103\2\255\1\244"+
    "\2\320\4\244\1\265\11\244\1\322\1\320\1\325\1\320"+
    "\1\323\1\320\1\271\5\320\1\244\1\320\1\255\1\103"+
    "\2\255\1\244\2\320\1\244\1\304\2\244\1\265\11\244"+
    "\1\322\3\320\1\323\1\320\1\271\5\320\1\244\1\320"+
    "\1\255\1\173\1\255\1\326\4\244\1\304\2\244\1\265"+
    "\11\244\1\266\2\244\1\267\1\270\1\244\1\271\7\244"+
    "\1\255\1\173\1\255\1\326";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6895];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\2\1\4\11\7\1\1\0"+
    "\1\11\3\0\2\1\1\0\1\11\3\0\4\1\1\0"+
    "\2\1\7\0\1\1\2\0\2\1\6\0\1\1\1\0"+
    "\2\1\10\0\2\1\2\0\2\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\4\0\1\1\1\0\4\1\15\0"+
    "\1\1\2\0\4\1\5\0\2\1\2\0\1\1\2\0"+
    "\1\1\1\0\1\1\25\0\2\1\2\0\2\1\3\0"+
    "\1\1\2\0\1\1\2\0\1\1\1\0\2\1\1\0"+
    "\1\1\1\0\2\1\3\0\2\1\1\0\1\1\2\0"+
    "\3\1\5\0\5\1\2\0\3\1\1\0\1\1\2\0"+
    "\2\1\1\0\1\1\1\0\2\1\1\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[214];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 146) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 7: 
          { return RESTA;
          }
        case 14: break;
        case 1: 
          { return ERROR;
          }
        case 15: break;
        case 2: 
          { return IDENTIFICADOR;
          }
        case 16: break;
        case 3: 
          { return PUNTOYCOMA;
          }
        case 17: break;
        case 8: 
          { return DIV;
          }
        case 18: break;
        case 6: 
          { return MULT;
          }
        case 19: break;
        case 11: 
          { return EQUALS;
          }
        case 20: break;
        case 13: 
          { return CORRECTO;
          }
        case 21: break;
        case 5: 
          { return SUMA;
          }
        case 22: break;
        case 9: 
          { /*Ignore*/
          }
        case 23: break;
        case 4: 
          { return ASSIGN;
          }
        case 24: break;
        case 10: 
          { return PRUEBA;
          }
        case 25: break;
        case 12: 
          { return VARIABLE;
          }
        case 26: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}