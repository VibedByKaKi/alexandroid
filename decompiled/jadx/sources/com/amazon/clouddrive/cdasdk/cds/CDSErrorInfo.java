package com.amazon.clouddrive.cdasdk.cds;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.sharing.api.models.Message;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nullable;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CDSErrorInfo {

    @SerializedName("fields")
    @Nullable
    @Expose
    private String fields;

    @SerializedName("invalidIds")
    @Nullable
    @Expose
    private String invalidIds;

    @SerializedName("limit")
    @Nullable
    @Expose
    private Integer limit;

    @SerializedName(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID)
    @Nullable
    @Expose
    private String nodeId;

    @SerializedName(Message.SERIALIZED_NAME_PARENT_ID)
    @Nullable
    @Expose
    private String parentId;

    @Generated
    public CDSErrorInfo() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CDSErrorInfo;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CDSErrorInfo)) {
            return false;
        }
        CDSErrorInfo cDSErrorInfo = (CDSErrorInfo) obj;
        if (!cDSErrorInfo.canEqual(this)) {
            return false;
        }
        Integer limit = getLimit();
        Integer limit2 = cDSErrorInfo.getLimit();
        if (limit != null ? !limit.equals(limit2) : limit2 != null) {
            return false;
        }
        String nodeId = getNodeId();
        String nodeId2 = cDSErrorInfo.getNodeId();
        if (nodeId != null ? !nodeId.equals(nodeId2) : nodeId2 != null) {
            return false;
        }
        String parentId = getParentId();
        String parentId2 = cDSErrorInfo.getParentId();
        if (parentId != null ? !parentId.equals(parentId2) : parentId2 != null) {
            return false;
        }
        String invalidIds = getInvalidIds();
        String invalidIds2 = cDSErrorInfo.getInvalidIds();
        if (invalidIds != null ? !invalidIds.equals(invalidIds2) : invalidIds2 != null) {
            return false;
        }
        String fields = getFields();
        String fields2 = cDSErrorInfo.getFields();
        return fields != null ? fields.equals(fields2) : fields2 == null;
    }

    @Generated
    @Nullable
    public String getFields() {
        return this.fields;
    }

    @Generated
    @Nullable
    public String getInvalidIds() {
        return this.invalidIds;
    }

    @Generated
    @Nullable
    public Integer getLimit() {
        return this.limit;
    }

    @Generated
    @Nullable
    public String getNodeId() {
        return this.nodeId;
    }

    @Generated
    @Nullable
    public String getParentId() {
        return this.parentId;
    }

    @Generated
    public int hashCode() {
        Integer limit = getLimit();
        int hashCode = limit == null ? 43 : limit.hashCode();
        String nodeId = getNodeId();
        int hashCode2 = ((hashCode + 59) * 59) + (nodeId == null ? 43 : nodeId.hashCode());
        String parentId = getParentId();
        int hashCode3 = (hashCode2 * 59) + (parentId == null ? 43 : parentId.hashCode());
        String invalidIds = getInvalidIds();
        int i = hashCode3 * 59;
        int hashCode4 = invalidIds == null ? 43 : invalidIds.hashCode();
        String fields = getFields();
        return ((i + hashCode4) * 59) + (fields != null ? fields.hashCode() : 43);
    }

    @Generated
    public void setFields(@Nullable String str) {
        this.fields = str;
    }

    @Generated
    public void setInvalidIds(@Nullable String str) {
        this.invalidIds = str;
    }

    @Generated
    public void setLimit(@Nullable Integer num) {
        this.limit = num;
    }

    @Generated
    public void setNodeId(@Nullable String str) {
        this.nodeId = str;
    }

    @Generated
    public void setParentId(@Nullable String str) {
        this.parentId = str;
    }

    @Generated
    public String toString() {
        return "CDSErrorInfo(nodeId=" + getNodeId() + ", parentId=" + getParentId() + ", invalidIds=" + getInvalidIds() + ", limit=" + getLimit() + ", fields=" + getFields() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
