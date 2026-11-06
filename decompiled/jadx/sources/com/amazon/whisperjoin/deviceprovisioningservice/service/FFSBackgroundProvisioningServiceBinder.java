package com.amazon.whisperjoin.deviceprovisioningservice.service;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface;
import com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback;
import com.amazon.whisperjoin.deviceprovisioningservice.di.DaggerWrapper;
import com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider;
import com.amazon.whisperjoin.deviceprovisioningservice.util.SharedPreferencesProvider;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes.WJErrorUtils;
import java.lang.ref.WeakReference;
import java.util.Locale;
import javax.inject.Inject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FFSBackgroundProvisioningServiceBinder extends Service {
    private static final String PREF_NAME = "FFSBackgroundProvisioningServiceBinder";
    private static final String PREF_SHUTDOWN_BY_CLIENT = "ShutdownByClient";
    private static final String TAG = "FFSBackgroundProvisioningServiceBinder";
    private final ClientEventDispatch mEventDispatch = new ClientEventDispatch();
    private FFSProvisioningService mFFSProvisioningService = null;

    @Inject
    MapAuthenticationProvider mMapAuthenticationProvider;
    private ProvisioningServiceConfiguration mProvisioningServiceConfiguration;
    private ServiceInterface mServiceInterface;

    @Inject
    SharedPreferencesProvider mSharedPreferencesProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ClientEventDispatch extends ProvisioningWorkflowEventCallback.Stub {
        private WeakReference<ProvisioningWorkflowEventCallback> mListener;

        public ClientEventDispatch() {
            setListener(null);
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback
        public void onComplete() {
            if (this.mListener.get() != null) {
                try {
                    this.mListener.get().onComplete();
                } catch (RemoteException e) {
                    WJLog.e(FFSBackgroundProvisioningServiceBinder.TAG, "RemoteException Occurred", e);
                }
            }
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback
        public void onError(String str, String str2, String str3) throws RemoteException {
            if (this.mListener.get() != null) {
                this.mListener.get().onError(str, str2, str3);
            }
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback
        public void onNext(String str, String str2) throws RemoteException {
            if (this.mListener.get() != null) {
                this.mListener.get().onNext(str, str2);
            }
        }

        public void setListener(ProvisioningWorkflowEventCallback provisioningWorkflowEventCallback) {
            this.mListener = new WeakReference<>(provisioningWorkflowEventCallback);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ServiceInterface extends DeviceProvisioningServiceInterface.Stub {
        final WeakReference<FFSBackgroundProvisioningServiceBinder> mBinderReference;
        private final String mLogPrefix = "DeviceProvisioningServiceInterface - ";

        public ServiceInterface(FFSBackgroundProvisioningServiceBinder fFSBackgroundProvisioningServiceBinder) {
            this.mBinderReference = new WeakReference<>(fFSBackgroundProvisioningServiceBinder);
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
        public boolean addCallback(ProvisioningWorkflowEventCallback provisioningWorkflowEventCallback) throws RemoteException {
            if (this.mBinderReference.get() == null) {
                return true;
            }
            try {
                WJLog.d(FFSBackgroundProvisioningServiceBinder.TAG, this.mLogPrefix + "addCallback");
                this.mBinderReference.get().mEventDispatch.setListener(provisioningWorkflowEventCallback);
                return true;
            } catch (Throwable th) {
                this.mBinderReference.get().logAIDLException(th, "addCallback");
                throw th;
            }
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
        public boolean isActive() throws RemoteException {
            if (this.mBinderReference.get() == null) {
                return false;
            }
            try {
                WJLog.d(FFSBackgroundProvisioningServiceBinder.TAG, this.mLogPrefix + "isServiceRunning");
                if (this.mBinderReference.get().mFFSProvisioningService != null) {
                    return this.mBinderReference.get().mFFSProvisioningService.isServiceRunning();
                }
                return false;
            } catch (Throwable th) {
                this.mBinderReference.get().logAIDLException(th, VoiceChatContract.COLUMN_IS_ACTIVE);
                throw th;
            }
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
        public boolean removeCallback(ProvisioningWorkflowEventCallback provisioningWorkflowEventCallback) throws RemoteException {
            if (this.mBinderReference.get() == null) {
                return true;
            }
            try {
                WJLog.d(FFSBackgroundProvisioningServiceBinder.TAG, this.mLogPrefix + "removeCallback");
                this.mBinderReference.get().mEventDispatch.setListener(null);
                return true;
            } catch (Throwable th) {
                this.mBinderReference.get().logAIDLException(th, "removeCallback");
                throw th;
            }
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
        public boolean shutdown() throws RemoteException {
            if (this.mBinderReference.get() == null) {
                return true;
            }
            try {
                WJLog.d(FFSBackgroundProvisioningServiceBinder.TAG, this.mLogPrefix + "shutdown");
                return FFSBackgroundProvisioningServiceBinder.m23218$$Nest$mstopFFSService(this.mBinderReference.get());
            } catch (Throwable th) {
                this.mBinderReference.get().logAIDLException(th, "shutdown");
                throw th;
            }
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.DeviceProvisioningServiceInterface
        public boolean start(ProvisioningServiceConfiguration provisioningServiceConfiguration) throws RemoteException {
            if (this.mBinderReference.get() == null) {
                return true;
            }
            try {
                WJLog.d(FFSBackgroundProvisioningServiceBinder.TAG, this.mLogPrefix + "start");
                return FFSBackgroundProvisioningServiceBinder.m23217$$Nest$mstartFFSService(this.mBinderReference.get(), provisioningServiceConfiguration);
            } catch (Throwable th) {
                this.mBinderReference.get().logAIDLException(th, "start");
                throw th;
            }
        }
    }

    /* renamed from: -$$Nest$mstartFFSService, reason: not valid java name */
    public static /* bridge */ /* synthetic */ boolean m23217$$Nest$mstartFFSService(FFSBackgroundProvisioningServiceBinder fFSBackgroundProvisioningServiceBinder, ProvisioningServiceConfiguration provisioningServiceConfiguration) {
        return fFSBackgroundProvisioningServiceBinder.startFFSService(provisioningServiceConfiguration, true);
    }

    /* renamed from: -$$Nest$mstopFFSService, reason: not valid java name */
    public static /* bridge */ /* synthetic */ boolean m23218$$Nest$mstopFFSService(FFSBackgroundProvisioningServiceBinder fFSBackgroundProvisioningServiceBinder) {
        return fFSBackgroundProvisioningServiceBinder.stopFFSService(true);
    }

    private void attemptRestartFFS(Intent intent) {
        ProvisioningServiceConfiguration fromSharedPreferences = ProvisioningServiceConfiguration.getFromSharedPreferences(getPreferences());
        boolean z = getPreferences().getBoolean(PREF_SHUTDOWN_BY_CLIENT, false);
        String str = TAG;
        Locale locale = Locale.ENGLISH;
        boolean z2 = fromSharedPreferences != null;
        boolean z3 = intent == null;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("attemptRestartFFS - Existing Configuration: ", z2, ". Shutdown By Client: ", z, ". Binder Service Restarted After Being Killed: ");
        m.append(z3);
        m.append(".");
        WJLog.d(str, m.toString());
        if (intent != null || fromSharedPreferences == null || z) {
            WJLog.d(str, "Not attempting restart of FFS");
            return;
        }
        WJLog.d(str, "Attempting restart of FFS");
        WJLog.d(str, "FFS successfully restarted after being killed by system: " + startFFSService(fromSharedPreferences, false));
    }

    private SharedPreferences getPreferences() {
        return this.mSharedPreferencesProvider.get("FFSBackgroundProvisioningServiceBinder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logAIDLException(Throwable th, String str) {
        String str2 = TAG;
        Locale locale = Locale.ENGLISH;
        String th2 = th.toString();
        String th3 = WJErrorUtils.getRootCause(th).toString();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("An exception occurred while executing method ", str, ". Exception: ", th2, ", RootCause: ");
        m.append(th3);
        WJLog.e(str2, m.toString(), th);
    }

    private boolean startFFSService(ProvisioningServiceConfiguration provisioningServiceConfiguration, boolean z) {
        if (provisioningServiceConfiguration == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("provisioningServiceConfiguration can not be null");
            return false;
        }
        this.mProvisioningServiceConfiguration = provisioningServiceConfiguration;
        if (this.mMapAuthenticationProvider.getAccount() == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("FFS can't be started if a customer is not logged in");
            return false;
        }
        String str = TAG;
        WJLog.d(str, String.format(Locale.ENGLISH, "startFFSService - startedByClient: %b, configuration: %s", Boolean.valueOf(z), provisioningServiceConfiguration));
        if (this.mFFSProvisioningService != null) {
            WJLog.d(str, "FFS Service not started because its already running");
            return false;
        }
        this.mFFSProvisioningService = new FFSProvisioningService(provisioningServiceConfiguration, new RemoteClientProvisioningEventListener(this.mEventDispatch));
        WJLog.d(str, "Starting FFS Provisioning Service");
        this.mFFSProvisioningService.start();
        AppLaunchChecker$$ExternalSyntheticOutline0.m(getPreferences(), PREF_SHUTDOWN_BY_CLIENT, false);
        provisioningServiceConfiguration.writeToSharedPreferences(getPreferences().edit());
        return true;
    }

    private boolean stopFFSService(boolean z) {
        String str = TAG;
        Locale locale = Locale.ENGLISH;
        WJLog.d(str, "stopFFSService - shutdownByClient :" + z);
        if (z) {
            AppLaunchChecker$$ExternalSyntheticOutline0.m(getPreferences(), PREF_SHUTDOWN_BY_CLIENT, true);
        }
        FFSProvisioningService fFSProvisioningService = this.mFFSProvisioningService;
        if (fFSProvisioningService != null) {
            fFSProvisioningService.shutdown();
            this.mFFSProvisioningService = null;
        }
        return true;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        WJLog.d(TAG, "onBind: Intent - " + intent);
        return this.mServiceInterface;
    }

    @Override // android.app.Service
    public void onCreate() {
        DaggerWrapper.initializeBaseComponent(getApplicationContext());
        DaggerWrapper.getBaseDependencyInjector().inject(this);
        super.onCreate();
        this.mServiceInterface = new ServiceInterface(this);
        WJLog.d(TAG, "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        WJLog.d(TAG, "onDestroy");
        stopFFSService(false);
        this.mServiceInterface = null;
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        WJLog.d(TAG, "onRebind");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        String str = TAG;
        Locale locale = Locale.ENGLISH;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(i, "onStartCommand - Intent: ", intent == null ? "null" : intent.toString(), ". Flags: ", ". StartId: ");
        m.append(i2);
        m.append(".");
        WJLog.d(str, m.toString());
        attemptRestartFFS(intent);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        WJLog.d(TAG, "onUnbind - Intent: " + intent);
        return super.onUnbind(intent);
    }
}
