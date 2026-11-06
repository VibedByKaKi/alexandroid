package com.amazon.alexa.hho.navigation.transit.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.hho.navigation.dependency.SessionDispatcher;
import com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2;
import com.amazon.alexa.sensor.api.location.Error;
import com.amazon.alexa.sensor.api.location.LocationConfigurationRequest;
import com.amazon.alexa.sensor.api.location.LocationEventHandler;
import com.amazon.alexa.sensor.api.location.LocationSensorAccess;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\u000e\u0010\u001a\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0017J\b\u0010\u001d\u001a\u00020\u0013H\u0003J\b\u0010\u001e\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/location/LocationTrackingManagerV2;", "", "locationSensorAccess", "Lcom/amazon/alexa/sensor/api/location/LocationSensorAccess;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/alexa/sensor/api/location/LocationSensorAccess;Lkotlinx/coroutines/CoroutineDispatcher;)V", "retryScope", "Lkotlinx/coroutines/CoroutineScope;", "getRetryScope$AlexaMobileAndroidHHO_release", "()Lkotlinx/coroutines/CoroutineScope;", "setRetryScope$AlexaMobileAndroidHHO_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "isTrackingActive", "", "locationListener", "Lcom/amazon/alexa/hho/navigation/transit/location/LocationTrackingManagerV2$LocationListener;", "locationUpdateRequest", "Lcom/amazon/alexa/sensor/api/location/LocationConfigurationRequest;", "locationEventHandler", "Lcom/amazon/alexa/sensor/api/location/LocationEventHandler;", "startLocationUpdates", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "subscribeToLocationUpdates", "subscribeWithRetry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopLocationUpdates", "buildLocationUpdateRequest", "buildLocationEventHandler", "Companion", "LocationListener", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LocationTrackingManagerV2 {

    @NotNull
    private static final String LOCATION_ACCESS_FEATURE_ID = "localLocationUpdateRequest::alexaMobileTransitNavigation";

    @NotNull
    private static final String TAG = "NavCA_LocationTrackerV2";

    @NotNull
    private final CoroutineDispatcher dispatcher;
    private volatile boolean isTrackingActive;

    @Nullable
    private LocationEventHandler locationEventHandler;

    @Nullable
    private LocationListener locationListener;

    @NotNull
    private final LocationSensorAccess locationSensorAccess;

    @Nullable
    private LocationConfigurationRequest locationUpdateRequest;

    @NotNull
    private CoroutineScope retryScope;

    @NotNull
    private static final List<Long> RESUBSCRIPTION_BACKOFF_DELAYS_MS = CollectionsKt.listOf((Object[]) new Long[]{1000L, 3000L});

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/location/LocationTrackingManagerV2$LocationListener;", "", "onLocationUpdated", "", "location", "Landroid/location/Location;", "onInitialSubscriptionFailed", "error", "", "onResubscriptionFailed", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LocationListener {
        void onInitialSubscriptionFailed(@NotNull String error);

        void onLocationUpdated(@NotNull Location location);

        void onResubscriptionFailed();
    }

    @Inject
    public LocationTrackingManagerV2(@NotNull LocationSensorAccess locationSensorAccess, @SessionDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        locationSensorAccess.getClass();
        coroutineDispatcher.getClass();
        this.locationSensorAccess = locationSensorAccess;
        this.dispatcher = coroutineDispatcher;
        this.retryScope = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m((Job) null, 1, (Object) null, coroutineDispatcher);
    }

    private final LocationEventHandler buildLocationEventHandler() {
        return new LocationEventHandler() { // from class: com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2$buildLocationEventHandler$1
            @Override // com.amazon.alexa.sensor.api.location.LocationEventHandler
            public void didReceiveLocation(Location location) {
                LocationTrackingManagerV2.LocationListener locationListener;
                Unit unit;
                if (location != null) {
                    locationListener = LocationTrackingManagerV2.this.locationListener;
                    if (locationListener != null) {
                        locationListener.onLocationUpdated(location);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        return;
                    }
                }
                Log.w("NavCA_LocationTrackerV2", "Received null location - no-op");
            }

            @Override // com.amazon.alexa.sensor.api.location.LocationEventHandler
            public void fineLocationUpdatesWillEnd() {
                boolean z;
                boolean subscribeToLocationUpdates;
                z = LocationTrackingManagerV2.this.isTrackingActive;
                if (z) {
                    subscribeToLocationUpdates = LocationTrackingManagerV2.this.subscribeToLocationUpdates();
                    if (subscribeToLocationUpdates) {
                        return;
                    }
                    Log.e("NavCA_LocationTrackerV2", "Initial location resubscription failed. Scheduling retries with backoff.");
                    BuildersKt__Builders_commonKt.launch$default(LocationTrackingManagerV2.this.getRetryScope(), null, null, new LocationTrackingManagerV2$buildLocationEventHandler$1$fineLocationUpdatesWillEnd$1(LocationTrackingManagerV2.this, null), 3, null);
                }
            }
        };
    }

    @SuppressLint({"Range"})
    private final LocationConfigurationRequest buildLocationUpdateRequest() {
        LocationConfigurationRequest locationConfigurationRequest = new LocationConfigurationRequest();
        locationConfigurationRequest.mode = 3;
        locationConfigurationRequest.locationAccuracy = 0;
        locationConfigurationRequest.minimumDeliveryDistance = 0.0f;
        locationConfigurationRequest.minimumDeliveryTimeInterval = 500L;
        return locationConfigurationRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean subscribeToLocationUpdates() {
        LocationEventHandler locationEventHandler;
        LocationConfigurationRequest locationConfigurationRequest = this.locationUpdateRequest;
        if (locationConfigurationRequest == null || (locationEventHandler = this.locationEventHandler) == null || !this.isTrackingActive) {
            return false;
        }
        Error subscribeForLocationUpdates = this.locationSensorAccess.subscribeForLocationUpdates("localLocationUpdateRequest::alexaMobileTransitNavigation", locationConfigurationRequest, locationEventHandler);
        if (subscribeForLocationUpdates == null) {
            return true;
        }
        ErrorUtils$$ExternalSyntheticOutline0.m(subscribeForLocationUpdates.errorCode, "Failed to subscribe to location updates: error code ", TAG);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006c -> B:10:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object subscribeWithRetry(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2$subscribeWithRetry$1
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2$subscribeWithRetry$1 r0 = (com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2$subscribeWithRetry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2$subscribeWithRetry$1 r0 = new com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2$subscribeWithRetry$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            int r7 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.L$0
            com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2 r5 = (com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6f
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r7)
            r7 = 0
            return r7
        L3c:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.List<java.lang.Long> r8 = com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2.RESUBSCRIPTION_BACKOFF_DELAYS_MS
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
            r4 = r8
        L49:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9a
            int r8 = r2 + 1
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r0.L$0 = r7
            r0.L$1 = r4
            r0.I$0 = r8
            r0.I$1 = r2
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r5 != r1) goto L6c
            return r1
        L6c:
            r5 = r7
            r7 = r2
            r2 = r8
        L6f:
            int r7 = r7 + r3
            boolean r8 = r5.isTrackingActive
            if (r8 != 0) goto L77
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L77:
            boolean r8 = r5.subscribeToLocationUpdates()
            if (r8 == 0) goto L80
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L80:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r6 = "Async resubscription failed on attempt #"
            r8.<init>(r6)
            r8.append(r7)
            java.lang.String r7 = "."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "NavCA_LocationTrackerV2"
            android.util.Log.e(r8, r7)
            r7 = r5
            goto L49
        L9a:
            boolean r8 = r7.isTrackingActive
            if (r8 == 0) goto La5
            com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2$LocationListener r7 = r7.locationListener
            if (r7 == 0) goto La5
            r7.onResubscriptionFailed()
        La5:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2.subscribeWithRetry(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    /* renamed from: getRetryScope$AlexaMobileAndroidHHO_release, reason: from getter */
    public final CoroutineScope getRetryScope() {
        return this.retryScope;
    }

    public final void setRetryScope$AlexaMobileAndroidHHO_release(@NotNull CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.retryScope = coroutineScope;
    }

    public final void startLocationUpdates(@NotNull LocationListener listener) {
        listener.getClass();
        if (this.isTrackingActive) {
            stopLocationUpdates();
        }
        this.locationListener = listener;
        this.isTrackingActive = true;
        this.locationUpdateRequest = buildLocationUpdateRequest();
        this.locationEventHandler = buildLocationEventHandler();
        if (subscribeToLocationUpdates()) {
            return;
        }
        this.isTrackingActive = false;
        listener.onInitialSubscriptionFailed("Failed to subscribe to location updates on session start.");
    }

    public final void stopLocationUpdates() {
        if (this.isTrackingActive) {
            this.isTrackingActive = false;
            this.locationSensorAccess.unsubscribeFromLocationUpdates("localLocationUpdateRequest::alexaMobileTransitNavigation", 3);
            this.locationListener = null;
            this.locationUpdateRequest = null;
            this.locationEventHandler = null;
        }
    }
}
