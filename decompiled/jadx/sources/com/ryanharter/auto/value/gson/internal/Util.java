package com.ryanharter.auto.value.gson.internal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.Nullable;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class Util {
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.ryanharter.auto.value.gson.internal.Util$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$FieldNamingPolicy;

        static {
            int[] iArr = new int[FieldNamingPolicy.values().length];
            $SwitchMap$com$google$gson$FieldNamingPolicy = iArr;
            try {
                iArr[FieldNamingPolicy.UPPER_CAMEL_CASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$FieldNamingPolicy[FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$FieldNamingPolicy[FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$FieldNamingPolicy[FieldNamingPolicy.LOWER_CASE_WITH_DASHES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$FieldNamingPolicy[FieldNamingPolicy.LOWER_CASE_WITH_DOTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GenericArrayTypeImpl implements GenericArrayType {
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = Util.canonicalize(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && WildcardUtil.equals(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return Util.typeToString(this.componentType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ParameterizedTypeImpl implements ParameterizedType {

        @Nullable
        private final Type ownerType;
        private final Type rawType;
        final Type[] typeArguments;

        public ParameterizedTypeImpl(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || WildcardUtil.getRawType(type) != enclosingClass) {
                        Single$$ExternalSyntheticBUOutline0.m("unexpected owner type for ", type2, ": ", type);
                        throw null;
                    }
                } else if (enclosingClass != null) {
                    XML$$ExternalSyntheticBUOutline0.m("unexpected owner type for ", type2, ": null");
                    throw null;
                }
            }
            this.ownerType = type == null ? null : Util.canonicalize(type);
            this.rawType = Util.canonicalize(type2);
            this.typeArguments = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.typeArguments;
                if (i >= typeArr2.length) {
                    return;
                }
                typeArr2[i].getClass();
                Util.checkNotPrimitive(this.typeArguments[i]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = Util.canonicalize(typeArr3[i]);
                i++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && WildcardUtil.equals(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            return Util.hashCodeOrZero(this.ownerType) ^ (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.typeArguments.length + 1) * 30);
            sb.append(Util.typeToString(this.rawType));
            if (this.typeArguments.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(Util.typeToString(this.typeArguments[0]));
            for (int i = 1; i < this.typeArguments.length; i++) {
                sb.append(", ");
                sb.append(Util.typeToString(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class WildcardTypeImpl implements WildcardType {

        @Nullable
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            if (typeArr.length != 1) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                Util.checkNotPrimitive(typeArr[0]);
                this.lowerBound = null;
                this.upperBound = Util.canonicalize(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            Util.checkNotPrimitive(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            this.lowerBound = Util.canonicalize(typeArr2[0]);
            this.upperBound = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && WildcardUtil.equals(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : Util.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            Type type = this.lowerBound;
            return (this.upperBound.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + Util.typeToString(this.lowerBound);
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            return "? extends " + Util.typeToString(this.upperBound);
        }
    }

    private Util() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new GenericArrayTypeImpl(canonicalize(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof ParameterizedTypeImpl) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof GenericArrayTypeImpl ? type : new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        if (type instanceof WildcardTypeImpl) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkNotPrimitive(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            XML$$ExternalSyntheticBUOutline0.m("Unexpected primitive ", type, ". Use the boxed type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int hashCodeOrZero(@Nullable Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static String modifyString(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        return a$$ExternalSyntheticOutline0.m(str, i, sb);
    }

    public static Map<String, String> renameFields(Class<?> cls, List<String> list, FieldNamingStrategy fieldNamingStrategy) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : list) {
            if (fieldNamingStrategy instanceof FieldNamingPolicy) {
                int i = AnonymousClass1.$SwitchMap$com$google$gson$FieldNamingPolicy[((FieldNamingPolicy) fieldNamingStrategy).ordinal()];
                if (i == 1) {
                    linkedHashMap.put(str, upperCaseFirstLetter(str));
                } else if (i == 2) {
                    linkedHashMap.put(str, upperCaseFirstLetter(separateCamelCase(str, " ")));
                } else if (i == 3) {
                    linkedHashMap.put(str, separateCamelCase(str, "_").toLowerCase(Locale.ENGLISH));
                } else if (i == 4) {
                    linkedHashMap.put(str, separateCamelCase(str, "-").toLowerCase(Locale.ENGLISH));
                } else if (i != 5) {
                    linkedHashMap.put(str, str);
                } else {
                    linkedHashMap.put(str, separateCamelCase(str, ".").toLowerCase(Locale.ENGLISH));
                }
            } else {
                try {
                    linkedHashMap.put(str, fieldNamingStrategy.translateName(cls.getDeclaredField(str)));
                } catch (NoSuchFieldException unused) {
                    linkedHashMap.put(str, str);
                }
            }
        }
        return linkedHashMap;
    }

    private static String separateCamelCase(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static String upperCaseFirstLetter(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(modifyString(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }
}
