package kotlinx.atomicfu;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0014B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016R&\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0015"}, d2 = {"Lkotlinx/atomicfu/AtomicRef;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "setValue", "Ljava/lang/Object;", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getAndSet", "(Ljava/lang/Object;)Ljava/lang/Object;", "lazySet", "", "toString", "", "Companion", "atomicfu"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class AtomicRef<T> {
    private static final AtomicReferenceFieldUpdater<AtomicRef<?>, Object> FU = AtomicReferenceFieldUpdater.newUpdater(AtomicRef.class, Object.class, "value");
    private volatile T value;

    public AtomicRef(T t) {
        this.value = t;
    }

    public final boolean compareAndSet(T expect, T update) {
        boolean z;
        InterceptorKt.getInterceptor().beforeUpdate(this);
        AtomicReferenceFieldUpdater<AtomicRef<?>, Object> atomicReferenceFieldUpdater = FU;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, expect, update)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != expect) {
                z = false;
                break;
            }
        }
        if (z) {
            InterceptorKt.getInterceptor().afterRMW(this, expect, update);
        }
        return z;
    }

    public final T getAndSet(T value) {
        InterceptorKt.getInterceptor().beforeUpdate(this);
        T t = (T) FU.getAndSet(this, value);
        InterceptorKt.getInterceptor().afterRMW(this, t, value);
        return t;
    }

    public final T getValue() {
        return this.value;
    }

    public final void lazySet(T value) {
        InterceptorKt.getInterceptor().beforeUpdate(this);
        FU.lazySet(this, value);
        InterceptorKt.getInterceptor().afterSet((AtomicRef<AtomicRef<T>>) this, (AtomicRef<T>) value);
    }

    public final void setValue(T t) {
        InterceptorKt.getInterceptor().beforeUpdate(this);
        this.value = t;
        InterceptorKt.getInterceptor().afterSet((AtomicRef<AtomicRef<T>>) this, (AtomicRef<T>) t);
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.value);
    }
}
