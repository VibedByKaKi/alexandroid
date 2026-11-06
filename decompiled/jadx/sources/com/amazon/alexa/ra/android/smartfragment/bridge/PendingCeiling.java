package com.amazon.alexa.ra.android.smartfragment.bridge;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/PendingCeiling;", "", "maxPending", "", "<init>", "(I)V", JoinPoint.SYNCHRONIZATION_LOCK, "pending", "tryReserve", "", "release", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PendingCeiling {
    public static final int $stable = 8;

    @NotNull
    private final Object lock = new Object();
    private final int maxPending;
    private int pending;

    public PendingCeiling(int i) {
        this.maxPending = i;
    }

    public final void release() {
        synchronized (this.lock) {
            this.pending = Math.max(0, this.pending - 1);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean tryReserve() {
        synchronized (this.lock) {
            int i = this.pending;
            if (i >= this.maxPending) {
                return false;
            }
            this.pending = i + 1;
            return true;
        }
    }
}
