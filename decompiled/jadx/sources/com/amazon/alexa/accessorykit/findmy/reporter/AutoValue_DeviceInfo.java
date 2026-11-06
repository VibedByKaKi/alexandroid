package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.findmy.reporter.DeviceInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_DeviceInfo extends DeviceInfo {
    private final String deviceSerialNumber;
    private final String deviceType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends DeviceInfo.Builder {
        private String deviceSerialNumber;
        private String deviceType;

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.DeviceInfo.Builder
        public DeviceInfo build() {
            String str;
            String str2 = this.deviceSerialNumber;
            if (str2 != null && (str = this.deviceType) != null) {
                return new AutoValue_DeviceInfo(str2, str, 0);
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

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.DeviceInfo.Builder
        public DeviceInfo.Builder setDeviceSerialNumber(String str) {
            if (str != null) {
                this.deviceSerialNumber = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null deviceSerialNumber");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.DeviceInfo.Builder
        public DeviceInfo.Builder setDeviceType(String str) {
            if (str != null) {
                this.deviceType = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null deviceType");
            return null;
        }
    }

    private AutoValue_DeviceInfo(String str, String str2) {
        this.deviceSerialNumber = str;
        this.deviceType = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            if (this.deviceSerialNumber.equals(deviceInfo.getDeviceSerialNumber()) && this.deviceType.equals(deviceInfo.getDeviceType())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.DeviceInfo
    @JsonProperty("deviceSerialNumber")
    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.DeviceInfo
    @JsonProperty("deviceType")
    public String getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return this.deviceType.hashCode() ^ ((this.deviceSerialNumber.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfo{deviceSerialNumber=");
        sb.append(this.deviceSerialNumber);
        sb.append(", deviceType=");
        return a$$ExternalSyntheticOutline0.m(sb, this.deviceType, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_DeviceInfo(String str, String str2, int i) {
        this(str, str2);
    }
}
