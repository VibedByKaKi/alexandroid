package kotlin.concurrent.atomics;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\nH\u0007¢\u0006\u0002\u0010\u000b\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\t0\n\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\bH\u0007¢\u0006\u0002\u0010\u000b\u001a>\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0012\u001a>\u0010\u0013\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0014\u001a>\u0010\u0015\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0014\u001a>\u0010\f\u001a\u00020\r*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0017\u001a>\u0010\u0013\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0018\u001a>\u0010\u0015\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0018\u001aJ\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0019\u001aJ\u0010\u0013\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001a\u001aJ\u0010\u0015\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"asJavaAtomicArray", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "Lkotlin/concurrent/atomics/AtomicIntArray;", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;)Ljava/util/concurrent/atomic/AtomicIntegerArray;", "asKotlinAtomicArray", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Lkotlin/concurrent/atomics/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;)Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/concurrent/atomics/AtomicArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "updateAt", "", "index", "", ViewProps.TRANSFORM, "Lkotlin/Function1;", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;ILkotlin/jvm/functions/Function1;)V", "updateAndFetchAt", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;ILkotlin/jvm/functions/Function1;)I", "fetchAndUpdateAt", "", "(Ljava/util/concurrent/atomic/AtomicLongArray;ILkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicLongArray;ILkotlin/jvm/functions/Function1;)J", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicArraysKt")
/* loaded from: classes10.dex */
class AtomicArraysKt__AtomicArrays_jvmKt extends AtomicArraysKt__AtomicArrays_commonKt {
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicIntegerArray asJavaAtomicArray(@NotNull AtomicIntegerArray atomicIntegerArray) {
        atomicIntegerArray.getClass();
        return atomicIntegerArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicIntegerArray asKotlinAtomicArray(@NotNull AtomicIntegerArray atomicIntegerArray) {
        atomicIntegerArray.getClass();
        return atomicIntegerArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final long fetchAndUpdateAt(AtomicLongArray atomicLongArray, int i, Function1<? super Long, Long> function1) {
        atomicLongArray.getClass();
        function1.getClass();
        while (true) {
            long j = atomicLongArray.get(i);
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i2 = i;
            if (atomicLongArray2.compareAndSet(i2, j, function1.invoke(Long.valueOf(j)).longValue())) {
                return j;
            }
            atomicLongArray = atomicLongArray2;
            i = i2;
        }
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final long updateAndFetchAt(AtomicLongArray atomicLongArray, int i, Function1<? super Long, Long> function1) {
        atomicLongArray.getClass();
        function1.getClass();
        while (true) {
            long j = atomicLongArray.get(i);
            long longValue = function1.invoke(Long.valueOf(j)).longValue();
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i2 = i;
            if (atomicLongArray2.compareAndSet(i2, j, longValue)) {
                return longValue;
            }
            atomicLongArray = atomicLongArray2;
            i = i2;
        }
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final void updateAt(AtomicLongArray atomicLongArray, int i, Function1<? super Long, Long> function1) {
        atomicLongArray.getClass();
        function1.getClass();
        while (true) {
            long j = atomicLongArray.get(i);
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i2 = i;
            if (atomicLongArray2.compareAndSet(i2, j, function1.invoke(Long.valueOf(j)).longValue())) {
                return;
            }
            atomicLongArray = atomicLongArray2;
            i = i2;
        }
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicLongArray asJavaAtomicArray(@NotNull AtomicLongArray atomicLongArray) {
        atomicLongArray.getClass();
        return atomicLongArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicLongArray asKotlinAtomicArray(@NotNull AtomicLongArray atomicLongArray) {
        atomicLongArray.getClass();
        return atomicLongArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final <T> AtomicReferenceArray<T> asJavaAtomicArray(@NotNull AtomicReferenceArray<T> atomicReferenceArray) {
        atomicReferenceArray.getClass();
        return atomicReferenceArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final <T> AtomicReferenceArray<T> asKotlinAtomicArray(@NotNull AtomicReferenceArray<T> atomicReferenceArray) {
        atomicReferenceArray.getClass();
        return atomicReferenceArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final int fetchAndUpdateAt(AtomicIntegerArray atomicIntegerArray, int i, Function1<? super Integer, Integer> function1) {
        int i2;
        atomicIntegerArray.getClass();
        function1.getClass();
        do {
            i2 = atomicIntegerArray.get(i);
        } while (!atomicIntegerArray.compareAndSet(i, i2, function1.invoke(Integer.valueOf(i2)).intValue()));
        return i2;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final int updateAndFetchAt(AtomicIntegerArray atomicIntegerArray, int i, Function1<? super Integer, Integer> function1) {
        int i2;
        int intValue;
        atomicIntegerArray.getClass();
        function1.getClass();
        do {
            i2 = atomicIntegerArray.get(i);
            intValue = function1.invoke(Integer.valueOf(i2)).intValue();
        } while (!atomicIntegerArray.compareAndSet(i, i2, intValue));
        return intValue;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final void updateAt(AtomicIntegerArray atomicIntegerArray, int i, Function1<? super Integer, Integer> function1) {
        int i2;
        atomicIntegerArray.getClass();
        function1.getClass();
        do {
            i2 = atomicIntegerArray.get(i);
        } while (!atomicIntegerArray.compareAndSet(i, i2, function1.invoke(Integer.valueOf(i2)).intValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final <T> void updateAt(AtomicReferenceArray<T> atomicReferenceArray, int i, Function1<? super T, ? extends T> function1) {
        atomicReferenceArray.getClass();
        function1.getClass();
        while (true) {
            Object obj = atomicReferenceArray.get(i);
            T invoke = function1.invoke(obj);
            while (!atomicReferenceArray.compareAndSet(i, obj, invoke)) {
                if (atomicReferenceArray.get(i) != obj) {
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
    private static final <T> T fetchAndUpdateAt(AtomicReferenceArray<T> atomicReferenceArray, int i, Function1<? super T, ? extends T> function1) {
        atomicReferenceArray.getClass();
        function1.getClass();
        while (true) {
            ?? r0 = (Object) atomicReferenceArray.get(i);
            T invoke = function1.invoke(r0);
            while (!atomicReferenceArray.compareAndSet(i, r0, invoke)) {
                if (atomicReferenceArray.get(i) != r0) {
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
    private static final <T> T updateAndFetchAt(AtomicReferenceArray<T> atomicReferenceArray, int i, Function1<? super T, ? extends T> function1) {
        atomicReferenceArray.getClass();
        function1.getClass();
        while (true) {
            Object obj = atomicReferenceArray.get(i);
            T invoke = function1.invoke(obj);
            while (!atomicReferenceArray.compareAndSet(i, obj, invoke)) {
                if (atomicReferenceArray.get(i) != obj) {
                    break;
                }
            }
            return invoke;
        }
    }
}
