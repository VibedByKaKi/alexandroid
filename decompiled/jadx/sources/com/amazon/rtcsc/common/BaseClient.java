package com.amazon.rtcsc.common;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.common.ServiceConnectionManager;
import com.amazon.rtcsc.utils.RtcscLogger;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class BaseClient<T> {
    private T mProxy;
    private volatile T mService;
    private final Class<T> mServiceClass;
    private final ServiceConnectionManager mServiceConnectionManager;
    private RtcscLogger mLog = RtcscLogger.getLogger(BaseClient.class);
    private BaseClient<T>.BaseClientServiceConnection mConnection = createServiceConnection();

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
                BaseClient baseClient = BaseClient.this;
                int intValue = baseClient.queryAPIVersion(baseClient.mService).intValue();
                Iterator<PendingInvocation> it2 = this.mPendingInvocations.iterator();
                while (it2.hasNext()) {
                    PendingInvocation next = it2.next();
                    try {
                        invokeOnService(BaseClient.this.mService, next.mMethod, next.mArgs);
                    } catch (RemoteException unused) {
                        BaseClient.this.mLog.e("RemoteException invoking pending method");
                    }
                }
                this.mPendingInvocations.clear();
                BaseClient.this.mServiceConnectionManager.onServiceConnected(intValue);
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

    public BaseClient(Class<T> cls, Context context, Intent intent, String str, ServiceConnectionManager serviceConnectionManager) {
        this.mServiceClass = cls;
        this.mServiceConnectionManager = serviceConnectionManager;
        serviceConnectionManager.addCallback(new ServiceConnectionManager.Callback() { // from class: com.amazon.rtcsc.common.BaseClient.1
            @Override // com.amazon.rtcsc.common.ServiceConnectionManager.Callback
            public void onBind(boolean z) {
                BaseClient.this.mServiceConnectionManager.removeCallback(this);
                BaseClient.this.mLog.i("onBind: " + z);
                if (z) {
                    return;
                }
                BaseClient.this.teardown();
            }
        });
        serviceConnectionManager.bindService(context, this.mConnection, intent, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer queryAPIVersion(T t) {
        Class<?> cls = t.getClass();
        String simpleName = cls.getSimpleName();
        try {
            try {
                Integer num = (Integer) cls.getMethod("getAPIVersion", null).invoke(t, null);
                num.intValue();
                this.mLog.i("Service (" + simpleName + ") version (" + num + MarkdownConstants.RIGHT_PARENTHESIS);
                return num;
            } catch (Exception e) {
                OnnxMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Unable to pull version from (", simpleName, MarkdownConstants.RIGHT_PARENTHESIS), e);
                return null;
            }
        } catch (NoSuchMethodException unused) {
            this.mLog.w("Service (" + simpleName + ") does not implement (getAPIVersion)");
            return 1;
        }
    }

    public static boolean serviceExists(Context context, Intent intent, String str) {
        return ServiceResolver.resolveBindIntent(context, intent, str) != null;
    }

    public abstract BaseClient<T>.BaseClientServiceConnection createServiceConnection();

    public synchronized T getService() {
        if (this.mConnection == null) {
            this.mLog.e("Cannot retrieve service, already torn down");
            return null;
        }
        if (this.mProxy == null) {
            this.mProxy = (T) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{this.mServiceClass}, this.mConnection);
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
            this.mLog.e("Already torn down, ignoring");
            return;
        }
        this.mServiceConnectionManager.unbindService();
        this.mConnection = null;
        this.mLog.i("Client torn down successfully.");
    }
}
