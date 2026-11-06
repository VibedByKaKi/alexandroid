package com.amazon.clouddrive.extended.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupPreferenceSet {
    private String id;
    private List<GroupPreference> preferences;
    private String title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String id;
        private List<GroupPreference> preferences;
        private String title;

        public GroupPreferenceSet build() {
            return new GroupPreferenceSet(this.id, this.preferences, this.title);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder{id='");
            sb.append(this.id);
            sb.append("', preferences=");
            sb.append(this.preferences);
            sb.append(", title='");
            return a$$ExternalSyntheticOutline0.m(sb, this.title, "'}");
        }

        public Builder withId(String str) {
            this.id = str;
            return this;
        }

        public Builder withPreferences(List<GroupPreference> list) {
            this.preferences = list;
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }
    }

    public GroupPreferenceSet(String str, List<GroupPreference> list, String str2) {
        this.id = str;
        this.preferences = list;
        this.title = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupPreferenceSet)) {
            return false;
        }
        GroupPreferenceSet groupPreferenceSet = (GroupPreferenceSet) obj;
        if (getId() == null ? groupPreferenceSet.getId() == null : getId().equals(groupPreferenceSet.getId())) {
            if (getPreferences() == null ? groupPreferenceSet.getPreferences() == null : getPreferences().equals(groupPreferenceSet.getPreferences())) {
                if (getTitle() == null ? groupPreferenceSet.getTitle() == null : getTitle().equals(groupPreferenceSet.getTitle())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getId() {
        return this.id;
    }

    public List<GroupPreference> getPreferences() {
        return this.preferences;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((getId() != null ? getId().hashCode() : 0) * 31) + (getPreferences() != null ? getPreferences().hashCode() : 0)) * 31) + (getTitle() != null ? getTitle().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupPreferenceSet{id='");
        sb.append(this.id);
        sb.append("', preferences=");
        sb.append(this.preferences);
        sb.append(", title='");
        return a$$ExternalSyntheticOutline0.m(sb, this.title, "'}");
    }
}
