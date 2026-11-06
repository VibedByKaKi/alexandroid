package com.amazon.coral.reflect.invoke;

import com.amazon.coral.reflect.Invoker;
import com.amazon.coral.reflect.Signature;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class AbstractInvoker implements Invoker {
    private final Map<Class<? extends Annotation>, Annotation> annotations;
    private final Signature<?> signature;

    public AbstractInvoker(Signature<?> signature, Annotation[] annotationArr) {
        if (signature == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        if (annotationArr == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        for (Annotation annotation : annotationArr) {
            if (annotation == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
        }
        this.signature = signature;
        LinkedHashMap linkedHashMap = new LinkedHashMap(annotationArr.length);
        for (Annotation annotation2 : annotationArr) {
            linkedHashMap.put(annotation2.annotationType(), annotation2);
        }
        this.annotations = Collections.unmodifiableMap(linkedHashMap);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractInvoker) {
            return getSignature().equals(((AbstractInvoker) obj).getSignature());
        }
        return false;
    }

    @Override // com.amazon.coral.reflect.Invoker
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.annotations.get(cls);
    }

    @Override // com.amazon.coral.reflect.Invoker
    public Iterable<Annotation> getAnnotations() {
        return this.annotations.values();
    }

    @Override // com.amazon.coral.reflect.Invoker
    public Signature<?> getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode();
    }

    public String toString() {
        return this.signature.toString();
    }
}
