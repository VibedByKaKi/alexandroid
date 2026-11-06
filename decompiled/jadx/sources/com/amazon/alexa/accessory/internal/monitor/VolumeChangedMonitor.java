package com.amazon.alexa.accessory.internal.monitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface VolumeChangedMonitor {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Observer {
        void onVolumeChanged();
    }

    void addObserver(Observer observer);

    void removeObserver(Observer observer);
}
