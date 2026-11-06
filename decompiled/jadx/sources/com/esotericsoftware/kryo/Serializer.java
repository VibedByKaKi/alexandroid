package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class Serializer<T> {
    private boolean acceptsNull;
    private boolean immutable;

    public Serializer(boolean z, boolean z2) {
        this.acceptsNull = z;
        this.immutable = z2;
    }

    public T copy(Kryo kryo, T t) {
        if (this.immutable) {
            return t;
        }
        throw new KryoException("Serializer does not support copy: ".concat(getClass().getName()));
    }

    public boolean getAcceptsNull() {
        return this.acceptsNull;
    }

    public boolean isImmutable() {
        return this.immutable;
    }

    public abstract T read(Kryo kryo, Input input, Class<T> cls);

    public void setAcceptsNull(boolean z) {
        this.acceptsNull = z;
    }

    public void setImmutable(boolean z) {
        this.immutable = z;
    }

    public abstract void write(Kryo kryo, Output output, T t);

    public Serializer(boolean z) {
        this.acceptsNull = z;
    }

    public Serializer() {
    }

    public void setGenerics(Kryo kryo, Class[] clsArr) {
    }
}
