package com.amazon.alexa.biloba.generated.models;

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
public class AlertConfiguration {

    @SerializedName("id")
    private String id = null;

    @SerializedName("start")
    private String start = null;

    @SerializedName("end")
    private String end = null;

    @SerializedName("triggerCondition")
    private TriggerCondition triggerCondition = null;

    @SerializedName("status")
    private StatusEnum status = null;

    @SerializedName("title")
    private String title = null;

    @SerializedName("description")
    private String description = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum StatusEnum {
        ENABLED("ENABLED"),
        DISABLED("DISABLED");

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<StatusEnum> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public StatusEnum read(JsonReader jsonReader) throws IOException {
                return StatusEnum.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, StatusEnum statusEnum) throws IOException {
                jsonWriter.value(statusEnum.getValue());
            }
        }

        StatusEnum(String str) {
            this.value = str;
        }

        public static StatusEnum fromValue(String str) {
            for (StatusEnum statusEnum : values()) {
                if (String.valueOf(statusEnum.value).equals(str)) {
                    return statusEnum;
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

    public AlertConfiguration description(String str) {
        this.description = str;
        return this;
    }

    public AlertConfiguration end(String str) {
        this.end = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AlertConfiguration alertConfiguration = (AlertConfiguration) obj;
            if (Objects.equals(this.id, alertConfiguration.id) && Objects.equals(this.start, alertConfiguration.start) && Objects.equals(this.end, alertConfiguration.end) && Objects.equals(this.triggerCondition, alertConfiguration.triggerCondition) && Objects.equals(this.status, alertConfiguration.status) && Objects.equals(this.title, alertConfiguration.title) && Objects.equals(this.description, alertConfiguration.description)) {
                return true;
            }
        }
        return false;
    }

    public String getDescription() {
        return this.description;
    }

    public String getEnd() {
        return this.end;
    }

    public String getId() {
        return this.id;
    }

    public String getStart() {
        return this.start;
    }

    public StatusEnum getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public TriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.start, this.end, this.triggerCondition, this.status, this.title, this.description);
    }

    public AlertConfiguration id(String str) {
        this.id = str;
        return this;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEnd(String str) {
        this.end = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setStart(String str) {
        this.start = str;
    }

    public void setStatus(StatusEnum statusEnum) {
        this.status = statusEnum;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTriggerCondition(TriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
    }

    public AlertConfiguration start(String str) {
        this.start = str;
        return this;
    }

    public AlertConfiguration status(StatusEnum statusEnum) {
        this.status = statusEnum;
        return this;
    }

    public AlertConfiguration title(String str) {
        this.title = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class AlertConfiguration {\n    id: ");
        sb.append(toIndentedString(this.id));
        sb.append("\n    start: ");
        sb.append(toIndentedString(this.start));
        sb.append("\n    end: ");
        sb.append(toIndentedString(this.end));
        sb.append("\n    triggerCondition: ");
        sb.append(toIndentedString(this.triggerCondition));
        sb.append("\n    status: ");
        sb.append(toIndentedString(this.status));
        sb.append("\n    title: ");
        sb.append(toIndentedString(this.title));
        sb.append("\n    description: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.description), "\n}");
    }

    public AlertConfiguration triggerCondition(TriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }
}
