package ai.onnxruntime.telemetry;

import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(24)
/* loaded from: classes.dex */
class ConnectivityCallback extends ConnectivityManager.NetworkCallback {
    private boolean m_metered;
    private final HttpClient m_parent;

    public ConnectivityCallback(HttpClient httpClient, boolean z) {
        this.m_parent = httpClient;
        this.m_metered = z;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(@Nullable Network network, @NonNull NetworkCapabilities networkCapabilities) {
        boolean z = !networkCapabilities.hasCapability(11);
        if (z != this.m_metered) {
            this.m_metered = z;
            this.m_parent.onCostChange(z);
        }
    }
}
