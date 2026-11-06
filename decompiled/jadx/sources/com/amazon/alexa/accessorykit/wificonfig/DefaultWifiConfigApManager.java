package com.amazon.alexa.accessorykit.wificonfig;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.wificonfig.WifiConfigApConnectionError;
import com.amazon.alexa.accessory.wificonfig.WifiConfigApManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DefaultWifiConfigApManager implements WifiConfigApManager {
    public static final String TAG = "DefaultWifiConfigApManager";
    private final WifiP2pManager.Channel channel;
    private final Context context;
    private final Object lock;
    private final WifiConfigApReceiver receiver;

    @VisibleForTesting
    WifiConfigApStatusManager wifiConfigApStatusManager;
    private final WifiP2pManager wifiP2pManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class WifiConfigApReceiver extends BroadcastReceiver {
        public WifiConfigApReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"NewApi"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.net.wifi.p2p.STATE_CHANGED".equals(action) && intent.getIntExtra("wifi_p2p_state", 1) == 2) {
                return;
            }
            WifiP2pGroup wifiP2pGroup = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(action) ? Build.VERSION.SDK_INT < 33 ? (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo") : (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo", WifiP2pGroup.class) : null;
            synchronized (DefaultWifiConfigApManager.this.lock) {
                DefaultWifiConfigApManager.this.wifiConfigApStatusManager.updateConnectionStatus(wifiP2pGroup);
            }
        }
    }

    public DefaultWifiConfigApManager(Context context) {
        Preconditions.notNull(context, "context");
        this.context = context;
        WifiP2pManager wifiP2pManager = (WifiP2pManager) context.getSystemService("wifip2p");
        this.wifiP2pManager = wifiP2pManager;
        this.channel = wifiP2pManager.initialize(context, context.getMainLooper(), null);
        this.receiver = new WifiConfigApReceiver();
        this.lock = new Object();
        this.wifiConfigApStatusManager = new WifiConfigApStatusManager(context);
        addWifiConfigApReceiver();
    }

    private void addWifiConfigApReceiver() {
        IntentFilter m = TableInfo$$ExternalSyntheticOutline0.m("android.net.wifi.p2p.STATE_CHANGED", "android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i < 33) {
            context.registerReceiver(this.receiver, m);
        } else {
            context.registerReceiver(this.receiver, m, 2);
        }
    }

    @SuppressLint({"NewApi"})
    @VisibleForTesting
    public WifiP2pConfig buildWifiP2pConfig(String str, String str2) {
        return new WifiP2pConfig.Builder().setPassphrase(str2).setNetworkName(str).build();
    }

    @Override // com.amazon.alexa.accessory.wificonfig.WifiConfigApManager
    @SuppressLint({"MissingPermission"})
    public void connect(String str, String str2, WifiP2pManager.ActionListener actionListener) throws WifiConfigApConnectionError {
        Preconditions.notNull(str, "ssid");
        Preconditions.notNull(str2, "passPhrase");
        Preconditions.notNull(actionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.lock) {
            this.wifiConfigApStatusManager.checkIfConnectActionValid(str);
            this.wifiP2pManager.connect(this.channel, buildWifiP2pConfig(str, str2), actionListener);
        }
    }

    @Override // com.amazon.alexa.accessory.wificonfig.WifiConfigApManager
    @SuppressLint({"MissingPermission"})
    public void disconnect(String str, WifiP2pManager.ActionListener actionListener) throws WifiConfigApConnectionError {
        Preconditions.notNull(str, "ssid");
        Preconditions.notNull(actionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.lock) {
            this.wifiConfigApStatusManager.checkIfDisconnectActionValid(str);
            this.wifiP2pManager.removeGroup(this.channel, actionListener);
        }
    }
}
