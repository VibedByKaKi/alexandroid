package com.amazon.alexa.wakeword.davs;

import androidx.annotation.Nullable;
import com.amazon.alexa.wakeword.davs.ArtifactPersistedData;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_ArtifactPersistedData extends ArtifactPersistedData {

    @Nullable
    private final String artifactIdentifier;
    private final long downloadTime;

    @Nullable
    private final String engineCompatibilityId;

    @Nullable
    private final String locale;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ArtifactPersistedData.Builder {
        private String artifactIdentifier;
        private long downloadTime;
        private String engineCompatibilityId;
        private String locale;
        private byte set$0;

        @Override // com.amazon.alexa.wakeword.davs.ArtifactPersistedData.Builder
        public ArtifactPersistedData build() {
            if (this.set$0 == 1) {
                return new AutoValue_ArtifactPersistedData(this.locale, this.artifactIdentifier, this.downloadTime, this.engineCompatibilityId, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: downloadTime");
            return null;
        }

        @Override // com.amazon.alexa.wakeword.davs.ArtifactPersistedData.Builder
        public ArtifactPersistedData.Builder setArtifactIdentifier(@Nullable String str) {
            this.artifactIdentifier = str;
            return this;
        }

        @Override // com.amazon.alexa.wakeword.davs.ArtifactPersistedData.Builder
        public ArtifactPersistedData.Builder setDownloadTime(long j) {
            this.downloadTime = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.amazon.alexa.wakeword.davs.ArtifactPersistedData.Builder
        public ArtifactPersistedData.Builder setEngineCompatibilityId(@Nullable String str) {
            this.engineCompatibilityId = str;
            return this;
        }

        @Override // com.amazon.alexa.wakeword.davs.ArtifactPersistedData.Builder
        public ArtifactPersistedData.Builder setLocale(@Nullable String str) {
            this.locale = str;
            return this;
        }
    }

    private AutoValue_ArtifactPersistedData(@Nullable String str, @Nullable String str2, long j, @Nullable String str3) {
        this.locale = str;
        this.artifactIdentifier = str2;
        this.downloadTime = j;
        this.engineCompatibilityId = str3;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ArtifactPersistedData) {
            ArtifactPersistedData artifactPersistedData = (ArtifactPersistedData) obj;
            String str2 = this.locale;
            if (str2 != null ? str2.equals(artifactPersistedData.getLocale()) : artifactPersistedData.getLocale() == null) {
                String str3 = this.artifactIdentifier;
                if (str3 != null ? str3.equals(artifactPersistedData.getArtifactIdentifier()) : artifactPersistedData.getArtifactIdentifier() == null) {
                    if (this.downloadTime == artifactPersistedData.getDownloadTime() && ((str = this.engineCompatibilityId) != null ? str.equals(artifactPersistedData.getEngineCompatibilityId()) : artifactPersistedData.getEngineCompatibilityId() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactPersistedData
    @Nullable
    public String getArtifactIdentifier() {
        return this.artifactIdentifier;
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactPersistedData
    public long getDownloadTime() {
        return this.downloadTime;
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactPersistedData
    @Nullable
    public String getEngineCompatibilityId() {
        return this.engineCompatibilityId;
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactPersistedData
    @Nullable
    public String getLocale() {
        return this.locale;
    }

    public int hashCode() {
        String str = this.locale;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.artifactIdentifier;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        long j = this.downloadTime;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str3 = this.engineCompatibilityId;
        return i ^ (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ArtifactPersistedData{locale=");
        sb.append(this.locale);
        sb.append(", artifactIdentifier=");
        sb.append(this.artifactIdentifier);
        sb.append(", downloadTime=");
        sb.append(this.downloadTime);
        sb.append(", engineCompatibilityId=");
        return a$$ExternalSyntheticOutline0.m(sb, this.engineCompatibilityId, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_ArtifactPersistedData(String str, String str2, long j, String str3, int i) {
        this(str, str2, j, str3);
    }
}
