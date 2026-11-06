package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.VirtualInnerBarcode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("MatterMediaCastingVirtualInnerBarcode")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class MatterMediaCastingVirtualInnerBarcode extends VirtualInnerBarcode {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.MatterMediaCastingVirtualInnerBarcode");
    private String matterMediaCastingAuthMaterial;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.VirtualInnerBarcode
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MatterMediaCastingVirtualInnerBarcode) {
            return super.equals(obj) && Objects.equals(getMatterMediaCastingAuthMaterial(), ((MatterMediaCastingVirtualInnerBarcode) obj).getMatterMediaCastingAuthMaterial());
        }
        return false;
    }

    @Required
    public String getMatterMediaCastingAuthMaterial() {
        return this.matterMediaCastingAuthMaterial;
    }

    @Override // com.amazon.devicesetupservice.VirtualInnerBarcode
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getMatterMediaCastingAuthMaterial());
    }

    public void setMatterMediaCastingAuthMaterial(String str) {
        this.matterMediaCastingAuthMaterial = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProductIndex(getProductIndex());
        builder.withMatterMediaCastingAuthMaterial(getMatterMediaCastingAuthMaterial());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.VirtualInnerBarcode
    public String toString() {
        StringBuilder sb = new StringBuilder("MatterMediaCastingVirtualInnerBarcode(super=");
        sb.append(super.toString());
        sb.append(", matterMediaCastingAuthMaterial=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.matterMediaCastingAuthMaterial, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends VirtualInnerBarcode.Builder {
        protected String matterMediaCastingAuthMaterial;

        public MatterMediaCastingVirtualInnerBarcode build() {
            MatterMediaCastingVirtualInnerBarcode matterMediaCastingVirtualInnerBarcode = new MatterMediaCastingVirtualInnerBarcode();
            populate(matterMediaCastingVirtualInnerBarcode);
            return matterMediaCastingVirtualInnerBarcode;
        }

        public void populate(MatterMediaCastingVirtualInnerBarcode matterMediaCastingVirtualInnerBarcode) {
            super.populate((VirtualInnerBarcode) matterMediaCastingVirtualInnerBarcode);
            matterMediaCastingVirtualInnerBarcode.setMatterMediaCastingAuthMaterial(this.matterMediaCastingAuthMaterial);
        }

        public Builder withMatterMediaCastingAuthMaterial(String str) {
            this.matterMediaCastingAuthMaterial = str;
            return this;
        }

        @Override // com.amazon.devicesetupservice.VirtualInnerBarcode.Builder
        public Builder withProductIndex(String str) {
            super.withProductIndex(str);
            return this;
        }
    }
}
