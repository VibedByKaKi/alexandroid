package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.traffic.TrafficIncidentType;
import com.here.time.Duration;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapContentSettings extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TrafficRefreshPeriodErrorCode {
        INTERNAL_ERROR(1),
        VALUE_OUTSIDE_ALLOWED_RANGE(2);

        public final int value;

        TrafficRefreshPeriodErrorCode(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TrafficRefreshPeriodException extends Exception {
        public final TrafficRefreshPeriodErrorCode error;

        public TrafficRefreshPeriodException(TrafficRefreshPeriodErrorCode trafficRefreshPeriodErrorCode) {
            super(trafficRefreshPeriodErrorCode.toString());
            this.error = trafficRefreshPeriodErrorCode;
        }
    }

    public MapContentSettings(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapContentSettings.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapContentSettings.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public static native void filterTrafficIncidents(@NonNull List<TrafficIncidentType> list);

    public static native void resetTrafficIncidentFilter();

    public static native void resetTrafficRefreshPeriod();

    public static native void setTrafficRefreshPeriod(@NonNull Duration duration) throws TrafficRefreshPeriodException;
}
