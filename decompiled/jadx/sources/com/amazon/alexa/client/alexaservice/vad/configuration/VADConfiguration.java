package com.amazon.alexa.client.alexaservice.vad.configuration;

import androidx.annotation.NonNull;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VADConfiguration {
    private static final boolean DEFAULT_EXIT_INTENT_CLASSIFIER_ENABLED = true;
    private static final boolean DEFAULT_HONOR_EXPECT_SPEECH = false;
    private static final boolean DEFAULT_ONSET_WALK_BACK_ENABLED = false;
    private static final int DEFAULT_PREROLL_DURATION_MS = 512;
    private static final float DEFAULT_SPEECH_THRESHOLD = 0.5f;
    private final boolean exitIntentClassifierEnabled;
    private final boolean honorExpectSpeech;
    private final VADModelConfiguration modelConfiguration;
    private final boolean onsetWalkBackEnabled;
    private final int prerollDurationMs;
    private final float speechThreshold;

    private VADConfiguration(Builder builder) {
        this.modelConfiguration = builder.modelConfiguration;
        this.speechThreshold = builder.speechThreshold;
        this.prerollDurationMs = builder.prerollDurationMs;
        this.honorExpectSpeech = builder.honorExpectSpeech;
        this.exitIntentClassifierEnabled = builder.exitIntentClassifierEnabled;
        this.onsetWalkBackEnabled = builder.onsetWalkBackEnabled;
    }

    public static Builder builder(@NonNull VADModelConfiguration vADModelConfiguration) {
        return new Builder(vADModelConfiguration, 0);
    }

    @NonNull
    public VADModelConfiguration getModelConfiguration() {
        return this.modelConfiguration;
    }

    public int getPrerollDurationMs() {
        return this.prerollDurationMs;
    }

    public float getSpeechThreshold() {
        return this.speechThreshold;
    }

    public boolean isExitIntentClassifierEnabled() {
        return this.exitIntentClassifierEnabled;
    }

    public boolean isHonorExpectSpeechEnabled() {
        return this.honorExpectSpeech;
    }

    public boolean isOnsetWalkBackEnabled() {
        return this.onsetWalkBackEnabled;
    }

    public Builder toBuilder() {
        return new Builder(this.modelConfiguration, 0).setSpeechThreshold(this.speechThreshold).setPrerollDurationMs(this.prerollDurationMs).setHonorExpectSpeech(this.honorExpectSpeech).setExitIntentClassifierEnabled(this.exitIntentClassifierEnabled).setOnsetWalkBackEnabled(this.onsetWalkBackEnabled);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private boolean exitIntentClassifierEnabled;
        private boolean honorExpectSpeech;
        private final VADModelConfiguration modelConfiguration;
        private boolean onsetWalkBackEnabled;
        private int prerollDurationMs;
        private float speechThreshold;

        private Builder(@NonNull VADModelConfiguration vADModelConfiguration) {
            this.speechThreshold = 0.5f;
            this.prerollDurationMs = 512;
            this.honorExpectSpeech = false;
            this.exitIntentClassifierEnabled = true;
            this.onsetWalkBackEnabled = false;
            if (vADModelConfiguration != null) {
                this.modelConfiguration = vADModelConfiguration;
            } else {
                Single$$ExternalSyntheticBUOutline0.m$3("Model configuration cannot be null");
                throw null;
            }
        }

        public VADConfiguration build() {
            return new VADConfiguration(this, 0);
        }

        public Builder setExitIntentClassifierEnabled(boolean z) {
            this.exitIntentClassifierEnabled = z;
            return this;
        }

        public Builder setHonorExpectSpeech(boolean z) {
            this.honorExpectSpeech = z;
            return this;
        }

        public Builder setOnsetWalkBackEnabled(boolean z) {
            this.onsetWalkBackEnabled = z;
            return this;
        }

        public Builder setPrerollDurationMs(int i) {
            if (i >= 0) {
                this.prerollDurationMs = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Pre-roll duration must be non-negative, got: "));
            return null;
        }

        public Builder setSpeechThreshold(float f) {
            if (f < 0.0f || f > 1.0f) {
                Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("Speech threshold must be in range [0.0, 1.0], got: ", f));
                return null;
            }
            this.speechThreshold = f;
            return this;
        }

        public /* synthetic */ Builder(VADModelConfiguration vADModelConfiguration, int i) {
            this(vADModelConfiguration);
        }
    }

    public /* synthetic */ VADConfiguration(Builder builder, int i) {
        this(builder);
    }
}
