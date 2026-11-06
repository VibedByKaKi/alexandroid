package dagger.spi.shaded.androidx.room.compiler.processing.javac.kotlin;

import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.NullType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.UnionType;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.AbstractTypeVisitor8;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010!J\u001d\u0010\"\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010$J\u001d\u0010%\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010'J\u001d\u0010(\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/JvmDescriptorTypeVisitor;", "Ljavax/lang/model/util/AbstractTypeVisitor8;", "", "", "()V", "visitArray", "t", "Ljavax/lang/model/type/ArrayType;", "u", "(Ljavax/lang/model/type/ArrayType;Lkotlin/Unit;)Ljava/lang/String;", "visitDeclared", "Ljavax/lang/model/type/DeclaredType;", "(Ljavax/lang/model/type/DeclaredType;Lkotlin/Unit;)Ljava/lang/String;", "visitError", "Ljavax/lang/model/type/ErrorType;", "(Ljavax/lang/model/type/ErrorType;Lkotlin/Unit;)Ljava/lang/String;", "visitExecutable", "Ljavax/lang/model/type/ExecutableType;", "(Ljavax/lang/model/type/ExecutableType;Lkotlin/Unit;)Ljava/lang/String;", "visitIntersection", "Ljavax/lang/model/type/IntersectionType;", "(Ljavax/lang/model/type/IntersectionType;Lkotlin/Unit;)Ljava/lang/String;", "visitNoType", "Ljavax/lang/model/type/NoType;", "(Ljavax/lang/model/type/NoType;Lkotlin/Unit;)Ljava/lang/String;", "visitNull", "Ljavax/lang/model/type/NullType;", "(Ljavax/lang/model/type/NullType;Lkotlin/Unit;)Ljava/lang/String;", "visitPrimitive", "Ljavax/lang/model/type/PrimitiveType;", "(Ljavax/lang/model/type/PrimitiveType;Lkotlin/Unit;)Ljava/lang/String;", "visitTypeVariable", "Ljavax/lang/model/type/TypeVariable;", "(Ljavax/lang/model/type/TypeVariable;Lkotlin/Unit;)Ljava/lang/String;", "visitUnion", "Ljavax/lang/model/type/UnionType;", "(Ljavax/lang/model/type/UnionType;Lkotlin/Unit;)Ljava/lang/String;", "visitUnknown", "Ljavax/lang/model/type/TypeMirror;", "(Ljavax/lang/model/type/TypeMirror;Lkotlin/Unit;)Ljava/lang/String;", "visitWildcard", "Ljavax/lang/model/type/WildcardType;", "(Ljavax/lang/model/type/WildcardType;Lkotlin/Unit;)Ljava/lang/String;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class JvmDescriptorTypeVisitor extends AbstractTypeVisitor8<String, Unit> {

    @NotNull
    public static final JvmDescriptorTypeVisitor INSTANCE = new JvmDescriptorTypeVisitor();

    private JvmDescriptorTypeVisitor() {
    }

    @NotNull
    public String visitArray(@NotNull ArrayType t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        return JvmDescriptorUtilsKt.descriptor(t);
    }

    @NotNull
    public String visitDeclared(@NotNull DeclaredType t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        return JvmDescriptorUtilsKt.getDescriptor(t);
    }

    @NotNull
    public String visitError(@NotNull ErrorType t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        throw new TypeNotPresentException(t.toString(), null);
    }

    @NotNull
    public String visitExecutable(@NotNull ExecutableType t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        return JvmDescriptorUtilsKt.descriptor(t);
    }

    @NotNull
    public String visitIntersection(@NotNull IntersectionType t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        return JvmDescriptorUtilsKt.descriptor(t);
    }

    @NotNull
    public String visitNoType(@NotNull NoType t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        return JvmDescriptorUtilsKt.getDescriptor(t);
    }

    @NotNull
    public String visitNull(@NotNull NullType t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        return visitUnknown((TypeMirror) t, u);
    }

    @NotNull
    public String visitPrimitive(@NotNull PrimitiveType t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        return JvmDescriptorUtilsKt.getDescriptor(t);
    }

    @NotNull
    public String visitTypeVariable(@NotNull TypeVariable t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        return JvmDescriptorUtilsKt.descriptor(t);
    }

    @NotNull
    public String visitUnion(@NotNull UnionType t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        return visitUnknown((TypeMirror) t, u);
    }

    @NotNull
    public String visitUnknown(@NotNull TypeMirror t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        throw new IllegalStateException(("Unsupported type " + t).toString());
    }

    @NotNull
    public String visitWildcard(@NotNull WildcardType t, @NotNull Unit u) {
        t.getClass();
        u.getClass();
        return JvmDescriptorUtilsKt.descriptor(t);
    }
}
