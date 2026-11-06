package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.introspect.Annotated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class AnnotatedAndMetadata<A extends Annotated, M> {
    public final A annotated;
    public final M metadata;

    public AnnotatedAndMetadata(A a2, M m) {
        this.annotated = a2;
        this.metadata = m;
    }

    public static <A extends Annotated, M> AnnotatedAndMetadata<A, M> of(A a2, M m) {
        return new AnnotatedAndMetadata<>(a2, m);
    }
}
