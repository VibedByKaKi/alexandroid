package com.here.time;

import com.google.android.gms.tasks.OnFailureListener;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.EventsServiceResponseCallback;
import com.mapbox.common.FlushOperationResultCallback;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.TelemetryUtilsResponseCallback;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.mapbox.common.module.MapboxHttpClient;
import com.mapbox.common.module.StreamingDataReader;
import com.mapbox.common.module.cronet.LazyEngine;
import com.mapbox.common.module.okhttp.NetworkUsageListener;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorDelegate;
import com.mapbox.maps.MapProvider;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.Snapshotter;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;
import okhttp3.Call;
import okhttp3.EventListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Duration$$ExternalSyntheticBUOutline0 implements OnFailureListener, Expected.Transformer, Expected.Action, EventListener.Factory, FlushOperationResultCallback, FeatureStateOperationCallback, MapLoadingErrorDelegate, EventsServiceResponseCallback, TelemetryUtilsResponseCallback {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Duration$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m$1(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        EventListener lambda$static$0;
        lambda$static$0 = NetworkUsageListener.lambda$static$0(call);
        return lambda$static$0;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        LifecycleState lifeCycleStateCallback$lambda$1$lambda$0;
        CameraOptions cameraForCoordinates$lambda$20;
        String str = (String) obj;
        switch (this.$r8$classId) {
            case 9:
                lifeCycleStateCallback$lambda$1$lambda$0 = MapboxHttpClient.getLifeCycleStateCallback$lambda$1$lambda$0(str);
                return lifeCycleStateCallback$lambda$1$lambda$0;
            default:
                cameraForCoordinates$lambda$20 = Snapshotter.cameraForCoordinates$lambda$20(str);
                return cameraForCoordinates$lambda$20;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.$r8$classId) {
            case 7:
                GoogleDeviceLocationProvider.removeLocationUpdates$lambda$12(exc);
                break;
            case 8:
                GoogleDeviceLocationProvider.requestLocationUpdates$lambda$10(exc);
                break;
            default:
                LazyEngine.tryInstallFromGooglePlay$lambda$2(exc);
                break;
        }
    }

    @Override // com.mapbox.common.FlushOperationResultCallback, com.mapbox.maps.FeatureStateOperationCallback, com.mapbox.common.EventsServiceResponseCallback, com.mapbox.common.TelemetryUtilsResponseCallback
    public void run(Expected expected) {
        switch (this.$r8$classId) {
            case 14:
                MapProvider.flushPendingEvents$lambda$1(expected);
                break;
            case 15:
                MapProvider.flushPendingEvents$lambda$3(expected);
                break;
            case 16:
                expected.getClass();
                break;
            case 17:
                expected.getClass();
                break;
            case 18:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                MapTelemetryImpl.enableTelemetryCollection$lambda$3(expected);
                break;
            case 19:
                expected.getClass();
                break;
            case 20:
                expected.getClass();
                break;
            case 21:
                expected.getClass();
                break;
            case 27:
                MapTelemetryImpl.sendEvent$lambda$2(expected);
                break;
            case 28:
                MapTelemetryImpl.onAppUserTurnstileEvent$lambda$0(expected);
                break;
        }
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        switch (this.$r8$classId) {
            case 18:
                mapLoadingError.getClass();
                break;
            case 22:
                mapLoadingError.getClass();
                break;
            default:
                mapLoadingError.getClass();
                break;
        }
    }

    public static /* synthetic */ void m() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void m$1() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void m(int i, int i2, String str) {
        throw new IllegalArgumentException(str + i + 'x' + i2);
    }

    public static /* synthetic */ void m$1(String str) {
        throw new MapboxStyleException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, long j) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    public static /* synthetic */ void m(long j, String str) {
        throw new IllegalArgumentException(str + j);
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new ArithmeticException(str);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        StreamingDataReader.fillChunkBuffer$lambda$2((String) obj);
    }
}
