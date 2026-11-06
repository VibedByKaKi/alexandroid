package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.AutoValue_BlePairingDataInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_BlePairingDataInfo.Builder.class)
@JsonSerialize(as = BlePairingDataInfo.class)
/* loaded from: classes16.dex */
public abstract class BlePairingDataInfo {
    private static final String BLE_KEY = "ble";
    private static final String EXPIRY_TIME_KEY = "expiryTime";
    public static final Factory FACTORY = new Factory();
    private static final String SEED_KEY = "seed";
    private static final String STATE_KEY = "state";
    private static final String SYMMETRIC_KEY_KEY = "symmetricKey";
    private static final String VERSION_KEY = "version";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract BlePairingDataInfo build();

        @JsonProperty(BlePairingDataInfo.EXPIRY_TIME_KEY)
        public abstract Builder setExpiryTime(long j);

        @JsonProperty(BlePairingDataInfo.SEED_KEY)
        public abstract Builder setSeed(String str);

        @JsonProperty("state")
        public abstract Builder setState(BlePairingDataState blePairingDataState);

        @JsonProperty(BlePairingDataInfo.SYMMETRIC_KEY_KEY)
        public abstract Builder setSymmetricKey(String str);

        @JsonProperty("version")
        public abstract Builder setVersion(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<BlePairingDataInfo> {
        private static final String ACKNOWLEDGED = "ACKNOWLEDGED";
        private static final String CREATED = "CREATED";
        private static final String FINALIZED = "FINALIZED";
        private static final String PAIR_ACKNOWLEDGED = "PAIR_ACKNOWLEDGED";

        private static BlePairingDataState getPairingDataState(String str) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            switch (upperCase) {
                case "FINALIZED":
                    return BlePairingDataState.FINALIZED;
                case "PAIR_ACKNOWLEDGED":
                    return BlePairingDataState.PAIR_ACKNOWLEDGED;
                case "ACKNOWLEDGED":
                    return BlePairingDataState.ACKNOWLEDGED;
                case "CREATED":
                    return BlePairingDataState.CREATED;
                default:
                    return BlePairingDataState.UNKNOWN;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public BlePairingDataInfo create(JSONObject jSONObject) throws JSONException {
            Preconditions.notNull(jSONObject, "jsonObject");
            JSONObject jSONObject2 = jSONObject.getJSONObject(BlePairingDataInfo.BLE_KEY);
            BlePairingDataState pairingDataState = getPairingDataState(jSONObject2.getString("state"));
            return BlePairingDataInfo.builder().setVersion(jSONObject2.getString("version")).setState(pairingDataState).setSeed(jSONObject2.getString(BlePairingDataInfo.SEED_KEY)).setSymmetricKey(jSONObject2.getString(BlePairingDataInfo.SYMMETRIC_KEY_KEY)).setExpiryTime(Long.parseLong(jSONObject2.getString(BlePairingDataInfo.EXPIRY_TIME_KEY))).build();
        }
    }

    public static Builder builder() {
        return new AutoValue_BlePairingDataInfo.Builder();
    }

    @JsonProperty(EXPIRY_TIME_KEY)
    public abstract long getExpiryTime();

    @JsonProperty(SEED_KEY)
    public abstract String getSeed();

    @JsonProperty("state")
    public abstract BlePairingDataState getState();

    @JsonProperty(SYMMETRIC_KEY_KEY)
    public abstract String getSymmetricKey();

    @JsonProperty("version")
    public abstract String getVersion();
}
