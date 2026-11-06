package amazon.speech.simclient.context;

import amazon.speech.simclient.common.AsyncServiceConnectionManager;
import amazon.speech.simclient.common.BaseClient;
import amazon.speech.simclient.common.HandlerWrapper;
import amazon.speech.simclient.common.ServiceConnectionManager;
import amazon.speech.simclient.context.IDeviceContextContract;
import amazon.speech.simclient.context.IDeviceContextModificationCallback;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ContextClient extends BaseClient<IDeviceContextContract> {
    static final Intent BIND_INTENT = new Intent(DeviceContextBinding.BIND_ACTION);
    public static final ContextClientHandle HANDLE = new ContextClientHandle();
    private static final String TAG = "ContextClient";
    private final HandlerWrapper mHandler;

    public ContextClient(Context context) {
        this(context, new AsyncServiceConnectionManager(), new HandlerWrapper(new Handler(Looper.getMainLooper())));
    }

    private void attachClientInstance() {
        try {
            getService().attachClientInstance(new Binder());
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException registering client instance");
        }
    }

    private IDeviceContextModificationCallback.Stub createAddBinderCallback(final DeviceContextAddCallback deviceContextAddCallback) {
        if (deviceContextAddCallback == null) {
            return null;
        }
        return new IDeviceContextModificationCallback.Stub() { // from class: amazon.speech.simclient.context.ContextClient.2
            @Override // amazon.speech.simclient.context.IDeviceContextModificationCallback
            public void onFinished(String str) throws RemoteException {
                DeviceContextAddResult deviceContextAddResult = DeviceContextAddResult.FAIL_INTERNAL_ERROR;
                try {
                    deviceContextAddResult = DeviceContextAddResult.valueOf(str);
                } catch (Exception e) {
                    a$$ExternalSyntheticOutline0.m("Exception converting add result to enum ", str, ContextClient.TAG, e);
                }
                ContextClient.this.postModificationCallback(deviceContextAddCallback, deviceContextAddResult);
            }
        };
    }

    private IDeviceContextModificationCallback.Stub createRemoveBinderCallback(final DeviceContextRemoveCallback deviceContextRemoveCallback) {
        if (deviceContextRemoveCallback == null) {
            return null;
        }
        return new IDeviceContextModificationCallback.Stub() { // from class: amazon.speech.simclient.context.ContextClient.3
            @Override // amazon.speech.simclient.context.IDeviceContextModificationCallback
            public void onFinished(String str) throws RemoteException {
                DeviceContextRemoveResult deviceContextRemoveResult = DeviceContextRemoveResult.FAIL_INTERNAL_ERROR;
                try {
                    deviceContextRemoveResult = DeviceContextRemoveResult.valueOf(str);
                } catch (Exception e) {
                    a$$ExternalSyntheticOutline0.m("Exception converting remove result to enum ", str, ContextClient.TAG, e);
                }
                ContextClient.this.postModificationCallback(deviceContextRemoveCallback, deviceContextRemoveResult);
            }
        };
    }

    public static boolean isContextServiceAvailable(Context context) {
        return BaseClient.serviceExists(context, BIND_INTENT, "amazon.speech.permission.SEND_DATA_TO_ALEXA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postModificationCallback(final DeviceContextAddCallback deviceContextAddCallback, final DeviceContextAddResult deviceContextAddResult) {
        this.mHandler.post(new Runnable() { // from class: amazon.speech.simclient.context.ContextClient.4
            @Override // java.lang.Runnable
            public void run() {
                deviceContextAddCallback.onFinished(deviceContextAddResult);
            }
        });
    }

    public boolean addDeviceContext(String str, String str2, String str3, boolean z, DeviceContextAddCallback deviceContextAddCallback) {
        String str4;
        String str5;
        try {
            str4 = str;
            str5 = str2;
        } catch (RemoteException unused) {
            str4 = str;
            str5 = str2;
        }
        try {
            getService().addDeviceContextWithCallback(str4, str5, str3, z, createAddBinderCallback(deviceContextAddCallback));
            return true;
        } catch (RemoteException unused2) {
            a$$ExternalSyntheticOutline0.m4m("RemoteException adding device context ", str4, ".", str5, TAG);
            if (deviceContextAddCallback == null) {
                return false;
            }
            postModificationCallback(deviceContextAddCallback, DeviceContextAddResult.FAIL_INTERNAL_ERROR);
            return false;
        }
    }

    @Override // amazon.speech.simclient.common.BaseClient
    public BaseClient<IDeviceContextContract>.BaseClientServiceConnection createServiceConnection() {
        return new BaseClient<IDeviceContextContract>.BaseClientServiceConnection() { // from class: amazon.speech.simclient.context.ContextClient.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // amazon.speech.simclient.common.BaseClient.BaseClientServiceConnection
            public IDeviceContextContract convertIBinderToService(IBinder iBinder) {
                return IDeviceContextContract.Stub.asInterface(iBinder);
            }
        };
    }

    public List<String> getDeviceContext() throws RemoteException {
        if (isRealServiceConnected()) {
            return getService().getDeviceContext();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Service not yet connected");
        return null;
    }

    public boolean queryDeviceContext(DeviceContextQueryType deviceContextQueryType, IDeviceContextQueryCallback iDeviceContextQueryCallback) {
        try {
            getService().queryDeviceContext(deviceContextQueryType, iDeviceContextQueryCallback);
            return true;
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException querying device context of" + deviceContextQueryType.name());
            if (iDeviceContextQueryCallback == null) {
                return false;
            }
            postModificationCallback(iDeviceContextQueryCallback, DeviceContextQueryResult.ERROR);
            return false;
        }
    }

    public boolean removeDeviceContext(String str, String str2, DeviceContextRemoveCallback deviceContextRemoveCallback) {
        try {
            getService().removeDeviceContextWithCallback(str, str2, createRemoveBinderCallback(deviceContextRemoveCallback));
            return true;
        } catch (RemoteException unused) {
            a$$ExternalSyntheticOutline0.m4m("RemoteException removing device context ", str, ".", str2, TAG);
            if (deviceContextRemoveCallback == null) {
                return false;
            }
            postModificationCallback(deviceContextRemoveCallback, DeviceContextRemoveResult.FAIL_INTERNAL_ERROR);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postModificationCallback(final DeviceContextRemoveCallback deviceContextRemoveCallback, final DeviceContextRemoveResult deviceContextRemoveResult) {
        this.mHandler.post(new Runnable() { // from class: amazon.speech.simclient.context.ContextClient.5
            @Override // java.lang.Runnable
            public void run() {
                deviceContextRemoveCallback.onFinished(deviceContextRemoveResult);
            }
        });
    }

    private void postModificationCallback(final IDeviceContextQueryCallback iDeviceContextQueryCallback, final DeviceContextQueryResult deviceContextQueryResult) {
        this.mHandler.post(new Runnable() { // from class: amazon.speech.simclient.context.ContextClient.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    iDeviceContextQueryCallback.onQueryFinished(deviceContextQueryResult.toString());
                } catch (RemoteException e) {
                    Log.w(ContextClient.TAG, "Failed communicating error back to client", e);
                }
            }
        });
    }

    public ContextClient(Context context, Handler handler) {
        this(context, new AsyncServiceConnectionManager(), new HandlerWrapper(handler));
    }

    public ContextClient(Context context, ServiceConnectionManager serviceConnectionManager, HandlerWrapper handlerWrapper) {
        super(IDeviceContextContract.class, context, BIND_INTENT, "amazon.speech.permission.SEND_DATA_TO_ALEXA", serviceConnectionManager);
        this.mHandler = handlerWrapper;
        attachClientInstance();
    }

    public boolean removeDeviceContext(String str, String str2) {
        try {
            getService().removeDeviceContext(str, str2);
            return true;
        } catch (RemoteException unused) {
            a$$ExternalSyntheticOutline0.m4m("RemoteException removing device context ", str, ".", str2, TAG);
            return false;
        }
    }

    public boolean addDeviceContext(String str, String str2, String str3, boolean z) {
        try {
            getService().addDeviceContext(str, str2, str3, z);
            return true;
        } catch (RemoteException unused) {
            a$$ExternalSyntheticOutline0.m4m("RemoteException adding device context ", str, ".", str2, TAG);
            return false;
        }
    }
}
