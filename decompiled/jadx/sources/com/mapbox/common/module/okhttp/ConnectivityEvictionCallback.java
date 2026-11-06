package com.mapbox.common.module.okhttp;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/mapbox/common/module/okhttp/ConnectivityEvictionCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "onNetworkChanged", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onAvailable", "network", "Landroid/net/Network;", "onCapabilitiesChanged", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "onLost", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class ConnectivityEvictionCallback extends ConnectivityManager.NetworkCallback {

    @NotNull
    private final Function0<Unit> onNetworkChanged;

    public ConnectivityEvictionCallback(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.onNetworkChanged = function0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(@NotNull Network network) {
        network.getClass();
        this.onNetworkChanged.invoke();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        this.onNetworkChanged.invoke();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        network.getClass();
        this.onNetworkChanged.invoke();
    }
}
