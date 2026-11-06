package org.openjdk.tools.javac.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class IntHashTable {
    private static final int DEFAULT_INITIAL_SIZE = 64;
    private static final Object DELETED = new Object();
    protected int[] ints;
    protected int mask;
    protected int num_bindings;
    protected Object[] objs;

    public IntHashTable(int i) {
        int i2 = 4;
        while (true) {
            int i3 = 1 << i2;
            if (i <= i3) {
                this.objs = new Object[i3];
                this.ints = new int[i3];
                this.mask = i3 - 1;
                return;
            }
            i2++;
        }
    }

    public void clear() {
        int length = this.objs.length;
        while (true) {
            length--;
            if (length < 0) {
                this.num_bindings = 0;
                return;
            }
            this.objs[length] = null;
        }
    }

    public int getFromIndex(int i) {
        Object obj = this.objs[i];
        if (obj == null || obj == DELETED) {
            return -1;
        }
        return this.ints[i];
    }

    public int hash(Object obj) {
        return System.identityHashCode(obj);
    }

    public int lookup(Object obj, int i) {
        int i2 = (i >>> 15) ^ i;
        int i3 = (i ^ (i << 6)) | 1;
        int i4 = i2 & this.mask;
        int i5 = -1;
        while (true) {
            Object obj2 = this.objs[i4];
            if (obj2 == obj) {
                break;
            }
            if (obj2 != null) {
                if (obj2 == DELETED && i5 < 0) {
                    i5 = i4;
                }
                i4 = (i4 + i3) & this.mask;
            } else if (i5 >= 0) {
                return i5;
            }
        }
        return i4;
    }

    public int putAtIndex(Object obj, int i, int i2) {
        Object[] objArr = this.objs;
        Object obj2 = objArr[i2];
        if (obj2 != null && obj2 != DELETED) {
            int[] iArr = this.ints;
            int i3 = iArr[i2];
            iArr[i2] = i;
            return i3;
        }
        objArr[i2] = obj;
        this.ints[i2] = i;
        if (obj2 != DELETED) {
            this.num_bindings++;
        }
        if (this.num_bindings * 3 < objArr.length * 2) {
            return -1;
        }
        rehash();
        return -1;
    }

    public void rehash() {
        Object[] objArr = this.objs;
        int[] iArr = this.ints;
        int length = objArr.length << 1;
        this.objs = new Object[length];
        this.ints = new int[length];
        this.mask = length - 1;
        this.num_bindings = 0;
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            Object obj = objArr[length2];
            if (obj != null && obj != DELETED) {
                putAtIndex(obj, iArr[length2], lookup(obj, hash(obj)));
            }
        }
    }

    public int remove(Object obj) {
        Object obj2;
        int lookup = lookup(obj);
        Object[] objArr = this.objs;
        Object obj3 = objArr[lookup];
        if (obj3 == null || obj3 == (obj2 = DELETED)) {
            return -1;
        }
        objArr[lookup] = obj2;
        return this.ints[lookup];
    }

    public IntHashTable() {
        this.objs = new Object[64];
        this.ints = new int[64];
        this.mask = 63;
    }

    public int lookup(Object obj) {
        return lookup(obj, hash(obj));
    }
}
