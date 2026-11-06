package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveResponse;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListCollectionNodesResponse implements CloudDriveResponse {
    private Long count;
    private List<GroupNode> groupNodes;
    private String nextToken;

    public boolean canEqual(Object obj) {
        return obj instanceof ListCollectionNodesResponse;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse instanceof ListCollectionNodesResponse) {
            return cloudDriveResponse.hashCode() - hashCode();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListCollectionNodesResponse)) {
            return false;
        }
        ListCollectionNodesResponse listCollectionNodesResponse = (ListCollectionNodesResponse) obj;
        if (!listCollectionNodesResponse.canEqual(this)) {
            return false;
        }
        List<GroupNode> groupNodes = getGroupNodes();
        List<GroupNode> groupNodes2 = listCollectionNodesResponse.getGroupNodes();
        if (groupNodes != null ? !groupNodes.equals(groupNodes2) : groupNodes2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = listCollectionNodesResponse.getNextToken();
        if (nextToken != null ? !nextToken.equals(nextToken2) : nextToken2 != null) {
            return false;
        }
        Long count = getCount();
        Long count2 = listCollectionNodesResponse.getCount();
        return count != null ? count.equals(count2) : count2 == null;
    }

    public Long getCount() {
        return this.count;
    }

    public List<GroupNode> getGroupNodes() {
        return this.groupNodes;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        List<GroupNode> groupNodes = getGroupNodes();
        int hashCode = groupNodes == null ? 43 : groupNodes.hashCode();
        String nextToken = getNextToken();
        int i = (hashCode + 59) * 59;
        int hashCode2 = nextToken == null ? 43 : nextToken.hashCode();
        Long count = getCount();
        return ((i + hashCode2) * 59) + (count != null ? count.hashCode() : 43);
    }

    public void setCount(Long l) {
        this.count = l;
    }

    public void setGroupNodes(List<GroupNode> list) {
        this.groupNodes = list;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        return "ListCollectionNodesResponse(groupNodes=" + getGroupNodes() + ", nextToken=" + getNextToken() + ", count=" + getCount() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
