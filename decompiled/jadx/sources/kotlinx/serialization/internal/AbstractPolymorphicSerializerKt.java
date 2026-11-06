package kotlinx.serialization.internal;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0001\u001a \u0010\u0000\u001a\u00020\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0001¨\u0006\u0007"}, d2 = {"throwSubtypeNotRegistered", "", "subClassName", "", "baseClass", "Lkotlin/reflect/KClass;", "subClass", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AbstractPolymorphicSerializerKt {
    @JvmName(name = "throwSubtypeNotRegistered")
    @NotNull
    public static final Void throwSubtypeNotRegistered(@Nullable String str, @NotNull KClass<?> kClass) {
        String sb;
        kClass.getClass();
        String str2 = "in the polymorphic scope of '" + kClass.getSimpleName() + '\'';
        if (str == null) {
            sb = AppLaunchChecker$$ExternalSyntheticOutline0.m('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            m.append(kClass.getSimpleName());
            m.append("' has to be sealed and '@Serializable'.");
            sb = m.toString();
        }
        throw new SerializationException(sb);
    }

    @JvmName(name = "throwSubtypeNotRegistered")
    @NotNull
    public static final Void throwSubtypeNotRegistered(@NotNull KClass<?> kClass, @NotNull KClass<?> kClass2) {
        kClass.getClass();
        kClass2.getClass();
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(kClass);
        }
        throwSubtypeNotRegistered(simpleName, kClass2);
        throw new KotlinNothingValueException();
    }
}
