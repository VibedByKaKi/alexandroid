package com.amazon.deecomms.contacts.presence.model;

import com.amazon.alexa.accessory.notificationpublisher.storage.SettingsStorageModule;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PresenceDocument {

    @JsonIgnore
    public static final String ACTIVE_KEY = "ACTIVE";

    @JsonIgnore
    public static final String INACTIVE_KEY = "INACTIVE";

    @JsonProperty("contactHomegroupId")
    private String contactHomegroupId;

    @JsonProperty(SettingsStorageModule.FILTER_SETTINGS_CONTACT_ID_KEY)
    private String contactId;

    @JsonProperty("contactLastName")
    private String contactLastName;

    @JsonProperty(SettingsStorageModule.FILTER_SETTINGS_CONTACT_NAME_KEY)
    private String contactName;

    @JsonProperty("contactPresenceDetectedTime")
    private long detectedTime;

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("contactPresenceStatus")
    private String presenceStatus;

    @JsonProperty("sourceContact")
    private boolean sourceContact;

    public String getContactHomegroupId() {
        return this.contactHomegroupId;
    }

    public String getContactId() {
        return this.contactId;
    }

    public String getContactLastName() {
        return this.contactLastName;
    }

    public String getContactName() {
        return this.contactName;
    }

    public long getDetectedTime() {
        return this.detectedTime;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getPresenceStatus() {
        return this.presenceStatus;
    }

    public boolean isActive() {
        return "ACTIVE".contentEquals(this.presenceStatus);
    }

    public boolean isSourceContact() {
        return this.sourceContact;
    }

    public void setContactHomegroupId(String str) {
        this.contactHomegroupId = str;
    }

    public void setContactId(String str) {
        this.contactId = str;
    }

    public void setContactLastName(String str) {
        this.contactLastName = str;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setDetectedTime(long j) {
        this.detectedTime = j;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public void setPresenceStatus(String str) {
        this.presenceStatus = str;
    }

    public void setSourceContact(boolean z) {
        this.sourceContact = z;
    }
}
