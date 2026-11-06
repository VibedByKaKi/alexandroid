package com.amazon.alexa.location;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LocationManager$$ExternalSyntheticLambda15 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocationManager f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ LocationManager$$ExternalSyntheticLambda15(LocationManager locationManager, List list, int i) {
        this.$r8$classId = i;
        this.f$0 = locationManager;
        this.f$1 = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        JSONObject lambda$convertLocationItemsToJsonObject$12;
        JSONObject lambda$convertGeofencesToJsonObject$11;
        switch (this.$r8$classId) {
            case 0:
                lambda$convertLocationItemsToJsonObject$12 = this.f$0.lambda$convertLocationItemsToJsonObject$12(this.f$1);
                return lambda$convertLocationItemsToJsonObject$12;
            default:
                lambda$convertGeofencesToJsonObject$11 = this.f$0.lambda$convertGeofencesToJsonObject$11(this.f$1);
                return lambda$convertGeofencesToJsonObject$11;
        }
    }
}
