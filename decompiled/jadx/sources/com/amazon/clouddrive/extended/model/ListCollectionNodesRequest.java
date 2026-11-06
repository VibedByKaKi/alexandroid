package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListCollectionNodesRequest implements CloudDriveRequest {
    private String collectionId;
    private String direction;
    private String groupId;
    private Integer maxResults;
    private String nextToken;
    private String sort;

    public boolean canEqual(Object obj) {
        return obj instanceof ListCollectionNodesRequest;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest instanceof ListCollectionNodesRequest) {
            return cloudDriveRequest.hashCode() - hashCode();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListCollectionNodesRequest)) {
            return false;
        }
        ListCollectionNodesRequest listCollectionNodesRequest = (ListCollectionNodesRequest) obj;
        if (!listCollectionNodesRequest.canEqual(this)) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = listCollectionNodesRequest.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String collectionId = getCollectionId();
        String collectionId2 = listCollectionNodesRequest.getCollectionId();
        if (collectionId != null ? !collectionId.equals(collectionId2) : collectionId2 != null) {
            return false;
        }
        String sort = getSort();
        String sort2 = listCollectionNodesRequest.getSort();
        if (sort != null ? !sort.equals(sort2) : sort2 != null) {
            return false;
        }
        String direction = getDirection();
        String direction2 = listCollectionNodesRequest.getDirection();
        if (direction != null ? !direction.equals(direction2) : direction2 != null) {
            return false;
        }
        Integer maxResults = getMaxResults();
        Integer maxResults2 = listCollectionNodesRequest.getMaxResults();
        if (maxResults != null ? !maxResults.equals(maxResults2) : maxResults2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = listCollectionNodesRequest.getNextToken();
        return nextToken != null ? nextToken.equals(nextToken2) : nextToken2 == null;
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getSort() {
        return this.sort;
    }

    public int hashCode() {
        String groupId = getGroupId();
        int hashCode = groupId == null ? 43 : groupId.hashCode();
        String collectionId = getCollectionId();
        int hashCode2 = ((hashCode + 59) * 59) + (collectionId == null ? 43 : collectionId.hashCode());
        String sort = getSort();
        int hashCode3 = (hashCode2 * 59) + (sort == null ? 43 : sort.hashCode());
        String direction = getDirection();
        int hashCode4 = (hashCode3 * 59) + (direction == null ? 43 : direction.hashCode());
        Integer maxResults = getMaxResults();
        int i = hashCode4 * 59;
        int hashCode5 = maxResults == null ? 43 : maxResults.hashCode();
        String nextToken = getNextToken();
        return ((i + hashCode5) * 59) + (nextToken != null ? nextToken.hashCode() : 43);
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setDirection(String str) {
        this.direction = str;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSort(String str) {
        this.sort = str;
    }

    public String toString() {
        return "ListCollectionNodesRequest(groupId=" + getGroupId() + ", collectionId=" + getCollectionId() + ", sort=" + getSort() + ", direction=" + getDirection() + ", maxResults=" + getMaxResults() + ", nextToken=" + getNextToken() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
