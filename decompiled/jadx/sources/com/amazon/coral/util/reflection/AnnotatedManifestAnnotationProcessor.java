package com.amazon.coral.util.reflection;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class AnnotatedManifestAnnotationProcessor extends AbstractManifestAnnotationProcessor {
    private static final String OUTPUT_PATH_PREFIX = "META-INF/annotated/";

    public AnnotatedManifestAnnotationProcessor(Class<? extends Annotation> cls) {
        super(cls, Object.class, OUTPUT_PATH_PREFIX.concat(cls.getName()));
    }
}
