package dagger.spi.model;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.squareup.javapoet.CodeBlock;
import dagger.spi.shaded.auto.common.AnnotationMirrors;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class MoreAnnotationMirrors {
    private MoreAnnotationMirrors() {
    }

    public static /* synthetic */ String access$100(AnnotationValue annotationValue) {
        return stableAnnotationValueToString(annotationValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stableAnnotationMirrorToString$0(ImmutableMap.Builder builder, ExecutableElement executableElement, AnnotationValue annotationValue) {
        builder.put(executableElement.getSimpleName().toString(), stableAnnotationValueToString(annotationValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String stableAnnotationMirrorToString(AnnotationMirror annotationMirror) {
        StringBuilder sb = new StringBuilder("@");
        sb.append(annotationMirror.getAnnotationType());
        ImmutableMap<ExecutableElement, AnnotationValue> annotationValuesWithDefaults = AnnotationMirrors.getAnnotationValuesWithDefaults(annotationMirror);
        if (!annotationValuesWithDefaults.isEmpty()) {
            final ImmutableMap.Builder builder = ImmutableMap.builder();
            annotationValuesWithDefaults.forEach(new BiConsumer() { // from class: dagger.spi.model.MoreAnnotationMirrors$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    MoreAnnotationMirrors.lambda$stableAnnotationMirrorToString$0(ImmutableMap.Builder.this, (ExecutableElement) obj, (AnnotationValue) obj2);
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

    public static String toStableString(DaggerAnnotation daggerAnnotation) {
        return stableAnnotationMirrorToString(daggerAnnotation.java());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: dagger.spi.model.MoreAnnotationMirrors$1, reason: invalid class name */
    public class AnonymousClass1 extends SimpleAnnotationValueVisitor8<String, Void> {
        public String visitArray(List<? extends AnnotationValue> list, Void r3) {
            return (String) list.stream().map(new MoreAnnotationMirrors$1$$ExternalSyntheticLambda0()).collect(Collectors.joining(", ", "{", StringSubstitutor.DEFAULT_VAR_END));
        }

        public String visitString(String str, Void r2) {
            return CodeBlock.of("$S", str).toString();
        }

        public String defaultAction(Object obj, Void r2) {
            return obj.toString();
        }

        public String visitAnnotation(AnnotationMirror annotationMirror, Void r2) {
            return MoreAnnotationMirrors.stableAnnotationMirrorToString(annotationMirror);
        }

        public /* bridge */ /* synthetic */ Object visitArray(List list, Object obj) {
            return visitArray((List<? extends AnnotationValue>) list, (Void) obj);
        }
    }
}
