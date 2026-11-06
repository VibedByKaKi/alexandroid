package com.amazon.alexa.biloba.generated.models;

import com.amazon.alexa.accessory.notificationpublisher.storage.SettingsStorageModule;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EmergencyContact {

    @SerializedName(SettingsStorageModule.FILTER_SETTINGS_CONTACT_ID_KEY)
    private String contactId = null;

    @SerializedName("personIdV1")
    private String personIdV1 = null;

    @SerializedName("commsId")
    private String commsId = null;

    @SerializedName("firstName")
    private String firstName = null;

    @SerializedName("lastName")
    private String lastName = null;

    @SerializedName("phoneNumber")
    private PhoneNumber phoneNumber = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public EmergencyContact commsId(String str) {
        this.commsId = str;
        return this;
    }

    public EmergencyContact contactId(String str) {
        this.contactId = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EmergencyContact emergencyContact = (EmergencyContact) obj;
            if (Objects.equals(this.contactId, emergencyContact.contactId) && Objects.equals(this.personIdV1, emergencyContact.personIdV1) && Objects.equals(this.commsId, emergencyContact.commsId) && Objects.equals(this.firstName, emergencyContact.firstName) && Objects.equals(this.lastName, emergencyContact.lastName) && Objects.equals(this.phoneNumber, emergencyContact.phoneNumber)) {
                return true;
            }
        }
        return false;
    }

    public EmergencyContact firstName(String str) {
        this.firstName = str;
        return this;
    }

    public String getCommsId() {
        return this.commsId;
    }

    public String getContactId() {
        return this.contactId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPersonIdV1() {
        return this.personIdV1;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return Objects.hash(this.contactId, this.personIdV1, this.commsId, this.firstName, this.lastName, this.phoneNumber);
    }

    public EmergencyContact lastName(String str) {
        this.lastName = str;
        return this;
    }

    public EmergencyContact personIdV1(String str) {
        this.personIdV1 = str;
        return this;
    }

    public EmergencyContact phoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public void setCommsId(String str) {
        this.commsId = str;
    }

    public void setContactId(String str) {
        this.contactId = str;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setPersonIdV1(String str) {
        this.personIdV1 = str;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class EmergencyContact {\n    contactId: ");
        sb.append(toIndentedString(this.contactId));
        sb.append("\n    personIdV1: ");
        sb.append(toIndentedString(this.personIdV1));
        sb.append("\n    commsId: ");
        sb.append(toIndentedString(this.commsId));
        sb.append("\n    firstName: ");
        sb.append(toIndentedString(this.firstName));
        sb.append("\n    lastName: ");
        sb.append(toIndentedString(this.lastName));
        sb.append("\n    phoneNumber: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.phoneNumber), "\n}");
    }
}
