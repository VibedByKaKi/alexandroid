package com.amazon.alexa.location;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.app.EnhancedJobIntentService;
import androidx.core.app.JobIntentService;
import com.amazon.alexa.crashreporting.api.CrashReporter;
import com.amazon.alexa.location.utils.ExceptionRecordUtil;
import com.amazon.alexa.location.utils.MobilyticsUtil;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class GeofenceRestoreJobIntentService extends EnhancedJobIntentService {
    private static final String COMPONENT_RE_REGISTER_GEOFENCE = MobilyticsUtil.getComponentName("re_register_geofence");
    private static final int JOB_ID = 53720235;
    private static final String TAG = "GeofenceRestoreJobIntentService";
    private final LazyComponent<CrashReporter> crashReporter;
    private final LocationPermissionService locationPermissionService;
    private final LazyComponent<LocationService> locationService;
    private final LazyComponent<Mobilytics> mobilytics;

    public GeofenceRestoreJobIntentService() {
        ComponentRegistry componentRegistry = ComponentRegistry.getInstance();
        this.locationService = componentRegistry.getLazy(LocationService.class);
        this.crashReporter = componentRegistry.getLazy(CrashReporter.class);
        this.mobilytics = componentRegistry.getLazy(Mobilytics.class);
        this.locationPermissionService = new AlexaLocationPermissionService(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHandleWork$0(List list) throws Throwable {
        String.format("[SUCCESS] Successfully restored %d geofences on device reboot.", Integer.valueOf(list.size()));
        Mobilytics mobilytics = this.mobilytics.get();
        String str = COMPONENT_RE_REGISTER_GEOFENCE;
        mobilytics.recordOccurrence(MobilyticsUtil.MetricsID.RE_REGISTER_SUCCESS, true, str, str, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHandleWork$1(Throwable th) throws Throwable {
        if (th instanceof LocationException) {
            String str = "re_register_failure_" + MobilyticsUtil.METRICS_NAME_ERROR_PART.get(((LocationException) th).getErrorCode());
            Mobilytics mobilytics = this.mobilytics.get();
            String str2 = COMPONENT_RE_REGISTER_GEOFENCE;
            mobilytics.recordOccurrence(str, true, str2, str2, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
        } else {
            Mobilytics mobilytics2 = this.mobilytics.get();
            String str3 = COMPONENT_RE_REGISTER_GEOFENCE;
            mobilytics2.recordOccurrence("re_register_failure_unknown", true, str3, str3, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
        }
        th.printStackTrace();
        String str4 = TAG;
        th.getMessage();
        ExceptionRecordUtil.recordExceptions(str4, "locationService.restoreGeofences()", th, this.crashReporter);
    }

    public static void schedule(Context context) {
        JobIntentService.enqueueWork(context, (Class<?>) GeofenceRestoreJobIntentService.class, JOB_ID, new Intent());
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        Mobilytics mobilytics = this.mobilytics.get();
        String str = COMPONENT_RE_REGISTER_GEOFENCE;
        this.mobilytics.get().recordTimer(mobilytics.createTimer(MobilyticsUtil.MetricsID.START_UPTIME, str, str, SystemClock.elapsedRealtime(), false, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID));
        if (this.locationPermissionService.hasFullLocationPermission()) {
            final int i = 0;
            final int i2 = 1;
            this.locationService.get().restoreGeofences().subscribe(new Consumer(this) { // from class: com.amazon.alexa.location.GeofenceRestoreJobIntentService$$ExternalSyntheticLambda0
                public final /* synthetic */ GeofenceRestoreJobIntentService f$0;

                {
                    this.f$0 = this;
                }

                @Override // io.reactivex.rxjava3.functions.Consumer
                public final void accept(Object obj) {
                    int i3 = i;
                    GeofenceRestoreJobIntentService geofenceRestoreJobIntentService = this.f$0;
                    switch (i3) {
                        case 0:
                            geofenceRestoreJobIntentService.lambda$onHandleWork$0((List) obj);
                            break;
                        default:
                            geofenceRestoreJobIntentService.lambda$onHandleWork$1((Throwable) obj);
                            break;
                    }
                }
            }, new Consumer(this) { // from class: com.amazon.alexa.location.GeofenceRestoreJobIntentService$$ExternalSyntheticLambda0
                public final /* synthetic */ GeofenceRestoreJobIntentService f$0;

                {
                    this.f$0 = this;
                }

                @Override // io.reactivex.rxjava3.functions.Consumer
                public final void accept(Object obj) {
                    int i3 = i2;
                    GeofenceRestoreJobIntentService geofenceRestoreJobIntentService = this.f$0;
                    switch (i3) {
                        case 0:
                            geofenceRestoreJobIntentService.lambda$onHandleWork$0((List) obj);
                            break;
                        default:
                            geofenceRestoreJobIntentService.lambda$onHandleWork$1((Throwable) obj);
                            break;
                    }
                }
            });
        }
    }
}
