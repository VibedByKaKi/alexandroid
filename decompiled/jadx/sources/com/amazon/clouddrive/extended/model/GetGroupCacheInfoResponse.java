package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetGroupCacheInfoResponse implements CloudDriveResponse {
    private String contentVersion;
    private String version;
    private String viewedStateVersion;

    public boolean canEqual(Object obj) {
        return obj instanceof GetGroupCacheInfoResponse;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse instanceof GetGroupCacheInfoResponse) {
            return cloudDriveResponse.hashCode() - hashCode();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetGroupCacheInfoResponse)) {
            return false;
        }
        GetGroupCacheInfoResponse getGroupCacheInfoResponse = (GetGroupCacheInfoResponse) obj;
        if (!getGroupCacheInfoResponse.canEqual(this)) {
            return false;
        }
        String version = getVersion();
        String version2 = getGroupCacheInfoResponse.getVersion();
        if (version != null ? !version.equals(version2) : version2 != null) {
            return false;
        }
        String contentVersion = getContentVersion();
        String contentVersion2 = getGroupCacheInfoResponse.getContentVersion();
        if (contentVersion != null ? !contentVersion.equals(contentVersion2) : contentVersion2 != null) {
            return false;
        }
        String viewedStateVersion = getViewedStateVersion();
        String viewedStateVersion2 = getGroupCacheInfoResponse.getViewedStateVersion();
        return viewedStateVersion != null ? viewedStateVersion.equals(viewedStateVersion2) : viewedStateVersion2 == null;
    }

    public String getContentVersion() {
        return this.contentVersion;
    }

    public String getVersion() {
        return this.version;
    }

    public String getViewedStateVersion() {
        return this.viewedStateVersion;
    }

    public int hashCode() {
        String version = getVersion();
        int hashCode = version == null ? 43 : version.hashCode();
        String contentVersion = getContentVersion();
        int i = (hashCode + 59) * 59;
        int hashCode2 = contentVersion == null ? 43 : contentVersion.hashCode();
        String viewedStateVersion = getViewedStateVersion();
        return ((i + hashCode2) * 59) + (viewedStateVersion != null ? viewedStateVersion.hashCode() : 43);
    }

    public void setContentVersion(String str) {
        this.contentVersion = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setViewedStateVersion(String str) {
        this.viewedStateVersion = str;
    }

    public String toString() {
        return "GetGroupCacheInfoResponse(version=" + getVersion() + ", contentVersion=" + getContentVersion() + ", viewedStateVersion=" + getViewedStateVersion() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
