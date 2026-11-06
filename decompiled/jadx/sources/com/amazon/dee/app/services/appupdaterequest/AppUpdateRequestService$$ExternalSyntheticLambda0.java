package com.amazon.dee.app.services.appupdaterequest;

import android.app.Activity;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.appupdate.AppUpdateInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final /* synthetic */ class AppUpdateRequestService$$ExternalSyntheticLambda0 implements OnSuccessListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AppUpdateRequestService f$0;
    public final /* synthetic */ Activity f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ AppUpdateRequestService$$ExternalSyntheticLambda0(AppUpdateRequestService appUpdateRequestService, Activity activity, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = appUpdateRequestService;
        this.f$1 = activity;
        this.f$2 = i;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkForUpdate$0(this.f$1, this.f$2, (AppUpdateInfo) obj);
                break;
            default:
                this.f$0.lambda$checkForUpdateStallOnResume$1(this.f$1, this.f$2, (AppUpdateInfo) obj);
                break;
        }
    }
}
