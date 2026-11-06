package com.mrousavy.camera.core;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"getVideoCapturedMessage", "", "wasVideoCaptured", "", "react-native-vision-camera_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CameraErrorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getVideoCapturedMessage(boolean z) {
        return z ? "The output file was generated, so the recording may be valid." : "The output file was generated but the recording will not be valid, so you should delete the file.";
    }
}
