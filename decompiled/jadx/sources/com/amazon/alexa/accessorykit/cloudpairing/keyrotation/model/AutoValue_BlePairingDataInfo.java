package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_BlePairingDataInfo extends BlePairingDataInfo {
    private final long expiryTime;
    private final String seed;
    private final BlePairingDataState state;
    private final String symmetricKey;
    private final String version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends BlePairingDataInfo.Builder {
        private long expiryTime;
        private String seed;
        private byte set$0;
        private BlePairingDataState state;
        private String symmetricKey;
        private String version;

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo.Builder
        public BlePairingDataInfo build() {
            if (this.set$0 == 1 && this.version != null && this.state != null && this.seed != null && this.symmetricKey != null) {
                return new AutoValue_BlePairingDataInfo(this.version, this.state, this.seed, this.symmetricKey, this.expiryTime, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.version == null) {
                sb.append(" version");
            }
            if (this.state == null) {
                sb.append(" state");
            }
            if (this.seed == null) {
                sb.append(" seed");
            }
            if (this.symmetricKey == null) {
                sb.append(" symmetricKey");
            }
            if ((this.set$0 & 1) == 0) {
                sb.append(" expiryTime");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo.Builder
        public BlePairingDataInfo.Builder setExpiryTime(long j) {
            this.expiryTime = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo.Builder
        public BlePairingDataInfo.Builder setSeed(String str) {
            if (str != null) {
                this.seed = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null seed");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo.Builder
        public BlePairingDataInfo.Builder setState(BlePairingDataState blePairingDataState) {
            if (blePairingDataState != null) {
                this.state = blePairingDataState;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null state");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo.Builder
        public BlePairingDataInfo.Builder setSymmetricKey(String str) {
            if (str != null) {
                this.symmetricKey = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null symmetricKey");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo.Builder
        public BlePairingDataInfo.Builder setVersion(String str) {
            if (str != null) {
                this.version = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null version");
            return null;
        }
    }

    private AutoValue_BlePairingDataInfo(String str, BlePairingDataState blePairingDataState, String str2, String str3, long j) {
        this.version = str;
        this.state = blePairingDataState;
        this.seed = str2;
        this.symmetricKey = str3;
        this.expiryTime = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BlePairingDataInfo) {
            BlePairingDataInfo blePairingDataInfo = (BlePairingDataInfo) obj;
            if (this.version.equals(blePairingDataInfo.getVersion()) && this.state.equals(blePairingDataInfo.getState()) && this.seed.equals(blePairingDataInfo.getSeed()) && this.symmetricKey.equals(blePairingDataInfo.getSymmetricKey()) && this.expiryTime == blePairingDataInfo.getExpiryTime()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo
    @JsonProperty("expiryTime")
    public long getExpiryTime() {
        return this.expiryTime;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo
    @JsonProperty("seed")
    public String getSeed() {
        return this.seed;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo
    @JsonProperty("state")
    public BlePairingDataState getState() {
        return this.state;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo
    @JsonProperty("symmetricKey")
    public String getSymmetricKey() {
        return this.symmetricKey;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo
    @JsonProperty("version")
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = (((((((this.version.hashCode() ^ 1000003) * 1000003) ^ this.state.hashCode()) * 1000003) ^ this.seed.hashCode()) * 1000003) ^ this.symmetricKey.hashCode()) * 1000003;
        long j = this.expiryTime;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlePairingDataInfo{version=");
        sb.append(this.version);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", seed=");
        sb.append(this.seed);
        sb.append(", symmetricKey=");
        sb.append(this.symmetricKey);
        sb.append(", expiryTime=");
        return a$$ExternalSyntheticOutline0.m(this.expiryTime, StringSubstitutor.DEFAULT_VAR_END, sb);
    }

    public /* synthetic */ AutoValue_BlePairingDataInfo(String str, BlePairingDataState blePairingDataState, String str2, String str3, long j, int i) {
        this(str, blePairingDataState, str2, str3, j);
    }
}
