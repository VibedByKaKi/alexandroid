package androidx.camera.core;

import androidx.annotation.NonNull;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface ImageCaptureCapabilities {
    @NonNull
    @ExperimentalImageCaptureOutputFormat
    Set<Integer> getSupportedOutputFormats();

    boolean isCaptureProcessProgressSupported();

    boolean isPostviewSupported();
}
