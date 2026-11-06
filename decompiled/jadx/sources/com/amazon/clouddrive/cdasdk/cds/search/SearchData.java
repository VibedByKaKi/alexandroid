package com.amazon.clouddrive.cdasdk.cds.search;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.PhotoSearchCategory;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchData {

    @SerializedName(PhotoSearchCategory.CLUSTER_ID)
    @Expose
    private String clusterId;

    @SerializedName("clusterName")
    @Expose
    private String clusterName;

    @SerializedName("locationId")
    @Expose
    private String locationId;

    @SerializedName("locationInfo")
    @Expose
    private LocationInfo locationInfo;

    @SerializedName(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID)
    @Expose
    private String nodeId;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY)
    @Expose
    private String ownerId;

    @SerializedName("thingId")
    @Expose
    private String thingId;

    @Generated
    public SearchData() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SearchData;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchData)) {
            return false;
        }
        SearchData searchData = (SearchData) obj;
        if (!searchData.canEqual(this)) {
            return false;
        }
        String nodeId = getNodeId();
        String nodeId2 = searchData.getNodeId();
        if (nodeId != null ? !nodeId.equals(nodeId2) : nodeId2 != null) {
            return false;
        }
        String locationId = getLocationId();
        String locationId2 = searchData.getLocationId();
        if (locationId != null ? !locationId.equals(locationId2) : locationId2 != null) {
            return false;
        }
        LocationInfo locationInfo = getLocationInfo();
        LocationInfo locationInfo2 = searchData.getLocationInfo();
        if (locationInfo != null ? !locationInfo.equals(locationInfo2) : locationInfo2 != null) {
            return false;
        }
        String ownerId = getOwnerId();
        String ownerId2 = searchData.getOwnerId();
        if (ownerId != null ? !ownerId.equals(ownerId2) : ownerId2 != null) {
            return false;
        }
        String clusterName = getClusterName();
        String clusterName2 = searchData.getClusterName();
        if (clusterName != null ? !clusterName.equals(clusterName2) : clusterName2 != null) {
            return false;
        }
        String clusterId = getClusterId();
        String clusterId2 = searchData.getClusterId();
        if (clusterId != null ? !clusterId.equals(clusterId2) : clusterId2 != null) {
            return false;
        }
        String thingId = getThingId();
        String thingId2 = searchData.getThingId();
        return thingId != null ? thingId.equals(thingId2) : thingId2 == null;
    }

    @Generated
    public String getClusterId() {
        return this.clusterId;
    }

    @Generated
    public String getClusterName() {
        return this.clusterName;
    }

    @Generated
    public String getLocationId() {
        return this.locationId;
    }

    @Generated
    public LocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    @Generated
    public String getNodeId() {
        return this.nodeId;
    }

    @Generated
    public String getOwnerId() {
        return this.ownerId;
    }

    @Generated
    public String getThingId() {
        return this.thingId;
    }

    @Generated
    public int hashCode() {
        String nodeId = getNodeId();
        int hashCode = nodeId == null ? 43 : nodeId.hashCode();
        String locationId = getLocationId();
        int hashCode2 = ((hashCode + 59) * 59) + (locationId == null ? 43 : locationId.hashCode());
        LocationInfo locationInfo = getLocationInfo();
        int hashCode3 = (hashCode2 * 59) + (locationInfo == null ? 43 : locationInfo.hashCode());
        String ownerId = getOwnerId();
        int hashCode4 = (hashCode3 * 59) + (ownerId == null ? 43 : ownerId.hashCode());
        String clusterName = getClusterName();
        int hashCode5 = (hashCode4 * 59) + (clusterName == null ? 43 : clusterName.hashCode());
        String clusterId = getClusterId();
        int i = hashCode5 * 59;
        int hashCode6 = clusterId == null ? 43 : clusterId.hashCode();
        String thingId = getThingId();
        return ((i + hashCode6) * 59) + (thingId != null ? thingId.hashCode() : 43);
    }

    @Generated
    public void setClusterId(String str) {
        this.clusterId = str;
    }

    @Generated
    public void setClusterName(String str) {
        this.clusterName = str;
    }

    @Generated
    public void setLocationId(String str) {
        this.locationId = str;
    }

    @Generated
    public void setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    @Generated
    public void setNodeId(String str) {
        this.nodeId = str;
    }

    @Generated
    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    @Generated
    public void setThingId(String str) {
        this.thingId = str;
    }

    @Generated
    public String toString() {
        return "SearchData(nodeId=" + getNodeId() + ", locationId=" + getLocationId() + ", locationInfo=" + getLocationInfo() + ", ownerId=" + getOwnerId() + ", clusterName=" + getClusterName() + ", clusterId=" + getClusterId() + ", thingId=" + getThingId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
