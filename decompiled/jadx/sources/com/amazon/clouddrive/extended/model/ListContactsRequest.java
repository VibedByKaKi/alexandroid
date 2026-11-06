package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ListContactsRequest implements CloudDriveRequest {
    private final String groupFilter;
    private final Kind kindFilter;
    private final Integer maxResults;
    private final String memberFilter;
    private final String nextToken;
    private final String term;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Kind {
        GROUP,
        PERSON
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ListContactsRequestBuilder {
        private String groupFilter;
        private Kind kindFilter;
        private Integer maxResults;
        private String memberFilter;
        private String nextToken;
        private String term;

        public ListContactsRequest build() {
            return new ListContactsRequest(this.kindFilter, this.memberFilter, this.groupFilter, this.nextToken, this.maxResults, this.term);
        }

        public ListContactsRequestBuilder groupFilter(String str) {
            this.groupFilter = str;
            return this;
        }

        public ListContactsRequestBuilder kindFilter(Kind kind) {
            this.kindFilter = kind;
            return this;
        }

        public ListContactsRequestBuilder maxResults(Integer num) {
            this.maxResults = num;
            return this;
        }

        public ListContactsRequestBuilder memberFilter(String str) {
            this.memberFilter = str;
            return this;
        }

        public ListContactsRequestBuilder nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public ListContactsRequestBuilder term(String str) {
            this.term = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ListContactsRequest.ListContactsRequestBuilder(kindFilter=");
            sb.append(this.kindFilter);
            sb.append(", memberFilter=");
            sb.append(this.memberFilter);
            sb.append(", groupFilter=");
            sb.append(this.groupFilter);
            sb.append(", nextToken=");
            sb.append(this.nextToken);
            sb.append(", maxResults=");
            sb.append(this.maxResults);
            sb.append(", term=");
            return a$$ExternalSyntheticOutline0.m(sb, this.term, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public ListContactsRequest(Kind kind, String str, String str2, String str3, Integer num, String str4) {
        this.kindFilter = kind;
        this.memberFilter = str;
        this.groupFilter = str2;
        this.nextToken = str3;
        this.maxResults = num;
        this.term = str4;
    }

    public static ListContactsRequestBuilder builder() {
        return new ListContactsRequestBuilder();
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof ListContactsRequest)) {
            return ListContactsRequest.class.getName().compareTo(cloudDriveRequest.getClass().getName());
        }
        ListContactsRequest listContactsRequest = (ListContactsRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getGroupFilter(), listContactsRequest.getGroupFilter());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getKindFilter(), listContactsRequest.getKindFilter());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getMaxResults(), listContactsRequest.getMaxResults());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getMemberFilter(), listContactsRequest.getMemberFilter());
        if (compare4 != 0) {
            return compare4;
        }
        int compare5 = ObjectComparator.compare(getNextToken(), listContactsRequest.getNextToken());
        if (compare5 != 0) {
            return compare5;
        }
        int compare6 = ObjectComparator.compare(getTerm(), listContactsRequest.getTerm());
        if (compare6 != 0) {
            return compare6;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListContactsRequest)) {
            return false;
        }
        ListContactsRequest listContactsRequest = (ListContactsRequest) obj;
        Kind kindFilter = getKindFilter();
        Kind kindFilter2 = listContactsRequest.getKindFilter();
        if (kindFilter != null ? !kindFilter.equals(kindFilter2) : kindFilter2 != null) {
            return false;
        }
        String memberFilter = getMemberFilter();
        String memberFilter2 = listContactsRequest.getMemberFilter();
        if (memberFilter != null ? !memberFilter.equals(memberFilter2) : memberFilter2 != null) {
            return false;
        }
        String groupFilter = getGroupFilter();
        String groupFilter2 = listContactsRequest.getGroupFilter();
        if (groupFilter != null ? !groupFilter.equals(groupFilter2) : groupFilter2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = listContactsRequest.getNextToken();
        if (nextToken != null ? !nextToken.equals(nextToken2) : nextToken2 != null) {
            return false;
        }
        Integer maxResults = getMaxResults();
        Integer maxResults2 = listContactsRequest.getMaxResults();
        if (maxResults != null ? !maxResults.equals(maxResults2) : maxResults2 != null) {
            return false;
        }
        String term = getTerm();
        String term2 = listContactsRequest.getTerm();
        return term != null ? term.equals(term2) : term2 == null;
    }

    public String getGroupFilter() {
        return this.groupFilter;
    }

    public Kind getKindFilter() {
        return this.kindFilter;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getMemberFilter() {
        return this.memberFilter;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getTerm() {
        return this.term;
    }

    public int hashCode() {
        Kind kindFilter = getKindFilter();
        int hashCode = kindFilter == null ? 43 : kindFilter.hashCode();
        String memberFilter = getMemberFilter();
        int hashCode2 = ((hashCode + 59) * 59) + (memberFilter == null ? 43 : memberFilter.hashCode());
        String groupFilter = getGroupFilter();
        int hashCode3 = (hashCode2 * 59) + (groupFilter == null ? 43 : groupFilter.hashCode());
        String nextToken = getNextToken();
        int hashCode4 = (hashCode3 * 59) + (nextToken == null ? 43 : nextToken.hashCode());
        Integer maxResults = getMaxResults();
        int i = hashCode4 * 59;
        int hashCode5 = maxResults == null ? 43 : maxResults.hashCode();
        String term = getTerm();
        return ((i + hashCode5) * 59) + (term != null ? term.hashCode() : 43);
    }

    public String toString() {
        return "ListContactsRequest(kindFilter=" + getKindFilter() + ", memberFilter=" + getMemberFilter() + ", groupFilter=" + getGroupFilter() + ", nextToken=" + getNextToken() + ", maxResults=" + getMaxResults() + ", term=" + getTerm() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
