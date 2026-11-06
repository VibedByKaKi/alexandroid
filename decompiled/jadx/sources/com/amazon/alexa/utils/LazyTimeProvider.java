package com.amazon.alexa.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LazyTimeProvider implements Provider<TimeProvider> {
    private TimeProvider timeProvider;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.utils.Provider
    public synchronized TimeProvider get() {
        try {
            if (this.timeProvider == null) {
                this.timeProvider = new TimeProvider();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.timeProvider;
    }
}
