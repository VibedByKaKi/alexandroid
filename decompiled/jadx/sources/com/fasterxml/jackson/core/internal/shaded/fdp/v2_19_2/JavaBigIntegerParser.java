package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import java.math.BigInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class JavaBigIntegerParser {
    private static final JavaBigIntegerFromByteArray BYTE_ARRAY_PARSER = new JavaBigIntegerFromByteArray();
    private static final JavaBigIntegerFromCharArray CHAR_ARRAY_PARSER = new JavaBigIntegerFromCharArray();
    private static final JavaBigIntegerFromCharSequence CHAR_SEQUENCE_PARSER = new JavaBigIntegerFromCharSequence();

    private JavaBigIntegerParser() {
    }

    public static BigInteger parseBigInteger(CharSequence charSequence) {
        return CHAR_SEQUENCE_PARSER.parseBigIntegerString(charSequence, 0, charSequence.length(), 10);
    }

    public static BigInteger parseBigInteger(CharSequence charSequence, int i) {
        return CHAR_SEQUENCE_PARSER.parseBigIntegerString(charSequence, 0, charSequence.length(), i);
    }

    public static BigInteger parseBigInteger(CharSequence charSequence, int i, int i2) {
        return CHAR_SEQUENCE_PARSER.parseBigIntegerString(charSequence, i, i2, 10);
    }

    public static BigInteger parseBigInteger(CharSequence charSequence, int i, int i2, int i3) {
        return CHAR_SEQUENCE_PARSER.parseBigIntegerString(charSequence, i, i2, i3);
    }

    public static BigInteger parseBigInteger(byte[] bArr) {
        return BYTE_ARRAY_PARSER.parseBigIntegerString(bArr, 0, bArr.length, 10);
    }

    public static BigInteger parseBigInteger(byte[] bArr, int i) {
        return BYTE_ARRAY_PARSER.parseBigIntegerString(bArr, 0, bArr.length, i);
    }

    public static BigInteger parseBigInteger(byte[] bArr, int i, int i2) {
        return BYTE_ARRAY_PARSER.parseBigIntegerString(bArr, i, i2, 10);
    }

    public static BigInteger parseBigInteger(byte[] bArr, int i, int i2, int i3) {
        return BYTE_ARRAY_PARSER.parseBigIntegerString(bArr, i, i2, i3);
    }

    public static BigInteger parseBigInteger(char[] cArr) {
        return CHAR_ARRAY_PARSER.parseBigIntegerString(cArr, 0, cArr.length, 10);
    }

    public static BigInteger parseBigInteger(char[] cArr, int i) {
        return CHAR_ARRAY_PARSER.parseBigIntegerString(cArr, 0, cArr.length, i);
    }

    public static BigInteger parseBigInteger(char[] cArr, int i, int i2) {
        return CHAR_ARRAY_PARSER.parseBigIntegerString(cArr, i, i2, 10);
    }

    public static BigInteger parseBigInteger(char[] cArr, int i, int i2, int i3) {
        return CHAR_ARRAY_PARSER.parseBigIntegerString(cArr, i, i2, i3);
    }
}
