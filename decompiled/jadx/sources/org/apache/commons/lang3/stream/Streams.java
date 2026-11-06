package org.apache.commons.lang3.stream;

import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.matter.commissioner.WireTypes$$ExternalSyntheticLambda2;
import com.google.common.math.Stats$$ExternalSyntheticLambda6;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda1;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11;
import org.apache.commons.lang3.RandomUtils$$ExternalSyntheticLambda0;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableFunction;
import org.apache.commons.lang3.function.FailablePredicate;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Streams {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ArrayCollector<E> implements Collector<E, List<E>, E[]> {
        private static final Set<Collector.Characteristics> characteristics = Collections.EMPTY_SET;
        private final Class<E> elementType;

        public ArrayCollector(Class<E> cls) {
            Objects.requireNonNull(cls, JsonFields.ELEMENT_TYPE);
            this.elementType = cls;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ List lambda$combiner$0(List list, List list2) {
            list.addAll(list2);
            return list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object[] lambda$finisher$0(List list) {
            return list.toArray(ArrayUtils.newInstance(this.elementType, list.size()));
        }

        @Override // java.util.stream.Collector
        public BiConsumer<List<E>, E> accumulator() {
            return new ClassUtils$$ExternalSyntheticLambda1(1);
        }

        @Override // java.util.stream.Collector
        public Set<Collector.Characteristics> characteristics() {
            return characteristics;
        }

        @Override // java.util.stream.Collector
        public BinaryOperator<List<E>> combiner() {
            return new Stats$$ExternalSyntheticLambda6(6);
        }

        @Override // java.util.stream.Collector
        public Function<List<E>, E[]> finisher() {
            return new Functions$$ExternalSyntheticLambda11(this, 25);
        }

        @Override // java.util.stream.Collector
        public Supplier<List<E>> supplier() {
            return new RandomUtils$$ExternalSyntheticLambda0(7);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EnumerationSpliterator<T> extends Spliterators.AbstractSpliterator<T> {
        private final Enumeration<T> enumeration;

        public EnumerationSpliterator(long j, int i, Enumeration<T> enumeration) {
            super(j, i);
            Objects.requireNonNull(enumeration, "enumeration");
            this.enumeration = enumeration;
        }

        private boolean next(Consumer<? super T> consumer) {
            consumer.accept(this.enumeration.nextElement());
            return true;
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(Consumer<? super T> consumer) {
            while (this.enumeration.hasMoreElements()) {
                next(consumer);
            }
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super T> consumer) {
            return this.enumeration.hasMoreElements() && next(consumer);
        }
    }

    @Deprecated
    public Streams() {
    }

    public static <T> FailableStream<T> failableStream(Collection<T> collection) {
        return failableStream(of((Collection) collection));
    }

    private static <E> Stream<E> instancesOf(Class<? super E> cls, Stream<?> stream) {
        Stream of = of(stream);
        Objects.requireNonNull(cls);
        return of.filter(new Streams$$ExternalSyntheticLambda0(cls, 0));
    }

    public static <E> Stream<E> nonNull(Collection<E> collection) {
        return of((Collection) collection).filter(new WireTypes$$ExternalSyntheticLambda2(0));
    }

    public static <E> Stream<E> of(Iterator<E> it2) {
        return it2 == null ? Stream.empty() : StreamSupport.stream(Spliterators.spliteratorUnknownSize(it2, 16), false);
    }

    @Deprecated
    public static <E> FailableStream<E> stream(Collection<E> collection) {
        return failableStream((Collection) collection);
    }

    private static <T> Stream<T> streamOf(T t) {
        return t == null ? Stream.empty() : Stream.of(t);
    }

    public static <T> Collector<T, List<T>, T[]> toArray(Class<T> cls) {
        return new ArrayCollector(cls);
    }

    @Deprecated
    public static <T> FailableStream<T> stream(Stream<T> stream) {
        return failableStream((Stream) stream);
    }

    public static <T> FailableStream<T> failableStream(Stream<T> stream) {
        return new FailableStream<>(stream);
    }

    public static <T> FailableStream<T> failableStream(T t) {
        return failableStream(streamOf(t));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FailableStream<T> {
        private Stream<T> stream;
        private boolean terminated;

        public FailableStream(Stream<T> stream) {
            this.stream = stream;
        }

        public boolean allMatch(FailablePredicate<T, ?> failablePredicate) {
            assertNotTerminated();
            return stream().allMatch(Failable.asPredicate(failablePredicate));
        }

        public boolean anyMatch(FailablePredicate<T, ?> failablePredicate) {
            assertNotTerminated();
            return stream().anyMatch(Failable.asPredicate(failablePredicate));
        }

        public void assertNotTerminated() {
            if (this.terminated) {
                Single$$ExternalSyntheticBUOutline0.m$2("This stream is already terminated.");
            }
        }

        public <A, R> R collect(Collector<? super T, A, R> collector) {
            makeTerminated();
            return (R) stream().collect(collector);
        }

        public FailableStream<T> filter(FailablePredicate<T, ?> failablePredicate) {
            assertNotTerminated();
            this.stream = this.stream.filter(Failable.asPredicate(failablePredicate));
            return this;
        }

        public void forEach(FailableConsumer<T, ?> failableConsumer) {
            makeTerminated();
            stream().forEach(Failable.asConsumer(failableConsumer));
        }

        public void makeTerminated() {
            assertNotTerminated();
            this.terminated = true;
        }

        public <R> FailableStream<R> map(FailableFunction<T, R, ?> failableFunction) {
            assertNotTerminated();
            return new FailableStream<>(this.stream.map(Failable.asFunction(failableFunction)));
        }

        public T reduce(T t, BinaryOperator<T> binaryOperator) {
            makeTerminated();
            return stream().reduce(t, binaryOperator);
        }

        public Stream<T> stream() {
            return this.stream;
        }

        public <A, R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> biConsumer, BiConsumer<R, R> biConsumer2) {
            makeTerminated();
            return (R) stream().collect(supplier, biConsumer, biConsumer2);
        }
    }

    @SafeVarargs
    public static <T> FailableStream<T> failableStream(T... tArr) {
        return failableStream(of(tArr));
    }

    public static <E> Stream<E> nonNull(E e) {
        return nonNull(streamOf(e));
    }

    @SafeVarargs
    public static <E> Stream<E> nonNull(E... eArr) {
        return nonNull(of(eArr));
    }

    public static <E> Stream<E> nonNull(Stream<E> stream) {
        return of(stream).filter(new WireTypes$$ExternalSyntheticLambda2(0));
    }

    public static <E> Stream<E> instancesOf(Class<? super E> cls, Collection<? super E> collection) {
        return instancesOf(cls, (Stream<?>) of((Collection) collection));
    }

    public static <E> Stream<E> of(Enumeration<E> enumeration) {
        return StreamSupport.stream(new EnumerationSpliterator(Long.MAX_VALUE, 16, enumeration), false);
    }

    public static <E> Stream<E> of(Iterable<E> iterable) {
        return iterable == null ? Stream.empty() : StreamSupport.stream(iterable.spliterator(), false);
    }

    public static <E> Stream<E> of(Collection<E> collection) {
        return collection == null ? Stream.empty() : collection.stream();
    }

    private static <E> Stream<E> of(Stream<E> stream) {
        return stream == null ? Stream.empty() : stream;
    }

    @SafeVarargs
    public static <T> Stream<T> of(T... tArr) {
        return tArr == null ? Stream.empty() : Stream.of((Object[]) tArr);
    }
}
