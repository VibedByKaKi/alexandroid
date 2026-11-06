package com.amazon.coral.google.common.primitives;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.TYPE})
@TypeQualifierDefault({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Nonnull
@GwtCompatible
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes19.dex */
@interface ElementTypesAreNonnullByDefault {
}
