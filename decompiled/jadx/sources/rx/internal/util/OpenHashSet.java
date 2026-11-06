package rx.internal.util;

import a.utilszZm;
import java.util.Arrays;
import rx.functions.Action1;
import rx.internal.util.unsafe.Pow2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class OpenHashSet<T> {
    private static final int INT_PHI = -1640531527;
    T[] keys;
    final float loadFactor;
    int mask;
    int maxSize;
    int size;

    public OpenHashSet(int i, float f) {
        this.loadFactor = f;
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.mask = roundToPowerOfTwo - 1;
        this.maxSize = (int) (f * roundToPowerOfTwo);
        this.keys = (T[]) new Object[roundToPowerOfTwo];
    }

    public static int mix(int i) {
        int i2 = i * INT_PHI;
        return i2 ^ (i2 >>> 16);
    }

    public boolean add(T t) {
        T t2;
        T[] tArr = this.keys;
        int i = this.mask;
        int mix = mix(t.hashCode()) & i;
        T t3 = tArr[mix];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                mix = (mix + 1) & i;
                t2 = tArr[mix];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[mix] = t;
        int i2 = this.size + 1;
        this.size = i2;
        if (i2 >= this.maxSize) {
            rehash();
        }
        return true;
    }

    public void clear(Action1<? super T> action1) {
        if (this.size == 0) {
            return;
        }
        T[] tArr = this.keys;
        for (utilszZm utilszzm : tArr) {
            if (utilszzm != null) {
                action1.mo8903call(utilszzm);
            }
        }
        Arrays.fill(tArr, (Object) null);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void rehash() {
        T t;
        T[] tArr = this.keys;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.size;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                this.mask = i2;
                this.maxSize = (int) (i * this.loadFactor);
                this.keys = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int mix = mix(t.hashCode()) & i2;
            if (tArr2[mix] != null) {
                do {
                    mix = (mix + 1) & i2;
                } while (tArr2[mix] != null);
            }
            tArr2[mix] = tArr[length];
            i3 = i4;
        }
    }

    public boolean remove(T t) {
        T t2;
        T[] tArr = this.keys;
        int i = this.mask;
        int mix = mix(t.hashCode()) & i;
        T t3 = tArr[mix];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return removeEntry(mix, tArr, i);
        }
        do {
            mix = (mix + 1) & i;
            t2 = tArr[mix];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return removeEntry(mix, tArr, i);
    }

    public boolean removeEntry(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.size--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int mix = mix(t.hashCode()) & i2;
                if (i > i3) {
                    if (i >= mix && mix > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < mix && mix <= i3) {
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public void terminate() {
        this.size = 0;
        this.keys = (T[]) new Object[0];
    }

    public T[] values() {
        return this.keys;
    }

    public OpenHashSet(int i) {
        this(i, 0.75f);
    }

    public OpenHashSet() {
        this(16, 0.75f);
    }
}
