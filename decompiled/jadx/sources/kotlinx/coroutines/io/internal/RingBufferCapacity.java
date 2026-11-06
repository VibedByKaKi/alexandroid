package kotlinx.coroutines.io.internal;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.presence.service.PresenceJobService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0012J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0003R\u0012\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/io/internal/RingBufferCapacity;", "", "totalCapacity", "", "(I)V", "availableForRead", "availableForWrite", "pendingToFlush", "completeRead", "", "n", "completeReadOverflow", "", "pending", "remaining", "update", "completeWrite", PresenceJobService.ACTION_REFRESH_FLUSH_KEY, "", "forceLockForRelease", "isEmpty", "isFull", "resetForRead", "resetForWrite", "tryLockForRelease", "tryReadAtMost", "tryReadExact", "tryWriteAtLeast", "tryWriteAtMost", "tryWriteExact", "Companion", "kotlinx-coroutines-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class RingBufferCapacity {
    private static final AtomicIntegerFieldUpdater<RingBufferCapacity> AvailableForRead;
    private static final AtomicIntegerFieldUpdater<RingBufferCapacity> AvailableForWrite;
    private static final AtomicIntegerFieldUpdater<RingBufferCapacity> PendingToFlush;

    @JvmField
    public volatile int availableForRead;

    @JvmField
    public volatile int availableForWrite;

    @JvmField
    public volatile int pendingToFlush;
    private final int totalCapacity;

    static {
        AtomicIntegerFieldUpdater<RingBufferCapacity> newUpdater = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, RingBufferCapacity$Companion$AvailableForRead$1.INSTANCE.getName());
        newUpdater.getClass();
        AvailableForRead = newUpdater;
        AtomicIntegerFieldUpdater<RingBufferCapacity> newUpdater2 = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, RingBufferCapacity$Companion$AvailableForWrite$1.INSTANCE.getName());
        newUpdater2.getClass();
        AvailableForWrite = newUpdater2;
        AtomicIntegerFieldUpdater<RingBufferCapacity> newUpdater3 = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, RingBufferCapacity$Companion$PendingToFlush$1.INSTANCE.getName());
        newUpdater3.getClass();
        PendingToFlush = newUpdater3;
    }

    public RingBufferCapacity(int i) {
        this.totalCapacity = i;
        this.availableForWrite = i;
    }

    private final Void completeReadOverflow(int remaining, int update, int n) {
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(remaining, n, "Completed read overflow: ", " + ", " = ");
        m29m.append(update);
        m29m.append(" > ");
        m29m.append(this.totalCapacity);
        throw new IllegalArgumentException(m29m.toString());
    }

    public final void completeRead(int n) {
        int i;
        int i2;
        int i3 = this.totalCapacity;
        AtomicIntegerFieldUpdater<RingBufferCapacity> atomicIntegerFieldUpdater = AvailableForWrite;
        do {
            i = this.availableForWrite;
            i2 = i + n;
            if (i2 > i3) {
                completeReadOverflow(i, i2, n);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
    }

    public final void completeWrite(int n) {
        int i;
        int i2;
        int i3 = this.totalCapacity;
        AtomicIntegerFieldUpdater<RingBufferCapacity> atomicIntegerFieldUpdater = PendingToFlush;
        do {
            i = this.pendingToFlush;
            i2 = i + n;
            if (i2 > i3) {
                completeReadOverflow(i, n);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
    }

    public final boolean flush() {
        int i;
        int i2;
        AtomicIntegerFieldUpdater<RingBufferCapacity> atomicIntegerFieldUpdater = AvailableForRead;
        int andSet = PendingToFlush.getAndSet(this, 0);
        do {
            i = this.availableForRead;
            i2 = i + andSet;
            if (i == i2) {
                break;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
        return i2 > 0;
    }

    public final void forceLockForRelease() {
        AvailableForWrite.getAndSet(this, 0);
    }

    public final boolean isEmpty() {
        return this.availableForWrite == this.totalCapacity;
    }

    public final boolean isFull() {
        return this.availableForWrite == 0;
    }

    public final void resetForRead() {
        this.availableForRead = this.totalCapacity;
        this.availableForWrite = 0;
        this.pendingToFlush = 0;
    }

    public final void resetForWrite() {
        this.availableForRead = 0;
        this.availableForWrite = this.totalCapacity;
        this.pendingToFlush = 0;
    }

    public final boolean tryLockForRelease() {
        int i;
        AtomicIntegerFieldUpdater<RingBufferCapacity> atomicIntegerFieldUpdater = AvailableForWrite;
        do {
            i = this.availableForWrite;
            if (this.pendingToFlush > 0 || this.availableForRead > 0 || i != this.totalCapacity) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 0));
        return true;
    }

    public final int tryReadAtMost(int n) {
        int i;
        int min;
        AtomicIntegerFieldUpdater<RingBufferCapacity> atomicIntegerFieldUpdater = AvailableForRead;
        do {
            i = this.availableForRead;
            min = Math.min(n, i);
            if (min == 0) {
                return 0;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i - min));
        return min;
    }

    public final boolean tryReadExact(int n) {
        int i;
        AtomicIntegerFieldUpdater<RingBufferCapacity> atomicIntegerFieldUpdater = AvailableForRead;
        do {
            i = this.availableForRead;
            if (i < n) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i - n));
        return true;
    }

    public final int tryWriteAtLeast(int n) {
        int i;
        AtomicIntegerFieldUpdater<RingBufferCapacity> atomicIntegerFieldUpdater = AvailableForWrite;
        do {
            i = this.availableForWrite;
            if (i < n) {
                return 0;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 0));
        return i;
    }

    public final int tryWriteAtMost(int n) {
        int i;
        int min;
        AtomicIntegerFieldUpdater<RingBufferCapacity> atomicIntegerFieldUpdater = AvailableForWrite;
        do {
            i = this.availableForWrite;
            min = Math.min(n, i);
            if (min == 0) {
                return 0;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i - min));
        return min;
    }

    public final boolean tryWriteExact(int n) {
        int i;
        AtomicIntegerFieldUpdater<RingBufferCapacity> atomicIntegerFieldUpdater = AvailableForWrite;
        do {
            i = this.availableForWrite;
            if (i < n) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i - n));
        return true;
    }

    private final Void completeReadOverflow(int pending, int n) {
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(pending, n, "Complete write overflow: ", " + ", " > ");
        m29m.append(this.totalCapacity);
        throw new IllegalArgumentException(m29m.toString());
    }
}
