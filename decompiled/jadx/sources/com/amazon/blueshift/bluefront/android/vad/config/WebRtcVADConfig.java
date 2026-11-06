package com.amazon.blueshift.bluefront.android.vad.config;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class WebRtcVADConfig extends VADConfig {
    public static final int DEFAULT_ENDPOINTING_THRESHOLD = 50;
    public static final int DEFAULT_STARTPOINTING_THRESHOLD = 26;
    private AggressionMode mAggressionMode;
    private Optional<Aggression> mCustomizedAggresion;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Aggression {
        private final int mGlobalThreshold;
        private final int mLocalThreshold;
        private final int mOverHangMax1;
        private final int mOverHangMax2;

        public Aggression(int i, int i2, int i3, int i4) {
            Preconditions.checkArgument(i > 0, "OverHangMax1 must be positive.");
            Preconditions.checkArgument(i2 > 0, "OverHangMax2 must be positive.");
            Preconditions.checkArgument(i3 > 0, "LocalThreshold must be positive.");
            Preconditions.checkArgument(i4 > 0, "GlobalThreshold must be positive.");
            this.mOverHangMax1 = i;
            this.mOverHangMax2 = i2;
            this.mLocalThreshold = i3;
            this.mGlobalThreshold = i4;
        }

        public int getGlobalThreshold() {
            return this.mGlobalThreshold;
        }

        public int getLocalThreshold() {
            return this.mLocalThreshold;
        }

        public int getOverHangMax1() {
            return this.mOverHangMax1;
        }

        public int getOverHangMax2() {
            return this.mOverHangMax2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AggressionMode {
        QUALITY,
        LOW_BITRATE,
        AGGRESSIVE,
        VERY_AGGRESSIVE
    }

    public WebRtcVADConfig(AggressionMode aggressionMode, int i, int i2) {
        super(i, i2);
        this.mAggressionMode = AggressionMode.VERY_AGGRESSIVE;
        this.mCustomizedAggresion = Optional.absent();
        Preconditions.checkNotNull(aggressionMode, "Aggression mode cannot be null.");
        this.mAggressionMode = aggressionMode;
    }

    public AggressionMode getAggressionMode() {
        return this.mAggressionMode;
    }

    public Optional<Aggression> getCustomizedAggression() {
        return this.mCustomizedAggresion;
    }

    public WebRtcVADConfig() {
        super(26, 50);
        this.mAggressionMode = AggressionMode.VERY_AGGRESSIVE;
        this.mCustomizedAggresion = Optional.absent();
    }

    public WebRtcVADConfig(Aggression aggression, int i, int i2) {
        super(i, i2);
        this.mAggressionMode = AggressionMode.VERY_AGGRESSIVE;
        this.mCustomizedAggresion = Optional.absent();
        this.mCustomizedAggresion = Optional.fromNullable(aggression);
    }
}
