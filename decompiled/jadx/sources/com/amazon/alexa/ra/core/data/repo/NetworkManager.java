package com.amazon.alexa.ra.core.data.repo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/core/data/repo/NetworkManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "networkRequest", "Landroid/net/NetworkRequest;", "isConnected", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "callback", "Lcom/amazon/alexa/ra/core/data/repo/NetworkManager$Callback;", "start", "", "stop", "Lkotlinx/coroutines/flow/StateFlow;", "Callback", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class NetworkManager {

    @NotNull
    private static final String TAG = "NetworkManager";

    @NotNull
    private final Callback callback;

    @NotNull
    private final ConnectivityManager connectivityManager;

    @NotNull
    private final MutableStateFlow<Boolean> isConnected;

    @NotNull
    private final NetworkRequest networkRequest;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u001c\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/repo/NetworkManager$Callback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "onStatusUpdated", "Lkotlin/Function1;", "Landroid/net/Network;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onAvailable", "network", "onLost", "onUnavailable", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Callback extends ConnectivityManager.NetworkCallback {
        public static final int $stable = 0;

        @NotNull
        private final Function1<Network, Unit> onStatusUpdated;

        /* JADX WARN: Multi-variable type inference failed */
        public Callback(@NotNull Function1<? super Network, Unit> function1) {
            function1.getClass();
            this.onStatusUpdated = function1;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            network.getClass();
            super.onAvailable(network);
            this.onStatusUpdated.invoke(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            network.getClass();
            super.onLost(network);
            this.onStatusUpdated.invoke(null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            this.onStatusUpdated.invoke(null);
        }
    }

    public NetworkManager(@NotNull Context context) {
        context.getClass();
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.isConnected = MutableStateFlow;
        this.callback = new Callback(new NetworkManager$$ExternalSyntheticLambda0(this, 0));
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.connectivityManager = connectivityManager;
        this.networkRequest = new NetworkRequest.Builder().addCapability(12).addCapability(16).addTransportType(1).addTransportType(0).build();
        MutableStateFlow.setValue(Boolean.valueOf(connectivityManager.getActiveNetwork() != null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit callback$lambda$0(NetworkManager networkManager, Network network) {
        networkManager.isConnected.setValue(Boolean.valueOf(network != null));
        return Unit.INSTANCE;
    }

    @NotNull
    public final StateFlow<Boolean> isConnected() {
        return this.isConnected;
    }

    public final void start() {
        Log.i(TAG, "Registering network changed callback");
        try {
            this.connectivityManager.registerNetworkCallback(this.networkRequest, this.callback);
        } catch (Exception e) {
            Log.w(TAG, "Cannot register network changed callback", e);
        }
    }

    public final void stop() {
        Log.i(TAG, "Unregistering network changed callback");
        try {
            this.connectivityManager.unregisterNetworkCallback(this.callback);
        } catch (Exception e) {
            Log.w(TAG, "Cannot unregister network changed callback", e);
        }
    }
}
