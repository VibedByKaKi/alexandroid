package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.ProvisioneeIdentifier;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("BarcodeIdentifier")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class BarcodeIdentifier extends ProvisioneeIdentifier {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.BarcodeIdentifier");
    private String barcodeData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends ProvisioneeIdentifier.Builder {
        protected String barcodeData;

        public BarcodeIdentifier build() {
            BarcodeIdentifier barcodeIdentifier = new BarcodeIdentifier();
            populate(barcodeIdentifier);
            return barcodeIdentifier;
        }

        public void populate(BarcodeIdentifier barcodeIdentifier) {
            super.populate((ProvisioneeIdentifier) barcodeIdentifier);
            barcodeIdentifier.setBarcodeData(this.barcodeData);
        }

        public Builder withBarcodeData(String str) {
            this.barcodeData = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeIdentifier
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BarcodeIdentifier) {
            return super.equals(obj) && Objects.equals(getBarcodeData(), ((BarcodeIdentifier) obj).getBarcodeData());
        }
        return false;
    }

    @MinLength(1)
    @Required
    public String getBarcodeData() {
        return this.barcodeData;
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeIdentifier
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getBarcodeData());
    }

    public void setBarcodeData(String str) {
        this.barcodeData = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withBarcodeData(getBarcodeData());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeIdentifier
    public String toString() {
        StringBuilder sb = new StringBuilder("BarcodeIdentifier(super=");
        sb.append(super.toString());
        sb.append(", barcodeData=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.barcodeData, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
