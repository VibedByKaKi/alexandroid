package com.amazon.clouddrive.extended.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GroupPreference {
    private final List<GroupPreferenceValue> availableValues;
    private final String id;
    private final String title;
    private final String value;
    private final String valueKind;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GroupPreferenceBuilder {
        private List<GroupPreferenceValue> availableValues;
        private String id;
        private String title;
        private String value;
        private String valueKind;

        public GroupPreferenceBuilder availableValues(List<GroupPreferenceValue> list) {
            this.availableValues = list;
            return this;
        }

        public GroupPreference build() {
            return new GroupPreference(this.id, this.title, this.value, this.valueKind, this.availableValues);
        }

        public GroupPreferenceBuilder id(String str) {
            this.id = str;
            return this;
        }

        public GroupPreferenceBuilder title(String str) {
            this.title = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GroupPreference.GroupPreferenceBuilder(id=");
            sb.append(this.id);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", value=");
            sb.append(this.value);
            sb.append(", valueKind=");
            sb.append(this.valueKind);
            sb.append(", availableValues=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.availableValues, sb);
        }

        public GroupPreferenceBuilder value(String str) {
            this.value = str;
            return this;
        }

        public GroupPreferenceBuilder valueKind(String str) {
            this.valueKind = str;
            return this;
        }
    }

    public GroupPreference(String str, String str2, String str3, String str4, List<GroupPreferenceValue> list) {
        this.id = str;
        this.title = str2;
        this.value = str3;
        this.valueKind = str4;
        this.availableValues = list;
    }

    public static GroupPreferenceBuilder builder() {
        return new GroupPreferenceBuilder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupPreference)) {
            return false;
        }
        GroupPreference groupPreference = (GroupPreference) obj;
        String id = getId();
        String id2 = groupPreference.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String title = getTitle();
        String title2 = groupPreference.getTitle();
        if (title != null ? !title.equals(title2) : title2 != null) {
            return false;
        }
        String value = getValue();
        String value2 = groupPreference.getValue();
        if (value != null ? !value.equals(value2) : value2 != null) {
            return false;
        }
        String valueKind = getValueKind();
        String valueKind2 = groupPreference.getValueKind();
        if (valueKind != null ? !valueKind.equals(valueKind2) : valueKind2 != null) {
            return false;
        }
        List<GroupPreferenceValue> availableValues = getAvailableValues();
        List<GroupPreferenceValue> availableValues2 = groupPreference.getAvailableValues();
        return availableValues != null ? availableValues.equals(availableValues2) : availableValues2 == null;
    }

    public List<GroupPreferenceValue> getAvailableValues() {
        return this.availableValues;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getValue() {
        return this.value;
    }

    public String getValueKind() {
        return this.valueKind;
    }

    public int hashCode() {
        String id = getId();
        int hashCode = id == null ? 43 : id.hashCode();
        String title = getTitle();
        int hashCode2 = ((hashCode + 59) * 59) + (title == null ? 43 : title.hashCode());
        String value = getValue();
        int hashCode3 = (hashCode2 * 59) + (value == null ? 43 : value.hashCode());
        String valueKind = getValueKind();
        int i = hashCode3 * 59;
        int hashCode4 = valueKind == null ? 43 : valueKind.hashCode();
        List<GroupPreferenceValue> availableValues = getAvailableValues();
        return ((i + hashCode4) * 59) + (availableValues != null ? availableValues.hashCode() : 43);
    }

    public String toString() {
        return "GroupPreference(id=" + getId() + ", title=" + getTitle() + ", value=" + getValue() + ", valueKind=" + getValueKind() + ", availableValues=" + getAvailableValues() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
