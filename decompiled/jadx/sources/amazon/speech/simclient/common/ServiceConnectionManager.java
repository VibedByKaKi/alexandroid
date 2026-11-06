package amazon.speech.simclient.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class ServiceConnectionManager {
    private static final String TAG = "ServiceConnectionManager";
    private Intent mBindIntent;
    private Context mContext;
    private String mPermission;
    private ServiceConnection mServiceConnection;
    private final ArrayList<Callback> mCallbacks = new ArrayList<>();
    private boolean mBoundSuccessfully = false;
    private boolean mConnected = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class AutoDisconnectCallback extends Callback {
        private ServiceConnectionManager mManager;

        public abstract void onOneTimeServiceConnected();

        @Override // amazon.speech.simclient.common.ServiceConnectionManager.Callback
        public final void onServiceConnected() {
            try {
                onOneTimeServiceConnected();
                ServiceConnectionManager serviceConnectionManager = this.mManager;
                if (serviceConnectionManager != null) {
                    serviceConnectionManager.removeCallback(this);
                }
            } catch (Throwable th) {
                if (this.mManager != null) {
                    this.mManager.removeCallback(this);
                }
                throw th;
            }
        }

        public void setConnectionManagerReference(ServiceConnectionManager serviceConnectionManager) {
            this.mManager = serviceConnectionManager;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Callback {
        public void onServiceConnected(int i) {
        }

        public void onServiceConnected() {
        }

        public void onServiceDisconnected() {
        }

        public void onUnbind() {
        }

        public void onBind(boolean z) {
        }
    }

    public static boolean bindCommon(Context context, ServiceConnection serviceConnection, Intent intent, String str) {
        if (intent.getComponent() == null && context.getPackageManager() != null) {
            ResolveInfo resolveBindIntent = ServiceResolver.resolveBindIntent(context, intent, str);
            if (resolveBindIntent == null) {
                Log.e(TAG, "No Service available on device to bind for intent " + intent);
                return false;
            }
            ServiceInfo serviceInfo = resolveBindIntent.serviceInfo;
            intent.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
        }
        try {
            return context.bindService(intent, serviceConnection, 1);
        } catch (Throwable th) {
            Log.e(TAG, "Exception binding service", th);
            return false;
        }
    }

    private synchronized void reset() {
        this.mContext = null;
        this.mServiceConnection = null;
        this.mBindIntent = null;
        this.mPermission = null;
        this.mBoundSuccessfully = false;
        this.mConnected = false;
    }

    public static void unbindCommon(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (Throwable th) {
            Log.e(TAG, "Exception unbinding service", th);
        }
    }

    public synchronized void addCallback(Callback callback) {
        try {
            if (callback == null) {
                throw new IllegalArgumentException("Null callback");
            }
            if (!this.mCallbacks.contains(callback)) {
                this.mCallbacks.add(0, callback);
            }
            if (callback instanceof AutoDisconnectCallback) {
                ((AutoDisconnectCallback) callback).setConnectionManagerReference(this);
            }
            if (this.mConnected) {
                callback.onServiceConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void bindComplete(boolean z) {
        try {
            this.mBoundSuccessfully = z;
            if (!z) {
                reset();
            }
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                this.mCallbacks.get(size).onBind(z);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void bindService(Context context, ServiceConnection serviceConnection, Intent intent, String str) {
        if (context == null || serviceConnection == null || intent == null) {
            throw new IllegalArgumentException("Null input. Context = " + context + ", serviceConnection = " + serviceConnection + ", bindIntent = " + intent);
        }
        if (this.mContext != null) {
            return;
        }
        this.mContext = context;
        this.mServiceConnection = serviceConnection;
        this.mBindIntent = intent;
        performBind(context, serviceConnection, intent, str);
    }

    public synchronized void onServiceConnected() {
        this.mConnected = true;
        for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
            this.mCallbacks.get(size).onServiceConnected();
        }
    }

    public synchronized void onServiceDisconnected() {
        try {
            this.mConnected = false;
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                this.mCallbacks.get(size).onServiceDisconnected();
            }
            Context context = this.mContext;
            if (context != null && this.mBoundSuccessfully) {
                ServiceConnection serviceConnection = this.mServiceConnection;
                Intent intent = this.mBindIntent;
                String str = this.mPermission;
                unbindService();
                bindService(context, serviceConnection, intent, str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void performBind(Context context, ServiceConnection serviceConnection, Intent intent, String str);

    public abstract void performUnbind(Context context, ServiceConnection serviceConnection);

    public synchronized void removeCallback(Callback callback) {
        this.mCallbacks.remove(callback);
    }

    public final synchronized void unbindComplete() {
        for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
            this.mCallbacks.get(size).onUnbind();
        }
    }

    public synchronized void unbindService() {
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        performUnbind(context, this.mServiceConnection);
        reset();
    }
}
