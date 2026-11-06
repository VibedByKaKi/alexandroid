package com.amazon.clouddrive.extended.model;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupPreferenceUpdate {
    private String id;
    private String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String id;
        private String value;

        public GroupPreferenceUpdate build() {
            return new GroupPreferenceUpdate(this.id, this.value);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder{id='");
            sb.append(this.id);
            sb.append("', value='");
            return a$$ExternalSyntheticOutline0.m(sb, this.value, "'}");
        }

        public Builder withId(String str) {
            this.id = str;
            return this;
        }

        public Builder withValue(String str) {
            this.value = str;
            return this;
        }
    }

    public GroupPreferenceUpdate(String str, String str2) {
        this.id = str;
        this.value = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupPreferenceUpdate)) {
            return false;
        }
        GroupPreferenceUpdate groupPreferenceUpdate = (GroupPreferenceUpdate) obj;
        if (getId() == null ? groupPreferenceUpdate.getId() == null : getId().equals(groupPreferenceUpdate.getId())) {
            if (getValue() == null ? groupPreferenceUpdate.getValue() == null : getValue().equals(groupPreferenceUpdate.getValue())) {
                return true;
            }
        }
        return false;
    }

    public String getId() {
        return this.id;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return ((getId() != null ? getId().hashCode() : 0) * 31) + (getValue() != null ? getValue().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupPreferenceUpdate{id='");
        sb.append(this.id);
        sb.append("', value='");
        return a$$ExternalSyntheticOutline0.m(sb, this.value, "'}");
    }
}
