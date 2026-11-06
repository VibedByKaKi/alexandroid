package com.amazon.alexa.android.extension.discovery;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.dee.app.elements.bridges.PermissionServiceDelegate;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class ExtensionBinder {
    private static final String TAG = "ExtensionBinder";
    private final Map<String, ExtensionConnection> mBindings = new ArrayMap();
    private final Object mConnectionLock = new Object();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConnectionCallback {
        public static final int FAIL_COM = -300;
        public static final int FAIL_DIED = -200;
        public static final int FAIL_DISCONNECTED = -100;

        void bindingFailure(int i, String str);

        void bindingSuccess(IBinder iBinder);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ExtensionConnection implements ServiceConnection {
        private final ConnectionCallback mCallback;

        public ExtensionConnection(@NonNull ConnectionCallback connectionCallback) {
            this.mCallback = connectionCallback;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            this.mCallback.bindingFailure(-200, "binding died");
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            this.mCallback.bindingFailure(-300, "null binding");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.mCallback.bindingSuccess(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.mCallback.bindingFailure(-100, "binding terminated");
        }
    }

    public boolean bind(@NonNull Context context, @NonNull String str, @NonNull ConnectionCallback connectionCallback) throws IllegalStateException {
        if (context == null) {
            Log.e(TAG, PermissionServiceDelegate.ERROR_NULL_CONTEXT);
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "Invalid extension URI:" + str);
            return false;
        }
        if (connectionCallback == null) {
            Log.e(TAG, "Null callback");
            return false;
        }
        synchronized (this.mConnectionLock) {
            try {
                if (this.mBindings.get(str) != null) {
                    Log.wtf(TAG, "Expected L2 Multiplex client to manage duplicate requests");
                    throw new IllegalStateException("Multiple requests on single extensionURI is invalid");
                }
                Intent createExtensionIntent = ExtensionDiscovery.createExtensionIntent();
                ExtensionConnection extensionConnection = new ExtensionConnection(connectionCallback);
                ComponentName componentName = ExtensionDiscovery.getInstance(context).getComponentName(str);
                if (componentName == null) {
                    Log.e(TAG, "Cannot find service component: " + str);
                    return false;
                }
                createExtensionIntent.setComponent(componentName);
                try {
                    boolean bindService = context.bindService(createExtensionIntent, extensionConnection, 1);
                    if (bindService) {
                        this.mBindings.put(str, extensionConnection);
                    } else {
                        Log.e(TAG, "Android binding failed to connect:" + componentName);
                    }
                    return bindService;
                } catch (SecurityException e) {
                    Log.e(TAG, "Permission missing, the runtime does not have sufficient permissions for service:" + componentName, e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public int getBindingCount() {
        int size;
        synchronized (this.mConnectionLock) {
            size = this.mBindings.size();
        }
        return size;
    }

    public boolean unbind(@NonNull Context context, @NonNull String str) {
        boolean z;
        synchronized (this.mConnectionLock) {
            try {
                ExtensionConnection remove = this.mBindings.remove(str);
                if (remove != null) {
                    context.unbindService(remove);
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void unbindAll(@NonNull Context context) {
        synchronized (this.mConnectionLock) {
            for (String str : this.mBindings.keySet()) {
                try {
                    unbind(context, str);
                } catch (Exception unused) {
                    Log.wtf(TAG, "Unbind Failure " + str);
                }
            }
        }
    }
}
