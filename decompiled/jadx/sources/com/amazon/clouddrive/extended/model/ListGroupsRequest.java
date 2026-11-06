package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListGroupsRequest implements CloudDriveRequest {
    private String direction;
    private String kindFilter;
    private String kindSet;
    private String lang;
    private Integer maxResults;
    private String nextToken;
    private String privacyLevel;
    private String sort;

    public boolean canEqual(Object obj) {
        return obj instanceof ListGroupsRequest;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof ListGroupsRequest)) {
            return 1;
        }
        ListGroupsRequest listGroupsRequest = (ListGroupsRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getNextToken(), listGroupsRequest.getNextToken());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getMaxResults(), listGroupsRequest.getMaxResults());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getSort(), listGroupsRequest.getSort());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getDirection(), listGroupsRequest.getDirection());
        if (compare4 != 0) {
            return compare4;
        }
        int compare5 = ObjectComparator.compare(getKindFilter(), listGroupsRequest.getKindFilter());
        if (compare5 != 0) {
            return compare5;
        }
        int compare6 = ObjectComparator.compare(getKindSet(), listGroupsRequest.getKindSet());
        if (compare6 != 0) {
            return compare6;
        }
        int compare7 = ObjectComparator.compare(getPrivacyLevel(), listGroupsRequest.getPrivacyLevel());
        if (compare7 != 0) {
            return compare7;
        }
        int compare8 = ObjectComparator.compare(getLang(), listGroupsRequest.getLang());
        if (compare8 != 0) {
            return compare8;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListGroupsRequest)) {
            return false;
        }
        ListGroupsRequest listGroupsRequest = (ListGroupsRequest) obj;
        if (!listGroupsRequest.canEqual(this)) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = listGroupsRequest.getNextToken();
        if (nextToken != null ? !nextToken.equals(nextToken2) : nextToken2 != null) {
            return false;
        }
        Integer maxResults = getMaxResults();
        Integer maxResults2 = listGroupsRequest.getMaxResults();
        if (maxResults != null ? !maxResults.equals(maxResults2) : maxResults2 != null) {
            return false;
        }
        String sort = getSort();
        String sort2 = listGroupsRequest.getSort();
        if (sort != null ? !sort.equals(sort2) : sort2 != null) {
            return false;
        }
        String direction = getDirection();
        String direction2 = listGroupsRequest.getDirection();
        if (direction != null ? !direction.equals(direction2) : direction2 != null) {
            return false;
        }
        String kindFilter = getKindFilter();
        String kindFilter2 = listGroupsRequest.getKindFilter();
        if (kindFilter != null ? !kindFilter.equals(kindFilter2) : kindFilter2 != null) {
            return false;
        }
        String kindSet = getKindSet();
        String kindSet2 = listGroupsRequest.getKindSet();
        if (kindSet != null ? !kindSet.equals(kindSet2) : kindSet2 != null) {
            return false;
        }
        String privacyLevel = getPrivacyLevel();
        String privacyLevel2 = listGroupsRequest.getPrivacyLevel();
        if (privacyLevel != null ? !privacyLevel.equals(privacyLevel2) : privacyLevel2 != null) {
            return false;
        }
        String lang = getLang();
        String lang2 = listGroupsRequest.getLang();
        return lang != null ? lang.equals(lang2) : lang2 == null;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getKindFilter() {
        return this.kindFilter;
    }

    public String getKindSet() {
        return this.kindSet;
    }

    public String getLang() {
        return this.lang;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getPrivacyLevel() {
        return this.privacyLevel;
    }

    public String getSort() {
        return this.sort;
    }

    public int hashCode() {
        String nextToken = getNextToken();
        int hashCode = nextToken == null ? 43 : nextToken.hashCode();
        Integer maxResults = getMaxResults();
        int hashCode2 = ((hashCode + 59) * 59) + (maxResults == null ? 43 : maxResults.hashCode());
        String sort = getSort();
        int hashCode3 = (hashCode2 * 59) + (sort == null ? 43 : sort.hashCode());
        String direction = getDirection();
        int hashCode4 = (hashCode3 * 59) + (direction == null ? 43 : direction.hashCode());
        String kindFilter = getKindFilter();
        int hashCode5 = (hashCode4 * 59) + (kindFilter == null ? 43 : kindFilter.hashCode());
        String kindSet = getKindSet();
        int hashCode6 = (hashCode5 * 59) + (kindSet == null ? 43 : kindSet.hashCode());
        String privacyLevel = getPrivacyLevel();
        int i = hashCode6 * 59;
        int hashCode7 = privacyLevel == null ? 43 : privacyLevel.hashCode();
        String lang = getLang();
        return ((i + hashCode7) * 59) + (lang != null ? lang.hashCode() : 43);
    }

    public void setDirection(String str) {
        this.direction = str;
    }

    public void setKindFilter(String str) {
        this.kindFilter = str;
    }

    public void setKindSet(String str) {
        this.kindSet = str;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setPrivacyLevel(String str) {
        this.privacyLevel = str;
    }

    public void setSort(String str) {
        this.sort = str;
    }

    public String toString() {
        return "ListGroupsRequest(nextToken=" + getNextToken() + ", maxResults=" + getMaxResults() + ", sort=" + getSort() + ", direction=" + getDirection() + ", kindFilter=" + getKindFilter() + ", kindSet=" + getKindSet() + ", privacyLevel=" + getPrivacyLevel() + ", lang=" + getLang() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
