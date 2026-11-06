package com.amazon.blueshift.bluefront.android.vad.config;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class VADConfig {
    public static final int DEFAULT_ENDPOINTING_THRESHOLD = 50;
    public static final int DEFAULT_STARTPOINTING_THRESHOLD = 26;
    private final int mEndpointingThreshold;
    private final int mStartpointingThreshold;
    private final int mWakewordStartOfUtteranceEndpointingThreshold;

    public VADConfig(int i, int i2) {
        this.mStartpointingThreshold = i;
        this.mEndpointingThreshold = i2;
        this.mWakewordStartOfUtteranceEndpointingThreshold = 0;
    }

    public int getEndpointingThreshold() {
        return this.mEndpointingThreshold;
    }

    public int getStartpointingThreshold() {
        return this.mStartpointingThreshold;
    }

    public int getWakewordStartOfUtteranceEndpointingThreshold() {
        return this.mWakewordStartOfUtteranceEndpointingThreshold;
    }

    public VADConfig(int i, int i2, int i3) {
        this.mStartpointingThreshold = i;
        this.mEndpointingThreshold = i2;
        this.mWakewordStartOfUtteranceEndpointingThreshold = i3;
    }
}
