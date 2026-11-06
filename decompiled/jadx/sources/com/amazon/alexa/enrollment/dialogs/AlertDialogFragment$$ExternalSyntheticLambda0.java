package com.amazon.alexa.enrollment.dialogs;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AlertDialogFragment$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlertDialogFragment f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ AlertDialogFragment$$ExternalSyntheticLambda0(AlertDialogFragment alertDialogFragment, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialogFragment;
        this.f$1 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createDialogWithTwoButton$1(this.f$1, dialogInterface, i);
                break;
            case 1:
                this.f$0.lambda$createDialogWithTwoButton$2(this.f$1, dialogInterface, i);
                break;
            default:
                this.f$0.lambda$createDialogWithOneButton$3(this.f$1, dialogInterface, i);
                break;
        }
    }
}
