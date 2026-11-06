package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TypeKind;
import org.checkerframework.framework.qual.UpperBoundFor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor(typeKinds = {TypeKind.CHAR}, types = {Character.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({UnknownSignedness.class})
@UpperBoundFor(typeKinds = {TypeKind.CHAR}, types = {Character.class})
/* loaded from: classes11.dex */
public @interface Unsigned {
}
