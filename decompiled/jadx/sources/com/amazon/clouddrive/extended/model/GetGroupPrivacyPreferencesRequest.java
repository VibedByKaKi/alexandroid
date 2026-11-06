package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GetGroupPrivacyPreferencesRequest implements CloudDriveRequest {
    private final String groupId;
    private final String lang;
    private final String preferenceLevel;

    public GetGroupPrivacyPreferencesRequest(String str, String str2, String str3) {
        this.groupId = str;
        this.lang = str2;
        this.preferenceLevel = str3;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this || !(cloudDriveRequest instanceof GetGroupPrivacyPreferencesRequest)) {
            return 0;
        }
        GetGroupPrivacyPreferencesRequest getGroupPrivacyPreferencesRequest = (GetGroupPrivacyPreferencesRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getGroupId(), getGroupPrivacyPreferencesRequest.getGroupId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getLang(), getGroupPrivacyPreferencesRequest.getLang());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getPreferenceLevel(), getGroupPrivacyPreferencesRequest.getPreferenceLevel());
        if (compare3 != 0) {
            return compare3;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetGroupPrivacyPreferencesRequest)) {
            return false;
        }
        GetGroupPrivacyPreferencesRequest getGroupPrivacyPreferencesRequest = (GetGroupPrivacyPreferencesRequest) obj;
        String groupId = getGroupId();
        String groupId2 = getGroupPrivacyPreferencesRequest.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String lang = getLang();
        String lang2 = getGroupPrivacyPreferencesRequest.getLang();
        if (lang != null ? !lang.equals(lang2) : lang2 != null) {
            return false;
        }
        String preferenceLevel = getPreferenceLevel();
        String preferenceLevel2 = getGroupPrivacyPreferencesRequest.getPreferenceLevel();
        return preferenceLevel != null ? preferenceLevel.equals(preferenceLevel2) : preferenceLevel2 == null;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getLang() {
        return this.lang;
    }

    public String getPreferenceLevel() {
        return this.preferenceLevel;
    }

    public int hashCode() {
        String groupId = getGroupId();
        int hashCode = groupId == null ? 43 : groupId.hashCode();
        String lang = getLang();
        int i = (hashCode + 59) * 59;
        int hashCode2 = lang == null ? 43 : lang.hashCode();
        String preferenceLevel = getPreferenceLevel();
        return ((i + hashCode2) * 59) + (preferenceLevel != null ? preferenceLevel.hashCode() : 43);
    }

    public String toString() {
        return "GetGroupPrivacyPreferencesRequest(groupId=" + getGroupId() + ", lang=" + getLang() + ", preferenceLevel=" + getPreferenceLevel() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
