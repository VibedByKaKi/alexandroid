package com.amazon.deecomms.calling.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NewCallActivity$$ExternalSyntheticLambda4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NewCallActivity f$0;

    public /* synthetic */ NewCallActivity$$ExternalSyntheticLambda4(NewCallActivity newCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = newCallActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.$r8$classId;
        NewCallActivity newCallActivity = this.f$0;
        switch (i) {
            case 0:
                newCallActivity.lambda$onRequestPermissionsResult$2(dialogInterface);
                break;
            default:
                newCallActivity.lambda$requestCallPermission$0(dialogInterface);
                break;
        }
    }
}
