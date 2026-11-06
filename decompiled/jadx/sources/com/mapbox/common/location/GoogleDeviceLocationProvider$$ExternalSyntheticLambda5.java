package com.mapbox.common.location;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.location.BaseDeviceLocationProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class GoogleDeviceLocationProvider$$ExternalSyntheticLambda5 implements OnFailureListener, OnCompleteListener {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ GoogleDeviceLocationProvider$$ExternalSyntheticLambda5(Object obj, Object obj2) {
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        GoogleDeviceLocationProvider.getLastLocation$lambda$8((BaseDeviceLocationProvider.LocationCancelable) this.f$0, (GetLocationCallback) this.f$1, task);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        GoogleDeviceLocationProvider.doStart$lambda$3((PermissionStatus) this.f$0, (GoogleDeviceLocationProvider) this.f$1, exc);
    }
}
