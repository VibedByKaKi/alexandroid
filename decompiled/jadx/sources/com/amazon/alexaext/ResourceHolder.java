package com.amazon.alexaext;

import android.content.Context;
import android.view.View;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.common.BoundObject;
import java.lang.ref.WeakReference;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ResourceHolder<R, V extends View> extends BoundObject {
    private WeakReference<Callback> wCallback;
    private WeakReference<R> wResource;
    private WeakReference<V> wView;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void resourceDestroyed(String str);

        void resourceReady(String str);

        void viewDestroyed(String str);

        void viewReady(String str, View view);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ViewDelegate {
        Context getContext();

        void setContentView(View view);
    }

    public ResourceHolder(String str) {
        bind(nCreate(str));
    }

    private native long nCreate(String str);

    private static native String nResourceId(long j);

    public Callback getCallback() {
        WeakReference<Callback> weakReference = this.wCallback;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public <T> T getFacet(Class<T> cls) {
        return cls.cast(getResource());
    }

    public R getResource() {
        try {
            return this.wResource.get();
        } catch (Exception e) {
            Single$$ExternalSyntheticBUOutline0.m$1(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Resource failure: ")), e);
            return null;
        }
    }

    public String resourceId() {
        return nResourceId(getNativeHandle());
    }

    public void setCallback(Callback callback) {
        this.wCallback = new WeakReference<>(callback);
    }

    public void setResource(R r) {
        this.wResource = new WeakReference<>(r);
    }

    public void setView(V v) {
        this.wView = new WeakReference<>(v);
    }
}
