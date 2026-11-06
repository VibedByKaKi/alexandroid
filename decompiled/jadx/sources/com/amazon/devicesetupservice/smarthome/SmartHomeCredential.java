package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
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
@XmlName("SmartHomeCredential")
@Documentation("A structure to hold the Auth Material Id and Auth Material Data.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class SmartHomeCredential {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.SmartHomeCredential");
    private String authMaterialData;
    private String authMaterialId;
    private String protocolType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String authMaterialData;
        protected String authMaterialId;
        protected String protocolType;

        public SmartHomeCredential build() {
            SmartHomeCredential smartHomeCredential = new SmartHomeCredential();
            populate(smartHomeCredential);
            return smartHomeCredential;
        }

        public void populate(SmartHomeCredential smartHomeCredential) {
            smartHomeCredential.setProtocolType(this.protocolType);
            smartHomeCredential.setAuthMaterialId(this.authMaterialId);
            smartHomeCredential.setAuthMaterialData(this.authMaterialData);
        }

        public Builder withAuthMaterialData(String str) {
            this.authMaterialData = str;
            return this;
        }

        public Builder withAuthMaterialId(String str) {
            this.authMaterialId = str;
            return this;
        }

        public Builder withProtocolType(String str) {
            this.protocolType = str;
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
        if (!(obj instanceof SmartHomeCredential)) {
            return false;
        }
        SmartHomeCredential smartHomeCredential = (SmartHomeCredential) obj;
        return Objects.equals(getProtocolType(), smartHomeCredential.getProtocolType()) && Objects.equals(getAuthMaterialId(), smartHomeCredential.getAuthMaterialId()) && Objects.equals(getAuthMaterialData(), smartHomeCredential.getAuthMaterialData());
    }

    public String getAuthMaterialData() {
        return this.authMaterialData;
    }

    public String getAuthMaterialId() {
        return this.authMaterialId;
    }

    @EnumValues({ProtocolType.ZIGBEE, ProtocolType.BLE, ProtocolType.BLE_MESH, ProtocolType.WIFI, "MATTER", ProtocolType.THREAD})
    public String getProtocolType() {
        return this.protocolType;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getProtocolType(), getAuthMaterialId(), getAuthMaterialData());
    }

    public void setAuthMaterialData(String str) {
        this.authMaterialData = str;
    }

    public void setAuthMaterialId(String str) {
        this.authMaterialId = str;
    }

    public void setProtocolType(String str) {
        this.protocolType = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProtocolType(getProtocolType());
        builder.withAuthMaterialId(getAuthMaterialId());
        builder.withAuthMaterialData(getAuthMaterialData());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SmartHomeCredential(protocolType=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.protocolType, ", authMaterialId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialId, ", authMaterialData=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.authMaterialData, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
