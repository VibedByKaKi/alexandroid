package dagger.internal.codegen.base;

import com.google.auto.value.AutoValue;
import com.google.common.base.Preconditions;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.TypeName;
import dagger.internal.codegen.javapoet.TypeNames;
import dagger.internal.codegen.xprocessing.XTypes;
import dagger.spi.model.Key;
import dagger.spi.shaded.androidx.room.compiler.processing.XType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class SetType {
    private XType type;

    public static SetType from(XType xType) {
        Preconditions.checkArgument(isSet(xType), "%s must be a Set", xType);
        AutoValue_SetType autoValue_SetType = new AutoValue_SetType(xType.getTypeName());
        ((SetType) autoValue_SetType).type = xType;
        return autoValue_SetType;
    }

    public static boolean isSet(Key key) {
        return isSet(key.type().xprocessing());
    }

    private XType type() {
        return this.type;
    }

    public XType elementType() {
        return XTypes.unwrapType(type());
    }

    public boolean elementsAreTypeOf(ClassName className) {
        return !isRawType() && XTypes.isTypeOf(elementType(), className);
    }

    public boolean isRawType() {
        return XTypes.isRawParameterizedType(type());
    }

    public abstract TypeName typeName();

    public XType unwrappedElementType(ClassName className) {
        Preconditions.checkArgument(elementsAreTypeOf(className), "expected elements to be %s, but this type is %s", className, type());
        return XTypes.unwrapType(elementType());
    }

    public static boolean isSet(XType xType) {
        return XTypes.isTypeOf(xType, TypeNames.SET);
    }

    public static SetType from(Key key) {
        return from(key.type().xprocessing());
    }
}
