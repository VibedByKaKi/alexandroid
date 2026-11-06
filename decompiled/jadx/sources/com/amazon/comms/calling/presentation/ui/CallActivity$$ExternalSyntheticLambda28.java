package com.amazon.comms.calling.presentation.ui;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class CallActivity$$ExternalSyntheticLambda28 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CallActivity f$0;

    public /* synthetic */ CallActivity$$ExternalSyntheticLambda28(CallActivity callActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = callActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        CallActivity callActivity = this.f$0;
        switch (i) {
            case 0:
                CallActivity.setUpButtons$lambda$16(callActivity, view);
                break;
            case 1:
                CallActivity.setUpButtons$lambda$26(callActivity, view);
                break;
            case 2:
                CallActivity.setUpButtons$lambda$27(callActivity, view);
                break;
            case 3:
                CallActivity.setUpButtons$lambda$28(callActivity, view);
                break;
            case 4:
                CallActivity.setUpButtons$lambda$17(callActivity, view);
                break;
            case 5:
                CallActivity.setUpButtons$lambda$18(callActivity, view);
                break;
            case 6:
                CallActivity.setUpButtons$lambda$19(callActivity, view);
                break;
            case 7:
                CallActivity.setUpButtons$lambda$20(callActivity, view);
                break;
            case 8:
                CallActivity.setUpButtons$lambda$21(callActivity, view);
                break;
            case 9:
                CallActivity.setUpButtons$lambda$22(callActivity, view);
                break;
            case 10:
                CallActivity.setUpButtons$lambda$23(callActivity, view);
                break;
            case 11:
                CallActivity.setUpButtons$lambda$24(callActivity, view);
                break;
            case 12:
                CallActivity.setUpButtons$lambda$25(callActivity, view);
                break;
            default:
                CallActivity.setUpViewClickListener$lambda$57(callActivity, view);
                break;
        }
    }
}
