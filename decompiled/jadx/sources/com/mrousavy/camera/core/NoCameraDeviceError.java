package com.mrousavy.camera.core;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mrousavy/camera/core/NoCameraDeviceError;", "Lcom/mrousavy/camera/core/CameraError;", "<init>", "()V", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NoCameraDeviceError extends CameraError {
    public NoCameraDeviceError() {
        super("device", "no-device", "No device was set! Use `useCameraDevice(..)` or `Camera.getAvailableCameraDevices()` to select a suitable Camera device.", null, 8, null);
    }
}
