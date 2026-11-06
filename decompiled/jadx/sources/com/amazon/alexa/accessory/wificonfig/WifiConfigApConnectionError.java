package com.amazon.alexa.accessory.wificonfig;

import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class WifiConfigApConnectionError extends Exception {
    public static final String ALREADY_CONNECTED = "Connection failed because device is already connected to P2P GO";
    public static final String CONNECTION_BUSY = "Connection failed because another device is already connected to P2P GO";
    public static final String FRAMEWORK_BUSY = "Connection request failed because framework is busy";
    public static final String INTERNAL_ERROR = "Connection request failed due to an internal error";
    public static final String MISSING_PERMISSIONS = "Connection failed due to missing necessary runtime permissions";
    public static final String NOT_CONNECTED = "Disconnection failed because device is not connected to P2P GO";
    public static final String P2P_UNSUPPORTED = "Connection request failed because P2P is unsupported on device";
    public static final String UNKNOWN = "Unknown error in P2P GO connection";

    public WifiConfigApConnectionError(String str) {
        super(str);
    }

    public static WifiConfigApConnectionError wifiP2pToWiFiConfigApConnectionError(int i) {
        Preconditions.notNull(Integer.valueOf(i), "wifiP2pError");
        return new WifiConfigApConnectionError(i != 0 ? i != 1 ? i != 2 ? UNKNOWN : FRAMEWORK_BUSY : P2P_UNSUPPORTED : INTERNAL_ERROR);
    }
}
