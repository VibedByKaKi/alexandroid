package com.mrousavy.camera.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/mrousavy/camera/core/RecorderError;", "Lcom/mrousavy/camera/core/CameraError;", "id", "", "message", "wasVideoRecorded", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)V", "getWasVideoRecorded", "()Z", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class RecorderError extends CameraError {
    private final boolean wasVideoRecorded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecorderError(@NotNull String str, @NotNull String str2, boolean z, @Nullable Throwable th) {
        super("capture", str, str2, th);
        str.getClass();
        str2.getClass();
        this.wasVideoRecorded = z;
    }

    public final boolean getWasVideoRecorded() {
        return this.wasVideoRecorded;
    }
}
