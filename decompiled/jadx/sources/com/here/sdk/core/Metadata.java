package com.here.sdk.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Metadata extends NativeBase {
    public Metadata() {
        this(make(), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make();

    @Nullable
    public native CustomMetadataValue getCustomValue(@NonNull String str);

    @Nullable
    public native Double getDouble(@NonNull String str);

    @Nullable
    public native GeoCoordinates getGeoCoordinates(@NonNull String str);

    @Nullable
    public native Integer getInteger(@NonNull String str);

    @Nullable
    public native String getString(@NonNull String str);

    @Nullable
    public native MetadataType getType(@NonNull String str);

    public native void removeValue(@NonNull String str);

    public native void setCustomValue(@NonNull String str, @NonNull CustomMetadataValue customMetadataValue);

    public native void setDouble(@NonNull String str, double d);

    public native void setGeoCoordinates(@NonNull String str, @NonNull GeoCoordinates geoCoordinates);

    public native void setInteger(@NonNull String str, int i);

    public native void setString(@NonNull String str, @NonNull String str2);

    public Metadata(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.Metadata.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                Metadata.disposeNativeHandle(j2);
            }
        });
    }
}
