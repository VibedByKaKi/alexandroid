package org.openjdk.tools.javac.util;

import androidx.core.view.DisplayCompat$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.accessory.internal.bluetooth.GenericAccessProfile;
import okio.Utf8;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Convert {
    public static int chars2utf(char[] cArr, int i, byte[] bArr, int i2, int i3) {
        int i4 = i3 + i;
        while (i < i4) {
            char c = cArr[i];
            if (1 <= c && c <= 127) {
                bArr[i2] = (byte) c;
                i2++;
            } else if (c <= 2047) {
                int i5 = i2 + 1;
                bArr[i2] = (byte) ((c >> 6) | 192);
                i2 += 2;
                bArr[i5] = (byte) ((c & com.amazon.deecomms.common.Constants.DEFAULT_IMAGE_CHAR) | 128);
            } else {
                bArr[i2] = (byte) ((c >> '\f') | 224);
                int i6 = i2 + 2;
                bArr[i2 + 1] = (byte) (((c >> 6) & 63) | 128);
                i2 += 3;
                bArr[i6] = (byte) ((c & com.amazon.deecomms.common.Constants.DEFAULT_IMAGE_CHAR) | 128);
            }
            i++;
        }
        return i2;
    }

    public static List<Name> classCandidates(Name name) {
        List nil = List.nil();
        String name2 = name.toString();
        int i = -1;
        while (true) {
            i = name2.indexOf(46, i + 1);
            if (i <= 0) {
                return nil.reverse();
            }
            int i2 = i + 1;
            String substring = name2.substring(0, i2);
            String replace = name2.substring(i2).replace('.', '$');
            nil = nil.prepend(name.table.names.fromString(substring + replace));
        }
    }

    public static List<Name> enclosingCandidates(Name name) {
        List<Name> nil = List.nil();
        while (true) {
            int lastIndexOf = name.lastIndexOf(GenericAccessProfile.URI);
            if (lastIndexOf <= 0) {
                return nil;
            }
            name = name.subName(0, lastIndexOf);
            nil = nil.prepend(name);
        }
    }

    public static String escapeUnicode(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (str.charAt(i) > 255) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, i));
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (charAt > 255) {
                        sb.append("\\u");
                        sb.append(Character.forDigit((charAt >> '\f') % 16, 16));
                        sb.append(Character.forDigit((charAt >> '\b') % 16, 16));
                        sb.append(Character.forDigit((charAt >> 4) % 16, 16));
                        sb.append(Character.forDigit(charAt % 16, 16));
                    } else {
                        sb.append(charAt);
                    }
                    i++;
                }
                str = sb.toString();
            } else {
                i++;
            }
        }
        return str;
    }

    private static boolean isPrintableAscii(char c) {
        return c >= ' ' && c <= '~';
    }

    public static String packagePart(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? "" : str.substring(0, lastIndexOf);
    }

    public static String quote(char c) {
        if (c == '\f') {
            return "\\f";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (c == '\"') {
            return "\\\"";
        }
        if (c == '\'') {
            return "\\'";
        }
        if (c == '\\') {
            return "\\\\";
        }
        switch (c) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            default:
                return isPrintableAscii(c) ? String.valueOf(c) : String.format("\\u%04x", Integer.valueOf(c));
        }
    }

    public static Name shortName(Name name) {
        return name.subName(name.lastIndexOf((byte) 46) + 1, name.getByteLength());
    }

    public static int string2int(String str, int i) throws NumberFormatException {
        int i2;
        if (i == 10) {
            return Integer.parseInt(str, i);
        }
        int i3 = Integer.MAX_VALUE / (i / 2);
        int i4 = 0;
        for (char c : str.toCharArray()) {
            int digit = Character.digit(c, i);
            if (i4 < 0 || i4 > i3 || (i2 = i4 * i) > Integer.MAX_VALUE - digit) {
                DisplayCompat$$ExternalSyntheticBUOutline0.m7672m();
                return 0;
            }
            i4 = i2 + digit;
        }
        return i4;
    }

    public static long string2long(String str, int i) throws NumberFormatException {
        if (i == 10) {
            return Long.parseLong(str, i);
        }
        long j = Long.MAX_VALUE / (i / 2);
        long j2 = 0;
        for (char c : str.toCharArray()) {
            int digit = Character.digit(c, i);
            if (j2 >= 0 && j2 <= j) {
                long j3 = j2 * i;
                long j4 = digit;
                if (j3 <= Long.MAX_VALUE - j4) {
                    j2 = j3 + j4;
                }
            }
            DisplayCompat$$ExternalSyntheticBUOutline0.m7672m();
            return 0L;
        }
        return j2;
    }

    public static byte[] string2utf(String str) {
        return chars2utf(str.toCharArray());
    }

    public static int utf2chars(byte[] bArr, int i, char[] cArr, int i2, int i3) {
        int i4 = i3 + i;
        while (i < i4) {
            int i5 = i + 1;
            byte b = bArr[i];
            int i6 = b & 255;
            if (i6 >= 224) {
                int i7 = i + 2;
                i += 3;
                i6 = ((bArr[i5] & Utf8.REPLACEMENT_BYTE) << 6) | ((b & 15) << 12) | (bArr[i7] & Utf8.REPLACEMENT_BYTE);
            } else if (i6 >= 192) {
                i += 2;
                i6 = ((b & 31) << 6) | (bArr[i5] & Utf8.REPLACEMENT_BYTE);
            } else {
                i = i5;
            }
            cArr[i2] = (char) i6;
            i2++;
        }
        return i2;
    }

    public static String utf2string(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        return new String(cArr, 0, utf2chars(bArr, i, cArr, 0, i2));
    }

    public static String utf2string(byte[] bArr) {
        return utf2string(bArr, 0, bArr.length);
    }

    public static Name packagePart(Name name) {
        return name.subName(0, name.lastIndexOf((byte) 46));
    }

    public static String shortName(String str) {
        return str.substring(str.lastIndexOf(46) + 1);
    }

    public static char[] utf2chars(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        int utf2chars = utf2chars(bArr, i, cArr, 0, i2);
        char[] cArr2 = new char[utf2chars];
        System.arraycopy(cArr, 0, cArr2, 0, utf2chars);
        return cArr2;
    }

    public static char[] utf2chars(byte[] bArr) {
        return utf2chars(bArr, 0, bArr.length);
    }

    public static String quote(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(quote(str.charAt(i)));
        }
        return sb.toString();
    }

    public static byte[] chars2utf(char[] cArr, int i, int i2) {
        byte[] bArr = new byte[i2 * 3];
        int chars2utf = chars2utf(cArr, i, bArr, 0, i2);
        byte[] bArr2 = new byte[chars2utf];
        System.arraycopy(bArr, 0, bArr2, 0, chars2utf);
        return bArr2;
    }

    public static byte[] chars2utf(char[] cArr) {
        return chars2utf(cArr, 0, cArr.length);
    }
}
