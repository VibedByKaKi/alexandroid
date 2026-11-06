package com.google.gson.internal;

import defpackage.a$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class NumberLimits {
    private static final int MAX_NUMBER_STRING_LENGTH = 10000;

    private NumberLimits() {
    }

    private static void checkNumberStringLength(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        checkNumberStringLength(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        XML$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Number has unsupported scale: ", str));
        return null;
    }

    public static BigInteger parseBigInteger(String str) throws NumberFormatException {
        checkNumberStringLength(str);
        return new BigInteger(str);
    }
}
