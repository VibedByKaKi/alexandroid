package com.caverock.androidsvg;

import androidx.collection.SieveCacheKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class IntegerParser {
    private int pos;
    private long value;

    public IntegerParser(long j, int i) {
        this.value = j;
        this.pos = i;
    }

    public static IntegerParser parseHex(String str, int i, int i2) {
        long j;
        int i3;
        if (i >= i2) {
            return null;
        }
        long j2 = 0;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                if (charAt >= 'A' && charAt <= 'F') {
                    j = j2 * 16;
                    i3 = charAt - 'A';
                } else {
                    if (charAt < 'a' || charAt > 'f') {
                        break;
                    }
                    j = j2 * 16;
                    i3 = charAt - 'a';
                }
                j2 = j + i3 + 10;
            } else {
                j2 = (j2 * 16) + (charAt - '0');
            }
            if (j2 > 4294967295L) {
                return null;
            }
            i4++;
        }
        if (i4 == i) {
            return null;
        }
        return new IntegerParser(j2, i4);
    }

    public static IntegerParser parseInt(String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return null;
        }
        if (z) {
            char charAt = str.charAt(i);
            if (charAt != '+') {
                r1 = charAt == '-';
            }
            i++;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            if (r1) {
                j = (j * 10) - (charAt2 - '0');
                if (j < SieveCacheKt.NodeMetaAndPreviousMask) {
                    return null;
                }
            } else {
                j = (j * 10) + (charAt2 - '0');
                if (j > SieveCacheKt.NodeLinkMask) {
                    return null;
                }
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new IntegerParser(j, i3);
    }

    public int getEndPos() {
        return this.pos;
    }

    public int value() {
        return (int) this.value;
    }
}
