package com.here.sdk.traffic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TrafficFlow extends NativeBase implements TrafficFlowBase {
    public TrafficFlow(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.traffic.TrafficFlow.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                TrafficFlow.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Nullable
    public native Double getConfidence();

    @Override // com.here.sdk.traffic.TrafficFlowBase
    public native double getFreeFlowSpeedInMetersPerSecond();

    @Override // com.here.sdk.traffic.TrafficFlowBase
    public native double getJamFactor();

    @Nullable
    public native Short getJamTendency();

    @Nullable
    public native JunctionsTraversability getJunctionsTraversability();

    @NonNull
    public native TrafficLocation getLocation();

    @Nullable
    public native Double getSpeedInMetersPerSecond();

    @Nullable
    public native Double getSpeedUncappedInMetersPerSecond();

    @Nullable
    public native Traversability getTraversability();
}
