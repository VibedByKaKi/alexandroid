package dagger.model;

import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.memoized.Memoized;
import com.google.common.base.Equivalence;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.squareup.javapoet.CodeBlock;
import dagger.model.C$AutoValue_Key;
import dagger.spi.shaded.auto.common.AnnotationMirrors;
import dagger.spi.shaded.auto.common.MoreTypes;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class Key {
    public static /* synthetic */ String access$000(AnnotationValue annotationValue) {
        return stableAnnotationValueToString(annotationValue);
    }

    public static Builder builder(TypeMirror typeMirror) {
        return new C$AutoValue_Key.Builder().type(typeMirror);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stableAnnotationMirrorToString$0(ImmutableMap.Builder builder, ExecutableElement executableElement, AnnotationValue annotationValue) {
        builder.put(executableElement.getSimpleName().toString(), stableAnnotationValueToString(annotationValue));
    }

    public static String stableAnnotationMirrorToString(AnnotationMirror annotationMirror) {
        StringBuilder sb = new StringBuilder("@");
        sb.append(annotationMirror.getAnnotationType());
        ImmutableMap<ExecutableElement, AnnotationValue> annotationValuesWithDefaults = AnnotationMirrors.getAnnotationValuesWithDefaults(annotationMirror);
        if (!annotationValuesWithDefaults.isEmpty()) {
            final ImmutableMap.Builder builder = ImmutableMap.builder();
            annotationValuesWithDefaults.forEach(new BiConsumer() { // from class: dagger.model.Key$$ExternalSyntheticLambda2
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Key.lambda$stableAnnotationMirrorToString$0(ImmutableMap.Builder.this, (ExecutableElement) obj, (AnnotationValue) obj2);
                }
            });
            ImmutableMap build = builder.build();
            sb.append('(');
            if (build.size() == 1 && build.containsKey("value")) {
                sb.append((String) build.get("value"));
            } else {
                sb.append(Joiner.on(", ").withKeyValueSeparator("=").join(build));
            }
            sb.append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String stableAnnotationValueToString(AnnotationValue annotationValue) {
        return (String) annotationValue.accept(new AnonymousClass1(), (Object) null);
    }

    public abstract boolean equals(Object obj);

    @Memoized
    public abstract int hashCode();

    public abstract Optional<MultibindingContributionIdentifier> multibindingContributionIdentifier();

    public final Optional<AnnotationMirror> qualifier() {
        return wrappedQualifier().map(new Key$$ExternalSyntheticLambda1());
    }

    public abstract Builder toBuilder();

    public final String toString() {
        return Joiner.on(' ').skipNulls().join(qualifier().map(new Key$$ExternalSyntheticLambda0()).orElse(null), type(), multibindingContributionIdentifier().orElse(null));
    }

    public final TypeMirror type() {
        return wrappedType().get();
    }

    public abstract Optional<Equivalence.Wrapper<AnnotationMirror>> wrappedQualifier();

    public abstract Equivalence.Wrapper<TypeMirror> wrappedType();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: dagger.model.Key$1, reason: invalid class name */
    public class AnonymousClass1 extends SimpleAnnotationValueVisitor8<String, Void> {
        public String visitArray(List<? extends AnnotationValue> list, Void r3) {
            return (String) list.stream().map(new Key$1$$ExternalSyntheticLambda0()).collect(Collectors.joining(", ", "{", StringSubstitutor.DEFAULT_VAR_END));
        }

        public String visitString(String str, Void r2) {
            return CodeBlock.of("$S", str).toString();
        }

        public String defaultAction(Object obj, Void r2) {
            return obj.toString();
        }

        public String visitAnnotation(AnnotationMirror annotationMirror, Void r2) {
            return Key.stableAnnotationMirrorToString(annotationMirror);
        }

        public /* bridge */ /* synthetic */ Object visitArray(List list, Object obj) {
            return visitArray((List<? extends AnnotationValue>) list, (Void) obj);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MultibindingContributionIdentifier {
        private final String bindingElement;
        private final String module;

        @Deprecated
        public MultibindingContributionIdentifier(ExecutableElement executableElement, TypeElement typeElement) {
            this(executableElement.getSimpleName().toString(), typeElement.getQualifiedName().toString());
        }

        @Deprecated
        public String bindingElement() {
            return this.bindingElement;
        }

        public boolean equals(Object obj) {
            if (obj instanceof MultibindingContributionIdentifier) {
                MultibindingContributionIdentifier multibindingContributionIdentifier = (MultibindingContributionIdentifier) obj;
                if (this.module.equals(multibindingContributionIdentifier.module) && this.bindingElement.equals(multibindingContributionIdentifier.bindingElement)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.module, this.bindingElement);
        }

        @Deprecated
        public String module() {
            return this.module;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m$1(this.module, "#", this.bindingElement);
        }

        @Deprecated
        public MultibindingContributionIdentifier(String str, String str2) {
            this.module = str2;
            this.bindingElement = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Key build();

        public abstract Builder multibindingContributionIdentifier(MultibindingContributionIdentifier multibindingContributionIdentifier);

        public abstract Builder multibindingContributionIdentifier(Optional<MultibindingContributionIdentifier> optional);

        @CanIgnoreReturnValue
        public final Builder qualifier(Optional<AnnotationMirror> optional) {
            Optional optional2 = (Optional) Preconditions.checkNotNull(optional);
            final Equivalence<AnnotationMirror> equivalence = AnnotationMirrors.equivalence();
            Objects.requireNonNull(equivalence);
            return wrappedQualifier(optional2.map(new Function() { // from class: dagger.model.Key$Builder$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Equivalence.this.wrap((AnnotationMirror) obj);
                }
            }));
        }

        @CanIgnoreReturnValue
        public final Builder type(TypeMirror typeMirror) {
            return wrappedType(MoreTypes.equivalence().wrap((TypeMirror) Preconditions.checkNotNull(typeMirror)));
        }

        public abstract Builder wrappedQualifier(Equivalence.Wrapper<AnnotationMirror> wrapper);

        public abstract Builder wrappedQualifier(Optional<Equivalence.Wrapper<AnnotationMirror>> optional);

        public abstract Builder wrappedType(Equivalence.Wrapper<TypeMirror> wrapper);

        @CanIgnoreReturnValue
        public final Builder qualifier(AnnotationMirror annotationMirror) {
            return wrappedQualifier(AnnotationMirrors.equivalence().wrap((AnnotationMirror) Preconditions.checkNotNull(annotationMirror)));
        }
    }
}
