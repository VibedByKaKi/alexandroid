package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.Beta;
import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.base.Preconditions;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.math.LongMath;
import autovalue.shaded.com.google.errorprone.annotations.InlineMe;
import autovalue.shaded.com.google.errorprone.annotations.InlineMeValidationDisabled;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
public final class Streams {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: autovalue.shaded.com.google.common.collect.Streams$1OptionalState, reason: invalid class name */
    public class C1OptionalState {
        boolean set = false;

        @CheckForNull
        T value = null;

        public T get() {
            T t = this.value;
            Objects.requireNonNull(t);
            return t;
        }

        public void set(T t) {
            this.set = true;
            this.value = t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: autovalue.shaded.com.google.common.collect.Streams$1Splitr, reason: invalid class name */
    public class C1Splitr<R, T> extends MapWithIndexSpliterator<Spliterator<T>, R, C1Splitr> implements Consumer<T> {

        @CheckForNull
        T holder;
        final /* synthetic */ FunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT 
          (r4 I:autovalue.shaded.com.google.common.collect.Streams$FunctionWithIndex)
          (r0 I:autovalue.shaded.com.google.common.collect.Streams$1Splitr)
         (LINE:1) autovalue.shaded.com.google.common.collect.Streams.1Splitr.val$function autovalue.shaded.com.google.common.collect.Streams$FunctionWithIndex, block:B:1:0x0000 */
        public C1Splitr(Spliterator spliterator, Spliterator<T> spliterator2, long j) {
            super(spliterator, spliterator2);
            FunctionWithIndex functionWithIndex;
            this.val$function = functionWithIndex;
        }

        @Override // java.util.function.Consumer
        public void accept(@ParametricNullness T t) {
            this.holder = t;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // autovalue.shaded.com.google.common.collect.Streams.MapWithIndexSpliterator
        public C1Splitr createSplit(Spliterator<T> spliterator, long j) {
            return new C1Splitr(spliterator, j, this.val$function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super R> consumer) {
            if (!this.fromSpliterator.tryAdvance(this)) {
                return false;
            }
            try {
                FunctionWithIndex functionWithIndex = this.val$function;
                Object uncheckedCastNullableTToT = NullnessCasts.uncheckedCastNullableTToT(this.holder);
                long j = this.index;
                this.index = 1 + j;
                consumer.accept((Object) functionWithIndex.apply(uncheckedCastNullableTToT, j));
                this.holder = null;
                return true;
            } catch (Throwable th) {
                this.holder = null;
                throw th;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: autovalue.shaded.com.google.common.collect.Streams$2Splitr, reason: invalid class name */
    public class C2Splitr<R> extends MapWithIndexSpliterator<Spliterator.OfInt, R, C2Splitr> implements IntConsumer, Spliterator<R> {
        int holder;
        final /* synthetic */ IntFunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT 
          (r4 I:autovalue.shaded.com.google.common.collect.Streams$IntFunctionWithIndex)
          (r0 I:autovalue.shaded.com.google.common.collect.Streams$2Splitr)
         (LINE:1) autovalue.shaded.com.google.common.collect.Streams.2Splitr.val$function autovalue.shaded.com.google.common.collect.Streams$IntFunctionWithIndex, block:B:1:0x0000 */
        public C2Splitr(Spliterator.OfInt ofInt, Spliterator.OfInt ofInt2, long j) {
            super(ofInt, ofInt2);
            IntFunctionWithIndex intFunctionWithIndex;
            this.val$function = intFunctionWithIndex;
        }

        @Override // java.util.function.IntConsumer
        public void accept(int i) {
            this.holder = i;
        }

        @Override // autovalue.shaded.com.google.common.collect.Streams.MapWithIndexSpliterator
        public C2Splitr createSplit(Spliterator.OfInt ofInt, long j) {
            return new C2Splitr(ofInt, j, this.val$function);
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super R> consumer) {
            if (!((Spliterator.OfInt) this.fromSpliterator).tryAdvance((IntConsumer) this)) {
                return false;
            }
            IntFunctionWithIndex intFunctionWithIndex = this.val$function;
            int i = this.holder;
            long j = this.index;
            this.index = 1 + j;
            consumer.accept((Object) intFunctionWithIndex.apply(i, j));
            return true;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: autovalue.shaded.com.google.common.collect.Streams$3Splitr, reason: invalid class name */
    public class C3Splitr<R> extends MapWithIndexSpliterator<Spliterator.OfLong, R, C3Splitr> implements LongConsumer, Spliterator<R> {
        long holder;
        final /* synthetic */ LongFunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT 
          (r4 I:autovalue.shaded.com.google.common.collect.Streams$LongFunctionWithIndex)
          (r0 I:autovalue.shaded.com.google.common.collect.Streams$3Splitr)
         (LINE:1) autovalue.shaded.com.google.common.collect.Streams.3Splitr.val$function autovalue.shaded.com.google.common.collect.Streams$LongFunctionWithIndex, block:B:1:0x0000 */
        public C3Splitr(Spliterator.OfLong ofLong, Spliterator.OfLong ofLong2, long j) {
            super(ofLong, ofLong2);
            LongFunctionWithIndex longFunctionWithIndex;
            this.val$function = longFunctionWithIndex;
        }

        @Override // java.util.function.LongConsumer
        public void accept(long j) {
            this.holder = j;
        }

        @Override // autovalue.shaded.com.google.common.collect.Streams.MapWithIndexSpliterator
        public C3Splitr createSplit(Spliterator.OfLong ofLong, long j) {
            return new C3Splitr(ofLong, j, this.val$function);
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super R> consumer) {
            if (!((Spliterator.OfLong) this.fromSpliterator).tryAdvance((LongConsumer) this)) {
                return false;
            }
            LongFunctionWithIndex longFunctionWithIndex = this.val$function;
            long j = this.holder;
            long j2 = this.index;
            this.index = 1 + j2;
            consumer.accept((Object) longFunctionWithIndex.apply(j, j2));
            return true;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: autovalue.shaded.com.google.common.collect.Streams$4Splitr, reason: invalid class name */
    public class C4Splitr<R> extends MapWithIndexSpliterator<Spliterator.OfDouble, R, C4Splitr> implements DoubleConsumer, Spliterator<R> {
        double holder;
        final /* synthetic */ DoubleFunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT 
          (r4 I:autovalue.shaded.com.google.common.collect.Streams$DoubleFunctionWithIndex)
          (r0 I:autovalue.shaded.com.google.common.collect.Streams$4Splitr)
         (LINE:1) autovalue.shaded.com.google.common.collect.Streams.4Splitr.val$function autovalue.shaded.com.google.common.collect.Streams$DoubleFunctionWithIndex, block:B:1:0x0000 */
        public C4Splitr(Spliterator.OfDouble ofDouble, Spliterator.OfDouble ofDouble2, long j) {
            super(ofDouble, ofDouble2);
            DoubleFunctionWithIndex doubleFunctionWithIndex;
            this.val$function = doubleFunctionWithIndex;
        }

        @Override // java.util.function.DoubleConsumer
        public void accept(double d) {
            this.holder = d;
        }

        @Override // autovalue.shaded.com.google.common.collect.Streams.MapWithIndexSpliterator
        public C4Splitr createSplit(Spliterator.OfDouble ofDouble, long j) {
            return new C4Splitr(ofDouble, j, this.val$function);
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super R> consumer) {
            if (!((Spliterator.OfDouble) this.fromSpliterator).tryAdvance((DoubleConsumer) this)) {
                return false;
            }
            DoubleFunctionWithIndex doubleFunctionWithIndex = this.val$function;
            double d = this.holder;
            long j = this.index;
            this.index = 1 + j;
            consumer.accept((Object) doubleFunctionWithIndex.apply(d, j));
            return true;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DoubleFunctionWithIndex<R> {
        @ParametricNullness
        R apply(double d, long j);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FunctionWithIndex<T, R> {
        @ParametricNullness
        R apply(@ParametricNullness T t, long j);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IntFunctionWithIndex<R> {
        @ParametricNullness
        R apply(int i, long j);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LongFunctionWithIndex<R> {
        @ParametricNullness
        R apply(long j, long j2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class MapWithIndexSpliterator<F extends Spliterator<?>, R, S extends MapWithIndexSpliterator<F, R, S>> implements Spliterator<R> {
        final F fromSpliterator;
        long index;

        public MapWithIndexSpliterator(F f, long j) {
            this.fromSpliterator = f;
            this.index = j;
        }

        @Override // java.util.Spliterator
        public int characteristics() {
            return this.fromSpliterator.characteristics() & 16464;
        }

        public abstract S createSplit(F f, long j);

        @Override // java.util.Spliterator
        public long estimateSize() {
            return this.fromSpliterator.estimateSize();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Spliterator
        @CheckForNull
        public S trySplit() {
            Spliterator trySplit = this.fromSpliterator.trySplit();
            if (trySplit == null) {
                return null;
            }
            S s = (S) createSplit(trySplit, this.index);
            this.index = trySplit.getExactSizeIfKnown() + this.index;
            return s;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TemporaryPair<A, B> {

        /* renamed from: a, reason: collision with root package name */
        @ParametricNullness
        final A f362a;

        @ParametricNullness
        final B b;

        public TemporaryPair(@ParametricNullness A a2, @ParametricNullness B b) {
            this.f362a = a2;
            this.b = b;
        }
    }

    private Streams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeAll(BaseStream<?, ?>[] baseStreamArr) {
        Exception exc = null;
        for (BaseStream<?, ?> baseStream : baseStreamArr) {
            try {
                baseStream.close();
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                } else {
                    exc.addSuppressed(e);
                }
            }
        }
        if (exc != null) {
            sneakyThrow(exc);
        }
    }

    public static DoubleStream concat(DoubleStream... doubleStreamArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder(doubleStreamArr.length);
        long j = 0;
        int i = 336;
        boolean z = false;
        for (DoubleStream doubleStream : doubleStreamArr) {
            z |= doubleStream.isParallel();
            Spliterator<Double> spliterator = doubleStream.spliterator();
            builder.add((ImmutableList.Builder) spliterator);
            i &= spliterator.characteristics();
            j = LongMath.saturatedAdd(j, spliterator.estimateSize());
        }
        return (DoubleStream) StreamSupport.doubleStream(CollectSpliterators.flatMapToDouble(builder.build().spliterator(), new Streams$$ExternalSyntheticLambda0(2), i, j), z).onClose(new Streams$$ExternalSyntheticLambda1(doubleStreamArr, 1));
    }

    public static <T> Optional<T> findLast(Stream<T> stream) {
        C1OptionalState c1OptionalState = new C1OptionalState();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(stream.spliterator());
        while (!arrayDeque.isEmpty()) {
            Spliterator<T> spliterator = (Spliterator) arrayDeque.removeLast();
            if (spliterator.getExactSizeIfKnown() != 0) {
                if (spliterator.hasCharacteristics(16384)) {
                    while (true) {
                        Spliterator<T> trySplit = spliterator.trySplit();
                        if (trySplit == null || trySplit.getExactSizeIfKnown() == 0) {
                            break;
                        }
                        if (spliterator.getExactSizeIfKnown() == 0) {
                            spliterator = trySplit;
                            break;
                        }
                    }
                    spliterator.forEachRemaining(new Streams$$ExternalSyntheticLambda13(c1OptionalState, 0));
                    return Optional.of(c1OptionalState.get());
                }
                Spliterator<T> trySplit2 = spliterator.trySplit();
                if (trySplit2 == null || trySplit2.getExactSizeIfKnown() == 0) {
                    spliterator.forEachRemaining(new Streams$$ExternalSyntheticLambda13(c1OptionalState, 0));
                    if (c1OptionalState.set) {
                        return Optional.of(c1OptionalState.get());
                    }
                } else {
                    arrayDeque.addLast(trySplit2);
                    arrayDeque.addLast(spliterator);
                }
            }
        }
        return Optional.empty();
    }

    @Beta
    public static <A, B> void forEachPair(Stream<A> stream, Stream<B> stream2, BiConsumer<? super A, ? super B> biConsumer) {
        Preconditions.checkNotNull(biConsumer);
        if (stream.isParallel() || stream2.isParallel()) {
            zip(stream, stream2, new Streams$$ExternalSyntheticLambda15()).forEach(new Streams$$ExternalSyntheticLambda16(biConsumer, 0));
            return;
        }
        Iterator<A> it2 = stream.iterator();
        Iterator<B> it3 = stream2.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            biConsumer.accept(it2.next(), it3.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$forEachPair$8(BiConsumer biConsumer, TemporaryPair temporaryPair) {
        biConsumer.accept(temporaryPair.f362a, temporaryPair.b);
    }

    public static <T, R> Stream<R> mapWithIndex(Stream<T> stream, final FunctionWithIndex<? super T, ? extends R> functionWithIndex) {
        Preconditions.checkNotNull(stream);
        Preconditions.checkNotNull(functionWithIndex);
        boolean isParallel = stream.isParallel();
        Spliterator<T> spliterator = stream.spliterator();
        if (spliterator.hasCharacteristics(16384)) {
            return (Stream) StreamSupport.stream(new C1Splitr(spliterator, 0L, functionWithIndex), isParallel).onClose(new Streams$$ExternalSyntheticLambda1(stream, 6));
        }
        final Iterator it2 = Spliterators.iterator(spliterator);
        return (Stream) StreamSupport.stream(new Spliterators.AbstractSpliterator<R>(spliterator.estimateSize(), spliterator.characteristics() & 80) { // from class: autovalue.shaded.com.google.common.collect.Streams.2
            long index = 0;

            @Override // java.util.Spliterator
            public boolean tryAdvance(Consumer<? super R> consumer) {
                if (!it2.hasNext()) {
                    return false;
                }
                FunctionWithIndex functionWithIndex2 = functionWithIndex;
                Object next = it2.next();
                long j = this.index;
                this.index = 1 + j;
                consumer.accept((Object) functionWithIndex2.apply(next, j));
                return true;
            }
        }, isParallel).onClose(new Streams$$ExternalSyntheticLambda1(stream, 6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [autovalue.shaded.com.google.common.collect.Streams$1SneakyThrower] */
    private static void sneakyThrow(Throwable th) {
        new Object() { // from class: autovalue.shaded.com.google.common.collect.Streams.1SneakyThrower
            public void throwIt(Throwable th2) throws Throwable {
                throw th2;
            }
        }.throwIt(th);
    }

    public static <T> Stream<T> stream(Iterable<T> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).stream() : StreamSupport.stream(iterable.spliterator(), false);
    }

    @Beta
    public static <A, B, R> Stream<R> zip(Stream<A> stream, Stream<B> stream2, final BiFunction<? super A, ? super B, R> biFunction) {
        Preconditions.checkNotNull(stream);
        Preconditions.checkNotNull(stream2);
        Preconditions.checkNotNull(biFunction);
        boolean z = stream.isParallel() || stream2.isParallel();
        Spliterator<A> spliterator = stream.spliterator();
        Spliterator<B> spliterator2 = stream2.spliterator();
        int characteristics = spliterator.characteristics() & spliterator2.characteristics() & 80;
        final Iterator it2 = Spliterators.iterator(spliterator);
        final Iterator it3 = Spliterators.iterator(spliterator2);
        return (Stream) ((Stream) StreamSupport.stream(new Spliterators.AbstractSpliterator<R>(Math.min(spliterator.estimateSize(), spliterator2.estimateSize()), characteristics) { // from class: autovalue.shaded.com.google.common.collect.Streams.1
            @Override // java.util.Spliterator
            public boolean tryAdvance(Consumer<? super R> consumer) {
                if (!it2.hasNext() || !it3.hasNext()) {
                    return false;
                }
                consumer.accept((Object) biFunction.apply(it2.next(), it3.next()));
                return true;
            }
        }, z).onClose(new Streams$$ExternalSyntheticLambda1(stream, 6))).onClose(new Streams$$ExternalSyntheticLambda1(stream2, 6));
    }

    @InlineMe(replacement = "collection.stream()")
    @Deprecated
    public static <T> Stream<T> stream(Collection<T> collection) {
        return collection.stream();
    }

    public static <T> Stream<T> stream(Iterator<T> it2) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it2, 0), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Spliterator lambda$concat$0(Spliterator spliterator) {
        return spliterator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Spliterator.OfInt lambda$concat$2(Spliterator.OfInt ofInt) {
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Spliterator.OfLong lambda$concat$4(Spliterator.OfLong ofLong) {
        return ofLong;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Spliterator.OfDouble lambda$concat$6(Spliterator.OfDouble ofDouble) {
        return ofDouble;
    }

    public static <T> Stream<T> stream(autovalue.shaded.com.google.common.base.Optional<T> optional) {
        return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
    }

    @Beta
    @InlineMeValidationDisabled("Java 9+ API only")
    @InlineMe(replacement = "optional.stream()")
    public static <T> Stream<T> stream(Optional<T> optional) {
        return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
    }

    @Beta
    @InlineMeValidationDisabled("Java 9+ API only")
    @InlineMe(replacement = "optional.stream()")
    public static IntStream stream(OptionalInt optionalInt) {
        return optionalInt.isPresent() ? IntStream.of(optionalInt.getAsInt()) : IntStream.empty();
    }

    @Beta
    @InlineMeValidationDisabled("Java 9+ API only")
    @InlineMe(replacement = "optional.stream()")
    public static LongStream stream(OptionalLong optionalLong) {
        return optionalLong.isPresent() ? LongStream.of(optionalLong.getAsLong()) : LongStream.empty();
    }

    @Beta
    @InlineMeValidationDisabled("Java 9+ API only")
    @InlineMe(replacement = "optional.stream()")
    public static DoubleStream stream(OptionalDouble optionalDouble) {
        return optionalDouble.isPresent() ? DoubleStream.of(optionalDouble.getAsDouble()) : DoubleStream.empty();
    }

    public static IntStream concat(IntStream... intStreamArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder(intStreamArr.length);
        long j = 0;
        int i = 336;
        boolean z = false;
        for (IntStream intStream : intStreamArr) {
            z |= intStream.isParallel();
            Spliterator<Integer> spliterator = intStream.spliterator();
            builder.add((ImmutableList.Builder) spliterator);
            i &= spliterator.characteristics();
            j = LongMath.saturatedAdd(j, spliterator.estimateSize());
        }
        int i2 = 5;
        return (IntStream) StreamSupport.intStream(CollectSpliterators.flatMapToInt(builder.build().spliterator(), new Streams$$ExternalSyntheticLambda0(i2), i, j), z).onClose(new Streams$$ExternalSyntheticLambda1(intStreamArr, i2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Spliterator, java.util.Spliterator$OfInt] */
    public static <R> Stream<R> mapWithIndex(IntStream intStream, final IntFunctionWithIndex<R> intFunctionWithIndex) {
        Preconditions.checkNotNull(intStream);
        Preconditions.checkNotNull(intFunctionWithIndex);
        boolean isParallel = intStream.isParallel();
        ?? spliterator = intStream.spliterator();
        if (!spliterator.hasCharacteristics(16384)) {
            final PrimitiveIterator.OfInt it2 = Spliterators.iterator((Spliterator.OfInt) spliterator);
            return (Stream) StreamSupport.stream(new Spliterators.AbstractSpliterator<R>(spliterator.estimateSize(), spliterator.characteristics() & 80) { // from class: autovalue.shaded.com.google.common.collect.Streams.3
                long index = 0;

                @Override // java.util.Spliterator
                public boolean tryAdvance(Consumer<? super R> consumer) {
                    if (!it2.hasNext()) {
                        return false;
                    }
                    IntFunctionWithIndex intFunctionWithIndex2 = intFunctionWithIndex;
                    int nextInt = it2.nextInt();
                    long j = this.index;
                    this.index = 1 + j;
                    consumer.accept((Object) intFunctionWithIndex2.apply(nextInt, j));
                    return true;
                }
            }, isParallel).onClose(new Streams$$ExternalSyntheticLambda1(intStream, 3));
        }
        return (Stream) StreamSupport.stream(new C2Splitr(spliterator, 0L, intFunctionWithIndex), isParallel).onClose(new Streams$$ExternalSyntheticLambda1(intStream, 3));
    }

    public static LongStream concat(LongStream... longStreamArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder(longStreamArr.length);
        long j = 0;
        int i = 336;
        boolean z = false;
        for (LongStream longStream : longStreamArr) {
            z |= longStream.isParallel();
            Spliterator<Long> spliterator = longStream.spliterator();
            builder.add((ImmutableList.Builder) spliterator);
            i &= spliterator.characteristics();
            j = LongMath.saturatedAdd(j, spliterator.estimateSize());
        }
        int i2 = 0;
        return (LongStream) StreamSupport.longStream(CollectSpliterators.flatMapToLong(builder.build().spliterator(), new Streams$$ExternalSyntheticLambda0(i2), i, j), z).onClose(new Streams$$ExternalSyntheticLambda1(longStreamArr, i2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Spliterator, java.util.Spliterator$OfLong] */
    public static <R> Stream<R> mapWithIndex(LongStream longStream, final LongFunctionWithIndex<R> longFunctionWithIndex) {
        Preconditions.checkNotNull(longStream);
        Preconditions.checkNotNull(longFunctionWithIndex);
        boolean isParallel = longStream.isParallel();
        ?? spliterator = longStream.spliterator();
        if (!spliterator.hasCharacteristics(16384)) {
            final PrimitiveIterator.OfLong it2 = Spliterators.iterator((Spliterator.OfLong) spliterator);
            return (Stream) StreamSupport.stream(new Spliterators.AbstractSpliterator<R>(spliterator.estimateSize(), spliterator.characteristics() & 80) { // from class: autovalue.shaded.com.google.common.collect.Streams.4
                long index = 0;

                @Override // java.util.Spliterator
                public boolean tryAdvance(Consumer<? super R> consumer) {
                    if (!it2.hasNext()) {
                        return false;
                    }
                    LongFunctionWithIndex longFunctionWithIndex2 = longFunctionWithIndex;
                    long nextLong = it2.nextLong();
                    long j = this.index;
                    this.index = 1 + j;
                    consumer.accept((Object) longFunctionWithIndex2.apply(nextLong, j));
                    return true;
                }
            }, isParallel).onClose(new Streams$$ExternalSyntheticLambda1(longStream, 4));
        }
        return (Stream) StreamSupport.stream(new C3Splitr(spliterator, 0L, longFunctionWithIndex), isParallel).onClose(new Streams$$ExternalSyntheticLambda1(longStream, 4));
    }

    @SafeVarargs
    public static <T> Stream<T> concat(Stream<? extends T>... streamArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder(streamArr.length);
        long j = 0;
        int i = 336;
        boolean z = false;
        for (Stream<? extends T> stream : streamArr) {
            z |= stream.isParallel();
            Spliterator<? extends T> spliterator = stream.spliterator();
            builder.add((ImmutableList.Builder) spliterator);
            i &= spliterator.characteristics();
            j = LongMath.saturatedAdd(j, spliterator.estimateSize());
        }
        int i2 = 7;
        return (Stream) StreamSupport.stream(CollectSpliterators.flatMap(builder.build().spliterator(), new Streams$$ExternalSyntheticLambda0(i2), i, j), z).onClose(new Streams$$ExternalSyntheticLambda1(streamArr, i2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Spliterator, java.util.Spliterator$OfDouble] */
    public static <R> Stream<R> mapWithIndex(DoubleStream doubleStream, final DoubleFunctionWithIndex<R> doubleFunctionWithIndex) {
        Preconditions.checkNotNull(doubleStream);
        Preconditions.checkNotNull(doubleFunctionWithIndex);
        boolean isParallel = doubleStream.isParallel();
        ?? spliterator = doubleStream.spliterator();
        if (!spliterator.hasCharacteristics(16384)) {
            final PrimitiveIterator.OfDouble it2 = Spliterators.iterator((Spliterator.OfDouble) spliterator);
            return (Stream) StreamSupport.stream(new Spliterators.AbstractSpliterator<R>(spliterator.estimateSize(), spliterator.characteristics() & 80) { // from class: autovalue.shaded.com.google.common.collect.Streams.5
                long index = 0;

                @Override // java.util.Spliterator
                public boolean tryAdvance(Consumer<? super R> consumer) {
                    if (!it2.hasNext()) {
                        return false;
                    }
                    DoubleFunctionWithIndex doubleFunctionWithIndex2 = doubleFunctionWithIndex;
                    double nextDouble = it2.nextDouble();
                    long j = this.index;
                    this.index = 1 + j;
                    consumer.accept((Object) doubleFunctionWithIndex2.apply(nextDouble, j));
                    return true;
                }
            }, isParallel).onClose(new Streams$$ExternalSyntheticLambda1(doubleStream, 2));
        }
        return (Stream) StreamSupport.stream(new C4Splitr(spliterator, 0L, doubleFunctionWithIndex), isParallel).onClose(new Streams$$ExternalSyntheticLambda1(doubleStream, 2));
    }

    public static OptionalInt findLast(IntStream intStream) {
        return (OptionalInt) findLast(intStream.boxed()).map(new Streams$$ExternalSyntheticLambda0(3)).orElse(OptionalInt.empty());
    }

    public static OptionalLong findLast(LongStream longStream) {
        return (OptionalLong) findLast(longStream.boxed()).map(new Streams$$ExternalSyntheticLambda0(6)).orElse(OptionalLong.empty());
    }

    public static OptionalDouble findLast(DoubleStream doubleStream) {
        return (OptionalDouble) findLast(doubleStream.boxed()).map(new Streams$$ExternalSyntheticLambda0(4)).orElse(OptionalDouble.empty());
    }
}
