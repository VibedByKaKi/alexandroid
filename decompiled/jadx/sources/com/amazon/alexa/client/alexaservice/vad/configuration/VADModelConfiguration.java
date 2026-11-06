package com.amazon.alexa.client.alexaservice.vad.configuration;

import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VADModelConfiguration {
    private final int frameSize;
    private final String modelName;
    private final String modelPath;
    private final int sampleRate;
    private final String version;

    private VADModelConfiguration(Builder builder) {
        this.modelPath = builder.modelPath;
        this.modelName = builder.modelName;
        this.version = builder.version;
        this.sampleRate = builder.sampleRate.intValue();
        this.frameSize = builder.frameSize.intValue();
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public int getFrameSize() {
        return this.frameSize;
    }

    @NonNull
    public String getModelName() {
        return this.modelName;
    }

    @NonNull
    public String getModelPath() {
        return this.modelPath;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    @NonNull
    public String getVersion() {
        return this.version;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VADModelConfiguration{modelPath='");
        sb.append(this.modelPath);
        sb.append("', modelName='");
        sb.append(this.modelName);
        sb.append("', version='");
        sb.append(this.version);
        sb.append("', sampleRate=");
        sb.append(this.sampleRate);
        sb.append(", frameSize=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.frameSize, AbstractJsonLexerKt.END_OBJ);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private Integer frameSize;
        private String modelName;
        private String modelPath;
        private Integer sampleRate;
        private String version;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public VADModelConfiguration build() {
            if (this.modelPath == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("Model path is required");
                return null;
            }
            if (this.modelName == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("Model name is required");
                return null;
            }
            if (this.version == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("Version is required");
                return null;
            }
            if (this.sampleRate == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("Sample rate is required");
                return null;
            }
            if (this.frameSize != null) {
                return new VADModelConfiguration(this, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Frame size is required");
            return null;
        }

        public Builder setFrameSize(int i) {
            if (i > 0) {
                this.frameSize = Integer.valueOf(i);
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Frame size must be positive, got: "));
            return null;
        }

        public Builder setModelName(@NonNull String str) {
            if (str == null || str.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("Model name cannot be null or empty");
                return null;
            }
            this.modelName = str;
            return this;
        }

        public Builder setModelPath(@NonNull String str) {
            if (str == null || str.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("Model path cannot be null or empty");
                return null;
            }
            this.modelPath = str;
            return this;
        }

        public Builder setSampleRate(int i) {
            if (i > 0) {
                this.sampleRate = Integer.valueOf(i);
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Sample rate must be positive, got: "));
            return null;
        }

        public Builder setVersion(@NonNull String str) {
            if (str == null || str.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("Version cannot be null or empty");
                return null;
            }
            this.version = str;
            return this;
        }

        private Builder() {
        }
    }

    public /* synthetic */ VADModelConfiguration(Builder builder, int i) {
        this(builder);
    }
}
