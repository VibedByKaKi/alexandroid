package com.amazon.alexa.identity.api;

import androidx.annotation.Nullable;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class CommsProfile {
    private final String aor;
    private final String commsId;
    private final String email;
    private final String hashedCommsId;
    private final String householdId;
    private final String phoneNumber;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String aor;
        private String commsId;
        private String email;
        private String hashedCommsId;
        private String householdId;
        private String phoneNumber;

        public CommsProfile build() {
            return new CommsProfile(this, 0);
        }

        public Builder withAor(String str) {
            this.aor = str;
            return this;
        }

        public Builder withCommsId(String str) {
            this.commsId = str;
            return this;
        }

        public Builder withEmail(String str) {
            this.email = str;
            return this;
        }

        public Builder withHashedCommsId(String str) {
            this.hashedCommsId = str;
            return this;
        }

        public Builder withHouseholdId(String str) {
            this.householdId = str;
            return this;
        }

        public Builder withPhoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }
    }

    private CommsProfile(Builder builder) {
        this.commsId = builder.commsId;
        this.phoneNumber = builder.phoneNumber;
        this.aor = builder.aor;
        this.hashedCommsId = builder.hashedCommsId;
        this.householdId = builder.householdId;
        this.email = builder.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder from(@Nullable CommsProfile commsProfile) {
        return commsProfile == null ? builder() : builder().withCommsId(commsProfile.getCommsId()).withPhoneNumber(commsProfile.getPhoneNumber()).withAor(commsProfile.getAor()).withHashedCommsId(commsProfile.getHashedCommsId()).withHouseholdId(commsProfile.getHouseholdId()).withEmail(commsProfile.getEmail());
    }

    @Nullable
    public static CommsProfile fromJson(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return builder().withCommsId(jSONObject.isNull("commsId") ? null : jSONObject.optString("commsId")).withPhoneNumber(jSONObject.isNull("phoneNumber") ? null : jSONObject.optString("phoneNumber")).withAor(jSONObject.isNull(ContactProviderContract.PhoneNumberEntry.COLUMN_AOR) ? null : jSONObject.optString(ContactProviderContract.PhoneNumberEntry.COLUMN_AOR)).withHashedCommsId(jSONObject.isNull(MetricKeys.META_HASHED_COMMS_ID) ? null : jSONObject.optString(MetricKeys.META_HASHED_COMMS_ID)).withHouseholdId(jSONObject.isNull("householdId") ? null : jSONObject.optString("householdId")).withEmail(jSONObject.isNull("email") ? null : jSONObject.optString("email")).build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CommsProfile.class == obj.getClass()) {
            CommsProfile commsProfile = (CommsProfile) obj;
            if (Objects.equals(getCommsId(), commsProfile.getCommsId()) && Objects.equals(getPhoneNumber(), commsProfile.getPhoneNumber()) && Objects.equals(getAor(), commsProfile.getAor()) && Objects.equals(getHashedCommsId(), commsProfile.getHashedCommsId()) && Objects.equals(getHouseholdId(), commsProfile.getHouseholdId()) && Objects.equals(getEmail(), commsProfile.getEmail())) {
                return true;
            }
        }
        return false;
    }

    public String getAor() {
        return this.aor;
    }

    public String getCommsId() {
        return this.commsId;
    }

    public String getEmail() {
        return this.email;
    }

    public String getHashedCommsId() {
        return this.hashedCommsId;
    }

    public String getHouseholdId() {
        return this.householdId;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return Objects.hash(this.commsId, this.phoneNumber, this.aor, this.hashedCommsId, this.householdId, this.email);
    }

    @Nullable
    public JSONObject toJson() {
        try {
            return new JSONObject().put("commsId", this.commsId).put("phoneNumber", this.phoneNumber).put(ContactProviderContract.PhoneNumberEntry.COLUMN_AOR, this.aor).put(MetricKeys.META_HASHED_COMMS_ID, this.hashedCommsId).put("householdId", this.householdId).put("email", this.email);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Comms{commsId ='");
        sb.append(this.commsId);
        sb.append("', phoneNumber ='");
        sb.append(this.phoneNumber);
        sb.append("', aor ='");
        sb.append(this.aor);
        sb.append("', hashedCommsId ='");
        sb.append(this.hashedCommsId);
        sb.append("', householdId ='");
        sb.append(this.householdId);
        sb.append("', email ='");
        return a$$ExternalSyntheticOutline0.m(sb, this.email, "'}");
    }

    public /* synthetic */ CommsProfile(Builder builder, int i) {
        this(builder);
    }
}
