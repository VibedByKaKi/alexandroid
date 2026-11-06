package com.mapbox.common.location;

import com.mapbox.common.location.BaseDeviceLocationProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AndroidDeviceLocationProvider$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BaseDeviceLocationProvider.LocationCancelable f$0;
    public final /* synthetic */ GetLocationCallback f$1;
    public final /* synthetic */ android.location.Location f$2;

    public /* synthetic */ AndroidDeviceLocationProvider$$ExternalSyntheticLambda0(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback, android.location.Location location, int i) {
        this.$r8$classId = i;
        this.f$0 = locationCancelable;
        this.f$1 = getLocationCallback;
        this.f$2 = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidDeviceLocationProvider.getLastLocation$lambda$4(this.f$0, this.f$1, this.f$2);
                break;
            default:
                GoogleDeviceLocationProvider$getLastLocation$1$1.invoke$lambda$0(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
