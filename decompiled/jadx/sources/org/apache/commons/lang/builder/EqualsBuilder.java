package org.apache.commons.lang.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import org.apache.commons.lang.ArrayUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class EqualsBuilder {
    private boolean isEquals = true;

    private static void reflectionAppend(Object obj, Object obj2, Class cls, EqualsBuilder equalsBuilder, boolean z, String[] strArr) {
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i = 0; i < declaredFields.length && equalsBuilder.isEquals; i++) {
            Field field = declaredFields[i];
            if (!ArrayUtils.contains(strArr, field.getName()) && field.getName().indexOf(36) == -1 && ((z || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                try {
                    equalsBuilder.append(field.get(obj), field.get(obj2));
                } catch (IllegalAccessException unused) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r3.isInstance(r7) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0029, code lost:
    
        if (r2.isInstance(r8) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean reflectionEquals(java.lang.Object r7, java.lang.Object r8, boolean r9, java.lang.Class r10, java.lang.String[] r11) {
        /*
            if (r7 != r8) goto L4
            r0 = 1
            return r0
        L4:
            r6 = 0
            if (r7 == 0) goto L52
            if (r8 != 0) goto La
            goto L52
        La:
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            boolean r4 = r2.isInstance(r8)
            if (r4 == 0) goto L1f
            boolean r4 = r3.isInstance(r7)
            if (r4 != 0) goto L2d
            goto L2c
        L1f:
            boolean r4 = r3.isInstance(r7)
            if (r4 == 0) goto L52
            boolean r4 = r2.isInstance(r8)
            if (r4 != 0) goto L2c
            goto L2d
        L2c:
            r2 = r3
        L2d:
            org.apache.commons.lang.builder.EqualsBuilder r3 = new org.apache.commons.lang.builder.EqualsBuilder
            r3.<init>()
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r11
            reflectionAppend(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L52
        L39:
            java.lang.Class r0 = r2.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L52
            if (r0 == 0) goto L4d
            if (r2 == r10) goto L4d
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L52
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r11
            reflectionAppend(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L52
            goto L39
        L4d:
            boolean r0 = r3.isEquals()
            return r0
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean, java.lang.Class, java.lang.String[]):boolean");
    }

    public EqualsBuilder append(Object obj, Object obj2) {
        if (!this.isEquals || obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            setEquals(false);
            return this;
        }
        if (!obj.getClass().isArray()) {
            this.isEquals = obj.equals(obj2);
            return this;
        }
        if (obj.getClass() != obj2.getClass()) {
            setEquals(false);
            return this;
        }
        if (obj instanceof long[]) {
            append((long[]) obj, (long[]) obj2);
            return this;
        }
        if (obj instanceof int[]) {
            append((int[]) obj, (int[]) obj2);
            return this;
        }
        if (obj instanceof short[]) {
            append((short[]) obj, (short[]) obj2);
            return this;
        }
        if (obj instanceof char[]) {
            append((char[]) obj, (char[]) obj2);
            return this;
        }
        if (obj instanceof byte[]) {
            append((byte[]) obj, (byte[]) obj2);
            return this;
        }
        if (obj instanceof double[]) {
            append((double[]) obj, (double[]) obj2);
            return this;
        }
        if (obj instanceof float[]) {
            append((float[]) obj, (float[]) obj2);
            return this;
        }
        if (obj instanceof boolean[]) {
            append((boolean[]) obj, (boolean[]) obj2);
            return this;
        }
        append((Object[]) obj, (Object[]) obj2);
        return this;
    }

    public EqualsBuilder appendSuper(boolean z) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = z;
        return this;
    }

    public boolean isEquals() {
        return this.isEquals;
    }

    public void reset() {
        this.isEquals = true;
    }

    public void setEquals(boolean z) {
        this.isEquals = z;
    }

    public static boolean reflectionEquals(Object obj, Object obj2, Collection collection) {
        return reflectionEquals(obj, obj2, ReflectionToStringBuilder.toNoNullStringArray(collection));
    }

    public static boolean reflectionEquals(Object obj, Object obj2, String[] strArr) {
        return reflectionEquals(obj, obj2, false, null, strArr);
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z) {
        return reflectionEquals(obj, obj2, z, null, null);
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z, Class cls) {
        return reflectionEquals(obj, obj2, z, cls, null);
    }

    public static boolean reflectionEquals(Object obj, Object obj2) {
        return reflectionEquals(obj, obj2, false, null, null);
    }

    public EqualsBuilder append(long j, long j2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = j == j2;
        return this;
    }

    public EqualsBuilder append(int i, int i2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = i == i2;
        return this;
    }

    public EqualsBuilder append(short s, short s2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = s == s2;
        return this;
    }

    public EqualsBuilder append(char c, char c2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = c == c2;
        return this;
    }

    public EqualsBuilder append(byte b, byte b2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = b == b2;
        return this;
    }

    public EqualsBuilder append(double d, double d2) {
        return !this.isEquals ? this : append(Double.doubleToLongBits(d), Double.doubleToLongBits(d2));
    }

    public EqualsBuilder append(float f, float f2) {
        return !this.isEquals ? this : append(Float.floatToIntBits(f), Float.floatToIntBits(f2));
    }

    public EqualsBuilder append(boolean z, boolean z2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = z == z2;
        return this;
    }

    public EqualsBuilder append(Object[] objArr, Object[] objArr2) {
        if (this.isEquals && objArr != objArr2) {
            if (objArr != null && objArr2 != null) {
                if (objArr.length != objArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i = 0; i < objArr.length && this.isEquals; i++) {
                    append(objArr[i], objArr2[i]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(long[] jArr, long[] jArr2) {
        if (this.isEquals && jArr != jArr2) {
            if (jArr != null && jArr2 != null) {
                if (jArr.length != jArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i = 0; i < jArr.length && this.isEquals; i++) {
                    append(jArr[i], jArr2[i]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(int[] iArr, int[] iArr2) {
        if (this.isEquals && iArr != iArr2) {
            if (iArr != null && iArr2 != null) {
                if (iArr.length != iArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i = 0; i < iArr.length && this.isEquals; i++) {
                    append(iArr[i], iArr2[i]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(short[] sArr, short[] sArr2) {
        if (this.isEquals && sArr != sArr2) {
            if (sArr != null && sArr2 != null) {
                if (sArr.length != sArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i = 0; i < sArr.length && this.isEquals; i++) {
                    append(sArr[i], sArr2[i]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(char[] cArr, char[] cArr2) {
        if (this.isEquals && cArr != cArr2) {
            if (cArr != null && cArr2 != null) {
                if (cArr.length != cArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i = 0; i < cArr.length && this.isEquals; i++) {
                    append(cArr[i], cArr2[i]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(byte[] bArr, byte[] bArr2) {
        if (this.isEquals && bArr != bArr2) {
            if (bArr != null && bArr2 != null) {
                if (bArr.length != bArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i = 0; i < bArr.length && this.isEquals; i++) {
                    append(bArr[i], bArr2[i]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(double[] dArr, double[] dArr2) {
        if (this.isEquals && dArr != dArr2) {
            if (dArr != null && dArr2 != null) {
                if (dArr.length != dArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i = 0; i < dArr.length && this.isEquals; i++) {
                    append(dArr[i], dArr2[i]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(float[] fArr, float[] fArr2) {
        if (this.isEquals && fArr != fArr2) {
            if (fArr != null && fArr2 != null) {
                if (fArr.length != fArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i = 0; i < fArr.length && this.isEquals; i++) {
                    append(fArr[i], fArr2[i]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(boolean[] zArr, boolean[] zArr2) {
        if (this.isEquals && zArr != zArr2) {
            if (zArr != null && zArr2 != null) {
                if (zArr.length != zArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i = 0; i < zArr.length && this.isEquals; i++) {
                    append(zArr[i], zArr2[i]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }
}
