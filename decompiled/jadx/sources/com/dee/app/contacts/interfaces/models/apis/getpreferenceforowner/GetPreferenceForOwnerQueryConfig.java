package com.dee.app.contacts.interfaces.models.apis.getpreferenceforowner;

import com.dee.app.contacts.interfaces.models.data.enums.OwnerIdType;
import com.dee.app.contacts.interfaces.models.data.enums.PreferenceNameSpace;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetPreferenceForOwnerQueryConfig {
    private OwnerIdType ownerIdType;
    private PreferenceNameSpace preferenceNameSpace;
    private String target;

    public OwnerIdType getOwnerIdType() {
        return this.ownerIdType;
    }

    public PreferenceNameSpace getPreferenceNameSpace() {
        return this.preferenceNameSpace;
    }

    public String getTarget() {
        return this.target;
    }

    public void setOwnerIdType(OwnerIdType ownerIdType) {
        this.ownerIdType = ownerIdType;
    }

    public void setPreferenceNameSpace(PreferenceNameSpace preferenceNameSpace) {
        this.preferenceNameSpace = preferenceNameSpace;
    }

    public void setTarget(String str) {
        this.target = str;
    }
}
