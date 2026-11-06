package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class Edge<T> implements Consumer<T> {
    private Consumer<T> mListener;

    @Override // androidx.core.util.Consumer
    public void accept(@NonNull T t) {
        this.mListener.getClass();
        this.mListener.accept(t);
    }

    public void setListener(@NonNull Consumer<T> consumer) {
        this.mListener = consumer;
    }
}
