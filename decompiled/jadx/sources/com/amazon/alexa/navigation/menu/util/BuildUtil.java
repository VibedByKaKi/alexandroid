package com.amazon.alexa.navigation.menu.util;

import android.os.Build;
import com.amazon.alexa.protocols.environment.EnvironmentService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class BuildUtil {
    private BuildUtil() {
    }

    public static boolean isFireOS() {
        return "Amazon".equals(Build.MANUFACTURER);
    }

    public static boolean shouldShowDevMenu(EnvironmentService environmentService) {
        return environmentService.isDebugBuild();
    }
}
