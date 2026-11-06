package com.amazon.alexa.accessory.repositories.wificonfig;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.Wificonfig;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface WifiConfigProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleConnectToWiFiConfigAp(String str, String str2, Producer.Result<Common.ErrorCode> result);

        void handleDisconnectFromWiFiConfigAp(String str, Producer.Result<Common.ErrorCode> result);

        void handleForgetWiFiNetwork(int i, byte[] bArr, Producer.Result<Common.ErrorCode> result);

        void handleGetSavedWiFiNetworks(Producer.Result<Wificonfig.GetSavedWiFiNetworksResponse> result);

        void handleGetWiFiConfigApDetails(Producer.Result<Wificonfig.GetWiFiConfigAPDetailsResponse> result);

        void handleStartWiFiConfigAp(Wificonfig.WiFiConfigAPSetting wiFiConfigAPSetting, Producer.Result<Wificonfig.StartWiFiConfigAPResponse> result);

        void handleStopWiFiConfigAp(Producer.Result<Common.ErrorCode> result);
    }
}
