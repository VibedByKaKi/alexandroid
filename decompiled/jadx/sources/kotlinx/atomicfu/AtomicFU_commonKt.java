package kotlinx.atomicfu;

import ai.onnxruntime.BuildConfig;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a!\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0086\b\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\n2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u0086\b\u001a!\u0010\u0005\u001a\u00020\u000b*\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\tH\u0086\b\u001a2\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\tH\u0086\b¢\u0006\u0002\u0010\u000e\u001a!\u0010\u000f\u001a\u00020\u0010*\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\tH\u0086\b\u001a!\u0010\u000f\u001a\u00020\u0010*\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\tH\u0086\b\u001a!\u0010\u000f\u001a\u00020\u0010*\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\tH\u0086\b\u001a-\u0010\u000f\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00120\tH\u0086\b\u001a!\u0010\u0013\u001a\u00020\u0012*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0086\b\u001a!\u0010\u0013\u001a\u00020\u0012*\u00020\n2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u0086\b\u001a!\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\tH\u0086\b\u001a-\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\tH\u0086\b\u001a!\u0010\u0014\u001a\u00020\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0086\b\u001a!\u0010\u0014\u001a\u00020\u0004*\u00020\n2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u0086\b\u001a!\u0010\u0014\u001a\u00020\u000b*\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\tH\u0086\b\u001a2\u0010\u0014\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\tH\u0086\b¢\u0006\u0002\u0010\u000e¨\u0006\u0015"}, d2 = {"atomicArrayOfNulls", "Lkotlinx/atomicfu/AtomicArray;", ExifInterface.GPS_DIRECTION_TRUE, "size", "", "getAndUpdate", "", "Lkotlinx/atomicfu/AtomicBoolean;", "function", "Lkotlin/Function1;", "Lkotlinx/atomicfu/AtomicInt;", "", "Lkotlinx/atomicfu/AtomicLong;", "Lkotlinx/atomicfu/AtomicRef;", "(Lkotlinx/atomicfu/AtomicRef;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "loop", "", "action", "", "update", "updateAndGet", "atomicfu"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class AtomicFU_commonKt {
    @NotNull
    public static final <T> AtomicArray<T> atomicArrayOfNulls(int i) {
        return new AtomicArray<>(i);
    }

    public static final boolean getAndUpdate(@NotNull AtomicBoolean atomicBoolean, @NotNull Function1<? super Boolean, Boolean> function1) {
        boolean value;
        atomicBoolean.getClass();
        function1.getClass();
        do {
            value = atomicBoolean.getValue();
        } while (!atomicBoolean.compareAndSet(value, function1.invoke(Boolean.valueOf(value)).booleanValue()));
        return value;
    }

    @NotNull
    public static final Void loop(@NotNull AtomicBoolean atomicBoolean, @NotNull Function1<? super Boolean, Unit> function1) {
        atomicBoolean.getClass();
        function1.getClass();
        while (true) {
            function1.invoke(Boolean.valueOf(atomicBoolean.getValue()));
        }
    }

    public static final void update(@NotNull AtomicBoolean atomicBoolean, @NotNull Function1<? super Boolean, Boolean> function1) {
        boolean value;
        atomicBoolean.getClass();
        function1.getClass();
        do {
            value = atomicBoolean.getValue();
        } while (!atomicBoolean.compareAndSet(value, function1.invoke(Boolean.valueOf(value)).booleanValue()));
    }

    public static final boolean updateAndGet(@NotNull AtomicBoolean atomicBoolean, @NotNull Function1<? super Boolean, Boolean> function1) {
        boolean value;
        boolean booleanValue;
        atomicBoolean.getClass();
        function1.getClass();
        do {
            value = atomicBoolean.getValue();
            booleanValue = function1.invoke(Boolean.valueOf(value)).booleanValue();
        } while (!atomicBoolean.compareAndSet(value, booleanValue));
        return booleanValue;
    }

    @NotNull
    public static final <T> Void loop(@NotNull AtomicRef<T> atomicRef, @NotNull Function1<? super T, Unit> function1) {
        atomicRef.getClass();
        function1.getClass();
        while (true) {
            function1.invoke(atomicRef.getValue());
        }
    }

    @NotNull
    public static final Void loop(@NotNull AtomicInt atomicInt, @NotNull Function1<? super Integer, Unit> function1) {
        atomicInt.getClass();
        function1.getClass();
        while (true) {
            function1.invoke(Integer.valueOf(atomicInt.getValue()));
        }
    }

    @NotNull
    public static final Void loop(@NotNull AtomicLong atomicLong, @NotNull Function1<? super Long, Unit> function1) {
        atomicLong.getClass();
        function1.getClass();
        while (true) {
            function1.invoke(Long.valueOf(atomicLong.getValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T getAndUpdate(@NotNull AtomicRef<T> atomicRef, @NotNull Function1<? super T, ? extends T> function1) {
        ?? r0;
        atomicRef.getClass();
        function1.getClass();
        do {
            r0 = (Object) atomicRef.getValue();
        } while (!atomicRef.compareAndSet(r0, function1.invoke(r0)));
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(@NotNull AtomicRef<T> atomicRef, @NotNull Function1<? super T, ? extends T> function1) {
        BuildConfig buildConfig;
        atomicRef.getClass();
        function1.getClass();
        do {
            buildConfig = (Object) atomicRef.getValue();
        } while (!atomicRef.compareAndSet(buildConfig, function1.invoke(buildConfig)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T updateAndGet(@NotNull AtomicRef<T> atomicRef, @NotNull Function1<? super T, ? extends T> function1) {
        BuildConfig buildConfig;
        T invoke;
        atomicRef.getClass();
        function1.getClass();
        do {
            buildConfig = (Object) atomicRef.getValue();
            invoke = function1.invoke(buildConfig);
        } while (!atomicRef.compareAndSet(buildConfig, invoke));
        return invoke;
    }

    public static final int getAndUpdate(@NotNull AtomicInt atomicInt, @NotNull Function1<? super Integer, Integer> function1) {
        int value;
        atomicInt.getClass();
        function1.getClass();
        do {
            value = atomicInt.getValue();
        } while (!atomicInt.compareAndSet(value, function1.invoke(Integer.valueOf(value)).intValue()));
        return value;
    }

    public static final void update(@NotNull AtomicInt atomicInt, @NotNull Function1<? super Integer, Integer> function1) {
        int value;
        atomicInt.getClass();
        function1.getClass();
        do {
            value = atomicInt.getValue();
        } while (!atomicInt.compareAndSet(value, function1.invoke(Integer.valueOf(value)).intValue()));
    }

    public static final int updateAndGet(@NotNull AtomicInt atomicInt, @NotNull Function1<? super Integer, Integer> function1) {
        int value;
        int intValue;
        atomicInt.getClass();
        function1.getClass();
        do {
            value = atomicInt.getValue();
            intValue = function1.invoke(Integer.valueOf(value)).intValue();
        } while (!atomicInt.compareAndSet(value, intValue));
        return intValue;
    }

    public static final long getAndUpdate(@NotNull AtomicLong atomicLong, @NotNull Function1<? super Long, Long> function1) {
        long value;
        atomicLong.getClass();
        function1.getClass();
        do {
            value = atomicLong.getValue();
        } while (!atomicLong.compareAndSet(value, function1.invoke(Long.valueOf(value)).longValue()));
        return value;
    }

    public static final void update(@NotNull AtomicLong atomicLong, @NotNull Function1<? super Long, Long> function1) {
        long value;
        atomicLong.getClass();
        function1.getClass();
        do {
            value = atomicLong.getValue();
        } while (!atomicLong.compareAndSet(value, function1.invoke(Long.valueOf(value)).longValue()));
    }

    public static final long updateAndGet(@NotNull AtomicLong atomicLong, @NotNull Function1<? super Long, Long> function1) {
        long value;
        long longValue;
        atomicLong.getClass();
        function1.getClass();
        do {
            value = atomicLong.getValue();
            longValue = function1.invoke(Long.valueOf(value)).longValue();
        } while (!atomicLong.compareAndSet(value, longValue));
        return longValue;
    }
}
