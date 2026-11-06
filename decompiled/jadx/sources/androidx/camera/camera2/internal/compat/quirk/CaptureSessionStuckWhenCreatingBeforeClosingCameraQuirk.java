package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk implements Quirk {
    public static boolean load(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return shouldLoadForMotoE20(cameraCharacteristicsCompat);
    }

    private static boolean shouldLoadForMotoE20(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && cameraCharacteristicsCompat.getCameraId().equals("1");
    }
}
