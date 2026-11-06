package com.amazon.coral.reflect;

import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes19.dex */
public interface InstantiatorFactory extends DependencyInjector {
    @Override // com.amazon.coral.reflect.DependencyInjector
    default <T> Supplier<T> getSupplier(Class<T> cls) {
        return newInstantiator(cls, new Class[0]);
    }

    @Deprecated
    <T> Instantiator<T> newInstantiator(Class<T> cls, Class<?>... clsArr);
}
