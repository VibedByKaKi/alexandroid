package com.amazon.alexa.voice.utils;

import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.voice.ui.onedesign.util.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LogLevelHelper {
    private LogLevelHelper() {
    }

    public static void setLogLevel(EnvironmentService environmentService) {
        if (environmentService.isDebugBuild()) {
            Logger.setLevel(Logger.Level.DEBUG);
        }
    }
}
