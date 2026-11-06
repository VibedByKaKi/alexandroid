package org.apache.commons.lang3.builder;

import com.google.common.math.Stats$$ExternalSyntheticLambda0;
import io.reactivex.rxjava3.core.Maybe$$ExternalSyntheticLambda0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.lang3.ArraySorter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class HashCodeBuilder implements Builder<Integer> {
    private static final int DEFAULT_INITIAL_VALUE = 17;
    private static final int DEFAULT_MULTIPLIER_VALUE = 37;
    private static final ThreadLocal<Set<IDKey>> REGISTRY = ThreadLocal.withInitial(new Stats$$ExternalSyntheticLambda0(22));
    private final int iConstant;
    private int iTotal;

    public HashCodeBuilder(int i, int i2) {
        Validate.isTrue(i % 2 != 0, "HashCodeBuilder requires an odd initial value", new Object[0]);
        Validate.isTrue(i2 % 2 != 0, "HashCodeBuilder requires an odd multiplier", new Object[0]);
        this.iConstant = i2;
        this.iTotal = i;
    }

    private void appendArray(Object obj) {
        if (obj instanceof long[]) {
            append((long[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            append((int[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            append((short[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            append((char[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            append((byte[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            append((double[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            append((float[]) obj);
        } else if (obj instanceof boolean[]) {
            append((boolean[]) obj);
        } else {
            append((Object[]) obj);
        }
    }

    public static Set<IDKey> getRegistry() {
        return REGISTRY.get();
    }

    public static boolean isRegistered(Object obj) {
        Set<IDKey> registry = getRegistry();
        return registry != null && registry.contains(new IDKey(obj));
    }

    private static void reflectionAppend(Object obj, Class<?> cls, HashCodeBuilder hashCodeBuilder, boolean z, String[] strArr) {
        if (isRegistered(obj)) {
            return;
        }
        try {
            register(obj);
            Field[] fieldArr = (Field[]) ArraySorter.sort(cls.getDeclaredFields(), Comparator.comparing(new Maybe$$ExternalSyntheticLambda0(5)));
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field : fieldArr) {
                if (!ArrayUtils.contains(strArr, field.getName())) {
                    if (!field.getName().contains("$")) {
                        if (!z && Modifier.isTransient(field.getModifiers())) {
                        }
                        if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(HashCodeExclude.class)) {
                            hashCodeBuilder.append(Reflection.getUnchecked(field, obj));
                        }
                    }
                }
            }
            unregister(obj);
        } catch (Throwable th) {
            unregister(obj);
            throw th;
        }
    }

    public static <T> int reflectionHashCode(int i, int i2, T t, boolean z, Class<? super T> cls, String... strArr) {
        Objects.requireNonNull(t, "object");
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(i, i2);
        Class<?> cls2 = t.getClass();
        reflectionAppend(t, cls2, hashCodeBuilder, z, strArr);
        while (cls2.getSuperclass() != null && cls2 != cls) {
            cls2 = cls2.getSuperclass();
            reflectionAppend(t, cls2, hashCodeBuilder, z, strArr);
        }
        return hashCodeBuilder.toHashCode();
    }

    private static void register(Object obj) {
        getRegistry().add(new IDKey(obj));
    }

    private static void unregister(Object obj) {
        Set<IDKey> registry = getRegistry();
        registry.remove(new IDKey(obj));
        if (registry.isEmpty()) {
            REGISTRY.remove();
        }
    }

    public HashCodeBuilder append(Object obj) {
        if (obj == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        if (ObjectUtils.isArray(obj)) {
            appendArray(obj);
            return this;
        }
        this.iTotal = obj.hashCode() + (this.iTotal * this.iConstant);
        return this;
    }

    public HashCodeBuilder appendSuper(int i) {
        this.iTotal = (this.iTotal * this.iConstant) + i;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.builder.Builder
    public Integer build() {
        return Integer.valueOf(toHashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HashCodeBuilder) && this.iTotal == ((HashCodeBuilder) obj).iTotal;
    }

    public int hashCode() {
        return toHashCode();
    }

    public int toHashCode() {
        return this.iTotal;
    }

    public HashCodeBuilder append(boolean[] zArr) {
        if (zArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (boolean z : zArr) {
            append(z);
        }
        return this;
    }

    public HashCodeBuilder append(byte b) {
        this.iTotal = (this.iTotal * this.iConstant) + b;
        return this;
    }

    public HashCodeBuilder() {
        this.iConstant = 37;
        this.iTotal = 17;
    }

    public HashCodeBuilder append(byte[] bArr) {
        if (bArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (byte b : bArr) {
            append(b);
        }
        return this;
    }

    public static int reflectionHashCode(int i, int i2, Object obj, boolean z) {
        return reflectionHashCode(i, i2, obj, z, null, new String[0]);
    }

    public static int reflectionHashCode(int i, int i2, Object obj) {
        return reflectionHashCode(i, i2, obj, false, null, new String[0]);
    }

    public static int reflectionHashCode(Object obj, boolean z) {
        return reflectionHashCode(17, 37, obj, z, null, new String[0]);
    }

    public HashCodeBuilder append(char c) {
        this.iTotal = (this.iTotal * this.iConstant) + c;
        return this;
    }

    public static int reflectionHashCode(Object obj, Collection<String> collection) {
        return reflectionHashCode(obj, ReflectionToStringBuilder.toNoNullStringArray(collection));
    }

    public HashCodeBuilder append(char[] cArr) {
        if (cArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (char c : cArr) {
            append(c);
        }
        return this;
    }

    public static int reflectionHashCode(Object obj, String... strArr) {
        return reflectionHashCode(17, 37, obj, false, null, strArr);
    }

    public HashCodeBuilder append(double d) {
        return append(Double.doubleToLongBits(d));
    }

    public HashCodeBuilder append(double[] dArr) {
        if (dArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (double d : dArr) {
            append(d);
        }
        return this;
    }

    public HashCodeBuilder append(float f) {
        this.iTotal = Float.floatToIntBits(f) + (this.iTotal * this.iConstant);
        return this;
    }

    public HashCodeBuilder append(float[] fArr) {
        if (fArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (float f : fArr) {
            append(f);
        }
        return this;
    }

    public HashCodeBuilder append(int i) {
        this.iTotal = (this.iTotal * this.iConstant) + i;
        return this;
    }

    public HashCodeBuilder append(int[] iArr) {
        if (iArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (int i : iArr) {
            append(i);
        }
        return this;
    }

    public HashCodeBuilder append(long j) {
        this.iTotal = (this.iTotal * this.iConstant) + ((int) (j ^ (j >> 32)));
        return this;
    }

    public HashCodeBuilder append(long[] jArr) {
        if (jArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (long j : jArr) {
            append(j);
        }
        return this;
    }

    public HashCodeBuilder append(boolean z) {
        this.iTotal = (this.iTotal * this.iConstant) + (!z ? 1 : 0);
        return this;
    }

    public HashCodeBuilder append(Object[] objArr) {
        if (objArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (Object obj : objArr) {
            append(obj);
        }
        return this;
    }

    public HashCodeBuilder append(short s) {
        this.iTotal = (this.iTotal * this.iConstant) + s;
        return this;
    }

    public HashCodeBuilder append(short[] sArr) {
        if (sArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (short s : sArr) {
            append(s);
        }
        return this;
    }
}
