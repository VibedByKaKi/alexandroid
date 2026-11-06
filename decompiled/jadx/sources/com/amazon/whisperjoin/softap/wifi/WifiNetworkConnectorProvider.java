package com.amazon.whisperjoin.softap.wifi;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import com.amazon.whisperjoin.softap.wifi.WifiNetworkConnector;
import com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public interface WifiNetworkConnectorProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultWifiNetworkConnectorProvider implements WifiNetworkConnectorProvider {
        @Override // com.amazon.whisperjoin.softap.wifi.WifiNetworkConnectorProvider
        public WifiNetworkConnector buildConnector(WifiConfiguration wifiConfiguration, WifiManagerProvider wifiManagerProvider, WifiNetworkConnector.OnConnectionListener onConnectionListener, Context context) {
            return new WifiNetworkConnector(wifiConfiguration, wifiManagerProvider, onConnectionListener, context);
        }
    }

    WifiNetworkConnector buildConnector(WifiConfiguration wifiConfiguration, WifiManagerProvider wifiManagerProvider, WifiNetworkConnector.OnConnectionListener onConnectionListener, Context context);
}
