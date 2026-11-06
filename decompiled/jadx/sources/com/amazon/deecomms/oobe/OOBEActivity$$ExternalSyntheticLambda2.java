package com.amazon.deecomms.oobe;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class OOBEActivity$$ExternalSyntheticLambda2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OOBEActivity f$0;

    public /* synthetic */ OOBEActivity$$ExternalSyntheticLambda2(OOBEActivity oOBEActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = oOBEActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$r8$classId;
        OOBEActivity oOBEActivity = this.f$0;
        switch (i2) {
            case 0:
                oOBEActivity.lambda$showDeprovisionedUserDialog$3(dialogInterface, i);
                break;
            case 1:
                oOBEActivity.lambda$showDeprovisionedUserDialog$4(dialogInterface, i);
                break;
            default:
                oOBEActivity.lambda$showUnprovisionedUserDialog$2(dialogInterface, i);
                break;
        }
    }
}
