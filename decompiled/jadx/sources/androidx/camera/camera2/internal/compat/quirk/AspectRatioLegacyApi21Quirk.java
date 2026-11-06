package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class AspectRatioLegacyApi21Quirk implements Quirk {
    public static boolean load(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return false;
    }

    public int getCorrectedAspectRatio() {
        return 2;
    }
}
