package com.amazon.alexa.accessorykit.findmy.reporter;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessorykit.findmy.reporter.AutoValue_ReportLocationsResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_ReportLocationsResponse.Builder.class)
@JsonSerialize(as = ReportLocationsResponse.class)
/* loaded from: classes16.dex */
public abstract class ReportLocationsResponse implements JsonObjectSerializable {
    public static final Factory FACTORY = new Factory();
    private static final String MESSAGE_KEY = "message";
    private static final String TYPE_KEY = "type";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ReportLocationsResponse build();

        @JsonProperty("message")
        public abstract Builder setMessage(String str);

        @JsonProperty("type")
        public abstract Builder setType(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<ReportLocationsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public ReportLocationsResponse create(JSONObject jSONObject) throws JSONException {
            return ReportLocationsResponse.builder().setType(jSONObject.has("type") ? jSONObject.getString("type") : null).setMessage(jSONObject.has("message") ? jSONObject.getString("message") : null).build();
        }
    }

    public static Builder builder() {
        return new AutoValue_ReportLocationsResponse.Builder();
    }

    @Nullable
    @JsonProperty("message")
    public abstract String getMessage();

    @Nullable
    @JsonProperty("type")
    public abstract String getType();

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        try {
            return new JSONObject(JsonMapper.builder().configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true).serializationInclusion(JsonInclude.Include.NON_NULL).build().writeValueAsString(this));
        } catch (JsonProcessingException e) {
            throw new JSONException(e);
        }
    }
}
