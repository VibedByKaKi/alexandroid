package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ScanData")
@Documentation("BLE scan data.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ScanData {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.ScanData");
    private ByteBuffer advertisementData;
    private boolean isConnectable;
    private int rssi;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected ByteBuffer advertisementData;
        protected boolean isConnectable;
        protected int rssi;

        public ScanData build() {
            ScanData scanData = new ScanData();
            populate(scanData);
            return scanData;
        }

        public void populate(ScanData scanData) {
            scanData.setAdvertisementData(this.advertisementData);
            scanData.setRssi(this.rssi);
            scanData.setIsConnectable(this.isConnectable);
        }

        public Builder withAdvertisementData(ByteBuffer byteBuffer) {
            this.advertisementData = byteBuffer;
            return this;
        }

        public Builder withIsConnectable(boolean z) {
            this.isConnectable = z;
            return this;
        }

        public Builder withRssi(int i) {
            this.rssi = i;
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
        if (!(obj instanceof ScanData)) {
            return false;
        }
        ScanData scanData = (ScanData) obj;
        return Objects.equals(getAdvertisementData(), scanData.getAdvertisementData()) && Integer.valueOf(getRssi()).equals(Integer.valueOf(scanData.getRssi())) && Boolean.valueOf(isIsConnectable()).equals(Boolean.valueOf(scanData.isIsConnectable()));
    }

    @MaxLength(64)
    @Required
    @MinLength(0)
    @Documentation("Binary advertisement and/or scan response data.")
    public ByteBuffer getAdvertisementData() {
        return this.advertisementData;
    }

    public int getRssi() {
        return this.rssi;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getAdvertisementData(), Integer.valueOf(getRssi()), Boolean.valueOf(isIsConnectable()));
    }

    @Documentation("Can the BLE peripheral device be connected to?")
    public boolean isIsConnectable() {
        return this.isConnectable;
    }

    public void setAdvertisementData(ByteBuffer byteBuffer) {
        this.advertisementData = byteBuffer;
    }

    public void setIsConnectable(boolean z) {
        this.isConnectable = z;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAdvertisementData(getAdvertisementData());
        builder.withRssi(getRssi());
        builder.withIsConnectable(isIsConnectable());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScanData(advertisementData=");
        sb.append(String.valueOf(this.advertisementData));
        sb.append(", rssi=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", isConnectable=", this.rssi, sb);
        sb.append(String.valueOf(this.isConnectable));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
