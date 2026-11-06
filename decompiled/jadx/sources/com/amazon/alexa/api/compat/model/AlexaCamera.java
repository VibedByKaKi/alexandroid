package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaCamera;", "", "getId", "Lcom/amazon/alexa/api/compat/model/AlexaCameraId;", "getPhotoCaptureController", "Lcom/amazon/alexa/api/compat/model/AlexaPhotoCaptureController;", "getVideoCaptureController", "Lcom/amazon/alexa/api/compat/model/AlexaVideoCaptureController;", "getAutoCaptureSessionController", "Lcom/amazon/alexa/api/compat/model/AlexaAutoCaptureSessionController;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaCamera {
    @Nullable
    default AlexaAutoCaptureSessionController getAutoCaptureSessionController() {
        return null;
    }

    @NotNull
    AlexaCameraId getId();

    @NotNull
    AlexaPhotoCaptureController getPhotoCaptureController();

    @Nullable
    AlexaVideoCaptureController getVideoCaptureController();
}
