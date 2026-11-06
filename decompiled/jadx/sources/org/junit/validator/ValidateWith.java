package org.junit.validator;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes11.dex */
public @interface ValidateWith {
    Class<? extends AnnotationValidator> value();
}
