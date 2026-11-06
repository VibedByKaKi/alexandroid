package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListMembersRequest implements CloudDriveRequest {
    private SortDirection direction;
    private String groupId;
    private Integer maxResults;
    private String nextToken;
    private SortType sort;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SortDirection {
        ASC,
        DESC
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SortType {
        CREATEDDATE,
        MODIFIEDDATE,
        NAME,
        LASTVIEWEDDATE
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof ListMembersRequest)) {
            return 1;
        }
        ListMembersRequest listMembersRequest = (ListMembersRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getNextToken(), listMembersRequest.getNextToken());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getMaxResults(), listMembersRequest.getMaxResults());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getGroupId(), listMembersRequest.getGroupId());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getSort(), listMembersRequest.getSort());
        if (compare4 != 0) {
            return compare4;
        }
        int compare5 = ObjectComparator.compare(getDirection(), listMembersRequest.getDirection());
        if (compare5 != 0) {
            return compare5;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListMembersRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public SortDirection getDirection() {
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

    public SortType getSort() {
        return this.sort;
    }

    public int hashCode() {
        return (((getNextToken() == null ? 0 : getNextToken().hashCode()) + 1 + (getMaxResults() == null ? 0 : getMaxResults().hashCode()) + (getGroupId() == null ? 0 : getGroupId().hashCode()) + (getSort() == null ? 0 : getSort().hashCode()) + (getDirection() != null ? getDirection().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setDirection(SortDirection sortDirection) {
        this.direction = sortDirection;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setMaxResults(int i) {
        this.maxResults = Integer.valueOf(i);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSort(SortType sortType) {
        this.sort = sortType;
    }

    public ListMembersRequest withASCSort() {
        setDirection(SortDirection.ASC);
        return this;
    }

    public ListMembersRequest withCreatedDateSort() {
        setSort(SortType.CREATEDDATE);
        return this;
    }

    public ListMembersRequest withDESCSort() {
        setDirection(SortDirection.DESC);
        return this;
    }

    public ListMembersRequest withGroupId(String str) {
        setGroupId(str);
        return this;
    }

    public ListMembersRequest withLastViewedDateSort() {
        setSort(SortType.LASTVIEWEDDATE);
        return this;
    }

    public ListMembersRequest withMaxResults(int i) {
        setMaxResults(i);
        return this;
    }

    public ListMembersRequest withModifiedDateSort() {
        setSort(SortType.MODIFIEDDATE);
        return this;
    }

    public ListMembersRequest withNameSort() {
        setSort(SortType.NAME);
        return this;
    }

    public ListMembersRequest withNextToken(String str) {
        setNextToken(str);
        return this;
    }
}
