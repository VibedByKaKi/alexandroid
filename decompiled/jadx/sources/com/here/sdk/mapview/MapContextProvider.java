package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.LanguageCode;
import com.here.sdk.core.threading.Runnable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class MapContextProvider extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LanguageOptions {

        @Nullable
        public LanguageCode primary = null;

        @Nullable
        public LanguageCode secondary = null;
    }

    public MapContextProvider(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapContextProvider.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapContextProvider.disposeNativeHandle(j2);
            }
        });
    }

    @Nullable
    public static native MapContext create();

    public static native void destroy();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public static native LanguageOptions getLanguageOptions();

    @Nullable
    public static native ShadowQuality getShadowQuality();

    public static native void postToCallbackQueue(@NonNull Runnable runnable);

    public static native void setInitEnableUserControlledRenderLoop(boolean z);

    public static native void setLanguageOptions(@NonNull LanguageOptions languageOptions);

    public static native void setShadowQuality(@Nullable ShadowQuality shadowQuality);
}
