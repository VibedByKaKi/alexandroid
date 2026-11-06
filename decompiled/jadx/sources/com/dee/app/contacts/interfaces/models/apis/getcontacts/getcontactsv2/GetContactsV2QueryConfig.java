package com.dee.app.contacts.interfaces.models.apis.getcontacts.getcontactsv2;

import com.dee.app.contacts.interfaces.models.data.enums.DedupeMode;
import com.dee.app.contacts.interfaces.models.data.enums.OwnerIdType;
import com.dee.app.contacts.interfaces.models.data.enums.PreferenceLevel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetContactsV2QueryConfig {
    private Boolean bulkImportOnly;
    private DedupeMode dedupeMode;
    private Boolean includeBlockStatus;
    private Boolean includeHomeGroupMembers;
    private Boolean includeMergedContacts;
    private Boolean includeNonAlexaEnabledContacts;
    private OwnerIdType ownerIdType;
    private PreferenceLevel preferenceLevel = PreferenceLevel.NONE;

    public GetContactsV2QueryConfig() {
        Boolean bool = Boolean.TRUE;
        this.includeHomeGroupMembers = bool;
        this.includeNonAlexaEnabledContacts = bool;
        this.bulkImportOnly = Boolean.FALSE;
        this.includeBlockStatus = bool;
        this.dedupeMode = DedupeMode.REMOVE_CLOUD_ONLY;
        this.includeMergedContacts = bool;
    }

    public Boolean getBulkImportOnly() {
        return this.bulkImportOnly;
    }

    public DedupeMode getDedupeMode() {
        return this.dedupeMode;
    }

    public Boolean getIncludeBlockStatus() {
        return this.includeBlockStatus;
    }

    public Boolean getIncludeHomeGroupMembers() {
        return this.includeHomeGroupMembers;
    }

    public Boolean getIncludeMergedContacts() {
        return this.includeMergedContacts;
    }

    public Boolean getIncludeNonAlexaEnabledContacts() {
        return this.includeNonAlexaEnabledContacts;
    }

    public OwnerIdType getOwnerIdType() {
        return this.ownerIdType;
    }

    public PreferenceLevel getPreferenceLevel() {
        return this.preferenceLevel;
    }

    public void setBulkImportOnly(Boolean bool) {
        this.bulkImportOnly = bool;
    }

    public void setDedupeMode(DedupeMode dedupeMode) {
        this.dedupeMode = dedupeMode;
    }

    public void setIncludeBlockStatus(Boolean bool) {
        this.includeBlockStatus = bool;
    }

    public void setIncludeHomeGroupMembers(Boolean bool) {
        this.includeHomeGroupMembers = bool;
    }

    public void setIncludeMergedContacts(Boolean bool) {
        this.includeMergedContacts = bool;
    }

    public void setIncludeNonAlexaEnabledContacts(Boolean bool) {
        this.includeNonAlexaEnabledContacts = bool;
    }

    public void setOwnerIdType(OwnerIdType ownerIdType) {
        this.ownerIdType = ownerIdType;
    }

    public void setPreferenceLevel(PreferenceLevel preferenceLevel) {
        this.preferenceLevel = preferenceLevel;
    }
}
