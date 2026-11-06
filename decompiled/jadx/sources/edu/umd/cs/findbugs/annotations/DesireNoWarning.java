package edu.umd.cs.findbugs.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes9.dex */
public @interface DesireNoWarning {
    Confidence confidence() default Confidence.LOW;

    int num() default 0;

    @Deprecated
    Priority priority() default Priority.LOW;

    String value();
}
