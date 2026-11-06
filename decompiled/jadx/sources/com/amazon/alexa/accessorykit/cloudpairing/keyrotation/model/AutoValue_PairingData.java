package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingData;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_PairingData extends PairingData {
    private final BlePairingDataInfo current;

    @Nullable
    private final BlePairingDataInfo next;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends PairingData.Builder {
        private BlePairingDataInfo current;
        private BlePairingDataInfo next;

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingData.Builder
        public PairingData build() {
            if (this.current != null) {
                return new AutoValue_PairingData(this.current, this.next, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: current");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingData.Builder
        public PairingData.Builder setCurrent(BlePairingDataInfo blePairingDataInfo) {
            if (blePairingDataInfo != null) {
                this.current = blePairingDataInfo;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null current");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingData.Builder
        public PairingData.Builder setNext(BlePairingDataInfo blePairingDataInfo) {
            this.next = blePairingDataInfo;
            return this;
        }
    }

    private AutoValue_PairingData(BlePairingDataInfo blePairingDataInfo, @Nullable BlePairingDataInfo blePairingDataInfo2) {
        this.current = blePairingDataInfo;
        this.next = blePairingDataInfo2;
    }

    public boolean equals(Object obj) {
        BlePairingDataInfo blePairingDataInfo;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PairingData) {
            PairingData pairingData = (PairingData) obj;
            if (this.current.equals(pairingData.getCurrent()) && ((blePairingDataInfo = this.next) != null ? blePairingDataInfo.equals(pairingData.getNext()) : pairingData.getNext() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingData
    @JsonProperty("current")
    public BlePairingDataInfo getCurrent() {
        return this.current;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.PairingData
    @Nullable
    @JsonProperty("next")
    public BlePairingDataInfo getNext() {
        return this.next;
    }

    public int hashCode() {
        int hashCode = (this.current.hashCode() ^ 1000003) * 1000003;
        BlePairingDataInfo blePairingDataInfo = this.next;
        return (blePairingDataInfo == null ? 0 : blePairingDataInfo.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "PairingData{current=" + this.current + ", next=" + this.next + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_PairingData(BlePairingDataInfo blePairingDataInfo, BlePairingDataInfo blePairingDataInfo2, int i) {
        this(blePairingDataInfo, blePairingDataInfo2);
    }
}
