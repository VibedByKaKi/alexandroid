package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Equator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class DefaultEquator<T> implements Equator<T>, Serializable {
    public static final int HASHCODE_NULL = -1;
    public static final DefaultEquator INSTANCE = new DefaultEquator();
    private static final long serialVersionUID = 825802648423525485L;

    private DefaultEquator() {
    }

    public static <T> DefaultEquator<T> defaultEquator() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.apache.commons.collections4.Equator
    public boolean equate(T t, T t2) {
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    @Override // org.apache.commons.collections4.Equator
    public int hash(T t) {
        if (t == null) {
            return -1;
        }
        return t.hashCode();
    }
}
