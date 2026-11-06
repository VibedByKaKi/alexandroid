package org.apache.commons.lang3;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Validate {
    private static final String DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE = "The value %s is not in the specified exclusive range of %s to %s";
    private static final String DEFAULT_FINITE_EX_MESSAGE = "The value is invalid: %f";
    private static final String DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE = "The value %s is not in the specified inclusive range of %s to %s";
    private static final String DEFAULT_IS_ASSIGNABLE_EX_MESSAGE = "Cannot assign a %s to a %s";
    private static final String DEFAULT_IS_INSTANCE_OF_EX_MESSAGE = "Expected type: %s, actual: %s";
    private static final String DEFAULT_IS_NULL_EX_MESSAGE = "The validated object is null";
    private static final String DEFAULT_IS_TRUE_EX_MESSAGE = "The validated expression is false";
    private static final String DEFAULT_MATCHES_PATTERN_EX = "The string %s does not match the pattern %s";
    private static final String DEFAULT_NOT_BLANK_EX_MESSAGE = "The validated character sequence is blank";
    private static final String DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE = "The validated array is empty";
    private static final String DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE = "The validated character sequence is empty";
    private static final String DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE = "The validated collection is empty";
    private static final String DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE = "The validated map is empty";
    private static final String DEFAULT_NOT_NAN_EX_MESSAGE = "The validated value is not a number";
    private static final String DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE = "The validated array contains null element at index: %d";
    private static final String DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE = "The validated collection contains null element at index: %d";
    private static final String DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE = "The validated array index is invalid: %d";
    private static final String DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE = "The validated character sequence index is invalid: %d";
    private static final String DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE = "The validated collection index is invalid: %d";
    private static final String DEFAULT_VALID_STATE_EX_MESSAGE = "The validated state is false";

    public static void exclusiveBetween(double d, double d2, double d3) {
        if (d3 <= d || d3 >= d2) {
            StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("The value ", d3, " is not in the specified exclusive range of ");
            m.append(d);
            m.append(" to ");
            m.append(d2);
            throw new IllegalArgumentException(m.toString());
        }
    }

    public static void finite(double d, String str, Object... objArr) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getMessage(String str, Object... objArr) {
        return ArrayUtils.isEmpty(objArr) ? str : String.format(str, objArr);
    }

    public static void inclusiveBetween(double d, double d2, double d3) {
        if (d3 < d || d3 > d2) {
            StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("The value ", d3, " is not in the specified inclusive range of ");
            m.append(d);
            m.append(" to ");
            m.append(d2);
            throw new IllegalArgumentException(m.toString());
        }
    }

    public static void isAssignableFrom(Class<?> cls, Class<?> cls2) {
        if (cls2 == null || cls == null || !cls.isAssignableFrom(cls2)) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Cannot assign a ", ClassUtils.getName(cls2, "null type"), " to a ", ClassUtils.getName(cls, "null type")));
        }
    }

    public static void isInstanceOf(Class<?> cls, Object obj) {
        if (cls.isInstance(obj)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Expected type: ", cls.getName(), ", actual: ", ClassUtils.getName(obj, "null")));
    }

    public static void isTrue(boolean z, String str, double d) {
        if (z) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m(str, new Object[]{Double.valueOf(d)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$noNullElements$0(String str, Object[] objArr, AtomicInteger atomicInteger, Object obj) {
        if (obj != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, ArrayUtils.addAll(objArr, Integer.valueOf(atomicInteger.getAndIncrement()))));
    }

    public static void matchesPattern(CharSequence charSequence, String str) {
        if (Pattern.matches(str, charSequence)) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m(DEFAULT_MATCHES_PATTERN_EX, new Object[]{charSequence, str});
    }

    public static <T> T[] noNullElements(T[] tArr, String str, Object... objArr) {
        Objects.requireNonNull(tArr, "array");
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == null) {
                Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, ArrayUtils.add((Integer[]) objArr, Integer.valueOf(i))));
                return null;
            }
        }
        return tArr;
    }

    public static <T extends CharSequence> T notBlank(T t, String str, Object... objArr) {
        Objects.requireNonNull(t, toSupplier(str, objArr));
        if (!StringUtils.isBlank(t)) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
        return null;
    }

    public static <T extends Collection<?>> T notEmpty(T t, String str, Object... objArr) {
        Objects.requireNonNull(t, toSupplier(str, objArr));
        if (!t.isEmpty()) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
        return null;
    }

    public static void notNaN(double d, String str, Object... objArr) {
        if (Double.isNaN(d)) {
            Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
        }
    }

    @Deprecated
    public static <T> T notNull(T t) {
        return (T) notNull(t, DEFAULT_IS_NULL_EX_MESSAGE, new Object[0]);
    }

    private static Supplier<String> toSupplier(String str, Object... objArr) {
        return new Validate$$ExternalSyntheticLambda1(str, objArr, 0);
    }

    public static <T extends Collection<?>> T validIndex(T t, int i, String str, Object... objArr) {
        Objects.requireNonNull(t, "collection");
        if (i >= 0 && i < t.size()) {
            return t;
        }
        XML$$ExternalSyntheticBUOutline0.m(getMessage(str, objArr));
        return null;
    }

    public static void validState(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(getMessage(str, objArr));
    }

    public static <T> T notNull(T t, String str, Object... objArr) {
        Objects.requireNonNull(t, toSupplier(str, objArr));
        return t;
    }

    public static void validState(boolean z) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(DEFAULT_VALID_STATE_EX_MESSAGE);
    }

    public static void isTrue(boolean z) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(DEFAULT_IS_TRUE_EX_MESSAGE);
    }

    public static void notNaN(double d) {
        notNaN(d, DEFAULT_NOT_NAN_EX_MESSAGE, new Object[0]);
    }

    public static void isTrue(boolean z, String str, long j) {
        if (z) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m(str, new Object[]{Long.valueOf(j)});
    }

    public static void isTrue(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
    }

    public static void matchesPattern(CharSequence charSequence, String str, String str2, Object... objArr) {
        if (Pattern.matches(str, charSequence)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str2, objArr));
    }

    public static void isTrue(boolean z, Supplier<String> supplier) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(supplier.get());
    }

    public static void finite(double d) {
        finite(d, DEFAULT_FINITE_EX_MESSAGE, Double.valueOf(d));
    }

    public static <T extends CharSequence> T notBlank(T t) {
        return (T) notBlank(t, DEFAULT_NOT_BLANK_EX_MESSAGE, new Object[0]);
    }

    public static <T extends Map<?, ?>> T notEmpty(T t) {
        return (T) notEmpty(t, DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE, new Object[0]);
    }

    public static <T extends CharSequence> T validIndex(T t, int i) {
        return (T) validIndex(t, i, DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE, Integer.valueOf(i));
    }

    public static <T extends CharSequence> T notEmpty(T t) {
        return (T) notEmpty(t, DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE, new Object[0]);
    }

    public static <T extends Collection<?>> T validIndex(T t, int i) {
        return (T) validIndex(t, i, DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE, Integer.valueOf(i));
    }

    public static <T extends Collection<?>> T notEmpty(T t) {
        return (T) notEmpty(t, DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE, new Object[0]);
    }

    public static <T extends CharSequence> T validIndex(T t, int i, String str, Object... objArr) {
        Objects.requireNonNull(t, "chars");
        if (i >= 0 && i < t.length()) {
            return t;
        }
        XML$$ExternalSyntheticBUOutline0.m(getMessage(str, objArr));
        return null;
    }

    public static <T extends Map<?, ?>> T notEmpty(T t, String str, Object... objArr) {
        Objects.requireNonNull(t, toSupplier(str, objArr));
        if (!t.isEmpty()) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
        return null;
    }

    public static <T> T[] validIndex(T[] tArr, int i) {
        return (T[]) validIndex(tArr, i, DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE, Integer.valueOf(i));
    }

    public static void isInstanceOf(Class<?> cls, Object obj, String str, Object... objArr) {
        if (cls.isInstance(obj)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
    }

    public static <T extends CharSequence> T notEmpty(T t, String str, Object... objArr) {
        Objects.requireNonNull(t, toSupplier(str, objArr));
        if (t.length() != 0) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
        return null;
    }

    public static <T> T[] validIndex(T[] tArr, int i, String str, Object... objArr) {
        Objects.requireNonNull(tArr, "array");
        if (i >= 0 && i < tArr.length) {
            return tArr;
        }
        XML$$ExternalSyntheticBUOutline0.m(getMessage(str, objArr));
        return null;
    }

    public static <T> T[] notEmpty(T[] tArr) {
        return (T[]) notEmpty(tArr, DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE, new Object[0]);
    }

    public static void isAssignableFrom(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Iterable<?>> T noNullElements(T t, String str, Object... objArr) {
        Objects.requireNonNull(t, "iterable");
        t.forEach(new Validate$$ExternalSyntheticLambda0(str, objArr, new AtomicInteger(), 0));
        return t;
    }

    public static <T> T[] notEmpty(T[] tArr, String str, Object... objArr) {
        Objects.requireNonNull(tArr, toSupplier(str, objArr));
        if (tArr.length != 0) {
            return tArr;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
        return null;
    }

    public static <T> T[] noNullElements(T[] tArr) {
        return (T[]) noNullElements(tArr, DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE, new Object[0]);
    }

    public static <T extends Iterable<?>> T noNullElements(T t) {
        return (T) noNullElements(t, DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE, new Object[0]);
    }

    public static void exclusiveBetween(double d, double d2, double d3, String str) {
        if (d3 <= d || d3 >= d2) {
            Single$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }

    public static void inclusiveBetween(double d, double d2, double d3, String str) {
        if (d3 < d || d3 > d2) {
            Single$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }

    public static void exclusiveBetween(long j, long j2, long j3) {
        if (j3 <= j || j3 >= j2) {
            StringBuilder m = a$$ExternalSyntheticOutline0.m("The value ", j3, " is not in the specified exclusive range of ");
            m.append(j);
            m.append(" to ");
            m.append(j2);
            throw new IllegalArgumentException(m.toString());
        }
    }

    public static void inclusiveBetween(long j, long j2, long j3) {
        if (j3 < j || j3 > j2) {
            StringBuilder m = a$$ExternalSyntheticOutline0.m("The value ", j3, " is not in the specified inclusive range of ");
            m.append(j);
            m.append(" to ");
            m.append(j2);
            throw new IllegalArgumentException(m.toString());
        }
    }

    public static void exclusiveBetween(long j, long j2, long j3, String str) {
        if (j3 <= j || j3 >= j2) {
            Single$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }

    public static void inclusiveBetween(long j, long j2, long j3, String str) {
        if (j3 < j || j3 > j2) {
            Single$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }

    public static <T> void exclusiveBetween(T t, T t2, Comparable<T> comparable) {
        if (comparable.compareTo(t) <= 0 || comparable.compareTo(t2) >= 0) {
            Buffer$$ExternalSyntheticBUOutline0.m(DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE, new Object[]{comparable, t, t2});
        }
    }

    public static <T> void inclusiveBetween(T t, T t2, Comparable<T> comparable) {
        if (comparable.compareTo(t) < 0 || comparable.compareTo(t2) > 0) {
            Buffer$$ExternalSyntheticBUOutline0.m(DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE, new Object[]{comparable, t, t2});
        }
    }

    public static <T> void exclusiveBetween(T t, T t2, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t) <= 0 || comparable.compareTo(t2) >= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
        }
    }

    public static <T> void inclusiveBetween(T t, T t2, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t) < 0 || comparable.compareTo(t2) > 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(getMessage(str, objArr));
        }
    }
}
