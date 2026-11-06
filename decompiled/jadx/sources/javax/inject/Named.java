package javax.inject;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface Named {
    String value() default "";
}
