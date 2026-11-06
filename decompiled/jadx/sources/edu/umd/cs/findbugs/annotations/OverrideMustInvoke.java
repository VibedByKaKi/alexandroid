package edu.umd.cs.findbugs.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.METHOD})
@Deprecated
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes9.dex */
public @interface OverrideMustInvoke {
    When value() default When.ANYTIME;
}
