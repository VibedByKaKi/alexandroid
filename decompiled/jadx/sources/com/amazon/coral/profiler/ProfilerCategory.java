package com.amazon.coral.profiler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE})
@Deprecated
@Inherited
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes19.dex */
public @interface ProfilerCategory {
    public static final String CORAL_ACTIVITY = "CoralActivity";
    public static final String CORAL_FRAMEWORK = "CoralFramework";
    public static final String OTHER = "Other";
    public static final String SHARED_FRAMEWORK = "SharedFramework";
    public static final String UNKNOWN = "?";

    String value() default "Other";
}
