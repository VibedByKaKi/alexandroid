package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetupservice.scap.v1.BleParameters;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("BleEventParameters")
@Documentation("BLE action/event parameters")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class BleEventParameters extends BleParameters {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.BleEventParameters");
    private ConnectionParameters connectionParameters;
    private ScanData scanData;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.scap.v1.BleParameters
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleEventParameters)) {
            return false;
        }
        BleEventParameters bleEventParameters = (BleEventParameters) obj;
        return super.equals(obj) && Objects.equals(getScanData(), bleEventParameters.getScanData()) && Objects.equals(getConnectionParameters(), bleEventParameters.getConnectionParameters());
    }

    @Documentation("BLE connection parameters.")
    public ConnectionParameters getConnectionParameters() {
        return this.connectionParameters;
    }

    @Documentation("BLE scan data.")
    public ScanData getScanData() {
        return this.scanData;
    }

    @Override // com.amazon.devicesetupservice.scap.v1.BleParameters
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getScanData(), getConnectionParameters());
    }

    public void setConnectionParameters(ConnectionParameters connectionParameters) {
        this.connectionParameters = connectionParameters;
    }

    public void setScanData(ScanData scanData) {
        this.scanData = scanData;
    }

    @Override // com.amazon.devicesetupservice.scap.v1.BleParameters
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceId(getDeviceId());
        builder.withServiceUuid(getServiceUuid());
        builder.withCharacteristicUuid(getCharacteristicUuid());
        builder.withPayload(getPayload());
        builder.withScanData(getScanData());
        builder.withConnectionParameters(getConnectionParameters());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.scap.v1.BleParameters
    public String toString() {
        return "BleEventParameters(super=" + super.toString() + ", , scanData=" + String.valueOf(this.scanData) + ", connectionParameters=" + String.valueOf(this.connectionParameters) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends BleParameters.Builder {
        protected ConnectionParameters connectionParameters;
        protected ScanData scanData;

        @Override // com.amazon.devicesetupservice.scap.v1.BleParameters.Builder
        public BleEventParameters build() {
            BleEventParameters bleEventParameters = new BleEventParameters();
            populate(bleEventParameters);
            return bleEventParameters;
        }

        public void populate(BleEventParameters bleEventParameters) {
            super.populate((BleParameters) bleEventParameters);
            bleEventParameters.setScanData(this.scanData);
            bleEventParameters.setConnectionParameters(this.connectionParameters);
        }

        public Builder withConnectionParameters(ConnectionParameters connectionParameters) {
            this.connectionParameters = connectionParameters;
            return this;
        }

        public Builder withScanData(ScanData scanData) {
            this.scanData = scanData;
            return this;
        }

        @Override // com.amazon.devicesetupservice.scap.v1.BleParameters.Builder
        public Builder withCharacteristicUuid(String str) {
            super.withCharacteristicUuid(str);
            return this;
        }

        @Override // com.amazon.devicesetupservice.scap.v1.BleParameters.Builder
        public Builder withDeviceId(String str) {
            super.withDeviceId(str);
            return this;
        }

        @Override // com.amazon.devicesetupservice.scap.v1.BleParameters.Builder
        public Builder withPayload(ByteBuffer byteBuffer) {
            super.withPayload(byteBuffer);
            return this;
        }

        @Override // com.amazon.devicesetupservice.scap.v1.BleParameters.Builder
        public Builder withServiceUuid(String str) {
            super.withServiceUuid(str);
            return this;
        }
    }
}
