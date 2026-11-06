package org.codehaus.jackson.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TypeReference<T> implements Comparable<TypeReference<T>> {
    final Type _type;

    public TypeReference() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            Single$$ExternalSyntheticBUOutline0.m$3("Internal error: TypeReference constructed without actual type information");
            throw null;
        }
        this._type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }

    public Type getType() {
        return this._type;
    }

    @Override // java.lang.Comparable
    public int compareTo(TypeReference<T> typeReference) {
        return 0;
    }
}
