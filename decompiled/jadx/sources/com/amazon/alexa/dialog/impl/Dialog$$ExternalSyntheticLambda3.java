package com.amazon.alexa.dialog.impl;

import android.content.DialogInterface;
import com.amazon.alexa.smarthomecameras.view.CameraView;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomSheetController;
import com.amazon.dee.app.services.accessibility.TalkBackDialogService;
import com.amazon.dee.app.services.appreviewrequest.AppReviewRequestService;
import com.amazon.tarazed.dialog.AbstractDialog;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class Dialog$$ExternalSyntheticLambda3 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Dialog$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Dialog.buildAlertDialog$lambda$5((Dialog) obj, dialogInterface);
                break;
            case 1:
                ((CameraView) obj).lambda$showMicPermissionPrimer$7(dialogInterface);
                break;
            case 2:
                ((BottomSheetController) obj).lambda$setCancelDialogOnTouchOutside$8(dialogInterface);
                break;
            case 3:
                ((TalkBackDialogService) obj).lambda$showDialogOnMainThread$3(dialogInterface);
                break;
            case 4:
                ((AppReviewRequestService) obj).lambda$createAlertDialog$8(dialogInterface);
                break;
            default:
                AbstractDialog.buildDialog$lambda$3((AbstractDialog) obj, dialogInterface);
                break;
        }
    }
}
