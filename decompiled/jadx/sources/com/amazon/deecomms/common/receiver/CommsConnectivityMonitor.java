package com.amazon.deecomms.common.receiver;

import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.comms.log.CommsLogger;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.util.StatePoller;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsConnectivityMonitor {
    private static final long AVAILABLE_NOT_READY_MS = 100;
    private static final long AVAILABLE_READY_MS = 0;
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CommsConnectivityMonitor.class);
    private static final long LOST_NOT_CONNECTED_MS = 1000;
    private static final long LOST_STILL_CONNECTED_MS = 0;
    private static final long POLL_SLEEP_MS = 100;
    private static final String TYPE_MOBILE = "Mobile";
    private static final String TYPE_WIFI = "Wifi";
    private final NetworkRequest.Builder REQUEST_BUILDER_MOBILE;
    private final NetworkRequest.Builder REQUEST_BUILDER_WIFI;
    private final AtomicReference<ConnectionType> connectionType;
    private final ConnectivityManager connectivityManager;
    private final Handler handler;
    private final Set<OnConnectionTypeChangedListener> listeners;
    private final NetworkCallback mobileNetworkCallback;
    private final Runnable networkChanged;
    private final PackageManager packageManager;
    private final AtomicBoolean subscribed;
    private final TelephonyManager telephonyManager;
    private final NetworkCallback wifiNetworkCallback;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConnectionType {
        NotConnected(0),
        Cellular(1),
        Wifi(1),
        CellularAndWifi(2);

        private final int connectionCount;

        ConnectionType(int i) {
            this.connectionCount = i;
        }

        public int getConnectionCount() {
            return this.connectionCount;
        }

        public boolean hasCellular() {
            return this == Cellular || this == CellularAndWifi;
        }

        public boolean hasWifi() {
            return this == Wifi || this == CellularAndWifi;
        }

        public boolean isConnected() {
            return this.connectionCount > 0;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class NetworkCallback extends SafeNetworkCallback {
        public NetworkCallback(@NonNull String str, @NonNull NetworkRequest.Builder builder) {
            super(str, builder);
        }

        private void checkForNetworkChange(long j) {
            CommsConnectivityMonitor.LOG.v("checkForNetworkChange: delay=" + j);
            CommsConnectivityMonitor commsConnectivityMonitor = CommsConnectivityMonitor.this;
            commsConnectivityMonitor.handler.removeCallbacks(commsConnectivityMonitor.networkChanged);
            CommsConnectivityMonitor commsConnectivityMonitor2 = CommsConnectivityMonitor.this;
            if (j > 0) {
                commsConnectivityMonitor2.handler.postDelayed(commsConnectivityMonitor2.networkChanged, j);
            } else {
                commsConnectivityMonitor2.handler.post(commsConnectivityMonitor2.networkChanged);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@Nullable Network network) {
            if (network == null) {
                CommsConnectivityMonitor.LOG.e("onAvailable: null network");
                return;
            }
            CommsConnectivityMonitor.LOG.i("onAvailable: " + CommsConnectivityMonitor.this.logNetwork(network));
            NetworkInfo networkInfo = CommsConnectivityMonitor.this.connectivityManager.getNetworkInfo(network);
            if (networkInfo == null || CommsConnectivityMonitor.this.isNetworkUsable(networkInfo.getTypeName(), networkInfo)) {
                checkForNetworkChange(0L);
            } else {
                checkForNetworkChange(100L);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@Nullable Network network) {
            if (network == null) {
                CommsConnectivityMonitor.LOG.e("onLost: null network");
                return;
            }
            CommsLogger commsLogger = CommsConnectivityMonitor.LOG;
            commsLogger.d("onLost: " + CommsConnectivityMonitor.this.logNetwork(network));
            if (CommsConnectivityMonitor.this.determineConnectionType() != ConnectionType.NotConnected) {
                checkForNetworkChange(0L);
            } else {
                commsLogger.d("onLost: posting delayed message for nothing connected");
                checkForNetworkChange(1000L);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnConnectionTypeChangedListener {
        void onConnectionTypeChanged(@NonNull ConnectionType connectionType, @NonNull ConnectionType connectionType2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public final class Poller extends StatePoller {
        public Poller() {
        }

        @Override // com.amazon.deecomms.common.util.StatePoller
        @NonNull
        public CommsLogger getPollerLogger() {
            return CommsConnectivityMonitor.LOG;
        }

        @Override // com.amazon.deecomms.common.util.StatePoller
        public long getPollerSleepTime() {
            return 100L;
        }

        @Override // com.amazon.deecomms.common.util.StatePoller
        public boolean isInExpectedState() {
            return CommsConnectivityMonitor.this.isConnected();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public class SafeNetworkCallback extends ConnectivityManager.NetworkCallback {
        private final NetworkRequest.Builder networkRequestBuilder;
        private final String networkType;
        private boolean registered = false;

        @VisibleForTesting
        public SafeNetworkCallback(@NonNull String str, @NonNull NetworkRequest.Builder builder) {
            this.networkType = str;
            this.networkRequestBuilder = builder;
        }

        @VisibleForTesting
        public synchronized void register() {
            if (this.registered) {
                CommsConnectivityMonitor.LOG.e("Network callback already requested or registered for " + this.networkType);
                return;
            }
            CommsConnectivityMonitor.this.connectivityManager.registerNetworkCallback(this.networkRequestBuilder.build(), this);
            CommsConnectivityMonitor.LOG.i("Registered for network callbacks for " + this.networkType);
            this.registered = true;
        }

        @VisibleForTesting
        public synchronized void unregister() {
            if (!this.registered) {
                CommsConnectivityMonitor.LOG.e("Network callback already unregistered for " + this.networkType);
                return;
            }
            CommsConnectivityMonitor.LOG.d("Unregistering network callback for " + this.networkType);
            CommsConnectivityMonitor.this.connectivityManager.unregisterNetworkCallback(this);
            this.registered = false;
        }
    }

    public CommsConnectivityMonitor(@NonNull ConnectivityManager connectivityManager, @NonNull PackageManager packageManager, @NonNull TelephonyManager telephonyManager) {
        NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addTransportType(1).addCapability(12);
        this.REQUEST_BUILDER_WIFI = addCapability;
        NetworkRequest.Builder addCapability2 = new NetworkRequest.Builder().addTransportType(0).addCapability(12);
        this.REQUEST_BUILDER_MOBILE = addCapability2;
        this.networkChanged = new Runnable() { // from class: com.amazon.deecomms.common.receiver.CommsConnectivityMonitor.1
            @Override // java.lang.Runnable
            public void run() {
                ConnectionType determineConnectionType = CommsConnectivityMonitor.this.determineConnectionType();
                ConnectionType connectionType = (ConnectionType) CommsConnectivityMonitor.this.connectionType.getAndSet(determineConnectionType);
                if (connectionType == determineConnectionType) {
                    CommsConnectivityMonitor.LOG.v("Connection type unchanged: " + determineConnectionType);
                    return;
                }
                CommsConnectivityMonitor.LOG.i("Connection type changed: " + connectionType + " -> " + determineConnectionType);
                Iterator it2 = CommsConnectivityMonitor.this.listeners.iterator();
                while (it2.hasNext()) {
                    ((OnConnectionTypeChangedListener) it2.next()).onConnectionTypeChanged(connectionType, determineConnectionType);
                }
            }
        };
        this.wifiNetworkCallback = new NetworkCallback("Wifi", addCapability);
        this.mobileNetworkCallback = new NetworkCallback(TYPE_MOBILE, addCapability2);
        this.listeners = Collections.synchronizedSet(new LinkedHashSet());
        this.connectionType = new AtomicReference<>(ConnectionType.NotConnected);
        this.subscribed = new AtomicBoolean(false);
        this.handler = new Handler(Looper.getMainLooper());
        this.connectivityManager = connectivityManager;
        this.packageManager = packageManager;
        this.telephonyManager = telephonyManager;
    }

    private int getDataState() {
        try {
            return this.telephonyManager.getDataState();
        } catch (SecurityException unused) {
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public String logNetwork(@NonNull Network network) {
        NetworkInfo networkInfo = this.connectivityManager.getNetworkInfo(network);
        if (networkInfo == null) {
            return LOG.sensitive(Integer.toString(network.hashCode()));
        }
        return LOG.sensitive(network.hashCode() + ": " + networkInfo.getTypeName() + ", connected=" + networkInfo.isConnected() + ", available=" + networkInfo.isAvailable());
    }

    public void deRegisterListener(@NonNull OnConnectionTypeChangedListener onConnectionTypeChangedListener) {
        if (this.listeners.remove(onConnectionTypeChangedListener)) {
            LOG.d("Removed listener: " + onConnectionTypeChangedListener);
        }
    }

    @NonNull
    @VisibleForTesting
    public ConnectionType determineConnectionType() {
        Network[] allNetworks = this.connectivityManager.getAllNetworks();
        if (allNetworks == null || allNetworks.length == 0) {
            return ConnectionType.NotConnected;
        }
        NetworkInfo networkInfo = null;
        NetworkInfo networkInfo2 = null;
        for (Network network : allNetworks) {
            NetworkInfo networkInfo3 = this.connectivityManager.getNetworkInfo(network);
            if (networkInfo3 != null) {
                int type = networkInfo3.getType();
                if (type == 0) {
                    networkInfo2 = networkInfo3;
                } else if (type == 1) {
                    networkInfo = networkInfo3;
                }
            }
        }
        boolean isNetworkUsable = isNetworkUsable("Wifi", networkInfo);
        boolean isNetworkUsable2 = isNetworkUsable(TYPE_MOBILE, networkInfo2);
        return (isNetworkUsable && isNetworkUsable2) ? ConnectionType.CellularAndWifi : isNetworkUsable ? ConnectionType.Wifi : isNetworkUsable2 ? ConnectionType.Cellular : ConnectionType.NotConnected;
    }

    @NonNull
    public ConnectionType getConnectionType() {
        return this.connectionType.get();
    }

    @VisibleForTesting
    public AtomicReference<ConnectionType> getConnectionTypeForTesting() {
        return this.connectionType;
    }

    @VisibleForTesting
    public Set<OnConnectionTypeChangedListener> getListenersForTesting() {
        return this.listeners;
    }

    @VisibleForTesting
    public ConnectivityManager.NetworkCallback getMobileNetworkCallbackForTesting() {
        return this.mobileNetworkCallback;
    }

    @VisibleForTesting
    public ConnectivityManager.NetworkCallback getWifiNetworkCallbackForTesting() {
        return this.wifiNetworkCallback;
    }

    public boolean isConnected() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean isMobileDataEnabled() {
        try {
            Method declaredMethod = Class.forName(this.connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(this.connectivityManager, null)).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LOG.e("Could not obtain mobile data enabled", e);
            return true;
        }
    }

    @VisibleForTesting
    public boolean isNetworkUsable(@NonNull String str, @Nullable NetworkInfo networkInfo) {
        if (networkInfo == null) {
            LOG.v("isNetworkUsable: " + str + " -> no info");
            return false;
        }
        boolean isConnected = networkInfo.isConnected();
        boolean isAvailable = networkInfo.isAvailable();
        if (!TYPE_MOBILE.equals(str)) {
            CredentialConfig$$ExternalSyntheticOutline0.m(Automotive$$ExternalSyntheticOutline0.m("isNetworkUsable: ", str, " -> connected=", isConnected, ", available="), isAvailable, LOG);
            return isConnected && isAvailable;
        }
        int dataState = getDataState();
        boolean isMobileDataEnabled = isMobileDataEnabled();
        CommsLogger commsLogger = LOG;
        Locale locale = Locale.US;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("isNetworkUsable: ", str, " -> connected=", isConnected, ", available=");
        m.append(isAvailable);
        m.append(" , telephony_dataState=");
        m.append(dataState);
        m.append(", mobileDataEnabled=");
        CredentialConfig$$ExternalSyntheticOutline0.m(m, isMobileDataEnabled, commsLogger);
        return isConnected && isAvailable && dataState == 2 && isMobileDataEnabled;
    }

    public boolean isSubscribed() {
        return this.subscribed.get();
    }

    public boolean isTransitioningToConnected(@NonNull ConnectionType connectionType, @NonNull ConnectionType connectionType2) {
        return !connectionType.isConnected() && connectionType2.isConnected();
    }

    public boolean isTransitioningToDisconnected(@NonNull ConnectionType connectionType, @NonNull ConnectionType connectionType2) {
        return connectionType.isConnected() && !connectionType2.isConnected();
    }

    public void registerListener(@NonNull OnConnectionTypeChangedListener onConnectionTypeChangedListener) {
        if (this.listeners.add(onConnectionTypeChangedListener)) {
            LOG.d("Added listener: " + onConnectionTypeChangedListener);
        }
    }

    public void subscribeNetworkChangeEvents() {
        if (this.subscribed.getAndSet(true)) {
            LOG.d("subscribeNetworkChangeEvents: Already subscribed");
            return;
        }
        this.connectionType.set(determineConnectionType());
        CommsLogger commsLogger = LOG;
        commsLogger.d("subscribeNetworkChangeEvents: " + getConnectionType());
        this.wifiNetworkCallback.register();
        if (this.packageManager.hasSystemFeature("android.hardware.telephony")) {
            this.mobileNetworkCallback.register();
        } else {
            commsLogger.d("subscribeNetworkChangeEvents: device doesn't support telephony");
        }
    }

    public void unsubscribeNetworkChangeEvents() {
        if (!this.subscribed.getAndSet(false)) {
            LOG.d("unsubscribeNetworkChangeEvents: Already unsubscribed");
            return;
        }
        this.connectionType.set(ConnectionType.NotConnected);
        LOG.d("unsubscribeNetworkChangeEvents: " + getConnectionType());
        this.wifiNetworkCallback.unregister();
        this.mobileNetworkCallback.unregister();
        this.handler.removeCallbacks(this.networkChanged);
    }

    public boolean waitForConnected(long j) {
        return new Poller().waitForExpectedState(j);
    }
}
