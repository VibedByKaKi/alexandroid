package com.amazon.appmanager.lib;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.maft.metrics.MetricsFactory;
import com.amazon.maft.metrics.PreloadMetricsFactory;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class PreloadManager {
    private static PreloadManager defaultPreloadManager;

    public static synchronized PreloadManager getDefault() {
        PreloadManager preloadManager;
        synchronized (PreloadManager.class) {
            try {
                if (defaultPreloadManager == null) {
                    defaultPreloadManager = new DefaultPreloadManager();
                }
                preloadManager = defaultPreloadManager;
            } catch (Throwable th) {
                throw th;
            }
        }
        return preloadManager;
    }

    @Nullable
    @Deprecated
    public abstract String getPreloadAssociateTag(@NonNull Context context, @NonNull MetricsFactory metricsFactory, @NonNull String str) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException;

    @Nullable
    @Deprecated
    public abstract String getPreloadAssociateTag(@NonNull Context context, @NonNull MetricsFactory metricsFactory, @NonNull String str, PreloadMetricData preloadMetricData) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException;

    @Nullable
    @Deprecated
    public abstract String getPreloadAssociateTagWithoutRegionId(@NonNull Context context, @NonNull MetricsFactory metricsFactory) throws RemoteException, IllegalArgumentException, SecurityException;

    @Nullable
    public abstract String getPreloadAssociateTagWithoutRegionId_Minerva(@NonNull Context context) throws RemoteException, IllegalArgumentException, SecurityException, IOException;

    @Nullable
    public abstract String getPreloadAssociateTagWithoutRegionId_Minerva(@NonNull Context context, @NonNull PreloadMetricsFactory preloadMetricsFactory) throws RemoteException, IllegalArgumentException, SecurityException, IOException;

    @Nullable
    public abstract String getPreloadAssociateTag_Minerva(@NonNull Context context, @NonNull PreloadMetricsFactory preloadMetricsFactory, @NonNull String str) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException, IOException;

    @Nullable
    public abstract String getPreloadAssociateTag_Minerva(@NonNull Context context, @NonNull PreloadMetricsFactory preloadMetricsFactory, @NonNull String str, PreloadMetricData preloadMetricData) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException, IOException;

    @Nullable
    public abstract String getPreloadAssociateTag_Minerva(@NonNull Context context, @NonNull String str) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException, IOException;

    @Nullable
    public abstract String getPreloadAssociateTag_Minerva(@NonNull Context context, @NonNull String str, PreloadMetricData preloadMetricData) throws RemoteException, UnrecognizedMarketplaceException, IllegalArgumentException, SecurityException, IOException;
}
