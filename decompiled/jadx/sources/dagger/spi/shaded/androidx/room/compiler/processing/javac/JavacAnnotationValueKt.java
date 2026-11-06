package dagger.spi.shaded.androidx.room.compiler.processing.javac;

import dagger.spi.shaded.androidx.room.compiler.processing.XArrayType;
import dagger.spi.shaded.androidx.room.compiler.processing.XEnumTypeElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XEquality;
import dagger.spi.shaded.androidx.room.compiler.processing.XNullability;
import dagger.spi.shaded.androidx.room.compiler.processing.XType;
import dagger.spi.shaded.androidx.room.compiler.processing.javac.JavacProcessingEnv;
import dagger.spi.shaded.androidx.room.compiler.processing.javac.JavacTypeElement;
import dagger.spi.shaded.auto.common.MoreTypes;
import java.util.ArrayList;
import java.util.List;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.AbstractAnnotationValueVisitor8;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"UNWRAP_VISITOR", "dagger/spi/shaded/androidx/room/compiler/processing/javac/JavacAnnotationValueKt$UNWRAP_VISITOR$1", "Ldagger/spi/shaded/androidx/room/compiler/processing/javac/JavacAnnotationValueKt$UNWRAP_VISITOR$1;", "room-compiler-processing"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class JavacAnnotationValueKt {

    @NotNull
    private static final JavacAnnotationValueKt$UNWRAP_VISITOR$1 UNWRAP_VISITOR = new AbstractAnnotationValueVisitor8<Object, VisitorData>() { // from class: dagger.spi.shaded.androidx.room.compiler.processing.javac.JavacAnnotationValueKt$UNWRAP_VISITOR$1
        @NotNull
        public JavacAnnotation visitAnnotation(@NotNull AnnotationMirror a2, @NotNull VisitorData data) {
            a2.getClass();
            data.getClass();
            return new JavacAnnotation(data.getEnv(), a2);
        }

        @NotNull
        public List<JavacAnnotationValue> visitArray(@NotNull List<? extends AnnotationValue> vals, @NotNull final VisitorData data) {
            vals.getClass();
            data.getClass();
            XType returnType = data.getMethod().getReturnType();
            returnType.getClass();
            XType componentType = ((XArrayType) returnType).getComponentType();
            List<? extends AnnotationValue> list = vals;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (final AnnotationValue annotationValue : list) {
                arrayList.add(new JavacAnnotationValue(data.getEnv(), data.getMethod(), annotationValue, componentType, new Function0<Object>() { // from class: dagger.spi.shaded.androidx.room.compiler.processing.javac.JavacAnnotationValueKt$UNWRAP_VISITOR$1$visitArray$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final Object invoke() {
                        return annotationValue.accept(this, data);
                    }
                }));
            }
            return arrayList;
        }

        @NotNull
        public Boolean visitBoolean(boolean z, @NotNull VisitorData visitorData) {
            visitorData.getClass();
            return Boolean.valueOf(z);
        }

        @NotNull
        public Byte visitByte(byte b, @NotNull VisitorData visitorData) {
            visitorData.getClass();
            return Byte.valueOf(b);
        }

        @NotNull
        public Character visitChar(char c, @NotNull VisitorData visitorData) {
            visitorData.getClass();
            return Character.valueOf(c);
        }

        @NotNull
        public Double visitDouble(double d, @NotNull VisitorData visitorData) {
            visitorData.getClass();
            return Double.valueOf(d);
        }

        @NotNull
        public JavacEnumEntry visitEnumConstant(@NotNull VariableElement c, @NotNull VisitorData data) {
            c.getClass();
            data.getClass();
            TypeMirror asType = c.asType();
            if (asType.getKind() == TypeKind.ERROR) {
                throw new TypeNotPresentException(asType.toString(), null);
            }
            TypeElement asTypeElement = MoreTypes.asTypeElement(asType);
            JavacTypeElement.Companion companion = JavacTypeElement.Companion;
            JavacProcessingEnv env = data.getEnv();
            asTypeElement.getClass();
            XEquality create = companion.create(env, asTypeElement);
            create.getClass();
            return new JavacEnumEntry(data.getEnv(), (Element) c, (XEnumTypeElement) create);
        }

        @NotNull
        public Float visitFloat(float f, @NotNull VisitorData visitorData) {
            visitorData.getClass();
            return Float.valueOf(f);
        }

        @NotNull
        public Integer visitInt(int i, @NotNull VisitorData visitorData) {
            visitorData.getClass();
            return Integer.valueOf(i);
        }

        @NotNull
        public Long visitLong(long j, @NotNull VisitorData visitorData) {
            visitorData.getClass();
            return Long.valueOf(j);
        }

        @NotNull
        public Short visitShort(short s, @NotNull VisitorData visitorData) {
            visitorData.getClass();
            return Short.valueOf(s);
        }

        @Nullable
        public String visitString(@Nullable String s, @NotNull VisitorData data) {
            data.getClass();
            if (Intrinsics.areEqual(s, "<error>")) {
                throw new TypeNotPresentException(s, null);
            }
            return s;
        }

        @NotNull
        public JavacType visitType(@NotNull TypeMirror t, @NotNull VisitorData data) {
            t.getClass();
            data.getClass();
            if (t.getKind() == TypeKind.ERROR) {
                throw new TypeNotPresentException(t.toString(), null);
            }
            JavacProcessingEnv env = data.getEnv();
            XNullability xNullability = XNullability.NONNULL;
            TypeKind kind = t.getKind();
            int i = kind == null ? -1 : JavacProcessingEnv.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i == 1) {
                if (xNullability != null) {
                    ArrayType asArray = MoreTypes.asArray(t);
                    asArray.getClass();
                    return new JavacArrayType(env, asArray, xNullability, null);
                }
                ArrayType asArray2 = MoreTypes.asArray(t);
                asArray2.getClass();
                return new JavacArrayType(env, asArray2);
            }
            if (i != 2) {
                return xNullability != null ? new DefaultJavacType(env, t, xNullability) : new DefaultJavacType(env, t);
            }
            if (xNullability != null) {
                DeclaredType asDeclared = MoreTypes.asDeclared(t);
                asDeclared.getClass();
                return new JavacDeclaredType(env, asDeclared, xNullability);
            }
            DeclaredType asDeclared2 = MoreTypes.asDeclared(t);
            asDeclared2.getClass();
            return new JavacDeclaredType(env, asDeclared2);
        }

        public /* bridge */ /* synthetic */ Object visitArray(List list, Object obj) {
            return visitArray((List<? extends AnnotationValue>) list, (VisitorData) obj);
        }
    };
}
