package dagger.internal.codegen.xprocessing;

import com.google.common.base.Equivalence;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import dagger.spi.shaded.androidx.room.compiler.processing.JavaPoetExtKt;
import dagger.spi.shaded.androidx.room.compiler.processing.XAnnotation;
import dagger.spi.shaded.androidx.room.compiler.processing.XAnnotationValue;
import dagger.spi.shaded.androidx.room.compiler.processing.XProcessingEnv;
import dagger.spi.shaded.androidx.room.compiler.processing.compat.XConverters;
import dagger.spi.shaded.auto.common.AnnotationMirrors;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class XAnnotations {
    private static final Equivalence<XAnnotation> XANNOTATION_EQUIVALENCE = new Equivalence<XAnnotation>() { // from class: dagger.internal.codegen.xprocessing.XAnnotations.1
        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(XAnnotation xAnnotation, XAnnotation xAnnotation2) {
            return XTypes.equivalence().equivalent(xAnnotation.getType(), xAnnotation2.getType()) && XAnnotationValues.equivalence().pairwise().equivalent(xAnnotation.getAnnotationValues(), xAnnotation2.getAnnotationValues());
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(XAnnotation xAnnotation) {
            return Arrays.hashCode(new int[]{XTypes.equivalence().hash(xAnnotation.getType()), XAnnotationValues.equivalence().pairwise().hash(xAnnotation.getAnnotationValues())});
        }

        public String toString() {
            return "XAnnotation.equivalence()";
        }
    };

    private XAnnotations() {
    }

    public static Equivalence<XAnnotation> equivalence() {
        return XANNOTATION_EQUIVALENCE;
    }

    public static AnnotationSpec getAnnotationSpec(XAnnotation xAnnotation) {
        return JavaPoetExtKt.toAnnotationSpec(xAnnotation);
    }

    public static ClassName getClassName(XAnnotation xAnnotation) {
        return xAnnotation.getType().getTypeElement().getClassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$toStableString$0(XAnnotation xAnnotation, XAnnotationValue xAnnotationValue) {
        String name = xAnnotationValue.getName();
        String stableString = XAnnotationValues.toStableString(xAnnotationValue);
        return (xAnnotation.getAnnotationValues().size() == 1 && name.contentEquals("value")) ? stableString : a$$ExternalSyntheticOutline0.m$1(name, "=", stableString);
    }

    public static String toStableString(XAnnotation xAnnotation) {
        try {
            if (xAnnotation.getType().isError()) {
                return "@" + xAnnotation.getName();
            }
            if (XConverters.getProcessingEnv(xAnnotation).getBackend() == XProcessingEnv.Backend.KSP && xAnnotation.getTypeElement().getConstructors().size() != 1) {
                return "@" + getClassName(xAnnotation).canonicalName();
            }
            if (!xAnnotation.getAnnotationValues().isEmpty()) {
                return String.format("@%s(%s)", getClassName(xAnnotation).canonicalName(), xAnnotation.getAnnotationValues().stream().map(new Functions$$ExternalSyntheticLambda11(xAnnotation, 18)).collect(Collectors.joining(", ")));
            }
            return "@" + getClassName(xAnnotation).canonicalName();
        } catch (TypeNotPresentException e) {
            return e.typeName();
        }
    }

    public static String toString(XAnnotation xAnnotation) {
        return XConverters.getProcessingEnv(xAnnotation).getBackend() == XProcessingEnv.Backend.JAVAC ? AnnotationMirrors.toString(XConverters.toJavac(xAnnotation)) : toStableString(xAnnotation);
    }
}
