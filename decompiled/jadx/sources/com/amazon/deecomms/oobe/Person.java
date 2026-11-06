package com.amazon.deecomms.oobe;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import com.amazon.deecomms.api.CommsIdentity;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.amazon.deecomms.contacts.model.enums.CommsProvisionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Strings;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Person {
    private static final String DEFAULT_DIRECTED_ID = "0";

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_IS_CHILD)
    public boolean isChild;

    @Nullable
    @JsonProperty("directedId")
    public String directedId = "0";

    @Nullable
    @JsonProperty("commsId")
    public String commsId = null;

    @Nullable
    @JsonProperty(MetricKeys.META_HASHED_COMMS_ID)
    public String hashedCommsId = null;

    @Nullable
    @JsonProperty("firstName")
    public String firstName = null;

    @Nullable
    @JsonProperty("lastName")
    public String lastName = null;

    @Nullable
    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_PHONETIC_FIRST_NAME)
    public String phoneticFirstName = null;

    @Nullable
    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_PHONETIC_LAST_NAME)
    public String phoneticLastName = null;

    @JsonProperty(ContactProviderContract.PhoneNumberEntry.COLUMN_AOR)
    public String aor = null;

    @Nullable
    @JsonProperty(HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE)
    public String phoneCountryCode = null;

    @Nullable
    @JsonProperty("phoneNumber")
    public String phoneNumber = null;

    @JsonProperty("isFriendsAndFamily")
    public boolean isFriendsAndFamily = false;

    @JsonProperty("isCommsProvisioned")
    public boolean isCommsProvisioned = false;

    @JsonProperty("isSpeakerProvisioned")
    public boolean isSpeakerProvisioned = false;

    @NonNull
    @JsonProperty("commsProvisionStatus")
    public CommsProvisionStatus commsProvisionStatus = CommsProvisionStatus.UNKNOWN;

    @Nullable
    @JsonProperty("homeGroupId")
    public String homeGroupId = null;

    public static Person create(JSONObject jSONObject) throws JSONException {
        Person person = new Person();
        person.directedId = jSONObject.isNull("directedId") ? null : jSONObject.getString("directedId");
        person.firstName = jSONObject.isNull("firstName") ? "" : jSONObject.getString("firstName");
        person.lastName = jSONObject.isNull("lastName") ? "" : jSONObject.getString("lastName");
        person.phoneticFirstName = jSONObject.isNull(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_PHONETIC_FIRST_NAME) ? "" : jSONObject.getString(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_PHONETIC_FIRST_NAME);
        person.phoneticLastName = jSONObject.isNull(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_PHONETIC_LAST_NAME) ? "" : jSONObject.getString(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_PHONETIC_LAST_NAME);
        person.isChild = jSONObject.optBoolean(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_IS_CHILD, false);
        person.phoneCountryCode = "null".equals(jSONObject.getString(HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE)) ? null : jSONObject.getString(HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE);
        person.phoneNumber = "null".equals(jSONObject.getString("phoneNumber")) ? null : jSONObject.getString("phoneNumber");
        person.commsId = "null".equals(jSONObject.getString("commsId")) ? null : jSONObject.getString("commsId");
        person.isCommsProvisioned = jSONObject.getBoolean("commsProvisioned");
        person.isSpeakerProvisioned = jSONObject.optBoolean("speakerProvisioned");
        person.commsProvisionStatus = CommsProvisionStatus.valueOf(jSONObject.getString("commsProvisionStatus"));
        return person;
    }

    public static Person fromPrefs(SharedPreferences sharedPreferences) {
        Person person = new Person();
        person.directedId = sharedPreferences.getString(Constants.OOBE_USER_DIRECTEDID, "");
        person.commsId = sharedPreferences.getString(Constants.OOBE_COMMS_ID, "");
        person.hashedCommsId = sharedPreferences.getString(Constants.OOBE_HASHED_COMMS_ID, "");
        person.homeGroupId = sharedPreferences.getString(Constants.OOBE_USER_HOMEGROUP_ID, "");
        person.aor = sharedPreferences.getString(Constants.OOBE_USER_AOR, "");
        person.firstName = sharedPreferences.getString(Constants.OOBE_FNAME, "");
        person.lastName = sharedPreferences.getString(Constants.OOBE_LNAME, "");
        person.phoneticFirstName = sharedPreferences.getString(Constants.OOBE_PHONETIC_FIRST_NAME, "");
        person.phoneticLastName = sharedPreferences.getString(Constants.OOBE_PHONETIC_LAST_NAME, "");
        person.phoneCountryCode = sharedPreferences.getString(Constants.OOBE_PHONE_CODE, "");
        person.phoneNumber = sharedPreferences.getString(Constants.OOBE_PHONE_NUM, "");
        person.isFriendsAndFamily = sharedPreferences.getBoolean(Constants.OOBE_IS_FNF, false);
        person.isCommsProvisioned = sharedPreferences.getBoolean(Constants.OOBE_COMMS_PROV, false);
        person.isSpeakerProvisioned = sharedPreferences.getBoolean(Constants.OOBE_SPEAKER_PROV, false);
        person.commsProvisionStatus = CommsProvisionStatus.valueOf(sharedPreferences.getString(Constants.OOBE_COMMS_PROVISION_STATUS, CommsProvisionStatus.UNKNOWN.name()));
        return person;
    }

    public Person copy() {
        Person person = new Person();
        person.directedId = this.directedId;
        person.commsId = this.commsId;
        person.hashedCommsId = this.hashedCommsId;
        person.commsProvisionStatus = this.commsProvisionStatus;
        person.aor = this.aor;
        person.firstName = this.firstName;
        person.lastName = this.lastName;
        person.homeGroupId = this.homeGroupId;
        person.isChild = this.isChild;
        person.isFriendsAndFamily = this.isFriendsAndFamily;
        person.phoneCountryCode = this.phoneCountryCode;
        person.phoneNumber = this.phoneNumber;
        person.isCommsProvisioned = this.isCommsProvisioned;
        person.isSpeakerProvisioned = this.isSpeakerProvisioned;
        person.phoneticFirstName = this.phoneticFirstName;
        person.phoneticLastName = this.phoneticLastName;
        return person;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Person person = (Person) obj;
            if (Objects.equals(this.directedId, person.directedId) && Objects.equals(this.commsId, person.commsId) && Objects.equals(this.hashedCommsId, person.hashedCommsId) && Objects.equals(this.firstName, person.firstName) && Objects.equals(this.phoneticFirstName, person.phoneticFirstName) && Objects.equals(this.phoneticLastName, person.phoneticLastName) && Objects.equals(this.aor, person.aor) && Objects.equals(this.phoneCountryCode, person.phoneCountryCode) && Objects.equals(this.phoneNumber, person.phoneNumber) && Boolean.valueOf(this.isFriendsAndFamily).equals(Boolean.valueOf(person.isFriendsAndFamily)) && Boolean.valueOf(this.isCommsProvisioned).equals(Boolean.valueOf(person.isCommsProvisioned)) && Boolean.valueOf(this.isSpeakerProvisioned).equals(Boolean.valueOf(person.isSpeakerProvisioned)) && Objects.equals(this.homeGroupId, person.homeGroupId) && Objects.equals(this.commsProvisionStatus, person.commsProvisionStatus)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.directedId, this.commsId, this.hashedCommsId, this.firstName, this.lastName, this.phoneticFirstName, this.phoneticLastName, this.aor, this.phoneCountryCode, this.phoneNumber, Boolean.valueOf(this.isFriendsAndFamily), Boolean.valueOf(this.isCommsProvisioned), Boolean.valueOf(this.isSpeakerProvisioned), this.commsProvisionStatus, this.homeGroupId);
    }

    public boolean isNewUser() {
        return TextUtils.isEmpty(this.directedId) || "0".equals(this.directedId);
    }

    public CommsIdentity toCommsIdentity(String str, boolean z) {
        CommsIdentity commsIdentity = new CommsIdentity();
        commsIdentity.setCommsId(this.commsId, str, z);
        commsIdentity.setHashedCommsId(this.hashedCommsId);
        commsIdentity.setDirectedId(this.directedId, str, z);
        commsIdentity.setFirstName(this.firstName);
        commsIdentity.setLastName(this.lastName);
        commsIdentity.setPhoneticFirstName(this.phoneticFirstName);
        commsIdentity.setPhoneticLastName(this.phoneticLastName);
        commsIdentity.setHomeGroupId(this.homeGroupId);
        commsIdentity.setAor(this.aor);
        commsIdentity.setProvisioningStatus(this.commsProvisionStatus, str, z);
        if (Strings.isNullOrEmpty(this.phoneCountryCode)) {
            commsIdentity.setPhoneNumber(this.phoneNumber);
            return commsIdentity;
        }
        commsIdentity.setPhoneNumber("+" + this.phoneCountryCode + this.phoneNumber);
        return commsIdentity;
    }
}
