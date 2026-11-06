package org.apache.logging.log4j.util;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BooleanSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LazyBoolean implements BooleanSupplier {
    private volatile boolean initialized;
    private final Lock lock = new ReentrantLock();
    private final BooleanSupplier supplier;
    private volatile boolean value;

    public LazyBoolean(BooleanSupplier booleanSupplier) {
        this.supplier = booleanSupplier;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        boolean z = this.initialized;
        boolean z2 = this.value;
        if (z) {
            return z2;
        }
        this.lock.lock();
        try {
            if (!this.initialized) {
                z2 = this.supplier.getAsBoolean();
                this.value = z2;
                this.initialized = true;
            }
            return z2;
        } finally {
            this.lock.unlock();
        }
    }

    public void reset() {
        this.initialized = false;
    }

    public void setAsBoolean(boolean z) {
        this.lock.lock();
        try {
            this.initialized = false;
            this.value = z;
            this.initialized = true;
        } finally {
            this.lock.unlock();
        }
    }
}
