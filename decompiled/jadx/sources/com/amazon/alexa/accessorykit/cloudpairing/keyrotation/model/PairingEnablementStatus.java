package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.JsonUtils;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.AutoValue_PairingEnablementStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_PairingEnablementStatus.Builder.class)
@JsonSerialize(as = PairingEnablementStatus.class)
/* loaded from: classes16.dex */
public abstract class PairingEnablementStatus {
    public static final Factory FACTORY = new Factory();
    private static final String PAIRING_DATA_KEY = "pairingData";
    private static final String STATUS_KEY = "status";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract PairingEnablementStatus build();

        @JsonProperty("status")
        public abstract Builder setPairingData(PairingData pairingData);

        @JsonProperty(PairingEnablementStatus.PAIRING_DATA_KEY)
        public abstract Builder setStatus(PairingStatus pairingStatus);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<PairingEnablementStatus> {
        private static final String DISABLED = "DISABLED";
        private static final String ENABLED = "ENABLED";
        private static final String PENDING = "PENDING";
        private static final String PENDING_KEY_ROTATION = "PENDINGKEYROTATION";

        private static PairingStatus getPairingStatus(String str) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "ENABLED":
                    return PairingStatus.ENABLED;
                case "PENDING":
                    return PairingStatus.PENDING;
                case "PENDINGKEYROTATION":
                    return PairingStatus.PENDING_KEY_ROTATION;
                case "DISABLED":
                    return PairingStatus.DISABLED;
                default:
                    return PairingStatus.UNKNOWN;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public PairingEnablementStatus create(JSONObject jSONObject) throws JSONException {
            Preconditions.notNull(jSONObject, "jsonObject");
            PairingStatus pairingStatus = getPairingStatus(jSONObject.getString("status"));
            JSONObject jsonObjectOrNull = JsonUtils.getJsonObjectOrNull(jSONObject, PairingEnablementStatus.PAIRING_DATA_KEY);
            return PairingEnablementStatus.builder().setStatus(pairingStatus).setPairingData(jsonObjectOrNull != null ? PairingData.FACTORY.create(jsonObjectOrNull) : null).build();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PairingStatus {
        ENABLED,
        DISABLED,
        PENDING,
        PENDING_KEY_ROTATION,
        UNKNOWN
    }

    public static Builder builder() {
        return new AutoValue_PairingEnablementStatus.Builder();
    }

    @Nullable
    @JsonProperty(PAIRING_DATA_KEY)
    public abstract PairingData getPairingData();

    @JsonProperty("status")
    public abstract PairingStatus getStatus();
}
