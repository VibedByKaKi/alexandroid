package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Target {
    private final String deviceSerialNumber;
    private final String deviceType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class TargetBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String deviceSerialNumber;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String deviceType;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public TargetBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Target build() {
            return new Target(this.deviceSerialNumber, this.deviceType);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public TargetBuilder deviceSerialNumber(String str) {
            this.deviceSerialNumber = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public TargetBuilder deviceType(String str) {
            this.deviceType = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("Target.TargetBuilder(deviceSerialNumber=");
            sb.append(this.deviceSerialNumber);
            sb.append(", deviceType=");
            return a$$ExternalSyntheticOutline0.m(sb, this.deviceType, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private Target() {
        this.deviceSerialNumber = null;
        this.deviceType = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static TargetBuilder builder() {
        return new TargetBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Target)) {
            return false;
        }
        Target target = (Target) obj;
        String deviceSerialNumber = getDeviceSerialNumber();
        String deviceSerialNumber2 = target.getDeviceSerialNumber();
        if (deviceSerialNumber != null ? !deviceSerialNumber.equals(deviceSerialNumber2) : deviceSerialNumber2 != null) {
            return false;
        }
        String deviceType = getDeviceType();
        String deviceType2 = target.getDeviceType();
        return deviceType != null ? deviceType.equals(deviceType2) : deviceType2 == null;
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
        String deviceSerialNumber = getDeviceSerialNumber();
        int hashCode = deviceSerialNumber == null ? 43 : deviceSerialNumber.hashCode();
        String deviceType = getDeviceType();
        return ((hashCode + 59) * 59) + (deviceType != null ? deviceType.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Target(deviceSerialNumber=" + getDeviceSerialNumber() + ", deviceType=" + getDeviceType() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Target withDeviceSerialNumber(String str) {
        return this.deviceSerialNumber == str ? this : new Target(str, this.deviceType);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Target withDeviceType(String str) {
        return this.deviceType == str ? this : new Target(this.deviceSerialNumber, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Target(String str, String str2) {
        this.deviceSerialNumber = str;
        this.deviceType = str2;
    }
}
