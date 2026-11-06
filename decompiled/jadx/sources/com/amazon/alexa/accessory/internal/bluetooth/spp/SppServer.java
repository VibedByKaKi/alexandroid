package com.amazon.alexa.accessory.internal.bluetooth.spp;

import android.bluetooth.BluetoothSocket;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface SppServer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onSppClientConnected(BluetoothSocket bluetoothSocket);

        void onSppServerFailed(Throwable th);

        void onSppServerStarted();

        void onSppServerStopped();
    }

    void setListener(Listener listener);

    void start();

    void stop();
}
