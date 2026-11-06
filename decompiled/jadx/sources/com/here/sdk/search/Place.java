package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.GeoBox;
import com.here.sdk.core.GeoCoordinates;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Place extends NativeBase {
    public Place(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.search.Place.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                Place.disposeNativeHandle(j2);
            }
        });
    }

    @NonNull
    public static native Place deserialize(@NonNull String str) throws PlaceSerializationException;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native List<GeoCoordinates> getAccessPoints();

    @NonNull
    public native Address getAddress();

    @Nullable
    public native AreaType getAreaType();

    @Nullable
    public native GeoBox getBoundingBox();

    @NonNull
    public native Details getDetails();

    @Nullable
    public native Integer getDistanceInMeters();

    @Nullable
    public native GeoCoordinates getGeoCoordinates();

    @NonNull
    public native String getId();

    @NonNull
    public native PlaceType getPlaceType();

    @Nullable
    public native String getPoliticalView();

    @NonNull
    public native String getTitle();

    public native boolean isCoordinatesInterpolated();

    @NonNull
    public native String serializeCompact();
}
