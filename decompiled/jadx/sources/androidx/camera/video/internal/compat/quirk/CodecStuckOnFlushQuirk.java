package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Quirk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class CodecStuckOnFlushQuirk implements Quirk {
    private static boolean isNokia1() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isNokia1();
    }

    public boolean isProblematicMimeType(@Nullable String str) {
        return "video/mp4v-es".equals(str);
    }
}
