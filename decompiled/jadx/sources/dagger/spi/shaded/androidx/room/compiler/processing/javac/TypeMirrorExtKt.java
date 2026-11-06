package dagger.spi.shaded.androidx.room.compiler.processing.javac;

import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.SimpleTypeVisitor8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"extendsBound", "Ljavax/lang/model/type/TypeMirror;", "room-compiler-processing"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class TypeMirrorExtKt {
    @Nullable
    public static final TypeMirror extendsBound(@NotNull TypeMirror typeMirror) {
        typeMirror.getClass();
        return (TypeMirror) typeMirror.accept(new SimpleTypeVisitor8<TypeMirror, Void>() { // from class: dagger.spi.shaded.androidx.room.compiler.processing.javac.TypeMirrorExtKt$extendsBound$1
            @Nullable
            public TypeMirror visitWildcard(@NotNull WildcardType type, @Nullable Void ignored) {
                type.getClass();
                TypeMirror extendsBound = type.getExtendsBound();
                return extendsBound == null ? type.getSuperBound() : extendsBound;
            }
        }, (Object) null);
    }
}
