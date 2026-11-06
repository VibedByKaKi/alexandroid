package com.amazon.minerva.identifiers.schemaid.attribute.parser;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class BaseAttributesParser {
    public static final int NUMBER_OF_BITS = 32;
    private static final Pattern PATTERN_ATTRIBUTE = Pattern.compile("[0-9a-f]{8}");

    public static BitSet createBitSet(String str) {
        Objects.requireNonNull(str, "hexAttributeStr can not be null.");
        if (!PATTERN_ATTRIBUTE.matcher(str).matches()) {
            Single$$ExternalSyntheticBUOutline0.m$3("hexAttributeStr should be a 8-digits hex-encoded String.");
            return null;
        }
        byte[] bArr = new byte[4];
        for (int i = 3; i >= 0; i--) {
            bArr[3 - i] = Long.valueOf(str.substring(i * 2, (i + 1) * 2), 16).byteValue();
        }
        return BitSet.valueOf(bArr);
    }

    public static BitSet createEmptyBitSet() {
        return BitSet.valueOf(new long[]{Long.valueOf("00", 16).longValue()});
    }

    public static String getAttributesHexString(BitSet bitSet) {
        byte[] copyOf = Arrays.copyOf(bitSet.toByteArray(), 4);
        StringBuilder sb = new StringBuilder();
        for (int length = copyOf.length - 1; length >= 0; length--) {
            sb.append(String.format(Locale.US, "%02x", Byte.valueOf(copyOf[length])));
        }
        return sb.toString();
    }

    public static boolean getBoolean(BitSet bitSet, int i) {
        return getInteger(bitSet, i, i) == 1;
    }

    public static int getInteger(BitSet bitSet, int i, int i2) {
        if (isIndexOutOfBounds(i, i2)) {
            XML$$ExternalSyntheticBUOutline0.m("Index should be in the range of [0, 32)");
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 <= i2 - i; i4++) {
            if (bitSet.get(i + i4)) {
                i3 += (int) Math.pow(2.0d, i4);
            }
        }
        return i3;
    }

    private static boolean isIndexOutOfBounds(int i, int i2) {
        return i < 0 || i >= 32 || i2 < 0 || i2 >= 32 || i > i2;
    }

    public static void setBitPositionsForValue(BitSet bitSet, int i, int i2, int i3) {
        if (isIndexOutOfBounds(i2, i3)) {
            XML$$ExternalSyntheticBUOutline0.m("Index should be in the range of [0, 32)");
            return;
        }
        BitSet valueOf = BitSet.valueOf(new byte[]{(byte) i});
        for (int i4 = i2; i4 <= i3; i4++) {
            bitSet.set(i4, valueOf.get(i4 - i2));
        }
    }
}
