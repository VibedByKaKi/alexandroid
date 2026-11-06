package com.amazon.alexa.accessorykit.wificonfig;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pGroup;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.wificonfig.WifiConfigApConnectionError;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class WifiConfigApStatusManager {
    private static final String TAG = "WifiConfigApStatusManager";
    private final Context context;

    @VisibleForTesting
    String currentSsid;

    @VisibleForTesting
    boolean isConnected;

    public WifiConfigApStatusManager(Context context) {
        Preconditions.notNull(context, "context");
        this.context = context;
        this.isConnected = false;
        this.currentSsid = null;
    }

    public void checkIfConnectActionValid(String str) throws WifiConfigApConnectionError {
        Preconditions.notNull(str, "ssid");
        String str2 = this.currentSsid;
        if (str2 != null && !str2.equals(str)) {
            throw new WifiConfigApConnectionError(WifiConfigApConnectionError.CONNECTION_BUSY);
        }
        if (this.isConnected) {
            throw new WifiConfigApConnectionError(WifiConfigApConnectionError.ALREADY_CONNECTED);
        }
        List<String> missingP2pPermissions = WifiPermissionUtils.getMissingP2pPermissions(this.context);
        if (missingP2pPermissions.isEmpty()) {
            this.currentSsid = str;
        } else {
            Logger.w("%s – Cannot connect to P2P GO, missing permissions: %s", TAG, missingP2pPermissions);
            throw new WifiConfigApConnectionError(WifiConfigApConnectionError.MISSING_PERMISSIONS);
        }
    }

    public void checkIfDisconnectActionValid(String str) throws WifiConfigApConnectionError {
        String str2;
        Preconditions.notNull(str, "ssid");
        if (!this.isConnected || (str2 = this.currentSsid) == null || !str2.equals(str)) {
            throw new WifiConfigApConnectionError(WifiConfigApConnectionError.NOT_CONNECTED);
        }
    }

    public void updateConnectionStatus(WifiP2pGroup wifiP2pGroup) {
        String str = this.currentSsid;
        boolean z = (str == null || wifiP2pGroup == null || !str.equals(wifiP2pGroup.getNetworkName())) ? false : true;
        if (z != this.isConnected) {
            Logger.d("%s - P2P GO connection changed to: %s", TAG, z ? "connected" : "disconnected");
            this.isConnected = z;
            if (z) {
                return;
            }
            this.currentSsid = null;
        }
    }
}
