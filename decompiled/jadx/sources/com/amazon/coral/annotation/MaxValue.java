package com.amazon.coral.annotation;

import com.amazon.coral.annotation.customtrait.RequiredProperty;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface MaxValue {
    @RequiredProperty
    @TraitProperty(name = ReactProperties.GEOFENCE_MAXIMUM_RANGE)
    String value();
}
