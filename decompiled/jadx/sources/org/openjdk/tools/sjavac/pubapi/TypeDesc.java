package org.openjdk.tools.sjavac.pubapi;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.Serializable;
import okhttp3.HttpUrl;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.openjdk.javax.lang.model.type.ArrayType;
import org.openjdk.javax.lang.model.type.DeclaredType;
import org.openjdk.javax.lang.model.type.ErrorType;
import org.openjdk.javax.lang.model.type.NoType;
import org.openjdk.javax.lang.model.type.PrimitiveType;
import org.openjdk.javax.lang.model.type.TypeKind;
import org.openjdk.javax.lang.model.type.TypeMirror;
import org.openjdk.javax.lang.model.type.TypeVariable;
import org.openjdk.javax.lang.model.util.SimpleTypeVisitor9;
import org.openjdk.tools.javac.code.Type;
import org.openjdk.tools.javac.util.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract class TypeDesc implements Serializable {
    private static final long serialVersionUID = -8201634143915519172L;
    TypeKind typeKind;

    public TypeDesc(TypeKind typeKind) {
        this.typeKind = typeKind;
    }

    public static TypeDesc decodeString(String str) {
        String trim = str.trim();
        return trim.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI) ? new ArrayTypeDesc(decodeString(AppLaunchChecker$$ExternalSyntheticOutline0.m(2, 0, trim))) : trim.startsWith("#") ? new TypeVarTypeDesc(trim.substring(1)) : trim.matches("boolean|byte|char|double|float|int|long|short|void") ? new PrimitiveTypeDesc(TypeKind.valueOf(StringUtils.toUpperCase(trim))) : new ReferenceTypeDesc(trim);
    }

    public static String encodeAsString(TypeDesc typeDesc) {
        TypeKind typeKind;
        if (typeDesc.typeKind.isPrimitive() || (typeKind = typeDesc.typeKind) == TypeKind.VOID) {
            return StringUtils.toLowerCase(typeDesc.typeKind.toString());
        }
        if (typeKind == TypeKind.ARRAY) {
            return encodeAsString(((ArrayTypeDesc) typeDesc).compTypeDesc) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        if (typeKind == TypeKind.TYPEVAR) {
            return "#" + ((TypeVarTypeDesc) typeDesc).identifier;
        }
        if (typeKind == TypeKind.DECLARED) {
            return ((ReferenceTypeDesc) typeDesc).javaType.toString();
        }
        Buffer$$ExternalSyntheticBUOutline0.m(typeDesc.typeKind, "Unhandled type: ");
        return null;
    }

    public static TypeDesc fromType(TypeMirror typeMirror) {
        TypeDesc visit = new SimpleTypeVisitor9<TypeDesc, Void>() { // from class: org.openjdk.tools.sjavac.pubapi.TypeDesc.1
            @Override // org.openjdk.javax.lang.model.util.SimpleTypeVisitor6, org.openjdk.javax.lang.model.type.TypeVisitor
            public TypeDesc visitArray(ArrayType arrayType, Void r3) {
                return new ArrayTypeDesc((TypeDesc) arrayType.getComponentType().accept(this, r3));
            }

            @Override // org.openjdk.javax.lang.model.util.SimpleTypeVisitor6, org.openjdk.javax.lang.model.type.TypeVisitor
            public TypeDesc visitDeclared(DeclaredType declaredType, Void r2) {
                return new ReferenceTypeDesc(((Type.ClassType) declaredType).tsym.flatName().toString());
            }

            @Override // org.openjdk.javax.lang.model.util.SimpleTypeVisitor6, org.openjdk.javax.lang.model.type.TypeVisitor
            public TypeDesc visitError(ErrorType errorType, Void r2) {
                return new ReferenceTypeDesc("<error type>");
            }

            @Override // org.openjdk.javax.lang.model.util.SimpleTypeVisitor6, org.openjdk.javax.lang.model.type.TypeVisitor
            public TypeDesc visitNoType(NoType noType, Void r2) {
                return new PrimitiveTypeDesc(TypeKind.VOID);
            }

            @Override // org.openjdk.javax.lang.model.util.SimpleTypeVisitor6, org.openjdk.javax.lang.model.type.TypeVisitor
            public TypeDesc visitPrimitive(PrimitiveType primitiveType, Void r2) {
                return new PrimitiveTypeDesc(primitiveType.getKind());
            }

            @Override // org.openjdk.javax.lang.model.util.SimpleTypeVisitor6, org.openjdk.javax.lang.model.type.TypeVisitor
            public TypeDesc visitTypeVariable(TypeVariable typeVariable, Void r2) {
                return new TypeVarTypeDesc(typeVariable.toString());
            }
        }.visit(typeMirror);
        if (visit != null) {
            return visit;
        }
        StringBuilder sb = new StringBuilder("Unhandled type mirror: ");
        sb.append(typeMirror);
        XML$$ExternalSyntheticBUOutline0.m(sb, " (", typeMirror.getClass(), MarkdownConstants.RIGHT_PARENTHESIS);
        return null;
    }

    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        return this.typeKind.equals(((TypeDesc) obj).typeKind);
    }

    public int hashCode() {
        return this.typeKind.hashCode();
    }
}
