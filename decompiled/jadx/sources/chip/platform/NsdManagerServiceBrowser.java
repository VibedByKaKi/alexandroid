package chip.platform;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.paging.LivePagedList$$ExternalSyntheticLambda0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NsdManagerServiceBrowser implements ServiceBrowser {
    private static final long BROWSE_SERVICE_TIMEOUT = 5000;
    private static final String TAG = "NsdManagerServiceBrowser";
    private HashMap<Long, NsdManagerDiscovery> callbackMap;
    private Handler mainThreadHandler;
    private WifiManager.MulticastLock multicastLock;
    private final NsdManager nsdManager;
    private final long timeout;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class NsdManagerDiscovery implements NsdManager.DiscoveryListener {
        private long callbackHandle;
        private ChipMdnsCallback chipMdnsCallback;
        private long contextHandle;
        private ArrayList<String> serviceNameList = new ArrayList<>();
        private String serviceType;

        public NsdManagerDiscovery(String str, long j, long j2) {
            this.serviceType = str;
            this.callbackHandle = j;
            this.contextHandle = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDiscoveryStopped$0() {
            handleServiceBrowse(this.chipMdnsCallback);
        }

        public void handleServiceBrowse(ChipMdnsCallback chipMdnsCallback) {
            ArrayList<String> arrayList = this.serviceNameList;
            chipMdnsCallback.handleServiceBrowse((String[]) arrayList.toArray(new String[arrayList.size()]), this.serviceType, this.callbackHandle, this.contextHandle);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String str) {
            TableInfo$$ExternalSyntheticOutline0.m8110m("Started service '", str, "'", NsdManagerServiceBrowser.TAG);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String str) {
            Log.w(NsdManagerServiceBrowser.TAG, "Successfully stopped discovery service '" + str);
            new Handler(Looper.getMainLooper()).post(new LivePagedList$$ExternalSyntheticLambda0(this, 24));
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            Log.i(NsdManagerServiceBrowser.TAG, "Found service '" + nsdServiceInfo.getServiceName() + "'");
            this.serviceNameList.add(nsdServiceInfo.getServiceName());
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            String str = NsdManagerServiceBrowser.TAG;
            StringBuilder sb = new StringBuilder("Lost service '");
            sb.append(nsdServiceInfo != null ? nsdServiceInfo.getServiceName() : "null");
            sb.append("'");
            Log.i(str, sb.toString());
            Automotive$$ExternalSyntheticOutline0.m8396m("Remove List: ", NsdManagerServiceBrowser.TAG, this.serviceNameList.remove(nsdServiceInfo.getServiceName()));
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String str, int i) {
            Log.w(NsdManagerServiceBrowser.TAG, "Failed to start discovery service '" + str + "': " + i);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String str, int i) {
            Log.w(NsdManagerServiceBrowser.TAG, "Failed to stop discovery service '" + str + "': " + i);
        }

        public void setChipMdnsCallback(ChipMdnsCallback chipMdnsCallback) {
            this.chipMdnsCallback = chipMdnsCallback;
        }
    }

    public NsdManagerServiceBrowser(Context context, long j) {
        this.nsdManager = (NsdManager) context.getSystemService("servicediscovery");
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        WifiManager.MulticastLock createMulticastLock = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).createMulticastLock("chipBrowseMulticastLock");
        this.multicastLock = createMulticastLock;
        createMulticastLock.setReferenceCounted(true);
        this.callbackMap = new HashMap<>();
        this.timeout = j;
    }

    @Override // chip.platform.ServiceBrowser
    public void browse(final String str, final long j, long j2, ChipMdnsCallback chipMdnsCallback) {
        Runnable runnable = new Runnable() { // from class: chip.platform.NsdManagerServiceBrowser.1
            @Override // java.lang.Runnable
            public void run() {
                Log.i(NsdManagerServiceBrowser.TAG, "Browse for service '" + str + "' expired after timeout: " + NsdManagerServiceBrowser.this.timeout + " ms");
                NsdManagerServiceBrowser.this.stopDiscover(j);
            }
        };
        startDiscover(str, j, j2, chipMdnsCallback);
        this.mainThreadHandler.postDelayed(runnable, this.timeout);
    }

    public void startDiscover(String str, long j, long j2, ChipMdnsCallback chipMdnsCallback) {
        if (this.callbackMap.containsKey(Long.valueOf(j))) {
            Log.w(TAG, "Starting service discovery failed. Invalid callbackHandle: " + j);
            return;
        }
        NsdManagerDiscovery nsdManagerDiscovery = new NsdManagerDiscovery(str, j, j2);
        this.multicastLock.acquire();
        nsdManagerDiscovery.setChipMdnsCallback(chipMdnsCallback);
        this.nsdManager.discoverServices(str, 1, nsdManagerDiscovery);
        this.callbackMap.put(Long.valueOf(j), nsdManagerDiscovery);
    }

    public void stopDiscover(long j) {
        String str = TAG;
        if (!this.callbackMap.containsKey(Long.valueOf(j))) {
            Log.w(str, "Stopping service discovery failed. Callback handle not found.");
            return;
        }
        NsdManagerDiscovery remove = this.callbackMap.remove(Long.valueOf(j));
        if (this.multicastLock.isHeld()) {
            this.multicastLock.release();
        }
        if (!this.mainThreadHandler.getLooper().getQueue().isIdle()) {
            String unused = remove.serviceType;
            this.mainThreadHandler.removeCallbacksAndMessages(null);
        }
        try {
            this.nsdManager.stopServiceDiscovery(remove);
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "stopServiceDiscovery failed: listener already unregistered", e);
        }
    }

    public NsdManagerServiceBrowser(Context context) {
        this(context, 5000L);
    }
}
