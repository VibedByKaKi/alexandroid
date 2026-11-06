package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class ExtendedCameraConfigProviderStore {
    private static final Object LOCK = new Object();

    @GuardedBy("LOCK")
    private static final Map<Object, CameraConfigProvider> CAMERA_CONFIG_PROVIDERS = new HashMap();

    private ExtendedCameraConfigProviderStore() {
    }

    public static void addConfig(@NonNull Object obj, @NonNull CameraConfigProvider cameraConfigProvider) {
        synchronized (LOCK) {
            CAMERA_CONFIG_PROVIDERS.put(obj, cameraConfigProvider);
        }
    }

    public static void clear() {
        synchronized (LOCK) {
            CAMERA_CONFIG_PROVIDERS.clear();
        }
    }

    @NonNull
    public static CameraConfigProvider getConfigProvider(@NonNull Object obj) {
        CameraConfigProvider cameraConfigProvider;
        synchronized (LOCK) {
            cameraConfigProvider = CAMERA_CONFIG_PROVIDERS.get(obj);
        }
        return cameraConfigProvider == null ? CameraConfigProvider.EMPTY : cameraConfigProvider;
    }
}
