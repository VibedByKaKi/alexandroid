package com.amazon.deecomms.contacts.ui;

import com.amazon.deecomms.contacts.model.Contact;
import com.amazon.deecomms.contacts.ui.ContactBlockFragment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ContactBlockFragment$$ExternalSyntheticLambda0 implements ContactBlockFragment.OnContactSelectedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ContactBlockFragment f$0;

    public /* synthetic */ ContactBlockFragment$$ExternalSyntheticLambda0(ContactBlockFragment contactBlockFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = contactBlockFragment;
    }

    @Override // com.amazon.deecomms.contacts.ui.ContactBlockFragment.OnContactSelectedListener
    public final void onContactSelected(Contact contact) {
        int i = this.$r8$classId;
        ContactBlockFragment contactBlockFragment = this.f$0;
        switch (i) {
            case 0:
                contactBlockFragment.onContactSelected(contact);
                break;
            default:
                contactBlockFragment.onContactClicked(contact);
                break;
        }
    }
}
