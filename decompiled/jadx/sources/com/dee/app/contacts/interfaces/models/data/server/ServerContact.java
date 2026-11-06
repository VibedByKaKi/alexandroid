package com.dee.app.contacts.interfaces.models.data.server;

import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.dee.app.contacts.interfaces.models.data.ContactAddress;
import com.dee.app.contacts.interfaces.models.data.ContactEmailAddress;
import com.dee.app.contacts.interfaces.models.data.ContactName;
import com.dee.app.contacts.interfaces.models.data.ContactPhoneNumber;
import com.dee.app.contacts.interfaces.models.data.IdentityRawData;
import com.dee.app.contacts.interfaces.models.data.PreferenceInfo;
import com.dee.app.contacts.interfaces.models.data.enums.ContactPreferenceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ServerContact {

    @JsonProperty("addresses")
    private List<ContactAddress> addresses;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_ALEXA_ENABLED)
    private boolean alexaEnabled;

    @JsonProperty("commsIds")
    private List<IdentityRawData> commsIdentities;

    @JsonProperty("commsId")
    private List<String> commsIds;

    @JsonProperty("commsIdsPreferences")
    private Map<String, Map<ContactPreferenceType, Map<String, String>>> commsIdsPreferences;

    @JsonProperty("company")
    private String company;

    @JsonProperty("contactPreferenceInfoList")
    private List<PreferenceInfo> contactPreferenceInfoList;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_CONTACT_SOURCE_TYPE)
    private String contactSourceType;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_DEVICE_CONTACT_ID)
    private String deviceContactId;

    @JsonProperty("emails")
    private List<ContactEmailAddress> emails;

    @JsonProperty("homeGroupId")
    private IdentityRawData homeGroupIdentity;

    @JsonProperty("id")
    private String id;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_IS_BLOCKED)
    private boolean isBlocked;

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

    public List<IdentityRawData> getCommsIdentities() {
        return this.commsIdentities;
    }

    public List<String> getCommsIds() {
        return this.commsIds;
    }

    public Map<String, Map<ContactPreferenceType, Map<String, String>>> getCommsIdsPreferences() {
        return this.commsIdsPreferences;
    }

    public String getCompany() {
        return this.company;
    }

    public List<PreferenceInfo> getContactPreferenceInfoList() {
        return this.contactPreferenceInfoList;
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

    public IdentityRawData getHomeGroupIdentity() {
        return this.homeGroupIdentity;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getMergedContactIdentifiers() {
        return this.mergedContactIdentifiers;
    }

    public ContactName getName() {
        return this.name;
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

    public boolean isShouldDisplay() {
        return this.shouldDisplay;
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

    public void setChild(boolean z) {
        this.isChild = z;
    }

    public void setCommsIdentities(List<IdentityRawData> list) {
        this.commsIdentities = list;
    }

    public void setCommsIds(List<String> list) {
        this.commsIds = list;
    }

    public void setCommsIdsPreferences(Map<String, Map<ContactPreferenceType, Map<String, String>>> map) {
        this.commsIdsPreferences = map;
    }

    public void setCompany(String str) {
        this.company = str;
    }

    public void setContactPreferenceInfoList(List<PreferenceInfo> list) {
        this.contactPreferenceInfoList = list;
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

    public void setHomeGroupIdentity(IdentityRawData identityRawData) {
        this.homeGroupIdentity = identityRawData;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLinked(boolean z) {
        this.isLinked = z;
    }

    public void setMerged(boolean z) {
        this.isMerged = z;
    }

    public void setMergedContactIdentifiers(List<String> list) {
        this.mergedContactIdentifiers = list;
    }

    public void setName(ContactName contactName) {
        this.name = contactName;
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
}
