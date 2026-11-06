package com.amazon.clouddrive.cdasdk.prompto.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.sharing.api.models.Message;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PromptoServiceResponse {

    @SerializedName("createdDate")
    @Expose
    private String createdDate;

    @SerializedName(Message.SERIALIZED_NAME_MODIFIED_DATE)
    @Expose
    private String modifiedDate;

    @SerializedName("version")
    @Expose
    private Long version;

    @Generated
    public PromptoServiceResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PromptoServiceResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromptoServiceResponse)) {
            return false;
        }
        PromptoServiceResponse promptoServiceResponse = (PromptoServiceResponse) obj;
        if (!promptoServiceResponse.canEqual(this)) {
            return false;
        }
        Long version = getVersion();
        Long version2 = promptoServiceResponse.getVersion();
        if (version != null ? !version.equals(version2) : version2 != null) {
            return false;
        }
        String modifiedDate = getModifiedDate();
        String modifiedDate2 = promptoServiceResponse.getModifiedDate();
        if (modifiedDate != null ? !modifiedDate.equals(modifiedDate2) : modifiedDate2 != null) {
            return false;
        }
        String createdDate = getCreatedDate();
        String createdDate2 = promptoServiceResponse.getCreatedDate();
        return createdDate != null ? createdDate.equals(createdDate2) : createdDate2 == null;
    }

    @Generated
    public String getCreatedDate() {
        return this.createdDate;
    }

    @Generated
    public String getModifiedDate() {
        return this.modifiedDate;
    }

    @Generated
    public Long getVersion() {
        return this.version;
    }

    @Generated
    public int hashCode() {
        Long version = getVersion();
        int hashCode = version == null ? 43 : version.hashCode();
        String modifiedDate = getModifiedDate();
        int i = (hashCode + 59) * 59;
        int hashCode2 = modifiedDate == null ? 43 : modifiedDate.hashCode();
        String createdDate = getCreatedDate();
        return ((i + hashCode2) * 59) + (createdDate != null ? createdDate.hashCode() : 43);
    }

    @Generated
    public void setCreatedDate(String str) {
        this.createdDate = str;
    }

    @Generated
    public void setModifiedDate(String str) {
        this.modifiedDate = str;
    }

    @Generated
    public void setVersion(Long l) {
        this.version = l;
    }

    @Generated
    public String toString() {
        return "PromptoServiceResponse(version=" + getVersion() + ", modifiedDate=" + getModifiedDate() + ", createdDate=" + getCreatedDate() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
