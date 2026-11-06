package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Quirk;
import com.amazon.alexa.assistant.capability.legacyflags.LegacyFlags;
import com.amazon.alexa.client.alexaservice.audio.core.VolumeCalculatingInputStream;
import org.joda.time.DateTimeConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class StretchedVideoResolutionQuirk implements Quirk {
    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoE5Play();
    }

    @Nullable
    public Size getAlternativeResolution(int i) {
        if (i == 4) {
            return new Size(640, 480);
        }
        if (i == 5) {
            return new Size(VolumeCalculatingInputStream.BUFFER_SIZE_IN_BYTES, 720);
        }
        if (i != 6) {
            return null;
        }
        return new Size(DateTimeConstants.MINUTES_PER_DAY, LegacyFlags.DEFAULT_SCREEN_WIDTH);
    }
}
