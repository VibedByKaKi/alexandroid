package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements Quirk {
    private static final Set<String> PIXEL_MODELS = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    private static boolean isOnePlus12() {
        return "oneplus".equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isPixelProblematicDevice() {
        return "google".equalsIgnoreCase(Build.BRAND) && PIXEL_MODELS.contains(Build.MODEL.toLowerCase());
    }

    private boolean isVideoCapturePreviewImageCaptureCombination(@NonNull Collection<UseCase> collection) {
        if (collection.size() != 3) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (UseCase useCase : collection) {
            if (useCase instanceof Preview) {
                z = true;
            } else if (useCase instanceof ImageCapture) {
                z3 = true;
            } else if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                z2 = useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            }
        }
        return z && z2 && z3;
    }

    public static boolean load() {
        return isOnePlus12() || isPixelProblematicDevice();
    }

    private boolean shouldForceEnableStreamSharingForOnePlus12(@NonNull String str, @NonNull Collection<UseCase> collection) {
        return str.equals("1") && isVideoCapturePreviewImageCaptureCombination(collection);
    }

    private boolean shouldForceEnableStreamSharingForPixelDevice(@NonNull String str, @NonNull Collection<UseCase> collection) {
        return str.equals("1") && isVideoCapturePreviewImageCaptureCombination(collection);
    }

    public boolean shouldForceEnableStreamSharing(@NonNull String str, @NonNull Collection<UseCase> collection) {
        if (isOnePlus12()) {
            return shouldForceEnableStreamSharingForOnePlus12(str, collection);
        }
        if (isPixelProblematicDevice()) {
            return shouldForceEnableStreamSharingForPixelDevice(str, collection);
        }
        return false;
    }
}
