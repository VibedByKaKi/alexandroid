package com.amazon.whisperjoin.softap.wifi;

import com.amazon.whisperjoin.softap.wifi.WifiNetworkConnector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public interface SoftApNetworkStateController {
    void connectToSoftAp(WifiNetworkConnector.OnConnectionListener onConnectionListener, String str);

    void connectToSoftAp(WifiNetworkConnector.OnConnectionListener onConnectionListener, String str, String str2);

    void restoreNetworkState();

    void saveNetworkState();
}
