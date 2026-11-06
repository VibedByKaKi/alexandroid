package com.amazon.coral.annotation;

import com.amazon.coral.annotation.converters.AwsQueryErrorTypeFieldConverter;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.annotation.customtrait.ValueConverter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface AwsQueryError {
    @TraitProperty(name = "code")
    String code() default "N/A";

    @TraitProperty(name = "httpresponsecode")
    int httpCode() default 400;

    @ValueConverter(AwsQueryErrorTypeFieldConverter.class)
    @TraitProperty(name = "senderfault")
    AwsQueryErrorType type() default AwsQueryErrorType.Sender;
}
