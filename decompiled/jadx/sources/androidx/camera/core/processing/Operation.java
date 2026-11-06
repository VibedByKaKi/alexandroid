package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.camera.core.ImageCaptureException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface Operation<I, O> {
    @NonNull
    @WorkerThread
    O apply(@NonNull I i) throws ImageCaptureException;
}
