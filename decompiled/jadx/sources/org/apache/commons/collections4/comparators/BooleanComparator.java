package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class BooleanComparator implements Comparator<Boolean>, Serializable {
    private static final long serialVersionUID = 1830042991606340609L;
    private boolean trueFirst;
    private static final BooleanComparator TRUE_FIRST = new BooleanComparator(true);
    private static final BooleanComparator FALSE_FIRST = new BooleanComparator(false);

    public BooleanComparator(boolean z) {
        this.trueFirst = z;
    }

    public static BooleanComparator booleanComparator(boolean z) {
        return z ? TRUE_FIRST : FALSE_FIRST;
    }

    public static BooleanComparator getFalseFirstComparator() {
        return FALSE_FIRST;
    }

    public static BooleanComparator getTrueFirstComparator() {
        return TRUE_FIRST;
    }

    @Override // java.util.Comparator
    public int compare(Boolean bool, Boolean bool2) {
        boolean booleanValue = bool.booleanValue();
        if (bool2.booleanValue() ^ booleanValue) {
            return this.trueFirst ^ booleanValue ? 1 : -1;
        }
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BooleanComparator) && this.trueFirst == ((BooleanComparator) obj).trueFirst;
        }
        return true;
    }

    public int hashCode() {
        return this.trueFirst ? -478003966 : 478003966;
    }

    public boolean sortsTrueFirst() {
        return this.trueFirst;
    }

    public BooleanComparator() {
        this(false);
    }
}
