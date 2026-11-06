package org.apache.commons.lang;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.apache.commons.lang.text.StrBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ClassUtils {
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
    public static final char PACKAGE_SEPARATOR_CHAR = '.';
    private static final Map abbreviationMap;
    static /* synthetic */ Class class$java$lang$Boolean;
    static /* synthetic */ Class class$java$lang$Byte;
    static /* synthetic */ Class class$java$lang$Character;
    static /* synthetic */ Class class$java$lang$Double;
    static /* synthetic */ Class class$java$lang$Float;
    static /* synthetic */ Class class$java$lang$Integer;
    static /* synthetic */ Class class$java$lang$Long;
    static /* synthetic */ Class class$java$lang$Short;
    static /* synthetic */ Class class$org$apache$commons$lang$ClassUtils;
    private static final Map primitiveWrapperMap;
    private static final Map reverseAbbreviationMap;
    private static final Map wrapperPrimitiveMap;
    public static final String PACKAGE_SEPARATOR = String.valueOf('.');
    public static final String INNER_CLASS_SEPARATOR = String.valueOf('$');

    static {
        HashMap hashMap = new HashMap();
        primitiveWrapperMap = hashMap;
        Class cls = class$java$lang$Boolean;
        if (cls == null) {
            cls = class$("java.lang.Boolean");
            class$java$lang$Boolean = cls;
        }
        hashMap.put(Boolean.TYPE, cls);
        Class cls2 = class$java$lang$Byte;
        if (cls2 == null) {
            cls2 = class$("java.lang.Byte");
            class$java$lang$Byte = cls2;
        }
        hashMap.put(Byte.TYPE, cls2);
        Class cls3 = class$java$lang$Character;
        if (cls3 == null) {
            cls3 = class$("java.lang.Character");
            class$java$lang$Character = cls3;
        }
        hashMap.put(Character.TYPE, cls3);
        Class cls4 = class$java$lang$Short;
        if (cls4 == null) {
            cls4 = class$("java.lang.Short");
            class$java$lang$Short = cls4;
        }
        hashMap.put(Short.TYPE, cls4);
        Class cls5 = class$java$lang$Integer;
        if (cls5 == null) {
            cls5 = class$("java.lang.Integer");
            class$java$lang$Integer = cls5;
        }
        hashMap.put(Integer.TYPE, cls5);
        Class cls6 = class$java$lang$Long;
        if (cls6 == null) {
            cls6 = class$("java.lang.Long");
            class$java$lang$Long = cls6;
        }
        hashMap.put(Long.TYPE, cls6);
        Class cls7 = class$java$lang$Double;
        if (cls7 == null) {
            cls7 = class$("java.lang.Double");
            class$java$lang$Double = cls7;
        }
        hashMap.put(Double.TYPE, cls7);
        Class cls8 = class$java$lang$Float;
        if (cls8 == null) {
            cls8 = class$("java.lang.Float");
            class$java$lang$Float = cls8;
        }
        hashMap.put(Float.TYPE, cls8);
        Class cls9 = Void.TYPE;
        hashMap.put(cls9, cls9);
        wrapperPrimitiveMap = new HashMap();
        for (Class cls10 : hashMap.keySet()) {
            Class cls11 = (Class) primitiveWrapperMap.get(cls10);
            if (!cls10.equals(cls11)) {
                wrapperPrimitiveMap.put(cls11, cls10);
            }
        }
        abbreviationMap = new HashMap();
        reverseAbbreviationMap = new HashMap();
        addAbbreviation("int", "I");
        addAbbreviation(TypedValues.Custom.S_BOOLEAN, "Z");
        addAbbreviation(TypedValues.Custom.S_FLOAT, "F");
        addAbbreviation("long", "J");
        addAbbreviation("short", ExifInterface.LATITUDE_SOUTH);
        addAbbreviation("byte", "B");
        addAbbreviation("double", "D");
        addAbbreviation("char", "C");
    }

    private static void addAbbreviation(String str, String str2) {
        abbreviationMap.put(str, str2);
        reverseAbbreviationMap.put(str2, str);
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static List convertClassNamesToClasses(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                arrayList.add(Class.forName((String) it2.next()));
            } catch (Exception unused) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static List convertClassesToClassNames(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Class cls = (Class) it2.next();
            if (cls == null) {
                arrayList.add(null);
            } else {
                arrayList.add(cls.getName());
            }
        }
        return arrayList;
    }

    private static void getAllInterfaces(Class cls, List list) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!list.contains(interfaces[i])) {
                    list.add(interfaces[i]);
                    getAllInterfaces(interfaces[i], list);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static List getAllSuperclasses(Class cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        return arrayList;
    }

    private static String getCanonicalName(String str) {
        String deleteWhitespace = StringUtils.deleteWhitespace(str);
        if (deleteWhitespace == null) {
            return null;
        }
        int i = 0;
        while (deleteWhitespace.startsWith(MarkdownConstants.LEFT_BRACKET)) {
            i++;
            deleteWhitespace = deleteWhitespace.substring(1);
        }
        if (i < 1) {
            return deleteWhitespace;
        }
        if (deleteWhitespace.startsWith("L")) {
            deleteWhitespace = deleteWhitespace.substring(1, deleteWhitespace.endsWith(";") ? deleteWhitespace.length() - 1 : deleteWhitespace.length());
        } else if (deleteWhitespace.length() > 0) {
            deleteWhitespace = (String) reverseAbbreviationMap.get(deleteWhitespace.substring(0, 1));
        }
        StrBuilder strBuilder = new StrBuilder(deleteWhitespace);
        for (int i2 = 0; i2 < i; i2++) {
            strBuilder.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        return strBuilder.toString();
    }

    public static Class getClass(ClassLoader classLoader, String str, boolean z) throws ClassNotFoundException {
        try {
            Map map = abbreviationMap;
            if (!map.containsKey(str)) {
                return Class.forName(toCanonicalName(str), z, classLoader);
            }
            StringBuffer stringBuffer = new StringBuffer(MarkdownConstants.LEFT_BRACKET);
            stringBuffer.append(map.get(str));
            return Class.forName(stringBuffer.toString(), z, classLoader).getComponentType();
        } catch (ClassNotFoundException e) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                try {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str.substring(0, lastIndexOf));
                    stringBuffer2.append('$');
                    stringBuffer2.append(str.substring(lastIndexOf + 1));
                    return getClass(classLoader, stringBuffer2.toString(), z);
                } catch (ClassNotFoundException unused) {
                    throw e;
                }
            }
            throw e;
        }
    }

    public static String getPackageCanonicalName(Object obj, String str) {
        return obj == null ? str : getPackageCanonicalName(obj.getClass().getName());
    }

    public static String getPackageName(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        while (str.charAt(0) == '[') {
            str = str.substring(1);
        }
        if (str.charAt(0) == 'L' && AppLaunchChecker$$ExternalSyntheticOutline0.m(1, str) == ';') {
            str = str.substring(1);
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : str.substring(0, lastIndexOf);
    }

    public static Method getPublicMethod(Class cls, String str, Class[] clsArr) throws SecurityException, NoSuchMethodException {
        Method method = cls.getMethod(str, clsArr);
        if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
            return method;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getAllInterfaces(cls));
        arrayList.addAll(getAllSuperclasses(cls));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Class cls2 = (Class) it2.next();
            if (Modifier.isPublic(cls2.getModifiers())) {
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
        StringBuffer stringBuffer = new StringBuffer("Can't find a public method for ");
        stringBuffer.append(str);
        stringBuffer.append(" ");
        stringBuffer.append(ArrayUtils.toString(clsArr));
        throw new NoSuchMethodException(stringBuffer.toString());
    }

    public static String getShortCanonicalName(Object obj, String str) {
        return obj == null ? str : getShortCanonicalName(obj.getClass().getName());
    }

    public static String getShortClassName(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StrBuilder strBuilder = new StrBuilder();
        if (str.startsWith(MarkdownConstants.LEFT_BRACKET)) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                strBuilder.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            if (str.charAt(0) == 'L' && AppLaunchChecker$$ExternalSyntheticOutline0.m(1, str) == ';') {
                str = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
            }
        }
        Map map = reverseAbbreviationMap;
        if (map.containsKey(str)) {
            str = (String) map.get(str);
        }
        int lastIndexOf = str.lastIndexOf(46);
        int indexOf = str.indexOf(36, lastIndexOf != -1 ? lastIndexOf + 1 : 0);
        String substring = str.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(substring);
        stringBuffer.append(strBuilder);
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isAssignable(Class cls, Class cls2, boolean z) {
        if (cls2 == 0) {
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
        if (Character.TYPE.equals(cls)) {
            return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        Class cls7 = Short.TYPE;
        if (cls7.equals(cls)) {
            return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        if (Byte.TYPE.equals(cls)) {
            return cls7.equals(cls2) || cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        return false;
    }

    public static boolean isInnerClass(Class cls) {
        return cls != null && cls.getName().indexOf(36) >= 0;
    }

    public static Class primitiveToWrapper(Class cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : (Class) primitiveWrapperMap.get(cls);
    }

    public static Class[] primitivesToWrappers(Class[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class[] clsArr2 = new Class[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            clsArr2[i] = primitiveToWrapper(clsArr[i]);
        }
        return clsArr2;
    }

    private static String toCanonicalName(String str) {
        String deleteWhitespace = StringUtils.deleteWhitespace(str);
        if (deleteWhitespace == null) {
            throw new NullArgumentException("className");
        }
        if (!deleteWhitespace.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return deleteWhitespace;
        }
        StrBuilder strBuilder = new StrBuilder();
        while (deleteWhitespace.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            deleteWhitespace = deleteWhitespace.substring(0, deleteWhitespace.length() - 2);
            strBuilder.append(MarkdownConstants.LEFT_BRACKET);
        }
        String str2 = (String) abbreviationMap.get(deleteWhitespace);
        if (str2 != null) {
            strBuilder.append(str2);
        } else {
            strBuilder.append("L").append(deleteWhitespace).append(";");
        }
        return strBuilder.toString();
    }

    public static Class[] toClass(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? null : obj.getClass();
        }
        return clsArr;
    }

    public static Class wrapperToPrimitive(Class cls) {
        return (Class) wrapperPrimitiveMap.get(cls);
    }

    public static Class[] wrappersToPrimitives(Class[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class[] clsArr2 = new Class[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            clsArr2[i] = wrapperToPrimitive(clsArr[i]);
        }
        return clsArr2;
    }

    public static String getPackageCanonicalName(Class cls) {
        if (cls == null) {
            return "";
        }
        return getPackageCanonicalName(cls.getName());
    }

    public static String getShortCanonicalName(Class cls) {
        if (cls == null) {
            return "";
        }
        return getShortCanonicalName(cls.getName());
    }

    public static String getPackageCanonicalName(String str) {
        return getPackageName(getCanonicalName(str));
    }

    public static String getShortCanonicalName(String str) {
        return getShortClassName(getCanonicalName(str));
    }

    public static List getAllInterfaces(Class cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        getAllInterfaces(cls, arrayList);
        return arrayList;
    }

    public static String getPackageName(Class cls) {
        if (cls == null) {
            return "";
        }
        return getPackageName(cls.getName());
    }

    public static String getPackageName(Object obj, String str) {
        return obj == null ? str : getPackageName(obj.getClass());
    }

    public static Class getClass(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return getClass(classLoader, str, true);
    }

    public static Class getClass(String str) throws ClassNotFoundException {
        return getClass(str, true);
    }

    public static Class getClass(String str, boolean z) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            Class cls = class$org$apache$commons$lang$ClassUtils;
            if (cls == null) {
                cls = class$("org.apache.commons.lang.ClassUtils");
                class$org$apache$commons$lang$ClassUtils = cls;
            }
            contextClassLoader = cls.getClassLoader();
        }
        return getClass(contextClassLoader, str, z);
    }

    public static String getShortClassName(Class cls) {
        if (cls == null) {
            return "";
        }
        return getShortClassName(cls.getName());
    }

    public static String getShortClassName(Object obj, String str) {
        return obj == null ? str : getShortClassName(obj.getClass());
    }

    public static boolean isAssignable(Class[] clsArr, Class[] clsArr2, boolean z) {
        if (!ArrayUtils.isSameLength(clsArr, clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        if (clsArr2 == null) {
            clsArr2 = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!isAssignable(clsArr[i], clsArr2[i], z)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAssignable(Class cls, Class cls2) {
        return isAssignable(cls, cls2, false);
    }

    public static boolean isAssignable(Class[] clsArr, Class[] clsArr2) {
        return isAssignable(clsArr, clsArr2, false);
    }
}
