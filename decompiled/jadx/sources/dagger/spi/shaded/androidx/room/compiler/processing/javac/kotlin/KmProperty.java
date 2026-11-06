package dagger.spi.shaded.androidx.room.compiler.processing.javac.kotlin;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.metadata.Flag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0006\u0010\u001f\u001a\u00020\u001bJ\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/KmProperty;", "", "name", "", "type", "Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/KmType;", "getter", "Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/KmFunction;", "setter", "(Ljava/lang/String;Landroidx/room/compiler/processing/javac/kotlin/KmType;Landroidx/room/compiler/processing/javac/kotlin/KmFunction;Landroidx/room/compiler/processing/javac/kotlin/KmFunction;)V", "getGetter", "()Landroidx/room/compiler/processing/javac/kotlin/KmFunction;", "getName", "()Ljava/lang/String;", "getSetter", "getType", "()Landroidx/room/compiler/processing/javac/kotlin/KmType;", "typeParameters", "", "getTypeParameters", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "isNullable", "toString", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class KmProperty {

    @Nullable
    private final KmFunction getter;

    @NotNull
    private final String name;

    @Nullable
    private final KmFunction setter;

    @NotNull
    private final KmType type;

    public KmProperty(@NotNull String str, @NotNull KmType kmType, @Nullable KmFunction kmFunction, @Nullable KmFunction kmFunction2) {
        str.getClass();
        kmType.getClass();
        this.name = str;
        this.type = kmType;
        this.getter = kmFunction;
        this.setter = kmFunction2;
    }

    public static /* synthetic */ KmProperty copy$default(KmProperty kmProperty, String str, KmType kmType, KmFunction kmFunction, KmFunction kmFunction2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kmProperty.name;
        }
        if ((i & 2) != 0) {
            kmType = kmProperty.type;
        }
        if ((i & 4) != 0) {
            kmFunction = kmProperty.getter;
        }
        if ((i & 8) != 0) {
            kmFunction2 = kmProperty.setter;
        }
        return kmProperty.copy(str, kmType, kmFunction, kmFunction2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final KmType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final KmFunction getGetter() {
        return this.getter;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final KmFunction getSetter() {
        return this.setter;
    }

    @NotNull
    public final KmProperty copy(@NotNull String name, @NotNull KmType type, @Nullable KmFunction getter, @Nullable KmFunction setter) {
        name.getClass();
        type.getClass();
        return new KmProperty(name, type, getter, setter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KmProperty)) {
            return false;
        }
        KmProperty kmProperty = (KmProperty) other;
        return Intrinsics.areEqual(this.name, kmProperty.name) && Intrinsics.areEqual(this.type, kmProperty.type) && Intrinsics.areEqual(this.getter, kmProperty.getter) && Intrinsics.areEqual(this.setter, kmProperty.setter);
    }

    @Nullable
    public final KmFunction getGetter() {
        return this.getter;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final KmFunction getSetter() {
        return this.setter;
    }

    @NotNull
    public final KmType getType() {
        return this.type;
    }

    @NotNull
    public final List<KmType> getTypeParameters() {
        return this.type.getTypeArguments();
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (this.name.hashCode() * 31)) * 31;
        KmFunction kmFunction = this.getter;
        int hashCode2 = (hashCode + (kmFunction == null ? 0 : kmFunction.hashCode())) * 31;
        KmFunction kmFunction2 = this.setter;
        return hashCode2 + (kmFunction2 != null ? kmFunction2.hashCode() : 0);
    }

    public final boolean isNullable() {
        return Flag.Type.IS_NULLABLE.invoke(this.type.getFlags());
    }

    @NotNull
    public String toString() {
        return "KmProperty(name=" + this.name + ", type=" + this.type + ", getter=" + this.getter + ", setter=" + this.setter + ')';
    }
}
