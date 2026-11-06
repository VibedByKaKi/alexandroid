package com.mrousavy.camera.core;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mrousavy/camera/core/UnknownRecorderError;", "Lcom/mrousavy/camera/core/RecorderError;", "wasVideoRecorded", "", "cause", "", "<init>", "(ZLjava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UnknownRecorderError extends RecorderError {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UnknownRecorderError(boolean r5, @org.jetbrains.annotations.Nullable java.lang.Throwable r6) {
        /*
            r4 = this;
            java.lang.String r0 = com.mrousavy.camera.core.CameraErrorKt.access$getVideoCapturedMessage(r5)
            if (r6 == 0) goto Lb
            java.lang.String r1 = r6.getMessage()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.String r2 = "An error occurred while recording a video! "
            java.lang.String r3 = " "
            java.lang.String r0 = defpackage.a$$ExternalSyntheticOutline0.m(r2, r0, r3, r1)
            java.lang.String r1 = "recorder-error"
            r4.<init>(r1, r0, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.core.UnknownRecorderError.<init>(boolean, java.lang.Throwable):void");
    }
}
