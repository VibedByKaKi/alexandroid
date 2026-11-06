package com.dee.app.contacts.interfaces.models.data;

import com.amazon.alexa.accessory.notificationpublisher.storage.SettingsStorageModule;
import com.dee.app.contacts.interfaces.models.data.enums.ActiveState;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PresenceContact {

    @JsonProperty("contactHomegroupId")
    private String contactHomegroupId;

    @JsonProperty(SettingsStorageModule.FILTER_SETTINGS_CONTACT_ID_KEY)
    private String contactId;

    @JsonProperty(SettingsStorageModule.FILTER_SETTINGS_CONTACT_NAME_KEY)
    private String contactName;

    @JsonProperty("contactPresenceStatus")
    private ActiveState contactPresenceStatus;

    public String getContactHomegroupId() {
        return this.contactHomegroupId;
    }

    public String getContactId() {
        return this.contactId;
    }

    public String getContactName() {
        return this.contactName;
    }

    public ActiveState getContactPresenceStatus() {
        return this.contactPresenceStatus;
    }

    public void setContactHomegroupId(String str) {
        this.contactHomegroupId = str;
    }

    public void setContactId(String str) {
        this.contactId = str;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setContactPresenceStatus(ActiveState activeState) {
        this.contactPresenceStatus = activeState;
    }
}
