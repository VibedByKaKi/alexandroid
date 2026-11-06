package com.amazon.alexa.client.alexaservice.vad.audio;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class VADAudioRecorderConfig {
    public static final VADAudioRecorderConfig NONE = builder().build();
    private final boolean aecEnabled;
    private final boolean noiseSuppressionEnabled;

    private VADAudioRecorderConfig(Builder builder) {
        this.aecEnabled = builder.aecEnabled;
        this.noiseSuppressionEnabled = builder.noiseSuppressionEnabled;
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public boolean isAecEnabled() {
        return this.aecEnabled;
    }

    public boolean isNoiseSuppressionEnabled() {
        return this.noiseSuppressionEnabled;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private boolean aecEnabled;
        private boolean noiseSuppressionEnabled;

        private Builder() {
            this.aecEnabled = false;
            this.noiseSuppressionEnabled = false;
        }

        public VADAudioRecorderConfig build() {
            return new VADAudioRecorderConfig(this, 0);
        }

        public Builder setAecEnabled(boolean z) {
            this.aecEnabled = z;
            return this;
        }

        public Builder setNoiseSuppressionEnabled(boolean z) {
            this.noiseSuppressionEnabled = z;
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public /* synthetic */ VADAudioRecorderConfig(Builder builder, int i) {
        this(builder);
    }
}
