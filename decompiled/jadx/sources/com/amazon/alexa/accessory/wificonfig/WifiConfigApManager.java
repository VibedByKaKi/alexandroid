package com.amazon.alexa.accessory.wificonfig;

import android.net.wifi.p2p.WifiP2pManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface WifiConfigApManager {
    void connect(String str, String str2, WifiP2pManager.ActionListener actionListener) throws WifiConfigApConnectionError;

    void disconnect(String str, WifiP2pManager.ActionListener actionListener) throws WifiConfigApConnectionError;
}
