package com.amazon.alexa.accessory;

import com.amazon.alexa.accessory.internal.util.Logger;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface BuildStageProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum BuildStage {
        PROD,
        GAMMA,
        BETA,
        ALPHA,
        UNKNOWN;

        public static BuildStage getBuildStage(String str) {
            try {
                return str == null ? UNKNOWN : valueOf(str.toUpperCase(Locale.US));
            } catch (IllegalArgumentException e) {
                Logger.e("Unknown build stage!", e);
                return UNKNOWN;
            }
        }
    }

    BuildStage getBuildStage();
}
