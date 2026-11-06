package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004¨\u0006\u0014"}, d2 = {"Lkotlinx/atomicfu/AtomicBoolean;", "", "v", "", "(Z)V", "_value", "", "value", "getValue", "()Z", "setValue", "compareAndSet", "expect", "update", "getAndSet", "lazySet", "", "toString", "", "Companion", "atomicfu"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class AtomicBoolean {
    private static final AtomicIntegerFieldUpdater<AtomicBoolean> FU = AtomicIntegerFieldUpdater.newUpdater(AtomicBoolean.class, "_value");
    private volatile int _value;

    public AtomicBoolean(boolean z) {
        this._value = z ? 1 : 0;
    }

    public final boolean compareAndSet(boolean expect, boolean update) {
        InterceptorKt.getInterceptor().beforeUpdate(this);
        boolean compareAndSet = FU.compareAndSet(this, expect ? 1 : 0, update ? 1 : 0);
        if (compareAndSet) {
            InterceptorKt.getInterceptor().afterRMW(this, expect, update);
        }
        return compareAndSet;
    }

    public final boolean getAndSet(boolean value) {
        InterceptorKt.getInterceptor().beforeUpdate(this);
        int andSet = FU.getAndSet(this, value ? 1 : 0);
        InterceptorKt.getInterceptor().afterRMW(this, andSet == 1, value);
        return andSet == 1;
    }

    public final boolean getValue() {
        return this._value != 0;
    }

    public final void lazySet(boolean value) {
        InterceptorKt.getInterceptor().beforeUpdate(this);
        FU.lazySet(this, value ? 1 : 0);
        InterceptorKt.getInterceptor().afterSet(this, value);
    }

    public final void setValue(boolean z) {
        InterceptorKt.getInterceptor().beforeUpdate(this);
        this._value = z ? 1 : 0;
        InterceptorKt.getInterceptor().afterSet(this, z);
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
