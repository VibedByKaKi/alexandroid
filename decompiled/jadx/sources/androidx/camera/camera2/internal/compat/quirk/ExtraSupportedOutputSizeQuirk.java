package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import com.amazon.alexa.assistant.capability.legacyflags.LegacyFlags;
import com.amazon.alexa.client.alexaservice.audio.core.VolumeCalculatingInputStream;
import org.joda.time.DateTimeConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements Quirk {
    @NonNull
    private Size[] getMotoE5PlayExtraSupportedResolutions() {
        return new Size[]{new Size(DateTimeConstants.MINUTES_PER_DAY, LegacyFlags.DEFAULT_SCREEN_WIDTH), new Size(VolumeCalculatingInputStream.BUFFER_SIZE_IN_BYTES, 720)};
    }

    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoE5Play();
    }

    @NonNull
    public <T> Size[] getExtraSupportedResolutions(@NonNull Class<T> cls) {
        return (StreamConfigurationMap.isOutputSupportedFor(cls) && isMotoE5Play()) ? getMotoE5PlayExtraSupportedResolutions() : new Size[0];
    }

    @NonNull
    public Size[] getExtraSupportedResolutions(int i) {
        if (i == 34 && isMotoE5Play()) {
            return getMotoE5PlayExtraSupportedResolutions();
        }
        return new Size[0];
    }
}
