package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import defpackage.a$$ExternalSyntheticOutline0;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ListInvitesRequest implements CloudDriveRequest {
    private final String direction;

    @NonNull
    private final String groupId;
    private final String lang;
    private final Integer maxResults;
    private final String nextToken;
    private final String sort;
    private final String state;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ListInvitesRequestBuilder {
        private String direction;
        private String groupId;
        private String lang;
        private Integer maxResults;
        private String nextToken;
        private String sort;
        private String state;

        public ListInvitesRequest build() {
            return new ListInvitesRequest(this.groupId, this.sort, this.direction, this.state, this.nextToken, this.maxResults, this.lang);
        }

        public ListInvitesRequestBuilder direction(String str) {
            this.direction = str;
            return this;
        }

        public ListInvitesRequestBuilder groupId(String str) {
            this.groupId = str;
            return this;
        }

        public ListInvitesRequestBuilder lang(String str) {
            this.lang = str;
            return this;
        }

        public ListInvitesRequestBuilder maxResults(Integer num) {
            this.maxResults = num;
            return this;
        }

        public ListInvitesRequestBuilder nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public ListInvitesRequestBuilder sort(String str) {
            this.sort = str;
            return this;
        }

        public ListInvitesRequestBuilder state(String str) {
            this.state = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ListInvitesRequest.ListInvitesRequestBuilder(groupId=");
            sb.append(this.groupId);
            sb.append(", sort=");
            sb.append(this.sort);
            sb.append(", direction=");
            sb.append(this.direction);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", nextToken=");
            sb.append(this.nextToken);
            sb.append(", maxResults=");
            sb.append(this.maxResults);
            sb.append(", lang=");
            return a$$ExternalSyntheticOutline0.m(sb, this.lang, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public ListInvitesRequest(@NonNull String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("groupId is null");
            throw null;
        }
        this.groupId = str;
        this.sort = str2;
        this.direction = str3;
        this.state = str4;
        this.nextToken = str5;
        this.maxResults = num;
        this.lang = str6;
    }

    public static ListInvitesRequestBuilder builder() {
        return new ListInvitesRequestBuilder();
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof ListInvitesRequest)) {
            return 1;
        }
        ListInvitesRequest listInvitesRequest = (ListInvitesRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getGroupId(), listInvitesRequest.getGroupId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getSort(), listInvitesRequest.getSort());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getDirection(), listInvitesRequest.getDirection());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getState(), listInvitesRequest.getState());
        if (compare4 != 0) {
            return compare4;
        }
        int compare5 = ObjectComparator.compare(getNextToken(), listInvitesRequest.getNextToken());
        if (compare5 != 0) {
            return compare5;
        }
        int compare6 = ObjectComparator.compare(getMaxResults(), listInvitesRequest.getMaxResults());
        if (compare6 != 0) {
            return compare6;
        }
        int compare7 = ObjectComparator.compare(getLang(), listInvitesRequest.getLang());
        if (compare7 != 0) {
            return compare7;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListInvitesRequest)) {
            return false;
        }
        ListInvitesRequest listInvitesRequest = (ListInvitesRequest) obj;
        String groupId = getGroupId();
        String groupId2 = listInvitesRequest.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String sort = getSort();
        String sort2 = listInvitesRequest.getSort();
        if (sort != null ? !sort.equals(sort2) : sort2 != null) {
            return false;
        }
        String direction = getDirection();
        String direction2 = listInvitesRequest.getDirection();
        if (direction != null ? !direction.equals(direction2) : direction2 != null) {
            return false;
        }
        String state = getState();
        String state2 = listInvitesRequest.getState();
        if (state != null ? !state.equals(state2) : state2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = listInvitesRequest.getNextToken();
        if (nextToken != null ? !nextToken.equals(nextToken2) : nextToken2 != null) {
            return false;
        }
        Integer maxResults = getMaxResults();
        Integer maxResults2 = listInvitesRequest.getMaxResults();
        if (maxResults != null ? !maxResults.equals(maxResults2) : maxResults2 != null) {
            return false;
        }
        String lang = getLang();
        String lang2 = listInvitesRequest.getLang();
        return lang != null ? lang.equals(lang2) : lang2 == null;
    }

    public String getDirection() {
        return this.direction;
    }

    @NonNull
    public String getGroupId() {
        return this.groupId;
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

    public String getSort() {
        return this.sort;
    }

    public String getState() {
        return this.state;
    }

    public int hashCode() {
        String groupId = getGroupId();
        int hashCode = groupId == null ? 43 : groupId.hashCode();
        String sort = getSort();
        int hashCode2 = ((hashCode + 59) * 59) + (sort == null ? 43 : sort.hashCode());
        String direction = getDirection();
        int hashCode3 = (hashCode2 * 59) + (direction == null ? 43 : direction.hashCode());
        String state = getState();
        int hashCode4 = (hashCode3 * 59) + (state == null ? 43 : state.hashCode());
        String nextToken = getNextToken();
        int hashCode5 = (hashCode4 * 59) + (nextToken == null ? 43 : nextToken.hashCode());
        Integer maxResults = getMaxResults();
        int i = hashCode5 * 59;
        int hashCode6 = maxResults == null ? 43 : maxResults.hashCode();
        String lang = getLang();
        return ((i + hashCode6) * 59) + (lang != null ? lang.hashCode() : 43);
    }

    public String toString() {
        return "ListInvitesRequest(groupId=" + getGroupId() + ", sort=" + getSort() + ", direction=" + getDirection() + ", state=" + getState() + ", nextToken=" + getNextToken() + ", maxResults=" + getMaxResults() + ", lang=" + getLang() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
