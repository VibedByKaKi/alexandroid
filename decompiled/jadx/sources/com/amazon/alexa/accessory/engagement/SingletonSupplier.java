package com.amazon.alexa.accessory.engagement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
abstract class SingletonSupplier<T> {
    private volatile T instance;

    public abstract T generate();

    public final synchronized T supply() {
        try {
            if (this.instance == null) {
                this.instance = generate();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.instance;
    }
}
