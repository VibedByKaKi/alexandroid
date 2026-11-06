package com.amazon.alexa.location.phase3.sensor.activity;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ActivitySensor$$ExternalSyntheticLambda0 implements ResultCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivitySensor f$0;

    public /* synthetic */ ActivitySensor$$ExternalSyntheticLambda0(ActivitySensor activitySensor, int i) {
        this.$r8$classId = i;
        this.f$0 = activitySensor;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(Result result) {
        int i = this.$r8$classId;
        ActivitySensor activitySensor = this.f$0;
        Status status = (Status) result;
        switch (i) {
            case 0:
                activitySensor.lambda$stopInternal$1(status);
                break;
            default:
                activitySensor.lambda$startInternal$0(status);
                break;
        }
    }
}
