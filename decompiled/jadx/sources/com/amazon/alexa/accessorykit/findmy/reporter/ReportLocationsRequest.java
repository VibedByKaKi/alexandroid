package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.auto.value.AutoValue;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonSerialize(as = ReportLocationsRequest.class)
/* loaded from: classes16.dex */
public abstract class ReportLocationsRequest implements JsonObjectSerializable {
    private static final String LOCATIONS_KEY = "locations";

    @JsonCreator
    public static ReportLocationsRequest create(List<TrackableDevicesLocation> list) {
        return new AutoValue_ReportLocationsRequest(list);
    }

    @JsonProperty(LOCATIONS_KEY)
    public abstract List<TrackableDevicesLocation> getLocations();

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        try {
            return new JSONObject(JsonMapper.builder().configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true).build().writeValueAsString(this));
        } catch (JsonProcessingException e) {
            throw new JSONException(e);
        }
    }
}
