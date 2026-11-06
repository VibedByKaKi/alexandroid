package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import java.math.BigDecimal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class JavaBigDecimalParser {
    private static final JavaBigDecimalFromByteArray BYTE_ARRAY_PARSER = new JavaBigDecimalFromByteArray();
    private static final JavaBigDecimalFromCharArray CHAR_ARRAY_PARSER = new JavaBigDecimalFromCharArray();
    private static final JavaBigDecimalFromCharSequence CHAR_SEQUENCE_PARSER = new JavaBigDecimalFromCharSequence();

    private JavaBigDecimalParser() {
    }

    public static BigDecimal parseBigDecimal(CharSequence charSequence) throws NumberFormatException {
        return parseBigDecimal(charSequence, 0, charSequence.length());
    }

    public static BigDecimal parseBigDecimal(CharSequence charSequence, int i, int i2) throws NumberFormatException {
        return CHAR_SEQUENCE_PARSER.parseBigDecimalString(charSequence, i, i2);
    }

    public static BigDecimal parseBigDecimal(byte[] bArr) throws NumberFormatException {
        return parseBigDecimal(bArr, 0, bArr.length);
    }

    public static BigDecimal parseBigDecimal(byte[] bArr, int i, int i2) throws NumberFormatException {
        return BYTE_ARRAY_PARSER.parseBigDecimalString(bArr, i, i2);
    }

    public static BigDecimal parseBigDecimal(char[] cArr) throws NumberFormatException {
        return parseBigDecimal(cArr, 0, cArr.length);
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i, int i2) throws NumberFormatException {
        return CHAR_ARRAY_PARSER.parseBigDecimalString(cArr, i, i2);
    }
}
