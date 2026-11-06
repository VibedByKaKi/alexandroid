package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapLayerBuilder extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InstantiationErrorCode {
        MISSING_MANDATORY_PARAMETER(1),
        UNSUPPORTED_CONTENT_TYPE(2);

        public final int value;

        InstantiationErrorCode(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstantiationErrorDetails {

        @NonNull
        public InstantiationErrorCode errorCode;

        @Nullable
        public String errorDescription;

        public InstantiationErrorDetails(@NonNull InstantiationErrorCode instantiationErrorCode, @Nullable String str) {
            this.errorCode = instantiationErrorCode;
            this.errorDescription = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstantiationException extends Exception {
        public final InstantiationErrorDetails error;

        public InstantiationException(InstantiationErrorDetails instantiationErrorDetails) {
            super(instantiationErrorDetails.toString());
            this.error = instantiationErrorDetails;
        }
    }

    public MapLayerBuilder() {
        this(create(), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    private static native long create();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native MapLayer build() throws InstantiationException;

    @NonNull
    public native MapLayerBuilder forMap(@NonNull HereMap hereMap);

    @NonNull
    public native MapLayerBuilder withDataSource(@NonNull String str, @NonNull MapContentType mapContentType);

    @NonNull
    public native MapLayerBuilder withLoadPriority(double d);

    @NonNull
    public native MapLayerBuilder withMapMeasureDependentStorageLevels(@NonNull MapLayerMapMeasureDependentStorageLevels mapLayerMapMeasureDependentStorageLevels);

    @NonNull
    public native MapLayerBuilder withName(@NonNull String str);

    @NonNull
    public native MapLayerBuilder withPriority(@NonNull MapLayerPriority mapLayerPriority);

    @NonNull
    public native MapLayerBuilder withStyle(@NonNull Style style);

    @NonNull
    public native MapLayerBuilder withVisibilityRange(@NonNull MapLayerVisibilityRange mapLayerVisibilityRange);

    public MapLayerBuilder(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapLayerBuilder.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapLayerBuilder.disposeNativeHandle(j2);
            }
        });
    }
}
