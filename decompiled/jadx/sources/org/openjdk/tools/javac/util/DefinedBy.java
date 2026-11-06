package org.openjdk.tools.javac.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes12.dex */
public @interface DefinedBy {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Api {
        ANNOTATION_PROCESSING("org.openjdk.javax.annotation.processing"),
        COMPILER("org.openjdk.javax.tools"),
        COMPILER_TREE("org.openjdk.source"),
        LANGUAGE_MODEL("org.openjdk.javax.lang.model");

        public final String packageRoot;

        Api(String str) {
            this.packageRoot = str;
        }
    }

    Api value();
}
