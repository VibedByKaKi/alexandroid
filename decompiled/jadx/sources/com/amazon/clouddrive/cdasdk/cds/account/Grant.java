package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Grant {

    @SerializedName("grantId")
    @Expose
    private String grantId;

    @SerializedName("grantStorage")
    @Expose
    private Long grantStorage;

    @SerializedName("isStackable")
    @Expose
    private Boolean isStackable;

    @Generated
    public Grant() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Grant;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Grant)) {
            return false;
        }
        Grant grant = (Grant) obj;
        if (!grant.canEqual(this)) {
            return false;
        }
        Long grantStorage = getGrantStorage();
        Long grantStorage2 = grant.getGrantStorage();
        if (grantStorage != null ? !grantStorage.equals(grantStorage2) : grantStorage2 != null) {
            return false;
        }
        Boolean isStackable = getIsStackable();
        Boolean isStackable2 = grant.getIsStackable();
        if (isStackable != null ? !isStackable.equals(isStackable2) : isStackable2 != null) {
            return false;
        }
        String grantId = getGrantId();
        String grantId2 = grant.getGrantId();
        return grantId != null ? grantId.equals(grantId2) : grantId2 == null;
    }

    @Generated
    public String getGrantId() {
        return this.grantId;
    }

    @Generated
    public Long getGrantStorage() {
        return this.grantStorage;
    }

    @Generated
    public Boolean getIsStackable() {
        return this.isStackable;
    }

    @Generated
    public int hashCode() {
        Long grantStorage = getGrantStorage();
        int hashCode = grantStorage == null ? 43 : grantStorage.hashCode();
        Boolean isStackable = getIsStackable();
        int i = (hashCode + 59) * 59;
        int hashCode2 = isStackable == null ? 43 : isStackable.hashCode();
        String grantId = getGrantId();
        return ((i + hashCode2) * 59) + (grantId != null ? grantId.hashCode() : 43);
    }

    @Generated
    public void setGrantId(String str) {
        this.grantId = str;
    }

    @Generated
    public void setGrantStorage(Long l) {
        this.grantStorage = l;
    }

    @Generated
    public void setIsStackable(Boolean bool) {
        this.isStackable = bool;
    }

    @Generated
    public String toString() {
        return "Grant(grantId=" + getGrantId() + ", grantStorage=" + getGrantStorage() + ", isStackable=" + getIsStackable() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
