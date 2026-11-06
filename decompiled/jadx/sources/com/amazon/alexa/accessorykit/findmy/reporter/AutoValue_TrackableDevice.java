package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevice;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_TrackableDevice extends TrackableDevice {
    private final String cause;
    private final DeviceInfo deviceInfo;
    private final String estimatedProximityDistance;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends TrackableDevice.Builder {
        private String cause;
        private DeviceInfo deviceInfo;
        private String estimatedProximityDistance;

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevice.Builder
        public TrackableDevice build() {
            String str;
            String str2;
            DeviceInfo deviceInfo = this.deviceInfo;
            if (deviceInfo != null && (str = this.estimatedProximityDistance) != null && (str2 = this.cause) != null) {
                return new AutoValue_TrackableDevice(deviceInfo, str, str2, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.deviceInfo == null) {
                sb.append(" deviceInfo");
            }
            if (this.estimatedProximityDistance == null) {
                sb.append(" estimatedProximityDistance");
            }
            if (this.cause == null) {
                sb.append(" cause");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevice.Builder
        public TrackableDevice.Builder setCause(String str) {
            if (str != null) {
                this.cause = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null cause");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevice.Builder
        public TrackableDevice.Builder setDeviceInfo(DeviceInfo deviceInfo) {
            if (deviceInfo != null) {
                this.deviceInfo = deviceInfo;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null deviceInfo");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevice.Builder
        public TrackableDevice.Builder setEstimatedProximityDistance(String str) {
            if (str != null) {
                this.estimatedProximityDistance = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null estimatedProximityDistance");
            return null;
        }
    }

    private AutoValue_TrackableDevice(DeviceInfo deviceInfo, String str, String str2) {
        this.deviceInfo = deviceInfo;
        this.estimatedProximityDistance = str;
        this.cause = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TrackableDevice) {
            TrackableDevice trackableDevice = (TrackableDevice) obj;
            if (this.deviceInfo.equals(trackableDevice.getDeviceInfo()) && this.estimatedProximityDistance.equals(trackableDevice.getEstimatedProximityDistance()) && this.cause.equals(trackableDevice.getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevice
    @JsonProperty("cause")
    public String getCause() {
        return this.cause;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevice
    @JsonProperty("deviceInfo")
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevice
    @JsonProperty("estimatedProximityDistance")
    public String getEstimatedProximityDistance() {
        return this.estimatedProximityDistance;
    }

    public int hashCode() {
        return this.cause.hashCode() ^ ((((this.deviceInfo.hashCode() ^ 1000003) * 1000003) ^ this.estimatedProximityDistance.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackableDevice{deviceInfo=");
        sb.append(this.deviceInfo);
        sb.append(", estimatedProximityDistance=");
        sb.append(this.estimatedProximityDistance);
        sb.append(", cause=");
        return a$$ExternalSyntheticOutline0.m(sb, this.cause, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_TrackableDevice(DeviceInfo deviceInfo, String str, String str2, int i) {
        this(deviceInfo, str, str2);
    }
}
