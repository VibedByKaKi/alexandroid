package dagger.spi.shaded.androidx.room.compiler.processing;

import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0003\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH\u0016J@\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0003\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\bH&J\u0018\u0010\n\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\bH\u0016J,\u0010\n\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b2\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/InternalXAnnotated;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotated;", "getAnnotations", "", "Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotationBox;", ExifInterface.GPS_DIRECTION_TRUE, "", "annotation", "Lkotlin/reflect/KClass;", "containerAnnotation", "hasAnnotation", "", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface InternalXAnnotated extends XAnnotated {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List getAnnotations$default(InternalXAnnotated internalXAnnotated, KClass kClass, KClass kClass2, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: getAnnotations");
            return null;
        }
        if ((i & 2) != 0) {
            kClass2 = KClassExtKt.getContainerAnnotation(kClass);
        }
        return internalXAnnotated.getAnnotations(kClass, kClass2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean hasAnnotation$default(InternalXAnnotated internalXAnnotated, KClass kClass, KClass kClass2, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: hasAnnotation");
            return false;
        }
        if ((i & 2) != 0) {
            kClass2 = KClassExtKt.getContainerAnnotation(kClass);
        }
        return internalXAnnotated.hasAnnotation(kClass, kClass2);
    }

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XAnnotated
    @NotNull
    default <T extends Annotation> List<XAnnotationBox<T>> getAnnotations(@NotNull KClass<T> annotation) {
        annotation.getClass();
        return getAnnotations(annotation, KClassExtKt.getContainerAnnotation(annotation));
    }

    @NotNull
    <T extends Annotation> List<XAnnotationBox<T>> getAnnotations(@NotNull KClass<T> annotation, @Nullable KClass<? extends Annotation> containerAnnotation);

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XAnnotated
    default boolean hasAnnotation(@NotNull KClass<? extends Annotation> annotation) {
        annotation.getClass();
        return hasAnnotation(annotation, KClassExtKt.getContainerAnnotation(annotation));
    }

    boolean hasAnnotation(@NotNull KClass<? extends Annotation> annotation, @Nullable KClass<? extends Annotation> containerAnnotation);
}
