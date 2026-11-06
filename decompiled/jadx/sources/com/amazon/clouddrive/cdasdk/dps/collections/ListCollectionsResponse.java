package com.amazon.clouddrive.cdasdk.dps.collections;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListCollectionsResponse {

    @SerializedName("collections")
    @Expose
    private List<CollectionsResponse> collections;

    @SerializedName(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)
    @Expose
    private String nextToken;

    @Generated
    public ListCollectionsResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListCollectionsResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListCollectionsResponse)) {
            return false;
        }
        ListCollectionsResponse listCollectionsResponse = (ListCollectionsResponse) obj;
        if (!listCollectionsResponse.canEqual(this)) {
            return false;
        }
        List<CollectionsResponse> collections = getCollections();
        List<CollectionsResponse> collections2 = listCollectionsResponse.getCollections();
        if (collections != null ? !collections.equals(collections2) : collections2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = listCollectionsResponse.getNextToken();
        return nextToken != null ? nextToken.equals(nextToken2) : nextToken2 == null;
    }

    @Generated
    public List<CollectionsResponse> getCollections() {
        return this.collections;
    }

    @Generated
    public String getNextToken() {
        return this.nextToken;
    }

    @Generated
    public int hashCode() {
        List<CollectionsResponse> collections = getCollections();
        int hashCode = collections == null ? 43 : collections.hashCode();
        String nextToken = getNextToken();
        return ((hashCode + 59) * 59) + (nextToken != null ? nextToken.hashCode() : 43);
    }

    @Generated
    public void setCollections(List<CollectionsResponse> list) {
        this.collections = list;
    }

    @Generated
    public void setNextToken(String str) {
        this.nextToken = str;
    }

    @Generated
    public String toString() {
        return "ListCollectionsResponse(collections=" + getCollections() + ", nextToken=" + getNextToken() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
