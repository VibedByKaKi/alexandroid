package amazon.speech.simclient.event;

import amazon.speech.simclient.common.AsyncServiceConnectionManager;
import amazon.speech.simclient.common.BaseClient;
import amazon.speech.simclient.common.HandlerWrapper;
import amazon.speech.simclient.common.InvocationStatus;
import amazon.speech.simclient.common.ServiceConnectionManager;
import amazon.speech.simclient.event.IEventCallback;
import amazon.speech.simclient.event.ISimClientEventServer;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class EventClient extends BaseClient<ISimClientEventServer> {
    static final Intent BIND_INTENT = new Intent(ImplicitBinding.BIND_ACTION);
    public static final EventClientHandle HANDLE = new EventClientHandle();
    private static final String TAG = "EventClient";
    private final Binder mBinder;
    private final HandlerWrapper mHandler;

    public EventClient(Context context) {
        this(context, new HandlerWrapper(new Handler(Looper.getMainLooper())), new AsyncServiceConnectionManager());
    }

    public static boolean isEventServiceAvailable(Context context) {
        return BaseClient.serviceExists(context, BIND_INTENT, "amazon.speech.permission.SEND_DATA_TO_ALEXA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postResult(final EventStatusCallback eventStatusCallback, final EventResult eventResult) {
        if (eventStatusCallback == null) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: amazon.speech.simclient.event.EventClient.3
            @Override // java.lang.Runnable
            public void run() {
                eventStatusCallback.onResult(eventResult);
            }
        });
    }

    public InvocationStatus clearDeathEvent() {
        try {
            getService().clearDeathEvents(this.mBinder);
            return InvocationStatus.SUCCESS;
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException clearing death event");
            return InvocationStatus.REMOTE_EXCEPTION;
        }
    }

    public IEventCallback createIEventCallback(final EventStatusCallback eventStatusCallback) {
        if (eventStatusCallback == null) {
            return null;
        }
        return new IEventCallback.Stub() { // from class: amazon.speech.simclient.event.EventClient.2
            @Override // amazon.speech.simclient.event.IEventCallback
            public void onResult(String str) throws RemoteException {
                EventResult eventResult = EventResult.UNKNOWN_ERROR;
                try {
                    eventResult = EventResult.valueOf(str);
                } catch (Exception e) {
                    a$$ExternalSyntheticOutline0.m("Exception converting result to enum ", str, EventClient.TAG, e);
                }
                EventClient.this.postResult(eventStatusCallback, eventResult);
            }
        };
    }

    @Override // amazon.speech.simclient.common.BaseClient
    public BaseClient<ISimClientEventServer>.BaseClientServiceConnection createServiceConnection() {
        return new BaseClient<ISimClientEventServer>.BaseClientServiceConnection() { // from class: amazon.speech.simclient.event.EventClient.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // amazon.speech.simclient.common.BaseClient.BaseClientServiceConnection
            public ISimClientEventServer convertIBinderToService(IBinder iBinder) {
                return ISimClientEventServer.Stub.asInterface(iBinder);
            }
        };
    }

    public void sendEvent(EventMetadata eventMetadata, String str, EventStatusCallback eventStatusCallback) {
        if (eventMetadata == null || str == null) {
            Log.e(TAG, "Invalid arguments");
            postResult(eventStatusCallback, EventResult.INVALID_EVENT);
            return;
        }
        try {
            getService().sendEvent(eventMetadata, str, createIEventCallback(eventStatusCallback));
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException sending event (with callback) " + eventMetadata.getNamespace() + "." + eventMetadata.getName());
            postResult(eventStatusCallback, EventResult.INTERNAL_ERROR);
        }
    }

    public InvocationStatus setDeathEvent(EventMetadata eventMetadata, String str) {
        if (eventMetadata == null || str == null) {
            Log.e(TAG, "Invalid arguments");
            return InvocationStatus.INVALID_INPUT;
        }
        try {
            getService().addDeathEvent(eventMetadata, str, this.mBinder);
            return InvocationStatus.SUCCESS;
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException setting death event " + eventMetadata.getNamespace() + "." + eventMetadata.getName());
            return InvocationStatus.REMOTE_EXCEPTION;
        }
    }

    public EventClient(Context context, HandlerWrapper handlerWrapper, ServiceConnectionManager serviceConnectionManager) {
        super(ISimClientEventServer.class, context, BIND_INTENT, "amazon.speech.permission.SEND_DATA_TO_ALEXA", serviceConnectionManager);
        this.mHandler = handlerWrapper;
        this.mBinder = new Binder();
    }

    public void sendEvent(EventMetadata eventMetadata, String str) {
        sendEvent(eventMetadata, str, null);
    }
}
