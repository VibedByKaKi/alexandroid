package com.google.auto.value.processor;

import autovalue.shaded.com.google.common.base.CharMatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class Reformatter {
    private static final CharMatcher OPERATORS = CharMatcher.anyOf("+-*%&|^<>=?:.").precomputed();

    private Reformatter() {
    }

    public static String fixup(String str) {
        StringBuilder sb = new StringBuilder();
        JavaScanner javaScanner = new JavaScanner(str);
        String string = javaScanner.string();
        int length = string.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            int i5 = javaScanner.tokenEnd(i);
            char charAt = string.charAt(i);
            if (charAt != '\n') {
                if (charAt != ' ') {
                    if (charAt == '{') {
                        i3++;
                    } else if (charAt == '}') {
                        i3--;
                    } else if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')') {
                        i2--;
                    }
                    sb.append((CharSequence) string, i, i5);
                } else if (i > 0 && string.charAt(i4) != '(' && "\n.,;)".indexOf(string.charAt(i5)) < 0) {
                    sb.append(' ');
                }
            } else if (i5 < length && string.charAt(i5) != '\n') {
                char charAt2 = string.charAt(i4);
                char charAt3 = string.charAt(i5);
                if (sb.length() > 0 && (charAt2 != '(' || charAt3 != ')')) {
                    sb.append('\n');
                    int i6 = i3 * 2;
                    if (i2 > 0 || OPERATORS.matches(charAt3)) {
                        i6 += 4;
                    } else if (charAt3 == '}') {
                        i6 -= 2;
                    }
                    for (int i7 = 0; i7 < i6; i7++) {
                        sb.append(' ');
                    }
                }
            } else if (i2 == 0 && i3 < 2 && string.charAt(i4) != '\n' && sb.length() > 0) {
                sb.append('\n');
            }
            i4 = i;
            i = i5;
        }
        return sb.toString();
    }
}
