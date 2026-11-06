package dagger.spi.shaded.androidx.room.compiler.processing;

import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\"2\u0010\u0000\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005*\f\b\u0002\u0010\u0006\"\u00020\u00072\u00020\u0007¨\u0006\b"}, d2 = {"containerAnnotation", "Lkotlin/reflect/KClass;", "", ExifInterface.GPS_DIRECTION_TRUE, "getContainerAnnotation", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KClass;", "JavaRepeatable", "Ljava/lang/annotation/Repeatable;", "room-compiler-processing"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class KClassExtKt {
    @Nullable
    public static final <T extends Annotation> KClass<? extends Annotation> getContainerAnnotation(@NotNull KClass<T> kClass) {
        kClass.getClass();
        Repeatable repeatable = (Repeatable) JvmClassMappingKt.getJavaClass((KClass) kClass).getAnnotation(Repeatable.class);
        if (repeatable != null) {
            return Reflection.getOrCreateKotlinClass(repeatable.value());
        }
        return null;
    }
}
