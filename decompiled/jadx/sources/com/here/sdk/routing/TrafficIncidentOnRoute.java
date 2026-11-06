package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.LocalizedText;
import com.here.sdk.traffic.TrafficIncidentBase;
import com.here.sdk.traffic.TrafficIncidentImpact;
import com.here.sdk.traffic.TrafficIncidentType;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TrafficIncidentOnRoute extends NativeBase implements TrafficIncidentBase {
    public TrafficIncidentOnRoute(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.routing.TrafficIncidentOnRoute.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                TrafficIncidentOnRoute.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.traffic.TrafficIncidentBase
    @NonNull
    public native LocalizedText getDescription();

    @Override // com.here.sdk.traffic.TrafficIncidentBase
    @Nullable
    public native Date getEndTime();

    @Nullable
    public native String getId();

    @Override // com.here.sdk.traffic.TrafficIncidentBase
    @NonNull
    public native TrafficIncidentImpact getImpact();

    @Override // com.here.sdk.traffic.TrafficIncidentBase
    @Nullable
    public native Date getStartTime();

    @Override // com.here.sdk.traffic.TrafficIncidentBase
    @NonNull
    public native TrafficIncidentType getType();
}
