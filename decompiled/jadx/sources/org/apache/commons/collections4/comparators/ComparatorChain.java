package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ComparatorChain<E> implements Comparator<E>, Serializable {
    private static final long serialVersionUID = -721644942746081630L;
    private final List<Comparator<E>> comparatorChain;
    private boolean isLocked;
    private BitSet orderingBits;

    public ComparatorChain(Comparator<E> comparator, boolean z) {
        this.orderingBits = null;
        this.isLocked = false;
        ArrayList arrayList = new ArrayList(1);
        this.comparatorChain = arrayList;
        arrayList.add(comparator);
        BitSet bitSet = new BitSet(1);
        this.orderingBits = bitSet;
        if (z) {
            bitSet.set(0);
        }
    }

    private void checkChainIntegrity() {
        if (this.comparatorChain.size() != 0) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("ComparatorChains must contain at least one Comparator");
    }

    private void checkLocked() {
        if (!this.isLocked) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("Comparator ordering cannot be changed after the first comparison is performed");
    }

    public void addComparator(Comparator<E> comparator, boolean z) {
        checkLocked();
        this.comparatorChain.add(comparator);
        if (z) {
            this.orderingBits.set(this.comparatorChain.size() - 1);
        }
    }

    @Override // java.util.Comparator
    public int compare(E e, E e2) throws UnsupportedOperationException {
        if (!this.isLocked) {
            checkChainIntegrity();
            this.isLocked = true;
        }
        Iterator<Comparator<E>> it2 = this.comparatorChain.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int compare = it2.next().compare(e, e2);
            if (compare != 0) {
                return this.orderingBits.get(i) ? compare > 0 ? -1 : 1 : compare;
            }
            i++;
        }
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            ComparatorChain comparatorChain = (ComparatorChain) obj;
            BitSet bitSet = this.orderingBits;
            BitSet bitSet2 = comparatorChain.orderingBits;
            if (bitSet != null ? bitSet.equals(bitSet2) : bitSet2 == null) {
                List<Comparator<E>> list = this.comparatorChain;
                List<Comparator<E>> list2 = comparatorChain.comparatorChain;
                if (list != null ? list.equals(list2) : list2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<Comparator<E>> list = this.comparatorChain;
        int hashCode = list != null ? list.hashCode() : 0;
        BitSet bitSet = this.orderingBits;
        return bitSet != null ? bitSet.hashCode() ^ hashCode : hashCode;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public void setComparator(int i, Comparator<E> comparator, boolean z) {
        checkLocked();
        this.comparatorChain.set(i, comparator);
        BitSet bitSet = this.orderingBits;
        if (z) {
            bitSet.set(i);
        } else {
            bitSet.clear(i);
        }
    }

    public void setForwardSort(int i) {
        checkLocked();
        this.orderingBits.clear(i);
    }

    public void setReverseSort(int i) {
        checkLocked();
        this.orderingBits.set(i);
    }

    public int size() {
        return this.comparatorChain.size();
    }

    public void setComparator(int i, Comparator<E> comparator) throws IndexOutOfBoundsException {
        setComparator(i, comparator, false);
    }

    public void addComparator(Comparator<E> comparator) {
        addComparator(comparator, false);
    }

    public ComparatorChain(Comparator<E> comparator) {
        this((Comparator) comparator, false);
    }

    public ComparatorChain() {
        this(new ArrayList(), new BitSet());
    }

    public ComparatorChain(List<Comparator<E>> list) {
        this(list, new BitSet(list.size()));
    }

    public ComparatorChain(List<Comparator<E>> list, BitSet bitSet) {
        this.isLocked = false;
        this.comparatorChain = list;
        this.orderingBits = bitSet;
    }
}
