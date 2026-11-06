package com.amazon.alexa.wakeword.speakerverification.pryon;

import androidx.annotation.Nullable;
import com.amazon.pryon.android.asr.PryonLite2000;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SpeakerVerificationConfigProvider {
    private static final int DEFAULT_DETECTION_SENSITIVITY = 500;
    private static final int MAX_PROFILE_ID_SIZE = 64;
    private static final int PRYON_ENROLLMENT_DEFAULT_SNR = 0;

    private SpeakerVerificationConfigProvider() {
    }

    public static PryonLite2000.Config createPryonConfig(@Nullable byte[] bArr, @Nullable byte[] bArr2, int i, int i2) {
        PryonLite2000.Config config = new PryonLite2000.Config();
        config.useVad = false;
        config.wakewordModel = bArr;
        config.detectThreshold = 500;
        config.lowLatency = false;
        config.fingerprintList = null;
        return config;
    }

    public static PryonLite2000.Config createPryonConfig(@Nullable byte[] bArr, @Nullable byte[] bArr2, int i) {
        return createPryonConfig(bArr, bArr2, i, 0);
    }
}
