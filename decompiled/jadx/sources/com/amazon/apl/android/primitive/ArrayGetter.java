package com.amazon.apl.android.primitive;

import com.amazon.apl.android.primitive.IterableProperty;
import com.amazon.apl.enums.APLEnum;
import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
abstract class ArrayGetter<K extends IterableProperty<T>, T> {
    protected final BoundObject mBoundObject;
    protected final APLEnum mPropertyKey;

    public ArrayGetter(BoundObject boundObject, APLEnum aPLEnum) {
        this.mBoundObject = boundObject;
        this.mPropertyKey = aPLEnum;
    }

    private static native int nSize(long j, int i);

    public abstract K builder();

    public abstract T get(int i);

    public int getIndex() {
        return this.mPropertyKey.getIndex();
    }

    public long getNativeHandle() {
        return this.mBoundObject.getNativeHandle();
    }

    public int size() {
        return nSize(getNativeHandle(), getIndex());
    }
}
