package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    @CheckForNull
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // autovalue.shaded.com.google.common.collect.ForwardingSet, autovalue.shaded.com.google.common.collect.ForwardingCollection, autovalue.shaded.com.google.common.collect.ForwardingObject
    public abstract SortedSet<E> delegate();

    @Override // java.util.SortedSet
    @ParametricNullness
    public E first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(@ParametricNullness E e) {
        return delegate().headSet(e);
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public E last() {
        return delegate().last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.ForwardingCollection
    public boolean standardContains(@CheckForNull Object obj) {
        return ForwardingSortedMap.unsafeCompare(comparator(), tailSet(obj).first(), obj) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.ForwardingCollection
    public boolean standardRemove(@CheckForNull Object obj) {
        try {
            Iterator<E> it2 = tailSet(obj).iterator();
            if (it2.hasNext()) {
                if (ForwardingSortedMap.unsafeCompare(comparator(), it2.next(), obj) == 0) {
                    it2.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public SortedSet<E> standardSubSet(@ParametricNullness E e, @ParametricNullness E e2) {
        return tailSet(e).headSet(e2);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
        return delegate().subSet(e, e2);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(@ParametricNullness E e) {
        return delegate().tailSet(e);
    }
}
