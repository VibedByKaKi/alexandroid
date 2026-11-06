package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class AbstractBigIntegerParser extends AbstractNumberParser {
    private static final int MAX_DECIMAL_DIGITS = 646456993;
    private static final int MAX_HEX_DIGITS = 536870912;
    static final int RECURSION_THRESHOLD = 400;

    public static void checkDecBigIntegerBounds(int i) {
        if (i <= MAX_DECIMAL_DIGITS) {
            return;
        }
        XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.VALUE_EXCEEDS_LIMITS);
    }

    public static void checkHexBigIntegerBounds(int i) {
        if (i <= 536870912) {
            return;
        }
        XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.VALUE_EXCEEDS_LIMITS);
    }

    public static boolean hasManyDigits(int i) {
        return i > 18;
    }
}
