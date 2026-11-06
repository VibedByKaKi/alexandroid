package com.amazon.coral.annotation.generator;

import com.amazon.coral.annotation.Required;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface CompositeClientService {
    @Required
    String name();

    String[] operations() default {};
}
