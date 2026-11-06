package com.amazon.clouddrive.cdasdk.dps.event;

import com.amazon.alexa.accessory.frames.amazonphotos.AmazonPhotosConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.dps.common.DPSRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RecordEventRequest extends DPSRequest {

    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName("deviceIdentifier")
    @Expose
    private String deviceIdentifier;

    @SerializedName(AmazonPhotosConstants.DEVICE_TYPE_ID_KEY)
    @Expose
    private String deviceTypeId;

    @SerializedName("eventName")
    @Expose
    private String eventName;

    @SerializedName("marketplaceId")
    @Expose
    private String marketplaceId;

    @SerializedName("requestDimensions")
    @Expose
    private Map<String, String> requestDimensions;

    @SerializedName("softwareVersion")
    @Expose
    private String softwareVersion;

    @Generated
    public RecordEventRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof RecordEventRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecordEventRequest)) {
            return false;
        }
        RecordEventRequest recordEventRequest = (RecordEventRequest) obj;
        if (!recordEventRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Integer count = getCount();
        Integer count2 = recordEventRequest.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        String eventName = getEventName();
        String eventName2 = recordEventRequest.getEventName();
        if (eventName != null ? !eventName.equals(eventName2) : eventName2 != null) {
            return false;
        }
        String softwareVersion = getSoftwareVersion();
        String softwareVersion2 = recordEventRequest.getSoftwareVersion();
        if (softwareVersion != null ? !softwareVersion.equals(softwareVersion2) : softwareVersion2 != null) {
            return false;
        }
        String deviceIdentifier = getDeviceIdentifier();
        String deviceIdentifier2 = recordEventRequest.getDeviceIdentifier();
        if (deviceIdentifier != null ? !deviceIdentifier.equals(deviceIdentifier2) : deviceIdentifier2 != null) {
            return false;
        }
        String deviceTypeId = getDeviceTypeId();
        String deviceTypeId2 = recordEventRequest.getDeviceTypeId();
        if (deviceTypeId != null ? !deviceTypeId.equals(deviceTypeId2) : deviceTypeId2 != null) {
            return false;
        }
        String marketplaceId = getMarketplaceId();
        String marketplaceId2 = recordEventRequest.getMarketplaceId();
        if (marketplaceId != null ? !marketplaceId.equals(marketplaceId2) : marketplaceId2 != null) {
            return false;
        }
        Map<String, String> requestDimensions = getRequestDimensions();
        Map<String, String> requestDimensions2 = recordEventRequest.getRequestDimensions();
        return requestDimensions != null ? requestDimensions.equals(requestDimensions2) : requestDimensions2 == null;
    }

    @Generated
    public Integer getCount() {
        return this.count;
    }

    @Generated
    public String getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    @Generated
    public String getDeviceTypeId() {
        return this.deviceTypeId;
    }

    @Generated
    public String getEventName() {
        return this.eventName;
    }

    @Generated
    public String getMarketplaceId() {
        return this.marketplaceId;
    }

    @Generated
    public Map<String, String> getRequestDimensions() {
        return this.requestDimensions;
    }

    @Generated
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Integer count = getCount();
        int hashCode2 = (hashCode * 59) + (count == null ? 43 : count.hashCode());
        String eventName = getEventName();
        int hashCode3 = (hashCode2 * 59) + (eventName == null ? 43 : eventName.hashCode());
        String softwareVersion = getSoftwareVersion();
        int hashCode4 = (hashCode3 * 59) + (softwareVersion == null ? 43 : softwareVersion.hashCode());
        String deviceIdentifier = getDeviceIdentifier();
        int hashCode5 = (hashCode4 * 59) + (deviceIdentifier == null ? 43 : deviceIdentifier.hashCode());
        String deviceTypeId = getDeviceTypeId();
        int hashCode6 = (hashCode5 * 59) + (deviceTypeId == null ? 43 : deviceTypeId.hashCode());
        String marketplaceId = getMarketplaceId();
        int i = hashCode6 * 59;
        int hashCode7 = marketplaceId == null ? 43 : marketplaceId.hashCode();
        Map<String, String> requestDimensions = getRequestDimensions();
        return ((i + hashCode7) * 59) + (requestDimensions != null ? requestDimensions.hashCode() : 43);
    }

    @Generated
    public void setCount(Integer num) {
        this.count = num;
    }

    @Generated
    public void setDeviceIdentifier(String str) {
        this.deviceIdentifier = str;
    }

    @Generated
    public void setDeviceTypeId(String str) {
        this.deviceTypeId = str;
    }

    @Generated
    public void setEventName(String str) {
        this.eventName = str;
    }

    @Generated
    public void setMarketplaceId(String str) {
        this.marketplaceId = str;
    }

    @Generated
    public void setRequestDimensions(Map<String, String> map) {
        this.requestDimensions = map;
    }

    @Generated
    public void setSoftwareVersion(String str) {
        this.softwareVersion = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public String toString() {
        return "RecordEventRequest(count=" + getCount() + ", eventName=" + getEventName() + ", softwareVersion=" + getSoftwareVersion() + ", deviceIdentifier=" + getDeviceIdentifier() + ", deviceTypeId=" + getDeviceTypeId() + ", marketplaceId=" + getMarketplaceId() + ", requestDimensions=" + getRequestDimensions() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
