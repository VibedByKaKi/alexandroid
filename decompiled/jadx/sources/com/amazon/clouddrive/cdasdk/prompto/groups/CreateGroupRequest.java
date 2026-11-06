package com.amazon.clouddrive.cdasdk.prompto.groups;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateGroupRequest extends PromptoServiceCustomerRequest {

    @SerializedName(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME)
    @Expose
    private String kind;

    @SerializedName("name")
    @Expose
    private String name;

    @Generated
    public CreateGroupRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CreateGroupRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateGroupRequest)) {
            return false;
        }
        CreateGroupRequest createGroupRequest = (CreateGroupRequest) obj;
        if (!createGroupRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String name = getName();
        String name2 = createGroupRequest.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String kind = getKind();
        String kind2 = createGroupRequest.getKind();
        return kind != null ? kind.equals(kind2) : kind2 == null;
    }

    @Generated
    public String getKind() {
        return this.kind;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String name = getName();
        int i = hashCode * 59;
        int hashCode2 = name == null ? 43 : name.hashCode();
        String kind = getKind();
        return ((i + hashCode2) * 59) + (kind != null ? kind.hashCode() : 43);
    }

    @Generated
    public void setKind(String str) {
        this.kind = str;
    }

    @Generated
    public void setName(String str) {
        this.name = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public String toString() {
        return "CreateGroupRequest(name=" + getName() + ", kind=" + getKind() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
