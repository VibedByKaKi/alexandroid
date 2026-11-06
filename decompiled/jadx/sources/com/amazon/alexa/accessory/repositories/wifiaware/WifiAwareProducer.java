package com.amazon.alexa.accessory.repositories.wifiaware;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.Wifiaware;
import com.amazon.alexa.accessory.protocol.Wificommon;
import com.amazon.alexa.accessory.repositories.Producer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface WifiAwareProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleBootstrapWiFiAware(List<Wifiaware.WiFiAwareVersion> list, String str, Wificommon.WiFiCredentialType wiFiCredentialType, Producer.Result<Wifiaware.BootstrapWiFiAwareResponse> result);

        void handleRemoveWiFiAwarePairing(String str, Producer.Result<Common.ErrorCode> result);

        void handleStartWiFiAware(String str, Producer.Result<Wifiaware.StartWiFiAwareResponse> result);

        void handleStopWiFiAware(String str, String str2, Producer.Result<Common.ErrorCode> result);
    }
}
