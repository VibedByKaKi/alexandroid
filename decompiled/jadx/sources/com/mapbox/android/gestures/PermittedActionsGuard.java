package com.mapbox.android.gestures;

import androidx.annotation.IntRange;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class PermittedActionsGuard {
    private static final int BITS_PER_PERMITTED_ACTION = 8;
    private static final int NO_ACTION_PERMITTED = 255;
    private static final int PERMITTED_ACTION_MASK = 255;

    private long updatePermittedActions(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        if (i2 == 0) {
            return 0L;
        }
        if (Math.abs(i - i2) > 1) {
            return 255L;
        }
        if (i > i2) {
            return 5L;
        }
        if (i < i2) {
            return 255L;
        }
        return ((i == 1 ? 1L : 6L) << 8) + 2;
    }

    public boolean isMissingActions(int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
        long updatePermittedActions = updatePermittedActions(i2, i3);
        long j = i;
        if (j == updatePermittedActions) {
            return false;
        }
        while (updatePermittedActions != 0) {
            if (j == (255 & updatePermittedActions)) {
                return false;
            }
            updatePermittedActions >>= 8;
        }
        return true;
    }
}
