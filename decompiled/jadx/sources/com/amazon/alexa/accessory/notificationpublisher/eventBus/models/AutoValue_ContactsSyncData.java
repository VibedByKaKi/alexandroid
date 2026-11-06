package com.amazon.alexa.accessory.notificationpublisher.eventBus.models;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.eventBus.models.ContactsSyncData;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class AutoValue_ContactsSyncData extends ContactsSyncData {
    private final String contactId;
    private final Name name;
    private final SyncType syncType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ContactsSyncData.Builder {
        private String contactId;
        private Name name;
        private SyncType syncType;

        @Override // com.amazon.alexa.accessory.notificationpublisher.eventBus.models.ContactsSyncData.Builder
        public ContactsSyncData build() {
            String str;
            Name name;
            SyncType syncType = this.syncType;
            if (syncType != null && (str = this.contactId) != null && (name = this.name) != null) {
                return new AutoValue_ContactsSyncData(syncType, str, name, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.syncType == null) {
                sb.append(" syncType");
            }
            if (this.contactId == null) {
                sb.append(" contactId");
            }
            if (this.name == null) {
                sb.append(" name");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.eventBus.models.ContactsSyncData.Builder
        public ContactsSyncData.Builder setContactId(String str) {
            if (str != null) {
                this.contactId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null contactId");
            return null;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.eventBus.models.ContactsSyncData.Builder
        public ContactsSyncData.Builder setName(Name name) {
            if (name != null) {
                this.name = name;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            return null;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.eventBus.models.ContactsSyncData.Builder
        public ContactsSyncData.Builder setSyncType(SyncType syncType) {
            if (syncType != null) {
                this.syncType = syncType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null syncType");
            return null;
        }
    }

    private AutoValue_ContactsSyncData(SyncType syncType, String str, Name name) {
        this.syncType = syncType;
        this.contactId = str;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContactsSyncData) {
            ContactsSyncData contactsSyncData = (ContactsSyncData) obj;
            if (this.syncType.equals(contactsSyncData.getSyncType()) && this.contactId.equals(contactsSyncData.getContactId()) && this.name.equals(contactsSyncData.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.eventBus.models.ContactsSyncData
    public String getContactId() {
        return this.contactId;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.eventBus.models.ContactsSyncData
    public Name getName() {
        return this.name;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.eventBus.models.ContactsSyncData
    public SyncType getSyncType() {
        return this.syncType;
    }

    public int hashCode() {
        return this.name.hashCode() ^ ((((this.syncType.hashCode() ^ 1000003) * 1000003) ^ this.contactId.hashCode()) * 1000003);
    }

    public String toString() {
        return "ContactsSyncData{syncType=" + this.syncType + ", contactId=" + this.contactId + ", name=" + this.name + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_ContactsSyncData(SyncType syncType, String str, Name name, int i) {
        this(syncType, str, name);
    }
}
