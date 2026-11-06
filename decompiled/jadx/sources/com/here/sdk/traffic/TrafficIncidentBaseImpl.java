package com.here.sdk.traffic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.LocalizedText;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class TrafficIncidentBaseImpl extends NativeBase implements TrafficIncidentBase {
    public TrafficIncidentBaseImpl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.traffic.TrafficIncidentBaseImpl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                TrafficIncidentBaseImpl.disposeNativeHandle(j2);
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
