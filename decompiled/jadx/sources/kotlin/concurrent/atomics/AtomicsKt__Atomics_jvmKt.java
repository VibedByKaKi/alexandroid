package kotlin.concurrent.atomics;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0000\u001a\u00020\b*\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0011\u0010\u0004\u001a\u00020\t*\u00020\bH\u0007¢\u0006\u0002\u0010\n\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\rH\u0007¢\u0006\u0002\u0010\u000e\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\f0\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u000bH\u0007¢\u0006\u0002\u0010\u000e\u001a6\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u0014\u001a6\u0010\u0015\u001a\u00020\u0013*\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u0016\u001a6\u0010\u0017\u001a\u00020\u0013*\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u0016\u001a6\u0010\u000f\u001a\u00020\u0010*\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u0019\u001a6\u0010\u0015\u001a\u00020\u0018*\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u001a\u001a6\u0010\u0017\u001a\u00020\u0018*\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u001a\u001aB\u0010\u000f\u001a\u00020\u0010\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u001b\u001aB\u0010\u0015\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u001c\u001aB\u0010\u0017\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"asJavaAtomic", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlin/concurrent/atomics/AtomicInt;", "(Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;", "asKotlinAtomic", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/concurrent/atomics/AtomicLong;", "(Ljava/util/concurrent/atomic/AtomicLong;)Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/concurrent/atomics/AtomicBoolean;", "(Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicReference;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/concurrent/atomics/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "update", "", ViewProps.TRANSFORM, "Lkotlin/Function1;", "", "(Ljava/util/concurrent/atomic/AtomicInteger;Lkotlin/jvm/functions/Function1;)V", "fetchAndUpdate", "(Ljava/util/concurrent/atomic/AtomicInteger;Lkotlin/jvm/functions/Function1;)I", "updateAndFetch", "", "(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)J", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicsKt")
/* loaded from: classes10.dex */
class AtomicsKt__Atomics_jvmKt extends AtomicsKt__Atomics_commonKt {
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicBoolean asJavaAtomic(@NotNull AtomicBoolean atomicBoolean) {
        atomicBoolean.getClass();
        return atomicBoolean;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicBoolean asKotlinAtomic(@NotNull AtomicBoolean atomicBoolean) {
        atomicBoolean.getClass();
        return atomicBoolean;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final int fetchAndUpdate(AtomicInteger atomicInteger, Function1<? super Integer, Integer> function1) {
        int i;
        atomicInteger.getClass();
        function1.getClass();
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, function1.invoke(Integer.valueOf(i)).intValue()));
        return i;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final void update(AtomicInteger atomicInteger, Function1<? super Integer, Integer> function1) {
        int i;
        atomicInteger.getClass();
        function1.getClass();
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, function1.invoke(Integer.valueOf(i)).intValue()));
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final int updateAndFetch(AtomicInteger atomicInteger, Function1<? super Integer, Integer> function1) {
        int i;
        int intValue;
        atomicInteger.getClass();
        function1.getClass();
        do {
            i = atomicInteger.get();
            intValue = function1.invoke(Integer.valueOf(i)).intValue();
        } while (!atomicInteger.compareAndSet(i, intValue));
        return intValue;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicInteger asJavaAtomic(@NotNull AtomicInteger atomicInteger) {
        atomicInteger.getClass();
        return atomicInteger;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicInteger asKotlinAtomic(@NotNull AtomicInteger atomicInteger) {
        atomicInteger.getClass();
        return atomicInteger;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicLong asJavaAtomic(@NotNull AtomicLong atomicLong) {
        atomicLong.getClass();
        return atomicLong;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicLong asKotlinAtomic(@NotNull AtomicLong atomicLong) {
        atomicLong.getClass();
        return atomicLong;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final <T> AtomicReference<T> asJavaAtomic(@NotNull AtomicReference<T> atomicReference) {
        atomicReference.getClass();
        return atomicReference;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final <T> AtomicReference<T> asKotlinAtomic(@NotNull AtomicReference<T> atomicReference) {
        atomicReference.getClass();
        return atomicReference;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final long fetchAndUpdate(AtomicLong atomicLong, Function1<? super Long, Long> function1) {
        long j;
        atomicLong.getClass();
        function1.getClass();
        do {
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, function1.invoke(Long.valueOf(j)).longValue()));
        return j;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final void update(AtomicLong atomicLong, Function1<? super Long, Long> function1) {
        long j;
        atomicLong.getClass();
        function1.getClass();
        do {
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, function1.invoke(Long.valueOf(j)).longValue()));
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final long updateAndFetch(AtomicLong atomicLong, Function1<? super Long, Long> function1) {
        long j;
        long longValue;
        atomicLong.getClass();
        function1.getClass();
        do {
            j = atomicLong.get();
            longValue = function1.invoke(Long.valueOf(j)).longValue();
        } while (!atomicLong.compareAndSet(j, longValue));
        return longValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final <T> void update(AtomicReference<T> atomicReference, Function1<? super T, ? extends T> function1) {
        atomicReference.getClass();
        function1.getClass();
        while (true) {
            Object obj = atomicReference.get();
            T invoke = function1.invoke(obj);
            while (!atomicReference.compareAndSet(obj, invoke)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final <T> T fetchAndUpdate(AtomicReference<T> atomicReference, Function1<? super T, ? extends T> function1) {
        atomicReference.getClass();
        function1.getClass();
        while (true) {
            ?? r0 = (Object) atomicReference.get();
            T invoke = function1.invoke(r0);
            while (!atomicReference.compareAndSet(r0, invoke)) {
                if (atomicReference.get() != r0) {
                    break;
                }
            }
            return r0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final <T> T updateAndFetch(AtomicReference<T> atomicReference, Function1<? super T, ? extends T> function1) {
        atomicReference.getClass();
        function1.getClass();
        while (true) {
            Object obj = atomicReference.get();
            T invoke = function1.invoke(obj);
            while (!atomicReference.compareAndSet(obj, invoke)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return invoke;
        }
    }
}
