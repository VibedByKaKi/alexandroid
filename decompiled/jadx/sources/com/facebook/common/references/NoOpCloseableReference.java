package com.facebook.common.references;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class NoOpCloseableReference<T> extends CloseableReference<T> {
    public NoOpCloseableReference(T t) {
        super(t, null, null, null, false);
    }

    @Override // com.facebook.common.references.CloseableReference
    public boolean isValid() {
        return true;
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: clone */
    public CloseableReference<T> mo23973clone() {
        return this;
    }

    @Override // com.facebook.common.references.CloseableReference
    public CloseableReference<T> cloneOrNull() {
        return this;
    }

    @Override // com.facebook.common.references.CloseableReference, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
