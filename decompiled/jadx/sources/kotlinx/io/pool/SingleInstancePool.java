package kotlinx.io.pool;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.accessory.metrics.MetricsConstants;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.io.pool.ObjectPool;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000b\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0016\u001a\u00020\u00122\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0017"}, d2 = {"Lkotlinx/io/pool/SingleInstancePool;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/io/pool/ObjectPool;", "()V", "borrowed", "Lkotlinx/atomicfu/AtomicInt;", "capacity", "", "getCapacity", "()I", MetricsConstants.Firmware.CAUSE_DISPOSED, "Lkotlinx/atomicfu/AtomicBoolean;", AlexaEventBundleKeys.INSTANCE, "Ljava/lang/Object;", "borrow", "()Ljava/lang/Object;", "dispose", "", "disposeInstance", "(Ljava/lang/Object;)V", "produceInstance", "recycle", "kotlinx-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public abstract class SingleInstancePool<T> implements ObjectPool<T> {
    private static final AtomicIntegerFieldUpdater borrowed$FU = AtomicIntegerFieldUpdater.newUpdater(SingleInstancePool.class, "borrowed");
    private static final AtomicIntegerFieldUpdater disposed$FU = AtomicIntegerFieldUpdater.newUpdater(SingleInstancePool.class, MetricsConstants.Firmware.CAUSE_DISPOSED);
    private volatile int borrowed = 0;
    private volatile int disposed = 0;
    private volatile T instance;

    @Override // kotlinx.io.pool.ObjectPool
    @NotNull
    public final T borrow() {
        int i;
        do {
            i = this.borrowed;
            if (i != 0) {
                Single$$ExternalSyntheticBUOutline0.m$2("Instance is already consumed");
                return null;
            }
        } while (!borrowed$FU.compareAndSet(this, i, 1));
        T produceInstance = produceInstance();
        this.instance = produceInstance;
        return produceInstance;
    }

    @Override // kotlinx.io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }

    @Override // kotlinx.io.pool.ObjectPool
    public final void dispose() {
        T t;
        if (!disposed$FU.compareAndSet(this, 0, 1) || (t = this.instance) == null) {
            return;
        }
        this.instance = null;
        disposeInstance(t);
    }

    public abstract void disposeInstance(@NotNull T instance);

    @Override // kotlinx.io.pool.ObjectPool
    public final int getCapacity() {
        return 1;
    }

    @NotNull
    public abstract T produceInstance();

    @Override // kotlinx.io.pool.ObjectPool
    public final void recycle(@NotNull T instance) {
        instance.getClass();
        if (this.instance != instance) {
            if (this.instance != null || this.borrowed == 0) {
                Single$$ExternalSyntheticBUOutline0.m$2("Unable to recycle irrelevant instance");
                return;
            } else {
                Single$$ExternalSyntheticBUOutline0.m$2("Already recycled or an irrelevant instance tried to be recycled");
                return;
            }
        }
        this.instance = null;
        if (disposed$FU.compareAndSet(this, 0, 1)) {
            disposeInstance(instance);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("An instance is already disposed");
        }
    }
}
