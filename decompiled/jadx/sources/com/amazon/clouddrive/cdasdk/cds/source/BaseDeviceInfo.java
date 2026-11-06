package com.amazon.clouddrive.cdasdk.cds.source;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.ISO8601;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BaseDeviceInfo {

    @SerializedName("creationTime")
    @Expose
    private ISO8601 creationTime;

    @SerializedName("deviceClass")
    @Expose
    private String deviceClass;

    @SerializedName("deviceFriendlyName")
    @Expose
    private String deviceFriendlyName;

    @SerializedName("deviceId")
    @Expose
    private String deviceId;

    @SerializedName("deviceLanguage")
    @Expose
    private String deviceLanguage;

    @SerializedName("deviceModel")
    @Expose
    private String deviceModel;

    @SerializedName("devicePlatform")
    @Expose
    private String devicePlatform;

    @SerializedName("deviceStatus")
    @Expose
    private String deviceStatus;

    @SerializedName("lastModifiedTime")
    @Expose
    private ISO8601 lastModifiedTime;

    @SerializedName("osVersionHistory")
    @Expose
    private Map<String, ISO8601> osVersionHistory;

    @Generated
    public BaseDeviceInfo() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof BaseDeviceInfo;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseDeviceInfo)) {
            return false;
        }
        BaseDeviceInfo baseDeviceInfo = (BaseDeviceInfo) obj;
        if (!baseDeviceInfo.canEqual(this)) {
            return false;
        }
        String deviceId = getDeviceId();
        String deviceId2 = baseDeviceInfo.getDeviceId();
        if (deviceId != null ? !deviceId.equals(deviceId2) : deviceId2 != null) {
            return false;
        }
        String deviceClass = getDeviceClass();
        String deviceClass2 = baseDeviceInfo.getDeviceClass();
        if (deviceClass != null ? !deviceClass.equals(deviceClass2) : deviceClass2 != null) {
            return false;
        }
        String devicePlatform = getDevicePlatform();
        String devicePlatform2 = baseDeviceInfo.getDevicePlatform();
        if (devicePlatform != null ? !devicePlatform.equals(devicePlatform2) : devicePlatform2 != null) {
            return false;
        }
        String deviceModel = getDeviceModel();
        String deviceModel2 = baseDeviceInfo.getDeviceModel();
        if (deviceModel != null ? !deviceModel.equals(deviceModel2) : deviceModel2 != null) {
            return false;
        }
        String deviceFriendlyName = getDeviceFriendlyName();
        String deviceFriendlyName2 = baseDeviceInfo.getDeviceFriendlyName();
        if (deviceFriendlyName != null ? !deviceFriendlyName.equals(deviceFriendlyName2) : deviceFriendlyName2 != null) {
            return false;
        }
        String deviceStatus = getDeviceStatus();
        String deviceStatus2 = baseDeviceInfo.getDeviceStatus();
        if (deviceStatus != null ? !deviceStatus.equals(deviceStatus2) : deviceStatus2 != null) {
            return false;
        }
        Map<String, ISO8601> osVersionHistory = getOsVersionHistory();
        Map<String, ISO8601> osVersionHistory2 = baseDeviceInfo.getOsVersionHistory();
        if (osVersionHistory != null ? !osVersionHistory.equals(osVersionHistory2) : osVersionHistory2 != null) {
            return false;
        }
        ISO8601 creationTime = getCreationTime();
        ISO8601 creationTime2 = baseDeviceInfo.getCreationTime();
        if (creationTime != null ? !creationTime.equals(creationTime2) : creationTime2 != null) {
            return false;
        }
        ISO8601 lastModifiedTime = getLastModifiedTime();
        ISO8601 lastModifiedTime2 = baseDeviceInfo.getLastModifiedTime();
        if (lastModifiedTime != null ? !lastModifiedTime.equals(lastModifiedTime2) : lastModifiedTime2 != null) {
            return false;
        }
        String deviceLanguage = getDeviceLanguage();
        String deviceLanguage2 = baseDeviceInfo.getDeviceLanguage();
        return deviceLanguage != null ? deviceLanguage.equals(deviceLanguage2) : deviceLanguage2 == null;
    }

    @Generated
    public ISO8601 getCreationTime() {
        return this.creationTime;
    }

    @Generated
    public String getDeviceClass() {
        return this.deviceClass;
    }

    @Generated
    public String getDeviceFriendlyName() {
        return this.deviceFriendlyName;
    }

    @Generated
    public String getDeviceId() {
        return this.deviceId;
    }

    @Generated
    public String getDeviceLanguage() {
        return this.deviceLanguage;
    }

    @Generated
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @Generated
    public String getDevicePlatform() {
        return this.devicePlatform;
    }

    @Generated
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    @Generated
    public ISO8601 getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    @Generated
    public Map<String, ISO8601> getOsVersionHistory() {
        return this.osVersionHistory;
    }

    @Generated
    public int hashCode() {
        String deviceId = getDeviceId();
        int hashCode = deviceId == null ? 43 : deviceId.hashCode();
        String deviceClass = getDeviceClass();
        int hashCode2 = ((hashCode + 59) * 59) + (deviceClass == null ? 43 : deviceClass.hashCode());
        String devicePlatform = getDevicePlatform();
        int hashCode3 = (hashCode2 * 59) + (devicePlatform == null ? 43 : devicePlatform.hashCode());
        String deviceModel = getDeviceModel();
        int hashCode4 = (hashCode3 * 59) + (deviceModel == null ? 43 : deviceModel.hashCode());
        String deviceFriendlyName = getDeviceFriendlyName();
        int hashCode5 = (hashCode4 * 59) + (deviceFriendlyName == null ? 43 : deviceFriendlyName.hashCode());
        String deviceStatus = getDeviceStatus();
        int hashCode6 = (hashCode5 * 59) + (deviceStatus == null ? 43 : deviceStatus.hashCode());
        Map<String, ISO8601> osVersionHistory = getOsVersionHistory();
        int hashCode7 = (hashCode6 * 59) + (osVersionHistory == null ? 43 : osVersionHistory.hashCode());
        ISO8601 creationTime = getCreationTime();
        int hashCode8 = (hashCode7 * 59) + (creationTime == null ? 43 : creationTime.hashCode());
        ISO8601 lastModifiedTime = getLastModifiedTime();
        int i = hashCode8 * 59;
        int hashCode9 = lastModifiedTime == null ? 43 : lastModifiedTime.hashCode();
        String deviceLanguage = getDeviceLanguage();
        return ((i + hashCode9) * 59) + (deviceLanguage != null ? deviceLanguage.hashCode() : 43);
    }

    @Generated
    public void setCreationTime(ISO8601 iso8601) {
        this.creationTime = iso8601;
    }

    @Generated
    public void setDeviceClass(String str) {
        this.deviceClass = str;
    }

    @Generated
    public void setDeviceFriendlyName(String str) {
        this.deviceFriendlyName = str;
    }

    @Generated
    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    @Generated
    public void setDeviceLanguage(String str) {
        this.deviceLanguage = str;
    }

    @Generated
    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    @Generated
    public void setDevicePlatform(String str) {
        this.devicePlatform = str;
    }

    @Generated
    public void setDeviceStatus(String str) {
        this.deviceStatus = str;
    }

    @Generated
    public void setLastModifiedTime(ISO8601 iso8601) {
        this.lastModifiedTime = iso8601;
    }

    @Generated
    public void setOsVersionHistory(Map<String, ISO8601> map) {
        this.osVersionHistory = map;
    }

    @Generated
    public String toString() {
        return "BaseDeviceInfo(deviceId=" + getDeviceId() + ", deviceClass=" + getDeviceClass() + ", devicePlatform=" + getDevicePlatform() + ", deviceModel=" + getDeviceModel() + ", deviceFriendlyName=" + getDeviceFriendlyName() + ", deviceStatus=" + getDeviceStatus() + ", osVersionHistory=" + getOsVersionHistory() + ", creationTime=" + getCreationTime() + ", lastModifiedTime=" + getLastModifiedTime() + ", deviceLanguage=" + getDeviceLanguage() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
