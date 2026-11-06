package com.amazon.alexa.biloba.generated.models;

import com.amazon.alexa.ra.core.data.fragments.Reference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Activity {

    @SerializedName("title")
    private String title = null;

    @SerializedName("deviceName")
    private String deviceName = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("category")
    private CategoryEnum category = null;

    @SerializedName(Reference.ICON_URL)
    private String iconUrl = null;

    @SerializedName("iconAltText")
    private String iconAltText = null;

    @SerializedName("localizedDateTime")
    private LocalizedDateTime localizedDateTime = null;

    @SerializedName("utcDateTime")
    private Date utcDateTime = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum CategoryEnum {
        VOICE_ACTIVITY("VOICE_ACTIVITY"),
        SMART_HOME("SMART_HOME"),
        CARE_NOTIFICATION("CARE_NOTIFICATION"),
        COMMUNICATIONS("COMMUNICATIONS"),
        PRESENCE("PRESENCE"),
        AUTOMATIONS("AUTOMATIONS"),
        NON_VOICE("NON_VOICE"),
        OTHER("OTHER");

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<CategoryEnum> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public CategoryEnum read(JsonReader jsonReader) throws IOException {
                return CategoryEnum.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, CategoryEnum categoryEnum) throws IOException {
                jsonWriter.value(categoryEnum.getValue());
            }
        }

        CategoryEnum(String str) {
            this.value = str;
        }

        public static CategoryEnum fromValue(String str) {
            for (CategoryEnum categoryEnum : values()) {
                if (String.valueOf(categoryEnum.value).equals(str)) {
                    return categoryEnum;
                }
            }
            return null;
        }

        public String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public Activity category(CategoryEnum categoryEnum) {
        this.category = categoryEnum;
        return this;
    }

    public Activity description(String str) {
        this.description = str;
        return this;
    }

    public Activity deviceName(String str) {
        this.deviceName = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Activity activity = (Activity) obj;
            if (Objects.equals(this.title, activity.title) && Objects.equals(this.deviceName, activity.deviceName) && Objects.equals(this.description, activity.description) && Objects.equals(this.category, activity.category) && Objects.equals(this.iconUrl, activity.iconUrl) && Objects.equals(this.iconAltText, activity.iconAltText) && Objects.equals(this.localizedDateTime, activity.localizedDateTime) && Objects.equals(this.utcDateTime, activity.utcDateTime)) {
                return true;
            }
        }
        return false;
    }

    public CategoryEnum getCategory() {
        return this.category;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getIconAltText() {
        return this.iconAltText;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public LocalizedDateTime getLocalizedDateTime() {
        return this.localizedDateTime;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getUtcDateTime() {
        return this.utcDateTime;
    }

    public int hashCode() {
        return Objects.hash(this.title, this.deviceName, this.description, this.category, this.iconUrl, this.iconAltText, this.localizedDateTime, this.utcDateTime);
    }

    public Activity iconAltText(String str) {
        this.iconAltText = str;
        return this;
    }

    public Activity iconUrl(String str) {
        this.iconUrl = str;
        return this;
    }

    public Activity localizedDateTime(LocalizedDateTime localizedDateTime) {
        this.localizedDateTime = localizedDateTime;
        return this;
    }

    public void setCategory(CategoryEnum categoryEnum) {
        this.category = categoryEnum;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setIconAltText(String str) {
        this.iconAltText = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setLocalizedDateTime(LocalizedDateTime localizedDateTime) {
        this.localizedDateTime = localizedDateTime;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUtcDateTime(Date date) {
        this.utcDateTime = date;
    }

    public Activity title(String str) {
        this.title = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class Activity {\n    title: ");
        sb.append(toIndentedString(this.title));
        sb.append("\n    deviceName: ");
        sb.append(toIndentedString(this.deviceName));
        sb.append("\n    description: ");
        sb.append(toIndentedString(this.description));
        sb.append("\n    category: ");
        sb.append(toIndentedString(this.category));
        sb.append("\n    iconUrl: ");
        sb.append(toIndentedString(this.iconUrl));
        sb.append("\n    iconAltText: ");
        sb.append(toIndentedString(this.iconAltText));
        sb.append("\n    localizedDateTime: ");
        sb.append(toIndentedString(this.localizedDateTime));
        sb.append("\n    utcDateTime: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.utcDateTime), "\n}");
    }

    public Activity utcDateTime(Date date) {
        this.utcDateTime = date;
        return this;
    }
}
