package com.amazon.clouddrive.cdasdk.dps.devices;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceResponse {

    @SerializedName("deviceAccount")
    @Expose
    private String deviceAccount;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("type")
    @Expose
    private String type;

    @Generated
    public DeviceResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof DeviceResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceResponse)) {
            return false;
        }
        DeviceResponse deviceResponse = (DeviceResponse) obj;
        if (!deviceResponse.canEqual(this)) {
            return false;
        }
        String name = getName();
        String name2 = deviceResponse.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String type = getType();
        String type2 = deviceResponse.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String deviceAccount = getDeviceAccount();
        String deviceAccount2 = deviceResponse.getDeviceAccount();
        return deviceAccount != null ? deviceAccount.equals(deviceAccount2) : deviceAccount2 == null;
    }

    @Generated
    public String getDeviceAccount() {
        return this.deviceAccount;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public int hashCode() {
        String name = getName();
        int hashCode = name == null ? 43 : name.hashCode();
        String type = getType();
        int i = (hashCode + 59) * 59;
        int hashCode2 = type == null ? 43 : type.hashCode();
        String deviceAccount = getDeviceAccount();
        return ((i + hashCode2) * 59) + (deviceAccount != null ? deviceAccount.hashCode() : 43);
    }

    @Generated
    public void setDeviceAccount(String str) {
        this.deviceAccount = str;
    }

    @Generated
    public void setName(String str) {
        this.name = str;
    }

    @Generated
    public void setType(String str) {
        this.type = str;
    }

    @Generated
    public String toString() {
        return "DeviceResponse(name=" + getName() + ", type=" + getType() + ", deviceAccount=" + getDeviceAccount() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
