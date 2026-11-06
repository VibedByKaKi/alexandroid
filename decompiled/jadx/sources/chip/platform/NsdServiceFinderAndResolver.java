package chip.platform;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import chip.platform.NsdManagerServiceResolver;
import chip.platform.NsdServiceFinderAndResolver;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
class NsdServiceFinderAndResolver implements NsdManager.DiscoveryListener {
    private static final long BROWSE_SERVICE_TIMEOUT_MS = 5000;
    private static final String TAG = "NsdServiceFinderAndResolver";
    private final long callbackHandle;
    private final ChipMdnsCallback chipMdnsCallback;
    private final long contextHandle;
    private NsdServiceInfo discoveredServiceInfo = null;
    private final WifiManager.MulticastLock multicastLock;
    private final NsdManager nsdManager;

    @Nullable
    private final NsdManagerServiceResolver.NsdManagerResolverAvailState nsdManagerResolverAvailState;
    private final ScheduledFuture<?> resolveTimeoutExecutor;
    private ScheduledFuture<?> stopDiscoveryRunnable;
    private final NsdServiceInfo targetServiceInfo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: chip.platform.NsdServiceFinderAndResolver$2, reason: invalid class name */
    public class AnonymousClass2 implements NsdManager.ResolveListener {
        final /* synthetic */ long val$callbackHandle;
        final /* synthetic */ ChipMdnsCallback val$chipMdnsCallback;
        final /* synthetic */ long val$contextHandle;

