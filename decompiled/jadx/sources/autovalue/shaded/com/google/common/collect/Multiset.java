package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.base.Preconditions;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import autovalue.shaded.com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
public interface Multiset<E> extends Collection<E> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Entry<E> {
        boolean equals(@CheckForNull Object obj);

        int getCount();

        @ParametricNullness
        E getElement();

        int hashCode();

        String toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$forEach$1(Consumer consumer, Entry entry) {
        Object element = entry.getElement();
        int count = entry.getCount();
        for (int i = 0; i < count; i++) {
            consumer.accept(element);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$forEachEntry$0(ObjIntConsumer objIntConsumer, Entry entry) {
        objIntConsumer.accept(entry.getElement(), entry.getCount());
    }

    @CanIgnoreReturnValue
    int add(@ParametricNullness E e, int i);

    @CanIgnoreReturnValue
    boolean add(@ParametricNullness E e);

    boolean contains(@CheckForNull Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(@CheckForNull @CompatibleWith("E") Object obj);

    Set<E> elementSet();

    Set<Entry<E>> entrySet();

    boolean equals(@CheckForNull Object obj);

    default void forEach(Consumer<? super E> consumer) {
        Preconditions.checkNotNull(consumer);
        entrySet().forEach(new Multiset$$ExternalSyntheticLambda1(consumer, 0));
    }

    default void forEachEntry(ObjIntConsumer<? super E> objIntConsumer) {
        Preconditions.checkNotNull(objIntConsumer);
        entrySet().forEach(new Streams$$ExternalSyntheticLambda13(objIntConsumer, 4));
    }

    int hashCode();

    Iterator<E> iterator();

    @CanIgnoreReturnValue
    int remove(@CheckForNull @CompatibleWith("E") Object obj, int i);

    @CanIgnoreReturnValue
    boolean remove(@CheckForNull Object obj);

    @CanIgnoreReturnValue
    boolean removeAll(Collection<?> collection);

    @CanIgnoreReturnValue
    boolean retainAll(Collection<?> collection);

    @CanIgnoreReturnValue
    int setCount(@ParametricNullness E e, int i);

    @CanIgnoreReturnValue
    boolean setCount(@ParametricNullness E e, int i, int i2);

    int size();

    default Spliterator<E> spliterator() {
        return Multisets.spliteratorImpl(this);
    }

    String toString();
}
