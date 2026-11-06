package com.amazon.coral.reflect;

import com.amazon.coral.reflect.instantiate.AbstractInstantiator;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes19.dex */
public interface Instantiator<T> extends Supplier<T> {
    static <T> Instantiator<T> asReifiedSupplier(final Supplier<T> supplier, Class<T> cls) {
        return new AbstractInstantiator<T>(new Signature(cls, new Class[0])) { // from class: com.amazon.coral.reflect.Instantiator.1
            @Override // com.amazon.coral.reflect.Instantiator
            public T newInstance(Object... objArr) throws InstantiationException {
                if (objArr.length == 0) {
                    return (T) supplier.get();
                }
                Duration$$ExternalSyntheticBUOutline0.m();
                return null;
            }
        };
    }

    @Override // java.util.function.Supplier
    default T get() {
        return newInstance(new Object[0]);
    }

    @Deprecated
    default Signature<T> getSignature() {
        throw new UnsupportedOperationException();
    }

    T newInstance(Object... objArr) throws InstantiationException;
}
