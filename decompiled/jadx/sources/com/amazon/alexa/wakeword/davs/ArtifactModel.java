package com.amazon.alexa.wakeword.davs;

import androidx.annotation.Nullable;
import com.amazon.alexa.wakeword.davs.AutoValue_ArtifactModel;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class ArtifactModel {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ArtifactModel build();

        public abstract Builder setArtifactData(@Nullable byte[] bArr);

        public abstract Builder setArtifactDownloadedTime(@Nullable Long l);

        public abstract Builder setArtifactIdentifier(@Nullable String str);

        public abstract Builder setEngineCompatibilityId(@Nullable String str);

        public abstract Builder setLocale(@Nullable String str);

        public abstract Builder setWakeWords(@Nullable List<String> list);
    }

    public static Builder builder() {
        return new AutoValue_ArtifactModel.Builder();
    }

    @Nullable
    public abstract byte[] getArtifactData();

    @Nullable
    public abstract Long getArtifactDownloadedTime();

    @Nullable
    public abstract String getArtifactIdentifier();

    @Nullable
    public abstract String getEngineCompatibilityId();

    @Nullable
    public abstract String getLocale();

    @Nullable
    public abstract List<String> getWakeWords();
}
