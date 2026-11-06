package com.amazon.alexa.biloba.model;

import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeviceIdentifier {

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_PAYLOAD_TYPE)
    private String type = null;

    @SerializedName("dsn")
    private String dsn = null;

    @SerializedName("encryptedDeviceType")
    private String encryptedDeviceType = null;

    @SerializedName("endpointId")
    private String endpointId = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public DeviceIdentifier dsn(String str) {
        this.dsn = str;
        return this;
    }

    public DeviceIdentifier encryptedDeviceType(String str) {
        this.encryptedDeviceType = str;
        return this;
    }

    public DeviceIdentifier endpointId(String str) {
        this.endpointId = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceIdentifier deviceIdentifier = (DeviceIdentifier) obj;
            if (Objects.equals(this.type, deviceIdentifier.type) && Objects.equals(this.dsn, deviceIdentifier.dsn) && Objects.equals(this.encryptedDeviceType, deviceIdentifier.encryptedDeviceType) && Objects.equals(this.endpointId, deviceIdentifier.endpointId)) {
                return true;
            }
        }
        return false;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEncryptedDeviceType() {
        return this.encryptedDeviceType;
    }

    public String getEndpointId() {
        return this.endpointId;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.dsn, this.encryptedDeviceType, this.endpointId);
    }

    public void setDsn(String str) {
        this.dsn = str;
    }

    public void setEncryptedDeviceType(String str) {
        this.encryptedDeviceType = str;
    }

    public void setEndpointId(String str) {
        this.endpointId = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class DeviceIdentifier {\n    type: ");
        sb.append(toIndentedString(this.type));
        sb.append("\n    dsn: ");
        sb.append(toIndentedString(this.dsn));
        sb.append("\n    encryptedDeviceType: ");
        sb.append(toIndentedString(this.encryptedDeviceType));
        sb.append("\n    endpointId: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.endpointId), "\n}");
    }

    public DeviceIdentifier type(String str) {
        this.type = str;
        return this;
    }
}
