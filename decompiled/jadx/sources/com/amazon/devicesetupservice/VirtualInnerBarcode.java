package com.amazon.devicesetupservice;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
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
@XmlNamespace("http://device-setup-service.amazon.com/")
@CoralSuppressWarnings
@Generated
@XmlName("VirtualInnerBarcode")
@Documentation("This is the base structure for a \"virtual\" barcode used for creating customer associations")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public abstract class VirtualInnerBarcode {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.VirtualInnerBarcode");
    private String productIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static abstract class Builder {
        protected String productIndex;

        public void populate(VirtualInnerBarcode virtualInnerBarcode) {
            virtualInnerBarcode.setProductIndex(this.productIndex);
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
            return this;
        }
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VirtualInnerBarcode) {
            return Objects.equals(getProductIndex(), ((VirtualInnerBarcode) obj).getProductIndex());
        }
        return false;
    }

    @MaxLength(4)
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getProductIndex());
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.productIndex, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("VirtualInnerBarcode(productIndex="));
    }
}
