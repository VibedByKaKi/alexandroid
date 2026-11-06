package com.amazon.whisperjoin.deviceprovisioningservice.wifi;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiKeyManagement;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiNetwork;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WpaPskType;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CurrentWifiNetworkProvider {
    private static final String TAG = "CurrentWifiNetworkProvider";
    private static final String UNKNOWN_SSID = "<unknown ssid>";
    private WifiManager mWifiManager;

    public CurrentWifiNetworkProvider(WifiManager wifiManager) {
        this.mWifiManager = wifiManager;
    }

    private WifiKeyManagement getKeyMgmt(WifiConfiguration wifiConfiguration) {
        return wifiConfiguration.allowedKeyManagement.get(1) ? WifiKeyManagement.WPA_PSK : (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) ? WifiKeyManagement.OTHER : wifiConfiguration.allowedAuthAlgorithms.get(1) ? WifiKeyManagement.WEP : WifiKeyManagement.NONE;
    }

    private WpaPskType getWpaPskType(WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(8) && wifiConfiguration.allowedKeyManagement.get(1)) {
            return WpaPskType.WPA3_TRANSITION;
        }
        if (wifiConfiguration.allowedKeyManagement.get(8)) {
            return WpaPskType.WPA3_ONLY;
        }
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return WpaPskType.WPA2;
        }
        return null;
    }

    public WifiNetwork getCurrentWifiNetwork() {
        WifiInfo connectionInfo = this.mWifiManager.getConnectionInfo();
        if (connectionInfo == null || connectionInfo.getSSID().equals(UNKNOWN_SSID)) {
            WJLog.d(TAG, "No current connection info provided");
            return null;
        }
        List<WifiConfiguration> configuredNetworks = this.mWifiManager.getConfiguredNetworks();
        if (configuredNetworks == null) {
            WJLog.d(TAG, "No system configured networks provided");
            return null;
        }
        int networkId = connectionInfo.getNetworkId();
        for (WifiConfiguration wifiConfiguration : configuredNetworks) {
            if (networkId == wifiConfiguration.networkId) {
                try {
                    WifiNetwork wifiNetwork = new WifiNetwork(wifiConfiguration.SSID, getKeyMgmt(wifiConfiguration), getWpaPskType(wifiConfiguration));
                    WJLog.d(TAG, "Returning " + wifiNetwork.getSsid() + " " + wifiNetwork.getKeyManagement() + " as phone's current network");
                    return wifiNetwork;
                } catch (IllegalArgumentException e) {
                    WJLog.w(TAG, "IllegalArgumentException occurred while getting the current wifi network", e);
                    return null;
                }
            }
        }
        WJLog.d(TAG, "Couldn't find current network");
        return null;
    }
}
