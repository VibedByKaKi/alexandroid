package com.amazon.blueshift.bluefront.android.vad.config;

import com.google.common.base.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DnnVADConfig extends VADConfig {
    public static final int DEFAULT_ENDPOINTING_THRESHOLD = 60;
    public static final int DEFAULT_STARTPOINTING_THRESHOLD = 15;
    private Optional<Float> mThreshold;

    public DnnVADConfig(Float f, int i, int i2) {
        super(i, i2);
        this.mThreshold = Optional.absent();
        this.mThreshold = Optional.fromNullable(f);
    }

    public Optional<Float> getThreshold() {
        return this.mThreshold;
    }

    public DnnVADConfig() {
        super(15, 60);
        this.mThreshold = Optional.absent();
    }

    public DnnVADConfig(Float f, int i, int i2, int i3) {
        super(i, i2, i3);
        this.mThreshold = Optional.absent();
        this.mThreshold = Optional.fromNullable(f);
    }
}
