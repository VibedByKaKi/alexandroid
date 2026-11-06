package dagger.spi.shaded.androidx.room.compiler.processing;

import androidx.exifinterface.media.ExifInterface;
import com.squareup.javapoet.ClassName;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\u0005\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\b\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J,\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\b0\u0003\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J!\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0013\"\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0014J1\u0010\u0010\u001a\u00020\u00112\"\u0010\u0012\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\f0\u0013\"\n\u0012\u0006\b\u0001\u0012\u00020\n0\fH\u0016¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\fH&J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH&J!\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0013\"\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0014J1\u0010\u001b\u001a\u00020\u00112\"\u0010\u0012\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\f0\u0013\"\n\u0012\u0006\b\u0001\u0012\u00020\n0\fH\u0016¢\u0006\u0002\u0010\u0015J\u0016\u0010\u001b\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016J(\u0010\u001d\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\b\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotated;", "", "getAllAnnotations", "", "Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotation;", "getAnnotation", "annotationName", "Lcom/squareup/javapoet/ClassName;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotationBox;", ExifInterface.GPS_DIRECTION_TRUE, "", "annotation", "Lkotlin/reflect/KClass;", "getAnnotations", "getAnnotationsAnnotatedWith", "", "hasAllAnnotations", "", "annotations", "", "([Lcom/squareup/javapoet/ClassName;)Z", "([Lkotlin/reflect/KClass;)Z", "", "hasAnnotation", "hasAnnotationWithPackage", "pkg", "", "hasAnyAnnotation", "requireAnnotation", "toAnnotationBox", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XAnnotated {
    @NotNull
    List<XAnnotation> getAllAnnotations();

    @Nullable
    default <T extends Annotation> XAnnotationBox<T> getAnnotation(@NotNull KClass<T> annotation) {
        annotation.getClass();
        return (XAnnotationBox) CollectionsKt.firstOrNull((List) getAnnotations(annotation));
    }

    @NotNull
    default List<XAnnotation> getAnnotations(@NotNull ClassName annotationName) {
        annotationName.getClass();
        List<XAnnotation> allAnnotations = getAllAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allAnnotations) {
            if (Intrinsics.areEqual(annotationName.canonicalName(), ((XAnnotation) obj).getQualifiedName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    <T extends Annotation> List<XAnnotationBox<T>> getAnnotations(@NotNull KClass<T> annotation);

    @NotNull
    default Set<XAnnotation> getAnnotationsAnnotatedWith(@NotNull ClassName annotationName) {
        annotationName.getClass();
        List<XAnnotation> allAnnotations = getAllAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allAnnotations) {
            XTypeElement typeElement = ((XAnnotation) obj).getType().getTypeElement();
            if (typeElement != null ? typeElement.hasAnnotation(annotationName) : false) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    default boolean hasAllAnnotations(@NotNull Collection<ClassName> annotations) {
        annotations.getClass();
        Collection<ClassName> collection = annotations;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!hasAnnotation((ClassName) it2.next())) {
                return false;
            }
        }
        return true;
    }

    default boolean hasAnnotation(@NotNull ClassName annotationName) {
        annotationName.getClass();
        return !getAnnotations(annotationName).isEmpty();
    }

    boolean hasAnnotation(@NotNull KClass<? extends Annotation> annotation);

    boolean hasAnnotationWithPackage(@NotNull String pkg);

    default boolean hasAnyAnnotation(@NotNull Collection<ClassName> annotations) {
        annotations.getClass();
        Collection<ClassName> collection = annotations;
        if (collection.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (hasAnnotation((ClassName) it2.next())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    default <T extends Annotation> XAnnotationBox<T> requireAnnotation(@NotNull KClass<T> annotation) {
        annotation.getClass();
        XAnnotationBox<T> annotation2 = getAnnotation(annotation);
        if (annotation2 != null) {
            return annotation2;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1(annotation, "Cannot find required annotation ");
        return null;
    }

    @Deprecated(message = "Use getAnnotation(not repeatable) or getAnnotations (repeatable)", replaceWith = @ReplaceWith(expression = "getAnnotation(annotation)", imports = {}))
    @Nullable
    default <T extends Annotation> XAnnotationBox<T> toAnnotationBox(@NotNull KClass<T> annotation) {
        annotation.getClass();
        return getAnnotation(annotation);
    }

    @Nullable
    default XAnnotation getAnnotation(@NotNull ClassName annotationName) {
        annotationName.getClass();
        return (XAnnotation) CollectionsKt.firstOrNull((List) getAnnotations(annotationName));
    }

    @NotNull
    default XAnnotation requireAnnotation(@NotNull ClassName annotationName) {
        annotationName.getClass();
        XAnnotation annotation = getAnnotation(annotationName);
        annotation.getClass();
        return annotation;
    }

    default boolean hasAllAnnotations(@NotNull ClassName... annotations) {
        annotations.getClass();
        for (ClassName className : annotations) {
            if (!hasAnnotation(className)) {
                return false;
            }
        }
        return true;
    }

    default boolean hasAnyAnnotation(@NotNull ClassName... annotations) {
        annotations.getClass();
        for (ClassName className : annotations) {
            if (hasAnnotation(className)) {
                return true;
            }
        }
        return false;
    }

    default boolean hasAllAnnotations(@NotNull KClass<? extends Annotation>... annotations) {
        annotations.getClass();
        for (KClass<? extends Annotation> kClass : annotations) {
            if (!hasAnnotation(kClass)) {
                return false;
            }
        }
        return true;
    }

    default boolean hasAnyAnnotation(@NotNull KClass<? extends Annotation>... annotations) {
        annotations.getClass();
        for (KClass<? extends Annotation> kClass : annotations) {
            if (hasAnnotation(kClass)) {
                return true;
            }
        }
        return false;
    }
}
