package com.amazon.alexa.handsfree.ui.views;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AlertDialogFragment$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlertDialogFragment f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ AlertDialogFragment$$ExternalSyntheticLambda0(AlertDialogFragment alertDialogFragment, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = alertDialogFragment;
        this.f$1 = str;
        this.f$2 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getPositiveButtonClickListener$1(this.f$1, this.f$2, dialogInterface, i);
                break;
            default:
                this.f$0.lambda$getNegativeButtonClickListener$2(this.f$1, this.f$2, dialogInterface, i);
                break;
        }
    }
}
