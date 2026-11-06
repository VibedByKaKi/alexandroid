package com.amazon.photos.uploader.internal.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.photos.uploader.blockers.NetworkState;
import com.amazon.photos.uploader.internal.OpenForTesting;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@OpenForTesting
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/amazon/photos/uploader/internal/utils/SystemUtil;", "", "context", "Landroid/content/Context;", "isDebugMode", "", "(Landroid/content/Context;Z)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "()Z", "currentTimeMillis", "", "getConnectivityManager", "getFileSize", "filePath", "", "getNetworkRequestBuilder", "Landroid/net/NetworkRequest$Builder;", "getNetworkState", "Lcom/amazon/photos/uploader/blockers/NetworkState;", "getOsVersionCode", "", "getPermission", "permission", "isAtLeastApi", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY, "isOsVersionAtLeastM", "isOsVersionAtLeastO", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SystemUtil {

    @NotNull
    private final ConnectivityManager connectivityManager;

    @NotNull
    private final Context context;
    private final boolean isDebugMode;

    public SystemUtil(@NotNull Context context, boolean z) {
        context.getClass();
        this.context = context;
        this.isDebugMode = z;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.connectivityManager = (ConnectivityManager) systemService;
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @NotNull
    public final ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    public final long getFileSize(@NotNull String filePath) {
        filePath.getClass();
        return new File(filePath).length();
    }

    @NotNull
    public final NetworkRequest.Builder getNetworkRequestBuilder() {
        return new NetworkRequest.Builder();
    }

    @NotNull
    public final NetworkState getNetworkState() {
        return new NetworkState(this);
    }

    public final int getOsVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    public final int getPermission(@NotNull String permission) {
        permission.getClass();
        return ContextCompat.checkSelfPermission(this.context, permission);
    }

    public final boolean isAtLeastApi(int api) {
        return getOsVersionCode() >= api;
    }

    /* renamed from: isDebugMode, reason: from getter */
    public final boolean getIsDebugMode() {
        return this.isDebugMode;
    }

    public final boolean isOsVersionAtLeastM() {
        return isAtLeastApi(23);
    }

    public final boolean isOsVersionAtLeastO() {
        return isAtLeastApi(26);
    }

    public /* synthetic */ SystemUtil(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z);
    }
}
