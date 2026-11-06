package kotlinx.io.pool;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlinx.io.pool.ObjectPool;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000 $*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001$B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\r\u0010\u001b\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0013\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\u000f\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u0012J\u0015\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lkotlinx/io/pool/DefaultPool;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/io/pool/ObjectPool;", "capacity", "", "(I)V", "getCapacity", "()I", "instances", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "maxIndex", "next", "", "shift", "top", "", "borrow", "()Ljava/lang/Object;", "clearInstance", AlexaEventBundleKeys.INSTANCE, "(Ljava/lang/Object;)Ljava/lang/Object;", "dispose", "", "disposeInstance", "(Ljava/lang/Object;)V", "popTop", "produceInstance", "pushTop", "index", "recycle", "tryPop", "tryPush", "", "(Ljava/lang/Object;)Z", "validateInstance", "Companion", "kotlinx-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public abstract class DefaultPool<T> implements ObjectPool<T> {
    private static final AtomicLongFieldUpdater<DefaultPool<?>> Top;
    private final int capacity;
    private final AtomicReferenceArray<T> instances;
    private final int maxIndex;
    private final int[] next;
    private final int shift;
    private volatile long top;

    static {
        AtomicLongFieldUpdater<DefaultPool<?>> newUpdater = AtomicLongFieldUpdater.newUpdater(DefaultPool.class, DefaultPool$Companion$Top$1.INSTANCE.getName());
        newUpdater.getClass();
        Top = newUpdater;
    }

    public DefaultPool(int i) {
        this.capacity = i;
        if (i <= 0) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(i, "capacity should be positive but it is "));
            throw null;
        }
        if (i > 536870911) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        int highestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.maxIndex = highestOneBit;
        this.shift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
        this.instances = new AtomicReferenceArray<>(highestOneBit + 1);
        this.next = new int[highestOneBit + 1];
    }

    private final int popTop() {
        while (true) {
            long j = this.top;
            if (j == 0) {
                return 0;
            }
            long j2 = ((j >> 32) & 4294967295L) + 1;
            int i = (int) (4294967295L & j);
            if (i == 0) {
                return 0;
            }
            DefaultPool<T> defaultPool = this;
            if (Top.compareAndSet(defaultPool, j, (j2 << 32) | this.next[i])) {
                return i;
            }
            this = defaultPool;
        }
    }

    private final void pushTop(int index) {
        if (index <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("index should be positive");
            return;
        }
        while (true) {
            long j = this.top;
            this.next[index] = (int) (4294967295L & j);
            DefaultPool<T> defaultPool = this;
            if (Top.compareAndSet(defaultPool, j, ((((j >> 32) & 4294967295L) + 1) << 32) | index)) {
                return;
            } else {
                this = defaultPool;
            }
        }
    }

    private final T tryPop() {
        int popTop = popTop();
        if (popTop == 0) {
            return null;
        }
        return this.instances.getAndSet(popTop, null);
    }

    private final boolean tryPush(T instance) {
        int identityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.shift) + 1;
        for (int i = 0; i < 8; i++) {
            AtomicReferenceArray<T> atomicReferenceArray = this.instances;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, null, instance)) {
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = this.maxIndex;
                    }
                }
            }
            pushTop(identityHashCode);
            return true;
        }
        return false;
    }

    @Override // kotlinx.io.pool.ObjectPool
    @NotNull
    public final T borrow() {
        T clearInstance;
        T tryPop = tryPop();
        return (tryPop == null || (clearInstance = clearInstance(tryPop)) == null) ? produceInstance() : clearInstance;
    }

    @NotNull
    public T clearInstance(@NotNull T instance) {
        instance.getClass();
        return instance;
    }

    @Override // kotlinx.io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }

    @Override // kotlinx.io.pool.ObjectPool
    public final void dispose() {
        while (true) {
            T tryPop = tryPop();
            if (tryPop == null) {
                return;
            } else {
                disposeInstance(tryPop);
            }
        }
    }

    public void disposeInstance(@NotNull T instance) {
        instance.getClass();
    }

    @Override // kotlinx.io.pool.ObjectPool
    public final int getCapacity() {
        return this.capacity;
    }

    @NotNull
    public abstract T produceInstance();

    @Override // kotlinx.io.pool.ObjectPool
    public final void recycle(@NotNull T instance) {
        instance.getClass();
        validateInstance(instance);
        if (tryPush(instance)) {
            return;
        }
        disposeInstance(instance);
    }

    public void validateInstance(@NotNull T instance) {
        instance.getClass();
    }
}
