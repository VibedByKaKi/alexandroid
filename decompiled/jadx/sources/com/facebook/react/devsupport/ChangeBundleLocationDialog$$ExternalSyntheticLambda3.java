package com.facebook.react.devsupport;

import android.app.AlertDialog;
import android.view.View;
import com.facebook.react.devsupport.interfaces.DevSupportManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ChangeBundleLocationDialog$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ChangeBundleLocationDialog$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((AlertDialog) obj).dismiss();
                break;
            default:
                ((DevSupportManager.PausedInDebuggerOverlayCommandListener) obj).onResume();
                break;
        }
    }
}
