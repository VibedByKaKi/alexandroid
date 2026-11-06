package com.amazon.comms.calling.service;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DynamicAcousticParams {

    @Nonnull
    private final Map<AcousticParamId, Boolean> paramsMap = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AcousticParamId {
        ACOUSTIC_ECHO_CANCELLATION(1),
        RESIDUAL_ECHO_SUPPRESSION(2),
        MIC_AUTOMATIC_GAIN_CONTROL(4),
        SPEAKER_AUTOMATIC_GAIN_CONTROL(8),
        MIC_NOISE_REDUCTION(16),
        SPEAKER_NOISE_REDUCTION(32),
        VOIP_DNN_CONTROL(64);

        private int mCode;

        AcousticParamId(int i) {
            this.mCode = i;
        }

        public int getCode() {
            return this.mCode;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConfigPath {
        WEBRTC,
        LIBASP,
        NONE
    }

    public Map<AcousticParamId, Boolean> getAllParams() {
        return ImmutableMap.copyOf((Map) this.paramsMap);
    }

    public void setParam(AcousticParamId acousticParamId, Boolean bool) {
        this.paramsMap.put(acousticParamId, bool);
    }
}
