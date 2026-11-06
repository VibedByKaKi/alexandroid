package com.amazon.alexa.wakeword.pryon;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.pryon.android.asr.PryonLite2000;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class PryonConfigProvider {

    @VisibleForTesting
    static final int DEFAULT_DETECTION_SENSITIVITY = 500;
    private static final String TAG = "PryonConfigProvider";

    private PryonConfigProvider() {
        throw new UnsupportedOperationException("don't instantiate me!");
    }

    public static PryonLite2000.Config createPryonConfig() {
        Log.i(TAG, "Getting Pryon config using A4A setting");
        PryonLite2000.Config config = new PryonLite2000.Config();
        config.useVad = false;
        config.detectThreshold = 500;
        config.lowLatency = false;
        config.fingerprintList = null;
        return config;
    }

    public static PryonLite2000.Config createPryonConfigUsingLegacySetting() {
        Log.i(TAG, "Getting Pryon config using legacy setting");
        PryonLite2000.Config config = new PryonLite2000.Config();
        config.useVad = false;
        config.detectThreshold = 500;
        config.lowLatency = true;
        config.fingerprintList = null;
        return config;
    }
}
