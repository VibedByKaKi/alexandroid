package com.amazon.clouddrive.cdasdk.dps.collections;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.dps.common.ExtendedNodeInfo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CollectionContentsResponse {

    @SerializedName("collectionIds")
    @Expose
    private List<String> collectionIds;

    @SerializedName(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)
    @Expose
    private String nextToken;

    @SerializedName("nodes")
    @Expose
    private List<ExtendedNodeInfo> nodes;

    @SerializedName("previousToken")
    @Expose
    private String previousToken;

    @Generated
    public CollectionContentsResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CollectionContentsResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionContentsResponse)) {
            return false;
        }
        CollectionContentsResponse collectionContentsResponse = (CollectionContentsResponse) obj;
        if (!collectionContentsResponse.canEqual(this)) {
            return false;
        }
        List<String> collectionIds = getCollectionIds();
        List<String> collectionIds2 = collectionContentsResponse.getCollectionIds();
        if (collectionIds != null ? !collectionIds.equals(collectionIds2) : collectionIds2 != null) {
            return false;
        }
        List<ExtendedNodeInfo> nodes = getNodes();
        List<ExtendedNodeInfo> nodes2 = collectionContentsResponse.getNodes();
        if (nodes != null ? !nodes.equals(nodes2) : nodes2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = collectionContentsResponse.getNextToken();
        if (nextToken != null ? !nextToken.equals(nextToken2) : nextToken2 != null) {
            return false;
        }
        String previousToken = getPreviousToken();
        String previousToken2 = collectionContentsResponse.getPreviousToken();
        return previousToken != null ? previousToken.equals(previousToken2) : previousToken2 == null;
    }

    @Generated
    public List<String> getCollectionIds() {
        return this.collectionIds;
    }

    @Generated
    public String getNextToken() {
        return this.nextToken;
    }

    @Generated
    public List<ExtendedNodeInfo> getNodes() {
        return this.nodes;
    }

    @Generated
    public String getPreviousToken() {
        return this.previousToken;
    }

    @Generated
    public int hashCode() {
        List<String> collectionIds = getCollectionIds();
        int hashCode = collectionIds == null ? 43 : collectionIds.hashCode();
        List<ExtendedNodeInfo> nodes = getNodes();
        int hashCode2 = ((hashCode + 59) * 59) + (nodes == null ? 43 : nodes.hashCode());
        String nextToken = getNextToken();
        int i = hashCode2 * 59;
        int hashCode3 = nextToken == null ? 43 : nextToken.hashCode();
        String previousToken = getPreviousToken();
        return ((i + hashCode3) * 59) + (previousToken != null ? previousToken.hashCode() : 43);
    }

    @Generated
    public void setCollectionIds(List<String> list) {
        this.collectionIds = list;
    }

    @Generated
    public void setNextToken(String str) {
        this.nextToken = str;
    }

    @Generated
    public void setNodes(List<ExtendedNodeInfo> list) {
        this.nodes = list;
    }

    @Generated
    public void setPreviousToken(String str) {
        this.previousToken = str;
    }

    @Generated
    public String toString() {
        return "CollectionContentsResponse(collectionIds=" + getCollectionIds() + ", nodes=" + getNodes() + ", nextToken=" + getNextToken() + ", previousToken=" + getPreviousToken() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
