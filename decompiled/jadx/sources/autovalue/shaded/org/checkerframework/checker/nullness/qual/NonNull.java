package autovalue.shaded.org.checkerframework.checker.nullness.qual;

import autovalue.shaded.org.checkerframework.framework.qual.DefaultFor;
import autovalue.shaded.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import autovalue.shaded.org.checkerframework.framework.qual.LiteralKind;
import autovalue.shaded.org.checkerframework.framework.qual.QualifierForLiterals;
import autovalue.shaded.org.checkerframework.framework.qual.SubtypeOf;
import autovalue.shaded.org.checkerframework.framework.qual.TypeKind;
import autovalue.shaded.org.checkerframework.framework.qual.TypeUseLocation;
import autovalue.shaded.org.checkerframework.framework.qual.UpperBoundFor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {TypeKind.PACKAGE, TypeKind.INT, TypeKind.BOOLEAN, TypeKind.CHAR, TypeKind.DOUBLE, TypeKind.FLOAT, TypeKind.LONG, TypeKind.SHORT, TypeKind.BYTE})
@DefaultFor({TypeUseLocation.EXCEPTION_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@DefaultQualifierInHierarchy
@QualifierForLiterals({LiteralKind.STRING})
@SubtypeOf({MonotonicNonNull.class})
@Documented
/* loaded from: classes15.dex */
public @interface NonNull {
}
