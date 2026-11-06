package com.amazon.alexa.api;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.api.AlexaMetricsName;
import com.amazon.alexa.api.ConnectionListenerLifecycles;
import com.amazon.alexa.api.Releasable;
import com.amazon.alexa.api.messages.MessageReceiversManager;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.utils.ApiThreadHelper;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.utils.security.ComponentEnabler;
import com.amazon.alexa.utils.security.SignatureVerifier;
import com.amazon.alexa.utils.validation.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class ManagedServiceConnection<T extends Releasable> {
    private static final String BINDING_FAILED_MESSAGE = "Binding failed. Check logs for details";
    static final int BIND_ALLOW_BACKGROUND_ACTIVITY_STARTS = 1048576;
    private static final String COMPONENT_DISABLED_MESSAGE = "Could not connect to service. Service is disabled.";
    private static final String CONNECTION_LISTENER_THREAD_NAME_SUFFIX = "-connlisteners";
    private static final String CONNECTION_RELEASED_MESSAGE = "Connection object was released";
    private static final String EXECUTOR_NAME_PREFIX = "msc-";
    private static final String INVALID_SIGNATURE_MESSAGE = "Invalid signature";
    static final String START_ACTIVITIES_FROM_BACKGROUND_PERMISSION = "android.permission.START_ACTIVITIES_FROM_BACKGROUND";
    private static final String TAG = "ManagedServiceConnection";
    private final AtomicInteger bindingGeneration;
    private volatile boolean bindingToService;
    private final ExtendedClient client;
    private int connectLatencyCounter;
    private final Handler connectionListenerHandler;
    private final ConnectionListenerLifecycles connectionListeners;
    private final AtomicLong connectionStartTime;
    private Context context;
    private final ExecutorService executor;
    private volatile boolean expectedConnected;
    private final Handler handler;
    private final AtomicBoolean isConnected;
    private volatile boolean isReleased;
    protected final ReentrantLock lock;
    private final MessageReceiversManager messageReceiversManager;
    private final MetricBroadcastSender metricBroadcastSender;
    private final PackageManager packageManager;
    private Random random;
    private ServiceConnection serviceConnectionListener;
    protected final AtomicReference<T> serviceInterface;
    private final SignatureVerifier signatureVerifier;
    private volatile boolean successfullyCalledBindService;
    private final TimeProvider timeProvider;
    private final ManagedServiceConnection<T>.UpdateConnectedStateRunnable updateConnectedStateRunnable;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConnectionListener extends ConnectionListenerLifecycles.ConnectionListener {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ServiceConnectionListener implements ServiceConnection {
        private final Handler handler;
        private final WeakReference<ManagedServiceConnection> serviceConnectionReference;

        public ServiceConnectionListener(ManagedServiceConnection managedServiceConnection, Handler handler) {
            this.serviceConnectionReference = new WeakReference<>(managedServiceConnection);
            this.handler = handler;
        }

        private void handleConnectionCallback(final Runnable runnable) {
            final ManagedServiceConnection managedServiceConnection = this.serviceConnectionReference.get();
            if (managedServiceConnection != null) {
                if (managedServiceConnection.isReleased) {
                    managedServiceConnection.sendConnectingFailed(AlexaConnectingFailedReason.CONNECTION_OBJECT_RELEASED, ManagedServiceConnection.CONNECTION_RELEASED_MESSAGE);
                } else {
                    final int i = managedServiceConnection.bindingGeneration.get();
                    this.handler.post(new Runnable() { // from class: com.amazon.alexa.api.ManagedServiceConnection.ServiceConnectionListener.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (i == managedServiceConnection.bindingGeneration.get()) {
                                runnable.run();
                                return;
                            }
                            Log.w(ManagedServiceConnection.TAG, "Dropping service connection callback from a previous binding for client: " + managedServiceConnection.getClient().getId());
                        }
                    });
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(final ComponentName componentName) {
            final ManagedServiceConnection managedServiceConnection = this.serviceConnectionReference.get();
            if (managedServiceConnection == null) {
                return;
            }
            String unused = ManagedServiceConnection.TAG;
            java.util.Locale locale = java.util.Locale.US;
            String flattenToShortString = componentName.flattenToShortString();
            String id = managedServiceConnection.getClient().getId();
            ErrorUtils$$ExternalSyntheticOutline0.m("ServiceConnectionListener.onBindingDied: ", flattenToShortString, " for client: ", id, " with debug tag: ").append(managedServiceConnection.getClient().getDebugTag());
            handleConnectionCallback(new Runnable() { // from class: com.amazon.alexa.api.ManagedServiceConnection.ServiceConnectionListener.3
                @Override // java.lang.Runnable
                public void run() {
                    managedServiceConnection.onBindingDied(componentName);
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
            final ManagedServiceConnection managedServiceConnection = this.serviceConnectionReference.get();
            if (managedServiceConnection == null) {
                return;
            }
            String unused = ManagedServiceConnection.TAG;
            java.util.Locale locale = java.util.Locale.US;
            String flattenToShortString = componentName.flattenToShortString();
            String id = managedServiceConnection.getClient().getId();
            ErrorUtils$$ExternalSyntheticOutline0.m("ServiceConnectionListener.onServiceConnected: ", flattenToShortString, " for client: ", id, " with debug tag: ").append(managedServiceConnection.getClient().getDebugTag());
            handleConnectionCallback(new Runnable() { // from class: com.amazon.alexa.api.ManagedServiceConnection.ServiceConnectionListener.1
                @Override // java.lang.Runnable
                public void run() {
                    managedServiceConnection.onConnectedToService(componentName, iBinder);
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(final ComponentName componentName) {
            final ManagedServiceConnection managedServiceConnection = this.serviceConnectionReference.get();
            if (managedServiceConnection == null) {
                return;
            }
            String unused = ManagedServiceConnection.TAG;
            java.util.Locale locale = java.util.Locale.US;
            String flattenToShortString = componentName.flattenToShortString();
            String id = managedServiceConnection.getClient().getId();
            ErrorUtils$$ExternalSyntheticOutline0.m("ServiceConnectionListener.onServiceDisconnected: ", flattenToShortString, " for client: ", id, " with debug tag: ").append(managedServiceConnection.getClient().getDebugTag());
            handleConnectionCallback(new Runnable() { // from class: com.amazon.alexa.api.ManagedServiceConnection.ServiceConnectionListener.2
                @Override // java.lang.Runnable
                public void run() {
                    managedServiceConnection.onUnexpectedlyDisconnectedFromService(componentName);
                }
            });
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class UpdateConnectedStateRunnable implements Runnable {
        private UpdateConnectedStateRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ManagedServiceConnection.this.isConnected.set(ManagedServiceConnection.this.internalIsConnected());
        }
    }

    public ManagedServiceConnection(@NonNull Context context, @Nullable String str) {
        this.connectLatencyCounter = 0;
        this.random = new Random();
        this.bindingGeneration = new AtomicInteger();
        Preconditions.notNull(context, "The provided Context was null.");
        String packageName = context.getPackageName();
        this.packageManager = context.getPackageManager();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.context = context;
        this.timeProvider = new TimeProvider();
        this.connectionStartTime = new AtomicLong();
        ExtendedClient extendedClient = new ExtendedClient(packageName, str);
        this.client = extendedClient;
        this.executor = Executors.newSingleThreadExecutor();
        Handler createHandler = createHandler(extendedClient.getId());
        this.handler = createHandler;
        Handler createHandler2 = createHandler(extendedClient.getId() + CONNECTION_LISTENER_THREAD_NAME_SUFFIX);
        this.connectionListenerHandler = createHandler2;
        this.connectionListeners = new ConnectionListenerLifecycles(this, reentrantLock, createHandler2);
        this.serviceConnectionListener = new ServiceConnectionListener(this, createHandler);
        this.signatureVerifier = new SignatureVerifier(context);
        this.messageReceiversManager = createMessageReceiverManager();
        this.metricBroadcastSender = new MetricBroadcastSender(this);
        this.serviceInterface = new AtomicReference<>();
        this.isConnected = new AtomicBoolean(false);
        this.updateConnectedStateRunnable = new UpdateConnectedStateRunnable();
    }

    private void bindingServiceRequestFailed() {
        Log.e(TAG, "Failed to connect, disconnecting");
        sendConnectingFailed(AlexaConnectingFailedReason.UNKNOWN, BINDING_FAILED_MESSAGE);
        this.metricBroadcastSender.sendEvent(AlexaMetricsName.SdkUsage.BIND_SERVICE_FAILED);
        doDisconnect(true);
    }

    private void bindingServiceRequestSucceeded() {
        this.successfullyCalledBindService = true;
        this.bindingToService = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectInternal() {
        this.lock.lock();
        try {
            if (!this.isReleased) {
                if (!isBoundToService()) {
                    if (isConnecting()) {
                    }
                }
                doDisconnect(false);
            }
            unbindService(false);
            this.lock.unlock();
        } catch (Throwable th) {
            unbindService(false);
            this.lock.unlock();
            throw th;
        }
    }

    private void doDisconnect(boolean z) {
        String str = TAG;
        this.lock.lock();
        try {
            this.connectionStartTime.set(0L);
            java.util.Locale locale = java.util.Locale.US;
            Log.i(str, "onDisconnected: client: " + getClient().getId() + " with debug tag: " + getClient().getDebugTag());
            this.connectionListeners.notifyConnectionDisconnected();
        } finally {
            onDisconnectedFromService();
            unbindService(z);
            releaseServiceInterface();
            this.lock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void doStartService() {
        this.lock.lock();
        try {
            if (this.isReleased) {
                Log.w(TAG, "Not starting service - connection object is released");
            } else {
                boolean preferBackgroundService = preferBackgroundService();
                ComponentName serviceComponentName = getServiceComponentName();
                Intent connectionIntent = getConnectionIntent(serviceComponentName, !preferBackgroundService);
                Context context = this.context;
                if (preferBackgroundService) {
                    try {
                        context.startService(connectionIntent);
                    } catch (IllegalStateException unused) {
                        if (shouldLaunchAsForegroundServiceIfBackgroundLaunchFails()) {
                            Log.e(TAG, "Background service start failed. Attempting to start a foreground service");
                            this.context.startForegroundService(getConnectionIntent(serviceComponentName, true));
                        }
                    } catch (SecurityException e) {
                        Log.e(TAG, "Unable to start service", e);
                        throw e;
                    }
                } else {
                    context.startForegroundService(connectionIntent);
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    private int getFlags() {
        return hasAllowBackgroundActivityStartsPermission() ? 1048577 : 1;
    }

    private boolean hasAllowBackgroundActivityStartsPermission() {
        return this.context.checkPermission(START_ACTIVITIES_FROM_BACKGROUND_PERMISSION, Process.myPid(), Process.myUid()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBindingDied(ComponentName componentName) {
        this.lock.lock();
        try {
            if (isServiceComponentNameResolved() && getServiceComponentName().equals(componentName)) {
                releaseServiceInterface();
                disconnect();
                this.bindingToService = false;
            }
        } finally {
            this.connectionStartTime.set(0L);
            this.lock.unlock();
        }
    }

    private void onPackageDisabledFailure() {
        sendConnectingFailed(AlexaConnectingFailedReason.ALEXA_SERVICES_DISABLED, COMPONENT_DISABLED_MESSAGE);
        throw new SecurityException(COMPONENT_DISABLED_MESSAGE);
    }

    private void onSignatureConnectionFailed() {
        sendConnectingFailed(AlexaConnectingFailedReason.UNAUTHORIZED, INVALID_SIGNATURE_MESSAGE);
        throw new SecurityException("Signature could not be verified. Hence, cannot connect to service.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUnexpectedlyDisconnectedFromService(ComponentName componentName) {
        this.lock.lock();
        try {
            if (isServiceComponentNameResolved() && getServiceComponentName().equals(componentName)) {
                if (!isConnected()) {
                    sendConnectingFailed(AlexaConnectingFailedReason.UNKNOWN, "Unexpectedly disconnected while connecting.");
                }
                doDisconnect();
                this.bindingToService = false;
            }
            this.connectionStartTime.set(0L);
            this.lock.unlock();
        } catch (Throwable th) {
            this.connectionStartTime.set(0L);
            this.lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseServiceInterface() {
        T t = this.serviceInterface.get();
        if (t != null) {
            t.release();
            this.serviceInterface.set(null);
        }
        updateConnectedState();
    }

    private void terminateHandlerThread(Handler handler) {
        Looper looper = handler.getLooper();
        if (looper != null) {
            looper.quitSafely();
        }
    }

    private void unbindService(boolean z) {
        if (!this.isReleased || this.successfullyCalledBindService) {
            if (this.successfullyCalledBindService || z) {
                try {
                    java.util.Locale locale = java.util.Locale.US;
                    String flattenToShortString = getServiceComponentName().flattenToShortString();
                    String id = getClient().getId();
                    String debugTag = getClient().getDebugTag();
                    StringBuilder sb = new StringBuilder("unbindService: ");
                    sb.append(flattenToShortString);
                    sb.append(" for client: ");
                    sb.append(id);
                    sb.append(" with debug tag: ");
                    sb.append(debugTag);
                    this.bindingGeneration.incrementAndGet();
                    this.context.unbindService(this.serviceConnectionListener);
                    this.successfullyCalledBindService = false;
                } catch (Exception e) {
                    String str = TAG;
                    Log.e(str, e.getMessage());
                    Log.e(str, "UnbindService failed. boundToService? " + isBoundToService() + ", force? " + z + ", bindingToService? " + this.bindingToService + ", isRelease? " + this.isReleased);
                    if (!z) {
                        this.metricBroadcastSender.sendEvent(AlexaMetricsName.SdkUsage.UNBIND_SERVICE_FAILED);
                    }
                }
                this.bindingToService = false;
            }
        }
    }

    public void bindService(Intent intent) {
        java.util.Locale locale = java.util.Locale.US;
        String flattenToShortString = getServiceComponentName().flattenToShortString();
        String id = getClient().getId();
        ErrorUtils$$ExternalSyntheticOutline0.m("bindService: ", flattenToShortString, " for client: ", id, " with debug tag: ").append(getClient().getDebugTag());
        int flags = getFlags();
        this.bindingGeneration.incrementAndGet();
        if (this.context.bindService(intent, flags, this.executor, this.serviceConnectionListener)) {
            bindingServiceRequestSucceeded();
        } else {
            bindingServiceRequestFailed();
        }
    }

    public boolean checkIfServiceIsEnabled(ComponentName componentName) {
        return ComponentEnabler.checkIfServiceIsEnabled(this.packageManager, componentName);
    }

    public void connect() {
        Log.i(TAG, getClient().getId() + " called connect");
        executeOnInternalConnectionThread(new Runnable() { // from class: com.amazon.alexa.api.ManagedServiceConnection.1
            @Override // java.lang.Runnable
            public void run() {
                ManagedServiceConnection.this.lock.lock();
                try {
                    ManagedServiceConnection.this.connectionListeners.reset();
                    boolean z = ManagedServiceConnection.this.isReleased;
                    ManagedServiceConnection managedServiceConnection = ManagedServiceConnection.this;
                    if (z) {
                        managedServiceConnection.sendConnectingFailed(AlexaConnectingFailedReason.CONNECTION_OBJECT_RELEASED, ManagedServiceConnection.CONNECTION_RELEASED_MESSAGE);
                    } else {
                        managedServiceConnection.expectedConnected = true;
                        ManagedServiceConnection.this.updateConnectedState();
                        boolean isServiceComponentNameResolved = ManagedServiceConnection.this.isServiceComponentNameResolved();
                        ManagedServiceConnection managedServiceConnection2 = ManagedServiceConnection.this;
                        if (isServiceComponentNameResolved) {
                            managedServiceConnection2.doConnect();
                        } else {
                            managedServiceConnection2.resolveServiceComponentName();
                        }
                    }
                } finally {
                    ManagedServiceConnection.this.lock.unlock();
                }
            }
        });
    }

    public Handler createHandler(String str) {
        HandlerThread handlerThread = new HandlerThread(a$$ExternalSyntheticOutline0.m(EXECUTOR_NAME_PREFIX, str));
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public MessageReceiversManager createMessageReceiverManager() {
        return new MessageReceiversManager(getSignatureVerifier());
    }

    public abstract T createServiceInterface(IBinder iBinder);

    public void deregisterListener(@NonNull ConnectionListener connectionListener) {
        Preconditions.notNull(connectionListener, "The provided ConnectionListener was null.");
        this.connectionListeners.removeListener(connectionListener);
    }

    public void disconnect() {
        executeOnInternalConnectionThread(new Runnable() { // from class: com.amazon.alexa.api.ManagedServiceConnection.2
            @Override // java.lang.Runnable
            public void run() {
                ManagedServiceConnection.this.lock.lock();
                try {
                    ManagedServiceConnection.this.expectedConnected = false;
                    ManagedServiceConnection.this.updateConnectedState();
                    ManagedServiceConnection.this.disconnectInternal();
                } finally {
                    ManagedServiceConnection.this.lock.unlock();
                }
            }
        });
    }

    public void doConnect() {
        this.lock.lock();
        try {
            try {
                if (isServiceComponentNameResolved() && !isConnecting() && !isConnected()) {
                    ComponentName serviceComponentName = getServiceComponentName();
                    if (!verifySignature(serviceComponentName.getPackageName())) {
                        onSignatureConnectionFailed();
                    } else if (checkIfServiceIsEnabled(serviceComponentName)) {
                        this.connectionStartTime.set(this.timeProvider.elapsedRealTime());
                        bindService(getConnectionIntent(serviceComponentName, !preferBackgroundService()));
                    } else {
                        onPackageDisabledFailure();
                    }
                }
            } catch (SecurityException unused) {
                Log.e(TAG, "Security exception thrown, disconnecting");
                sendConnectingFailed(AlexaConnectingFailedReason.UNAUTHORIZED, BINDING_FAILED_MESSAGE);
                doDisconnect();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void executeOnInternalConnectionThread(Runnable runnable) {
        ApiThreadHelper.runOnDefaultHandler(this.handler, runnable);
    }

    public T get() {
        return this.serviceInterface.get();
    }

    public ExtendedClient getClient() {
        return this.client;
    }

    public abstract Intent getConnectionIntent(ComponentName componentName, boolean z);

    public Context getContext() {
        return this.context;
    }

    public MessageReceiversManager getMessageReceiversManager() {
        return this.messageReceiversManager;
    }

    public MetricBroadcastSender getMetricBroadcastSender() {
        return this.metricBroadcastSender;
    }

    public abstract ComponentName getServiceComponentName();

    public SignatureVerifier getSignatureVerifier() {
        return this.signatureVerifier;
    }

    public boolean internalIsConnected() {
        return isBoundToService() && this.expectedConnected;
    }

    public boolean isBoundToService() {
        return get() != null;
    }

    public boolean isConnected() {
        return this.isConnected.get();
    }

    public boolean isConnecting() {
        return this.bindingToService;
    }

    public abstract boolean isServiceComponentNameResolved();

    public void onConnectedToService(ComponentName componentName, IBinder iBinder) {
        this.lock.lock();
        try {
            long andSet = this.connectionStartTime.getAndSet(0L);
            long elapsedRealTime = this.timeProvider.elapsedRealTime();
            if (shouldEmitClientConnectionMetric()) {
                this.metricBroadcastSender.sendEvent(AlexaMetricsName.SdkUsage.CLIENT_CONNECTION_LATENCY, elapsedRealTime - andSet);
            }
            if (this.isReleased) {
                Log.w(TAG, "onConnectedToService connection is already released");
            } else if (isServiceComponentNameResolved() && getServiceComponentName().equals(componentName)) {
                String str = TAG;
                releaseServiceInterface();
                this.serviceInterface.set(createServiceInterface(iBinder));
                this.bindingToService = false;
                updateConnectedState();
                onConnectedToService();
                if (isConnected()) {
                    java.util.Locale locale = java.util.Locale.US;
                    Log.i(str, "onConnected: client: " + getClient().getId() + " with debug tag: " + getClient().getDebugTag());
                    this.connectionListeners.notifyConnectionConnected();
                }
            }
            this.lock.unlock();
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public boolean preferBackgroundService() {
        return false;
    }

    public void registerListener(@NonNull Handler handler, @NonNull ConnectionListener connectionListener) {
        Preconditions.notNull(connectionListener, "The provided ConnectionListener was null.");
        final ConnectionListenerLifecycles.ConnectionListenerLifecycle addListener = this.connectionListeners.addListener(handler, connectionListener);
        executeOnInternalConnectionThread(new Runnable() { // from class: com.amazon.alexa.api.ManagedServiceConnection.4
            @Override // java.lang.Runnable
            public void run() {
                ManagedServiceConnection.this.lock.lock();
                try {
                    if (ManagedServiceConnection.this.isConnected()) {
                        addListener.onConnected();
                    }
                } finally {
                    ManagedServiceConnection.this.lock.unlock();
                }
            }
        });
    }

    public void release() {
        executeOnInternalConnectionThread(new Runnable() { // from class: com.amazon.alexa.api.ManagedServiceConnection.3
            @Override // java.lang.Runnable
            public void run() {
                ManagedServiceConnection.this.lock.lock();
                try {
                    ManagedServiceConnection.this.expectedConnected = false;
                    ManagedServiceConnection.this.updateConnectedState();
                    if (!ManagedServiceConnection.this.isReleased) {
                        ManagedServiceConnection.this.disconnectInternal();
                        ManagedServiceConnection.this.isReleased = true;
                        ManagedServiceConnection.this.releaseServiceInterface();
                        ManagedServiceConnection.this.messageReceiversManager.clear();
                        ManagedServiceConnection.this.context = null;
                        ManagedServiceConnection.this.serviceConnectionListener = null;
                    }
                } finally {
                    ManagedServiceConnection.this.lock.unlock();
                }
            }
        });
        terminateHandlerThread(this.handler);
        terminateHandlerThread(this.connectionListenerHandler);
        this.executor.shutdown();
    }

    public abstract void resolveServiceComponentName();

    public void sendConnectingFailed(AlexaConnectingFailedReason alexaConnectingFailedReason, String str) {
        String str2 = TAG;
        java.util.Locale locale = java.util.Locale.US;
        String id = getClient().getId();
        String debugTag = getClient().getDebugTag();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("onConnectingFailed due to ", str, ": (client: ", id, " with debug tag: ");
        m.append(debugTag);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        Log.i(str2, m.toString());
        this.connectionListeners.notifyConnectionFailed(alexaConnectingFailedReason, str);
    }

    public boolean shouldEmitClientConnectionMetric() {
        return this.random.nextInt(10) == 0;
    }

    public boolean shouldLaunchAsForegroundServiceIfBackgroundLaunchFails() {
        return true;
    }

    public void startService() {
        executeOnInternalConnectionThread(new Runnable() { // from class: com.amazon.alexa.api.ManagedServiceConnection.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ManagedServiceConnection.this.doStartService();
                } catch (SecurityException e) {
                    throw e;
                } catch (Exception e2) {
                    if (Build.VERSION.SDK_INT < 31 || !Fragment$$ExternalSyntheticBUOutline0.m7726m((Object) e2)) {
                        ManagedServiceConnection.this.sendConnectingFailed(AlexaConnectingFailedReason.UNKNOWN, e2.getMessage());
                        ManagedServiceConnection.this.metricBroadcastSender.sendEvent(AlexaMetricsName.SdkUsage.SERVICE_START_FAILED_REASON_PREFIX.appendToAlexaMetricsName(e2.getMessage()));
                    } else {
                        ManagedServiceConnection.this.sendConnectingFailed(AlexaConnectingFailedReason.CANNOT_START_FOREGROUND_SERVICE_APP_IN_BACKGROUND, e2.getMessage());
                        ManagedServiceConnection.this.metricBroadcastSender.sendEvent(AlexaMetricsName.SdkUsage.FOREGROUND_START_NOT_ALLOWED);
                    }
                }
            }
        });
    }

    public void updateConnectedState() {
        executeOnInternalConnectionThread(this.updateConnectedStateRunnable);
    }

    public boolean verifySignature(String str) {
        return this.signatureVerifier.verify(str);
    }

    public void onDisconnectedFromService() {
    }

    public void registerListener(@NonNull ConnectionListener connectionListener) {
        registerListener(this.connectionListenerHandler, connectionListener);
    }

    private void doDisconnect() {
        doDisconnect(false);
    }

    public void onConnectedToService() {
    }

    public ManagedServiceConnection(@NonNull Context context) {
        this(context, null);
    }

    public ManagedServiceConnection(@NonNull Context context, @NonNull SignatureVerifier signatureVerifier, @NonNull Handler handler, @NonNull Handler handler2) {
        this.connectLatencyCounter = 0;
        this.random = new Random();
        this.bindingGeneration = new AtomicInteger();
        Preconditions.notNull(context, "The provided Context was null.");
        Preconditions.notNull(signatureVerifier, "The provided SignatureVerifier was null.");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.context = context;
        this.packageManager = context.getPackageManager();
        this.executor = Executors.newSingleThreadExecutor();
        this.handler = handler;
        this.client = new ExtendedClient(context.getPackageName());
        this.connectionListenerHandler = handler2;
        this.connectionListeners = new ConnectionListenerLifecycles(this, reentrantLock, handler2);
        this.timeProvider = new TimeProvider();
        this.connectionStartTime = new AtomicLong();
        this.serviceConnectionListener = new ServiceConnectionListener(this, handler);
        this.signatureVerifier = signatureVerifier;
        this.messageReceiversManager = createMessageReceiverManager();
        this.metricBroadcastSender = new MetricBroadcastSender(this);
        this.serviceInterface = new AtomicReference<>();
        this.isConnected = new AtomicBoolean(false);
        this.updateConnectedStateRunnable = new UpdateConnectedStateRunnable();
    }
}
