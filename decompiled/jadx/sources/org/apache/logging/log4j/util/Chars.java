package org.apache.logging.log4j.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalApi
/* loaded from: classes11.dex */
public final class Chars {
    public static final char CR = '\r';
    public static final char DQUOTE = '\"';
    public static final char EQ = '=';
    public static final char LF = '\n';
    public static final char NUL = 0;
    public static final char QUOTE = '\'';
    public static final char SPACE = ' ';
    public static final char TAB = '\t';

    private Chars() {
    }

    private static char getLowerCaseAlphaDigit(int i) {
        return (char) (i + 87);
    }

    public static char getLowerCaseHex(int i) {
        if (i < 0 || i >= 16) {
            return (char) 0;
        }
        return i < 10 ? getNumericalDigit(i) : getLowerCaseAlphaDigit(i);
    }

    private static char getNumericalDigit(int i) {
        return (char) (i + 48);
    }

    private static char getUpperCaseAlphaDigit(int i) {
        return (char) (i + 55);
    }

    public static char getUpperCaseHex(int i) {
        if (i < 0 || i >= 16) {
            return (char) 0;
        }
        return i < 10 ? getNumericalDigit(i) : getUpperCaseAlphaDigit(i);
    }
}
