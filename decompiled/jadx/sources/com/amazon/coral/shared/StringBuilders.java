package com.amazon.coral.shared;

import java.time.temporal.Temporal;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class StringBuilders {
    private static final Class<?> timeClass;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("java.sql.Time");
        } catch (Exception unused) {
            cls = null;
        }
        timeClass = cls;
    }

    private StringBuilders() {
    }

    public static StringBuilder appendDqValue(StringBuilder sb, Object obj) {
        sb.append('\"');
        sb.append(obj);
        sb.append('\"');
        return sb;
    }

    public static StringBuilder appendKeyDqValue(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append('=');
        sb.append('\"');
        sb.append(obj);
        sb.append('\"');
        return sb;
    }

    public static boolean appendSpecificTypes(StringBuilder sb, Object obj) {
        if (obj == null || (obj instanceof String)) {
            sb.append((String) obj);
            return true;
        }
        if (obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
            return true;
        }
        if (obj instanceof Integer) {
            sb.append(((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Long) {
            sb.append(((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            sb.append(((Double) obj).doubleValue());
            return true;
        }
        if (obj instanceof Boolean) {
            sb.append(((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
            return true;
        }
        if (obj instanceof Short) {
            sb.append((int) ((Short) obj).shortValue());
            return true;
        }
        if (obj instanceof Float) {
            sb.append(((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Byte) {
            sb.append((int) ((Byte) obj).byteValue());
            return true;
        }
        if (!isTime(obj) && !(obj instanceof Temporal)) {
            return false;
        }
        sb.append(obj);
        return true;
    }

    public static void appendValue(StringBuilder sb, Object obj) {
        if (appendSpecificTypes(sb, obj)) {
            return;
        }
        sb.append(obj);
    }

    public static boolean equals(CharSequence charSequence, int i, int i2, CharSequence charSequence2, int i3, int i4) {
        if (i2 != i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (charSequence.charAt(i5 + i) != charSequence2.charAt(i5 + i3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, int i, int i2, CharSequence charSequence2, int i3, int i4) {
        if (i2 != i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (Character.toLowerCase(charSequence.charAt(i5 + i)) != Character.toLowerCase(charSequence2.charAt(i5 + i3))) {
                return false;
            }
        }
        return true;
    }

    private static int escapeAndDecrement(StringBuilder sb, int i, char c) {
        int i2 = i - 1;
        sb.setCharAt(i, c);
        int i3 = i - 2;
        sb.setCharAt(i2, '\\');
        return i3;
    }

    public static void escapeJson(StringBuilder sb, int i) {
        int i2 = 0;
        while (i < sb.length()) {
            char charAt = sb.charAt(i);
            if (charAt != '\f' && charAt != '\r' && charAt != '\"' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                    case '\t':
                    case '\n':
                        break;
                    default:
                        if (Character.isISOControl(charAt)) {
                            i2 += 5;
                            break;
                        } else {
                            break;
                        }
                }
                i++;
            }
            i2++;
            i++;
        }
        sb.setLength(sb.length() + i2);
        int length = sb.length() - 1;
        for (int length2 = sb.length() - 1; length > length2; length2--) {
            char charAt2 = sb.charAt(length2);
            if (charAt2 == '\f') {
                length = escapeAndDecrement(sb, length, 'f');
            } else if (charAt2 == '\r') {
                length = escapeAndDecrement(sb, length, 'r');
            } else if (charAt2 != '\"' && charAt2 != '\\') {
                switch (charAt2) {
                    case '\b':
                        length = escapeAndDecrement(sb, length, 'b');
                        break;
                    case '\t':
                        length = escapeAndDecrement(sb, length, 't');
                        break;
                    case '\n':
                        length = escapeAndDecrement(sb, length, 'n');
                        break;
                    default:
                        if (Character.isISOControl(charAt2)) {
                            sb.setCharAt(length, Chars.getUpperCaseHex(charAt2 & 15));
                            sb.setCharAt(length - 1, Chars.getUpperCaseHex((charAt2 & 240) >> 4));
                            sb.setCharAt(length - 2, '0');
                            sb.setCharAt(length - 3, '0');
                            int i3 = length - 5;
                            sb.setCharAt(length - 4, AbstractJsonLexerKt.UNICODE_ESC);
                            length -= 6;
                            sb.setCharAt(i3, '\\');
                            break;
                        } else {
                            sb.setCharAt(length, charAt2);
                            length--;
                            break;
                        }
                }
            } else {
                length = escapeAndDecrement(sb, length, charAt2);
            }
        }
    }

    public static void escapeXml(StringBuilder sb, int i) {
        int i2 = 0;
        while (i < sb.length()) {
            char charAt = sb.charAt(i);
            if (charAt != '\"') {
                if (charAt == '<' || charAt == '>') {
                    i2 += 3;
                } else if (charAt == '&') {
                    i2 += 4;
                } else if (charAt != '\'') {
                }
                i++;
            }
            i2 += 5;
            i++;
        }
        sb.setLength(sb.length() + i2);
        int length = sb.length() - 1;
        for (int length2 = sb.length() - 1; length > length2; length2--) {
            char charAt2 = sb.charAt(length2);
            if (charAt2 == '\"') {
                sb.setCharAt(length, ';');
                sb.setCharAt(length - 1, 't');
                sb.setCharAt(length - 2, 'o');
                sb.setCharAt(length - 3, AbstractJsonLexerKt.UNICODE_ESC);
                int i3 = length - 5;
                sb.setCharAt(length - 4, 'q');
                length -= 6;
                sb.setCharAt(i3, Typography.amp);
            } else if (charAt2 == '<') {
                sb.setCharAt(length, ';');
                sb.setCharAt(length - 1, 't');
                int i4 = length - 3;
                sb.setCharAt(length - 2, 'l');
                length -= 4;
                sb.setCharAt(i4, Typography.amp);
            } else if (charAt2 == '>') {
                sb.setCharAt(length, ';');
                sb.setCharAt(length - 1, 't');
                int i5 = length - 3;
                sb.setCharAt(length - 2, 'g');
                length -= 4;
                sb.setCharAt(i5, Typography.amp);
            } else if (charAt2 == '&') {
                sb.setCharAt(length, ';');
                sb.setCharAt(length - 1, 'p');
                sb.setCharAt(length - 2, 'm');
                int i6 = length - 4;
                sb.setCharAt(length - 3, 'a');
                length -= 5;
                sb.setCharAt(i6, Typography.amp);
            } else if (charAt2 != '\'') {
                sb.setCharAt(length, charAt2);
                length--;
            } else {
                sb.setCharAt(length, ';');
                sb.setCharAt(length - 1, 's');
                sb.setCharAt(length - 2, 'o');
                sb.setCharAt(length - 3, 'p');
                int i7 = length - 5;
                sb.setCharAt(length - 4, 'a');
                length -= 6;
                sb.setCharAt(i7, Typography.amp);
            }
        }
    }

    private static boolean isTime(Object obj) {
        Class<?> cls = timeClass;
        return cls != null && cls.isAssignableFrom(obj.getClass());
    }

    public static void trimToMaxSize(StringBuilder sb, int i) {
        if (sb == null || sb.capacity() <= i) {
            return;
        }
        sb.setLength(i);
        sb.trimToSize();
    }

    public static StringBuilder appendKeyDqValue(StringBuilder sb, Map.Entry<String, String> entry) {
        return appendKeyDqValue(sb, entry.getKey(), entry.getValue());
    }
}
