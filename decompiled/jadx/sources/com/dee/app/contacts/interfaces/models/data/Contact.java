package com.dee.app.contacts.interfaces.models.data;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.dee.app.contacts.interfaces.models.data.preference.contactpreference.ContactPreferences;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Contact {

    @JsonProperty("addresses")
    private List<ContactAddress> addresses;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_ALEXA_ENABLED)
    private boolean alexaEnabled;

    @JsonProperty("commsIds")
    private List<String> commsIds;

    @JsonProperty("company")
    private String company;

    @JsonProperty("contactPreferences")
    @JsonAlias({"contactPreferenceDBMap", "contactPreferences"})
    private ContactPreferences contactPreferences;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_CONTACT_SOURCE_TYPE)
    private String contactSourceType;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_DEVICE_CONTACT_ID)
    private String deviceContactId;

    @JsonProperty("emails")
    private List<ContactEmailAddress> emails;

    @JsonAlias({"homeGroupId", "homeGroupCommsId"})
    private String homeGroupIdentity;

    @JsonProperty("id")
    private String id;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_IS_BLOCKED)
    private boolean isBlocked = false;

    @JsonProperty("isBulkImport")
    private boolean isBulkImport;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_IS_CHILD)
    private boolean isChild;

    @JsonProperty(ContactProviderContract.PhoneNumberEntry.COLUMN_IS_HOME_GROUP)
    private boolean isHomeGroup;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_IS_LINKED)
    private boolean isLinked;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_IS_MERGED)
    private boolean isMerged;

    @JsonProperty("mergedContactIdentifiers")
    private List<String> mergedContactIdentifiers;

    @JsonProperty("name")
    private ContactName name;

    @JsonProperty("ownerCommsId")
    private String ownerCommsId;

    @JsonProperty("numbers")
    @JsonAlias({"numbers", ContactsModuleConstants.CONTACT_PHONE_NUMBERS})
    private List<ContactPhoneNumber> phoneNumbers;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_REFERENCE_COMMS_ID)
    private String referenceCommsId;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_REFERENCE_CONTACT_ID)
    private String referenceContactId;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_RELATIONSHIP)
    private String relationship;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_SHOULD_DISPLAY)
    private boolean shouldDisplay;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_SHOULD_MERGE)
    private boolean shouldMerge;

    @JsonProperty("sourceDeviceId")
    private String sourceDeviceId;

    public List<ContactAddress> getAddresses() {
        return this.addresses;
    }

    public List<String> getCommsIds() {
        return this.commsIds;
    }

    public String getCompany() {
        return this.company;
    }

    public ContactName getContactName() {
        return this.name;
    }

    public ContactPreferences getContactPreferences() {
        return this.contactPreferences;
    }

    public String getContactSourceType() {
        return this.contactSourceType;
    }

    public String getDeviceContactId() {
        return this.deviceContactId;
    }

    public List<ContactEmailAddress> getEmails() {
        return this.emails;
    }

    public String getHomeGroupIdentity() {
        return this.homeGroupIdentity;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getMergedContactIdentifiers() {
        return this.mergedContactIdentifiers;
    }

    public String getOwnerCommsId() {
        return this.ownerCommsId;
    }

    public List<ContactPhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public String getReferenceCommsId() {
        return this.referenceCommsId;
    }

    public String getReferenceContactId() {
        return this.referenceContactId;
    }

    public String getRelationship() {
        return this.relationship;
    }

    public String getSourceDeviceId() {
        return this.sourceDeviceId;
    }

    public boolean isAlexaEnabled() {
        return this.alexaEnabled;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public boolean isBulkImport() {
        return this.isBulkImport;
    }

    public boolean isChild() {
        return this.isChild;
    }

    public boolean isHomeGroup() {
        return this.isHomeGroup;
    }

    public boolean isLinked() {
        return this.isLinked;
    }

    public boolean isMerged() {
        return this.isMerged;
    }

    public boolean isShouldMerge() {
        return this.shouldMerge;
    }

    public void setAddresses(List<ContactAddress> list) {
        this.addresses = list;
    }

    public void setAlexaEnabled(boolean z) {
        this.alexaEnabled = z;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public void setBulkImport(boolean z) {
        this.isBulkImport = z;
    }

    public void setCommsIds(List<String> list) {
        this.commsIds = list;
    }

    public void setCompany(String str) {
        this.company = str;
    }

    public void setContactName(ContactName contactName) {
        this.name = contactName;
    }

    public void setContactPreferences(ContactPreferences contactPreferences) {
        this.contactPreferences = contactPreferences;
    }

    public void setContactSourceType(String str) {
        this.contactSourceType = str;
    }

    public void setDeviceContactId(String str) {
        this.deviceContactId = str;
    }

    public void setEmails(List<ContactEmailAddress> list) {
        this.emails = list;
    }

    public void setHomeGroup(boolean z) {
        this.isHomeGroup = z;
    }

    public void setHomeGroupIdentity(String str) {
        this.homeGroupIdentity = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIsChild(boolean z) {
        this.isChild = z;
    }

    public void setIsLinked(boolean z) {
        this.isLinked = z;
    }

    public void setIsMerged(boolean z) {
        this.isMerged = z;
    }

    public void setMergedContactIdentifiers(List<String> list) {
        this.mergedContactIdentifiers = list;
    }

    public void setOwnerCommsId(String str) {
        this.ownerCommsId = str;
    }

    public void setPhoneNumbers(List<ContactPhoneNumber> list) {
        this.phoneNumbers = list;
    }

    public void setReferenceCommsId(String str) {
        this.referenceCommsId = str;
    }

    public void setReferenceContactId(String str) {
        this.referenceContactId = str;
    }

    public void setRelationship(String str) {
        this.relationship = str;
    }

    public void setShouldDisplay(boolean z) {
        this.shouldDisplay = z;
    }

    public void setShouldMerge(boolean z) {
        this.shouldMerge = z;
    }

    public void setSourceDeviceId(String str) {
        this.sourceDeviceId = str;
    }

    public boolean shouldDisplay() {
        return this.shouldDisplay;
    }
}
