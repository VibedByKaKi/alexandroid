package com.amazon.deecomms.perms;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.amazon.tarazed.dialog.AlertDialogBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class PermissionsHelper$$ExternalSyntheticLambda1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlertDialog f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ PermissionsHelper$$ExternalSyntheticLambda1(AlertDialogBuilder alertDialogBuilder, AlertDialog alertDialog) {
        this.$r8$classId = 2;
        this.f$1 = alertDialogBuilder;
        this.f$0 = alertDialog;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                PermissionsHelper.lambda$showPermissionNotAvailableDialog$1(this.f$0, (Context) this.f$1, dialogInterface);
                break;
            case 1:
                com.amazon.comms.calling.presentation.ui.utils.PermissionsHelper.showPermissionNotAvailableDialog$lambda$3(this.f$0, (com.amazon.comms.calling.presentation.ui.utils.PermissionsHelper) this.f$1, dialogInterface);
                break;
            default:
                AlertDialogBuilder.create$lambda$2((AlertDialogBuilder) this.f$1, this.f$0, dialogInterface);
                break;
        }
    }

    public /* synthetic */ PermissionsHelper$$ExternalSyntheticLambda1(AlertDialog alertDialog, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialog;
        this.f$1 = obj;
    }
}
