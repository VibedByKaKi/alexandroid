package io.reactivex.rxjava3.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes13.dex */
public @interface SchedulerSupport {
    public static final String COMPUTATION = "io.reactivex:computation";
    public static final String CUSTOM = "custom";
    public static final String IO = "io.reactivex:io";
    public static final String NEW_THREAD = "io.reactivex:new-thread";
    public static final String NONE = "none";
    public static final String SINGLE = "io.reactivex:single";
    public static final String TRAMPOLINE = "io.reactivex:trampoline";

    String value();
}
