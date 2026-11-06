package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("BleParameters")
@Documentation("BLE action/event parameters")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class BleParameters {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.BleParameters");
    private String characteristicUuid;
    private String deviceId;
    private ByteBuffer payload;
    private String serviceUuid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String characteristicUuid;
        protected String deviceId;
        protected ByteBuffer payload;
        protected String serviceUuid;

        public BleParameters build() {
            BleParameters bleParameters = new BleParameters();
            populate(bleParameters);
            return bleParameters;
        }

        public void populate(BleParameters bleParameters) {
            bleParameters.setDeviceId(this.deviceId);
            bleParameters.setServiceUuid(this.serviceUuid);
            bleParameters.setCharacteristicUuid(this.characteristicUuid);
            bleParameters.setPayload(this.payload);
        }

        public Builder withCharacteristicUuid(String str) {
            this.characteristicUuid = str;
            return this;
        }

        public Builder withDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder withPayload(ByteBuffer byteBuffer) {
            this.payload = byteBuffer;
            return this;
        }

        public Builder withServiceUuid(String str) {
            this.serviceUuid = str;
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
        if (!(obj instanceof BleParameters)) {
            return false;
        }
        BleParameters bleParameters = (BleParameters) obj;
        return Objects.equals(getDeviceId(), bleParameters.getDeviceId()) && Objects.equals(getServiceUuid(), bleParameters.getServiceUuid()) && Objects.equals(getCharacteristicUuid(), bleParameters.getCharacteristicUuid()) && Objects.equals(getPayload(), bleParameters.getPayload());
    }

    @Documentation("BLE UUID (hexadecimal 16- or 32-bit or 128-bit canonical form).")
    @Pattern("([0-9a-fA-F]{4})|([0-9a-fA-F]{8})|([0-9a-fA-F]{8}(-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12})")
    public String getCharacteristicUuid() {
        return this.characteristicUuid;
    }

    @MinLength(1)
    @Documentation("MAC address in MM:MM:MM:SS:SS:SS format or other unique ID string.")
    public String getDeviceId() {
        return this.deviceId;
    }

    @Documentation("Binary action payload (e.g., write payload).")
    public ByteBuffer getPayload() {
        return this.payload;
    }

    @Documentation("BLE UUID (hexadecimal 16- or 32-bit or 128-bit canonical form).")
    @Pattern("([0-9a-fA-F]{4})|([0-9a-fA-F]{8})|([0-9a-fA-F]{8}(-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12})")
    public String getServiceUuid() {
        return this.serviceUuid;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getDeviceId(), getServiceUuid(), getCharacteristicUuid(), getPayload());
    }

    public void setCharacteristicUuid(String str) {
        this.characteristicUuid = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setPayload(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
    }

    public void setServiceUuid(String str) {
        this.serviceUuid = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceId(getDeviceId());
        builder.withServiceUuid(getServiceUuid());
        builder.withCharacteristicUuid(getCharacteristicUuid());
        builder.withPayload(getPayload());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BleParameters(deviceId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceId, ", serviceUuid=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.serviceUuid, ", characteristicUuid=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.characteristicUuid, ", payload=", sb);
        sb.append(String.valueOf(this.payload));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
