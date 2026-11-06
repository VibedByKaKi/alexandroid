package com.amazon.alexa.seamlessswitching.capability.events;

import com.amazon.alexa.seamlessswitching.capability.model.event.ConnectDeviceFailedEvent;
import com.amazon.alexa.seamlessswitching.capability.model.event.ConnectDeviceSucceededEvent;
import com.amazon.alexa.seamlessswitching.capability.model.event.DisconnectDeviceFailedEvent;
import com.amazon.alexa.seamlessswitching.capability.model.event.DisconnectDeviceSucceededEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface IOComponentsBluetoothEventSender {
    void initialize();

    void sendConnectDeviceFailedEvent(ConnectDeviceFailedEvent connectDeviceFailedEvent);

    void sendConnectDeviceSucceededEvent(ConnectDeviceSucceededEvent connectDeviceSucceededEvent);

    void sendDisconnectDeviceFailedEvent(DisconnectDeviceFailedEvent disconnectDeviceFailedEvent);

    void sendDisconnectDeviceSucceededEvent(DisconnectDeviceSucceededEvent disconnectDeviceSucceededEvent);

    void teardown();
}
