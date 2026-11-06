package com.amazon.deecomms.contacts.ui;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ContactListFragment$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ContactListFragment f$0;

    public /* synthetic */ ContactListFragment$$ExternalSyntheticLambda3(ContactListFragment contactListFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = contactListFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        ContactListFragment contactListFragment = this.f$0;
        switch (i) {
            case 0:
                contactListFragment.lambda$showAddContactIngress$10(view);
                break;
            case 1:
                contactListFragment.lambda$setupFooter$12(view);
                break;
            case 2:
                contactListFragment.lambda$setupFooter$13(view);
                break;
            default:
                contactListFragment.lambda$showImportContactIngress$11(view);
                break;
        }
    }
}
