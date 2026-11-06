package com.dee.app.contacts.interfaces.models.apis.getcontacts;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetActiveContactsQueryConfig {
    private boolean includeInactiveContacts;
    private boolean onlyDropInContacts;
    private boolean returnAsHomeGroupContacts;

    public GetActiveContactsQueryConfig(boolean z, boolean z2, boolean z3) {
        this.includeInactiveContacts = z;
        this.onlyDropInContacts = z3;
        this.returnAsHomeGroupContacts = z2;
    }

    public boolean isIncludeInactiveContacts() {
        return this.includeInactiveContacts;
    }

    public boolean isOnlyDropInContacts() {
        return this.onlyDropInContacts;
    }

    public boolean isReturnAsHomeGroupContacts() {
        return this.returnAsHomeGroupContacts;
    }
}
