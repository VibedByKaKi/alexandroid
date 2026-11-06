package com.amazon.alexa.device.setup.echo.softap.wifi;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.MacAddress;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.net.wifi.WifiNetworkSuggestion;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.amazon.devicesetupservice.smarthome.ProtocolType;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SoftAPWifiManager {
    private static final String TAG = "SoftAPWifiManager";
    private static ConnectivityManager.NetworkCallback networkCallback;
    private AutoConnectState autoConnectState = AutoConnectState.IDLE;
    private ReplaySubject<Boolean> autoConnectSuccess = ReplaySubject.create();
    private ConnectivityManager connectivityManager;
    private Context context;
    private BroadcastReceiver echoConnectionReceiver;
    private LazyComponent<IdentityService> identityService;
    private WifiManager wifiManager;
    private BroadcastReceiver wifiScanReceiver;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.device.setup.echo.softap.wifi.SoftAPWifiManager$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$android$net$NetworkInfo$State;

        static {
            int[] iArr = new int[NetworkInfo.State.values().length];
            $SwitchMap$android$net$NetworkInfo$State = iArr;
            try {
                iArr[NetworkInfo.State.DISCONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$net$NetworkInfo$State[NetworkInfo.State.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$net$NetworkInfo$State[NetworkInfo.State.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AutoConnectException extends Exception {
        public AutoConnectException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AutoConnectState {
        SCANNING,
        IDLE,
        CONNECTING,
        CONNECTED,
        TERMINATED
    }

    public SoftAPWifiManager(Context context, LazyComponent<IdentityService> lazyComponent) {
        this.wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.context = context;
        this.identityService = lazyComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitAutoConnectError(AutoConnectException autoConnectException) {
        ReplaySubject<Boolean> replaySubject = this.autoConnectSuccess;
        if (replaySubject == null || replaySubject.hasComplete() || replaySubject.hasThrowable()) {
            Log.w(TAG, "Skipping onError; auto-connect subject already terminated: " + autoConnectException.getMessage());
            return;
        }
        if (replaySubject.hasObservers()) {
            replaySubject.onError(autoConnectException);
            return;
        }
        Log.w(TAG, "Skipping onError; auto-connect subject has no observers: " + autoConnectException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitAutoConnectSuccess() {
        ReplaySubject<Boolean> replaySubject = this.autoConnectSuccess;
        if (replaySubject == null || replaySubject.hasComplete() || replaySubject.hasThrowable()) {
            Log.w(TAG, "Skipping onNext; auto-connect subject already terminated");
        } else {
            replaySubject.onNext(Boolean.TRUE);
        }
    }

    private ScanResult findClosestDevice(List<ScanResult> list) {
        ScanResult scanResult = null;
        if (list != null) {
            for (ScanResult scanResult2 : list) {
                if (!TextUtils.isEmpty(scanResult2.SSID) && isDopplerSSID(scanResult2.SSID) && (scanResult == null || scanResult.level < scanResult2.level)) {
                    scanResult = scanResult2;
                }
            }
        }
        return scanResult;
    }

    private Network findDopplerNetwork() {
        for (Network network : this.connectivityManager.getAllNetworks()) {
            if (this.connectivityManager.getNetworkInfo(network).getTypeName().equals(ProtocolType.WIFI) && isDopplerSSID(this.wifiManager.getConnectionInfo().getSSID())) {
                return network;
            }
        }
        return null;
    }

    private BroadcastReceiver getEchoConnectionReceiver() {
        if (this.echoConnectionReceiver == null) {
            this.echoConnectionReceiver = new BroadcastReceiver() { // from class: com.amazon.alexa.device.setup.echo.softap.wifi.SoftAPWifiManager.3
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (intent.getAction().equals("android.net.wifi.action.WIFI_NETWORK_SUGGESTION_POST_CONNECTION")) {
                        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                        String replace = SoftAPWifiManager.this.wifiManager.getConnectionInfo().getSSID().replace(DeviceConfigConstants.DOUBLE_QUOTE, "");
                        int i = AnonymousClass4.$SwitchMap$android$net$NetworkInfo$State[networkInfo.getState().ordinal()];
                        if (i == 1 || i == 2) {
                            SoftAPWifiManager.this.unbindNetwork();
                            if (SoftAPWifiManager.this.isDopplerSSID(replace)) {
                                SoftAPWifiManager.this.emitAutoConnectError(new AutoConnectException("Autoconnect to echo failed"));
                                context.unregisterReceiver(this);
                            }
                        }
                    }
                }
            };
        }
        return this.echoConnectionReceiver;
    }

    private BroadcastReceiver getWifiScanReceiver() {
        if (this.wifiScanReceiver == null) {
            this.wifiScanReceiver = new BroadcastReceiver() { // from class: com.amazon.alexa.device.setup.echo.softap.wifi.SoftAPWifiManager.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (SoftAPWifiManager.this.autoConnectState == null || !SoftAPWifiManager.this.autoConnectState.equals(AutoConnectState.SCANNING)) {
                        return;
                    }
                    SoftAPWifiManager.this.autoConnectState = AutoConnectState.IDLE;
                    SoftAPWifiManager.this.context.unregisterReceiver(this);
                    boolean booleanExtra = intent.getBooleanExtra("resultsUpdated", false);
                    SoftAPWifiManager softAPWifiManager = SoftAPWifiManager.this;
                    if (!booleanExtra) {
                        softAPWifiManager.emitAutoConnectError(new AutoConnectException("Autoconnect to echo failed"));
                        return;
                    }
                    boolean hasAccessToAutoConnect = softAPWifiManager.getHasAccessToAutoConnect();
                    SoftAPWifiManager softAPWifiManager2 = SoftAPWifiManager.this;
                    if (hasAccessToAutoConnect) {
                        softAPWifiManager2.scanSuccessUpdatedSDK();
                    } else {
                        softAPWifiManager2.scanSuccessOldSDK();
                    }
                }
            };
        }
        return this.wifiScanReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void scanSuccessOldSDK() {
        WifiConfiguration wifiConfiguration;
        ScanResult findClosestDevice;
        int i;
        this.context.registerReceiver(getEchoConnectionReceiver(), new IntentFilter("android.net.wifi.STATE_CHANGE"));
        try {
            List<ScanResult> scanResults = this.wifiManager.getScanResults();
            wifiConfiguration = new WifiConfiguration();
            findClosestDevice = findClosestDevice(scanResults);
        } catch (SecurityException e) {
            Log.e(TAG, e.getMessage());
        }
        if (findClosestDevice == null) {
            emitAutoConnectError(new AutoConnectException("Autoconnect to echo failed"));
            return;
        }
        wifiConfiguration.SSID = DeviceConfigConstants.DOUBLE_QUOTE + findClosestDevice.SSID + DeviceConfigConstants.DOUBLE_QUOTE;
        wifiConfiguration.allowedKeyManagement.set(0);
        this.wifiManager.addNetwork(wifiConfiguration);
        List<WifiConfiguration> configuredNetworks = this.wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null && !configuredNetworks.isEmpty()) {
            for (WifiConfiguration wifiConfiguration2 : configuredNetworks) {
                String str = wifiConfiguration2.SSID;
                if (str != null) {
                    if (str.equals(DeviceConfigConstants.DOUBLE_QUOTE + findClosestDevice.SSID + DeviceConfigConstants.DOUBLE_QUOTE) && this.autoConnectState.equals(AutoConnectState.IDLE)) {
                        wifiConfiguration2.status = 0;
                        wifiConfiguration2.SSID = findClosestDevice.SSID;
                        wifiConfiguration2.priority = DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE;
                        this.wifiManager.updateNetwork(wifiConfiguration2);
                        this.autoConnectState = AutoConnectState.CONNECTING;
                        i = wifiConfiguration2.networkId;
                        this.wifiManager.disconnect();
                        this.wifiManager.enableNetwork(wifiConfiguration2.networkId, true);
                        this.wifiManager.reconnect();
                        break;
                    }
                }
            }
        }
        i = -1;
        if (i == -1) {
            WifiConfiguration wifiConfiguration3 = new WifiConfiguration();
            wifiConfiguration3.SSID = DeviceConfigConstants.DOUBLE_QUOTE + findClosestDevice.SSID + DeviceConfigConstants.DOUBLE_QUOTE;
            wifiConfiguration3.allowedKeyManagement.set(0);
            wifiConfiguration3.status = 0;
            int addNetwork = this.wifiManager.addNetwork(wifiConfiguration3);
            if (addNetwork == -1) {
                emitAutoConnectError(new AutoConnectException("Auto connect to echo failed"));
                return;
            } else {
                this.wifiManager.disconnect();
                this.wifiManager.enableNetwork(addNetwork, true);
                this.wifiManager.reconnect();
            }
        }
        if (this.autoConnectState != AutoConnectState.CONNECTING) {
            emitAutoConnectError(new AutoConnectException("Autoconnect to echo failed"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission", "NewApi"})
    public void scanSuccessUpdatedSDK() {
        ArrayList arrayList;
        WifiConfiguration wifiConfiguration;
        ScanResult findClosestDevice;
        try {
            List<ScanResult> scanResults = this.wifiManager.getScanResults();
            arrayList = new ArrayList();
            wifiConfiguration = new WifiConfiguration();
            findClosestDevice = findClosestDevice(scanResults);
        } catch (SecurityException e) {
            Log.e(TAG, e.getMessage());
        }
        if (findClosestDevice == null) {
            emitAutoConnectError(new AutoConnectException("Autoconnect to echo failed"));
            return;
        }
        wifiConfiguration.SSID = DeviceConfigConstants.DOUBLE_QUOTE + findClosestDevice.SSID + DeviceConfigConstants.DOUBLE_QUOTE;
        wifiConfiguration.allowedKeyManagement.set(0);
        arrayList.add(new WifiNetworkSuggestion.Builder().setSsid(findClosestDevice.SSID).setIsAppInteractionRequired(true).build());
        this.autoConnectState = AutoConnectState.CONNECTING;
        if (this.wifiManager.addNetworkSuggestions(arrayList) != 0) {
            emitAutoConnectError(new AutoConnectException("Auto connect to echo failed"));
            return;
        }
        NetworkRequest build = new NetworkRequest.Builder().addTransportType(1).removeCapability(12).setNetworkSpecifier(new WifiNetworkSpecifier.Builder().setSsid(findClosestDevice.SSID).setBssid(MacAddress.fromString(findClosestDevice.BSSID)).build()).build();
        ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
        if (networkCallback2 != null) {
            this.connectivityManager.unregisterNetworkCallback(networkCallback2);
        }
        ConnectivityManager.NetworkCallback networkCallback3 = new ConnectivityManager.NetworkCallback() { // from class: com.amazon.alexa.device.setup.echo.softap.wifi.SoftAPWifiManager.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NonNull Network network) {
                super.onAvailable(network);
                Objects.toString(network);
                SoftAPWifiManager.this.connectivityManager.bindProcessToNetwork(network);
                SoftAPWifiManager.this.autoConnectState = AutoConnectState.CONNECTED;
                SoftAPWifiManager.this.emitAutoConnectSuccess();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NonNull Network network) {
                super.onLost(network);
                Log.w(SoftAPWifiManager.TAG, "onLost: network=" + network + ", unbinding process");
                SoftAPWifiManager.this.unbindNetwork();
                SoftAPWifiManager.this.connectivityManager.bindProcessToNetwork(null);
                SoftAPWifiManager.this.connectivityManager.unregisterNetworkCallback(SoftAPWifiManager.networkCallback);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                super.onUnavailable();
                Log.w(SoftAPWifiManager.TAG, "onUnavailable: network request could not be fulfilled");
                SoftAPWifiManager.this.unbindNetwork();
                SoftAPWifiManager.this.emitAutoConnectError(new AutoConnectException("Autoconnect to echo failed"));
            }
        };
        networkCallback = networkCallback3;
        this.connectivityManager.requestNetwork(build, networkCallback3);
        if (this.autoConnectState != AutoConnectState.CONNECTING) {
            emitAutoConnectError(new AutoConnectException("Autoconnect to echo failed"));
        }
    }

    public boolean bindToEchoNetwork() {
        for (Network network : this.connectivityManager.getAllNetworks()) {
            if (this.connectivityManager.getNetworkInfo(network).getTypeName().equals(ProtocolType.WIFI) && isDopplerSSID(this.wifiManager.getConnectionInfo().getSSID())) {
                return this.connectivityManager.bindProcessToNetwork(network);
            }
        }
        return false;
    }

    public void clearAutoConnectReceivers() {
        try {
            try {
                BroadcastReceiver broadcastReceiver = this.wifiScanReceiver;
                if (broadcastReceiver != null) {
                    this.context.unregisterReceiver(broadcastReceiver);
                }
            } catch (Exception e) {
                Log.w(TAG, "Failed to unregister wifiScanReceiver", e);
            }
            try {
                try {
                    BroadcastReceiver broadcastReceiver2 = this.echoConnectionReceiver;
                    if (broadcastReceiver2 != null) {
                        this.context.unregisterReceiver(broadcastReceiver2);
                    }
                } catch (Exception e2) {
                    Log.w(TAG, "Failed to unregister echoConnectionReceiver", e2);
                }
            } finally {
                this.echoConnectionReceiver = null;
            }
        } finally {
            this.wifiScanReceiver = null;
        }
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    public void disassociateFromDoppler() {
        boolean hasAccessToAutoConnect = getHasAccessToAutoConnect();
        WifiManager wifiManager = this.wifiManager;
        if (hasAccessToAutoConnect) {
            wifiManager.removeNetworkSuggestions(Collections.EMPTY_LIST);
            return;
        }
        String replace = wifiManager.getConnectionInfo().getSSID().replace(DeviceConfigConstants.DOUBLE_QUOTE, "");
        if (isDopplerSSID(replace)) {
            for (WifiConfiguration wifiConfiguration : this.wifiManager.getConfiguredNetworks()) {
                if (!TextUtils.isEmpty(wifiConfiguration.SSID) && wifiConfiguration.SSID.replace(DeviceConfigConstants.DOUBLE_QUOTE, "").equals(replace) && wifiConfiguration.status == 0) {
                    wifiConfiguration.status = 2;
                    this.wifiManager.updateNetwork(wifiConfiguration);
                }
            }
        }
    }

    public ReplaySubject<Boolean> getAutoConnectSuccessSubject() {
        return this.autoConnectSuccess;
    }

    public OkHttpClient getBoundClient() {
        SocketFactory socketFactory;
        SocketFactory socketFactory2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        try {
            Network boundNetworkForProcess = this.connectivityManager.getBoundNetworkForProcess();
            if (boundNetworkForProcess != null && (socketFactory2 = boundNetworkForProcess.getSocketFactory()) != null) {
                return new OkHttpClient.Builder().socketFactory(socketFactory2).connectTimeout(20L, timeUnit).readTimeout(20L, timeUnit).build();
            }
        } catch (Exception e) {
            Log.w(TAG, "getBoundClient: error using bound network", e);
        }
        try {
            Network findDopplerNetwork = this.findDopplerNetwork();
            if (findDopplerNetwork != null && (socketFactory = findDopplerNetwork.getSocketFactory()) != null) {
                return new OkHttpClient.Builder().socketFactory(socketFactory).connectTimeout(20L, timeUnit).readTimeout(20L, timeUnit).build();
            }
        } catch (Exception e2) {
            Log.w(TAG, "getBoundClient: error using findDopplerNetwork", e2);
        }
        Log.e(TAG, "getBoundClient: returning null - no network available for Echo communication");
        return null;
    }

    public boolean getHasAccessToAutoConnect() {
        return this.identityService.get().getUser(TAG).getFeatures().contains("DEVICE_SETUP_AUTOCONNECT_ANDROID");
    }

    public void initializeAutoConnectToEcho() {
        this.context.registerReceiver(getWifiScanReceiver(), ErrorUtils$$ExternalSyntheticOutline0.m("android.net.wifi.SCAN_RESULTS"));
        if (this.wifiManager.startScan()) {
            this.autoConnectState = AutoConnectState.SCANNING;
        } else {
            clearAutoConnectReceivers();
            emitAutoConnectError(new AutoConnectException("Scan failure"));
        }
    }

    public boolean isDopplerSSID(@NonNull String str) {
        String[] strArr = {"Amazon-", "DIRECT-dp-", "Echo-"};
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            if (str.replace(DeviceConfigConstants.DOUBLE_QUOTE, "").contains(str2) || str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public void resetAutoConnectSubject() {
        this.autoConnectSuccess = ReplaySubject.create();
        this.autoConnectState = AutoConnectState.IDLE;
    }

    public void unbindNetwork() {
        if (this.connectivityManager.getBoundNetworkForProcess() != null) {
            this.connectivityManager.bindProcessToNetwork(null);
        }
    }
}
