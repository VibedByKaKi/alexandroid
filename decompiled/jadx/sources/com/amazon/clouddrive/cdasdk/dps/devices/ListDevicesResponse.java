package com.amazon.clouddrive.cdasdk.dps.devices;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListDevicesResponse {

    @SerializedName("devices")
    @Expose
    private List<DeviceResponse> devices;

    @Generated
    public ListDevicesResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListDevicesResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListDevicesResponse)) {
            return false;
        }
        ListDevicesResponse listDevicesResponse = (ListDevicesResponse) obj;
        if (!listDevicesResponse.canEqual(this)) {
            return false;
        }
        List<DeviceResponse> devices = getDevices();
        List<DeviceResponse> devices2 = listDevicesResponse.getDevices();
        return devices != null ? devices.equals(devices2) : devices2 == null;
    }

    @Generated
    public List<DeviceResponse> getDevices() {
        return this.devices;
    }

    @Generated
    public int hashCode() {
        List<DeviceResponse> devices = getDevices();
        return 59 + (devices == null ? 43 : devices.hashCode());
    }

    @Generated
    public void setDevices(List<DeviceResponse> list) {
        this.devices = list;
    }

    @Generated
    public String toString() {
        return "ListDevicesResponse(devices=" + getDevices() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
