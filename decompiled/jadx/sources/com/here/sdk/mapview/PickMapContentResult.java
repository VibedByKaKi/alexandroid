package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.core.LocalizedText;
import com.here.sdk.core.PickedPlace;
import com.here.sdk.traffic.TrafficIncidentBase;
import com.here.sdk.traffic.TrafficIncidentImpact;
import com.here.sdk.traffic.TrafficIncidentType;
import java.util.Date;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PickMapContentResult extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TrafficIncidentResult extends NativeBase implements TrafficIncidentBase {
        public TrafficIncidentResult(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.PickMapContentResult.TrafficIncidentResult.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    TrafficIncidentResult.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @NonNull
        public native GeoCoordinates getCoordinates();

        @Override // com.here.sdk.traffic.TrafficIncidentBase
        @NonNull
        public native LocalizedText getDescription();

        @Override // com.here.sdk.traffic.TrafficIncidentBase
        @Nullable
        public native Date getEndTime();

        @Override // com.here.sdk.traffic.TrafficIncidentBase
        @NonNull
        public native TrafficIncidentImpact getImpact();

        @NonNull
        public native String getOriginalId();

        @Override // com.here.sdk.traffic.TrafficIncidentBase
        @Nullable
        public native Date getStartTime();

        @Override // com.here.sdk.traffic.TrafficIncidentBase
        @NonNull
        public native TrafficIncidentType getType();
    }

    public PickMapContentResult(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.PickMapContentResult.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PickMapContentResult.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native List<PickedPlace> getPickedPlaces();

    @NonNull
    public native List<TrafficIncidentResult> getTrafficIncidents();
}
