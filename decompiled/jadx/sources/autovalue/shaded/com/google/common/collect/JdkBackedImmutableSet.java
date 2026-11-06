package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import autovalue.shaded.com.google.common.annotations.J2ktIncompatible;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible(serializable = true)
/* loaded from: classes15.dex */
final class JdkBackedImmutableSet<E> extends IndexedImmutableSet<E> {
    private final Set<?> delegate;
    private final ImmutableList<E> delegateList;

    public JdkBackedImmutableSet(Set<?> set, ImmutableList<E> immutableList) {
        this.delegate = set;
        this.delegateList = immutableList;
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.delegate.contains(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.IndexedImmutableSet
    public E get(int i) {
        return this.delegateList.get(i);
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.delegateList.size();
    }

    @Override // autovalue.shaded.com.google.common.collect.IndexedImmutableSet, autovalue.shaded.com.google.common.collect.ImmutableSet.CachingAsList, autovalue.shaded.com.google.common.collect.ImmutableSet, autovalue.shaded.com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    @J2ktIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}
