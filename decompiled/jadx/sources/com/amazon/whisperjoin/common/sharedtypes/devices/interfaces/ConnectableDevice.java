package com.amazon.whisperjoin.common.sharedtypes.devices.interfaces;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ConnectableDevice<TScanResults, TConfiguration, TNetwork, TConnectionDetails, TDeviceNetworkDebugTunnelResponse, TDeviceNetworkDebugTunnelRequest> {
    Future<Void> connectPeripheralNetwork(TNetwork tnetwork);

    Future<Void> connectPeripheralNetworkConfiguration(TConfiguration tconfiguration);

    Future<Void> deleteNetwork(TNetwork tnetwork);

    Future<Void> deleteNetworks();

    Future<TDeviceNetworkDebugTunnelResponse> deviceNetworkDebugTunnel(TDeviceNetworkDebugTunnelRequest tdevicenetworkdebugtunnelrequest);

    Future<TConnectionDetails> getConnectionInformation();

    Future<TScanResults> getVisibleNetworks(int i);

    Future<Void> saveNetwork(TConfiguration tconfiguration);

    Future<Void> startNetworkScan();
}
