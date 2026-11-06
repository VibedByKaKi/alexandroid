package com.amazon.alexa.auth.map;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.auth.AbstractAccountManager;
import com.amazon.alexa.auth.AccessToken;
import com.amazon.alexa.auth.AccountManager;
import com.amazon.alexa.auth.map.AuthorizationServiceProxy;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MAPAccountManager extends AbstractAccountManager implements ServiceConnection {
    private static final String CHILD_ACCOUNT_POOL_STRING = "ChildAccountPool";

    @VisibleForTesting
    static final long PENDING_TASK_TIMEOUT_MS = 2000;
    private static final String TAG = "MAPAccountManager";
    private AuthorizationServiceProxy authorizationServiceProxy;
    private long connectToServiceTime;
    private final Context context;
    private volatile boolean isConnected;
    private volatile boolean isConnecting;
    private volatile boolean isTornDown;
    private final Queue<PendingTask> runnableQueue;
    private final ComponentName serviceComponentName;
    private final ExecutorService taskExecutor;
    private final ScheduledExecutorService timeoutScheduler;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PendingTask {
        void fail(@NonNull Exception exc);

        void run(@NonNull AuthorizationServiceProxy authorizationServiceProxy);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TimeBoundTask implements PendingTask {
        private final PendingTask delegate;
        private volatile ScheduledFuture<?> timeout;

        public TimeBoundTask(PendingTask pendingTask) {
            this.delegate = pendingTask;
        }

        public void armTimeout(@NonNull ScheduledFuture<?> scheduledFuture) {
            this.timeout = scheduledFuture;
        }

        @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
        public void fail(@NonNull Exception exc) {
            this.delegate.fail(exc);
        }

        @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
        public void run(@NonNull AuthorizationServiceProxy authorizationServiceProxy) {
            ScheduledFuture<?> scheduledFuture = this.timeout;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.delegate.run(authorizationServiceProxy);
        }
    }

    @VisibleForTesting
    public MAPAccountManager(Context context, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        super(context);
        this.context = context.getApplicationContext();
        this.serviceComponentName = new ComponentName(context, (Class<?>) MAPProxyService.class);
        this.runnableQueue = new ConcurrentLinkedQueue();
        this.taskExecutor = executorService;
        this.timeoutScheduler = scheduledExecutorService;
        connectToService();
    }

    private void connectToService() {
        if (this.isConnected || this.isConnecting) {
            return;
        }
        String str = TAG;
        this.isConnecting = true;
        Intent intent = new Intent();
        intent.setClass(this.context, MAPProxyService.class);
        this.connectToServiceTime = SystemClock.elapsedRealtime();
        if (this.context.bindService(intent, this, 65)) {
            return;
        }
        Log.e(str, "Error connecting to authorization service. Unbinding");
        this.context.unbindService(this);
        this.isConnecting = false;
    }

    private void disconnectFromService() {
        if (this.isConnected || this.isConnecting) {
            try {
                this.context.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e(TAG, "Error happened when trying to unbind service " + e.getMessage());
            }
            this.isConnected = false;
            this.isConnecting = false;
        }
    }

    private void enqueueWithTimeout(PendingTask pendingTask) {
        final TimeBoundTask timeBoundTask = new TimeBoundTask(pendingTask);
        this.runnableQueue.add(timeBoundTask);
        try {
            timeBoundTask.armTimeout(this.timeoutScheduler.schedule(new Runnable() { // from class: com.amazon.alexa.auth.map.MAPAccountManager.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MAPAccountManager.this.runnableQueue.remove(timeBoundTask)) {
                        timeBoundTask.fail(new TimeoutException("Authorization service did not connect within 2000ms"));
                    }
                }
            }, 2000L, TimeUnit.MILLISECONDS));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executePendingTasks(@NonNull AuthorizationServiceProxy authorizationServiceProxy) {
        while (true) {
            PendingTask poll = this.runnableQueue.poll();
            if (poll == null) {
                return;
            } else {
                poll.run(authorizationServiceProxy);
            }
        }
    }

    private String getAccountPoolInternal() {
        try {
            return this.authorizationServiceProxy.getAccountPool();
        } catch (RemoteException unused) {
            return null;
        }
    }

    private String getActorTokenInternal(String str) {
        try {
            return this.authorizationServiceProxy.getActorToken(str);
        } catch (RemoteException e) {
            Log.e(TAG, "Remote exception", e);
            return null;
        }
    }

    private String getDeviceSerialNumberInternal() {
        try {
            return this.authorizationServiceProxy.getDeviceSerialNumber();
        } catch (RemoteException unused) {
            return null;
        }
    }

    private String getDirectedIDInternal() {
        try {
            return this.authorizationServiceProxy.getDirectedID();
        } catch (RemoteException unused) {
            return null;
        }
    }

    private String getMarketplaceInternal() {
        try {
            return this.authorizationServiceProxy.getMarketplace();
        } catch (RemoteException unused) {
            return null;
        }
    }

    private String getTokenInternal() {
        try {
            return this.authorizationServiceProxy.getToken();
        } catch (RemoteException unused) {
            return null;
        }
    }

    private void handleServiceDisappeared(ComponentName componentName, boolean z) {
        synchronized (this) {
            try {
                disconnectFromService();
                this.isConnected = false;
                this.isConnecting = false;
                this.authorizationServiceProxy = null;
                if (!this.isTornDown && z) {
                    connectToService();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void clearCache() {
        if (this.isConnected) {
            disconnectFromService();
        }
    }

    @VisibleForTesting
    public AuthorizationServiceProxy createProxy(IBinder iBinder) {
        return AuthorizationServiceProxy.Stub.asInterface(iBinder);
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void getActorToken(@NonNull final String str, @NonNull final AccountManager.ResultCallback<AccessToken> resultCallback) {
        try {
            if (this.isConnected) {
                String actorTokenInternal = getActorTokenInternal(str);
                if (actorTokenInternal != null) {
                    resultCallback.onResult(AccessToken.create(actorTokenInternal));
                    return;
                }
                clearCache();
            } else {
                connectToService();
            }
            enqueueWithTimeout(new PendingTask() { // from class: com.amazon.alexa.auth.map.MAPAccountManager.4
                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void fail(@NonNull Exception exc) {
                    resultCallback.onError(exc);
                }

                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void run(@NonNull AuthorizationServiceProxy authorizationServiceProxy) {
                    try {
                        resultCallback.onResult(AccessToken.create(authorizationServiceProxy.getActorToken(str)));
                    } catch (RemoteException e) {
                        resultCallback.onError(e);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void getDeviceSerialNumber(@NonNull final AccountManager.ResultCallback<String> resultCallback) {
        try {
            if (this.isConnected) {
                String deviceSerialNumberInternal = getDeviceSerialNumberInternal();
                if (deviceSerialNumberInternal != null) {
                    resultCallback.onResult(deviceSerialNumberInternal);
                    return;
                }
                clearCache();
            } else {
                connectToService();
            }
            enqueueWithTimeout(new PendingTask() { // from class: com.amazon.alexa.auth.map.MAPAccountManager.6
                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void fail(@NonNull Exception exc) {
                    resultCallback.onError(exc);
                }

                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void run(@NonNull AuthorizationServiceProxy authorizationServiceProxy) {
                    try {
                        resultCallback.onResult(authorizationServiceProxy.getDeviceSerialNumber());
                    } catch (RemoteException e) {
                        resultCallback.onError(e);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void getDirectedID(@NonNull final AccountManager.ResultCallback<String> resultCallback) {
        try {
            if (this.isConnected) {
                String directedIDInternal = getDirectedIDInternal();
                if (directedIDInternal != null) {
                    resultCallback.onResult(directedIDInternal);
                    return;
                }
                clearCache();
            } else {
                connectToService();
            }
            enqueueWithTimeout(new PendingTask() { // from class: com.amazon.alexa.auth.map.MAPAccountManager.5
                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void fail(@NonNull Exception exc) {
                    resultCallback.onError(exc);
                }

                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void run(@NonNull AuthorizationServiceProxy authorizationServiceProxy) {
                    try {
                        resultCallback.onResult(authorizationServiceProxy.getDirectedID());
                    } catch (RemoteException e) {
                        resultCallback.onError(e);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void getMarketplace(@NonNull final AccountManager.ResultCallback<String> resultCallback) {
        try {
            if (this.isConnected) {
                String marketplaceInternal = getMarketplaceInternal();
                if (marketplaceInternal != null) {
                    resultCallback.onResult(marketplaceInternal);
                    return;
                }
                clearCache();
            } else {
                connectToService();
            }
            enqueueWithTimeout(new PendingTask() { // from class: com.amazon.alexa.auth.map.MAPAccountManager.2
                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void fail(@NonNull Exception exc) {
                    resultCallback.onError(exc);
                }

                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void run(@NonNull AuthorizationServiceProxy authorizationServiceProxy) {
                    try {
                        resultCallback.onResult(authorizationServiceProxy.getMarketplace());
                    } catch (RemoteException e) {
                        resultCallback.onError(e);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void getToken(@NonNull final AccountManager.ResultCallback<AccessToken> resultCallback) {
        try {
            if (this.isConnected) {
                String tokenInternal = getTokenInternal();
                if (tokenInternal != null) {
                    resultCallback.onResult(AccessToken.create(tokenInternal));
                    return;
                }
                clearCache();
            } else {
                connectToService();
            }
            enqueueWithTimeout(new PendingTask() { // from class: com.amazon.alexa.auth.map.MAPAccountManager.3
                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void fail(@NonNull Exception exc) {
                    resultCallback.onError(exc);
                }

                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void run(@NonNull AuthorizationServiceProxy authorizationServiceProxy) {
                    try {
                        resultCallback.onResult(AccessToken.create(authorizationServiceProxy.getToken()));
                    } catch (RemoteException e) {
                        resultCallback.onError(e);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void isChildProfile(@NonNull final AccountManager.ResultCallback<Boolean> resultCallback) {
        try {
            if (this.isConnected) {
                String accountPoolInternal = getAccountPoolInternal();
                if (accountPoolInternal != null) {
                    resultCallback.onResult(Boolean.valueOf(accountPoolInternal.equals("ChildAccountPool")));
                    return;
                }
                clearCache();
            } else {
                connectToService();
            }
            enqueueWithTimeout(new PendingTask() { // from class: com.amazon.alexa.auth.map.MAPAccountManager.8
                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void fail(@NonNull Exception exc) {
                    resultCallback.onError(exc);
                }

                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void run(@NonNull AuthorizationServiceProxy authorizationServiceProxy) {
                    String str;
                    try {
                        str = authorizationServiceProxy.getAccountPool();
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    resultCallback.onResult(Boolean.valueOf("ChildAccountPool".equals(str)));
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.alexa.auth.AccountManager
    public synchronized void isLoggedIn(@NonNull final AccountManager.ResultCallback<Boolean> resultCallback) {
        try {
            if (this.isConnected) {
                try {
                    if (this.authorizationServiceProxy.isLoggedIn()) {
                        resultCallback.onResult(Boolean.TRUE);
                        return;
                    }
                    clearCache();
                } catch (RemoteException unused) {
                    clearCache();
                }
            } else {
                connectToService();
            }
            enqueueWithTimeout(new PendingTask() { // from class: com.amazon.alexa.auth.map.MAPAccountManager.7
                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void fail(@NonNull Exception exc) {
                    resultCallback.onError(exc);
                }

                @Override // com.amazon.alexa.auth.map.MAPAccountManager.PendingTask
                public void run(@NonNull AuthorizationServiceProxy authorizationServiceProxy) {
                    try {
                        resultCallback.onResult(Boolean.valueOf(authorizationServiceProxy.isLoggedIn()));
                    } catch (RemoteException e) {
                        resultCallback.onError(e);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        if (this.serviceComponentName.equals(componentName)) {
            Log.w(TAG, "AuthorizationService binding died");
            handleServiceDisappeared(componentName, true);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.serviceComponentName.equals(componentName)) {
            synchronized (this) {
                try {
                    this.isConnected = true;
                    this.isConnecting = false;
                    this.authorizationServiceProxy = createProxy(iBinder);
                    SystemClock.elapsedRealtime();
                    if (this.isTornDown) {
                        disconnectFromService();
                        return;
                    }
                    final AuthorizationServiceProxy authorizationServiceProxy = this.authorizationServiceProxy;
                    try {
                        this.taskExecutor.execute(new Runnable() { // from class: com.amazon.alexa.auth.map.MAPAccountManager.9
                            @Override // java.lang.Runnable
                            public void run() {
                                MAPAccountManager.this.executePendingTasks(authorizationServiceProxy);
                            }
                        });
                    } catch (RejectedExecutionException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.serviceComponentName.equals(componentName)) {
            Log.w(TAG, "AuthorizationService disconnected");
            handleServiceDisappeared(componentName, false);
        }
    }

    @Override // com.amazon.alexa.auth.AbstractAccountManager, com.amazon.alexa.auth.AccountManager
    public synchronized void teardown() {
        super.teardown();
        this.isTornDown = true;
        this.runnableQueue.clear();
        this.taskExecutor.shutdown();
        this.timeoutScheduler.shutdownNow();
        disconnectFromService();
    }

    @VisibleForTesting
    public MAPAccountManager(Context context, ExecutorService executorService) {
        this(context, executorService, Executors.newSingleThreadScheduledExecutor());
    }

    public MAPAccountManager(Context context) {
        this(context, Executors.newSingleThreadExecutor(), Executors.newSingleThreadScheduledExecutor());
    }
}
