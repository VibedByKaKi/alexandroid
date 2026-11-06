package com.amazon.deecomms.contacts.ui;

import android.content.DialogInterface;
import com.amazon.deecomms.contacts.ui.ContactBlockFragment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ContactListFragment$$ExternalSyntheticLambda9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ContactListFragment$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                ((ContactListFragment) obj).lambda$showResultsDialog$5(dialogInterface, i);
                break;
            default:
                ((ContactBlockFragment.AnonymousClass1) obj).lambda$onPostExecute$0(dialogInterface, i);
                break;
        }
    }
}
