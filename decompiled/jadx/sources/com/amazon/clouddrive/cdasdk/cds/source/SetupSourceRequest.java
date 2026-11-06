package com.amazon.clouddrive.cdasdk.cds.source;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest;
import com.amazon.clouddrive.cdasdk.cds.common.PushProvider;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SetupSourceRequest extends CloudDriveRequest {

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

    @SerializedName("deviceSerialNumber")
    @Expose
    private String deviceSerialNumber;

    @SerializedName("osVersion")
    @Expose
    private String osVersion;

    @SerializedName("pushProvider")
    @Expose
    private PushProvider pushProvider;

    @SerializedName("registrationToken")
    @Expose
    private String registrationToken;

    @SerializedName("sourceApplicationName")
    @Expose
    private String sourceApplicationName;

    @SerializedName("sourceVersion")
    @Expose
    private String sourceVersion;

    @SerializedName("timeZone")
    @Expose
    private String timeZone;

    @Generated
    public SetupSourceRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SetupSourceRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetupSourceRequest)) {
            return false;
        }
        SetupSourceRequest setupSourceRequest = (SetupSourceRequest) obj;
        if (!setupSourceRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String deviceId = getDeviceId();
        String deviceId2 = setupSourceRequest.getDeviceId();
        if (deviceId != null ? !deviceId.equals(deviceId2) : deviceId2 != null) {
            return false;
        }
        String deviceSerialNumber = getDeviceSerialNumber();
        String deviceSerialNumber2 = setupSourceRequest.getDeviceSerialNumber();
        if (deviceSerialNumber != null ? !deviceSerialNumber.equals(deviceSerialNumber2) : deviceSerialNumber2 != null) {
            return false;
        }
        String deviceClass = getDeviceClass();
        String deviceClass2 = setupSourceRequest.getDeviceClass();
        if (deviceClass != null ? !deviceClass.equals(deviceClass2) : deviceClass2 != null) {
            return false;
        }
        String devicePlatform = getDevicePlatform();
        String devicePlatform2 = setupSourceRequest.getDevicePlatform();
        if (devicePlatform != null ? !devicePlatform.equals(devicePlatform2) : devicePlatform2 != null) {
            return false;
        }
        String deviceModel = getDeviceModel();
        String deviceModel2 = setupSourceRequest.getDeviceModel();
        if (deviceModel != null ? !deviceModel.equals(deviceModel2) : deviceModel2 != null) {
            return false;
        }
        String deviceFriendlyName = getDeviceFriendlyName();
        String deviceFriendlyName2 = setupSourceRequest.getDeviceFriendlyName();
        if (deviceFriendlyName != null ? !deviceFriendlyName.equals(deviceFriendlyName2) : deviceFriendlyName2 != null) {
            return false;
        }
        String osVersion = getOsVersion();
        String osVersion2 = setupSourceRequest.getOsVersion();
        if (osVersion != null ? !osVersion.equals(osVersion2) : osVersion2 != null) {
            return false;
        }
        String sourceApplicationName = getSourceApplicationName();
        String sourceApplicationName2 = setupSourceRequest.getSourceApplicationName();
        if (sourceApplicationName != null ? !sourceApplicationName.equals(sourceApplicationName2) : sourceApplicationName2 != null) {
            return false;
        }
        String sourceVersion = getSourceVersion();
        String sourceVersion2 = setupSourceRequest.getSourceVersion();
        if (sourceVersion != null ? !sourceVersion.equals(sourceVersion2) : sourceVersion2 != null) {
            return false;
        }
        String registrationToken = getRegistrationToken();
        String registrationToken2 = setupSourceRequest.getRegistrationToken();
        if (registrationToken != null ? !registrationToken.equals(registrationToken2) : registrationToken2 != null) {
            return false;
        }
        String deviceLanguage = getDeviceLanguage();
        String deviceLanguage2 = setupSourceRequest.getDeviceLanguage();
        if (deviceLanguage != null ? !deviceLanguage.equals(deviceLanguage2) : deviceLanguage2 != null) {
            return false;
        }
        PushProvider pushProvider = getPushProvider();
        PushProvider pushProvider2 = setupSourceRequest.getPushProvider();
        if (pushProvider != null ? !pushProvider.equals(pushProvider2) : pushProvider2 != null) {
            return false;
        }
        String timeZone = getTimeZone();
        String timeZone2 = setupSourceRequest.getTimeZone();
        return timeZone != null ? timeZone.equals(timeZone2) : timeZone2 == null;
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
    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @Generated
    public String getOsVersion() {
        return this.osVersion;
    }

    @Generated
    public PushProvider getPushProvider() {
        return this.pushProvider;
    }

    @Generated
    public String getRegistrationToken() {
        return this.registrationToken;
    }

    @Generated
    public String getSourceApplicationName() {
        return this.sourceApplicationName;
    }

    @Generated
    public String getSourceVersion() {
        return this.sourceVersion;
    }

    @Generated
    public String getTimeZone() {
        return this.timeZone;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String deviceId = getDeviceId();
        int hashCode2 = (hashCode * 59) + (deviceId == null ? 43 : deviceId.hashCode());
        String deviceSerialNumber = getDeviceSerialNumber();
        int hashCode3 = (hashCode2 * 59) + (deviceSerialNumber == null ? 43 : deviceSerialNumber.hashCode());
        String deviceClass = getDeviceClass();
        int hashCode4 = (hashCode3 * 59) + (deviceClass == null ? 43 : deviceClass.hashCode());
        String devicePlatform = getDevicePlatform();
        int hashCode5 = (hashCode4 * 59) + (devicePlatform == null ? 43 : devicePlatform.hashCode());
        String deviceModel = getDeviceModel();
        int hashCode6 = (hashCode5 * 59) + (deviceModel == null ? 43 : deviceModel.hashCode());
        String deviceFriendlyName = getDeviceFriendlyName();
        int hashCode7 = (hashCode6 * 59) + (deviceFriendlyName == null ? 43 : deviceFriendlyName.hashCode());
        String osVersion = getOsVersion();
        int hashCode8 = (hashCode7 * 59) + (osVersion == null ? 43 : osVersion.hashCode());
        String sourceApplicationName = getSourceApplicationName();
        int hashCode9 = (hashCode8 * 59) + (sourceApplicationName == null ? 43 : sourceApplicationName.hashCode());
        String sourceVersion = getSourceVersion();
        int hashCode10 = (hashCode9 * 59) + (sourceVersion == null ? 43 : sourceVersion.hashCode());
        String registrationToken = getRegistrationToken();
        int hashCode11 = (hashCode10 * 59) + (registrationToken == null ? 43 : registrationToken.hashCode());
        String deviceLanguage = getDeviceLanguage();
        int hashCode12 = (hashCode11 * 59) + (deviceLanguage == null ? 43 : deviceLanguage.hashCode());
        PushProvider pushProvider = getPushProvider();
        int i = hashCode12 * 59;
        int hashCode13 = pushProvider == null ? 43 : pushProvider.hashCode();
        String timeZone = getTimeZone();
        return ((i + hashCode13) * 59) + (timeZone != null ? timeZone.hashCode() : 43);
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
    public void setDeviceSerialNumber(String str) {
        this.deviceSerialNumber = str;
    }

    @Generated
    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    @Generated
    public void setPushProvider(PushProvider pushProvider) {
        this.pushProvider = pushProvider;
    }

    @Generated
    public void setRegistrationToken(String str) {
        this.registrationToken = str;
    }

    @Generated
    public void setSourceApplicationName(String str) {
        this.sourceApplicationName = str;
    }

    @Generated
    public void setSourceVersion(String str) {
        this.sourceVersion = str;
    }

    @Generated
    public void setTimeZone(String str) {
        this.timeZone = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "SetupSourceRequest(deviceId=" + getDeviceId() + ", deviceSerialNumber=" + getDeviceSerialNumber() + ", deviceClass=" + getDeviceClass() + ", devicePlatform=" + getDevicePlatform() + ", deviceModel=" + getDeviceModel() + ", deviceFriendlyName=" + getDeviceFriendlyName() + ", osVersion=" + getOsVersion() + ", sourceApplicationName=" + getSourceApplicationName() + ", sourceVersion=" + getSourceVersion() + ", registrationToken=" + getRegistrationToken() + ", deviceLanguage=" + getDeviceLanguage() + ", pushProvider=" + getPushProvider() + ", timeZone=" + getTimeZone() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
