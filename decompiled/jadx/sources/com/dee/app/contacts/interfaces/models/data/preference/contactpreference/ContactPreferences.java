package com.dee.app.contacts.interfaces.models.data.preference.contactpreference;

import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactPreferences {

    @JsonAlias({"BLOCKED_CONTACT", "blocked"})
    private boolean blocked;

    @JsonProperty("canDropIn")
    @JsonAlias({"CAN_I_DROP_IN", "canDropIn"})
    private boolean canDropIn;

    @JsonProperty(ContactProviderContract.ContactDatabaseEntry.COLUMN_CAN_DROP_IN_ON_ME)
    @JsonAlias({"CAN_DROP_IN_ON_ME", ContactProviderContract.ContactDatabaseEntry.COLUMN_CAN_DROP_IN_ON_ME})
    private boolean canDropInOnMe;

    @JsonProperty("emergencyPreference")
    @JsonAlias({"EMERGENCY_CONTACT", "emergencyPreference"})
    private boolean emergencyPreference;

    @JsonProperty("favoritePreference")
    @JsonAlias({"FAVORITE_CONTACT", "favoritePreference"})
    private boolean favoritePreference;

    public boolean isBlocked() {
        return this.blocked;
    }

    public boolean isCanDropIn() {
        return this.canDropIn;
    }

    public boolean isCanDropInOnMe() {
        return this.canDropInOnMe;
    }

    public boolean isEmergencyPreference() {
        return this.emergencyPreference;
    }

    public boolean isFavoritePreference() {
        return this.favoritePreference;
    }

    public void setBlocked(boolean z) {
        this.blocked = z;
    }

    public void setCanDropIn(boolean z) {
        this.canDropIn = z;
    }

    public void setCanDropInOnMe(boolean z) {
        this.canDropInOnMe = z;
    }

    public void setEmergencyPreference(boolean z) {
        this.emergencyPreference = z;
    }

    public void setFavoritePreference(boolean z) {
        this.favoritePreference = z;
    }
}
