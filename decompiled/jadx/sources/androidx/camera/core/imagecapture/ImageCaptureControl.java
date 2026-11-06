package androidx.camera.core.imagecapture;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CaptureConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface ImageCaptureControl {
    @MainThread
    void lockFlashMode();

    @NonNull
    @MainThread
    ListenableFuture<Void> submitStillCaptureRequests(@NonNull List<CaptureConfig> list);

    @MainThread
    void unlockFlashMode();
}
