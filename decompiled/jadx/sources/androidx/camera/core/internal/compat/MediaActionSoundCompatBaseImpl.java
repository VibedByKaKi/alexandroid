package androidx.camera.core.internal.compat;

import android.hardware.Camera;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class MediaActionSoundCompatBaseImpl {
    private static final int SAMPLE_CAMERA_ID = 0;

    private MediaActionSoundCompatBaseImpl() {
    }

    public static boolean mustPlayShutterSound() {
        if (Camera.getNumberOfCameras() < 1) {
            return false;
        }
        try {
            Camera.getCameraInfo(0, new Camera.CameraInfo());
            return !r0.canDisableShutterSound;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