        public AnonymousClass2(ChipMdnsCallback chipMdnsCallback, long j, long j2) {
            this.val$chipMdnsCallback = chipMdnsCallback;
            this.val$callbackHandle = j;
            this.val$contextHandle = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResolveFailed$0(ChipMdnsCallback chipMdnsCallback, NsdServiceInfo nsdServiceInfo, long j, long j2) {
            chipMdnsCallback.handleServiceResolve(nsdServiceInfo.getServiceName(), NsdServiceFinderAndResolver.this.targetServiceInfo.getServiceType(), null, null, 0, null, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onServiceResolved$1(ChipMdnsCallback chipMdnsCallback, NsdServiceInfo nsdServiceInfo, String str, String str2, int i, long j, long j2) {
            chipMdnsCallback.handleServiceResolve(nsdServiceInfo.getServiceName(), NsdServiceFinderAndResolver.this.targetServiceInfo.getServiceType(), str, str2, i, nsdServiceInfo.getAttributes(), j, j2);
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(final NsdServiceInfo nsdServiceInfo, int i) {
            Log.w(NsdServiceFinderAndResolver.TAG, "Failed to resolve service '" + nsdServiceInfo.getServiceName() + "': " + i);
            Handler handler = new Handler(Looper.getMainLooper());
            final ChipMdnsCallback chipMdnsCallback = this.val$chipMdnsCallback;
            final long j = this.val$callbackHandle;
            final long j2 = this.val$contextHandle;
            handler.post(new Runnable() { // from class: chip.platform.NsdServiceFinderAndResolver$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    NsdServiceFinderAndResolver.AnonymousClass2.this.lambda$onResolveFailed$0(chipMdnsCallback, nsdServiceInfo, j, j2);
                }
            });
            if (NsdServiceFinderAndResolver.this.multicastLock.isHeld()) {
                NsdServiceFinderAndResolver.this.multicastLock.release();
                if (NsdServiceFinderAndResolver.this.nsdManagerResolverAvailState != null) {
                    NsdServiceFinderAndResolver.this.nsdManagerResolverAvailState.signalFree();
                }
            }
            NsdServiceFinderAndResolver.this.resolveTimeoutExecutor.cancel(false);
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(final NsdServiceInfo nsdServiceInfo) {
            Log.i(NsdServiceFinderAndResolver.TAG, "Resolved service '" + nsdServiceInfo.getServiceName() + "' to " + nsdServiceInfo.getHost() + ", type : " + nsdServiceInfo.getServiceType());
            final String hostName = nsdServiceInfo.getHost().getHostName();
            final String hostAddress = nsdServiceInfo.getHost().getHostAddress();
            final int port = nsdServiceInfo.getPort();
            Handler handler = new Handler(Looper.getMainLooper());
            final ChipMdnsCallback chipMdnsCallback = this.val$chipMdnsCallback;
            final long j = this.val$callbackHandle;
            final long j2 = this.val$contextHandle;
            handler.post(new Runnable() { // from class: chip.platform.NsdServiceFinderAndResolver$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NsdServiceFinderAndResolver.AnonymousClass2.this.lambda$onServiceResolved$1(chipMdnsCallback, nsdServiceInfo, hostName, hostAddress, port, j, j2);
                }
            });
            if (NsdServiceFinderAndResolver.this.multicastLock.isHeld()) {
                NsdServiceFinderAndResolver.this.multicastLock.release();
                if (NsdServiceFinderAndResolver.this.nsdManagerResolverAvailState != null) {
                    NsdServiceFinderAndResolver.this.nsdManagerResolverAvailState.signalFree();
                }
            }
            NsdServiceFinderAndResolver.this.resolveTimeoutExecutor.cancel(false);
        }
    }

    public NsdServiceFinderAndResolver(NsdManager nsdManager, NsdServiceInfo nsdServiceInfo, long j, long j2, ChipMdnsCallback chipMdnsCallback, WifiManager.MulticastLock multicastLock, ScheduledFuture<?> scheduledFuture, NsdManagerServiceResolver.NsdManagerResolverAvailState nsdManagerResolverAvailState) {
        this.nsdManager = nsdManager;
        this.targetServiceInfo = nsdServiceInfo;
        this.callbackHandle = j;
        this.contextHandle = j2;
        this.chipMdnsCallback = chipMdnsCallback;
        this.multicastLock = multicastLock;
        this.resolveTimeoutExecutor = scheduledFuture;
        this.nsdManagerResolverAvailState = nsdManagerResolverAvailState;
    }

    private void resolveService(NsdServiceInfo nsdServiceInfo, long j, long j2, ChipMdnsCallback chipMdnsCallback) {
        this.nsdManager.resolveService(nsdServiceInfo, new AnonymousClass2(chipMdnsCallback, j, j2));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStopped(String str) {
        String str2 = TAG;
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Discovery stopped: ", str, ", discoveredServiceInfo: ");
        m2m.append(this.discoveredServiceInfo);
        Log.i(str2, m2m.toString());
        NsdServiceInfo nsdServiceInfo = this.discoveredServiceInfo;
        if (nsdServiceInfo != null) {
            resolveService(nsdServiceInfo, this.callbackHandle, this.contextHandle, this.chipMdnsCallback);
            this.discoveredServiceInfo = null;
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        if (this.discoveredServiceInfo != null || !this.targetServiceInfo.getServiceName().equals(nsdServiceInfo.getServiceName())) {
            Objects.toString(nsdServiceInfo);
            return;
        }
        nsdServiceInfo.toString();
        if (this.stopDiscoveryRunnable.cancel(false)) {
            this.nsdManager.stopServiceDiscovery(this);
        }
        this.discoveredServiceInfo = nsdServiceInfo;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        Log.e(TAG, "Service lost: " + nsdServiceInfo);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStartDiscoveryFailed(String str, int i) {
        ErrorUtils$$ExternalSyntheticOutline0.m(i, "Discovery failed to start: Error code: ", TAG);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStopDiscoveryFailed(String str, int i) {
        ErrorUtils$$ExternalSyntheticOutline0.m(i, "Discovery failed to stop: Error code: ", TAG);
    }

    public void start() {
        this.multicastLock.acquire();
        this.stopDiscoveryRunnable = Executors.newSingleThreadScheduledExecutor().schedule(new Runnable() { // from class: chip.platform.NsdServiceFinderAndResolver.1
            @Override // java.lang.Runnable
            public void run() {
                String unused = NsdServiceFinderAndResolver.TAG;
                NsdServiceFinderAndResolver.this.nsdManager.stopServiceDiscovery(this);
                if (NsdServiceFinderAndResolver.this.multicastLock.isHeld()) {
                    NsdServiceFinderAndResolver.this.multicastLock.release();
                }
            }
        }, 5000L, TimeUnit.MILLISECONDS);
        this.nsdManager.discoverServices(this.targetServiceInfo.getServiceType(), 1, this);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStarted(String str) {
    }
}
