package androidx.databinding;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes13.dex */
class WeakListener<T> extends WeakReference<ViewDataBinding> {
    protected final int mLocalFieldId;
    private final ObservableReference<T> mObservable;
    private T mTarget;

    public WeakListener(ViewDataBinding viewDataBinding, int i, ObservableReference<T> observableReference, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.mLocalFieldId = i;
        this.mObservable = observableReference;
    }

    @Nullable
    public ViewDataBinding getBinder() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            unregister();
        }
        return viewDataBinding;
    }

    public T getTarget() {
        return this.mTarget;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.mObservable.setLifecycleOwner(lifecycleOwner);
    }

    public void setTarget(T t) {
        unregister();
        this.mTarget = t;
        if (t != null) {
            this.mObservable.addListener(t);
        }
    }

    public boolean unregister() {
        boolean z;
        T t = this.mTarget;
        if (t != null) {
            this.mObservable.removeListener(t);
            z = true;
        } else {
            z = false;
        }
        this.mTarget = null;
        return z;
    }
}
