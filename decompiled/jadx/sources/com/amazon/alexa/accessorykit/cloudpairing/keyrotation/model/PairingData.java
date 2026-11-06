package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.JsonUtils;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.AutoValue_PairingData;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.BlePairingDataInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_PairingData.Builder.class)
@JsonSerialize(as = PairingData.class)
/* loaded from: classes16.dex */
public abstract class PairingData {
    private static final String CURRENT_KEY = "current";
    public static final Factory FACTORY = new Factory();
    private static final String NEXT_KEY = "next";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract PairingData build();

        @JsonProperty(PairingData.CURRENT_KEY)
        public abstract Builder setCurrent(BlePairingDataInfo blePairingDataInfo);

        @JsonProperty("next")
        public abstract Builder setNext(BlePairingDataInfo blePairingDataInfo);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<PairingData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public PairingData create(JSONObject jSONObject) throws JSONException {
            Preconditions.notNull(jSONObject, "jsonObject");
            JSONObject jSONObject2 = jSONObject.getJSONObject(PairingData.CURRENT_KEY);
            BlePairingDataInfo.Factory factory = BlePairingDataInfo.FACTORY;
            BlePairingDataInfo create = factory.create(jSONObject2);
            JSONObject jsonObjectOrNull = JsonUtils.getJsonObjectOrNull(jSONObject, "next");
            return PairingData.builder().setCurrent(create).setNext(jsonObjectOrNull != null ? factory.create(jsonObjectOrNull) : null).build();
        }
    }

    public static Builder builder() {
        return new AutoValue_PairingData.Builder();
    }

    @JsonProperty(CURRENT_KEY)
    public abstract BlePairingDataInfo getCurrent();

    @Nullable
    @JsonProperty("next")
    public abstract BlePairingDataInfo getNext();
}
