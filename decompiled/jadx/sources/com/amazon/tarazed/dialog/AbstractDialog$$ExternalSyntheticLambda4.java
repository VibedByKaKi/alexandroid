package com.amazon.tarazed.dialog;

import android.content.DialogInterface;
import com.amazon.deecomms.calling.ui.CallActivity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AbstractDialog$$ExternalSyntheticLambda4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AbstractDialog$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                AbstractDialog.onDismissListener$lambda$2((AbstractDialog) obj, dialogInterface);
                break;
            case 1:
                ((CallActivity) obj).lambda$onRequestPermissionsResult$1(dialogInterface);
                break;
            default:
                ((CallActivity) obj).lambda$checkCallPermissions$5(dialogInterface);
                break;
        }
    }
}
