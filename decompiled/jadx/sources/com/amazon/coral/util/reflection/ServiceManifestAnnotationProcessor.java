package com.amazon.coral.util.reflection;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class ServiceManifestAnnotationProcessor extends AbstractManifestAnnotationProcessor {
    private static final String OUTPUT_PATH_PREFIX = "META-INF/services/";

    public ServiceManifestAnnotationProcessor(Class<? extends Annotation> cls, Class<?> cls2) {
        this(cls, cls2, OUTPUT_PATH_PREFIX.concat(cls2.getName()));
    }

    public ServiceManifestAnnotationProcessor(Class<? extends Annotation> cls, Class cls2, String str) {
        super(cls, cls2, str);
    }
}
