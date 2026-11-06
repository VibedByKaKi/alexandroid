package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CoverObject {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("isDefault")
    @Expose
    private Boolean isDefault;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY)
    @Expose
    private String ownerId;

    @SerializedName("tempLink")
    @Expose
    private String tempLink;

    @Generated
    public CoverObject() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CoverObject;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoverObject)) {
            return false;
        }
        CoverObject coverObject = (CoverObject) obj;
        if (!coverObject.canEqual(this)) {
            return false;
        }
        Boolean isDefault = getIsDefault();
        Boolean isDefault2 = coverObject.getIsDefault();
        if (isDefault != null ? !isDefault.equals(isDefault2) : isDefault2 != null) {
            return false;
        }
        String id = getId();
        String id2 = coverObject.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String tempLink = getTempLink();
        String tempLink2 = coverObject.getTempLink();
        if (tempLink != null ? !tempLink.equals(tempLink2) : tempLink2 != null) {
            return false;
        }
        String ownerId = getOwnerId();
        String ownerId2 = coverObject.getOwnerId();
        return ownerId != null ? ownerId.equals(ownerId2) : ownerId2 == null;
    }

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    @Generated
    public String getOwnerId() {
        return this.ownerId;
    }

    @Generated
    public String getTempLink() {
        return this.tempLink;
    }

    @Generated
    public int hashCode() {
        Boolean isDefault = getIsDefault();
        int hashCode = isDefault == null ? 43 : isDefault.hashCode();
        String id = getId();
        int hashCode2 = ((hashCode + 59) * 59) + (id == null ? 43 : id.hashCode());
        String tempLink = getTempLink();
        int i = hashCode2 * 59;
        int hashCode3 = tempLink == null ? 43 : tempLink.hashCode();
        String ownerId = getOwnerId();
        return ((i + hashCode3) * 59) + (ownerId != null ? ownerId.hashCode() : 43);
    }

    @Generated
    public void setId(String str) {
        this.id = str;
    }

    @Generated
    public void setIsDefault(Boolean bool) {
        this.isDefault = bool;
    }

    @Generated
    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    @Generated
    public void setTempLink(String str) {
        this.tempLink = str;
    }

    @Generated
    public String toString() {
        return "CoverObject(id=" + getId() + ", tempLink=" + getTempLink() + ", ownerId=" + getOwnerId() + ", isDefault=" + getIsDefault() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
