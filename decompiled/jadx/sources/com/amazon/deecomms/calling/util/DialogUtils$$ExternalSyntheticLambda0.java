package com.amazon.deecomms.calling.util;

import android.content.DialogInterface;
import com.amazon.deecomms.common.ApplicationManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class DialogUtils$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ApplicationManager f$0;

    public /* synthetic */ DialogUtils$$ExternalSyntheticLambda0(ApplicationManager applicationManager, int i) {
        this.$r8$classId = i;
        this.f$0 = applicationManager;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$r8$classId;
        ApplicationManager applicationManager = this.f$0;
        switch (i2) {
            case 0:
                DialogUtils.lambda$showAnnouncementDeviceDialog$0(applicationManager, dialogInterface, i);
                break;
            default:
                DropInUtils.lambda$showDeviceDialog$2(applicationManager, dialogInterface, i);
                break;
        }
    }
}
