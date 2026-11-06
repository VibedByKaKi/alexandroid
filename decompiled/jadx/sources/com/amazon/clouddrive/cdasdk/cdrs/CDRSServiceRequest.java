package com.amazon.clouddrive.cdasdk.cdrs;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.common.ResourceVersion;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class CDRSServiceRequest {

    @SerializedName("applicationId")
    @Expose
    private String applicationId;

    @SerializedName("lang")
    @Expose
    private String lang;

    @SerializedName("resourceVersion")
    @Expose
    private ResourceVersion resourceVersion;

    @Generated
    public CDRSServiceRequest() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CDRSServiceRequest;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CDRSServiceRequest)) {
            return false;
        }
        CDRSServiceRequest cDRSServiceRequest = (CDRSServiceRequest) obj;
        if (!cDRSServiceRequest.canEqual(this)) {
            return false;
        }
        ResourceVersion resourceVersion = getResourceVersion();
        ResourceVersion resourceVersion2 = cDRSServiceRequest.getResourceVersion();
        if (resourceVersion != null ? !resourceVersion.equals(resourceVersion2) : resourceVersion2 != null) {
            return false;
        }
        String lang = getLang();
        String lang2 = cDRSServiceRequest.getLang();
        if (lang != null ? !lang.equals(lang2) : lang2 != null) {
            return false;
        }
        String applicationId = getApplicationId();
        String applicationId2 = cDRSServiceRequest.getApplicationId();
        return applicationId != null ? applicationId.equals(applicationId2) : applicationId2 == null;
    }

    @Generated
    public String getApplicationId() {
        return this.applicationId;
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
        ResourceVersion resourceVersion = getResourceVersion();
        int hashCode = resourceVersion == null ? 43 : resourceVersion.hashCode();
        String lang = getLang();
        int i = (hashCode + 59) * 59;
        int hashCode2 = lang == null ? 43 : lang.hashCode();
        String applicationId = getApplicationId();
        return ((i + hashCode2) * 59) + (applicationId != null ? applicationId.hashCode() : 43);
    }

    @Generated
    public void setApplicationId(String str) {
        this.applicationId = str;
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
        StringBuilder sb = new StringBuilder("CDRSServiceRequest(resourceVersion=");
        sb.append(getResourceVersion());
        sb.append(", lang=");
        sb.append(getLang());
        sb.append(", applicationId=");
        return a$$ExternalSyntheticOutline0.m(sb, getApplicationId(), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
