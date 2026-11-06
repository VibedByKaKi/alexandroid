package io.ktor.network.selector;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\b\u0002\u0018\u0000 \"*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002\"#B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u000eJ1\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0016H\u0002J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J,\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002R(\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore;", ExifInterface.LONGITUDE_EAST, "", "capacity", "", "(I)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "Lio/ktor/network/selector/Core;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "isEmpty", "", "()Z", "mask", "addLast", "element", "(Ljava/lang/Object;)I", "allocateNextCopy", "state", "", "allocateOrGetNextCopy", "close", "fillPlaceholder", "index", "(ILjava/lang/Object;)Lio/ktor/network/selector/LockFreeMPSCQueueCore;", "markFrozen", "next", "removeFirstOrNull", "removeSlowPath", "oldHead", "newHead", "Companion", "Placeholder", "ktor-network"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
final class LockFreeMPSCQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    private static final int CAPACITY_BITS = 30;
    private static final long CLOSED_MASK = 2305843009213693952L;
    private static final int CLOSED_SHIFT = 61;
    private static final long FROZEN_MASK = 1152921504606846976L;
    private static final int FROZEN_SHIFT = 60;
    private static final long HEAD_MASK = 1073741823;
    private static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    private static final int MAX_CAPACITY_MASK = 1073741823;
    private static final long TAIL_MASK = 1152921503533105152L;
    private static final int TAIL_SHIFT = 30;
    private volatile Object _next = null;
    private volatile long _state = 0;
    private final AtomicReferenceArray<Object> array;
    private final int capacity;
    private final int mask;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Object REMOVE_FROZEN = new Object() { // from class: io.ktor.network.selector.LockFreeMPSCQueueCore$Companion$REMOVE_FROZEN$1
        @NotNull
        public String toString() {
            return "REMOVE_FROZEN";
        }
    };
    private static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeMPSCQueueCore.class, Object.class, "_next");
    private static final AtomicLongFieldUpdater _state$FU = AtomicLongFieldUpdater.newUpdater(LockFreeMPSCQueueCore.class, "_state");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore$Placeholder;", "", "index", "", "(I)V", "ktor-network"}, k = 1, mv = {1, 1, 13})
    public static final class Placeholder {

        @JvmField
        public final int index;

        public Placeholder(int i) {
            this.index = i;
        }
    }

    public LockFreeMPSCQueueCore(int i) {
        this.capacity = i;
        int i2 = i - 1;
        this.mask = i2;
        this.array = new AtomicReferenceArray<>(i);
        if (i2 > 1073741823) {
            Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
        throw null;
    }

    private final LockFreeMPSCQueueCore<E> allocateNextCopy(long state) {
        LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = new LockFreeMPSCQueueCore<>(this.capacity * 2);
        int i = (int) (1073741823 & state);
        int i2 = (int) ((1152921503533105152L & state) >> 30);
        while (true) {
            int i3 = this.mask;
            if ((i & i3) == (i2 & i3)) {
                lockFreeMPSCQueueCore._state = INSTANCE.wo(state, 1152921504606846976L);
                return lockFreeMPSCQueueCore;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = lockFreeMPSCQueueCore.array;
            int i4 = lockFreeMPSCQueueCore.mask & i;
            Object obj = this.array.get(i3 & i);
            if (obj == null) {
                obj = new Placeholder(i);
            }
            atomicReferenceArray.set(i4, obj);
            i++;
        }
    }

    private final LockFreeMPSCQueueCore<E> allocateOrGetNextCopy(long state) {
        while (true) {
            LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = (LockFreeMPSCQueueCore) this._next;
            if (lockFreeMPSCQueueCore != null) {
                return lockFreeMPSCQueueCore;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            LockFreeMPSCQueueCore<E> allocateNextCopy = allocateNextCopy(state);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, allocateNextCopy) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    private final LockFreeMPSCQueueCore<E> fillPlaceholder(int index, E element) {
        Object obj = this.array.get(this.mask & index);
        if (!(obj instanceof Placeholder) || ((Placeholder) obj).index != index) {
            return null;
        }
        this.array.set(index & this.mask, element);
        return this;
    }

    private final long markFrozen() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            long j2 = j | 1152921504606846976L;
            LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = this;
            if (_state$FU.compareAndSet(lockFreeMPSCQueueCore, j, j2)) {
                return j2;
            }
            this = lockFreeMPSCQueueCore;
        }
    }

    private final LockFreeMPSCQueueCore<E> removeSlowPath(int oldHead, int newHead) {
        while (true) {
            long j = this._state;
            int i = (int) (1073741823 & j);
            if (i != oldHead) {
                Single$$ExternalSyntheticBUOutline0.m$2("This queue can have only one consumer");
                return null;
            }
            if ((1152921504606846976L & j) != 0) {
                return this.next();
            }
            LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = this;
            if (_state$FU.compareAndSet(lockFreeMPSCQueueCore, j, INSTANCE.updateHead(j, newHead))) {
                lockFreeMPSCQueueCore.array.set(lockFreeMPSCQueueCore.mask & i, null);
                return null;
            }
            this = lockFreeMPSCQueueCore;
        }
    }

    public final int addLast(@NotNull E element) {
        element.getClass();
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return INSTANCE.addFailReason(j);
            }
            int i = (int) ((1152921503533105152L & j) >> 30);
            int i2 = this.mask;
            if (((i + 2) & i2) == (((int) (1073741823 & j)) & i2)) {
                return 1;
            }
            LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = this;
            if (_state$FU.compareAndSet(lockFreeMPSCQueueCore, j, INSTANCE.updateTail(j, (i + 1) & 1073741823))) {
                lockFreeMPSCQueueCore.array.set(lockFreeMPSCQueueCore.mask & i, element);
                LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore2 = lockFreeMPSCQueueCore;
                while ((lockFreeMPSCQueueCore2._state & 1152921504606846976L) != 0 && (lockFreeMPSCQueueCore2 = lockFreeMPSCQueueCore2.next().fillPlaceholder(i, element)) != null) {
                }
                return 0;
            }
            this = lockFreeMPSCQueueCore;
        }
    }

    public final boolean close() {
        while (true) {
            long j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = this;
            if (_state$FU.compareAndSet(lockFreeMPSCQueueCore, j, j | 2305843009213693952L)) {
                return true;
            }
            this = lockFreeMPSCQueueCore;
        }
    }

    public final boolean isEmpty() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    @NotNull
    public final LockFreeMPSCQueueCore<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    @Nullable
    public final Object removeFirstOrNull() {
        Object obj;
        long j = this._state;
        if ((1152921504606846976L & j) != 0) {
            return REMOVE_FROZEN;
        }
        int i = (int) (1073741823 & j);
        int i2 = this.mask;
        if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i & i2) || (obj = this.array.get(i2 & i)) == null || (obj instanceof Placeholder)) {
            return null;
        }
        int i3 = (i + 1) & 1073741823;
        if (_state$FU.compareAndSet(this, j, INSTANCE.updateHead(j, i3))) {
            this.array.set(this.mask & i, null);
            return obj;
        }
        LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = this;
        do {
            lockFreeMPSCQueueCore = lockFreeMPSCQueueCore.removeSlowPath(i, i3);
        } while (lockFreeMPSCQueueCore != null);
        return obj;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0014\u001a\u00020\u0004*\u00020\tH\u0002J\u0014\u0010\u0015\u001a\u00020\t*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0014\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002JP\u0010\u0019\u001a\u0002H\u001a\"\u0004\b\u0001\u0010\u001a*\u00020\t26\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0004\u0012\u0002H\u001a0\u001cH\u0082\b¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020\t*\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "REMOVE_FROZEN", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "ktor-network"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int addFailReason(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long updateHead(long j, int i) {
            return wo(j, 1073741823L) | i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long updateTail(long j, int i) {
            return wo(j, 1152921503533105152L) | (i << 30);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> T withState(long j, Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) (1073741823 & j)), Integer.valueOf((int) ((j & 1152921503533105152L) >> 30)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long wo(long j, long j2) {
            return j & (~j2);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
