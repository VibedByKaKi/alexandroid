package com.amazon.alexa.identity;

import androidx.autofill.HintConstants;
import com.amazon.alexa.identity.api.ProfileAttributes;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class ApesProfileData {
    private String alexaTermsAcceptanceStatus;
    private String commsId;
    private String commsProvisionStatus;
    private boolean commsProvisioned;
    private String createdInProgram;
    private String directedId;
    private boolean enrolledInAlexa;
    private String firstName;
    private boolean isAccountManager;
    private boolean isChild;
    private boolean isDefault;
    private String lastName;
    private String personId;
    private String personIdV2;
    private String phoneCountryCode;
    private String phoneNumber;
    private String phoneticFirstName;
    private String phoneticLastName;
    private String profileType;
    private boolean signedInUser;

    public ApesProfileData(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        this.firstName = str;
        this.lastName = str2;
        this.personId = str3;
        this.isAccountManager = z;
        this.profileType = str4;
        this.isDefault = z2;
        this.signedInUser = z2;
        this.personIdV2 = str3;
        this.isChild = str4.equals("CHILD");
    }

    public void setAlexaTermsAcceptanceStatus(String str) {
        this.alexaTermsAcceptanceStatus = str;
    }

    public void setCommsId(String str) {
        this.commsId = str;
    }

    public void setCommsProvisionStatus(String str) {
        this.commsProvisionStatus = str;
    }

    public void setCommsProvisioned(boolean z) {
        this.commsProvisioned = z;
    }

    public void setCreatedInProgram(String str) {
        this.createdInProgram = str;
    }

    public void setDirectedId(String str) {
        this.directedId = str;
    }

    public void setEnrolledInAlexa(boolean z) {
        this.enrolledInAlexa = z;
    }

    public void setPhoneCountryCode(String str) {
        this.phoneCountryCode = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPhoneticFirstName(String str) {
        this.phoneticFirstName = str;
    }

    public void setPhoneticLastName(String str) {
        this.phoneticLastName = str;
    }

    public String toJSONString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("directedId", this.directedId);
            jSONObject.put("firstName", this.firstName);
            jSONObject.put("lastName", this.lastName);
            jSONObject.put(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_IS_CHILD, this.isChild);
            jSONObject.put(HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE, this.phoneCountryCode);
            jSONObject.put("personId", this.personId);
            jSONObject.put("isAccountManager", this.isAccountManager);
            jSONObject.put(ProfileAttributes.PROFILE_TYPE, this.profileType);
            jSONObject.put("phoneNumber", this.phoneNumber);
            jSONObject.put(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_PHONETIC_FIRST_NAME, this.phoneticFirstName);
            jSONObject.put(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_PHONETIC_LAST_NAME, this.phoneticLastName);
            jSONObject.put("signedInUser", this.signedInUser);
            jSONObject.put("commsId", this.commsId);
            jSONObject.put("commsProvisioned", this.commsProvisioned);
            jSONObject.put("commsProvisionStatus", this.commsProvisionStatus);
            jSONObject.put(ProfileAttributes.PERSON_ID, this.personId);
            jSONObject.put("enrolledInAlexa", this.enrolledInAlexa);
            jSONObject.put("createdInProgram", this.createdInProgram);
            jSONObject.put(ProfileAttributes.ALEXA_TC_ACCEPTANCE_STATUS, this.alexaTermsAcceptanceStatus);
            jSONObject.put("isDefault", this.isDefault);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
