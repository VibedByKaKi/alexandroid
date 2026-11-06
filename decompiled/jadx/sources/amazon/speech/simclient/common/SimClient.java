package amazon.speech.simclient.common;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class SimClient {
    private static final String TAG = "SimClient";
    private final Map<SimClientServiceHandle, BaseClient> mRegisteredClients = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ServiceNotAvailableException extends Exception {
        public ServiceNotAvailableException() {
            super("This service is not available on this device");
        }
    }

    public synchronized <T extends BaseClient> T get(SimClientServiceHandle<T> simClientServiceHandle) {
        return (T) this.mRegisteredClients.get(simClientServiceHandle);
    }

    public synchronized <T extends BaseClient> void registerClient(Context context, SimClientServiceHandle<T> simClientServiceHandle) throws ServiceNotAvailableException {
        if (this.mRegisteredClients.containsKey(simClientServiceHandle)) {
            Log.w(TAG, "Client already registered, ignoring registration request");
            return;
        }
        if (context.getPackageManager() != null && !simClientServiceHandle.serviceExists(context)) {
            throw new ServiceNotAvailableException();
        }
        this.mRegisteredClients.put(simClientServiceHandle, simClientServiceHandle.createClient(context));
    }

    public synchronized void teardown() {
        try {
            Iterator<BaseClient> it2 = this.mRegisteredClients.values().iterator();
            while (it2.hasNext()) {
                it2.next().teardown();
            }
            this.mRegisteredClients.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
