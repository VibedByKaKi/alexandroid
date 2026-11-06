package com.amazon.clouddrive.cdasdk.dps.devices;

import com.amazon.alexa.accessory.frames.amazonphotos.AmazonPhotosConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.dps.common.DPSRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListDevicesRequest extends DPSRequest {

    @SerializedName(AmazonPhotosConstants.DEVICE_TYPE_ID_KEY)
    @Expose
    private String deviceTypeId;

    @SerializedName("dsn")
    @Expose
    private String dsn;

    @Generated
    public ListDevicesRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListDevicesRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListDevicesRequest)) {
            return false;
        }
        ListDevicesRequest listDevicesRequest = (ListDevicesRequest) obj;
        if (!listDevicesRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String deviceTypeId = getDeviceTypeId();
        String deviceTypeId2 = listDevicesRequest.getDeviceTypeId();
        if (deviceTypeId != null ? !deviceTypeId.equals(deviceTypeId2) : deviceTypeId2 != null) {
            return false;
        }
        String dsn = getDsn();
        String dsn2 = listDevicesRequest.getDsn();
        return dsn != null ? dsn.equals(dsn2) : dsn2 == null;
    }

    @Generated
    public String getDeviceTypeId() {
        return this.deviceTypeId;
    }

    @Generated
    public String getDsn() {
        return this.dsn;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String deviceTypeId = getDeviceTypeId();
        int i = hashCode * 59;
        int hashCode2 = deviceTypeId == null ? 43 : deviceTypeId.hashCode();
        String dsn = getDsn();
        return ((i + hashCode2) * 59) + (dsn != null ? dsn.hashCode() : 43);
    }

    @Generated
    public void setDeviceTypeId(String str) {
        this.deviceTypeId = str;
    }

    @Generated
    public void setDsn(String str) {
        this.dsn = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public String toString() {
        return "ListDevicesRequest(deviceTypeId=" + getDeviceTypeId() + ", dsn=" + getDsn() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
