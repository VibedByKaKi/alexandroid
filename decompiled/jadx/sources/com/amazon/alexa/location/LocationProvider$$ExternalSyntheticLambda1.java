package com.amazon.alexa.location;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.core.SingleEmitter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LocationProvider$$ExternalSyntheticLambda1 implements OnCompleteListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SingleEmitter f$0;

    public /* synthetic */ LocationProvider$$ExternalSyntheticLambda1(SingleEmitter singleEmitter, int i) {
        this.$r8$classId = i;
        this.f$0 = singleEmitter;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i = this.$r8$classId;
        SingleEmitter singleEmitter = this.f$0;
        switch (i) {
            case 0:
                LocationProvider.lambda$getMostRecentLocation$0(singleEmitter, task);
                break;
            default:
                GeofenceController.lambda$getLocationSettings$4(singleEmitter, task);
                break;
        }
    }
}
