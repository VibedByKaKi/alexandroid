package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk implements Quirk {
    public static boolean load() {
        "Samsung".equalsIgnoreCase(Build.BRAND);
        return false;
    }
}
