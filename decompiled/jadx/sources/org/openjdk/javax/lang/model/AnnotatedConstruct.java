package org.openjdk.javax.lang.model;

import java.lang.annotation.Annotation;
import java.util.List;
import org.openjdk.javax.lang.model.element.AnnotationMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface AnnotatedConstruct {
    <A extends Annotation> A getAnnotation(Class<A> cls);

    List<? extends AnnotationMirror> getAnnotationMirrors();

    <A extends Annotation> A[] getAnnotationsByType(Class<A> cls);
}
