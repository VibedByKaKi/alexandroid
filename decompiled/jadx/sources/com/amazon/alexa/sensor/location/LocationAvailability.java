package com.amazon.alexa.sensor.location;

import android.os.Build;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class LocationAvailability {
    public static final int AVAILABLE = 0;

    private LocationAvailability() {
    }

    public static int codeFor(@NonNull LocationAccessState locationAccessState, int i, boolean z) {
        if (!locationAccessState.locationHardwareAvailable) {
            return 10;
        }
        if (!locationAccessState.googlePlayServicesAvailable) {
            return 12;
        }
        if (!locationAccessState.locationServicesEnabled) {
            return 11;
        }
        boolean z2 = locationAccessState.fineLocationGranted;
        if (!z2 && !locationAccessState.coarseLocationGranted) {
            return 20;
        }
        if (!z2) {
            return 21;
        }
        if (!requiresBackground(i) || locationAccessState.backgroundLocationGranted) {
            return (i != 2 || z || Build.VERSION.SDK_INT < 31) ? 0 : 30;
        }
        return 22;
    }

    private static boolean requiresBackground(int i) {
        return i == 1 || i == 2;
    }
}
