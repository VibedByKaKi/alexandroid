package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import autovalue.shaded.com.google.common.annotations.J2ktIncompatible;
import java.util.function.Consumer;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes15.dex */
class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    private final ImmutableCollection<E> delegate;
    private final ImmutableList<? extends E> delegateList;

    public RegularImmutableAsList(ImmutableCollection<E> immutableCollection, ImmutableList<? extends E> immutableList) {
        this.delegate = immutableCollection;
        this.delegateList = immutableList;
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableList, autovalue.shaded.com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int copyIntoArray(Object[] objArr, int i) {
        return this.delegateList.copyIntoArray(objArr, i);
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableAsList
    public ImmutableCollection<E> delegateCollection() {
        return this.delegate;
    }

    public ImmutableList<? extends E> delegateList() {
        return this.delegateList;
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableList, java.lang.Iterable
    @GwtIncompatible
    public void forEach(Consumer<? super E> consumer) {
        this.delegateList.forEach(consumer);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.delegateList.get(i);
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
    @CheckForNull
    public Object[] internalArray() {
        return this.delegateList.internalArray();
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.delegateList.internalArrayEnd();
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return this.delegateList.internalArrayStart();
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableList, java.util.List
    public UnmodifiableListIterator<E> listIterator(int i) {
        return this.delegateList.listIterator(i);
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableAsList, autovalue.shaded.com.google.common.collect.ImmutableList, autovalue.shaded.com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    @J2ktIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }

    public RegularImmutableAsList(ImmutableCollection<E> immutableCollection, Object[] objArr) {
        this(immutableCollection, ImmutableList.asImmutableList(objArr));
    }
}
