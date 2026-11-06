package com.amazon.alexa.utils.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class utilszZm extends FutureTask {
    public final Object utilszZm;

    public utilszZm(Callable callable) {
        super(callable);
        this.utilszZm = callable;
    }

    @Override // java.util.concurrent.FutureTask
    public final String toString() {
        return this.utilszZm.toString();
    }

    public utilszZm(Runnable runnable, Object obj) {
        super(runnable, obj);
        this.utilszZm = runnable;
    }
}
