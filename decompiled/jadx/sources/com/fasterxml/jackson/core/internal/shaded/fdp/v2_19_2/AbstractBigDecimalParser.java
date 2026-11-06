package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import androidx.collection.SieveCacheKt;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class AbstractBigDecimalParser extends AbstractNumberParser {
    public static final int MANY_DIGITS_THRESHOLD = 32;
    protected static final int MAX_DIGITS_WITHOUT_LEADING_ZEROS = 646456993;
    protected static final long MAX_EXPONENT_NUMBER = 2147483647L;
    static final int RECURSION_THRESHOLD = 400;

    public static void checkParsedBigDecimalBounds(boolean z, int i, int i2, int i3, long j) {
        if (z || i < i2) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
        } else if (j <= SieveCacheKt.NodeMetaAndPreviousMask || j > 2147483647L || i3 > MAX_DIGITS_WITHOUT_LEADING_ZEROS) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.VALUE_EXCEEDS_LIMITS);
        }
    }

    public static boolean hasManyDigits(int i) {
        return i >= 32;
    }
}
