package com.amazon.clouddrive.cdasdk.aps.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APSInput {

    @SerializedName(BizMetricsConstants.CUSTOMER_ID)
    @Expose
    private String customerId;

    @SerializedName("devicePlatform")
    @Expose
    private DevicePlatform devicePlatform;

    @SerializedName("featureFlags")
    @Expose
    private String featureFlags;

    @SerializedName("lang")
    @Expose
    private String lang;

    @SerializedName("resourceVersion")
    @Expose
    private ResourceVersion resourceVersion;

    @Generated
    public APSInput() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof APSInput;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof APSInput)) {
            return false;
        }
        APSInput aPSInput = (APSInput) obj;
        if (!aPSInput.canEqual(this)) {
            return false;
        }
        String customerId = getCustomerId();
        String customerId2 = aPSInput.getCustomerId();
        if (customerId != null ? !customerId.equals(customerId2) : customerId2 != null) {
            return false;
        }
        ResourceVersion resourceVersion = getResourceVersion();
        ResourceVersion resourceVersion2 = aPSInput.getResourceVersion();
        if (resourceVersion != null ? !resourceVersion.equals(resourceVersion2) : resourceVersion2 != null) {
            return false;
        }
        String lang = getLang();
        String lang2 = aPSInput.getLang();
        if (lang != null ? !lang.equals(lang2) : lang2 != null) {
            return false;
        }
        DevicePlatform devicePlatform = getDevicePlatform();
        DevicePlatform devicePlatform2 = aPSInput.getDevicePlatform();
        if (devicePlatform != null ? !devicePlatform.equals(devicePlatform2) : devicePlatform2 != null) {
            return false;
        }
        String featureFlags = getFeatureFlags();
        String featureFlags2 = aPSInput.getFeatureFlags();
        return featureFlags != null ? featureFlags.equals(featureFlags2) : featureFlags2 == null;
    }

    @Generated
    public String getCustomerId() {
        return this.customerId;
    }

    @Generated
    public DevicePlatform getDevicePlatform() {
        return this.devicePlatform;
    }

    @Generated
    public String getFeatureFlags() {
        return this.featureFlags;
    }

    @Generated
    public String getLang() {
        return this.lang;
    }

    @Generated
    public ResourceVersion getResourceVersion() {
        return this.resourceVersion;
    }

    @Generated
    public int hashCode() {
        String customerId = getCustomerId();
        int hashCode = customerId == null ? 43 : customerId.hashCode();
        ResourceVersion resourceVersion = getResourceVersion();
        int hashCode2 = ((hashCode + 59) * 59) + (resourceVersion == null ? 43 : resourceVersion.hashCode());
        String lang = getLang();
        int hashCode3 = (hashCode2 * 59) + (lang == null ? 43 : lang.hashCode());
        DevicePlatform devicePlatform = getDevicePlatform();
        int i = hashCode3 * 59;
        int hashCode4 = devicePlatform == null ? 43 : devicePlatform.hashCode();
        String featureFlags = getFeatureFlags();
        return ((i + hashCode4) * 59) + (featureFlags != null ? featureFlags.hashCode() : 43);
    }

    @Generated
    public void setCustomerId(String str) {
        this.customerId = str;
    }

    @Generated
    public void setDevicePlatform(DevicePlatform devicePlatform) {
        this.devicePlatform = devicePlatform;
    }

    @Generated
    public void setFeatureFlags(String str) {
        this.featureFlags = str;
    }

    @Generated
    public void setLang(String str) {
        this.lang = str;
    }

    @Generated
    public void setResourceVersion(ResourceVersion resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @Generated
    public String toString() {
        return "APSInput(customerId=" + getCustomerId() + ", resourceVersion=" + getResourceVersion() + ", lang=" + getLang() + ", devicePlatform=" + getDevicePlatform() + ", featureFlags=" + getFeatureFlags() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
