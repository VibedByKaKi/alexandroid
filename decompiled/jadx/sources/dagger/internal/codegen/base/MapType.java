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
public abstract class MapType {
    private XType type;

    public static MapType from(XType xType) {
        Preconditions.checkArgument(isMap(xType), "%s is not a Map", xType);
        AutoValue_MapType autoValue_MapType = new AutoValue_MapType(xType.getTypeName());
        ((MapType) autoValue_MapType).type = xType;
        return autoValue_MapType;
    }

    public static boolean isMap(Key key) {
        return isMap(key.type().xprocessing());
    }

    private XType type() {
        return this.type;
    }

    private XType uncheckedUnwrappedValueType() {
        return XTypes.unwrapType(valueType());
    }

    public boolean isRawType() {
        return XTypes.isRawParameterizedType(type());
    }

    public XType keyType() {
        Preconditions.checkState(!isRawType());
        return type().getTypeArguments().get(0);
    }

    public abstract TypeName typeName();

    public XType unwrappedFrameworkValueType() {
        Preconditions.checkState(valuesAreFrameworkType(), "called unwrappedFrameworkValueType() on %s", type());
        return uncheckedUnwrappedValueType();
    }

    public XType unwrappedValueType(ClassName className) {
        Preconditions.checkState(valuesAreTypeOf(className), "expected values to be %s: %s", className, this);
        return uncheckedUnwrappedValueType();
    }

    public XType valueType() {
        Preconditions.checkState(!isRawType());
        return type().getTypeArguments().get(1);
    }

    public boolean valuesAreFrameworkType() {
        return FrameworkTypes.isFrameworkType(valueType());
    }

    public boolean valuesAreTypeOf(ClassName className) {
        return !isRawType() && XTypes.isTypeOf(valueType(), className);
    }

    public static boolean isMap(XType xType) {
        return XTypes.isTypeOf(xType, TypeNames.MAP);
    }

    public static MapType from(Key key) {
        return from(key.type().xprocessing());
    }
}
