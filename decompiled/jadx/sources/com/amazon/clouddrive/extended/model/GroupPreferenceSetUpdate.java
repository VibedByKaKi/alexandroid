package com.amazon.clouddrive.extended.model;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupPreferenceSetUpdate {
    private String id;
    private List<GroupPreferenceUpdate> preferences;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String id;
        private List<GroupPreferenceUpdate> preferences;

        public GroupPreferenceSetUpdate build() {
            return new GroupPreferenceSetUpdate(this.id, this.preferences);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder{id='");
            sb.append(this.id);
            sb.append("', preferences=");
            return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.preferences, AbstractJsonLexerKt.END_OBJ);
        }

        public Builder withId(String str) {
            this.id = str;
            return this;
        }

        public Builder withPreferences(List<GroupPreferenceUpdate> list) {
            this.preferences = list;
            return this;
        }
    }

    public GroupPreferenceSetUpdate(String str, List<GroupPreferenceUpdate> list) {
        this.id = str;
        this.preferences = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupPreferenceSetUpdate)) {
            return false;
        }
        GroupPreferenceSetUpdate groupPreferenceSetUpdate = (GroupPreferenceSetUpdate) obj;
        if (getId() == null ? groupPreferenceSetUpdate.getId() == null : getId().equals(groupPreferenceSetUpdate.getId())) {
            if (getPreferences() == null ? groupPreferenceSetUpdate.getPreferences() == null : getPreferences().equals(groupPreferenceSetUpdate.getPreferences())) {
                return true;
            }
        }
        return false;
    }

    public String getId() {
        return this.id;
    }

    public List<GroupPreferenceUpdate> getPreferences() {
        return this.preferences;
    }

    public int hashCode() {
        return ((getId() != null ? getId().hashCode() : 0) * 31) + (getPreferences() != null ? getPreferences().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupPreferenceSetUpdate{id='");
        sb.append(this.id);
        sb.append("', preferences=");
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.preferences, AbstractJsonLexerKt.END_OBJ);
    }
}
