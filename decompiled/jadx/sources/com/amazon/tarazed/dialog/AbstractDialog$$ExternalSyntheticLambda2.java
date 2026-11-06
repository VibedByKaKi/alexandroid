package com.amazon.tarazed.dialog;

import android.content.DialogInterface;
import com.amazon.alexa.biloba.utils.CommsHelper;
import com.amazon.alexa.biloba.view.alertsv2.edit.EditAlertView;
import com.amazon.alexa.biloba.view.dashboard.CardTransformer;
import com.amazon.alexa.biloba.view.dashboard.RemoteManagementInactivityHandler;
import com.amazon.alexa.identity.bootstrapInvitation.ui.BootstrapInvitationLogoutConfirmationFragment;
import com.amazon.alexa.smarthomecameras.view.CameraView;
import com.amazon.deecomms.calling.ui.NewCallActivity;
import com.amazon.deecomms.calling.ui.SIPRegistrationErrorDialogActivity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AbstractDialog$$ExternalSyntheticLambda2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AbstractDialog$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                AbstractDialog.onPositiveButtonClickedListener$lambda$0((AbstractDialog) obj, dialogInterface, i);
                break;
            case 1:
                ((CommsHelper) obj).lambda$displaySetupDialog$0(dialogInterface, i);
                break;
            case 2:
                ((EditAlertView) obj).lambda$onMenuItemClick$0(dialogInterface, i);
                break;
            case 3:
                ((CardTransformer) obj).lambda$displayErrorDialog$5(dialogInterface, i);
                break;
            case 4:
                ((RemoteManagementInactivityHandler) obj).lambda$getRemoteManagementEndDialog$5(dialogInterface, i);
                break;
            case 5:
                ((BootstrapInvitationLogoutConfirmationFragment) obj).lambda$presentSignOutAlertDialogBuilder$0(dialogInterface, i);
                break;
            case 6:
                ((CameraView) obj).lambda$showMicPermissionPrimer$6(dialogInterface, i);
                break;
            case 7:
                ((NewCallActivity) obj).lambda$showErrorDialog$3(dialogInterface, i);
                break;
            case 8:
                ((SIPRegistrationErrorDialogActivity) obj).lambda$onCreate$0(dialogInterface, i);
                break;
            case 9:
                ((Runnable) obj).run();
                break;
            default:
                AbstractAskPermissionDialog.onNegativeButtonClickedListener$lambda$0((AbstractAskPermissionDialog) obj, dialogInterface, i);
                break;
        }
    }
}
