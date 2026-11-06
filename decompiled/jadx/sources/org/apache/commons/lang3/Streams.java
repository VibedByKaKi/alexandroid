package org.apache.commons.lang3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;
import org.apache.commons.lang3.Functions;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public class Streams {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public static class ArrayCollector<O> implements Collector<O, List<O>, O[]> {
        private static final Set<Collector.Characteristics> characteristics = Collections.EMPTY_SET;
        private final Class<O> elementType;

        public ArrayCollector(Class<O> cls) {
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
        public BiConsumer<List<O>, O> accumulator() {
            return new ClassUtils$$ExternalSyntheticLambda1(1);
        }

        @Override // java.util.stream.Collector
        public Set<Collector.Characteristics> characteristics() {
            return characteristics;
        }

        @Override // java.util.stream.Collector
        public BinaryOperator<List<O>> combiner() {
            return new Streams$ArrayCollector$$ExternalSyntheticLambda1();
        }

        @Override // java.util.stream.Collector
        public Function<List<O>, O[]> finisher() {
            return new Functions$$ExternalSyntheticLambda11(this, 21);
        }

        @Override // java.util.stream.Collector
        public Supplier<List<O>> supplier() {
            return new RandomUtils$$ExternalSyntheticLambda0(7);
        }
    }

    public static <O> FailableStream<O> stream(Collection<O> collection) {
        return stream(collection.stream());
    }

    public static <O> Collector<O, ?, O[]> toArray(Class<O> cls) {
        return new ArrayCollector(cls);
    }

    public static <O> FailableStream<O> stream(Stream<O> stream) {
        return new FailableStream<>(stream);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public static class FailableStream<O> {
        private Stream<O> stream;
        private boolean terminated;

        public FailableStream(Stream<O> stream) {
            this.stream = stream;
        }

        public boolean allMatch(Functions.FailablePredicate<O, ?> failablePredicate) {
            assertNotTerminated();
            return stream().allMatch(Functions.asPredicate(failablePredicate));
        }

        public boolean anyMatch(Functions.FailablePredicate<O, ?> failablePredicate) {
            assertNotTerminated();
            return stream().anyMatch(Functions.asPredicate(failablePredicate));
        }

        public void assertNotTerminated() {
            if (this.terminated) {
                Single$$ExternalSyntheticBUOutline0.m$2("This stream is already terminated.");
            }
        }

        public <A, R> R collect(Collector<? super O, A, R> collector) {
            makeTerminated();
            return (R) stream().collect(collector);
        }

        public FailableStream<O> filter(Functions.FailablePredicate<O, ?> failablePredicate) {
            assertNotTerminated();
            this.stream = this.stream.filter(Functions.asPredicate(failablePredicate));
            return this;
        }

        public void forEach(Functions.FailableConsumer<O, ?> failableConsumer) {
            makeTerminated();
            stream().forEach(Functions.asConsumer(failableConsumer));
        }

        public void makeTerminated() {
            assertNotTerminated();
            this.terminated = true;
        }

        public <R> FailableStream<R> map(Functions.FailableFunction<O, R, ?> failableFunction) {
            assertNotTerminated();
            return new FailableStream<>(this.stream.map(Functions.asFunction(failableFunction)));
        }

        public O reduce(O o, BinaryOperator<O> binaryOperator) {
            makeTerminated();
            return stream().reduce(o, binaryOperator);
        }

        public Stream<O> stream() {
            return this.stream;
        }

        public <A, R> R collect(Supplier<R> supplier, BiConsumer<R, ? super O> biConsumer, BiConsumer<R, R> biConsumer2) {
            makeTerminated();
            return (R) stream().collect(supplier, biConsumer, biConsumer2);
        }
    }
}
