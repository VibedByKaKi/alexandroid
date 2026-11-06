package com.amazon.whisperjoin.softap.wifi.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.os.PatternMatcher;
import com.amazon.whisperjoin.softap.util.Utils;
import com.google.common.base.Optional;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public interface WifiManagerProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultWifiManagerProvider implements WifiManagerProvider {
        private static final String TAG = "DefaultWifiManagerProvider";
        private final ConnectivityManager connectivityManager;
        private ConnectivityManager.NetworkCallback networkCallback = null;
        private final WifiManager wifiManager;

        public DefaultWifiManagerProvider(Context context) {
            this.wifiManager = (WifiManager) context.getSystemService("wifi");
            this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public int addNetwork(WifiConfiguration wifiConfiguration) {
            return this.wifiManager.addNetwork(wifiConfiguration);
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public boolean bindProcessToNetwork(Network network) {
            return this.connectivityManager.bindProcessToNetwork(network);
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public boolean disconnect() {
            return this.wifiManager.disconnect();
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public boolean enableNetwork(int i, boolean z) {
            return this.wifiManager.enableNetwork(i, z);
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        @SuppressLint({"MissingPermission"})
        public List<WifiConfiguration> getConfiguredNetworks() {
            return this.wifiManager.getConfiguredNetworks();
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public Optional<WifiInfo> getConnectionInfo() {
            return Optional.fromNullable(this.wifiManager.getConnectionInfo());
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public Optional<String> getCurrentBssid() {
            Optional<WifiInfo> connectionInfo = getConnectionInfo();
            return connectionInfo.isPresent() ? Optional.fromNullable(connectionInfo.get().getBSSID()) : Optional.absent();
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public Optional<Integer> getCurrentNetworkId() {
            Optional<WifiInfo> connectionInfo = getConnectionInfo();
            return connectionInfo.isPresent() ? Optional.fromNullable(Integer.valueOf(connectionInfo.get().getNetworkId())) : Optional.absent();
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public Optional<String> getCurrentSsid() {
            Optional<WifiInfo> connectionInfo = getConnectionInfo();
            return connectionInfo.isPresent() ? Optional.fromNullable(connectionInfo.get().getSSID()) : Optional.absent();
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public boolean isWifiEnabled() {
            return this.wifiManager.isWifiEnabled();
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public boolean reconnect() {
            return this.wifiManager.reconnect();
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public boolean removeNetwork(int i) {
            return this.wifiManager.removeNetwork(i);
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public void requestWifiNetwork(WifiConfiguration wifiConfiguration, final WifiNetworkCallback wifiNetworkCallback) {
            this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider.DefaultWifiManagerProvider.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    DefaultWifiManagerProvider.this.bindProcessToNetwork(network);
                    wifiNetworkCallback.onWifiAvailable();
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    DefaultWifiManagerProvider.this.unbindProcessToNetwork();
                    wifiNetworkCallback.onWifiUnavailable();
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    DefaultWifiManagerProvider.this.unbindProcessToNetwork();
                    wifiNetworkCallback.onWifiUnavailable();
                }
            };
            NetworkRequest.Builder addTransportType = new NetworkRequest.Builder().addTransportType(1);
            this.connectivityManager.requestNetwork(addTransportType.removeCapability(12).setNetworkSpecifier(new WifiNetworkSpecifier.Builder().setSsidPattern(new PatternMatcher(Utils.getStringWithoutWrappingQuotesIfPresent(wifiConfiguration.SSID), 1)).build()).build(), this.networkCallback);
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public boolean setWifiEnabled(boolean z) {
            return this.wifiManager.setWifiEnabled(z);
        }

        @Override // com.amazon.whisperjoin.softap.wifi.provider.WifiManagerProvider
        public boolean unbindProcessToNetwork() {
            ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
            if (networkCallback != null) {
                this.connectivityManager.unregisterNetworkCallback(networkCallback);
                this.networkCallback = null;
            }
            return this.connectivityManager.bindProcessToNetwork(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WifiNetworkCallback {
        void onWifiAvailable();

        void onWifiUnavailable();
    }

    int addNetwork(WifiConfiguration wifiConfiguration);

    boolean bindProcessToNetwork(Network network);

    boolean disconnect();

    boolean enableNetwork(int i, boolean z);

    List<WifiConfiguration> getConfiguredNetworks();

    Optional<WifiInfo> getConnectionInfo();

    Optional<String> getCurrentBssid();

    Optional<Integer> getCurrentNetworkId();

    Optional<String> getCurrentSsid();

    boolean isWifiEnabled();

    boolean reconnect();

    boolean removeNetwork(int i);

    void requestWifiNetwork(WifiConfiguration wifiConfiguration, WifiNetworkCallback wifiNetworkCallback);

    boolean setWifiEnabled(boolean z);

    boolean unbindProcessToNetwork();
}
