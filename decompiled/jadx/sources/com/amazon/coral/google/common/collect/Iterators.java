package com.amazon.coral.google.common.collect;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.base.Function;
import com.amazon.coral.google.common.base.Optional;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.common.base.Predicate;
import com.amazon.coral.google.common.base.Predicates;
import com.amazon.coral.google.common.collect.Iterators;
import com.amazon.coral.google.common.primitives.Ints;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.annotation.CheckForNull;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public final class Iterators {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        static final UnmodifiableListIterator<Object> EMPTY = new ArrayItr(new Object[0], 0, 0, 0);
        private final T[] array;
        private final int offset;

        public ArrayItr(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.array = tArr;
            this.offset = i;
        }

        @Override // com.amazon.coral.google.common.collect.AbstractIndexedListIterator
        @ParametricNullness
        public T get(int i) {
            return this.array[this.offset + i];
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ConcatenatedIterator<T> implements Iterator<T> {
        private Iterator<? extends T> iterator = Iterators.emptyIterator();

        @CheckForNull
        private Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;

        @CheckForNull
        private Iterator<? extends T> toRemove;

        @CheckForNull
        private Iterator<? extends Iterator<? extends T>> topMetaIterator;

        public ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> it2) {
            this.topMetaIterator = (Iterator) Preconditions.checkNotNull(it2);
        }

        @CheckForNull
        private Iterator<? extends Iterator<? extends T>> getTopMetaIterator() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it2 = this.topMetaIterator;
                if (it2 != null && it2.hasNext()) {
                    return this.topMetaIterator;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.metaIterators;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.topMetaIterator = this.metaIterators.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.iterator)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> topMetaIterator = getTopMetaIterator();
                this.topMetaIterator = topMetaIterator;
                if (topMetaIterator == null) {
                    return false;
                }
                Iterator<? extends T> next = topMetaIterator.next();
                this.iterator = next;
                if (next instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) next;
                    this.iterator = concatenatedIterator.iterator;
                    if (this.metaIterators == null) {
                        this.metaIterators = new ArrayDeque();
                    }
                    this.metaIterators.addFirst(this.topMetaIterator);
                    if (concatenatedIterator.metaIterators != null) {
                        while (!concatenatedIterator.metaIterators.isEmpty()) {
                            this.metaIterators.addFirst(concatenatedIterator.metaIterators.removeLast());
                        }
                    }
                    this.topMetaIterator = concatenatedIterator.topMetaIterator;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            Iterator<? extends T> it2 = this.iterator;
            this.toRemove = it2;
            return it2.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it2 = this.toRemove;
            if (it2 == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("no calls to next() since the last call to remove()");
            } else {
                it2.remove();
                this.toRemove = null;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(false);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MergingIterator<T> extends UnmodifiableIterator<T> {
        final Queue<PeekingIterator<T>> queue;

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.queue = new PriorityQueue(2, new Comparator() { // from class: com.amazon.coral.google.common.collect.Iterators$MergingIterator$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$new$0;
                    lambda$new$0 = Iterators.MergingIterator.lambda$new$0(comparator, (PeekingIterator) obj, (PeekingIterator) obj2);
                    return lambda$new$0;
                }
            });
            for (Iterator<? extends T> it2 : iterable) {
                if (it2.hasNext()) {
                    this.queue.add(Iterators.peekingIterator(it2));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ int lambda$new$0(Comparator comparator, PeekingIterator peekingIterator, PeekingIterator peekingIterator2) {
            return comparator.compare(peekingIterator.peek(), peekingIterator2.peek());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            PeekingIterator<T> remove = this.queue.remove();
            T next = remove.next();
            if (remove.hasNext()) {
                this.queue.add(remove);
            }
            return next;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PeekingImpl<E> implements PeekingIterator<E> {
        private boolean hasPeeked;
        private final Iterator<? extends E> iterator;

        @CheckForNull
        private E peekedElement;

        public PeekingImpl(Iterator<? extends E> it2) {
            this.iterator = (Iterator) Preconditions.checkNotNull(it2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasPeeked || this.iterator.hasNext();
        }

        @Override // com.amazon.coral.google.common.collect.PeekingIterator, java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!this.hasPeeked) {
                return this.iterator.next();
            }
            E e = (E) NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
            this.hasPeeked = false;
            this.peekedElement = null;
            return e;
        }

        @Override // com.amazon.coral.google.common.collect.PeekingIterator
        @ParametricNullness
        public E peek() {
            if (!this.hasPeeked) {
                this.peekedElement = this.iterator.next();
                this.hasPeeked = true;
            }
            return (E) NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
        }

        @Override // com.amazon.coral.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.hasPeeked, "Can't remove after you've peeked at next");
            this.iterator.remove();
        }
    }

    private Iterators() {
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it2) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it2);
        boolean z = false;
        while (it2.hasNext()) {
            z |= collection.add(it2.next());
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static int advance(Iterator<?> it2, int i) {
        Preconditions.checkNotNull(it2);
        int i2 = 0;
        Preconditions.checkArgument(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it2.hasNext()) {
            it2.next();
            i2++;
        }
        return i2;
    }

    public static <T> boolean all(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (it2.hasNext()) {
            if (!predicate.apply(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it2, Predicate<? super T> predicate) {
        return indexOf(it2, predicate) != -1;
    }

    public static <T> Enumeration<T> asEnumeration(final Iterator<T> it2) {
        Preconditions.checkNotNull(it2);
        return new Enumeration<T>() { // from class: com.amazon.coral.google.common.collect.Iterators.11
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it2.hasNext();
            }

            @Override // java.util.Enumeration
            @ParametricNullness
            public T nextElement() {
                return (T) it2.next();
            }
        };
    }

    public static <T> ListIterator<T> cast(Iterator<T> it2) {
        return (ListIterator) it2;
    }

    public static void checkNonnegative(int i) {
        if (i >= 0) {
            return;
        }
        Iterators$$ExternalSyntheticBUOutline0.m(43, i, "position (", ") must not be negative");
    }

    public static void clear(Iterator<?> it2) {
        Preconditions.checkNotNull(it2);
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4, Iterator<? extends T> it5) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        Preconditions.checkNotNull(it4);
        Preconditions.checkNotNull(it5);
        return concat(consumingForArray(it2, it3, it4, it5));
    }

    public static <T> Iterator<T> concatNoDefensiveCopy(Iterator<? extends T>... itArr) {
        for (Iterator it2 : (Iterator[]) Preconditions.checkNotNull(itArr)) {
            Preconditions.checkNotNull(it2);
        }
        return concat(consumingForArray(itArr));
    }

    private static <I extends Iterator<?>> Iterator<I> consumingForArray(final I... iArr) {
        return new UnmodifiableIterator<I>() { // from class: com.amazon.coral.google.common.collect.Iterators.3
            int index = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < iArr.length;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TI; */
            @Override // java.util.Iterator
            public Iterator next() {
                if (!hasNext()) {
                    Single$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                Iterator it2 = iArr[this.index];
                Objects.requireNonNull(it2);
                Iterator it3 = it2;
                Iterator[] itArr = iArr;
                int i = this.index;
                itArr[i] = null;
                this.index = i + 1;
                return it3;
            }
        };
    }

    public static <T> Iterator<T> consumingIterator(final Iterator<T> it2) {
        Preconditions.checkNotNull(it2);
        return new UnmodifiableIterator<T>() { // from class: com.amazon.coral.google.common.collect.Iterators.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                T t = (T) it2.next();
                it2.remove();
                return t;
            }

            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    public static boolean contains(Iterator<?> it2, @CheckForNull Object obj) {
        if (obj == null) {
            while (it2.hasNext()) {
                if (it2.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it2.hasNext()) {
            if (obj.equals(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterator<T>() { // from class: com.amazon.coral.google.common.collect.Iterators.2
            Iterator<T> iterator = Iterators.emptyModifiableIterator();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext() || iterable.iterator().hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!this.iterator.hasNext()) {
                    Iterator<T> it2 = iterable.iterator();
                    this.iterator = it2;
                    if (!it2.hasNext()) {
                        Single$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                }
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.iterator.remove();
            }
        };
    }

    public static boolean elementsEqual(Iterator<?> it2, Iterator<?> it3) {
        while (it2.hasNext()) {
            if (!it3.hasNext() || !com.amazon.coral.google.common.base.Objects.equal(it2.next(), it3.next())) {
                return false;
            }
        }
        return !it3.hasNext();
    }

    public static <T> UnmodifiableIterator<T> emptyIterator() {
        return emptyListIterator();
    }

    public static <T> UnmodifiableListIterator<T> emptyListIterator() {
        return (UnmodifiableListIterator<T>) ArrayItr.EMPTY;
    }

    public static <T> Iterator<T> emptyModifiableIterator() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> UnmodifiableIterator<T> filter(final Iterator<T> it2, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(predicate);
        return new AbstractIterator<T>() { // from class: com.amazon.coral.google.common.collect.Iterators.5
            @Override // com.amazon.coral.google.common.collect.AbstractIterator
            @CheckForNull
            public T computeNext() {
                while (it2.hasNext()) {
                    T t = (T) it2.next();
                    if (predicate.apply(t)) {
                        return t;
                    }
                }
                return endOfData();
            }
        };
    }

    @ParametricNullness
    public static <T> T find(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(predicate);
        while (it2.hasNext()) {
            T next = it2.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static <T> UnmodifiableListIterator<T> forArray(T[] tArr, int i, int i2, int i3) {
        Preconditions.checkArgument(i2 >= 0);
        Preconditions.checkPositionIndexes(i, i + i2, tArr.length);
        Preconditions.checkPositionIndex(i3, i2);
        return i2 == 0 ? emptyListIterator() : new ArrayItr(tArr, i, i2, i3);
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(final Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new UnmodifiableIterator<T>() { // from class: com.amazon.coral.google.common.collect.Iterators.10
            @Override // java.util.Iterator
            public boolean hasNext() {
                return enumeration.hasMoreElements();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) enumeration.nextElement();
            }
        };
    }

    public static int frequency(Iterator<?> it2, @CheckForNull Object obj) {
        int i = 0;
        while (contains(it2, obj)) {
            i++;
        }
        return i;
    }

    @ParametricNullness
    public static <T> T get(Iterator<T> it2, int i) {
        checkNonnegative(i);
        int advance = advance(it2, i);
        if (it2.hasNext()) {
            return it2.next();
        }
        StringBuilder sb = new StringBuilder(91);
        sb.append("position (");
        sb.append(i);
        sb.append(") must be less than the number of elements that remained (");
        sb.append(advance);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<? extends T> it2, @ParametricNullness T t) {
        return it2.hasNext() ? (T) getLast(it2) : t;
    }

    @ParametricNullness
    public static <T> T getNext(Iterator<? extends T> it2, @ParametricNullness T t) {
        return it2.hasNext() ? it2.next() : t;
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<T> it2) {
        T next = it2.next();
        if (!it2.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it2.hasNext(); i++) {
            sb.append(", ");
            sb.append(it2.next());
        }
        if (it2.hasNext()) {
            sb.append(", ...");
        }
        sb.append(Typography.greater);
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> int indexOf(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (it2.hasNext()) {
            if (predicate.apply(it2.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> Iterator<T> limit(final Iterator<T> it2, final int i) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkArgument(i >= 0, "limit is negative");
        return new Iterator<T>() { // from class: com.amazon.coral.google.common.collect.Iterators.7
            private int count;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.count < i && it2.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (hasNext()) {
                    this.count++;
                    return (T) it2.next();
                }
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }

            @Override // java.util.Iterator
            public void remove() {
                it2.remove();
            }
        };
    }

    @Beta
    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterable, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new MergingIterator(iterable, comparator);
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it2, int i) {
        return partitionImpl(it2, i, true);
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it2, int i) {
        return partitionImpl(it2, i, false);
    }

    private static <T> UnmodifiableIterator<List<T>> partitionImpl(final Iterator<T> it2, final int i, final boolean z) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkArgument(i > 0);
        return new UnmodifiableIterator<List<T>>() { // from class: com.amazon.coral.google.common.collect.Iterators.4
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext();
            }

            @Override // java.util.Iterator
            public List<T> next() {
                if (!hasNext()) {
                    Single$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                Object[] objArr = new Object[i];
                int i2 = 0;
                while (i2 < i && it2.hasNext()) {
                    objArr[i2] = it2.next();
                    i2++;
                }
                for (int i3 = i2; i3 < i; i3++) {
                    objArr[i3] = null;
                }
                List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                return (z || i2 == i) ? unmodifiableList : unmodifiableList.subList(0, i2);
            }
        };
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it2) {
        return it2 instanceof PeekingImpl ? (PeekingImpl) it2 : new PeekingImpl(it2);
    }

    @CheckForNull
    public static <T> T pollNext(Iterator<T> it2) {
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        it2.remove();
        return next;
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterator<?> it2, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (it2.hasNext()) {
            if (predicate.apply(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterator<?> it2, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it2.hasNext()) {
            if (!collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@ParametricNullness final T t) {
        return new UnmodifiableIterator<T>() { // from class: com.amazon.coral.google.common.collect.Iterators.9
            boolean done;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.done;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (this.done) {
                    Single$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                this.done = true;
                return (T) t;
            }
        };
    }

    public static int size(Iterator<?> it2) {
        long j = 0;
        while (it2.hasNext()) {
            it2.next();
            j++;
        }
        return Ints.saturatedCast(j);
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterator<? extends T> it2, Class<T> cls) {
        return (T[]) Iterables.toArray(Lists.newArrayList(it2), cls);
    }

    public static String toString(Iterator<?> it2) {
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
        boolean z = true;
        while (it2.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it2.next());
            z = false;
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it2, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new TransformedIterator<F, T>(it2) { // from class: com.amazon.coral.google.common.collect.Iterators.6
            @Override // com.amazon.coral.google.common.collect.TransformedIterator
            @ParametricNullness
            public T transform(@ParametricNullness F f) {
                return (T) function.apply(f);
            }
        };
    }

    public static <T> Optional<T> tryFind(Iterator<T> it2, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(predicate);
        while (it2.hasNext()) {
            T next = it2.next();
            if (predicate.apply(next)) {
                return Optional.of(next);
            }
        }
        return Optional.absent();
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(final Iterator<? extends T> it2) {
        Preconditions.checkNotNull(it2);
        return it2 instanceof UnmodifiableIterator ? (UnmodifiableIterator) it2 : new UnmodifiableIterator<T>() { // from class: com.amazon.coral.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) it2.next();
            }
        };
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    @GwtIncompatible
    public static <T> UnmodifiableIterator<T> filter(Iterator<?> it2, Class<T> cls) {
        return filter(it2, Predicates.instanceOf(cls));
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<T> it2) {
        T next;
        do {
            next = it2.next();
        } while (it2.hasNext());
        return next;
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> peekingIterator) {
        return (PeekingIterator) Preconditions.checkNotNull(peekingIterator);
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> unmodifiableIterator) {
        return (UnmodifiableIterator) Preconditions.checkNotNull(unmodifiableIterator);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @CheckForNull
    public static <T> T find(Iterator<? extends T> it2, Predicate<? super T> predicate, @CheckForNull T t) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(predicate);
        while (it2.hasNext()) {
            T next = it2.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t;
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... tArr) {
        return forArray(tArr, 0, tArr.length, 0);
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        Preconditions.checkNotNull(it4);
        return concat(consumingForArray(it2, it3, it4));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it2, Iterator<? extends T> it3) {
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        return concat(consumingForArray(it2, it3));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return concatNoDefensiveCopy((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it2) {
        return new ConcatenatedIterator(it2);
    }

    @ParametricNullness
    public static <T> T get(Iterator<? extends T> it2, int i, @ParametricNullness T t) {
        checkNonnegative(i);
        advance(it2, i);
        return (T) getNext(it2, t);
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<? extends T> it2, @ParametricNullness T t) {
        return it2.hasNext() ? (T) getOnlyElement(it2) : t;
    }
}
