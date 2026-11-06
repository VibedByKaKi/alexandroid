package com.amazon.alexa.smarthomecameras.dependencies.components;

import com.google.common.base.Preconditions;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CameraComponentProvider {
    private static CameraComponent cameraComponent;

    @Nullable
    public static synchronized CameraComponent getCameraComponent() {
        CameraComponent cameraComponent2;
        synchronized (CameraComponentProvider.class) {
            cameraComponent2 = cameraComponent;
        }
        return cameraComponent2;
    }

    public static synchronized void reset() {
        synchronized (CameraComponentProvider.class) {
            cameraComponent = null;
        }
    }

    public static synchronized void setCameraComponent(CameraComponent cameraComponent2) {
        synchronized (CameraComponentProvider.class) {
            Preconditions.checkNotNull(cameraComponent2, "CameraComponent cannot be null");
            cameraComponent = cameraComponent2;
        }
    }
}
