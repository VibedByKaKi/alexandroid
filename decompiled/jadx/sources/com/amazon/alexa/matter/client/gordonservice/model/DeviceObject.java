package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class DeviceObject {
    private final String deviceSerialNumber;
    private final String deviceType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class DeviceObjectBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String deviceSerialNumber;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String deviceType;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public DeviceObjectBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public DeviceObject build() {
            return new DeviceObject(this.deviceType, this.deviceSerialNumber);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public DeviceObjectBuilder deviceSerialNumber(String str) {
            this.deviceSerialNumber = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public DeviceObjectBuilder deviceType(String str) {
            this.deviceType = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("DeviceObject.DeviceObjectBuilder(deviceType=");
            sb.append(this.deviceType);
            sb.append(", deviceSerialNumber=");
            return a$$ExternalSyntheticOutline0.m(sb, this.deviceSerialNumber, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private DeviceObject() {
        this.deviceType = null;
        this.deviceSerialNumber = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static DeviceObjectBuilder builder() {
        return new DeviceObjectBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceObject)) {
            return false;
        }
        DeviceObject deviceObject = (DeviceObject) obj;
        String deviceType = getDeviceType();
        String deviceType2 = deviceObject.getDeviceType();
        if (deviceType != null ? !deviceType.equals(deviceType2) : deviceType2 != null) {
            return false;
        }
        String deviceSerialNumber = getDeviceSerialNumber();
        String deviceSerialNumber2 = deviceObject.getDeviceSerialNumber();
        return deviceSerialNumber != null ? deviceSerialNumber.equals(deviceSerialNumber2) : deviceSerialNumber2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getDeviceType() {
        return this.deviceType;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String deviceType = getDeviceType();
        int hashCode = deviceType == null ? 43 : deviceType.hashCode();
        String deviceSerialNumber = getDeviceSerialNumber();
        return ((hashCode + 59) * 59) + (deviceSerialNumber != null ? deviceSerialNumber.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "DeviceObject(deviceType=" + getDeviceType() + ", deviceSerialNumber=" + getDeviceSerialNumber() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public DeviceObject withDeviceSerialNumber(String str) {
        return this.deviceSerialNumber == str ? this : new DeviceObject(this.deviceType, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public DeviceObject withDeviceType(String str) {
        return this.deviceType == str ? this : new DeviceObject(str, this.deviceSerialNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public DeviceObject(String str, String str2) {
        this.deviceType = str;
        this.deviceSerialNumber = str2;
    }
}
