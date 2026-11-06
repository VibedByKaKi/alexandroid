package com.amazon.alexa.location;

import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class GeofenceController$$ExternalSyntheticLambda1 implements SingleOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GeofenceController f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ GeofenceController$$ExternalSyntheticLambda1(GeofenceController geofenceController, List list, int i) {
        this.$r8$classId = i;
        this.f$0 = geofenceController;
        this.f$1 = list;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public final void subscribe(SingleEmitter singleEmitter) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$addGeofences$1(this.f$1, singleEmitter);
                break;
            default:
                this.f$0.lambda$removeGeofences$3(this.f$1, singleEmitter);
                break;
        }
    }
}
