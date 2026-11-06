package androidx.camera.core.internal.compat;

import android.os.Build;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class MediaActionSoundCompat {
    private MediaActionSoundCompat() {
    }

    public static boolean mustPlayShutterSound() {
        return Build.VERSION.SDK_INT >= 33 ? MediaActionSoundCompatApi33Impl.mustPlayShutterSound() : MediaActionSoundCompatBaseImpl.mustPlayShutterSound();
    }
}
