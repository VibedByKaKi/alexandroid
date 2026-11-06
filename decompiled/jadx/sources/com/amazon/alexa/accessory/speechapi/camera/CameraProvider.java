package com.amazon.alexa.accessory.speechapi.camera;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/camera/CameraProvider;", "", "getAutoCaptureSessionController", "Lcom/amazon/alexa/accessory/speechapi/camera/AutoCaptureSessionController;", "getCameraId", "", "getPhotoCaptureController", "Lcom/amazon/alexa/accessory/speechapi/camera/PhotoCaptureController;", "getVideoCaptureController", "Lcom/amazon/alexa/accessory/speechapi/camera/VideoCaptureController;", "observeNotifyCameraAction", "", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface CameraProvider {
    @Nullable
    AutoCaptureSessionController getAutoCaptureSessionController();

    @NotNull
    String getCameraId();

    @NotNull
    PhotoCaptureController getPhotoCaptureController();

    @Nullable
    VideoCaptureController getVideoCaptureController();

    void observeNotifyCameraAction();
}
