package com.amazon.alexa.biloba.model;

import com.amazon.alexa.biloba.generated.models.LocalizedDateTime;
import com.amazon.alexa.biloba.membership.PermissionConstants;
import com.amazon.alexa.ra.core.data.fragments.CardContext;
import com.amazon.alexa.ra.core.data.fragments.Reference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Card {

    @SerializedName("id")
    private String id = null;

    @SerializedName("localizedTitle")
    private String localizedTitle = null;

    @SerializedName("localizedDescription")
    private String localizedDescription = null;

    @SerializedName("category")
    private CategoryEnum category = null;

    @SerializedName("type")
    private TypeEnum type = null;

    @SerializedName(CardContext.ACTIONS)
    private List<Action> actions = new ArrayList();

    @SerializedName(Reference.ICON_URL)
    private String iconUrl = null;

    @SerializedName("iconAltText")
    private String iconAltText = null;

    @SerializedName("deviceName")
    private String deviceName = null;

    @SerializedName("localizedDateTime")
    private LocalizedDateTime localizedDateTime = null;

    @SerializedName("utcDateTime")
    private Date utcDateTime = null;

    @SerializedName("additionalData")
    private HashMap<CardDataKeyEnum, Object> additionalData = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum CardDataKeyEnum {
        GEOLOCATION("geolocation"),
        UNKNOWN("UNKNOWN");

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<CardDataKeyEnum> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public CardDataKeyEnum read(JsonReader jsonReader) throws IOException {
                return CardDataKeyEnum.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, CardDataKeyEnum cardDataKeyEnum) throws IOException {
                jsonWriter.value(cardDataKeyEnum.getValue());
            }
        }

        CardDataKeyEnum(String str) {
            this.value = str;
        }

        public static CardDataKeyEnum fromValue(String str) {
            for (CardDataKeyEnum cardDataKeyEnum : values()) {
                if (String.valueOf(cardDataKeyEnum.value).equals(str)) {
                    return cardDataKeyEnum;
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

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum CategoryEnum {
        NOTIFICATION_ALERT("NOTIFICATION_ALERT"),
        FEATURE_DISCOVERY_TIP("FEATURE_DISCOVERY_TIP");

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

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum TypeEnum {
        EMERGENCY_DETECTED("EMERGENCY_DETECTED"),
        VERIFIED_FALL("VERIFIED_FALL"),
        VERIFIED_NO_FALL("VERIFIED_NO_FALL"),
        UNVERIFIED_FALL("UNVERIFIED_FALL"),
        EMERGENCY_HELPLINE_CALL_STARTED("EMERGENCY_HELPLINE_CALL_STARTED"),
        EMERGENCY_HELPLINE_CALL_ENDED("EMERGENCY_HELPLINE_CALL_ENDED"),
        EMERGENCY_HELPLINE_CALL_FAILED("EMERGENCY_HELPLINE_CALL_FAILED"),
        NO_ACTIVITY_DETECTED("NO_ACTIVITY_DETECTED"),
        FIRST_ACTIVITY_OF_THE_DAY("FIRST_ACTIVITY_OF_THE_DAY"),
        INVITE_CARE_GIVER("INVITE_CARE_GIVER"),
        CARE_PLUS_UPSELL_FOR_FD_SENSORS("CARE_PLUS_UPSELL_FOR_FD_SENSORS"),
        FALL_DETECTION_UPSELL_ADD_DEVICES("FALL_DETECTION_UPSELL_ADD_DEVICES"),
        EC_SETUP_NEEDED("EC_SETUP_NEEDED"),
        EC_AND_COMMS_SETUP_DONE("EC_AND_COMMS_SETUP_DONE"),
        FINISH_CARE_PLUS_SETUP("FINISH_CARE_PLUS_SETUP"),
        FINISH_COMMS_SETUP("FINISH_COMMS_SETUP"),
        TEST_EMERGENCY_HELPLINE("TEST_EMERGENCY_HELPLINE"),
        ENABLE_REMOTE_MANAGEMENT("ENABLE_REMOTE_MANAGEMENT"),
        REMOTE_MANAGEMENT(PermissionConstants.REMOTE_MANAGEMENT),
        LEARN_ABOUT_NOTIFICATION("LEARN_ABOUT_NOTIFICATION"),
        LEARN_ABOUT_ACTIVITY_FEED("LEARN_ABOUT_ACTIVITY_FEED"),
        DEVICE_SETUP_NEEDED("DEVICE_SETUP_NEEDED"),
        LEARN_ABOUT_SEND_A_MESSAGE("LEARN_ABOUT_SEND_A_MESSAGE"),
        LEARN_ABOUT_SHARE_A_PHOTO("LEARN_ABOUT_SHARE_A_PHOTO"),
        LEARN_ABOUT_TIMEZONE("LEARN_ABOUT_TIMEZONE"),
        CARE_PLUS_UPSELL_DO_MORE("CARE_PLUS_UPSELL_DO_MORE"),
        HOUSEHOLD_NO_ACTIVITY_DETECTED("HOUSEHOLD_NO_ACTIVITY_DETECTED"),
        HOUSEHOLD_FIRST_ACTIVITY_OF_THE_DAY("HOUSEHOLD_FIRST_ACTIVITY_OF_THE_DAY"),
        CUSTOM_ALERT_DETECTED("CUSTOM_ALERT_DETECTED");

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<TypeEnum> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public TypeEnum read(JsonReader jsonReader) throws IOException {
                return TypeEnum.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, TypeEnum typeEnum) throws IOException {
                jsonWriter.value(typeEnum.getValue());
            }
        }

        TypeEnum(String str) {
            this.value = str;
        }

        public static TypeEnum fromValue(String str) {
            for (TypeEnum typeEnum : values()) {
                if (String.valueOf(typeEnum.value).equals(str)) {
                    return typeEnum;
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

    public Card actions(List<Action> list) {
        this.actions = list;
        return this;
    }

    public Card addActionsItem(Action action) {
        this.actions.add(action);
        return this;
    }

    public Card additionalData(HashMap<CardDataKeyEnum, Object> hashMap) {
        this.additionalData = hashMap;
        return this;
    }

    public Card category(CategoryEnum categoryEnum) {
        this.category = categoryEnum;
        return this;
    }

    public Card deviceName(String str) {
        this.deviceName = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Card card = (Card) obj;
            if (Objects.equals(this.id, card.id) && Objects.equals(this.localizedTitle, card.localizedTitle) && Objects.equals(this.localizedDescription, card.localizedDescription) && Objects.equals(this.category, card.category) && Objects.equals(this.type, card.type) && Objects.equals(this.actions, card.actions) && Objects.equals(this.iconUrl, card.iconUrl) && Objects.equals(this.iconAltText, card.iconAltText) && Objects.equals(this.deviceName, card.deviceName) && Objects.equals(this.localizedDateTime, card.localizedDateTime) && Objects.equals(this.utcDateTime, card.utcDateTime) && Objects.equals(this.additionalData, card.additionalData)) {
                return true;
            }
        }
        return false;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public HashMap<CardDataKeyEnum, Object> getAdditionalData() {
        return this.additionalData;
    }

    public CategoryEnum getCategory() {
        return this.category;
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

    public String getId() {
        return this.id;
    }

    public LocalizedDateTime getLocalizedDateTime() {
        return this.localizedDateTime;
    }

    public String getLocalizedDescription() {
        return this.localizedDescription;
    }

    public String getLocalizedTitle() {
        return this.localizedTitle;
    }

    public TypeEnum getType() {
        return this.type;
    }

    public Date getUtcDateTime() {
        return this.utcDateTime;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.localizedTitle, this.localizedDescription, this.category, this.type, this.actions, this.iconUrl, this.iconAltText, this.deviceName, this.localizedDateTime, this.utcDateTime, this.additionalData);
    }

    public Card iconAltText(String str) {
        this.iconAltText = str;
        return this;
    }

    public Card iconUrl(String str) {
        this.iconUrl = str;
        return this;
    }

    public Card id(String str) {
        this.id = str;
        return this;
    }

    public Card localizedDateTime(LocalizedDateTime localizedDateTime) {
        this.localizedDateTime = localizedDateTime;
        return this;
    }

    public Card localizedDescription(String str) {
        this.localizedDescription = str;
        return this;
    }

    public Card localizedTitle(String str) {
        this.localizedTitle = str;
        return this;
    }

    public void setActions(List<Action> list) {
        this.actions = list;
    }

    public void setAdditionalData(HashMap<CardDataKeyEnum, Object> hashMap) {
        this.additionalData = hashMap;
    }

    public void setCategory(CategoryEnum categoryEnum) {
        this.category = categoryEnum;
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

    public void setId(String str) {
        this.id = str;
    }

    public void setLocalizedDateTime(LocalizedDateTime localizedDateTime) {
        this.localizedDateTime = localizedDateTime;
    }

    public void setLocalizedDescription(String str) {
        this.localizedDescription = str;
    }

    public void setLocalizedTitle(String str) {
        this.localizedTitle = str;
    }

    public void setType(TypeEnum typeEnum) {
        this.type = typeEnum;
    }

    public void setUtcDateTime(Date date) {
        this.utcDateTime = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class Card {\n    id: ");
        sb.append(toIndentedString(this.id));
        sb.append("\n    localizedTitle: ");
        sb.append(toIndentedString(this.localizedTitle));
        sb.append("\n    localizedDescription: ");
        sb.append(toIndentedString(this.localizedDescription));
        sb.append("\n    category: ");
        sb.append(toIndentedString(this.category));
        sb.append("\n    type: ");
        sb.append(toIndentedString(this.type));
        sb.append("\n    actions: ");
        sb.append(toIndentedString(this.actions));
        sb.append("\n    iconUrl: ");
        sb.append(toIndentedString(this.iconUrl));
        sb.append("\n    iconAltText: ");
        sb.append(toIndentedString(this.iconAltText));
        sb.append("\n    deviceName: ");
        sb.append(toIndentedString(this.deviceName));
        sb.append("\n    localizedDateTime: ");
        sb.append(toIndentedString(this.localizedDateTime));
        sb.append("\n    utcDateTime: ");
        sb.append(toIndentedString(this.utcDateTime));
        sb.append("\n    additionalData: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.additionalData), "\n}");
    }

    public Card type(TypeEnum typeEnum) {
        this.type = typeEnum;
        return this;
    }

    public Card utcDateTime(Date date) {
        this.utcDateTime = date;
        return this;
    }
}
