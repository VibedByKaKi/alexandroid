package chip.platform;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NsdManagerServiceResolver implements ServiceResolver {
    private static final long RESOLVE_SERVICE_TIMEOUT = 30000;
    private static final String TAG = "NsdManagerServiceResolver";
    private final CopyOnWriteArrayList<String> mMFServiceName;
    private ExecutorService mResolveExecutorService;
    private WifiManager.MulticastLock multicastLock;
    private final NsdManager nsdManager;

    @Nullable
    private final NsdManagerResolverAvailState nsdManagerResolverAvailState;
    private WifiManager.MulticastLock publishMulticastLock;
    private List<NsdManager.RegistrationListener> registrationListeners;
    private final long timeout;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NsdManagerResolverAvailState {
        private static final String TAG = "NsdManagerResolverAvailState";
        private boolean busy;
        private Condition condition;
        private Lock lock;

        public NsdManagerResolverAvailState() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
            this.busy = false;
        }

        public void acquireResolver() {
            this.lock.lock();
            while (this.busy) {
                try {
                    try {
                        this.condition.await();
                    } catch (InterruptedException e) {
                        Log.e(TAG, "Failure while waiting for condition: " + e);
                    }
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
            this.busy = true;
            this.lock.unlock();
        }

        public void signalFree() {
            this.lock.lock();
            try {
                this.busy = false;
                this.condition.signal();
            } finally {
                this.lock.unlock();
            }
        }
    }

    public NsdManagerServiceResolver(Context context, @Nullable NsdManagerResolverAvailState nsdManagerResolverAvailState, long j) {
        this.registrationListeners = new ArrayList();
        this.mMFServiceName = new CopyOnWriteArrayList<>();
        this.nsdManager = (NsdManager) context.getSystemService("servicediscovery");
        WifiManager.MulticastLock createMulticastLock = ((WifiManager) context.getSystemService("wifi")).createMulticastLock("chipMulticastLock");
        this.multicastLock = createMulticastLock;
        createMulticastLock.setReferenceCounted(true);
        WifiManager.MulticastLock createMulticastLock2 = ((WifiManager) context.getSystemService("wifi")).createMulticastLock("chipPublishMulticastLock");
        this.publishMulticastLock = createMulticastLock2;
        createMulticastLock2.setReferenceCounted(true);
        this.nsdManagerResolverAvailState = nsdManagerResolverAvailState;
        this.timeout = j;
        this.mResolveExecutorService = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolve$0(Runnable runnable, NsdServiceInfo nsdServiceInfo, long j, long j2, ChipMdnsCallback chipMdnsCallback) {
        NsdManagerResolverAvailState nsdManagerResolverAvailState = this.nsdManagerResolverAvailState;
        if (nsdManagerResolverAvailState != null) {
            nsdManagerResolverAvailState.acquireResolver();
        }
        new NsdServiceFinderAndResolver(this.nsdManager, nsdServiceInfo, j, j2, chipMdnsCallback, this.multicastLock, Executors.newSingleThreadScheduledExecutor().schedule(runnable, this.timeout, TimeUnit.MILLISECONDS), this.nsdManagerResolverAvailState).start();
    }

    @Override // chip.platform.ServiceResolver
    public void publish(String str, String str2, String str3, int i, String[] strArr, byte[][] bArr, String[] strArr2) {
        if (str.contains("-") && this.mMFServiceName.contains(str)) {
            Log.w(TAG, "publish: duplicate MF nsdService");
            return;
        }
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(str);
        StringBuilder sb = new StringBuilder(str3);
        for (String str4 : strArr2) {
            sb.append(",");
            sb.append(str4);
        }
        nsdServiceInfo.setServiceType(sb.toString());
        nsdServiceInfo.setPort(i);
        String str5 = TAG;
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("publish serviceName=", str, " type=");
        m2m.append(sb.toString());
        m2m.append(" port=");
        m2m.append(i);
        Log.i(str5, m2m.toString());
        int min = Math.min(bArr.length, strArr.length);
        for (int i2 = 0; i2 < min; i2++) {
            String str6 = new String(bArr[i2]);
            nsdServiceInfo.setAttribute(strArr[i2], str6);
            Log.i(TAG, "     " + strArr[i2] + "=" + str6);
        }
        NsdManager.RegistrationListener registrationListener = new NsdManager.RegistrationListener() { // from class: chip.platform.NsdManagerServiceResolver.2
            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo2, int i3) {
                Log.w(NsdManagerServiceResolver.TAG, "service " + nsdServiceInfo2.getServiceName() + " onRegistrationFailed:" + i3);
            }

            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onServiceRegistered(NsdServiceInfo nsdServiceInfo2) {
                Log.i(NsdManagerServiceResolver.TAG, "service " + nsdServiceInfo2.getServiceName() + MarkdownConstants.LEFT_PARENTHESIS + this + ") onServiceRegistered");
            }

            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo2) {
                Log.i(NsdManagerServiceResolver.TAG, "service " + nsdServiceInfo2.getServiceName() + MarkdownConstants.LEFT_PARENTHESIS + this + ") onServiceUnregistered");
            }

            @Override // android.net.nsd.NsdManager.RegistrationListener
            public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo2, int i3) {
                Log.w(NsdManagerServiceResolver.TAG, "service " + nsdServiceInfo2.getServiceName() + " onUnregistrationFailed:" + i3);
            }
        };
        if (this.registrationListeners.size() == 0) {
            this.publishMulticastLock.acquire();
        }
        this.registrationListeners.add(registrationListener);
        this.mMFServiceName.add(str);
        this.nsdManager.registerService(nsdServiceInfo, 1, registrationListener);
        this.registrationListeners.size();
    }

    @Override // chip.platform.ServiceResolver
    public void removeServices() {
        if (this.registrationListeners.size() > 0 && this.publishMulticastLock.isHeld()) {
            this.publishMulticastLock.release();
        }
        for (NsdManager.RegistrationListener registrationListener : this.registrationListeners) {
            Log.i(TAG, "Remove " + registrationListener);
            this.nsdManager.unregisterService(registrationListener);
        }
        this.registrationListeners.clear();
        this.mMFServiceName.clear();
    }

    @Override // chip.platform.ServiceResolver
    public void resolve(String str, String str2, final long j, final long j2, final ChipMdnsCallback chipMdnsCallback) {
        final NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(str);
        nsdServiceInfo.setServiceType(str2);
        final Runnable runnable = new Runnable() { // from class: chip.platform.NsdManagerServiceResolver.1
            @Override // java.lang.Runnable
            public void run() {
                String unused = NsdManagerServiceResolver.TAG;
                if (NsdManagerServiceResolver.this.multicastLock.isHeld()) {
                    NsdManagerServiceResolver.this.multicastLock.release();
                }
                if (NsdManagerServiceResolver.this.nsdManagerResolverAvailState != null) {
                    NsdManagerServiceResolver.this.nsdManagerResolverAvailState.signalFree();
                }
            }
        };
        this.mResolveExecutorService.execute(new Runnable() { // from class: chip.platform.NsdManagerServiceResolver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NsdManagerServiceResolver.this.lambda$resolve$0(runnable, nsdServiceInfo, j, j2, chipMdnsCallback);
            }
        });
    }

    public NsdManagerServiceResolver(Context context) {
        this(context, null, 30000L);
    }

    public NsdManagerServiceResolver(Context context, @Nullable NsdManagerResolverAvailState nsdManagerResolverAvailState) {
        this(context, nsdManagerResolverAvailState, 30000L);
    }
}
