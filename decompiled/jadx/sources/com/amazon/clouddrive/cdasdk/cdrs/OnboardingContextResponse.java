package com.amazon.clouddrive.cdasdk.cdrs;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.sharing.api.models.Message;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class OnboardingContextResponse {

    @SerializedName("contextId")
    @Expose
    private String contextId;

    @SerializedName("contextType")
    @Expose
    private String contextType;

    @SerializedName("createdDate")
    @Expose
    private String createdDate;

    @SerializedName("data")
    @Expose
    private HashMap<String, String> data;

    @SerializedName("dataVersion")
    @Expose
    private String dataVersion;

    @SerializedName(Message.SERIALIZED_NAME_MODIFIED_DATE)
    @Expose
    private String modifiedDate;

    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("version")
    @Expose
    private Long version;

    @Generated
    public OnboardingContextResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof OnboardingContextResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnboardingContextResponse)) {
            return false;
        }
        OnboardingContextResponse onboardingContextResponse = (OnboardingContextResponse) obj;
        if (!onboardingContextResponse.canEqual(this)) {
            return false;
        }
        Long version = getVersion();
        Long version2 = onboardingContextResponse.getVersion();
        if (version != null ? !version.equals(version2) : version2 != null) {
            return false;
        }
        String contextId = getContextId();
        String contextId2 = onboardingContextResponse.getContextId();
        if (contextId != null ? !contextId.equals(contextId2) : contextId2 != null) {
            return false;
        }
        String contextType = getContextType();
        String contextType2 = onboardingContextResponse.getContextType();
        if (contextType != null ? !contextType.equals(contextType2) : contextType2 != null) {
            return false;
        }
        String dataVersion = getDataVersion();
        String dataVersion2 = onboardingContextResponse.getDataVersion();
        if (dataVersion != null ? !dataVersion.equals(dataVersion2) : dataVersion2 != null) {
            return false;
        }
        HashMap<String, String> data = getData();
        HashMap<String, String> data2 = onboardingContextResponse.getData();
        if (data != null ? !data.equals(data2) : data2 != null) {
            return false;
        }
        String state = getState();
        String state2 = onboardingContextResponse.getState();
        if (state != null ? !state.equals(state2) : state2 != null) {
            return false;
        }
        String createdDate = getCreatedDate();
        String createdDate2 = onboardingContextResponse.getCreatedDate();
        if (createdDate != null ? !createdDate.equals(createdDate2) : createdDate2 != null) {
            return false;
        }
        String modifiedDate = getModifiedDate();
        String modifiedDate2 = onboardingContextResponse.getModifiedDate();
        return modifiedDate != null ? modifiedDate.equals(modifiedDate2) : modifiedDate2 == null;
    }

    @Generated
    public String getContextId() {
        return this.contextId;
    }

    @Generated
    public String getContextType() {
        return this.contextType;
    }

    @Generated
    public String getCreatedDate() {
        return this.createdDate;
    }

    @Generated
    public HashMap<String, String> getData() {
        return this.data;
    }

    @Generated
    public String getDataVersion() {
        return this.dataVersion;
    }

    @Generated
    public String getModifiedDate() {
        return this.modifiedDate;
    }

    @Generated
    public String getState() {
        return this.state;
    }

    @Generated
    public Long getVersion() {
        return this.version;
    }

    @Generated
    public int hashCode() {
        Long version = getVersion();
        int hashCode = version == null ? 43 : version.hashCode();
        String contextId = getContextId();
        int hashCode2 = ((hashCode + 59) * 59) + (contextId == null ? 43 : contextId.hashCode());
        String contextType = getContextType();
        int hashCode3 = (hashCode2 * 59) + (contextType == null ? 43 : contextType.hashCode());
        String dataVersion = getDataVersion();
        int hashCode4 = (hashCode3 * 59) + (dataVersion == null ? 43 : dataVersion.hashCode());
        HashMap<String, String> data = getData();
        int hashCode5 = (hashCode4 * 59) + (data == null ? 43 : data.hashCode());
        String state = getState();
        int hashCode6 = (hashCode5 * 59) + (state == null ? 43 : state.hashCode());
        String createdDate = getCreatedDate();
        int i = hashCode6 * 59;
        int hashCode7 = createdDate == null ? 43 : createdDate.hashCode();
        String modifiedDate = getModifiedDate();
        return ((i + hashCode7) * 59) + (modifiedDate != null ? modifiedDate.hashCode() : 43);
    }

    @Generated
    public void setContextId(String str) {
        this.contextId = str;
    }

    @Generated
    public void setContextType(String str) {
        this.contextType = str;
    }

    @Generated
    public void setCreatedDate(String str) {
        this.createdDate = str;
    }

    @Generated
    public void setData(HashMap<String, String> hashMap) {
        this.data = hashMap;
    }

    @Generated
    public void setDataVersion(String str) {
        this.dataVersion = str;
    }

    @Generated
    public void setModifiedDate(String str) {
        this.modifiedDate = str;
    }

    @Generated
    public void setState(String str) {
        this.state = str;
    }

    @Generated
    public void setVersion(Long l) {
        this.version = l;
    }

    @Generated
    public String toString() {
        return "OnboardingContextResponse(contextId=" + getContextId() + ", contextType=" + getContextType() + ", dataVersion=" + getDataVersion() + ", data=" + getData() + ", state=" + getState() + ", createdDate=" + getCreatedDate() + ", modifiedDate=" + getModifiedDate() + ", version=" + getVersion() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
