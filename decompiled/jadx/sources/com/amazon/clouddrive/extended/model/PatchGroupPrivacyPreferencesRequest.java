package com.amazon.clouddrive.extended.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PatchGroupPrivacyPreferencesRequest implements CloudDriveRequest {
    private final String groupId;
    private String lang;
    private final List<GroupPreferenceSetUpdate> preferenceSets;

    public PatchGroupPrivacyPreferencesRequest(String str, List<GroupPreferenceSetUpdate> list, String str2) {
        this.groupId = str;
        this.preferenceSets = list;
        this.lang = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this || !(cloudDriveRequest instanceof PatchGroupPrivacyPreferencesRequest)) {
            return 0;
        }
        PatchGroupPrivacyPreferencesRequest patchGroupPrivacyPreferencesRequest = (PatchGroupPrivacyPreferencesRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getGroupId(), patchGroupPrivacyPreferencesRequest.getGroupId());
        if (compare != 0) {
            return compare;
        }
        int compareCollections = ObjectComparator.compareCollections(getPreferenceSets(), patchGroupPrivacyPreferencesRequest.getPreferenceSets());
        if (compareCollections != 0) {
            return compareCollections;
        }
        int compare2 = ObjectComparator.compare(getLang(), patchGroupPrivacyPreferencesRequest.getLang());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PatchGroupPrivacyPreferencesRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getLang() {
        return this.lang;
    }

    public List<GroupPreferenceSetUpdate> getPreferenceSets() {
        return this.preferenceSets;
    }

    public int hashCode() {
        return ((((getGroupId() != null ? getGroupId().hashCode() : 0) * 31) + (getPreferenceSets() != null ? getPreferenceSets().hashCode() : 0)) * 31) + (getLang() != null ? getLang().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PatchGroupPrivacyPreferencesRequest{groupId='");
        sb.append(this.groupId);
        sb.append("'preferenceSets=");
        sb.append(this.preferenceSets);
        sb.append("lang=");
        return ArcMode$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_OBJ, this.lang, sb);
    }
}
