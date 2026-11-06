package com.amazon.alexa.accessory.avsclient.bootup;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface ReadinessSupplier {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onReadyState(boolean z);
    }

    void deregisterReadinessListener(Listener listener);

    void registerReadinessListener(Listener listener);
}
