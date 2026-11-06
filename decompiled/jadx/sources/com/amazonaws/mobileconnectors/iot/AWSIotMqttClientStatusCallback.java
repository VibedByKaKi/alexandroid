package com.amazonaws.mobileconnectors.iot;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AWSIotMqttClientStatusCallback {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AWSIotMqttClientStatus {
        Connecting,
        Connected,
        ConnectionLost,
        Reconnecting
    }

    void onStatusChanged(AWSIotMqttClientStatus aWSIotMqttClientStatus, Throwable th);
}
