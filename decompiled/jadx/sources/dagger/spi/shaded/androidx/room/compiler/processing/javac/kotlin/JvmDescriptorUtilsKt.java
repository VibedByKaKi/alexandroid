package dagger.spi.shaded.androidx.room.compiler.processing.javac.kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.squareup.javapoet.ArrayTypeName;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.TypeName;
import dagger.spi.shaded.auto.common.MoreTypes;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.List;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.NestingKind;
import javax.lang.model.element.QualifiedNameable;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.WildcardType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u000fH\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0010H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0011H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0012H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0013H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0014H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0015H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0016H\u0000\u001a\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0001H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\n\"\u0018\u0010\u000b\u001a\u00020\u0001*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"descriptor", "", "Ljavax/lang/model/type/DeclaredType;", "getDescriptor", "(Ljavax/lang/model/type/DeclaredType;)Ljava/lang/String;", "Ljavax/lang/model/type/NoType;", "getDescriptor$annotations", "(Ljavax/lang/model/type/NoType;)V", "(Ljavax/lang/model/type/NoType;)Ljava/lang/String;", "Ljavax/lang/model/type/PrimitiveType;", "(Ljavax/lang/model/type/PrimitiveType;)Ljava/lang/String;", "internalName", "Ljavax/lang/model/element/Element;", "getInternalName", "(Ljavax/lang/model/element/Element;)Ljava/lang/String;", "Ljavax/lang/model/element/ExecutableElement;", "Ljavax/lang/model/element/VariableElement;", "Ljavax/lang/model/type/ArrayType;", "Ljavax/lang/model/type/ExecutableType;", "Ljavax/lang/model/type/IntersectionType;", "Ljavax/lang/model/type/TypeMirror;", "Ljavax/lang/model/type/TypeVariable;", "Ljavax/lang/model/type/WildcardType;", "typeNameFromJvmSignature", "Lcom/squareup/javapoet/TypeName;", "room-compiler-processing"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class JvmDescriptorUtilsKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NestingKind.values().length];
            try {
                iArr[NestingKind.TOP_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NestingKind.MEMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NestingKind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NestingKind.ANONYMOUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeKind.values().length];
            try {
                iArr2[TypeKind.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeKind.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TypeKind.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TypeKind.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TypeKind.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[TypeKind.LONG.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TypeKind.SHORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[TypeKind.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final String descriptor(@NotNull ExecutableType executableType) {
        executableType.getClass();
        List parameterTypes = executableType.getParameterTypes();
        parameterTypes.getClass();
        String joinToString$default = CollectionsKt.joinToString$default(parameterTypes, "", null, null, new Function1<TypeMirror, CharSequence>() { // from class: dagger.spi.shaded.androidx.room.compiler.processing.javac.kotlin.JvmDescriptorUtilsKt$descriptor$parameterDescriptors$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(TypeMirror typeMirror) {
                typeMirror.getClass();
                return JvmDescriptorUtilsKt.descriptor(typeMirror);
            }
        }, 30);
        TypeMirror returnType = executableType.getReturnType();
        returnType.getClass();
        return MarkdownConstants.LEFT_PARENTHESIS + joinToString$default + ')' + descriptor(returnType);
    }

    @NotNull
    public static final String getDescriptor(@NotNull PrimitiveType primitiveType) {
        primitiveType.getClass();
        TypeKind kind = primitiveType.getKind();
        switch (kind == null ? -1 : WhenMappings.$EnumSwitchMapping$1[kind.ordinal()]) {
            case 1:
                return "B";
            case 2:
                return "C";
            case 3:
                return "D";
            case 4:
                return "F";
            case 5:
                return "I";
            case 6:
                return "J";
            case 7:
                return ExifInterface.LATITUDE_SOUTH;
            case 8:
                return "Z";
            default:
                PathKt$$ExternalSyntheticBUOutline0.m$3(primitiveType, "Unknown primitive type ");
                return null;
        }
    }

    @NotNull
    public static final String getInternalName(@NotNull Element element) {
        String replace$default;
        String replace$default2;
        element.getClass();
        if (!(element instanceof TypeElement)) {
            if (element instanceof ExecutableElement) {
                Element enclosingElement = ((ExecutableElement) element).getEnclosingElement();
                enclosingElement.getClass();
                return getInternalName(enclosingElement);
            }
            if (!(element instanceof QualifiedNameable)) {
                return element.getSimpleName().toString();
            }
            replace$default = StringsKt__StringsJVMKt.replace$default(((QualifiedNameable) element).getQualifiedName().toString(), '.', '/', false, 4, (Object) null);
            return replace$default;
        }
        TypeElement typeElement = (TypeElement) element;
        NestingKind nestingKind = typeElement.getNestingKind();
        int i = nestingKind == null ? -1 : WhenMappings.$EnumSwitchMapping$0[nestingKind.ordinal()];
        if (i == 1) {
            replace$default2 = StringsKt__StringsJVMKt.replace$default(typeElement.getQualifiedName().toString(), '.', '/', false, 4, (Object) null);
            return replace$default2;
        }
        if (i != 2 && i != 3) {
            if (i != 4) {
                Single$$ExternalSyntheticBUOutline0.m$2("Unsupported, nestingKind == null");
                return null;
            }
            PathKt$$ExternalSyntheticBUOutline0.m$4(typeElement.getNestingKind(), "Unsupported nesting ");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Element enclosingElement2 = typeElement.getEnclosingElement();
        enclosingElement2.getClass();
        sb.append(getInternalName(enclosingElement2));
        sb.append('$');
        sb.append(typeElement.getSimpleName());
        return sb.toString();
    }

    @NotNull
    public static final TypeName typeNameFromJvmSignature(@NotNull String str) {
        int lastIndexOf$default;
        int lastIndexOf$default2;
        int indexOf$default;
        List split$default;
        str.getClass();
        if (str.length() <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt == 'B') {
            TypeName typeName = TypeName.BYTE;
            typeName.getClass();
            return typeName;
        }
        if (charAt == 'C') {
            TypeName typeName2 = TypeName.CHAR;
            typeName2.getClass();
            return typeName2;
        }
        if (charAt == 'D') {
            TypeName typeName3 = TypeName.DOUBLE;
            typeName3.getClass();
            return typeName3;
        }
        if (charAt == 'F') {
            TypeName typeName4 = TypeName.FLOAT;
            typeName4.getClass();
            return typeName4;
        }
        if (charAt == 'I') {
            TypeName typeName5 = TypeName.INT;
            typeName5.getClass();
            return typeName5;
        }
        if (charAt == 'J') {
            TypeName typeName6 = TypeName.LONG;
            typeName6.getClass();
            return typeName6;
        }
        if (charAt == 'S') {
            TypeName typeName7 = TypeName.SHORT;
            typeName7.getClass();
            return typeName7;
        }
        if (charAt == 'Z') {
            TypeName typeName8 = TypeName.BOOLEAN;
            typeName8.getClass();
            return typeName8;
        }
        if (charAt != 'L') {
            if (charAt != '[') {
                throw new IllegalStateException("unexpected jvm signature ".concat(str).toString());
            }
            ArrayTypeName of = ArrayTypeName.of(typeNameFromJvmSignature(str.substring(1)));
            of.getClass();
            return of;
        }
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(str, ";", 0, false, 6, (Object) null);
        if (lastIndexOf$default <= 0) {
            PathKt$$ExternalSyntheticBUOutline0.m((Object) "invalid input ".concat(str));
            return null;
        }
        lastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, '/', 0, false, 6, (Object) null);
        int i = lastIndexOf$default2 < 0 ? 1 : lastIndexOf$default2 + 1;
        String replace$default = lastIndexOf$default2 < 0 ? "" : StringsKt__StringsJVMKt.replace$default(str.substring(1, lastIndexOf$default2), '/', '.', false, 4, (Object) null);
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '$', i, false, 4, (Object) null);
        if (indexOf$default < 0) {
            ClassName className = ClassName.get(replace$default, str.substring(i, lastIndexOf$default), new String[0]);
            className.getClass();
            return className;
        }
        String substring = str.substring(i, indexOf$default);
        split$default = StringsKt__StringsKt.split$default(str.substring(indexOf$default + 1, lastIndexOf$default), new char[]{'$'}, false, 0, 6, (Object) null);
        String[] strArr = (String[]) split$default.toArray(new String[0]);
        ClassName className2 = ClassName.get(replace$default, substring, (String[]) Arrays.copyOf(strArr, strArr.length));
        className2.getClass();
        return className2;
    }

    public static /* synthetic */ void getDescriptor$annotations(NoType noType) {
    }

    @NotNull
    public static final String getDescriptor(@NotNull DeclaredType declaredType) {
        declaredType.getClass();
        StringBuilder sb = new StringBuilder("L");
        Element asElement = declaredType.asElement();
        asElement.getClass();
        sb.append(getInternalName(asElement));
        sb.append(';');
        return sb.toString();
    }

    @NotNull
    public static final String getDescriptor(@NotNull NoType noType) {
        noType.getClass();
        return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
    }

    @NotNull
    public static final String descriptor(@NotNull ExecutableElement executableElement) {
        executableElement.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(executableElement.getSimpleName());
        ExecutableType asExecutable = MoreTypes.asExecutable(executableElement.asType());
        asExecutable.getClass();
        sb.append(descriptor(asExecutable));
        return sb.toString();
    }

    @NotNull
    public static final String descriptor(@NotNull TypeMirror typeMirror) {
        typeMirror.getClass();
        Object accept = typeMirror.accept(JvmDescriptorTypeVisitor.INSTANCE, Unit.INSTANCE);
        accept.getClass();
        return (String) accept;
    }

    @NotNull
    public static final String descriptor(@NotNull WildcardType wildcardType) {
        wildcardType.getClass();
        return "";
    }

    @NotNull
    public static final String descriptor(@NotNull TypeVariable typeVariable) {
        typeVariable.getClass();
        TypeMirror upperBound = typeVariable.getUpperBound();
        upperBound.getClass();
        return descriptor(upperBound);
    }

    @NotNull
    public static final String descriptor(@NotNull IntersectionType intersectionType) {
        intersectionType.getClass();
        Object obj = intersectionType.getBounds().get(0);
        obj.getClass();
        return descriptor((TypeMirror) obj);
    }

    @NotNull
    public static final String descriptor(@NotNull ArrayType arrayType) {
        arrayType.getClass();
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
        TypeMirror componentType = arrayType.getComponentType();
        componentType.getClass();
        sb.append(descriptor(componentType));
        return sb.toString();
    }

    @NotNull
    public static final String descriptor(@NotNull VariableElement variableElement) {
        variableElement.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(variableElement.getSimpleName());
        sb.append(AbstractJsonLexerKt.COLON);
        TypeMirror asType = variableElement.asType();
        asType.getClass();
        sb.append(descriptor(asType));
        return sb.toString();
    }
}
