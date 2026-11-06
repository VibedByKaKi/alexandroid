package dagger.spi.shaded.androidx.room.compiler.processing;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.squareup.javapoet.TypeName;
import dagger.spi.shaded.androidx.room.compiler.codegen.XTypeName;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u0000H&J\b\u0010\u001b\u001a\u00020\u001cH&J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0000H&J\b\u0010\u001e\u001a\u00020\u0000H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0000H&J\u0010\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0000H\u0016J\b\u0010#\u001a\u00020 H&J\b\u0010$\u001a\u00020 H&J\u0010\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0000H&J\u0014\u0010&\u001a\u00020 2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030'H&J\b\u0010(\u001a\u00020 H&J\b\u0010)\u001a\u00020\u0000H&J\b\u0010*\u001a\u00020\u0000H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006+À\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XType;", "", "nullability", "Ldagger/spi/shaded/androidx/room/compiler/processing/XNullability;", "getNullability", "()Landroidx/room/compiler/processing/XNullability;", ContactProviderContract.AddressEntry.COLUMN_ADDRESS_RAW_TYPE, "Ldagger/spi/shaded/androidx/room/compiler/processing/XRawType;", "getRawType", "()Landroidx/room/compiler/processing/XRawType;", "superTypes", "", "getSuperTypes", "()Ljava/util/List;", "typeArguments", "getTypeArguments", "typeElement", "Ldagger/spi/shaded/androidx/room/compiler/processing/XTypeElement;", "getTypeElement", "()Landroidx/room/compiler/processing/XTypeElement;", "typeName", "Lcom/squareup/javapoet/TypeName;", "getTypeName", "()Lcom/squareup/javapoet/TypeName;", "asTypeName", "Ldagger/spi/shaded/androidx/room/compiler/codegen/XTypeName;", "boxed", "defaultValue", "", "extendsBound", "extendsBoundOrSelf", "isAssignableFrom", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "isAssignableFromWithoutVariance", "isError", "isNone", "isSameType", "isTypeOf", "Lkotlin/reflect/KClass;", "isTypeVariable", "makeNonNullable", "makeNullable", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XType {
    @NotNull
    XTypeName asTypeName();

    @NotNull
    XType boxed();

    @NotNull
    String defaultValue();

    @Nullable
    XType extendsBound();

    @NotNull
    default XType extendsBoundOrSelf() {
        XType extendsBound = extendsBound();
        return extendsBound == null ? this : extendsBound;
    }

    @NotNull
    XNullability getNullability();

    @NotNull
    XRawType getRawType();

    @NotNull
    List<XType> getSuperTypes();

    @NotNull
    List<XType> getTypeArguments();

    @Nullable
    XTypeElement getTypeElement();

    @NotNull
    TypeName getTypeName();

    boolean isAssignableFrom(@NotNull XType other);

    default boolean isAssignableFromWithoutVariance(@NotNull XType other) {
        boolean isAssignableWithoutVariance;
        other.getClass();
        isAssignableWithoutVariance = XTypeKt.isAssignableWithoutVariance(other, this);
        return isAssignableWithoutVariance;
    }

    boolean isError();

    boolean isNone();

    boolean isSameType(@NotNull XType other);

    boolean isTypeOf(@NotNull KClass<?> other);

    boolean isTypeVariable();

    @NotNull
    XType makeNonNullable();

    @NotNull
    XType makeNullable();
}
