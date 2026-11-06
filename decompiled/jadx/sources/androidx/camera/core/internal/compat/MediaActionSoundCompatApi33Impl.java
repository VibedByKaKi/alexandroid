package androidx.camera.core.internal.compat;

import android.media.MediaActionSound;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(33)
/* loaded from: classes.dex */
class MediaActionSoundCompatApi33Impl {
    private MediaActionSoundCompatApi33Impl() {
    }

    public static boolean mustPlayShutterSound() {
        return MediaActionSound.mustPlayShutterSound();
    }
}
