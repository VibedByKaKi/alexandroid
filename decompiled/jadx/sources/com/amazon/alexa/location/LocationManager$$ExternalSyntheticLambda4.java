package com.amazon.alexa.location;

import com.google.android.gms.location.LocationSettingsStates;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LocationManager$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ LocationManager$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Subject) obj2).onNext((List) obj);
                break;
            case 1:
                ((DefaultLocationService) obj2).lambda$recordLocationSetting$42((LocationSettingsStates) obj);
                break;
            case 2:
                ((GeofenceEventHandler) obj2).lambda$reportGeoFenceStatusToALS$8((Throwable) obj);
                break;
            case 3:
                ((LocationManager) obj2).lambda$syncGeofence$6((Map) obj);
                break;
            default:
                ((LocationSettingsRecorder) obj2).lambda$recordLocationSettings$1((Throwable) obj);
                break;
        }
    }
}
