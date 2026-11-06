package com.amazon.coral.util;

import java.util.HashSet;
import java.util.Set;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class JsonUtils {
    public static CharSequence escapeJson(CharSequence charSequence) {
        String str;
        if (charSequence == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i2);
            if (charAt <= 31) {
                switch (charAt) {
                    case 0:
                        str = "\\u0000";
                        break;
                    case 1:
                        str = "\\u0001";
                        break;
                    case 2:
                        str = "\\u0002";
                        break;
                    case 3:
                        str = "\\u0003";
                        break;
                    case 4:
                        str = "\\u0004";
                        break;
                    case 5:
                        str = "\\u0005";
                        break;
                    case 6:
                        str = "\\u0006";
                        break;
                    case 7:
                        str = "\\u0007";
                        break;
                    case '\b':
                        str = "\\b";
                        break;
                    case '\t':
                        str = "\\t";
                        break;
                    case '\n':
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\u000B";
                        break;
                    case '\f':
                        str = "\\f";
                        break;
                    case '\r':
                        str = "\\r";
                        break;
                    case 14:
                        str = "\\u000E";
                        break;
                    case 15:
                        str = "\\u000F";
                        break;
                    case 16:
                        str = "\\u0010";
                        break;
                    case 17:
                        str = "\\u0011";
                        break;
                    case 18:
                        str = "\\u0012";
                        break;
                    case 19:
                        str = "\\u0013";
                        break;
                    case 20:
                        str = "\\u0014";
                        break;
                    case 21:
                        str = "\\u0015";
                        break;
                    case 22:
                        str = "\\u0016";
                        break;
                    case 23:
                        str = "\\u0017";
                        break;
                    case 24:
                        str = "\\u0018";
                        break;
                    case 25:
                        str = "\\u0019";
                        break;
                    case 26:
                        str = "\\u001A";
                        break;
                    case 27:
                        str = "\\u001B";
                        break;
                    case 28:
                        str = "\\u001C";
                        break;
                    case 29:
                        str = "\\u001D";
                        break;
                    case 30:
                        str = "\\u001E";
                        break;
                    case 31:
                        str = "\\u001F";
                        break;
                    default:
                        str = null;
                        break;
                }
            } else if (charAt == '\"') {
                str = "\\\"";
            } else if (charAt == '/') {
                str = "/";
            } else if (charAt != '\\') {
                if (charAt == 127) {
                    str = "\\u007F";
                }
                str = null;
            } else {
                str = "\\\\";
            }
            if (str != null) {
                if (i < i2) {
                    sb.append((CharSequence) TextSequence.newInstance(charSequence, i, i2));
                }
                sb.append(str);
                i = i2 + 1;
            }
        }
        if (i <= 0) {
            return charSequence;
        }
        if (i < length) {
            sb.append((CharSequence) TextSequence.newInstance(charSequence, i, length));
        }
        return sb.toString();
    }

    public static Set<Character> getInvalidChars(CharSequence charSequence) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charAt <= 31 || charAt == '\\' || charAt == '\"' || charAt == '/' || charAt == 127) {
                hashSet.add(Character.valueOf(charAt));
            }
        }
        return hashSet;
    }
}
