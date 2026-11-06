package com.amazon.photos.uploader.blockers;

import android.annotation.TargetApi;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.core.net.ConnectivityManagerCompat;
import com.amazon.photos.uploader.internal.utils.SystemUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0003R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/photos/uploader/blockers/NetworkState;", "", "systemUtil", "Lcom/amazon/photos/uploader/internal/utils/SystemUtil;", "(Lcom/amazon/photos/uploader/internal/utils/SystemUtil;)V", "isEthernet", "", "()Z", "setEthernet", "(Z)V", "isInternetConnected", "setInternetConnected", "isMetered", "setMetered", "isWifi", "setWifi", "isActiveNetworkValidated", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkState {
    private boolean isEthernet;
    private boolean isInternetConnected;
    private boolean isMetered;
    private boolean isWifi;

    @NotNull
    private final SystemUtil systemUtil;

    public NetworkState(@NotNull SystemUtil systemUtil) {
        systemUtil.getClass();
        this.systemUtil = systemUtil;
        NetworkInfo activeNetworkInfo = systemUtil.getConnectivityManager().getActiveNetworkInfo();
        boolean z = false;
        if (activeNetworkInfo != null) {
            this.isInternetConnected = activeNetworkInfo.isConnected();
            this.isWifi = activeNetworkInfo.getType() == 1;
            this.isEthernet = activeNetworkInfo.getType() == 9;
        }
        if (systemUtil.isOsVersionAtLeastO()) {
            if (this.isInternetConnected && isActiveNetworkValidated()) {
                z = true;
            }
            this.isInternetConnected = z;
        }
        this.isMetered = ConnectivityManagerCompat.isActiveNetworkMetered(systemUtil.getConnectivityManager());
    }

    @TargetApi(23)
    private final boolean isActiveNetworkValidated() {
        NetworkCapabilities networkCapabilities = this.systemUtil.getConnectivityManager().getNetworkCapabilities(this.systemUtil.getConnectivityManager().getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(16);
    }

    /* renamed from: isEthernet, reason: from getter */
    public final boolean getIsEthernet() {
        return this.isEthernet;
    }

    /* renamed from: isInternetConnected, reason: from getter */
    public final boolean getIsInternetConnected() {
        return this.isInternetConnected;
    }

    /* renamed from: isMetered, reason: from getter */
    public final boolean getIsMetered() {
        return this.isMetered;
    }

    /* renamed from: isWifi, reason: from getter */
    public final boolean getIsWifi() {
        return this.isWifi;
    }

    public final void setEthernet(boolean z) {
        this.isEthernet = z;
    }

    public final void setInternetConnected(boolean z) {
        this.isInternetConnected = z;
    }

    public final void setMetered(boolean z) {
        this.isMetered = z;
    }

    public final void setWifi(boolean z) {
        this.isWifi = z;
    }
}
