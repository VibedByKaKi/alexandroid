package com.fasterxml.jackson.databind.type;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class TypeBindings implements Serializable {
    private static final TypeBindings EMPTY;
    private static final String[] NO_STRINGS;
    private static final JavaType[] NO_TYPES;
    private static final long serialVersionUID = 1;
    private final int _hashCode;
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AsKey {
        private final int _hash;
        private final JavaType[] _params;
        private final Class<?> _raw;

        public AsKey(Class<?> cls, JavaType[] javaTypeArr, int i) {
            this._raw = cls;
            this._params = javaTypeArr;
            this._hash = (cls.hashCode() * 31) + i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != AsKey.class) {
                return false;
            }
            AsKey asKey = (AsKey) obj;
            if (this._hash == asKey._hash && this._raw == asKey._raw) {
                JavaType[] javaTypeArr = asKey._params;
                int length = this._params.length;
                if (length == javaTypeArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (!Objects.equals(this._params[i], javaTypeArr[i])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this._hash;
        }

        public String toString() {
            return this._raw.getName().concat("<>");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TypeParamStash {
        private static final TypeVariable<?>[] VARS_ABSTRACT_LIST = AbstractList.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_COLLECTION = Collection.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_ITERABLE = Iterable.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_LIST = List.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_ARRAY_LIST = ArrayList.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_MAP = Map.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_HASH_MAP = HashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_LINKED_HASH_MAP = LinkedHashMap.class.getTypeParameters();

        public static TypeVariable<?>[] paramsFor1(Class<?> cls) {
            return cls == Collection.class ? VARS_COLLECTION : cls == List.class ? VARS_LIST : cls == ArrayList.class ? VARS_ARRAY_LIST : cls == AbstractList.class ? VARS_ABSTRACT_LIST : cls == Iterable.class ? VARS_ITERABLE : cls.getTypeParameters();
        }

        public static TypeVariable<?>[] paramsFor2(Class<?> cls) {
            return cls == Map.class ? VARS_MAP : cls == HashMap.class ? VARS_HASH_MAP : cls == LinkedHashMap.class ? VARS_LINKED_HASH_MAP : cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        NO_STRINGS = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        NO_TYPES = javaTypeArr;
        EMPTY = new TypeBindings(strArr, javaTypeArr, null);
    }

    private TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? NO_STRINGS : strArr;
        this._names = strArr;
        javaTypeArr = javaTypeArr == null ? NO_TYPES : javaTypeArr;
        this._types = javaTypeArr;
        if (strArr.length == javaTypeArr.length) {
            this._unboundVariables = strArr2;
            this._hashCode = Arrays.hashCode(javaTypeArr);
        } else {
            StringBuilder sb = new StringBuilder("Mismatching names (");
            sb.append(strArr.length);
            sb.append("), types (");
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(sb, javaTypeArr.length, MarkdownConstants.RIGHT_PARENTHESIS));
            throw null;
        }
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return create(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = NO_STRINGS;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, null);
        }
        StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
        ParcelCompat$$ExternalSyntheticOutline0.m7655m((Class) cls, sb, " with ");
        sb.append(javaTypeArr.length);
        sb.append(" type parameter");
        sb.append(javaTypeArr.length == 1 ? "" : CmcdData.Factory.STREAMING_FORMAT_SS);
        sb.append(": class expects ");
        sb.append(strArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return EMPTY;
        }
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = typeParameters[i].getName();
        }
        if (length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, null);
        }
        StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
        ParcelCompat$$ExternalSyntheticOutline0.m7655m((Class) cls, sb, " with ");
        sb.append(javaTypeArr.length);
        sb.append(" type parameter");
        sb.append(javaTypeArr.length == 1 ? "" : CmcdData.Factory.STREAMING_FORMAT_SS);
        sb.append(": class expects ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    public static TypeBindings emptyBindings() {
        return EMPTY;
    }

    private boolean invalidCacheKey() {
        for (JavaType javaType : this._types) {
            if (javaType instanceof IdentityEqualityType) {
                return true;
            }
        }
        return false;
    }

    public Object asKey(Class<?> cls) {
        if (invalidCacheKey()) {
            return null;
        }
        return new AsKey(cls, this._types, this._hashCode);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        return this._hashCode == typeBindings._hashCode && Arrays.equals(this._types, typeBindings._types);
    }

    public JavaType findBoundType(String str) {
        JavaType selfReferencedType;
        int length = this._names.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(this._names[i])) {
                JavaType javaType = this._types[i];
                return (!(javaType instanceof ResolvedRecursiveType) || (selfReferencedType = ((ResolvedRecursiveType) javaType).getSelfReferencedType()) == null) ? javaType : selfReferencedType;
            }
        }
        return null;
    }

    public String getBoundName(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this._names;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    public JavaType getBoundType(int i) {
        if (i < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this._types;
        if (i >= javaTypeArr.length) {
            return null;
        }
        JavaType javaType = javaTypeArr[i];
        return javaType == null ? TypeFactory.unknownType() : javaType;
    }

    public JavaType getBoundTypeOrNull(int i) {
        if (i < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this._types;
        if (i >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i];
    }

    public List<JavaType> getTypeParameters() {
        JavaType[] javaTypeArr = this._types;
        if (javaTypeArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        List<JavaType> asList = Arrays.asList(javaTypeArr);
        if (!asList.contains(null)) {
            return asList;
        }
        ArrayList arrayList = new ArrayList(asList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null) {
                arrayList.set(i, TypeFactory.unknownType());
            }
        }
        return arrayList;
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this._unboundVariables;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this._unboundVariables[length]));
        return true;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public boolean isEmpty() {
        return this._types.length == 0;
    }

    public Object readResolve() {
        String[] strArr = this._names;
        return (strArr == null || strArr.length == 0) ? EMPTY : this;
    }

    public int size() {
        return this._types.length;
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder("<");
        int length = this._types.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            JavaType javaType = this._types[i];
            if (javaType == null) {
                sb.append("?");
            } else {
                sb.append(javaType.getGenericSignature());
            }
        }
        sb.append(Typography.greater);
        return sb.toString();
    }

    public JavaType[] typeParameterArray() {
        return this._types;
    }

    public TypeBindings withUnboundVariable(String str) {
        String[] strArr = this._unboundVariables;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new TypeBindings(this._names, this._types, strArr2);
    }

    public TypeBindings withoutVariable(String str) {
        int indexOf = Arrays.asList(this._names).indexOf(str);
        if (indexOf == -1) {
            return this;
        }
        JavaType[] javaTypeArr = (JavaType[]) this._types.clone();
        javaTypeArr[indexOf] = null;
        return new TypeBindings(this._names, javaTypeArr, this._unboundVariables);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return EMPTY;
        }
        if (length == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        PathKt$$ExternalSyntheticBUOutline0.m(length, "Cannot create TypeBindings for class ", cls.getName(), " with 1 type parameter: class expects ");
        return null;
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        JavaType[] javaTypeArr;
        if (list != null && !list.isEmpty()) {
            javaTypeArr = (JavaType[]) list.toArray(NO_TYPES);
        } else {
            javaTypeArr = NO_TYPES;
        }
        return create(cls, javaTypeArr);
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        TypeVariable<?>[] paramsFor1 = TypeParamStash.paramsFor1(cls);
        int length = paramsFor1 == null ? 0 : paramsFor1.length;
        if (length == 1) {
            return new TypeBindings(new String[]{paramsFor1[0].getName()}, new JavaType[]{javaType}, null);
        }
        PathKt$$ExternalSyntheticBUOutline0.m(length, "Cannot create TypeBindings for class ", cls.getName(), " with 1 type parameter: class expects ");
        return null;
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable<?>[] paramsFor2 = TypeParamStash.paramsFor2(cls);
        int length = paramsFor2 == null ? 0 : paramsFor2.length;
        if (length == 2) {
            return new TypeBindings(new String[]{paramsFor2[0].getName(), paramsFor2[1].getName()}, new JavaType[]{javaType, javaType2}, null);
        }
        PathKt$$ExternalSyntheticBUOutline0.m(length, "Cannot create TypeBindings for class ", cls.getName(), " with 2 type parameters: class expects ");
        return null;
    }

    public static TypeBindings create(List<String> list, List<JavaType> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            return new TypeBindings((String[]) list.toArray(NO_STRINGS), (JavaType[]) list2.toArray(NO_TYPES), null);
        }
        return EMPTY;
    }
}
