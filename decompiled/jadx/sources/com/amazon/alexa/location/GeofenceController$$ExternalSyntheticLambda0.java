package com.amazon.alexa.location;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class GeofenceController$$ExternalSyntheticLambda0 implements OnCompleteListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GeofenceController f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ SingleEmitter f$2;

    public /* synthetic */ GeofenceController$$ExternalSyntheticLambda0(GeofenceController geofenceController, List list, SingleEmitter singleEmitter, int i) {
        this.$r8$classId = i;
        this.f$0 = geofenceController;
        this.f$1 = list;
        this.f$2 = singleEmitter;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$addGeofences$0(this.f$1, this.f$2, task);
                break;
            default:
                this.f$0.lambda$removeGeofences$2(this.f$1, this.f$2, task);
                break;
        }
    }
}
