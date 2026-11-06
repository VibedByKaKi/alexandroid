package com.amazon.alexa.enrollment.dialogs;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AlertDialogFragment$$ExternalSyntheticLambda2 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ AlertDialogFragment$$ExternalSyntheticLambda2(int i, String str, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = str;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        boolean lambda$onCreateDialog$0;
        boolean lambda$onCreateDialog$02;
        switch (this.$r8$classId) {
            case 0:
                lambda$onCreateDialog$0 = ((AlertDialogFragment) this.f$0).lambda$onCreateDialog$0(this.f$1, dialogInterface, i, keyEvent);
                return lambda$onCreateDialog$0;
            default:
                lambda$onCreateDialog$02 = ((com.amazon.alexa.handsfree.ui.views.AlertDialogFragment) this.f$0).lambda$onCreateDialog$0(this.f$1, dialogInterface, i, keyEvent);
                return lambda$onCreateDialog$02;
        }
    }
}
