package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GetGroupShareInfoRequest implements CloudDriveRequest {
    private final String lang;
    private final String shareToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetGroupShareInfoRequestBuilder {
        private String lang;
        private String shareToken;

        public GetGroupShareInfoRequest build() {
            return new GetGroupShareInfoRequest(this.shareToken, this.lang);
        }

        public GetGroupShareInfoRequestBuilder lang(String str) {
            this.lang = str;
            return this;
        }

        public GetGroupShareInfoRequestBuilder shareToken(String str) {
            this.shareToken = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GetGroupShareInfoRequest.GetGroupShareInfoRequestBuilder(shareToken=");
            sb.append(this.shareToken);
            sb.append(", lang=");
            return a$$ExternalSyntheticOutline0.m(sb, this.lang, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public GetGroupShareInfoRequest(String str, String str2) {
        this.shareToken = str;
        this.lang = str2;
    }

    public static GetGroupShareInfoRequestBuilder builder() {
        return new GetGroupShareInfoRequestBuilder();
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof GetGroupShareInfoRequest)) {
            return GetGroupShareInfoRequest.class.getName().compareTo(cloudDriveRequest.getClass().getName());
        }
        GetGroupShareInfoRequest getGroupShareInfoRequest = (GetGroupShareInfoRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getShareToken(), getGroupShareInfoRequest.getShareToken());
        return compare != 0 ? compare : ObjectComparator.compare(getLang(), getGroupShareInfoRequest.getLang());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetGroupShareInfoRequest)) {
            return false;
        }
        GetGroupShareInfoRequest getGroupShareInfoRequest = (GetGroupShareInfoRequest) obj;
        String shareToken = getShareToken();
        String shareToken2 = getGroupShareInfoRequest.getShareToken();
        if (shareToken != null ? !shareToken.equals(shareToken2) : shareToken2 != null) {
            return false;
        }
        String lang = getLang();
        String lang2 = getGroupShareInfoRequest.getLang();
        return lang != null ? lang.equals(lang2) : lang2 == null;
    }

    public String getLang() {
        return this.lang;
    }

    public String getShareToken() {
        return this.shareToken;
    }

    public int hashCode() {
        String shareToken = getShareToken();
        int hashCode = shareToken == null ? 43 : shareToken.hashCode();
        String lang = getLang();
        return ((hashCode + 59) * 59) + (lang != null ? lang.hashCode() : 43);
    }

    public String toString() {
        return "GetGroupShareInfoRequest(shareToken=" + getShareToken() + ", lang=" + getLang() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
