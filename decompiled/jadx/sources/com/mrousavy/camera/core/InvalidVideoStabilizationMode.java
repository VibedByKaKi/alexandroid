package com.mrousavy.camera.core;

import com.mrousavy.camera.core.types.VideoStabilizationMode;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/mrousavy/camera/core/InvalidVideoStabilizationMode;", "Lcom/mrousavy/camera/core/CameraError;", "mode", "Lcom/mrousavy/camera/core/types/VideoStabilizationMode;", "<init>", "(Lcom/mrousavy/camera/core/types/VideoStabilizationMode;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InvalidVideoStabilizationMode extends CameraError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidVideoStabilizationMode(@NotNull VideoStabilizationMode videoStabilizationMode) {
        super("format", "invalid-video-stabilization-mode", a$$ExternalSyntheticOutline0.m("The given format does not support the videoStabilizationMode \"", videoStabilizationMode.getUnionValue(), "\"! Select a format that contains ", videoStabilizationMode.getUnionValue(), " in `format.supportedVideoStabilizationModes`."), null, 8, null);
        videoStabilizationMode.getClass();
    }
}
