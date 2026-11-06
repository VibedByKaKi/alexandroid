package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.core.LocalizedTexts;
import com.here.time.Duration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Maneuver extends NativeBase {
    public Maneuver(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.routing.Maneuver.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                Maneuver.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native ManeuverAction getAction();

    @NonNull
    public native GeoCoordinates getCoordinates();

    @Nullable
    public native String getCountryCode();

    @NonNull
    public native Duration getDuration();

    @NonNull
    public native LocalizedTexts getExitSignTexts();

    @NonNull
    public native LocalizedTexts getIntersectionNames();

    public native int getLengthInMeters();

    @NonNull
    public native RoadTexts getNextRoadTexts();

    @Nullable
    public native RoadType getNextRoadType();

    public native int getOffset();

    @NonNull
    public native RoadTexts getRoadTexts();

    @Nullable
    public native RoadType getRoadType();

    @Nullable
    public native Double getRoundaboutAngleInDegrees();

    public native int getSectionIndex();

    @Nullable
    public native Signpost getSignpost();

    @Nullable
    public native TbtManeuverAction getTbtManeuverAction();

    @NonNull
    public native String getText();

    @Nullable
    public native Double getTurnAngleInDegrees();
}
