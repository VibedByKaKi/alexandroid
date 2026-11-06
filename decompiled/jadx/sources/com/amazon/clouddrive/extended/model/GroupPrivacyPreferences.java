package com.amazon.clouddrive.extended.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GroupPrivacyPreferences {
    private final List<GroupPreferenceSet> preferenceSets;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GroupPrivacyPreferencesBuilder {
        private List<GroupPreferenceSet> preferenceSets;

        public GroupPrivacyPreferences build() {
            return new GroupPrivacyPreferences(this.preferenceSets);
        }

        public GroupPrivacyPreferencesBuilder preferenceSets(List<GroupPreferenceSet> list) {
            this.preferenceSets = list;
            return this;
        }

        public String toString() {
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.preferenceSets, new StringBuilder("GroupPrivacyPreferences.GroupPrivacyPreferencesBuilder(preferenceSets="));
        }
    }

    public GroupPrivacyPreferences(List<GroupPreferenceSet> list) {
        this.preferenceSets = list;
    }

    public static GroupPrivacyPreferencesBuilder builder() {
        return new GroupPrivacyPreferencesBuilder();
    }

    public int compareTo(Object obj) {
        if (this == obj) {
            return 0;
        }
        if (obj != null && (obj instanceof GroupPrivacyPreferences)) {
            return ObjectComparator.compare(getPreferenceSets(), ((GroupPrivacyPreferences) obj).getPreferenceSets());
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupPrivacyPreferences)) {
            return false;
        }
        List<GroupPreferenceSet> preferenceSets = getPreferenceSets();
        List<GroupPreferenceSet> preferenceSets2 = ((GroupPrivacyPreferences) obj).getPreferenceSets();
        return preferenceSets != null ? preferenceSets.equals(preferenceSets2) : preferenceSets2 == null;
    }

    public List<GroupPreferenceSet> getPreferenceSets() {
        return this.preferenceSets;
    }

    public int hashCode() {
        List<GroupPreferenceSet> preferenceSets = getPreferenceSets();
        return 59 + (preferenceSets == null ? 43 : preferenceSets.hashCode());
    }

    public String toString() {
        return "GroupPrivacyPreferences(preferenceSets=" + getPreferenceSets() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
