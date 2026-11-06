package org.apache.commons.lang3;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CharUtils {
    public static final char CR = '\r';
    public static final char LF = '\n';
    public static final char NUL = 0;
    private static final String[] CHAR_STRING_ARRAY = (String[]) ArrayUtils.setAll(new String[128], new CharUtils$$ExternalSyntheticLambda0());
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @Deprecated
    public CharUtils() {
    }

    public static int compare(char c, char c2) {
        return c - c2;
    }

    public static boolean isAscii(char c) {
        return c < 128;
    }

    public static boolean isAsciiAlpha(char c) {
        return isAsciiAlphaUpper(c) || isAsciiAlphaLower(c);
    }

    public static boolean isAsciiAlphaLower(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isAsciiAlphaUpper(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean isAsciiAlphanumeric(char c) {
        return isAsciiAlpha(c) || isAsciiNumeric(c);
    }

    public static boolean isAsciiControl(char c) {
        return c < ' ' || c == 127;
    }

    public static boolean isAsciiNumeric(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isAsciiPrintable(char c) {
        return c >= ' ' && c < 127;
    }

    public static boolean isHex(char c) {
        if (isAsciiNumeric(c)) {
            return true;
        }
        if (c < 'a' || c > 'f') {
            return c >= 'A' && c <= 'F';
        }
        return true;
    }

    public static boolean isOctal(char c) {
        return c >= '0' && c <= '7';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$static$0(int i) {
        return String.valueOf((char) i);
    }

    public static char toChar(String str) {
        Validate.notEmpty(str, "The String must not be empty", new Object[0]);
        return str.charAt(0);
    }

    public static Character toCharacterObject(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static int toIntValue(char c) {
        if (isAsciiNumeric(c)) {
            return c - '0';
        }
        Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(c, "The character ", " is not in the range '0' - '9'"));
        return 0;
    }

    public static String toString(char c) {
        String[] strArr = CHAR_STRING_ARRAY;
        return c < strArr.length ? strArr[c] : String.valueOf(c);
    }

    public static String unicodeEscaped(char c) {
        StringBuilder sb = new StringBuilder("\\u");
        char[] cArr = HEX_DIGITS;
        sb.append(cArr[(c >> '\f') & 15]);
        sb.append(cArr[(c >> '\b') & 15]);
        sb.append(cArr[(c >> 4) & 15]);
        sb.append(cArr[c & 15]);
        return sb.toString();
    }

    public static char toChar(Character ch, char c) {
        return ch != null ? ch.charValue() : c;
    }

    public static String toString(Character ch) {
        if (ch != null) {
            return toString(ch.charValue());
        }
        return null;
    }

    public static char toChar(Character ch) {
        Objects.requireNonNull(ch, "ch");
        return ch.charValue();
    }

    public static char toChar(String str, char c) {
        return StringUtils.isEmpty(str) ? c : str.charAt(0);
    }

    @Deprecated
    public static Character toCharacterObject(char c) {
        return Character.valueOf(c);
    }

    public static int toIntValue(char c, int i) {
        return isAsciiNumeric(c) ? c - '0' : i;
    }

    public static int toIntValue(Character ch) {
        return toIntValue(toChar(ch));
    }

    public static int toIntValue(Character ch, int i) {
        return ch != null ? toIntValue(ch.charValue(), i) : i;
    }

    public static String unicodeEscaped(Character ch) {
        if (ch != null) {
            return unicodeEscaped(ch.charValue());
        }
        return null;
    }
}
