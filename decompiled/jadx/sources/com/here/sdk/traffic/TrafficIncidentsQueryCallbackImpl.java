package com.here.sdk.traffic;

import androidx.annotation.Nullable;
import com.here.NativeBase;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class TrafficIncidentsQueryCallbackImpl extends NativeBase implements TrafficIncidentsQueryCallback {
    public TrafficIncidentsQueryCallbackImpl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.traffic.TrafficIncidentsQueryCallbackImpl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                TrafficIncidentsQueryCallbackImpl.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.traffic.TrafficIncidentsQueryCallback
    public native void onTrafficIncidentsFetched(@Nullable TrafficQueryError trafficQueryError, @Nullable List<TrafficIncident> list);
}
