package com.amazon.alexa.mobile.assistant.client.apis;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.assistant.foundation.model.GeolocationData;
import com.amazon.alexa.assistant.foundation.model.GeolocationDatasource;
import com.amazon.alexa.assistant.foundation.model.GeolocationServicesAccess;
import com.amazon.alexa.assistant.foundation.model.GeolocationServicesStatus;
import com.dee.app.contacts.common.constants.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0007J\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/apis/GeolocationDatasourceImpl;", "Lcom/amazon/alexa/assistant/foundation/model/GeolocationDatasource;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "locationManager", "Landroid/location/LocationManager;", "lastLocation", "Landroid/location/Location;", "locationListener", "Landroid/location/LocationListener;", "start", "", "stop", "getLocation", "Lcom/amazon/alexa/assistant/foundation/model/GeolocationData;", "hasPermission", "", "getBestLastKnownLocation", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGeolocationDatasourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeolocationDatasourceImpl.kt\ncom/amazon/alexa/mobile/assistant/client/apis/GeolocationDatasourceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1611#2,9:123\n1863#2:132\n1864#2:134\n1620#2:135\n2341#2,14:136\n1#3:133\n*S KotlinDebug\n*F\n+ 1 GeolocationDatasourceImpl.kt\ncom/amazon/alexa/mobile/assistant/client/apis/GeolocationDatasourceImpl\n*L\n112#1:123,9\n112#1:132\n112#1:134\n112#1:135\n113#1:136,14\n112#1:133\n*E\n"})
/* loaded from: classes18.dex */
public final class GeolocationDatasourceImpl implements GeolocationDatasource {
    private static final float MIN_DISTANCE_M = 10.0f;
    private static final long MIN_TIME_MS = 60000;

    @NotNull
    private static final String TAG = "GeolocationDatasource";

    @NotNull
    private final Context context;

    @Nullable
    private volatile Location lastLocation;

    @NotNull
    private final LocationListener locationListener;

    @Nullable
    private final LocationManager locationManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public GeolocationDatasourceImpl(@NotNull Context context) {
        context.getClass();
        this.context = context;
        Object systemService = context.getSystemService("location");
        this.locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        this.locationListener = new LocationListener() { // from class: com.amazon.alexa.mobile.assistant.client.apis.GeolocationDatasourceImpl$$ExternalSyntheticLambda0
            @Override // android.location.LocationListener
            public final void onLocationChanged(Location location) {
                GeolocationDatasourceImpl.locationListener$lambda$0(GeolocationDatasourceImpl.this, location);
            }
        };
    }

    private final Location getBestLastKnownLocation() {
        LocationManager locationManager;
        Object obj = null;
        if (!hasPermission() || (locationManager = this.locationManager) == null) {
            return null;
        }
        List<String> providers = locationManager.getProviders(true);
        providers.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = providers.iterator();
        while (it2.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation((String) it2.next());
            if (lastKnownLocation != null) {
                arrayList.add(lastKnownLocation);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            obj = it3.next();
            if (it3.hasNext()) {
                float accuracy = ((Location) obj).getAccuracy();
                do {
                    Object next = it3.next();
                    float accuracy2 = ((Location) next).getAccuracy();
                    if (Float.compare(accuracy, accuracy2) > 0) {
                        obj = next;
                        accuracy = accuracy2;
                    }
                } while (it3.hasNext());
            }
        }
        return (Location) obj;
    }

    private final boolean hasPermission() {
        return ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void locationListener$lambda$0(GeolocationDatasourceImpl geolocationDatasourceImpl, Location location) {
        location.getClass();
        geolocationDatasourceImpl.lastLocation = location;
    }

    @Override // com.amazon.alexa.assistant.foundation.model.GeolocationDatasource
    @NotNull
    public GeolocationData getLocation() {
        boolean hasPermission = hasPermission();
        LocationManager locationManager = this.locationManager;
        boolean z = false;
        if (locationManager != null && (locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps"))) {
            z = true;
        }
        Location location = this.lastLocation;
        GeolocationServicesStatus geolocationServicesStatus = z ? GeolocationServicesStatus.RUNNING : GeolocationServicesStatus.STOPPED;
        GeolocationServicesAccess geolocationServicesAccess = hasPermission ? GeolocationServicesAccess.ENABLED : GeolocationServicesAccess.DISABLED;
        double latitude = location != null ? location.getLatitude() : 0.0d;
        double longitude = location != null ? location.getLongitude() : 0.0d;
        double accuracy = location != null ? location.getAccuracy() : 0.0d;
        long time = location != null ? location.getTime() : System.currentTimeMillis();
        Double d = null;
        Double valueOf = (location == null || !location.hasAltitude()) ? null : Double.valueOf(location.getAltitude());
        Double valueOf2 = (location == null || !location.hasSpeed()) ? null : Double.valueOf(location.getSpeed());
        if (location != null && location.hasBearing()) {
            d = Double.valueOf(location.getBearing());
        }
        return new GeolocationData(geolocationServicesStatus, geolocationServicesAccess, latitude, longitude, accuracy, time, valueOf, null, d, null, valueOf2, null, 2688, null);
    }

    @SuppressLint({"MissingPermission"})
    public final void start() {
        if (!hasPermission()) {
            Log.w(TAG, "Location permission not granted, skipping location updates");
            return;
        }
        LocationManager locationManager = this.locationManager;
        if (locationManager == null) {
            Log.w(TAG, "LocationManager unavailable, skipping location updates");
            return;
        }
        try {
            this.lastLocation = getBestLastKnownLocation();
            locationManager.requestLocationUpdates("passive", 60000L, 10.0f, this.locationListener, Looper.getMainLooper());
            locationManager.requestLocationUpdates("network", 60000L, 10.0f, this.locationListener, Looper.getMainLooper());
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "Location provider unavailable", e);
        } catch (SecurityException e2) {
            Log.e(TAG, "SecurityException requesting location updates", e2);
        }
    }

    public final void stop() {
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            locationManager.removeUpdates(this.locationListener);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/apis/GeolocationDatasourceImpl$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "MIN_TIME_MS", "", "MIN_DISTANCE_M", "", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
