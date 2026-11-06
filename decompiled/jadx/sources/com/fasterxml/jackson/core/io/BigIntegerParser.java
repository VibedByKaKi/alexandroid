package com.fasterxml.jackson.core.io;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.JavaBigIntegerParser;
import defpackage.a$$ExternalSyntheticOutline0;
import java.math.BigInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class BigIntegerParser {
    private BigIntegerParser() {
    }

    public static BigInteger parseWithFastParser(String str, int i) {
        try {
            return JavaBigIntegerParser.parseBigInteger(str, i);
        } catch (NumberFormatException e) {
            if (str.length() > 1000) {
                str = str.substring(0, 1000).concat(" [truncated]");
            }
            StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(i, "Value \"", str, "\" can not be represented as `java.math.BigInteger` with radix ", ", reason: ");
            m.append(e.getMessage());
            throw new NumberFormatException(m.toString());
        }
    }

    public static BigInteger parseWithFastParser(String str) {
        try {
            return JavaBigIntegerParser.parseBigInteger(str);
        } catch (NumberFormatException e) {
            if (str.length() > 1000) {
                str = str.substring(0, 1000).concat(" [truncated]");
            }
            StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Value \"", str, "\" can not be represented as `java.math.BigInteger`, reason: ");
            m2m.append(e.getMessage());
            throw new NumberFormatException(m2m.toString());
        }
    }
}
