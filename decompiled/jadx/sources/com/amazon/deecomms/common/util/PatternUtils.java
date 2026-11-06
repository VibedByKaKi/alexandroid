package com.amazon.deecomms.common.util;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class PatternUtils {
    private PatternUtils() {
    }

    public static boolean isValidDuration(@NonNull String str) {
        return str.matches("[0-9]+:[0-5][0-9]:[0-5][0-9]") || str.matches("[0-5][0-9]:[0-5][0-9]");
    }
}
