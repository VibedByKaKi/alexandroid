package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.GeoPolyline;
import com.here.sdk.core.LocalizedTexts;
import com.here.time.Duration;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Span extends NativeBase {
    public Span(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.routing.Span.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                Span.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native Duration getBaseDuration();

    @NonNull
    public native List<AccessAttributes> getCarAttributes();

    @Nullable
    public native Double getConsumptionInKilowattHours();

    @Nullable
    public native String getCountryCode();

    @NonNull
    public native Duration getDuration();

    @Nullable
    public native DynamicSpeedInfo getDynamicSpeedInfo();

    @Nullable
    public native FunctionalRoadClass getFunctionalRoadClass();

    @NonNull
    public native GeoPolyline getGeometry();

    public native int getLengthInMeters();

    @NonNull
    public native List<Integer> getNoticeIndexes();

    @Nullable
    public native RouteRailwayCrossingType getRailwayCrossingType();

    @NonNull
    public native LocalizedRoadNumbers getRoadNumbers();

    @NonNull
    public native List<AccessAttributes> getScooterAttributes();

    public native int getSectionPolylineOffset();

    @NonNull
    public native SegmentReference getSegmentReference();

    @NonNull
    public native String getShieldText(@NonNull LocalizedRoadNumber localizedRoadNumber);

    @Nullable
    public native Double getSpeedLimitInMetersPerSecond();

    @Nullable
    public native String getStateCode();

    @NonNull
    public native List<StreetAttributes> getStreetAttributes();

    @NonNull
    public native LocalizedTexts getStreetNames();

    @NonNull
    public native List<Integer> getTrafficIncidentIndexes();

    @NonNull
    @Deprecated
    public native TrafficSpeed getTrafficSpeed();

    @NonNull
    public native List<AccessAttributes> getTruckAttributes();

    @NonNull
    public native List<WalkAttributes> getWalkAttributes();
}
