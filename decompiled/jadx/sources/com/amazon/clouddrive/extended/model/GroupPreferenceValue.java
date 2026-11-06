package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GroupPreferenceValue {
    private final String description;
    private final String id;
    private final String title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GroupPreferenceValueBuilder {
        private String description;
        private String id;
        private String title;

        public GroupPreferenceValue build() {
            return new GroupPreferenceValue(this.description, this.id, this.title);
        }

        public GroupPreferenceValueBuilder description(String str) {
            this.description = str;
            return this;
        }

        public GroupPreferenceValueBuilder id(String str) {
            this.id = str;
            return this;
        }

        public GroupPreferenceValueBuilder title(String str) {
            this.title = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GroupPreferenceValue.GroupPreferenceValueBuilder(description=");
            sb.append(this.description);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", title=");
            return a$$ExternalSyntheticOutline0.m(sb, this.title, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public GroupPreferenceValue(String str, String str2, String str3) {
        this.description = str;
        this.id = str2;
        this.title = str3;
    }

    public static GroupPreferenceValueBuilder builder() {
        return new GroupPreferenceValueBuilder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupPreferenceValue)) {
            return false;
        }
        GroupPreferenceValue groupPreferenceValue = (GroupPreferenceValue) obj;
        String description = getDescription();
        String description2 = groupPreferenceValue.getDescription();
        if (description != null ? !description.equals(description2) : description2 != null) {
            return false;
        }
        String id = getId();
        String id2 = groupPreferenceValue.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String title = getTitle();
        String title2 = groupPreferenceValue.getTitle();
        return title != null ? title.equals(title2) : title2 == null;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String description = getDescription();
        int hashCode = description == null ? 43 : description.hashCode();
        String id = getId();
        int i = (hashCode + 59) * 59;
        int hashCode2 = id == null ? 43 : id.hashCode();
        String title = getTitle();
        return ((i + hashCode2) * 59) + (title != null ? title.hashCode() : 43);
    }

    public String toString() {
        return "GroupPreferenceValue(description=" + getDescription() + ", id=" + getId() + ", title=" + getTitle() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
