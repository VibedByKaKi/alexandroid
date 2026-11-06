package androidx.camera.core.impl.utils;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.core.Logger;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class CameraOrientationUtil {
    private static final String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int degreesToSurfaceRotation(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(i, "Invalid sensor rotation: "));
        return 0;
    }

    public static int getRelativeImageRotation(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (Logger.isVerboseEnabled(TAG)) {
            StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            m29m.append(z);
            m29m.append(", result=");
            m29m.append(i3);
            Logger.d(TAG, m29m.toString());
        }
        return i3;
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unsupported surface rotation: "));
        return 0;
    }
}
