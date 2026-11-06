package org.apache.commons.lang3;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.auto.value.processor.KotlinMetadata$$ExternalSyntheticLambda3;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import okhttp3.HttpUrl;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ClassUtils {
    private static final Map<String, String> ABBREVIATION_MAP;
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
    private static final int MAX_DIMENSIONS = 255;
    private static final Map<String, Class<?>> NAME_PRIMITIVE_MAP;
    public static final char PACKAGE_SEPARATOR_CHAR = '.';
    private static final Map<Class<?>, Class<?>> PRIMITIVE_WRAPPER_MAP;
    private static final Map<String, String> REVERSE_ABBREVIATION_MAP;
    private static final Map<Class<?>, Class<?>> WRAPPER_PRIMITIVE_MAP;
    private static final Comparator<Class<?>> COMPARATOR = new ClassUtils$$ExternalSyntheticLambda0(0);
    public static final String PACKAGE_SEPARATOR = String.valueOf('.');
    public static final String INNER_CLASS_SEPARATOR = String.valueOf('$');

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Interfaces {
        INCLUDE,
        EXCLUDE
    }

    static {
        HashMap hashMap = new HashMap();
        NAME_PRIMITIVE_MAP = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put(cls.getName(), cls);
        Class cls2 = Byte.TYPE;
        hashMap.put(cls2.getName(), cls2);
        Class cls3 = Character.TYPE;
        hashMap.put(cls3.getName(), cls3);
        Class cls4 = Double.TYPE;
        hashMap.put(cls4.getName(), cls4);
        Class cls5 = Float.TYPE;
        hashMap.put(cls5.getName(), cls5);
        Class cls6 = Integer.TYPE;
        hashMap.put(cls6.getName(), cls6);
        Class cls7 = Long.TYPE;
        hashMap.put(cls7.getName(), cls7);
        Class cls8 = Short.TYPE;
        hashMap.put(cls8.getName(), cls8);
        Class cls9 = Void.TYPE;
        hashMap.put(cls9.getName(), cls9);
        HashMap hashMap2 = new HashMap();
        PRIMITIVE_WRAPPER_MAP = hashMap2;
        hashMap2.put(cls, Boolean.class);
        hashMap2.put(cls2, Byte.class);
        hashMap2.put(cls3, Character.class);
        hashMap2.put(cls8, Short.class);
        hashMap2.put(cls6, Integer.class);
        hashMap2.put(cls7, Long.class);
        hashMap2.put(cls4, Double.class);
        hashMap2.put(cls5, Float.class);
        hashMap2.put(cls9, cls9);
        WRAPPER_PRIMITIVE_MAP = new HashMap();
        hashMap2.forEach(new ClassUtils$$ExternalSyntheticLambda1(0));
        HashMap hashMap3 = new HashMap();
        hashMap3.put(cls6.getName(), "I");
        hashMap3.put(cls.getName(), "Z");
        hashMap3.put(cls5.getName(), "F");
        hashMap3.put(cls7.getName(), "J");
        hashMap3.put(cls8.getName(), ExifInterface.LATITUDE_SOUTH);
        hashMap3.put(cls2.getName(), "B");
        hashMap3.put(cls4.getName(), "D");
        hashMap3.put(cls3.getName(), "C");
        ABBREVIATION_MAP = Collections.unmodifiableMap(hashMap3);
        REVERSE_ABBREVIATION_MAP = Collections.unmodifiableMap((Map) hashMap3.entrySet().stream().collect(Collectors.toMap(new KotlinMetadata$$ExternalSyntheticLambda3(18), new KotlinMetadata$$ExternalSyntheticLambda3(12))));
    }

    @Deprecated
    public ClassUtils() {
    }

    public static Comparator<Class<?>> comparator() {
        return COMPARATOR;
    }

    public static List<Class<?>> convertClassNamesToClasses(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        list.forEach(new ClassUtils$$ExternalSyntheticLambda2(arrayList, 0));
        return arrayList;
    }

    public static List<String> convertClassesToClassNames(List<Class<?>> list) {
        if (list == null) {
            return null;
        }
        return (List) list.stream().map(new EnumUtils$$ExternalSyntheticLambda4(11)).collect(Collectors.toList());
    }

    public static String getAbbreviatedName(String str, int i) {
        char c;
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("len must be > 0");
            return null;
        }
        if (str == null) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i2 = 0;
        int i3 = 0;
        while (i2 < charArray.length) {
            int i4 = i3;
            while (i2 < charArray.length && (c = charArray[i2]) != '.') {
                i2++;
                charArray[i4] = c;
                i4++;
            }
            int i5 = i3 + 1;
            if (!useFull(i4, i2, charArray.length, i) && i5 <= i4) {
                i4 = i5;
            }
            if (i2 < charArray.length) {
                i3 = i4 + 1;
                charArray[i4] = charArray[i2];
                i2++;
            } else {
                i3 = i4;
            }
        }
        return new String(charArray, 0, i3);
    }

    private static void getAllInterfaces(Class<?> cls, HashSet<Class<?>> hashSet) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    getAllInterfaces(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static List<Class<?>> getAllSuperclasses(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        return arrayList;
    }

    private static String getCanonicalName(String str) {
        String str2;
        String deleteWhitespace = StringUtils.deleteWhitespace(str);
        if (deleteWhitespace == null) {
            return null;
        }
        int length = deleteWhitespace.length();
        int i = 0;
        while (i < length && deleteWhitespace.charAt(i) == '[') {
            i++;
            if (i > 255) {
                Buffer$$ExternalSyntheticBUOutline0.m("Maximum array dimension %d exceeded", new Object[]{255});
                return null;
            }
        }
        if (i >= length) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid class name ", str));
            return null;
        }
        if (i < 1) {
            return deleteWhitespace;
        }
        String substring = deleteWhitespace.substring(i);
        if (substring.startsWith("L")) {
            if (!substring.endsWith(";") || substring.length() < 3) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid class name ", str));
                return null;
            }
            str2 = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, substring);
        } else {
            if (substring.length() != 1) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid class name ", str));
                return null;
            }
            String str3 = REVERSE_ABBREVIATION_MAP.get(substring.substring(0, 1));
            if (str3 == null) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid class name ", str));
                return null;
            }
            str2 = str3;
        }
        StringBuilder sb = new StringBuilder((i * 2) + str2.length());
        sb.append(str2);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        return sb.toString();
    }

    public static Class<?> getClass(ClassLoader classLoader, String str, boolean z) throws ClassNotFoundException {
        int lastIndexOf;
        do {
            try {
                Class<?> primitiveClass = getPrimitiveClass(str);
                if (primitiveClass == null) {
                    primitiveClass = Class.forName(toCanonicalName(str), z, classLoader);
                }
                return primitiveClass;
            } catch (ClassNotFoundException unused) {
                lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.substring(0, lastIndexOf));
                    sb.append('$');
                    str = a$$ExternalSyntheticOutline0.m(str, lastIndexOf + 1, sb);
                }
            }
        } while (lastIndexOf != -1);
        throw new ClassNotFoundException(str);
    }

    public static <T> Class<T> getComponentType(Class<T[]> cls) {
        if (cls == null) {
            return null;
        }
        return (Class<T>) cls.getComponentType();
    }

    public static String getName(Class<?> cls, String str, boolean z) {
        return cls == null ? str : z ? cls.getSimpleName() : cls.getName();
    }

    public static String getPackageCanonicalName(Object obj, String str) {
        return obj == null ? str : getPackageCanonicalName(obj.getClass().getName());
    }

    public static String getPackageName(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        String substring = str.substring(i);
        if (substring.charAt(0) == 'L' && AppLaunchChecker$$ExternalSyntheticOutline0.m(1, substring) == ';') {
            substring = substring.substring(1);
        }
        int lastIndexOf = substring.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : substring.substring(0, lastIndexOf);
    }

    public static Class<?> getPrimitiveClass(String str) {
        return NAME_PRIMITIVE_MAP.get(str);
    }

    public static Method getPublicMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method = cls.getMethod(str, clsArr);
        if (isPublic(method.getDeclaringClass())) {
            return method;
        }
        ArrayList arrayList = new ArrayList(getAllInterfaces(cls));
        arrayList.addAll(getAllSuperclasses(cls));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Class cls2 = (Class) it2.next();
            if (isPublic(cls2)) {
                try {
                    Method method2 = cls2.getMethod(str, clsArr);
                    if (Modifier.isPublic(method2.getDeclaringClass().getModifiers())) {
                        return method2;
                    }
                } catch (NoSuchMethodException unused) {
                    continue;
                }
            }
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Can't find a public method for ", str, " ");
        m2m.append(ArrayUtils.toString(clsArr));
        throw new NoSuchMethodException(m2m.toString());
    }

    public static String getShortCanonicalName(Class<?> cls) {
        return cls == null ? "" : getShortCanonicalName(cls.getCanonicalName());
    }

    public static String getShortClassName(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith(MarkdownConstants.LEFT_BRACKET)) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            if (str.charAt(0) == 'L' && AppLaunchChecker$$ExternalSyntheticOutline0.m(1, str) == ';') {
                str = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
            }
            Map<String, String> map = REVERSE_ABBREVIATION_MAP;
            if (map.containsKey(str)) {
                str = map.get(str);
            }
        }
        int lastIndexOf = str.lastIndexOf(46);
        int indexOf = str.indexOf(36, lastIndexOf != -1 ? lastIndexOf + 1 : 0);
        String substring = str.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        return substring + ((Object) sb);
    }

    public static String getSimpleName(Object obj, String str) {
        return obj == null ? str : obj.getClass().getSimpleName();
    }

    public static Iterable<Class<?>> hierarchy(final Class<?> cls, Interfaces interfaces) {
        final int i = 0;
        final Iterable<Class<?>> iterable = new Iterable() { // from class: org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda3
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Iterator lambda$hierarchy$0;
                Iterator lambda$hierarchy$1;
                int i2 = i;
                Object obj = cls;
                switch (i2) {
                    case 0:
                        lambda$hierarchy$0 = ClassUtils.lambda$hierarchy$0((Class) obj);
                        return lambda$hierarchy$0;
                    default:
                        lambda$hierarchy$1 = ClassUtils.lambda$hierarchy$1((ClassUtils$$ExternalSyntheticLambda3) obj);
                        return lambda$hierarchy$1;
                }
            }
        };
        if (interfaces != Interfaces.INCLUDE) {
            return iterable;
        }
        final int i2 = 1;
        return new Iterable() { // from class: org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda3
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                Iterator lambda$hierarchy$0;
                Iterator lambda$hierarchy$1;
                int i22 = i2;
                Object obj = iterable;
                switch (i22) {
                    case 0:
                        lambda$hierarchy$0 = ClassUtils.lambda$hierarchy$0((Class) obj);
                        return lambda$hierarchy$0;
                    default:
                        lambda$hierarchy$1 = ClassUtils.lambda$hierarchy$1((ClassUtils$$ExternalSyntheticLambda3) obj);
                        return lambda$hierarchy$1;
                }
            }
        };
    }

    public static boolean isAssignable(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = primitiveToWrapper(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = wrapperToPrimitive(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return cls2.isAssignableFrom(cls);
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        Class cls3 = Integer.TYPE;
        boolean equals = cls3.equals(cls);
        Class cls4 = Long.TYPE;
        Class cls5 = Double.TYPE;
        Class cls6 = Float.TYPE;
        if (equals) {
            return cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        if (cls4.equals(cls)) {
            return cls6.equals(cls2) || cls5.equals(cls2);
        }
        if (Boolean.TYPE.equals(cls) || cls5.equals(cls)) {
            return false;
        }
        if (cls6.equals(cls)) {
            return cls5.equals(cls2);
        }
        if (!Character.TYPE.equals(cls)) {
            Class cls7 = Short.TYPE;
            if (!cls7.equals(cls)) {
                if (Byte.TYPE.equals(cls)) {
                    return cls7.equals(cls2) || cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
                }
                return false;
            }
        }
        return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
    }

    public static boolean isInnerClass(Class<?> cls) {
        return (cls == null || cls.getEnclosingClass() == null) ? false : true;
    }

    public static boolean isPrimitiveOrWrapper(Class<?> cls) {
        return (cls != null && cls.isPrimitive()) || isPrimitiveWrapper(cls);
    }

    public static boolean isPrimitiveWrapper(Class<?> cls) {
        return WRAPPER_PRIMITIVE_MAP.containsKey(cls);
    }

    public static boolean isPublic(Class<?> cls) {
        return Modifier.isPublic(cls.getModifiers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convertClassNamesToClasses$0(List list, String str) {
        try {
            list.add(Class.forName(str));
        } catch (Exception unused) {
            list.add(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$convertClassesToClassNames$0(Class cls) {
        return getName((Class<?>) cls, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$hierarchy$0(Class cls) {
        final AtomicReference atomicReference = new AtomicReference(cls);
        return new Iterator<Class<?>>() { // from class: org.apache.commons.lang3.ClassUtils.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return atomicReference.get() != null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Class<?> next() {
                return (Class) atomicReference.getAndUpdate(new ClassUtils$1$$ExternalSyntheticLambda0());
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$hierarchy$1(Iterable iterable) {
        final HashSet hashSet = new HashSet();
        final Iterator it2 = iterable.iterator();
        return new Iterator<Class<?>>() { // from class: org.apache.commons.lang3.ClassUtils.2
            Iterator<Class<?>> interfaces = Collections.emptyIterator();

            private void walkInterfaces(Set<Class<?>> set, Class<?> cls) {
                for (Class<?> cls2 : cls.getInterfaces()) {
                    if (!hashSet.contains(cls2)) {
                        set.add(cls2);
                    }
                    walkInterfaces(set, cls2);
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.interfaces.hasNext() || it2.hasNext();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Class<?> next() {
                if (this.interfaces.hasNext()) {
                    Class<?> next = this.interfaces.next();
                    hashSet.add(next);
                    return next;
                }
                Class<?> cls = (Class) it2.next();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                walkInterfaces(linkedHashSet, cls);
                this.interfaces = linkedHashSet.iterator();
                return cls;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$primitivesToWrappers$0(Class[] clsArr, int i) {
        return primitiveToWrapper(clsArr[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Class cls, Class cls2) {
        return Objects.compare(getName((Class<?>) cls), getName((Class<?>) cls2), new ClassUtils$$ExternalSyntheticLambda0(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return;
        }
        WRAPPER_PRIMITIVE_MAP.put(cls2, cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$toClass$0(Object[] objArr, int i) {
        Object obj = objArr[i];
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$wrappersToPrimitives$0(Class[] clsArr, int i) {
        return wrapperToPrimitive(clsArr[i]);
    }

    public static Class<?> primitiveToWrapper(Class<?> cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : PRIMITIVE_WRAPPER_MAP.get(cls);
    }

    public static Class<?>[] primitivesToWrappers(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        return clsArr.length == 0 ? clsArr : (Class[]) ArrayUtils.setAll(new Class[clsArr.length], new ClassUtils$$ExternalSyntheticLambda8(clsArr, 1));
    }

    private static String toCanonicalName(String str) {
        String deleteWhitespace = StringUtils.deleteWhitespace(str);
        Objects.requireNonNull(deleteWhitespace, "className");
        if (!deleteWhitespace.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return deleteWhitespace;
        }
        StringBuilder sb = new StringBuilder();
        while (deleteWhitespace.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            deleteWhitespace = deleteWhitespace.substring(0, deleteWhitespace.length() - 2);
            sb.append(MarkdownConstants.LEFT_BRACKET);
        }
        String str2 = ABBREVIATION_MAP.get(deleteWhitespace);
        if (str2 != null) {
            sb.append(str2);
        } else {
            AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "L", deleteWhitespace, ";");
        }
        return sb.toString();
    }

    public static Class<?>[] toClass(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        return objArr.length == 0 ? ArrayUtils.EMPTY_CLASS_ARRAY : (Class[]) ArrayUtils.setAll(new Class[objArr.length], new Functions$$ExternalSyntheticLambda6(objArr, 9));
    }

    private static boolean useFull(int i, int i2, int i3, int i4) {
        return i2 >= i3 || (i + i3) - i2 <= i4;
    }

    public static Class<?> wrapperToPrimitive(Class<?> cls) {
        return WRAPPER_PRIMITIVE_MAP.get(cls);
    }

    public static Class<?>[] wrappersToPrimitives(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        return clsArr.length == 0 ? clsArr : (Class[]) ArrayUtils.setAll(new Class[clsArr.length], new ClassUtils$$ExternalSyntheticLambda8(clsArr, 0));
    }

    public static String getSimpleName(Class<?> cls, String str) {
        return cls == null ? str : cls.getSimpleName();
    }

    public static String getSimpleName(Object obj) {
        return getSimpleName(obj, "");
    }

    public static String getShortCanonicalName(Object obj, String str) {
        return obj == null ? str : getShortCanonicalName(obj.getClass());
    }

    public static String getSimpleName(Class<?> cls) {
        return getSimpleName(cls, "");
    }

    public static String getName(Class<?> cls, String str) {
        return getName(cls, str, false);
    }

    public static String getShortCanonicalName(String str) {
        return getShortClassName(getCanonicalName(str));
    }

    public static String getName(Class<?> cls) {
        return getName(cls, "");
    }

    public static String getPackageCanonicalName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getPackageCanonicalName(cls.getName());
    }

    public static String getName(Object obj) {
        return getName(obj, "");
    }

    public static String getName(Object obj, String str) {
        return obj == null ? str : obj.getClass().getName();
    }

    public static String getPackageCanonicalName(String str) {
        return getPackageName(getCanonicalName(str));
    }

    public static Iterable<Class<?>> hierarchy(Class<?> cls) {
        return hierarchy(cls, Interfaces.EXCLUDE);
    }

    public static List<Class<?>> getAllInterfaces(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        getAllInterfaces(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public static Class<?> getClass(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return getClass(classLoader, str, true);
    }

    public static Class<?> getClass(String str) throws ClassNotFoundException {
        return getClass(str, true);
    }

    public static Class<?> getClass(String str, boolean z) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = ClassUtils.class.getClassLoader();
        }
        return getClass(contextClassLoader, str, z);
    }

    public static String getPackageName(Object obj, String str) {
        return obj == null ? str : getPackageName(obj.getClass());
    }

    public static String getPackageName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getPackageName(cls.getName());
    }

    public static String getAbbreviatedName(Class<?> cls, int i) {
        if (cls == null) {
            return "";
        }
        return getAbbreviatedName(cls.getName(), i);
    }

    public static String getShortClassName(Object obj, String str) {
        return obj == null ? str : getShortClassName(obj.getClass());
    }

    public static String getShortClassName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getShortClassName(cls.getName());
    }

    public static String getCanonicalName(Class<?> cls, String str) {
        String canonicalName;
        return (cls == null || (canonicalName = cls.getCanonicalName()) == null) ? str : canonicalName;
    }

    public static String getCanonicalName(Object obj) {
        return getCanonicalName(obj, "");
    }

    public static String getCanonicalName(Object obj, String str) {
        String canonicalName;
        return (obj == null || (canonicalName = obj.getClass().getCanonicalName()) == null) ? str : canonicalName;
    }

    public static String getCanonicalName(Class<?> cls) {
        return getCanonicalName(cls, "");
    }

    public static boolean isAssignable(Class<?> cls, Class<?> cls2) {
        return isAssignable(cls, cls2, true);
    }

    public static boolean isAssignable(Class<?>[] clsArr, Class<?>... clsArr2) {
        return isAssignable(clsArr, clsArr2, true);
    }

    public static boolean isAssignable(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z) {
        if (!ArrayUtils.isSameLength((Object[]) clsArr, (Object[]) clsArr2)) {
            return false;
        }
        Class<?>[] nullToEmpty = ArrayUtils.nullToEmpty(clsArr);
        Class<?>[] nullToEmpty2 = ArrayUtils.nullToEmpty(clsArr2);
        for (int i = 0; i < nullToEmpty.length; i++) {
            if (!isAssignable(nullToEmpty[i], nullToEmpty2[i], z)) {
                return false;
            }
        }
        return true;
    }
}
