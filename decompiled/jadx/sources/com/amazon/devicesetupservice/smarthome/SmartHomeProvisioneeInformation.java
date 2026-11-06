package com.amazon.devicesetupservice.smarthome;

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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@CoralSuppressWarnings
@Generated
@XmlName("SmartHomeProvisioneeInformation")
@Documentation("An object containing provisionee device information.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class SmartHomeProvisioneeInformation {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.SmartHomeProvisioneeInformation");
    private String associationSource;
    private String authMaterialIndex;
    private String productIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String associationSource;
        protected String authMaterialIndex;
        protected String productIndex;

        public SmartHomeProvisioneeInformation build() {
            SmartHomeProvisioneeInformation smartHomeProvisioneeInformation = new SmartHomeProvisioneeInformation();
            populate(smartHomeProvisioneeInformation);
            return smartHomeProvisioneeInformation;
        }

        public void populate(SmartHomeProvisioneeInformation smartHomeProvisioneeInformation) {
            smartHomeProvisioneeInformation.setProductIndex(this.productIndex);
            smartHomeProvisioneeInformation.setAuthMaterialIndex(this.authMaterialIndex);
            smartHomeProvisioneeInformation.setAssociationSource(this.associationSource);
        }

        public Builder withAssociationSource(String str) {
            this.associationSource = str;
            return this;
        }

        public Builder withAuthMaterialIndex(String str) {
            this.authMaterialIndex = str;
            return this;
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
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
        if (!(obj instanceof SmartHomeProvisioneeInformation)) {
            return false;
        }
        SmartHomeProvisioneeInformation smartHomeProvisioneeInformation = (SmartHomeProvisioneeInformation) obj;
        return Objects.equals(getProductIndex(), smartHomeProvisioneeInformation.getProductIndex()) && Objects.equals(getAuthMaterialIndex(), smartHomeProvisioneeInformation.getAuthMaterialIndex()) && Objects.equals(getAssociationSource(), smartHomeProvisioneeInformation.getAssociationSource());
    }

    @Documentation("Association source string from https://tiny.amazon.com/rysck8dg/codeamazpackDeviblobrele2.")
    public String getAssociationSource() {
        return this.associationSource;
    }

    @Pattern("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")
    public String getAuthMaterialIndex() {
        return this.authMaterialIndex;
    }

    @MaxLength(4)
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getProductIndex(), getAuthMaterialIndex(), getAssociationSource());
    }

    public void setAssociationSource(String str) {
        this.associationSource = str;
    }

    public void setAuthMaterialIndex(String str) {
        this.authMaterialIndex = str;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProductIndex(getProductIndex());
        builder.withAuthMaterialIndex(getAuthMaterialIndex());
        builder.withAssociationSource(getAssociationSource());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SmartHomeProvisioneeInformation(productIndex=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.productIndex, ", authMaterialIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialIndex, ", associationSource=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.associationSource, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
