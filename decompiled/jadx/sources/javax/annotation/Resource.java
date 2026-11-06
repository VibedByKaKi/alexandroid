package javax.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Repeatable(Resources.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface Resource {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AuthenticationType {
        CONTAINER,
        APPLICATION
    }

    AuthenticationType authenticationType() default AuthenticationType.CONTAINER;

    String description() default "";

    String lookup() default "";

    String mappedName() default "";

    String name() default "";

    boolean shareable() default true;

    Class<?> type() default Object.class;
}
