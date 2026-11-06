package com.amazon.apl.devtools.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MultiViewUtil {
    public int computeNumberOfColumns(int i) {
        if (i <= 1) {
            return 1;
        }
        return (int) Math.ceil(Math.sqrt(i));
    }

    public int computeNumberOfRows(int i, int i2) {
        if (i <= 1 || i2 <= 0) {
            return 1;
        }
        return (int) Math.ceil(i / i2);
    }
}
