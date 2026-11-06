package com.amazon.alexa.handsfree.uservoicerecognition.model;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class UtteranceMetricMetadata {
    private final Map<UVRComponent, UVRComponentMetadata> mUserVerificationMetadataMap;
    private final Map<VerificationStage, VerificationStageMetadata> mVerificationLatencyMap;

    @VisibleForTesting
    public UtteranceMetricMetadata(@NonNull Map<UVRComponent, UVRComponentMetadata> map, @NonNull Map<VerificationStage, VerificationStageMetadata> map2) {
        this.mUserVerificationMetadataMap = map;
        this.mVerificationLatencyMap = map2;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == UtteranceMetricMetadata.class) {
            UtteranceMetricMetadata utteranceMetricMetadata = (UtteranceMetricMetadata) obj;
            if (Objects.equals(this.mUserVerificationMetadataMap, utteranceMetricMetadata.mUserVerificationMetadataMap) && Objects.equals(this.mVerificationLatencyMap, utteranceMetricMetadata.mVerificationLatencyMap)) {
                return true;
            }
        }
        return false;
    }

    public Map<UVRComponent, UVRComponentMetadata> getUserVerificationMetadataMap() {
        return this.mUserVerificationMetadataMap;
    }

    public Map<VerificationStage, VerificationStageMetadata> getVerificationLatencyMap() {
        return this.mVerificationLatencyMap;
    }

    public int hashCode() {
        return Objects.hash(this.mUserVerificationMetadataMap, this.mVerificationLatencyMap);
    }

    public String toString() {
        return String.format("[userVerificationMetadata = %s, verificationLatency = %s]", this.mUserVerificationMetadataMap, this.mVerificationLatencyMap);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private Map<UVRComponent, UVRComponentMetadata> mUserVerificationMetadataMap;
        private Map<VerificationStage, VerificationStageMetadata> mVerificationLatencyMap;

        public Builder() {
            this(new HashMap(), new HashMap());
        }

        public UtteranceMetricMetadata build() {
            return new UtteranceMetricMetadata(Collections.unmodifiableMap(new HashMap(this.mUserVerificationMetadataMap)), Collections.unmodifiableMap(new HashMap(this.mVerificationLatencyMap)));
        }

        public Builder recordLatency(@NonNull VerificationStage verificationStage, long j, long j2) {
            this.mVerificationLatencyMap.put(verificationStage, new VerificationStageMetadata(j, j2));
            return this;
        }

        public Builder recordUtteranceResult(@NonNull UVRComponent uVRComponent, boolean z, int i) {
            this.mUserVerificationMetadataMap.put(uVRComponent, new UVRComponentMetadata(z, i));
            return this;
        }

        @VisibleForTesting
        public Builder(@NonNull Map<UVRComponent, UVRComponentMetadata> map, @NonNull Map<VerificationStage, VerificationStageMetadata> map2) {
            this.mUserVerificationMetadataMap = map;
            this.mVerificationLatencyMap = map2;
        }
    }
}
