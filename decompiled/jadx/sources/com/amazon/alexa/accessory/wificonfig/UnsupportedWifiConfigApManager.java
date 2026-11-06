package com.amazon.alexa.accessory.wificonfig;

import android.net.wifi.p2p.WifiP2pManager;
import com.amazon.alexa.accessory.internal.util.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class UnsupportedWifiConfigApManager implements WifiConfigApManager {
    public static final String TAG = "UnsupportedWifiConfigApManager";

    @Override // com.amazon.alexa.accessory.wificonfig.WifiConfigApManager
    public void connect(String str, String str2, WifiP2pManager.ActionListener actionListener) {
        Logger.w("%s - connect not supported on this platform", TAG);
    }

    @Override // com.amazon.alexa.accessory.wificonfig.WifiConfigApManager
    public void disconnect(String str, WifiP2pManager.ActionListener actionListener) {
        Logger.w("%s - disconnect not supported on this platform", TAG);
    }
}
