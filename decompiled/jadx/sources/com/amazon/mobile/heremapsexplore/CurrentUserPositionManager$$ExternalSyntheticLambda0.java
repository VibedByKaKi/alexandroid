package com.amazon.mobile.heremapsexplore;

import android.location.Location;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CurrentUserPositionManager$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CurrentUserPositionManager f$0;

    public /* synthetic */ CurrentUserPositionManager$$ExternalSyntheticLambda0(CurrentUserPositionManager currentUserPositionManager, int i) {
        this.$r8$classId = i;
        this.f$0 = currentUserPositionManager;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        CurrentUserPositionManager currentUserPositionManager = this.f$0;
        Location location = (Location) obj;
        switch (i) {
            case 0:
                currentUserPositionManager.lambda$setInitialUserLocation$0(location);
                break;
            default:
                currentUserPositionManager.lambda$updateUserLocationMarker$4(location);
                break;
        }
    }
}
