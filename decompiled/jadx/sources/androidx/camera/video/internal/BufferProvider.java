package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Observable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface BufferProvider<T> extends Observable<State> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        ACTIVE,
        INACTIVE
    }

    @NonNull
    ListenableFuture<T> acquireBuffer();
}
