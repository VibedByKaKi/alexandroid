package com.amazon.alexa.api;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
abstract class Camera {
    protected static final AlexaCameraId DEFAULT_PARCELABLE_VALUE = null;

    @Nullable
    public abstract AutoCaptureSessionController getAutoCaptureSessionControllerMethod();

    public abstract AlexaCameraId getId();

    public abstract PhotoCaptureController getPhotoCaptureControllerMethod();

    @Nullable
    public abstract VideoCaptureController getVideoCaptureControllerMethod();
}
