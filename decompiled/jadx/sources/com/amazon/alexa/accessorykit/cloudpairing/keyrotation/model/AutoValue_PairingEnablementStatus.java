package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingEnablementStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_PairingEnablementStatus extends PairingEnablementStatus {

    @Nullable
    private final PairingData pairingData;
    private final PairingEnablementStatus.PairingStatus status;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends PairingEnablementStatus.Builder {
        private PairingData pairingData;
        private PairingEnablementStatus.PairingStatus status;

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingEnablementStatus.Builder
        public PairingEnablementStatus build() {
            if (this.status != null) {
                return new AutoValue_PairingEnablementStatus(this.status, this.pairingData, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: status");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingEnablementStatus.Builder
        public PairingEnablementStatus.Builder setPairingData(PairingData pairingData) {
            this.pairingData = pairingData;
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingEnablementStatus.Builder
        public PairingEnablementStatus.Builder setStatus(PairingEnablementStatus.PairingStatus pairingStatus) {
            if (pairingStatus != null) {
                this.status = pairingStatus;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null status");
            return null;
        }
    }

    private AutoValue_PairingEnablementStatus(PairingEnablementStatus.PairingStatus pairingStatus, @Nullable PairingData pairingData) {
        this.status = pairingStatus;
        this.pairingData = pairingData;
    }

    public boolean equals(Object obj) {
        PairingData pairingData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PairingEnablementStatus) {
            PairingEnablementStatus pairingEnablementStatus = (PairingEnablementStatus) obj;
            if (this.status.equals(pairingEnablementStatus.getStatus()) && ((pairingData = this.pairingData) != null ? pairingData.equals(pairingEnablementStatus.getPairingData()) : pairingEnablementStatus.getPairingData() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingEnablementStatus
    @Nullable
    @JsonProperty("pairingData")
    public PairingData getPairingData() {
        return this.pairingData;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingEnablementStatus
    @JsonProperty("status")
    public PairingEnablementStatus.PairingStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() ^ 1000003) * 1000003;
        PairingData pairingData = this.pairingData;
        return (pairingData == null ? 0 : pairingData.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "PairingEnablementStatus{status=" + this.status + ", pairingData=" + this.pairingData + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_PairingEnablementStatus(PairingEnablementStatus.PairingStatus pairingStatus, PairingData pairingData, int i) {
        this(pairingStatus, pairingData);
    }
}
