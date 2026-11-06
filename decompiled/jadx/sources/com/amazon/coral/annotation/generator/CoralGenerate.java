package com.amazon.coral.annotation.generator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface CoralGenerate {
    Client[] client() default {};

    CompositeClient[] compositeClient() default {};

    Config[] configs() default {};

    Event[] event() default {};

    Explorer[] explorer() default {};

    Index[] index() default {};

    ModelValidation[] modelValidation() default {};

    Models[] models() default {};

    SdkClient[] sdkClient() default {};

    Server[] server() default {};

    SparrowhawkTypes[] sparrowhawkTypes() default {};

    Types[] types() default {};
}
