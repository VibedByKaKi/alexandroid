package com.amazon.alexa.biloba.model;

import com.amazon.alexa.biloba.routing.Routes;
import com.amazon.alexa.mobile.assistant.capabilities.application.FireOsNavigationDirectiveListener;
import com.amazon.alexa.voice.metrics.VoxLaunchConstants;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Action {

    @SerializedName("localizedTitle")
    private String localizedTitle = null;

    @SerializedName("type")
    private TypeEnum type = null;

    @SerializedName("target")
    private TargetEnum target = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum TargetEnum {
        INITIATE_CALL("/comms/call"),
        INITIATE_DROPIN("/comms/dropin"),
        INITIATE_REMOTE_ASSIST("remote_assist/initiate"),
        SEND_MESSAGE("/comms/message"),
        SHARE_PHOTO("/comms/share"),
        SETUP_TIMEZONE("/settings/timezone"),
        SETUP_NOTIFICATION_V2("/notification/setup/v2"),
        LEARN_NOTIFICATION_V2("/notification/learn/v2"),
        LEARN_MORE_EC("/emergency/contact/learn"),
        CARE_PLUS_UPSELL(Routes.BILOBA_CARE_PLUS_UPSELL),
        FALL_DETECTION_UPSELL(Routes.BILOBA_FALL_DETECTION_ADD_DEVICES_UPSELL),
        CARE_PLUS_WELCOME(Routes.BILOBA_CARE_PLUS_WELCOME),
        INVITE_CARE_GIVER(Routes.BILOBA_INVITE_CARE_GIVER),
        EMERGENCY_HELPLINE_CALL_ENDED(Routes.BILOBA_EMERGENCY_HELPLINE_CALL_ENDED),
        EMERGENCY_HELPLINE_CALL_STARTED(Routes.BILOBA_EMERGENCY_HELPLINE_CALL_STARTED),
        EMERGENCY_HELPLINE_CALL_FAILED(Routes.BILOBA_EMERGENCY_HELPLINE_CALL_FAILED),
        ENABLE_REMOTE_MANAGEMENT("biloba/external/dashboard"),
        FINISH_COMMS_SETUP(Routes.BILOBA_FINISH_COMMS_SETUP),
        REMOTE_MANAGEMENT("biloba/external/dashboard"),
        TEST_EMERGENCY_HELPLINE(Routes.BILOBA_TEST_EMERGENCY_HELPLINE),
        VERIFIED_AND_UNVERIFIED_FALL(Routes.BILOBA_EMERGENCY_HELPLINE_VERIFIED_AND_UNVERIFIED_FALL),
        VERIFIED_NO_FALL(Routes.BILOBA_EMERGENCY_HELPLINE_VERIFIED_NO_FALL);

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<TargetEnum> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public TargetEnum read(JsonReader jsonReader) throws IOException {
                return TargetEnum.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, TargetEnum targetEnum) throws IOException {
                jsonWriter.value(targetEnum.getValue());
            }
        }

        TargetEnum(String str) {
            this.value = str;
        }

        public static TargetEnum fromValue(String str) {
            for (TargetEnum targetEnum : values()) {
                if (String.valueOf(targetEnum.value).equals(str)) {
                    return targetEnum;
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
        URI(FireOsNavigationDirectiveListener.SUPPORTED_IDENTIFIER_TYPE),
        ROUTE(VoxLaunchConstants.ROUTE),
        COMMAND("COMMAND");

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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Action action = (Action) obj;
            if (Objects.equals(this.localizedTitle, action.localizedTitle) && Objects.equals(this.type, action.type) && Objects.equals(this.target, action.target)) {
                return true;
            }
        }
        return false;
    }

    public String getLocalizedTitle() {
        return this.localizedTitle;
    }

    public TargetEnum getTarget() {
        return this.target;
    }

    public TypeEnum getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.localizedTitle, this.type, this.target);
    }

    public Action localizedTitle(String str) {
        this.localizedTitle = str;
        return this;
    }

    public void setLocalizedTitle(String str) {
        this.localizedTitle = str;
    }

    public void setTarget(TargetEnum targetEnum) {
        this.target = targetEnum;
    }

    public void setType(TypeEnum typeEnum) {
        this.type = typeEnum;
    }

    public Action target(TargetEnum targetEnum) {
        this.target = targetEnum;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class Action {\n    localizedTitle: ");
        sb.append(toIndentedString(this.localizedTitle));
        sb.append("\n    type: ");
        sb.append(toIndentedString(this.type));
        sb.append("\n    target: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.target), "\n}");
    }

    public Action type(TypeEnum typeEnum) {
        this.type = typeEnum;
        return this;
    }
}
