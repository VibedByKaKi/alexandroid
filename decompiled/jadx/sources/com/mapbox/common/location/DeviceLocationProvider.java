package com.mapbox.common.location;

import android.app.PendingIntent;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.internal.BaseGmsClient;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, d2 = {"Lcom/mapbox/common/location/DeviceLocationProvider;", "Lcom/mapbox/common/location/LocationProvider;", "getName", "", "removeLocationUpdates", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "requestLocationUpdates", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface DeviceLocationProvider extends LocationProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static String getName(@NotNull DeviceLocationProvider deviceLocationProvider) {
            return "mapbox-user-defined";
        }
    }

    @Nullable
    String getName();

    void removeLocationUpdates(@NotNull PendingIntent pendingIntent);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    void requestLocationUpdates(@NotNull PendingIntent pendingIntent) throws SecurityException;
}
