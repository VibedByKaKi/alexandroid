package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("BleEntryData")
@Documentation("BLE entry data")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class BleEntryData {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.BleEntryData");
    private String deviceId;
    private ScanData scanData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String deviceId;
        protected ScanData scanData;

        public BleEntryData build() {
            BleEntryData bleEntryData = new BleEntryData();
            populate(bleEntryData);
            return bleEntryData;
        }

        public void populate(BleEntryData bleEntryData) {
            bleEntryData.setScanData(this.scanData);
            bleEntryData.setDeviceId(this.deviceId);
        }

        public Builder withDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder withScanData(ScanData scanData) {
            this.scanData = scanData;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleEntryData)) {
            return false;
        }
        BleEntryData bleEntryData = (BleEntryData) obj;
        return Objects.equals(getScanData(), bleEntryData.getScanData()) && Objects.equals(getDeviceId(), bleEntryData.getDeviceId());
    }

    @MinLength(1)
    @Documentation("MAC address in MM:MM:MM:SS:SS:SS format or other unique ID string.")
    public String getDeviceId() {
        return this.deviceId;
    }

    @Documentation("BLE scan data.")
    public ScanData getScanData() {
        return this.scanData;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getScanData(), getDeviceId());
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setScanData(ScanData scanData) {
        this.scanData = scanData;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withScanData(getScanData());
        builder.withDeviceId(getDeviceId());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BleEntryData(scanData=");
        sb.append(String.valueOf(this.scanData));
        sb.append(", deviceId=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.deviceId, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
