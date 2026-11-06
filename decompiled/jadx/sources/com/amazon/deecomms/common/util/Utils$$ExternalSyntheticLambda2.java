package com.amazon.deecomms.common.util;

import android.content.DialogInterface;
import com.amazon.alexa.identity.bootstrapInvitation.ui.BootstrapInvitationLogoutConfirmationFragment;
import com.amazon.comms.calling.presentation.ui.utils.PermissionsHelper;
import com.amazon.deecomms.calling.util.DialogUtils;
import com.amazon.deecomms.calling.util.DropInUtils;
import com.amazon.deecomms.contacts.util.BlockContactHelper;
import com.amazon.deecomms.oobe.OOBEActivity;
import io.branch.referral.validators.IntegrationValidatorDialogRowItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class Utils$$ExternalSyntheticLambda2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Utils$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                BootstrapInvitationLogoutConfirmationFragment.lambda$presentSignOutAlertDialogBuilder$1(dialogInterface, i);
                break;
            case 2:
                PermissionsHelper.showPermissionNotAvailableDialog$lambda$2(dialogInterface, i);
                break;
            case 3:
                dialogInterface.dismiss();
                break;
            case 4:
                DialogUtils.lambda$showAnnouncementDeviceDialog$1(dialogInterface, i);
                break;
            case 5:
                DropInUtils.lambda$showLearnMoreDialog$1(dialogInterface, i);
                break;
            case 6:
                DropInUtils.lambda$showDeviceDialog$3(dialogInterface, i);
                break;
            case 7:
                DropInUtils.lambda$showProfileDialog$5(dialogInterface, i);
                break;
            case 8:
                BlockContactHelper.lambda$blockContact$2(dialogInterface, i);
                break;
            case 9:
                OOBEActivity.lambda$showUnprovisionedUserDialog$1(dialogInterface, i);
                break;
            case 10:
                dialogInterface.dismiss();
                break;
            default:
                IntegrationValidatorDialogRowItem.lambda$new$0(dialogInterface, i);
                break;
        }
    }
}
