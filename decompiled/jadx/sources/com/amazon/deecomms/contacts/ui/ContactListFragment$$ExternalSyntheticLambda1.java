package com.amazon.deecomms.contacts.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ContactListFragment$$ExternalSyntheticLambda1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ContactListFragment$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                dialogInterface.dismiss();
                break;
            case 2:
                dialogInterface.dismiss();
                break;
            case 3:
                dialogInterface.dismiss();
                break;
            case 4:
                ContactBlockFragment.lambda$blockContact$2(dialogInterface, i);
                break;
            case 5:
                ContactCardFragment.lambda$showRemoveDropInWarningDialog$19(dialogInterface, i);
                break;
            case 6:
                dialogInterface.dismiss();
                break;
            case 7:
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
