package dagger.spi.shaded.androidx.room.compiler.processing.ksp;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.apl.handler.event.LoadIndexListDataEventHandler;
import com.amazon.tarazed.type.annotations.AnnotationEvent;
import com.dee.app.metrics.MetricsConstants;
import com.mapbox.common.HttpHeaders;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.type.TypeMirror;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001%B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J9\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0018\u00010\u000b2\u0006\u0010\f\u001a\u0002H\tH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J+\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00110\u001a\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014H\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016J\b\u0010#\u001a\u00020$H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002&'¨\u0006("}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/ksp/OriginatingElementWrapper;", "Ljavax/lang/model/element/Element;", "elementSimpleName", "", "(Ljava/lang/String;)V", "getElementSimpleName", "()Ljava/lang/String;", HttpHeaders.ACCEPT, "R", "P", "v", "Ljavax/lang/model/element/ElementVisitor;", "p", "(Ljavax/lang/model/element/ElementVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "asType", "Ljavax/lang/model/type/TypeMirror;", "getAnnotation", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", AnnotationEvent.KEY_ANNOTATION_TYPE, "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "getAnnotationMirrors", "", "Ljavax/lang/model/element/AnnotationMirror;", "getAnnotationsByType", "", "(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;", "getEnclosedElements", "getEnclosingElement", "getKind", "Ljavax/lang/model/element/ElementKind;", "getModifiers", "", "Ljavax/lang/model/element/Modifier;", "getSimpleName", "Ljavax/lang/model/element/Name;", "NameImpl", "Ldagger/spi/shaded/androidx/room/compiler/processing/ksp/KSClassDeclarationAsOriginatingElement;", "Ldagger/spi/shaded/androidx/room/compiler/processing/ksp/KSFileAsOriginatingElement;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class OriginatingElementWrapper implements Element {

    @NotNull
    private final String elementSimpleName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0003J\u0019\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0096\u0001R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/ksp/OriginatingElementWrapper$NameImpl;", "Ljavax/lang/model/element/Name;", "", "str", "", "(Ljava/lang/String;)V", "length", "", "getLength", "()I", "contentEquals", "", "cs", MetricsConstants.Method.CACHE_GET, "", "index", "subSequence", LoadIndexListDataEventHandler.START_INDEX_KEY, "endIndex", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NameImpl implements Name, CharSequence {

        @NotNull
        private final String str;

        public NameImpl(@NotNull String str) {
            str.getClass();
            this.str = str;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i) {
            return get(i);
        }

        public boolean contentEquals(@NotNull CharSequence cs) {
            cs.getClass();
            return Intrinsics.areEqual(this.str, cs.toString());
        }

        public char get(int index) {
            return this.str.charAt(index);
        }

        public int getLength() {
            return this.str.length();
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return getLength();
        }

        @Override // java.lang.CharSequence
        @NotNull
        public CharSequence subSequence(int startIndex, int endIndex) {
            return this.str.subSequence(startIndex, endIndex);
        }
    }

    private OriginatingElementWrapper(String str) {
        this.elementSimpleName = str;
    }

    @Nullable
    public <R, P> R accept(@Nullable ElementVisitor<R, P> v, P p) {
        return null;
    }

    @NotNull
    public TypeMirror asType() {
        throw new UnsupportedOperationException(Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + " cannot be converted to a type");
    }

    @Nullable
    public <A extends Annotation> A getAnnotation(@Nullable Class<A> annotationType) {
        return null;
    }

    @NotNull
    public List<AnnotationMirror> getAnnotationMirrors() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    public <A extends Annotation> A[] getAnnotationsByType(@NotNull Class<A> annotationType) {
        annotationType.getClass();
        return (A[]) ((Annotation[]) new Object[0]);
    }

    @NotNull
    public final String getElementSimpleName() {
        return this.elementSimpleName;
    }

    @NotNull
    public List<Element> getEnclosedElements() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    public Element getEnclosingElement() {
        return null;
    }

    @NotNull
    public ElementKind getKind() {
        return ElementKind.OTHER;
    }

    @NotNull
    public Set<Modifier> getModifiers() {
        return SetsKt.emptySet();
    }

    @NotNull
    public Name getSimpleName() {
        return new NameImpl(this.elementSimpleName);
    }

    public /* synthetic */ OriginatingElementWrapper(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
