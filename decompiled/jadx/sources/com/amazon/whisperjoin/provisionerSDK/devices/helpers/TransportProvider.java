package com.amazon.whisperjoin.provisionerSDK.devices.helpers;

import com.amazon.whisperbridge.Transport;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public interface TransportProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultTransportProvider implements TransportProvider {
        private final Map<String, Transport> mRadioTransports;

        public DefaultTransportProvider(Map<String, Transport> map) {
            if (map != null) {
                this.mRadioTransports = map;
            } else {
                Single$$ExternalSyntheticBUOutline0.m$3("Radio Transports can not be null");
                throw null;
            }
        }

        @Override // com.amazon.whisperjoin.provisionerSDK.devices.helpers.TransportProvider
        public Transport getTransportForRadio(String str) {
            return this.mRadioTransports.get(str);
        }
    }

    Transport getTransportForRadio(String str);
}
