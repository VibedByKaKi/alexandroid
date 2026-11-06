package com.amazon.deecomms.nativemodules.model;

import com.amazon.deecomms.contacts.model.Contact;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BridgeContact extends Contact {
    private boolean mCanDropInOnMe;
    private boolean mCanIDropInOnHim;

    @Override // com.amazon.deecomms.contacts.model.Contact
    public int canDropInOnMe() {
        return this.mCanDropInOnMe ? 1 : 0;
    }

    @Override // com.amazon.deecomms.contacts.model.Contact
    public int canIDropInOnHim() {
        return this.mCanIDropInOnHim ? 1 : 0;
    }

    public void setCanDropInOnMe(boolean z) {
        this.mCanDropInOnMe = z;
    }

    public void setCanIDropInOnHim(boolean z) {
        this.mCanIDropInOnHim = z;
    }
}
