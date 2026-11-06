package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.DeviceIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_DeviceIdentifier extends DeviceIdentifier {
    private final String deviceSerialNumber;
    private final String deviceType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends DeviceIdentifier.Builder {
        private String deviceSerialNumber;
        private String deviceType;

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.DeviceIdentifier.Builder
        public DeviceIdentifier build() {
            if (this.deviceSerialNumber != null && this.deviceType != null) {
                return new AutoValue_DeviceIdentifier(this.deviceSerialNumber, this.deviceType, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.deviceSerialNumber == null) {
                sb.append(" deviceSerialNumber");
            }
            if (this.deviceType == null) {
                sb.append(" deviceType");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.DeviceIdentifier.Builder
        public DeviceIdentifier.Builder setDeviceSerialNumber(String str) {
            if (str != null) {
                this.deviceSerialNumber = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null deviceSerialNumber");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.DeviceIdentifier.Builder
        public DeviceIdentifier.Builder setDeviceType(String str) {
            if (str != null) {
                this.deviceType = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null deviceType");
            return null;
        }
    }

    private AutoValue_DeviceIdentifier(String str, String str2) {
        this.deviceSerialNumber = str;
        this.deviceType = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DeviceIdentifier) {
            DeviceIdentifier deviceIdentifier = (DeviceIdentifier) obj;
            if (this.deviceSerialNumber.equals(deviceIdentifier.getDeviceSerialNumber()) && this.deviceType.equals(deviceIdentifier.getDeviceType())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.DeviceIdentifier
    @JsonProperty("deviceSerialNumber")
    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.DeviceIdentifier
    @JsonProperty("deviceType")
    public String getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return this.deviceType.hashCode() ^ ((this.deviceSerialNumber.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceIdentifier{deviceSerialNumber=");
        sb.append(this.deviceSerialNumber);
        sb.append(", deviceType=");
        return a$$ExternalSyntheticOutline0.m(sb, this.deviceType, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_DeviceIdentifier(String str, String str2, int i) {
        this(str, str2);
    }
}
