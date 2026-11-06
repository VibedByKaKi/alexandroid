package com.amazon.clouddrive.cdasdk.cds.source;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.ISO8601;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BaseSourceInfo {

    @SerializedName("applicationId")
    @Expose
    private String applicationId;

    @SerializedName("creationTime")
    @Expose
    private ISO8601 creationTime;

    @SerializedName("lastModifiedTime")
    @Expose
    private ISO8601 lastModifiedTime;

    @SerializedName("lastSeenTime")
    @Expose
    private ISO8601 lastSeenTime;

    @SerializedName("pushDeliveryId")
    @Expose
    private String pushDeliveryId;

    @SerializedName("pushDeliveryService")
    @Expose
    private String pushDeliveryService;

    @SerializedName("pushEndpoint")
    @Expose
    private Boolean pushEndpoint;

    @SerializedName("pushEndpointARN")
    @Expose
    private String pushEndpointARN;

    @SerializedName("sourceApplicationName")
    @Expose
    private String sourceApplicationName;

    @SerializedName("sourceId")
    @Expose
    private String sourceId;

    @SerializedName("sourceStatus")
    @Expose
    private SourceStatus sourceStatus;

    @SerializedName("sourceVersionHistory")
    @Expose
    private Map<String, ISO8601> sourceVersionHistory;

    @SerializedName("timeZone")
    @Expose
    private String timeZone;

    @Generated
    public BaseSourceInfo() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof BaseSourceInfo;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseSourceInfo)) {
            return false;
        }
        BaseSourceInfo baseSourceInfo = (BaseSourceInfo) obj;
        if (!baseSourceInfo.canEqual(this)) {
            return false;
        }
        Boolean pushEndpoint = getPushEndpoint();
        Boolean pushEndpoint2 = baseSourceInfo.getPushEndpoint();
        if (pushEndpoint != null ? !pushEndpoint.equals(pushEndpoint2) : pushEndpoint2 != null) {
            return false;
        }
        String sourceId = getSourceId();
        String sourceId2 = baseSourceInfo.getSourceId();
        if (sourceId != null ? !sourceId.equals(sourceId2) : sourceId2 != null) {
            return false;
        }
        String sourceApplicationName = getSourceApplicationName();
        String sourceApplicationName2 = baseSourceInfo.getSourceApplicationName();
        if (sourceApplicationName != null ? !sourceApplicationName.equals(sourceApplicationName2) : sourceApplicationName2 != null) {
            return false;
        }
        ISO8601 creationTime = getCreationTime();
        ISO8601 creationTime2 = baseSourceInfo.getCreationTime();
        if (creationTime != null ? !creationTime.equals(creationTime2) : creationTime2 != null) {
            return false;
        }
        ISO8601 lastModifiedTime = getLastModifiedTime();
        ISO8601 lastModifiedTime2 = baseSourceInfo.getLastModifiedTime();
        if (lastModifiedTime != null ? !lastModifiedTime.equals(lastModifiedTime2) : lastModifiedTime2 != null) {
            return false;
        }
        ISO8601 lastSeenTime = getLastSeenTime();
        ISO8601 lastSeenTime2 = baseSourceInfo.getLastSeenTime();
        if (lastSeenTime != null ? !lastSeenTime.equals(lastSeenTime2) : lastSeenTime2 != null) {
            return false;
        }
        SourceStatus sourceStatus = getSourceStatus();
        SourceStatus sourceStatus2 = baseSourceInfo.getSourceStatus();
        if (sourceStatus != null ? !sourceStatus.equals(sourceStatus2) : sourceStatus2 != null) {
            return false;
        }
        Map<String, ISO8601> sourceVersionHistory = getSourceVersionHistory();
        Map<String, ISO8601> sourceVersionHistory2 = baseSourceInfo.getSourceVersionHistory();
        if (sourceVersionHistory != null ? !sourceVersionHistory.equals(sourceVersionHistory2) : sourceVersionHistory2 != null) {
            return false;
        }
        String pushEndpointARN = getPushEndpointARN();
        String pushEndpointARN2 = baseSourceInfo.getPushEndpointARN();
        if (pushEndpointARN != null ? !pushEndpointARN.equals(pushEndpointARN2) : pushEndpointARN2 != null) {
            return false;
        }
        String pushDeliveryService = getPushDeliveryService();
        String pushDeliveryService2 = baseSourceInfo.getPushDeliveryService();
        if (pushDeliveryService != null ? !pushDeliveryService.equals(pushDeliveryService2) : pushDeliveryService2 != null) {
            return false;
        }
        String pushDeliveryId = getPushDeliveryId();
        String pushDeliveryId2 = baseSourceInfo.getPushDeliveryId();
        if (pushDeliveryId != null ? !pushDeliveryId.equals(pushDeliveryId2) : pushDeliveryId2 != null) {
            return false;
        }
        String applicationId = getApplicationId();
        String applicationId2 = baseSourceInfo.getApplicationId();
        if (applicationId != null ? !applicationId.equals(applicationId2) : applicationId2 != null) {
            return false;
        }
        String timeZone = getTimeZone();
        String timeZone2 = baseSourceInfo.getTimeZone();
        return timeZone != null ? timeZone.equals(timeZone2) : timeZone2 == null;
    }

    @Generated
    public String getApplicationId() {
        return this.applicationId;
    }

    @Generated
    public ISO8601 getCreationTime() {
        return this.creationTime;
    }

    @Generated
    public ISO8601 getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    @Generated
    public ISO8601 getLastSeenTime() {
        return this.lastSeenTime;
    }

    @Generated
    public String getPushDeliveryId() {
        return this.pushDeliveryId;
    }

    @Generated
    public String getPushDeliveryService() {
        return this.pushDeliveryService;
    }

    @Generated
    public Boolean getPushEndpoint() {
        return this.pushEndpoint;
    }

    @Generated
    public String getPushEndpointARN() {
        return this.pushEndpointARN;
    }

    @Generated
    public String getSourceApplicationName() {
        return this.sourceApplicationName;
    }

    @Generated
    public String getSourceId() {
        return this.sourceId;
    }

    @Generated
    public SourceStatus getSourceStatus() {
        return this.sourceStatus;
    }

    @Generated
    public Map<String, ISO8601> getSourceVersionHistory() {
        return this.sourceVersionHistory;
    }

    @Generated
    public String getTimeZone() {
        return this.timeZone;
    }

    @Generated
    public int hashCode() {
        Boolean pushEndpoint = getPushEndpoint();
        int hashCode = pushEndpoint == null ? 43 : pushEndpoint.hashCode();
        String sourceId = getSourceId();
        int hashCode2 = ((hashCode + 59) * 59) + (sourceId == null ? 43 : sourceId.hashCode());
        String sourceApplicationName = getSourceApplicationName();
        int hashCode3 = (hashCode2 * 59) + (sourceApplicationName == null ? 43 : sourceApplicationName.hashCode());
        ISO8601 creationTime = getCreationTime();
        int hashCode4 = (hashCode3 * 59) + (creationTime == null ? 43 : creationTime.hashCode());
        ISO8601 lastModifiedTime = getLastModifiedTime();
        int hashCode5 = (hashCode4 * 59) + (lastModifiedTime == null ? 43 : lastModifiedTime.hashCode());
        ISO8601 lastSeenTime = getLastSeenTime();
        int hashCode6 = (hashCode5 * 59) + (lastSeenTime == null ? 43 : lastSeenTime.hashCode());
        SourceStatus sourceStatus = getSourceStatus();
        int hashCode7 = (hashCode6 * 59) + (sourceStatus == null ? 43 : sourceStatus.hashCode());
        Map<String, ISO8601> sourceVersionHistory = getSourceVersionHistory();
        int hashCode8 = (hashCode7 * 59) + (sourceVersionHistory == null ? 43 : sourceVersionHistory.hashCode());
        String pushEndpointARN = getPushEndpointARN();
        int hashCode9 = (hashCode8 * 59) + (pushEndpointARN == null ? 43 : pushEndpointARN.hashCode());
        String pushDeliveryService = getPushDeliveryService();
        int hashCode10 = (hashCode9 * 59) + (pushDeliveryService == null ? 43 : pushDeliveryService.hashCode());
        String pushDeliveryId = getPushDeliveryId();
        int hashCode11 = (hashCode10 * 59) + (pushDeliveryId == null ? 43 : pushDeliveryId.hashCode());
        String applicationId = getApplicationId();
        int i = hashCode11 * 59;
        int hashCode12 = applicationId == null ? 43 : applicationId.hashCode();
        String timeZone = getTimeZone();
        return ((i + hashCode12) * 59) + (timeZone != null ? timeZone.hashCode() : 43);
    }

    @Generated
    public void setApplicationId(String str) {
        this.applicationId = str;
    }

    @Generated
    public void setCreationTime(ISO8601 iso8601) {
        this.creationTime = iso8601;
    }

    @Generated
    public void setLastModifiedTime(ISO8601 iso8601) {
        this.lastModifiedTime = iso8601;
    }

    @Generated
    public void setLastSeenTime(ISO8601 iso8601) {
        this.lastSeenTime = iso8601;
    }

    @Generated
    public void setPushDeliveryId(String str) {
        this.pushDeliveryId = str;
    }

    @Generated
    public void setPushDeliveryService(String str) {
        this.pushDeliveryService = str;
    }

    @Generated
    public void setPushEndpoint(Boolean bool) {
        this.pushEndpoint = bool;
    }

    @Generated
    public void setPushEndpointARN(String str) {
        this.pushEndpointARN = str;
    }

    @Generated
    public void setSourceApplicationName(String str) {
        this.sourceApplicationName = str;
    }

    @Generated
    public void setSourceId(String str) {
        this.sourceId = str;
    }

    @Generated
    public void setSourceStatus(SourceStatus sourceStatus) {
        this.sourceStatus = sourceStatus;
    }

    @Generated
    public void setSourceVersionHistory(Map<String, ISO8601> map) {
        this.sourceVersionHistory = map;
    }

    @Generated
    public void setTimeZone(String str) {
        this.timeZone = str;
    }

    @Generated
    public String toString() {
        return "BaseSourceInfo(sourceId=" + getSourceId() + ", sourceApplicationName=" + getSourceApplicationName() + ", creationTime=" + getCreationTime() + ", lastModifiedTime=" + getLastModifiedTime() + ", lastSeenTime=" + getLastSeenTime() + ", sourceStatus=" + getSourceStatus() + ", sourceVersionHistory=" + getSourceVersionHistory() + ", pushEndpointARN=" + getPushEndpointARN() + ", pushDeliveryService=" + getPushDeliveryService() + ", pushDeliveryId=" + getPushDeliveryId() + ", pushEndpoint=" + getPushEndpoint() + ", applicationId=" + getApplicationId() + ", timeZone=" + getTimeZone() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
