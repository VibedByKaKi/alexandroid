package com.amazon.devicesetupservice.v1;

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
import com.amazon.devicesetupservice.VirtualInnerBarcode;
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("RecordDevicePossessionIntentInnerBarcodeInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class RecordDevicePossessionIntentInnerBarcodeInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.RecordDevicePossessionIntentInnerBarcodeInput");
    private String barcodeData;
    private VirtualInnerBarcode virtualInnerBarcode;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordDevicePossessionIntentInnerBarcodeInput)) {
            return false;
        }
        RecordDevicePossessionIntentInnerBarcodeInput recordDevicePossessionIntentInnerBarcodeInput = (RecordDevicePossessionIntentInnerBarcodeInput) obj;
        return super.equals(obj) && Objects.equals(getBarcodeData(), recordDevicePossessionIntentInnerBarcodeInput.getBarcodeData()) && Objects.equals(getVirtualInnerBarcode(), recordDevicePossessionIntentInnerBarcodeInput.getVirtualInnerBarcode());
    }

    @MinLength(1)
    public String getBarcodeData() {
        return this.barcodeData;
    }

    @Documentation("This is the base structure for a \"virtual\" barcode used for creating customer associations")
    public VirtualInnerBarcode getVirtualInnerBarcode() {
        return this.virtualInnerBarcode;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getBarcodeData(), getVirtualInnerBarcode());
    }

    public void setBarcodeData(String str) {
        this.barcodeData = str;
    }

    public void setVirtualInnerBarcode(VirtualInnerBarcode virtualInnerBarcode) {
        this.virtualInnerBarcode = virtualInnerBarcode;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withBarcodeData(getBarcodeData());
        builder.withVirtualInnerBarcode(getVirtualInnerBarcode());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("RecordDevicePossessionIntentInnerBarcodeInput(super=");
        sb.append(super.toString());
        sb.append(", , barcodeData=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.barcodeData, ", virtualInnerBarcode=", sb);
        sb.append(String.valueOf(this.virtualInnerBarcode));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String barcodeData;
        protected VirtualInnerBarcode virtualInnerBarcode;

        public RecordDevicePossessionIntentInnerBarcodeInput build() {
            RecordDevicePossessionIntentInnerBarcodeInput recordDevicePossessionIntentInnerBarcodeInput = new RecordDevicePossessionIntentInnerBarcodeInput();
            populate(recordDevicePossessionIntentInnerBarcodeInput);
            return recordDevicePossessionIntentInnerBarcodeInput;
        }

        public void populate(RecordDevicePossessionIntentInnerBarcodeInput recordDevicePossessionIntentInnerBarcodeInput) {
            super.populate((AuthenticatedInput) recordDevicePossessionIntentInnerBarcodeInput);
            recordDevicePossessionIntentInnerBarcodeInput.setBarcodeData(this.barcodeData);
            recordDevicePossessionIntentInnerBarcodeInput.setVirtualInnerBarcode(this.virtualInnerBarcode);
        }

        public Builder withBarcodeData(String str) {
            this.barcodeData = str;
            return this;
        }

        public Builder withVirtualInnerBarcode(VirtualInnerBarcode virtualInnerBarcode) {
            this.virtualInnerBarcode = virtualInnerBarcode;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
