package com.amazon.alexa.accessory.monitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface CallNotificationStateMonitor {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Observer {
        void onCallStatusChanged(int i);
    }

    void addObserver(Observer observer);

    int getCallNotificationStatus();

    void removeObserver(Observer observer);
}
