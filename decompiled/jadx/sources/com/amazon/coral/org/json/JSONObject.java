package com.amazon.coral.org.json;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.biloba.utils.TimeDateUtils;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.dee.app.metrics.MetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.regex.Pattern;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class JSONObject {
    private final Map<String, Object> map;
    static final Pattern NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
    public static final Object NULL = new Null();

    public JSONObject(JSONTokener jSONTokener) throws JSONException {
        this();
        if (jSONTokener.nextClean() != '{') {
            throw jSONTokener.syntaxError("A JSONObject text must begin with '{'");
        }
        while (true) {
            char previous = jSONTokener.getPrevious();
            char nextClean = jSONTokener.nextClean();
            if (nextClean == 0) {
                throw jSONTokener.syntaxError("A JSONObject text must end with '}'");
            }
            if (nextClean == '[' || nextClean == '{') {
                if (previous == '{') {
                    throw jSONTokener.syntaxError("A JSON Object can not directly nest another JSON Object or JSON Array.");
                }
            } else if (nextClean == '}') {
                return;
            }
            jSONTokener.back();
            String obj = jSONTokener.nextValue().toString();
            if (jSONTokener.nextClean() != ':') {
                throw jSONTokener.syntaxError("Expected a ':' after a key");
            }
            if (obj != null) {
                if (opt(obj) != null) {
                    throw jSONTokener.syntaxError("Duplicate key \"" + obj + DeviceConfigConstants.DOUBLE_QUOTE);
                }
                Object nextValue = jSONTokener.nextValue();
                if (nextValue != null) {
                    put(obj, nextValue);
                }
            }
            char nextClean2 = jSONTokener.nextClean();
            if (nextClean2 != ',' && nextClean2 != ';') {
                if (nextClean2 != '}') {
                    throw jSONTokener.syntaxError("Expected a ',' or '}'");
                }
                return;
            } else if (jSONTokener.nextClean() == '}') {
                return;
            } else {
                jSONTokener.back();
            }
        }
    }

    public static String doubleToString(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return "null";
        }
        String d2 = Double.toString(d);
        if (d2.indexOf(46) <= 0 || d2.indexOf(101) >= 0 || d2.indexOf(69) >= 0) {
            return d2;
        }
        while (d2.endsWith(Constants.FEEDBACK_TYPE_DISLIKE)) {
            d2 = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, d2);
        }
        return d2.endsWith(".") ? AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, d2) : d2;
    }

    private static <A extends Annotation> A getAnnotation(Method method, Class<A> cls) {
        if (method != null && cls != null) {
            if (method.isAnnotationPresent(cls)) {
                return (A) method.getAnnotation(cls);
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return null;
            }
            for (Class<?> cls2 : declaringClass.getInterfaces()) {
                try {
                    return (A) getAnnotation(cls2.getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            try {
                return (A) getAnnotation(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return null;
    }

    private static int getAnnotationDepth(Method method, Class<? extends Annotation> cls) {
        int annotationDepth;
        if (method != null && cls != null) {
            if (method.isAnnotationPresent(cls)) {
                return 1;
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return -1;
            }
            for (Class<?> cls2 : declaringClass.getInterfaces()) {
                try {
                    annotationDepth = getAnnotationDepth(cls2.getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (NoSuchMethodException | SecurityException unused) {
                }
                if (annotationDepth > 0) {
                    return annotationDepth + 1;
                }
            }
            try {
                int annotationDepth2 = getAnnotationDepth(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
                if (annotationDepth2 > 0) {
                    return annotationDepth2 + 1;
                }
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return -1;
    }

    private static String getKeyNameFromMethod(Method method) {
        String substring;
        int annotationDepth;
        int annotationDepth2 = getAnnotationDepth(method, JSONPropertyIgnore.class);
        if (annotationDepth2 > 0 && ((annotationDepth = getAnnotationDepth(method, JSONPropertyName.class)) < 0 || annotationDepth2 <= annotationDepth)) {
            return null;
        }
        JSONPropertyName jSONPropertyName = (JSONPropertyName) getAnnotation(method, JSONPropertyName.class);
        if (jSONPropertyName != null && jSONPropertyName.value() != null && !jSONPropertyName.value().isEmpty()) {
            return jSONPropertyName.value();
        }
        String name = method.getName();
        if (!name.startsWith(MetricsConstants.Method.CACHE_GET) || name.length() <= 3) {
            if (name.startsWith("is") && name.length() > 2) {
                substring = name.substring(2);
            }
            return null;
        }
        substring = name.substring(3);
        if (substring.length() != 0 && !Character.isLowerCase(substring.charAt(0))) {
            if (substring.length() == 1) {
                return substring.toLowerCase(Locale.ROOT);
            }
            if (Character.isUpperCase(substring.charAt(1))) {
                return substring;
            }
            return substring.substring(0, 1).toLowerCase(Locale.ROOT) + substring.substring(1);
        }
        return null;
    }

    public static String[] getNames(Object obj) {
        Field[] fields;
        int length;
        if (obj == null || (length = (fields = obj.getClass().getFields()).length) == 0) {
            return null;
        }
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = fields[i].getName();
        }
        return strArr;
    }

    public static final void indent(Writer writer, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            writer.write(32);
        }
    }

    public static boolean isDecimalNotation(String str) {
        return str.indexOf(46) > -1 || str.indexOf(101) > -1 || str.indexOf(69) > -1 || "-0".equals(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isNumberSimilar(Number number, Number number2) {
        if (numberIsFinite(number) && numberIsFinite(number2)) {
            if (number.getClass().equals(number2.getClass()) && (number instanceof Comparable)) {
                return ((Comparable) number).compareTo(number2) == 0;
            }
            BigDecimal objectToBigDecimal = objectToBigDecimal(number, null, false);
            BigDecimal objectToBigDecimal2 = objectToBigDecimal(number2, null, false);
            if (objectToBigDecimal != null && objectToBigDecimal2 != null && objectToBigDecimal.compareTo(objectToBigDecimal2) == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidMethodName(String str) {
        return ("getClass".equals(str) || "getDeclaringClass".equals(str)) ? false : true;
    }

    private static boolean numberIsFinite(Number number) {
        if (number instanceof Double) {
            Double d = (Double) number;
            if (d.isInfinite() || d.isNaN()) {
                return false;
            }
        }
        if (!(number instanceof Float)) {
            return true;
        }
        Float f = (Float) number;
        return (f.isInfinite() || f.isNaN()) ? false : true;
    }

    public static String numberToString(Number number) throws JSONException {
        if (number == null) {
            XML$$ExternalSyntheticBUOutline0.m("Null pointer");
            return null;
        }
        testValidity(number);
        String obj = number.toString();
        if (obj.indexOf(46) <= 0 || obj.indexOf(101) >= 0 || obj.indexOf(69) >= 0) {
            return obj;
        }
        while (obj.endsWith(Constants.FEEDBACK_TYPE_DISLIKE)) {
            obj = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, obj);
        }
        return obj.endsWith(".") ? AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, obj) : obj;
    }

    public static BigDecimal objectToBigDecimal(Object obj, BigDecimal bigDecimal, boolean z) {
        if (!NULL.equals(obj)) {
            if (obj instanceof BigDecimal) {
                return (BigDecimal) obj;
            }
            if (obj instanceof BigInteger) {
                return new BigDecimal((BigInteger) obj);
            }
            if ((obj instanceof Double) || (obj instanceof Float)) {
                Number number = (Number) obj;
                if (numberIsFinite(number)) {
                    return z ? new BigDecimal(number.doubleValue()) : new BigDecimal(obj.toString());
                }
            } else {
                if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    return new BigDecimal(((Number) obj).longValue());
                }
                try {
                    return new BigDecimal(obj.toString());
                } catch (Exception unused) {
                }
            }
        }
        return bigDecimal;
    }

    public static BigInteger objectToBigInteger(Object obj, BigInteger bigInteger) {
        if (!NULL.equals(obj)) {
            if (obj instanceof BigInteger) {
                return (BigInteger) obj;
            }
            if (obj instanceof BigDecimal) {
                return ((BigDecimal) obj).toBigInteger();
            }
            if ((obj instanceof Double) || (obj instanceof Float)) {
                Number number = (Number) obj;
                if (numberIsFinite(number)) {
                    return new BigDecimal(number.doubleValue()).toBigInteger();
                }
            } else {
                if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    return BigInteger.valueOf(((Number) obj).longValue());
                }
                try {
                    String obj2 = obj.toString();
                    return isDecimalNotation(obj2) ? new BigDecimal(obj2).toBigInteger() : new BigInteger(obj2);
                } catch (Exception unused) {
                }
            }
        }
        return bigInteger;
    }

    private void populateMap(Object obj, Set<Object> set) {
        String keyNameFromMethod;
        Class<?> cls = obj.getClass();
        for (Method method : cls.getClassLoader() != null ? cls.getMethods() : cls.getDeclaredMethods()) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && method.getParameterTypes().length == 0 && !method.isBridge() && method.getReturnType() != Void.TYPE && isValidMethodName(method.getName()) && (keyNameFromMethod = getKeyNameFromMethod(method)) != null && !keyNameFromMethod.isEmpty()) {
                try {
                    Object invoke = method.invoke(obj, null);
                    if (invoke == null) {
                        continue;
                    } else {
                        if (set.contains(invoke)) {
                            throw recursivelyDefinedObjectException(keyNameFromMethod);
                        }
                        set.add(invoke);
                        this.map.put(keyNameFromMethod, wrap(invoke, set));
                        set.remove(invoke);
                        if (invoke instanceof Closeable) {
                            ((Closeable) invoke).close();
                        }
                    }
                } catch (IOException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                    continue;
                }
            }
        }
    }

    public static Writer quote(String str, Writer writer) throws IOException {
        if (str == null || str.isEmpty()) {
            writer.write("\"\"");
            return writer;
        }
        int length = str.length();
        writer.write(34);
        int i = 0;
        char c = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                writer.write("\\f");
            } else if (charAt != '\r') {
                if (charAt != '\"') {
                    if (charAt == '/') {
                        if (c == '<') {
                            writer.write(92);
                        }
                        writer.write(charAt);
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                writer.write("\\b");
                                break;
                            case '\t':
                                writer.write("\\t");
                                break;
                            case '\n':
                                writer.write("\\n");
                                break;
                            default:
                                if (charAt >= ' ' && ((charAt < 128 || charAt >= 160) && (charAt < 8192 || charAt >= 8448))) {
                                    writer.write(charAt);
                                    break;
                                } else {
                                    writer.write("\\u");
                                    String hexString = Integer.toHexString(charAt);
                                    writer.write(TimeDateUtils.DAY_START, 0, 4 - hexString.length());
                                    writer.write(hexString);
                                    break;
                                }
                        }
                    }
                }
                writer.write(92);
                writer.write(charAt);
            } else {
                writer.write("\\r");
            }
            i++;
            c = charAt;
        }
        writer.write(34);
        return writer;
    }

    private static JSONException recursivelyDefinedObjectException(String str) {
        return new JSONException("JavaBean object contains recursively defined member variable of key " + quote(str));
    }

    public static Number stringToNumber(String str) throws NumberFormatException {
        char charAt = str.charAt(0);
        if ((charAt < '0' || charAt > '9') && charAt != '-') {
            org.json.XML$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("val [", str, "] is not a valid number."));
            return null;
        }
        if (isDecimalNotation(str)) {
            try {
                try {
                    BigDecimal bigDecimal = new BigDecimal(str);
                    return (charAt == '-' && BigDecimal.ZERO.compareTo(bigDecimal) == 0) ? Double.valueOf(-0.0d) : bigDecimal;
                } catch (NumberFormatException unused) {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isNaN() && !valueOf.isInfinite()) {
                        return valueOf;
                    }
                    throw new NumberFormatException("val [" + str + "] is not a valid number.");
                }
            } catch (NumberFormatException unused2) {
                org.json.XML$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("val [", str, "] is not a valid number."));
                return null;
            }
        }
        if (charAt == '0' && str.length() > 1) {
            char charAt2 = str.charAt(1);
            if (charAt2 >= '0' && charAt2 <= '9') {
                org.json.XML$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("val [", str, "] is not a valid number."));
                return null;
            }
        } else if (charAt == '-' && str.length() > 2) {
            char charAt3 = str.charAt(1);
            char charAt4 = str.charAt(2);
            if (charAt3 == '0' && charAt4 >= '0' && charAt4 <= '9') {
                org.json.XML$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("val [", str, "] is not a valid number."));
                return null;
            }
        }
        BigInteger bigInteger = new BigInteger(str);
        return bigInteger.bitLength() <= 31 ? Integer.valueOf(bigInteger.intValue()) : bigInteger.bitLength() <= 63 ? Long.valueOf(bigInteger.longValue()) : bigInteger;
    }

    public static Object stringToValue(String str) {
        if ("".equals(str)) {
            return str;
        }
        if ("true".equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(str)) {
            return NULL;
        }
        char charAt = str.charAt(0);
        if ((charAt < '0' || charAt > '9') && charAt != '-') {
            return str;
        }
        try {
            return stringToNumber(str);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void testValidity(Object obj) throws JSONException {
        if (!(obj instanceof Number) || numberIsFinite((Number) obj)) {
            return;
        }
        XML$$ExternalSyntheticBUOutline0.m("JSON does not allow non-finite numbers.");
    }

    public static String valueToString(Object obj) throws JSONException {
        return JSONWriter.valueToString(obj);
    }

    private static Object wrap(Object obj, Set<Object> set) {
        try {
            Object obj2 = NULL;
            if (obj2.equals(obj)) {
                return obj2;
            }
            if ((obj instanceof JSONObject) || (obj instanceof JSONArray) || obj2.equals(obj) || (obj instanceof JSONString) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof BigInteger) || (obj instanceof BigDecimal)) {
                return obj;
            }
            if (obj instanceof Enum) {
                return obj;
            }
            if (obj instanceof Collection) {
                return new JSONArray((Collection<?>) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray(obj);
            }
            if (obj instanceof Map) {
                return new JSONObject((Map<?, ?>) obj);
            }
            Package r0 = obj.getClass().getPackage();
            String name = r0 != null ? r0.getName() : "";
            if (!name.startsWith("java.") && !name.startsWith("javax.") && obj.getClass().getClassLoader() != null) {
                return set != null ? new JSONObject(obj, set) : new JSONObject(obj);
            }
            return obj.toString();
        } catch (JSONException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Writer writeValue(Writer writer, Object obj, int i, int i2) throws JSONException, IOException {
        if (obj == null || obj.equals(null)) {
            writer.write("null");
            return writer;
        }
        if (obj instanceof JSONString) {
            try {
                String jSONString = ((JSONString) obj).toJSONString();
                writer.write(jSONString != null ? jSONString.toString() : quote(obj.toString()));
                return writer;
            } catch (Exception e) {
                throw new JSONException(e);
            }
        }
        if (obj instanceof Number) {
            String numberToString = numberToString((Number) obj);
            if (NUMBER_PATTERN.matcher(numberToString).matches()) {
                writer.write(numberToString);
                return writer;
            }
            quote(numberToString, writer);
            return writer;
        }
        if (obj instanceof Boolean) {
            writer.write(obj.toString());
            return writer;
        }
        if (obj instanceof Enum) {
            writer.write(quote(((Enum) obj).name()));
            return writer;
        }
        if (obj instanceof JSONObject) {
            ((JSONObject) obj).write(writer, i, i2);
            return writer;
        }
        if (obj instanceof JSONArray) {
            ((JSONArray) obj).write(writer, i, i2);
            return writer;
        }
        if (obj instanceof Map) {
            new JSONObject((Map<?, ?>) obj).write(writer, i, i2);
            return writer;
        }
        if (obj instanceof Collection) {
            new JSONArray((Collection<?>) obj).write(writer, i, i2);
            return writer;
        }
        if (obj.getClass().isArray()) {
            new JSONArray(obj).write(writer, i, i2);
            return writer;
        }
        quote(obj.toString(), writer);
        return writer;
    }

    private static JSONException wrongValueFormatException(String str, String str2, Object obj, Throwable th) {
        if (obj == null) {
            return new JSONException("JSONObject[" + quote(str) + "] is not a " + str2 + " (null).", th);
        }
        if ((obj instanceof Map) || (obj instanceof Iterable) || (obj instanceof JSONObject)) {
            return new JSONException("JSONObject[" + quote(str) + "] is not a " + str2 + " (" + obj.getClass() + ").", th);
        }
        return new JSONException("JSONObject[" + quote(str) + "] is not a " + str2 + " (" + obj.getClass() + " : " + obj + ").", th);
    }

    public JSONObject accumulate(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object opt = opt(str);
        if (opt == null) {
            if (obj instanceof JSONArray) {
                obj = new JSONArray().put(obj);
            }
            put(str, obj);
            return this;
        }
        if (opt instanceof JSONArray) {
            ((JSONArray) opt).put(obj);
            return this;
        }
        put(str, new JSONArray().put(opt).put(obj));
        return this;
    }

    public JSONObject append(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object opt = opt(str);
        if (opt == null) {
            put(str, new JSONArray().put(obj));
            return this;
        }
        if (!(opt instanceof JSONArray)) {
            throw wrongValueFormatException(str, "JSONArray", null, null);
        }
        put(str, ((JSONArray) opt).put(obj));
        return this;
    }

    public void clear() {
        this.map.clear();
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }

    public Object get(String str) throws JSONException {
        if (str == null) {
            XML$$ExternalSyntheticBUOutline0.m("Null key.");
            return null;
        }
        Object opt = opt(str);
        if (opt != null) {
            return opt;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] not found.");
    }

    public BigDecimal getBigDecimal(String str) throws JSONException {
        Object obj = get(str);
        BigDecimal objectToBigDecimal = objectToBigDecimal(obj, null);
        if (objectToBigDecimal != null) {
            return objectToBigDecimal;
        }
        throw wrongValueFormatException(str, "BigDecimal", obj, null);
    }

    public BigInteger getBigInteger(String str) throws JSONException {
        Object obj = get(str);
        BigInteger objectToBigInteger = objectToBigInteger(obj, null);
        if (objectToBigInteger != null) {
            return objectToBigInteger;
        }
        throw wrongValueFormatException(str, "BigInteger", obj, null);
    }

    public boolean getBoolean(String str) throws JSONException {
        Object obj = get(str);
        if (obj.equals(Boolean.FALSE)) {
            return false;
        }
        boolean z = obj instanceof String;
        if (z && ((String) obj).equalsIgnoreCase("false")) {
            return false;
        }
        if (obj.equals(Boolean.TRUE)) {
            return true;
        }
        if (z && ((String) obj).equalsIgnoreCase("true")) {
            return true;
        }
        throw wrongValueFormatException(str, "Boolean", obj, null);
    }

    public double getDouble(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        try {
            return Double.parseDouble(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "double", obj, e);
        }
    }

    public <E extends Enum<E>> E getEnum(Class<E> cls, String str) throws JSONException {
        E e = (E) optEnum(cls, str);
        if (e != null) {
            return e;
        }
        throw wrongValueFormatException(str, "enum of type " + quote(cls.getSimpleName()), opt(str), null);
    }

    public float getFloat(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, TypedValues.Custom.S_FLOAT, obj, e);
        }
    }

    public int getInt(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            return Integer.parseInt(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "int", obj, e);
        }
    }

    public JSONArray getJSONArray(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw wrongValueFormatException(str, "JSONArray", obj, null);
    }

    public JSONObject getJSONObject(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw wrongValueFormatException(str, "JSONObject", obj, null);
    }

    public long getLong(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        try {
            return Long.parseLong(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "long", obj, e);
        }
    }

    public Class<? extends Map> getMapType() {
        return this.map.getClass();
    }

    public Number getNumber(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? (Number) obj : stringToNumber(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "number", obj, e);
        }
    }

    public String getString(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw wrongValueFormatException(str, TypedValues.Custom.S_STRING, obj, null);
    }

    public boolean has(String str) {
        return this.map.containsKey(str);
    }

    public JSONObject increment(String str) throws JSONException {
        Object opt = opt(str);
        if (opt == null) {
            put(str, 1);
            return this;
        }
        if (opt instanceof Integer) {
            put(str, ((Integer) opt).intValue() + 1);
            return this;
        }
        if (opt instanceof Long) {
            put(str, ((Long) opt).longValue() + 1);
            return this;
        }
        if (opt instanceof BigInteger) {
            put(str, ((BigInteger) opt).add(BigInteger.ONE));
            return this;
        }
        if (opt instanceof Float) {
            put(str, ((Float) opt).floatValue() + 1.0f);
            return this;
        }
        if (opt instanceof Double) {
            put(str, ((Double) opt).doubleValue() + 1.0d);
            return this;
        }
        if (opt instanceof BigDecimal) {
            put(str, ((BigDecimal) opt).add(BigDecimal.ONE));
            return this;
        }
        throw new JSONException("Unable to increment [" + quote(str) + "].");
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public boolean isNull(String str) {
        return NULL.equals(opt(str));
    }

    public Set<String> keySet() {
        return this.map.keySet();
    }

    public Iterator<String> keys() {
        return keySet().iterator();
    }

    public int length() {
        return this.map.size();
    }

    public JSONArray names() {
        if (this.map.isEmpty()) {
            return null;
        }
        return new JSONArray((Collection<?>) this.map.keySet());
    }

    public Object opt(String str) {
        if (str == null) {
            return null;
        }
        return this.map.get(str);
    }

    public BigDecimal optBigDecimal(String str, BigDecimal bigDecimal) {
        return objectToBigDecimal(opt(str), bigDecimal);
    }

    public BigInteger optBigInteger(String str, BigInteger bigInteger) {
        return objectToBigInteger(opt(str), bigInteger);
    }

    public boolean optBoolean(String str, boolean z) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return z;
        }
        if (opt instanceof Boolean) {
            return ((Boolean) opt).booleanValue();
        }
        try {
            return getBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }

    public double optDouble(String str, double d) {
        Number optNumber = optNumber(str);
        return optNumber == null ? d : optNumber.doubleValue();
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, String str, E e) {
        Object opt;
        try {
            opt = opt(str);
        } catch (IllegalArgumentException | NullPointerException unused) {
        }
        return NULL.equals(opt) ? e : cls.isAssignableFrom(opt.getClass()) ? (E) opt : (E) Enum.valueOf(cls, opt.toString());
    }

    public float optFloat(String str, float f) {
        Number optNumber = optNumber(str);
        return optNumber == null ? f : optNumber.floatValue();
    }

    public int optInt(String str, int i) {
        Number optNumber = optNumber(str, null);
        return optNumber == null ? i : optNumber.intValue();
    }

    public JSONArray optJSONArray(String str) {
        Object opt = opt(str);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject optJSONObject(String str, JSONObject jSONObject) {
        Object opt = opt(str);
        return opt instanceof JSONObject ? (JSONObject) opt : jSONObject;
    }

    public long optLong(String str, long j) {
        Number optNumber = optNumber(str, null);
        return optNumber == null ? j : optNumber.longValue();
    }

    public Number optNumber(String str, Number number) {
        Object opt = opt(str);
        if (!NULL.equals(opt)) {
            if (opt instanceof Number) {
                return (Number) opt;
            }
            try {
                return stringToNumber(opt.toString());
            } catch (Exception unused) {
            }
        }
        return number;
    }

    public Object optQuery(String str) {
        return optQuery(new JSONPointer(str));
    }

    public String optString(String str, String str2) {
        Object opt = opt(str);
        return NULL.equals(opt) ? str2 : opt.toString();
    }

    public JSONObject put(String str, Object obj) throws JSONException {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null key.");
            return null;
        }
        if (obj == null) {
            remove(str);
            return this;
        }
        testValidity(obj);
        this.map.put(str, obj);
        return this;
    }

    public JSONObject putOnce(String str, Object obj) throws JSONException {
        if (str == null || obj == null) {
            return this;
        }
        if (opt(str) == null) {
            return put(str, obj);
        }
        XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Duplicate key \"", str, DeviceConfigConstants.DOUBLE_QUOTE));
        return null;
    }

    public JSONObject putOpt(String str, Object obj) throws JSONException {
        return (str == null || obj == null) ? this : put(str, obj);
    }

    public Object query(String str) {
        return query(new JSONPointer(str));
    }

    public Object remove(String str) {
        return this.map.remove(str);
    }

    public boolean similar(Object obj) {
        try {
            if (!(obj instanceof JSONObject) || !keySet().equals(((JSONObject) obj).keySet())) {
                return false;
            }
            for (Map.Entry<String, Object> entry : entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = ((JSONObject) obj).get(key);
                if (value != obj2) {
                    if (value == null) {
                        return false;
                    }
                    if (value instanceof JSONObject) {
                        if (!((JSONObject) value).similar(obj2)) {
                            return false;
                        }
                    } else if (value instanceof JSONArray) {
                        if (!((JSONArray) value).similar(obj2)) {
                            return false;
                        }
                    } else if ((value instanceof Number) && (obj2 instanceof Number)) {
                        if (!isNumberSimilar((Number) value, (Number) obj2)) {
                            return false;
                        }
                    } else if ((value instanceof JSONString) && (obj2 instanceof JSONString)) {
                        if (!((JSONString) value).toJSONString().equals(((JSONString) obj2).toJSONString())) {
                            return false;
                        }
                    } else if (!value.equals(obj2)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public JSONArray toJSONArray(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(opt(jSONArray.getString(i)));
        }
        return jSONArray2;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : entrySet()) {
            hashMap.put(entry.getKey(), (entry.getValue() == null || NULL.equals(entry.getValue())) ? null : entry.getValue() instanceof JSONObject ? ((JSONObject) entry.getValue()).toMap() : entry.getValue() instanceof JSONArray ? ((JSONArray) entry.getValue()).toList() : entry.getValue());
        }
        return hashMap;
    }

    public String toString(int i) throws JSONException {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            obj = write(stringWriter, i, 0).toString();
        }
        return obj;
    }

    public Writer write(Writer writer, int i, int i2) throws JSONException {
        try {
            int length = length();
            writer.write(123);
            if (length == 1) {
                Map.Entry<String, Object> next = entrySet().iterator().next();
                String key = next.getKey();
                writer.write(quote(key));
                writer.write(58);
                if (i > 0) {
                    writer.write(32);
                }
                try {
                    writeValue(writer, next.getValue(), i, i2);
                    writer.write(125);
                    return writer;
                } catch (Exception e) {
                    throw new JSONException("Unable to write JSONObject value for key: " + key, e);
                }
            }
            if (length != 0) {
                int i3 = i2 + i;
                boolean z = false;
                for (Map.Entry<String, Object> entry : entrySet()) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i > 0) {
                        writer.write(10);
                    }
                    indent(writer, i3);
                    String key2 = entry.getKey();
                    writer.write(quote(key2));
                    writer.write(58);
                    if (i > 0) {
                        writer.write(32);
                    }
                    try {
                        writeValue(writer, entry.getValue(), i, i3);
                        z = true;
                    } catch (Exception e2) {
                        throw new JSONException("Unable to write JSONObject value for key: " + key2, e2);
                    }
                }
                if (i > 0) {
                    writer.write(10);
                }
                indent(writer, i2);
            }
            writer.write(125);
            return writer;
        } catch (IOException e3) {
            throw new JSONException(e3);
        }
    }

    public Object optQuery(JSONPointer jSONPointer) {
        try {
            return jSONPointer.queryFrom(this);
        } catch (JSONPointerException unused) {
            return null;
        }
    }

    public Object query(JSONPointer jSONPointer) {
        return jSONPointer.queryFrom(this);
    }

    public double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    public float optFloat(String str) {
        return optFloat(str, Float.NaN);
    }

    public JSONObject optJSONObject(String str) {
        return optJSONObject(str, null);
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public long optLong(String str) {
        return optLong(str, 0L);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Null {
        private Null() {
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "null";
        }

        public final Object clone() {
            return this;
        }
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public JSONObject put(String str, Collection<?> collection) throws JSONException {
        return put(str, new JSONArray(collection));
    }

    public String toString() {
        try {
            return toString(0);
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject put(String str, double d) throws JSONException {
        return put(str, Double.valueOf(d));
    }

    public JSONObject put(String str, float f) throws JSONException {
        return put(str, Float.valueOf(f));
    }

    public JSONObject put(String str, int i) throws JSONException {
        return put(str, Integer.valueOf(i));
    }

    public JSONObject put(String str, long j) throws JSONException {
        return put(str, Long.valueOf(j));
    }

    public JSONObject put(String str, Map<?, ?> map) throws JSONException {
        return put(str, new JSONObject(map));
    }

    public boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    public Number optNumber(String str) {
        return optNumber(str, null);
    }

    public JSONObject put(String str, boolean z) throws JSONException {
        return put(str, z ? Boolean.TRUE : Boolean.FALSE);
    }

    public static String[] getNames(JSONObject jSONObject) {
        if (jSONObject.isEmpty()) {
            return null;
        }
        return (String[]) jSONObject.keySet().toArray(new String[jSONObject.length()]);
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, String str) {
        return (E) optEnum(cls, str, null);
    }

    public static BigDecimal objectToBigDecimal(Object obj, BigDecimal bigDecimal) {
        return objectToBigDecimal(obj, bigDecimal, true);
    }

    private void populateMap(Object obj) {
        populateMap(obj, Collections.newSetFromMap(new IdentityHashMap()));
    }

    public JSONObject(JSONObject jSONObject, String... strArr) {
        this(strArr.length);
        for (String str : strArr) {
            try {
                putOnce(str, jSONObject.opt(str));
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject() {
        this.map = new HashMap();
    }

    public static String quote(String str) {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                try {
                    obj = quote(str, stringWriter).toString();
                } catch (IOException unused) {
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public JSONObject(Map<?, ?> map) {
        if (map == null) {
            this.map = new HashMap();
            return;
        }
        this.map = new HashMap(map.size());
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Object value = entry.getValue();
                if (value != null) {
                    this.map.put(String.valueOf(entry.getKey()), wrap(value));
                }
            } else {
                Single$$ExternalSyntheticBUOutline0.m$1("Null key.");
                throw null;
            }
        }
    }

    public JSONObject(Object obj) {
        this();
        populateMap(obj);
    }

    private JSONObject(Object obj, Set<Object> set) {
        this();
        populateMap(obj, set);
    }

    public JSONObject(Object obj, String... strArr) {
        this(strArr.length);
        Class<?> cls = obj.getClass();
        for (String str : strArr) {
            try {
                putOpt(str, cls.getField(str).get(obj));
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public JSONObject(String str, Locale locale) throws JSONException {
        this();
        ResourceBundle bundle = ResourceBundle.getBundle(str, locale, Thread.currentThread().getContextClassLoader());
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            if (nextElement != null) {
                String str2 = nextElement;
                String[] split = str2.split(ArcusConfig.PATH_SEPARATOR);
                int length = split.length - 1;
                JSONObject jSONObject = this;
                for (int i = 0; i < length; i++) {
                    String str3 = split[i];
                    JSONObject optJSONObject = jSONObject.optJSONObject(str3);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                        jSONObject.put(str3, optJSONObject);
                    }
                    jSONObject = optJSONObject;
                }
                jSONObject.put(split[length], bundle.getString(str2));
            }
        }
    }

    public static Object wrap(Object obj) {
        return wrap(obj, null);
    }

    public JSONObject(int i) {
        this.map = new HashMap(i);
    }

    public Writer write(Writer writer) throws JSONException {
        return write(writer, 0, 0);
    }
}
