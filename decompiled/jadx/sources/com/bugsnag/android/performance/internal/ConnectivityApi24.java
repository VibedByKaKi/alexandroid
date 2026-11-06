package com.bugsnag.android.performance.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(24)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B@\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012)\u0010\u0007\u001a%\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0015J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(H\u0016J\u0018\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0019H\u0016J\u0018\u0010+\u001a\u00020\r2\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0018\u0010-\u001a\u00020\r2\u0006\u0010'\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\r2\u0006\u0010'\u001a\u00020(H\u0016J\b\u00101\u001a\u00020\rH\u0016J\b\u00102\u001a\u00020\rH\u0016J\b\u00103\u001a\u00020\rH\u0016J\b\u00104\u001a\u00020\rH\u0002R1\u0010\u0007\u001a%\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t@TX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/bugsnag/android/performance/internal/ConnectivityApi24;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lcom/bugsnag/android/performance/internal/Connectivity;", "context", "Landroid/content/Context;", "cm", "Landroid/net/ConnectivityManager;", "callback", "Lkotlin/Function1;", "Lcom/bugsnag/android/performance/internal/ConnectivityStatus;", "Lkotlin/ParameterName;", "name", "status", "", "Lcom/bugsnag/android/performance/internal/NetworkChangeCallback;", "(Landroid/content/Context;Landroid/net/ConnectivityManager;Lkotlin/jvm/functions/Function1;)V", "newStatus", "connectivityStatus", "getConnectivityStatus", "()Lcom/bugsnag/android/performance/internal/ConnectivityStatus;", "setConnectivityStatus", "(Lcom/bugsnag/android/performance/internal/ConnectivityStatus;)V", "tm", "Landroid/telephony/TelephonyManager;", "connectedFor", "", "capabilities", "Landroid/net/NetworkCapabilities;", "meteringFor", "Lcom/bugsnag/android/performance/internal/ConnectionMetering;", "nameForDataNetworkType", "", "dataNetworkType", "", "networkCapabilitiesToStatus", "networkSubTypeFor", "networkTypeFor", "Lcom/bugsnag/android/performance/internal/NetworkType;", "onAvailable", "network", "Landroid/net/Network;", "onBlockedStatusChanged", "blocked", "onCapabilitiesChanged", "networkCapabilities", "onLinkPropertiesChanged", "linkProperties", "Landroid/net/LinkProperties;", "onLost", "onUnavailable", "registerForNetworkChanges", "unregisterForNetworkChanges", "updateActiveNetwork", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ConnectivityApi24 extends ConnectivityManager.NetworkCallback implements Connectivity {

    @Nullable
    private final Function1<ConnectivityStatus, Unit> callback;

    @NotNull
    private final ConnectivityManager cm;

    @NotNull
    private ConnectivityStatus connectivityStatus;

    @Nullable
    private final TelephonyManager tm;

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectivityApi24(@NotNull Context context, @NotNull ConnectivityManager connectivityManager, @Nullable Function1<? super ConnectivityStatus, Unit> function1) {
        context.getClass();
        connectivityManager.getClass();
        this.cm = connectivityManager;
        this.callback = function1;
        this.tm = ContextExtensionsKt.getTelephonyManagerFrom(context);
        this.connectivityStatus = networkCapabilitiesToStatus(ContextExtensionsKt.safeGetNetworkCapabilities(connectivityManager, connectivityManager.getActiveNetwork()));
    }

    private final String nameForDataNetworkType(int dataNetworkType) {
        switch (dataNetworkType) {
            case 1:
                return "gprs";
            case 2:
                return "edge";
            case 3:
                return "umts";
            case 4:
                return "cdma";
            case 5:
                return "evdo_0";
            case 6:
                return "evdo_a";
            case 7:
                return "cdma2000_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            case 10:
                return "hspa";
            case 11:
                return "iden";
            case 12:
                return "evdo_b";
            case 13:
                return "lte";
            case 14:
                return "ehrpd";
            case 15:
                return "hspap";
            case 16:
                return "gsm";
            case 17:
                return "td_scdma";
            case 18:
                return "iwlan";
            case 19:
            default:
                return "unknown";
            case 20:
                return "nr";
        }
    }

    private final ConnectivityStatus networkCapabilitiesToStatus(NetworkCapabilities capabilities) {
        ConnectivityStatus connectivityStatus;
        if (capabilities != null) {
            return new ConnectivityStatus(connectedFor(capabilities), meteringFor(capabilities), networkTypeFor(capabilities), networkSubTypeFor(capabilities));
        }
        connectivityStatus = ConnectivityKt.unknownNetwork;
        return connectivityStatus;
    }

    private final void updateActiveNetwork() {
        ConnectivityStatus connectivityStatus;
        Network activeNetwork = this.cm.getActiveNetwork();
        if (activeNetwork == null) {
            connectivityStatus = ConnectivityKt.noNetwork;
            setConnectivityStatus(connectivityStatus);
        } else {
            NetworkCapabilities safeGetNetworkCapabilities = ContextExtensionsKt.safeGetNetworkCapabilities(this.cm, activeNetwork);
            if (safeGetNetworkCapabilities == null) {
                return;
            }
            setConnectivityStatus(networkCapabilitiesToStatus(safeGetNetworkCapabilities));
        }
    }

    public boolean connectedFor(@NotNull NetworkCapabilities capabilities) {
        capabilities.getClass();
        return capabilities.hasCapability(12) && capabilities.hasCapability(16);
    }

    @Override // com.bugsnag.android.performance.internal.Connectivity
    @NotNull
    public ConnectivityStatus getConnectivityStatus() {
        return this.connectivityStatus;
    }

    @NotNull
    public ConnectionMetering meteringFor(@NotNull NetworkCapabilities capabilities) {
        capabilities.getClass();
        return capabilities.hasTransport(1) ? ConnectionMetering.UNMETERED : (capabilities.hasTransport(3) || capabilities.hasTransport(8)) ? ConnectionMetering.UNMETERED : capabilities.hasTransport(0) ? ConnectionMetering.POTENTIALLY_METERED : ConnectionMetering.DISCONNECTED;
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public String networkSubTypeFor(@NotNull NetworkCapabilities capabilities) {
        TelephonyManager telephonyManager;
        capabilities.getClass();
        if (networkTypeFor(capabilities) == NetworkType.CELL && (telephonyManager = this.tm) != null) {
            try {
                return nameForDataNetworkType(telephonyManager.getDataNetworkType());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @NotNull
    public NetworkType networkTypeFor(@NotNull NetworkCapabilities capabilities) {
        capabilities.getClass();
        return (capabilities.hasTransport(3) || capabilities.hasTransport(8)) ? NetworkType.WIRED : capabilities.hasTransport(1) ? NetworkType.WIFI : capabilities.hasTransport(0) ? NetworkType.CELL : NetworkType.UNKNOWN;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(@NotNull Network network) {
        network.getClass();
        updateActiveNetwork();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(@NotNull Network network, boolean blocked) {
        network.getClass();
        updateActiveNetwork();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        updateActiveNetwork();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(@NotNull Network network, @NotNull LinkProperties linkProperties) {
        network.getClass();
        linkProperties.getClass();
        updateActiveNetwork();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        network.getClass();
        updateActiveNetwork();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        updateActiveNetwork();
    }

    @Override // com.bugsnag.android.performance.internal.Connectivity
    public void registerForNetworkChanges() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.cm.registerDefaultNetworkCallback(this);
            Result.m25294constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
    }

    public void setConnectivityStatus(@NotNull ConnectivityStatus connectivityStatus) {
        connectivityStatus.getClass();
        if (Intrinsics.areEqual(this.connectivityStatus, connectivityStatus)) {
            return;
        }
        this.connectivityStatus = connectivityStatus;
        Function1<ConnectivityStatus, Unit> function1 = this.callback;
        if (function1 != null) {
            function1.invoke(connectivityStatus);
        }
    }

    @Override // com.bugsnag.android.performance.internal.Connectivity
    public void unregisterForNetworkChanges() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.cm.unregisterNetworkCallback(this);
            Result.m25294constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
    }
}
