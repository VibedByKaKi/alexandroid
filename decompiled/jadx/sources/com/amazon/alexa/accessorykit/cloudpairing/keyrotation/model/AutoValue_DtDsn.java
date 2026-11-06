package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.DtDsn;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_DtDsn extends DtDsn {
    private final DeviceIdentifier dtDsn;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends DtDsn.Builder {
        private DeviceIdentifier dtDsn;

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.DtDsn.Builder
        public DtDsn build() {
            DeviceIdentifier deviceIdentifier = this.dtDsn;
            if (deviceIdentifier != null) {
                return new AutoValue_DtDsn(deviceIdentifier, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: dtDsn");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.DtDsn.Builder
        public DtDsn.Builder setDtDsn(DeviceIdentifier deviceIdentifier) {
            if (deviceIdentifier != null) {
                this.dtDsn = deviceIdentifier;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null dtDsn");
            return null;
        }
    }

    private AutoValue_DtDsn(DeviceIdentifier deviceIdentifier) {
        this.dtDsn = deviceIdentifier;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DtDsn) {
            return this.dtDsn.equals(((DtDsn) obj).getDtDsn());
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.DtDsn
    @JsonProperty("dtDsn")
    public DeviceIdentifier getDtDsn() {
        return this.dtDsn;
    }

    public int hashCode() {
        return this.dtDsn.hashCode() ^ 1000003;
    }

    public String toString() {
        return "DtDsn{dtDsn=" + this.dtDsn + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_DtDsn(DeviceIdentifier deviceIdentifier, int i) {
        this(deviceIdentifier);
    }
}
