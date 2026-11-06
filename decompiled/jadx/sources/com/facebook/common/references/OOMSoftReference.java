package com.facebook.common.references;

import com.facebook.infer.annotation.Nullsafe;
import java.lang.ref.SoftReference;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class OOMSoftReference<T> {

    @Nullable
    SoftReference<T> softRef1 = null;

    @Nullable
    SoftReference<T> softRef2 = null;

    @Nullable
    SoftReference<T> softRef3 = null;

    public void clear() {
        SoftReference<T> softReference = this.softRef1;
        if (softReference != null) {
            softReference.clear();
            this.softRef1 = null;
        }
        SoftReference<T> softReference2 = this.softRef2;
        if (softReference2 != null) {
            softReference2.clear();
            this.softRef2 = null;
        }
        SoftReference<T> softReference3 = this.softRef3;
        if (softReference3 != null) {
            softReference3.clear();
            this.softRef3 = null;
        }
    }

    @Nullable
    public T get() {
        SoftReference<T> softReference = this.softRef1;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void set(T t) {
        this.softRef1 = new SoftReference<>(t);
        this.softRef2 = new SoftReference<>(t);
        this.softRef3 = new SoftReference<>(t);
    }
}
