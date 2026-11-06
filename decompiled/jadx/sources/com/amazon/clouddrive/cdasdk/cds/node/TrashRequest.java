package com.amazon.clouddrive.cdasdk.cds.node;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.DedupeContext;
import com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TrashRequest extends VersionedNodeRequest {

    @SerializedName("dedupeContext")
    @Expose
    private DedupeContext dedupeContext;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY)
    @Expose
    private String ownerId;

    @SerializedName("recurse")
    @Expose
    private Boolean recurse;

    public TrashRequest(@NonNull String str, @NonNull String str2, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("id is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("ownerId is marked non-null but is null");
            throw null;
        }
        this.id = str;
        this.ownerId = str2;
        this.recurse = Boolean.valueOf(z);
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof TrashRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrashRequest)) {
            return false;
        }
        TrashRequest trashRequest = (TrashRequest) obj;
        if (!trashRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Boolean recurse = getRecurse();
        Boolean recurse2 = trashRequest.getRecurse();
        if (recurse != null ? !recurse.equals(recurse2) : recurse2 != null) {
            return false;
        }
        String id = getId();
        String id2 = trashRequest.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        DedupeContext dedupeContext = getDedupeContext();
        DedupeContext dedupeContext2 = trashRequest.getDedupeContext();
        if (dedupeContext != null ? !dedupeContext.equals(dedupeContext2) : dedupeContext2 != null) {
            return false;
        }
        String ownerId = getOwnerId();
        String ownerId2 = trashRequest.getOwnerId();
        return ownerId != null ? ownerId.equals(ownerId2) : ownerId2 == null;
    }

    @Generated
    public DedupeContext getDedupeContext() {
        return this.dedupeContext;
    }

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public String getOwnerId() {
        return this.ownerId;
    }

    @Generated
    public Boolean getRecurse() {
        return this.recurse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Boolean recurse = getRecurse();
        int hashCode2 = (hashCode * 59) + (recurse == null ? 43 : recurse.hashCode());
        String id = getId();
        int hashCode3 = (hashCode2 * 59) + (id == null ? 43 : id.hashCode());
        DedupeContext dedupeContext = getDedupeContext();
        int i = hashCode3 * 59;
        int hashCode4 = dedupeContext == null ? 43 : dedupeContext.hashCode();
        String ownerId = getOwnerId();
        return ((i + hashCode4) * 59) + (ownerId != null ? ownerId.hashCode() : 43);
    }

    @Generated
    public void setDedupeContext(DedupeContext dedupeContext) {
        this.dedupeContext = dedupeContext;
    }

    @Generated
    public void setId(String str) {
        this.id = str;
    }

    @Generated
    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    @Generated
    public void setRecurse(Boolean bool) {
        this.recurse = bool;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "TrashRequest(id=" + getId() + ", recurse=" + getRecurse() + ", dedupeContext=" + getDedupeContext() + ", ownerId=" + getOwnerId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
