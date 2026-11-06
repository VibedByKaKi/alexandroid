package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class NameResolverUtilKt {
    @NotNull
    public static final ClassId getClassId(@NotNull NameResolver nameResolver, int i) {
        nameResolver.getClass();
        return ClassId.Companion.fromString(nameResolver.getQualifiedClassName(i), nameResolver.isLocalClassName(i));
    }

    @NotNull
    public static final Name getName(@NotNull NameResolver nameResolver, int i) {
        nameResolver.getClass();
        Name guessByFirstCharacter = Name.guessByFirstCharacter(nameResolver.getString(i));
        guessByFirstCharacter.getClass();
        return guessByFirstCharacter;
    }
}
