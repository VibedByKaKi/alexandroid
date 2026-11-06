package com.amazon.alexa.identity.api;

import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class UserProfile {
    private final String alexaTCAcceptanceStatus;
    private final CommsProfile commsProfile;
    private final String directedId;
    private final String firstName;
    private final boolean isAlexaEnrolled;
    private final String lastName;
    private final String personId;
    private final ProfileType profileType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String alexaTCAcceptanceStatus;
        private CommsProfile commsProfile;
        private String directedId;
        private String firstName;
        private boolean isAlexaEnrolled;
        private String lastName;
        private String personId;
        private ProfileType profileType;

        public UserProfile build() {
            return new UserProfile(this, 0);
        }

        public Builder withAlexaTCAcceptanceStatus(String str) {
            this.alexaTCAcceptanceStatus = str;
            return this;
        }

        public Builder withCommsProfile(CommsProfile commsProfile) {
            this.commsProfile = commsProfile;
            return this;
        }

        public Builder withDirectedId(String str) {
            this.directedId = str;
            return this;
        }

        public Builder withFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public Builder withIsAlexaEnrolled(boolean z) {
            this.isAlexaEnrolled = z;
            return this;
        }

        public Builder withLastName(String str) {
            this.lastName = str;
            return this;
        }

        public Builder withPersonId(String str) {
            this.personId = str;
            return this;
        }

        public Builder withProfileType(ProfileType profileType) {
            this.profileType = profileType;
            return this;
        }
    }

    private UserProfile(Builder builder) {
        this.directedId = builder.directedId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.personId = builder.personId;
        this.commsProfile = builder.commsProfile;
        this.profileType = builder.profileType;
        this.isAlexaEnrolled = builder.isAlexaEnrolled;
        this.alexaTCAcceptanceStatus = builder.alexaTCAcceptanceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder from(@Nullable UserProfile userProfile) {
        return userProfile == null ? builder() : builder().withDirectedId(userProfile.getDirectedId()).withFirstName(userProfile.getFirstName()).withLastName(userProfile.getLastName()).withPersonId(userProfile.getPersonId()).withProfileType(userProfile.getProfileType()).withIsAlexaEnrolled(userProfile.getIsAlexaEnrolled()).withCommsProfile(userProfile.getCommsProfile()).withAlexaTCAcceptanceStatus(userProfile.getAlexaTCAcceptanceStatus());
    }

    @Nullable
    public static UserProfile fromJson(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return builder().withDirectedId(jSONObject.isNull("directedId") ? null : jSONObject.optString("directedId")).withFirstName(jSONObject.isNull("firstName") ? null : jSONObject.optString("firstName")).withLastName(jSONObject.isNull("lastName") ? null : jSONObject.optString("lastName")).withPersonId(jSONObject.isNull("personId") ? null : jSONObject.optString("personId")).withProfileType(jSONObject.isNull(ProfileAttributes.PROFILE_TYPE) ? null : ProfileType.valueOf(jSONObject.optString(ProfileAttributes.PROFILE_TYPE))).withCommsProfile(CommsProfile.fromJson(jSONObject.optJSONObject("commsProfile"))).withIsAlexaEnrolled(jSONObject.isNull(ProfileAttributes.IS_ALEXA_ENROLLED) ? false : jSONObject.optBoolean(ProfileAttributes.IS_ALEXA_ENROLLED)).withAlexaTCAcceptanceStatus(jSONObject.isNull(ProfileAttributes.ALEXA_TC_ACCEPTANCE_STATUS) ? null : jSONObject.optString(ProfileAttributes.ALEXA_TC_ACCEPTANCE_STATUS)).build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UserProfile.class == obj.getClass()) {
            UserProfile userProfile = (UserProfile) obj;
            if (Objects.equals(getDirectedId(), userProfile.getDirectedId()) && Objects.equals(getFirstName(), userProfile.getFirstName()) && Objects.equals(getLastName(), userProfile.getLastName()) && Objects.equals(getPersonId(), userProfile.getPersonId()) && Objects.equals(getProfileType(), userProfile.getProfileType()) && Boolean.valueOf(getIsAlexaEnrolled()).equals(Boolean.valueOf(userProfile.getIsAlexaEnrolled())) && Objects.equals(getCommsProfile(), userProfile.getCommsProfile()) && Objects.equals(getAlexaTCAcceptanceStatus(), userProfile.getAlexaTCAcceptanceStatus())) {
                return true;
            }
        }
        return false;
    }

    public String getAlexaTCAcceptanceStatus() {
        return this.alexaTCAcceptanceStatus;
    }

    public CommsProfile getCommsProfile() {
        return this.commsProfile;
    }

    public String getDirectedId() {
        return this.directedId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public boolean getIsAlexaEnrolled() {
        return this.isAlexaEnrolled;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPersonId() {
        return this.personId;
    }

    public ProfileType getProfileType() {
        return this.profileType;
    }

    public int hashCode() {
        return Objects.hash(this.directedId, this.firstName, this.lastName, this.personId, this.commsProfile, this.profileType, Boolean.valueOf(this.isAlexaEnrolled), this.alexaTCAcceptanceStatus);
    }

    @Nullable
    public JSONObject toJson() {
        try {
            JSONObject put = new JSONObject().put("directedId", this.directedId).put("firstName", this.firstName).put("lastName", this.lastName).put("personId", this.personId);
            ProfileType profileType = this.profileType;
            JSONObject put2 = put.put(ProfileAttributes.PROFILE_TYPE, profileType == null ? null : profileType.name()).put(ProfileAttributes.IS_ALEXA_ENROLLED, this.isAlexaEnrolled);
            CommsProfile commsProfile = this.commsProfile;
            return put2.put("commsProfile", commsProfile != null ? commsProfile.toJson() : null).put(ProfileAttributes.ALEXA_TC_ACCEPTANCE_STATUS, this.alexaTCAcceptanceStatus);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserProfile{directedId ='");
        sb.append(this.directedId);
        sb.append("', firstName ='");
        sb.append(this.firstName);
        sb.append("', lastName = '");
        sb.append(this.lastName);
        sb.append("', personId = '");
        sb.append(this.personId);
        sb.append("', profileType = '");
        sb.append(this.profileType);
        sb.append("', commsProfile = '");
        sb.append(this.commsProfile);
        sb.append("', isAlexaEnrolled = '");
        sb.append(this.isAlexaEnrolled);
        sb.append("', alexaTCAcceptanceStatus = '");
        return a$$ExternalSyntheticOutline0.m(sb, this.alexaTCAcceptanceStatus, "'}");
    }

    public /* synthetic */ UserProfile(Builder builder, int i) {
        this(builder);
    }
}
