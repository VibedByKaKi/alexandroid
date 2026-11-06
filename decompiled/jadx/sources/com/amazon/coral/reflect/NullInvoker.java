package com.amazon.coral.reflect;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NullInvoker implements Invoker {
    @Override // com.amazon.coral.reflect.Invoker
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return null;
    }

    @Override // com.amazon.coral.reflect.Invoker
    public Iterable<Annotation> getAnnotations() {
        return null;
    }

    @Override // com.amazon.coral.reflect.Invoker
    public Signature<?> getSignature() {
        return null;
    }

    @Override // com.amazon.coral.reflect.Invoker
    public Object invoke(Object obj, Object... objArr) throws InvocationException {
        return null;
    }
}
