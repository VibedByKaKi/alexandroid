package com.mrousavy.camera.core.extensions;

import android.annotation.SuppressLint;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"id", "", "Landroidx/camera/core/CameraInfo;", "getId", "(Landroidx/camera/core/CameraInfo;)Ljava/lang/String;", "react-native-vision-camera_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CameraInfo_idKt {
    @SuppressLint({"RestrictedApi"})
    @Nullable
    public static final String getId(@NotNull CameraInfo cameraInfo) {
        cameraInfo.getClass();
        CameraInfoInternal cameraInfoInternal = cameraInfo instanceof CameraInfoInternal ? (CameraInfoInternal) cameraInfo : null;
        if (cameraInfoInternal != null) {
            return cameraInfoInternal.getCameraId();
        }
        return null;
    }
}
