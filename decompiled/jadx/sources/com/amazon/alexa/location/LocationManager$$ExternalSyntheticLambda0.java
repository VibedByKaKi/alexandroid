package com.amazon.alexa.location;

import com.amazon.alexa.location.models.ALSGeofence;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function3;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LocationManager$$ExternalSyntheticLambda0 implements Function3, BiFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocationManager f$0;

    public /* synthetic */ LocationManager$$ExternalSyntheticLambda0(LocationManager locationManager, int i) {
        this.$r8$classId = i;
        this.f$0 = locationManager;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    public Object apply(Object obj, Object obj2, Object obj3) {
        Map lambda$createGeofence$1;
        Map lambda$updateGeofence$3;
        int i = this.$r8$classId;
        List list = (List) obj;
        ALSGeofence aLSGeofence = (ALSGeofence) obj2;
        List list2 = (List) obj3;
        LocationManager locationManager = this.f$0;
        switch (i) {
            case 0:
                lambda$createGeofence$1 = locationManager.lambda$createGeofence$1(list, aLSGeofence, list2);
                return lambda$createGeofence$1;
            default:
                lambda$updateGeofence$3 = locationManager.lambda$updateGeofence$3(list, aLSGeofence, list2);
                return lambda$updateGeofence$3;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        Map lambda$syncGeofence$5;
        lambda$syncGeofence$5 = this.f$0.lambda$syncGeofence$5((List) obj, (List) obj2);
        return lambda$syncGeofence$5;
    }
}
