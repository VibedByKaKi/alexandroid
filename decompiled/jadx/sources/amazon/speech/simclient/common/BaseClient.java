package amazon.speech.simclient.common;

import amazon.speech.simclient.common.ServiceConnectionManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class BaseClient<T extends IInterface> {
    private static final String TAG = "SPCH-BaseClient";
    private BaseClient<T>.BaseClientServiceConnection mConnection;
    private T mProxy;
    private volatile T mService;
    private final Class<T> mServiceClass;
    private final ServiceConnectionManager mServiceConnectionManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public abstract class BaseClientServiceConnection implements ServiceConnection, InvocationHandler {
        private final ArrayList<PendingInvocation> mPendingInvocations = new ArrayList<>();

        public BaseClientServiceConnection() {
        }

        private Object invokeOnService(Object obj, Method method, Object[] objArr) throws RemoteException {
            try {
                return method.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                CodecsKt$$ExternalSyntheticBUOutline0.m(e, method, "Failed to proxy pending invocation ");
                return null;
            } catch (InvocationTargetException e2) {
                Throwable targetException = e2.getTargetException();
                if (targetException instanceof RemoteException) {
                    throw ((RemoteException) targetException);
                }
                CodecsKt$$ExternalSyntheticBUOutline0.m(e2, method, "Failed to proxy pending invocation ");
                return null;
            }
        }

        public abstract T convertIBinderToService(IBinder iBinder);

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            synchronized (BaseClient.this) {
                try {
                    if (BaseClient.this.isTornDown()) {
                        throw new IllegalStateException("Cannot invoke on a torn down client");
                    }
                    if (BaseClient.this.mService != null) {
                        return invokeOnService(BaseClient.this.mService, method, objArr);
                    }
                    Class<?> returnType = method.getReturnType();
                    Class cls = Void.TYPE;
                    if (!cls.equals(returnType) && !cls.equals(returnType)) {
                        throw new ReturnValueMethodInvocationException();
                    }
                    this.mPendingInvocations.add(new PendingInvocation(method, objArr));
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (BaseClient.this) {
                BaseClient.this.mService = convertIBinderToService(iBinder);
                Iterator<PendingInvocation> it2 = this.mPendingInvocations.iterator();
                while (it2.hasNext()) {
                    PendingInvocation next = it2.next();
                    try {
                        invokeOnService(BaseClient.this.mService, next.mMethod, next.mArgs);
                    } catch (RemoteException e) {
                        Log.e(BaseClient.TAG, "RemoteException invoking pending method", e);
                    }
                }
                this.mPendingInvocations.clear();
                BaseClient.this.mServiceConnectionManager.onServiceConnected();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            BaseClient.this.mService = null;
            BaseClient.this.mServiceConnectionManager.onServiceDisconnected();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PendingInvocation {
        public final Object[] mArgs;
        public final Method mMethod;

        public PendingInvocation(Method method, Object[] objArr) {
            this.mMethod = method;
            this.mArgs = objArr;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReturnValueMethodInvocationException extends RuntimeException {
        public ReturnValueMethodInvocationException() {
            super("Method which returns a value called on the proxy service!");
        }
    }

    public BaseClient(Class<T> cls, final Context context, Intent intent, final Intent intent2, final String str, ServiceConnectionManager serviceConnectionManager) {
        this.mServiceClass = cls;
        this.mServiceConnectionManager = serviceConnectionManager;
        this.mConnection = createServiceConnection();
        serviceConnectionManager.addCallback(new ServiceConnectionManager.Callback() { // from class: amazon.speech.simclient.common.BaseClient.1
            @Override // amazon.speech.simclient.common.ServiceConnectionManager.Callback
            public void onBind(boolean z) {
                BaseClient.this.mServiceConnectionManager.removeCallback(this);
                if (z) {
                    return;
                }
                if (intent2 == null) {
                    BaseClient.this.teardown();
                    Log.wtf(BaseClient.TAG, a$$ExternalSyntheticOutline0.m("Binding for (", BaseClient.this.getClass().getSimpleName(), ") in package (", context.getPackageName(), ") was unsuccessful. This probably means the service does not exist, or the client attempting to bind does not have the correct permissions"));
                } else {
                    Log.i(BaseClient.TAG, "Binding to preferred intent failed. Now trying to bind to backup intent");
                    BaseClient.this.mServiceConnectionManager.addCallback(new ServiceConnectionManager.Callback() { // from class: amazon.speech.simclient.common.BaseClient.1.1
                        @Override // amazon.speech.simclient.common.ServiceConnectionManager.Callback
                        public void onBind(boolean z2) {
                            BaseClient.this.mServiceConnectionManager.removeCallback(this);
                            if (z2) {
                                return;
                            }
                            BaseClient.this.teardown();
                            Log.wtf(BaseClient.TAG, "Binding to backup intent failed. Tearing down the client.");
                        }
                    });
                    BaseClient.this.mServiceConnectionManager.bindService(context, BaseClient.this.mConnection, intent2, str);
                }
            }
        });
        serviceConnectionManager.bindService(context, this.mConnection, intent, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean isTornDown() {
        return this.mConnection == null;
    }

    public static boolean serviceExists(Context context, Intent intent, String str) {
        return ServiceResolver.resolveBindIntent(context, intent, str) != null;
    }

    public abstract BaseClient<T>.BaseClientServiceConnection createServiceConnection();

    public synchronized T getService() {
        try {
            if (this.mConnection == null) {
                Log.e(TAG, "Cannot retrieve service, already torn down");
                throw new RuntimeException("Client already torn down!");
            }
            if (this.mProxy == null) {
                this.mProxy = (T) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{this.mServiceClass}, this.mConnection);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mProxy;
    }

    public ServiceConnectionManager getServiceConnectionManager() {
        return this.mServiceConnectionManager;
    }

    public boolean isRealServiceConnected() {
        return this.mService != null;
    }

    public synchronized void teardown() {
        if (this.mConnection == null) {
            Log.e(TAG, "Already torn down, ignoring");
        } else {
            this.mServiceConnectionManager.unbindService();
            this.mConnection = null;
        }
    }

    public BaseClient(Class<T> cls, Context context, Intent intent, String str, ServiceConnectionManager serviceConnectionManager) {
        this(cls, context, intent, null, str, serviceConnectionManager);
    }

    public BaseClient(Class<T> cls, Context context, Intent intent, String str) {
        this(cls, context, intent, str, new SyncServiceConnectionManager());
    }
}
