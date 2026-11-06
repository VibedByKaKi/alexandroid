package com.amazon.alexa.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes16.dex */
public @interface AssistantSubcomponent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Forward {
        String method();

        Class<?> sender() default void.class;

        String to() default "";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Registry {
        String deregister();

        String field();

        String register();
    }

    Class<?> api();

    Forward[] forwards() default {};

    Registry[] registries() default {};

    Class<?> sender() default void.class;

    String tag() default "";
}
