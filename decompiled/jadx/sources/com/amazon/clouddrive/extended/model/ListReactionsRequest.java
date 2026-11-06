package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListReactionsRequest implements CloudDriveRequest {
    private final String direction;
    private final String groupId;
    private final boolean includeCoverPhotos;
    private final String kind;
    private final String kindSet;
    private final Integer maxResults;
    private final String nextToken;
    private final String sort;
    private final String topic;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ListReactionsRequestBuilder {
        private String direction;
        private String groupId;
        private boolean includeCoverPhotos;
        private String kind;
        private String kindSet;
        private Integer maxResults;
        private String nextToken;
        private String sort;
        private String topic;

        public ListReactionsRequest build() {
            return new ListReactionsRequest(this.topic, this.groupId, this.nextToken, this.maxResults, this.sort, this.direction, this.includeCoverPhotos, this.kind, this.kindSet);
        }

        public ListReactionsRequestBuilder direction(String str) {
            this.direction = str;
            return this;
        }

        public ListReactionsRequestBuilder groupId(String str) {
            this.groupId = str;
            return this;
        }

        public ListReactionsRequestBuilder includeCoverPhotos(boolean z) {
            this.includeCoverPhotos = z;
            return this;
        }

        public ListReactionsRequestBuilder kind(String str) {
            this.kind = str;
            return this;
        }

        public ListReactionsRequestBuilder kindSet(String str) {
            this.kindSet = str;
            return this;
        }

        public ListReactionsRequestBuilder maxResults(Integer num) {
            this.maxResults = num;
            return this;
        }

        public ListReactionsRequestBuilder nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public ListReactionsRequestBuilder sort(String str) {
            this.sort = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ListReactionsRequest.ListReactionsRequestBuilder(topic=");
            sb.append(this.topic);
            sb.append(", groupId=");
            sb.append(this.groupId);
            sb.append(", nextToken=");
            sb.append(this.nextToken);
            sb.append(", maxResults=");
            sb.append(this.maxResults);
            sb.append(", sort=");
            sb.append(this.sort);
            sb.append(", direction=");
            sb.append(this.direction);
            sb.append(", includeCoverPhotos=");
            sb.append(this.includeCoverPhotos);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", kindSet=");
            return a$$ExternalSyntheticOutline0.m(sb, this.kindSet, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public ListReactionsRequestBuilder topic(String str) {
            this.topic = str;
            return this;
        }
    }

    public ListReactionsRequest(String str, String str2, String str3, Integer num, String str4, String str5, boolean z, String str6, String str7) {
        this.topic = str;
        this.groupId = str2;
        this.nextToken = str3;
        this.maxResults = num;
        this.sort = str4;
        this.direction = str5;
        this.includeCoverPhotos = z;
        this.kind = str6;
        this.kindSet = str7;
    }

    public static ListReactionsRequestBuilder builder() {
        return new ListReactionsRequestBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ListReactionsRequest;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest instanceof ListReactionsRequest) {
            return cloudDriveRequest.hashCode() - hashCode();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListReactionsRequest)) {
            return false;
        }
        ListReactionsRequest listReactionsRequest = (ListReactionsRequest) obj;
        if (!listReactionsRequest.canEqual(this)) {
            return false;
        }
        String topic = getTopic();
        String topic2 = listReactionsRequest.getTopic();
        if (topic != null ? !topic.equals(topic2) : topic2 != null) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = listReactionsRequest.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = listReactionsRequest.getNextToken();
        if (nextToken != null ? !nextToken.equals(nextToken2) : nextToken2 != null) {
            return false;
        }
        Integer maxResults = getMaxResults();
        Integer maxResults2 = listReactionsRequest.getMaxResults();
        if (maxResults != null ? !maxResults.equals(maxResults2) : maxResults2 != null) {
            return false;
        }
        String sort = getSort();
        String sort2 = listReactionsRequest.getSort();
        if (sort != null ? !sort.equals(sort2) : sort2 != null) {
            return false;
        }
        String direction = getDirection();
        String direction2 = listReactionsRequest.getDirection();
        if (direction != null ? !direction.equals(direction2) : direction2 != null) {
            return false;
        }
        if (isIncludeCoverPhotos() != listReactionsRequest.isIncludeCoverPhotos()) {
            return false;
        }
        String kind = getKind();
        String kind2 = listReactionsRequest.getKind();
        if (kind != null ? !kind.equals(kind2) : kind2 != null) {
            return false;
        }
        String kindSet = getKindSet();
        String kindSet2 = listReactionsRequest.getKindSet();
        return kindSet != null ? kindSet.equals(kindSet2) : kindSet2 == null;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getKind() {
        return this.kind;
    }

    public String getKindSet() {
        return this.kindSet;
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

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        String topic = getTopic();
        int hashCode = topic == null ? 43 : topic.hashCode();
        String groupId = getGroupId();
        int hashCode2 = ((hashCode + 59) * 59) + (groupId == null ? 43 : groupId.hashCode());
        String nextToken = getNextToken();
        int hashCode3 = (hashCode2 * 59) + (nextToken == null ? 43 : nextToken.hashCode());
        Integer maxResults = getMaxResults();
        int hashCode4 = (hashCode3 * 59) + (maxResults == null ? 43 : maxResults.hashCode());
        String sort = getSort();
        int hashCode5 = (hashCode4 * 59) + (sort == null ? 43 : sort.hashCode());
        String direction = getDirection();
        int hashCode6 = (((hashCode5 * 59) + (direction == null ? 43 : direction.hashCode())) * 59) + (isIncludeCoverPhotos() ? 79 : 97);
        String kind = getKind();
        int i = hashCode6 * 59;
        int hashCode7 = kind == null ? 43 : kind.hashCode();
        String kindSet = getKindSet();
        return ((i + hashCode7) * 59) + (kindSet != null ? kindSet.hashCode() : 43);
    }

    public boolean isIncludeCoverPhotos() {
        return this.includeCoverPhotos;
    }

    public String toString() {
        return "ListReactionsRequest(topic=" + getTopic() + ", groupId=" + getGroupId() + ", nextToken=" + getNextToken() + ", maxResults=" + getMaxResults() + ", sort=" + getSort() + ", direction=" + getDirection() + ", includeCoverPhotos=" + isIncludeCoverPhotos() + ", kind=" + getKind() + ", kindSet=" + getKindSet() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
