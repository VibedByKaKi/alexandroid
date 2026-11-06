package com.amazon.tarazed.dialog;

import android.content.DialogInterface;
import com.amazon.dee.app.services.appreviewrequest.AppReviewRequestService;
import com.reactcommunity.rndatetimepicker.Common;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AbstractDialog$$ExternalSyntheticLambda1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AbstractDialog$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                AbstractDialog.buildDialog$lambda$4((AbstractDialog) obj, dialogInterface);
                break;
            case 1:
                ((AppReviewRequestService) obj).lambda$createAlertDialog$7(dialogInterface);
                break;
            default:
                Common.lambda$combine$2((DialogInterface.OnShowListener[]) obj, dialogInterface);
                break;
        }
    }
}
