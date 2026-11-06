package com.amazon.clouddrive.cdasdk.prompto.collections;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListGroupCollectionsResponse extends PromptoServicePaginatedResponse {

    @SerializedName("collections")
    @Expose
    private List<GroupCollectionResponse> collections;

    @Generated
    public ListGroupCollectionsResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListGroupCollectionsResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListGroupCollectionsResponse)) {
            return false;
        }
        ListGroupCollectionsResponse listGroupCollectionsResponse = (ListGroupCollectionsResponse) obj;
        if (!listGroupCollectionsResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<GroupCollectionResponse> collections = getCollections();
        List<GroupCollectionResponse> collections2 = listGroupCollectionsResponse.getCollections();
        return collections != null ? collections.equals(collections2) : collections2 == null;
    }

    @Generated
    public List<GroupCollectionResponse> getCollections() {
        return this.collections;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        List<GroupCollectionResponse> collections = getCollections();
        return (hashCode * 59) + (collections == null ? 43 : collections.hashCode());
    }

    @Generated
    public void setCollections(List<GroupCollectionResponse> list) {
        this.collections = list;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedResponse
    @Generated
    public String toString() {
        return "ListGroupCollectionsResponse(collections=" + getCollections() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
