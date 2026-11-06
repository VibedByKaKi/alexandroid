package com.amazon.alexa.location;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class LocationProvider {
    static final String TAG = "LocationProvider";
    private FusedLocationProviderClient fusedLocationProviderClient;
    private LocationPermissionService permissionService;

    public LocationProvider(Context context) {
        this.permissionService = new AlexaLocationPermissionService(context);
        this.fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getMostRecentLocation$0(SingleEmitter singleEmitter, Task task) {
        if (!task.isSuccessful() || task.getResult() == null) {
            singleEmitter.onError(new LocationException(LocationErrorCode.GENERIC_ERROR, "[ERROR] Fail to retrieve last location from OS.", task.getException()));
            return;
        }
        Location location = (Location) task.getResult();
        String.format("[SUCCESS] Last location is retrieved from OS successfully. [%f , %f]", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
        singleEmitter.onSuccess(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMostRecentLocation$1(SingleEmitter singleEmitter) throws Throwable {
        if (this.permissionService.hasAccessFineLocationPermission()) {
            this.fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new LocationProvider$$ExternalSyntheticLambda1(singleEmitter, 0));
        } else {
            singleEmitter.onError(new LocationException(LocationErrorCode.PERMISSION_ERROR, "[ERROR] Location permission is not granted."));
        }
    }

    public Single<Location> getMostRecentLocation() {
        return Single.create(new LocationManager$$ExternalSyntheticLambda3(this));
    }
}
