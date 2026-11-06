package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
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
@XmlName("BLEMeshDeviceCredential")
@Documentation("A structure to hold the BLE Mesh Credential information: UUID, oobData, oobType")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class BLEMeshDeviceCredential {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.BLEMeshDeviceCredential");
    private String oobData;
    private int oobType;
    private String uuid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String oobData;
        protected int oobType;
        protected String uuid;

        public BLEMeshDeviceCredential build() {
            BLEMeshDeviceCredential bLEMeshDeviceCredential = new BLEMeshDeviceCredential();
            populate(bLEMeshDeviceCredential);
            return bLEMeshDeviceCredential;
        }

        public void populate(BLEMeshDeviceCredential bLEMeshDeviceCredential) {
            bLEMeshDeviceCredential.setUuid(this.uuid);
            bLEMeshDeviceCredential.setOobData(this.oobData);
            bLEMeshDeviceCredential.setOobType(this.oobType);
        }

        public Builder withOobData(String str) {
            this.oobData = str;
            return this;
        }

        public Builder withOobType(int i) {
            this.oobType = i;
            return this;
        }

        public Builder withUuid(String str) {
            this.uuid = str;
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
        if (!(obj instanceof BLEMeshDeviceCredential)) {
            return false;
        }
        BLEMeshDeviceCredential bLEMeshDeviceCredential = (BLEMeshDeviceCredential) obj;
        return Objects.equals(getUuid(), bLEMeshDeviceCredential.getUuid()) && Objects.equals(getOobData(), bLEMeshDeviceCredential.getOobData()) && Integer.valueOf(getOobType()).equals(Integer.valueOf(bLEMeshDeviceCredential.getOobType()));
    }

    @Documentation("OOB Data used to Authenticate BLE Mesh Device")
    public String getOobData() {
        return this.oobData;
    }

    @Documentation("OOB Type used to Authenticate BLE Mesh Device")
    public int getOobType() {
        return this.oobType;
    }

    @Documentation("BLE Mesh UUID (hexadecimal 128-bit canonical form).")
    @Pattern("([0-9a-fA-F]{8}(-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12})")
    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getUuid(), getOobData(), Integer.valueOf(getOobType()));
    }

    public void setOobData(String str) {
        this.oobData = str;
    }

    public void setOobType(int i) {
        this.oobType = i;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withUuid(getUuid());
        builder.withOobData(getOobData());
        builder.withOobType(getOobType());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BLEMeshDeviceCredential(uuid=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.uuid, ", oobData=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.oobData, ", oobType=", sb);
        sb.append(String.valueOf(this.oobType));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
