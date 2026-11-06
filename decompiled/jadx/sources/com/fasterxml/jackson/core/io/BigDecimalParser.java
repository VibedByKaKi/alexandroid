package com.fasterxml.jackson.core.io;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.JavaBigDecimalParser;
import defpackage.a$$ExternalSyntheticOutline0;
import java.math.BigDecimal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class BigDecimalParser {
    static final int MAX_CHARS_TO_REPORT = 1000;
    private static final int SIZE_FOR_SWITCH_TO_FASTDOUBLEPARSER = 500;

    private BigDecimalParser() {
    }

    private static String _generateExceptionMessage(String str, String str2) {
        return a$$ExternalSyntheticOutline0.m("Value ", str, " can not be deserialized as `java.math.BigDecimal`, reason:  ", str2);
    }

    private static String _getValueDesc(char[] cArr, int i, int i2) {
        return i2 <= 1000 ? a$$ExternalSyntheticOutline0.m(DeviceConfigConstants.DOUBLE_QUOTE, new String(cArr, i, i2), DeviceConfigConstants.DOUBLE_QUOTE) : String.format("\"%s\" (truncated to %d chars (from %d))", new String(cArr, i, 1000), 1000, Integer.valueOf(i2));
    }

    private static NumberFormatException _parseFailure(Exception exc, String str) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        return new NumberFormatException(_generateExceptionMessage(_getValueDesc(str), message));
    }

    public static BigDecimal parse(String str) {
        try {
            return str.length() < 500 ? new BigDecimal(str) : JavaBigDecimalParser.parseBigDecimal(str);
        } catch (ArithmeticException | NumberFormatException e) {
            throw _parseFailure(e, str);
        }
    }

    public static BigDecimal parseWithFastParser(String str) {
        try {
            return JavaBigDecimalParser.parseBigDecimal(str);
        } catch (ArithmeticException | NumberFormatException e) {
            throw _parseFailure(e, str);
        }
    }

    public static BigDecimal parseWithFastParser(char[] cArr, int i, int i2) {
        try {
            return JavaBigDecimalParser.parseBigDecimal(cArr, i, i2);
        } catch (ArithmeticException | NumberFormatException e) {
            throw _parseFailure(e, cArr, i, i2);
        }
    }

    private static NumberFormatException _parseFailure(Exception exc, char[] cArr, int i, int i2) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        return new NumberFormatException(_generateExceptionMessage(_getValueDesc(cArr, i, i2), message));
    }

    public static BigDecimal parse(char[] cArr, int i, int i2) {
        try {
            if (i2 < 500) {
                return new BigDecimal(cArr, i, i2);
            }
            return JavaBigDecimalParser.parseBigDecimal(cArr, i, i2);
        } catch (ArithmeticException | NumberFormatException e) {
            throw _parseFailure(e, cArr, i, i2);
        }
    }

    public static BigDecimal parse(char[] cArr) {
        return parse(cArr, 0, cArr.length);
    }

    private static String _getValueDesc(String str) {
        int length = str.length();
        if (length <= 1000) {
            return a$$ExternalSyntheticOutline0.m(DeviceConfigConstants.DOUBLE_QUOTE, str, DeviceConfigConstants.DOUBLE_QUOTE);
        }
        return String.format("\"%s\" (truncated to %d chars (from %d))", str.substring(0, 1000), 1000, Integer.valueOf(length));
    }
}
