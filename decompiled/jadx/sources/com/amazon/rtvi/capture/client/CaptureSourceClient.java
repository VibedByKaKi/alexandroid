package com.amazon.rtvi.capture.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.apl.android.RootContext$$ExternalSyntheticLambda6;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.rtvi.capture.client.exception.DisconnectException;
import com.amazon.rtvi.capture.client.exception.DisconnectReason;
import com.amazon.rtvi.capture.client.retry.AsyncRetryExecutor;
import com.amazon.rtvi.capture.client.retry.RetryStrategy;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class CaptureSourceClient implements AutoCloseable {
    private static final long CLOSE_TIMEOUT_MS = 2000;
    private static final String TAG = "CaptureSourceClient";
    private final boolean autoReconnect;
    private volatile ICaptureSourceConsumer consumerService;
    private final Context context;
    private final RetryStrategy retryStrategy;
    private final ConsumerServiceConfiguration serviceConfig;
    private volatile ConsumerServiceConnection serviceConnection;
    private final long timeoutMs;
    private final ScheduledExecutorService workerScheduler;
    private final Object stateLock = new Object();
    private volatile ConnectionState connectionState = ConnectionState.DISCONNECTED;
    private volatile boolean clientClosed = false;
    private final CopyOnWriteArrayList<Listener> listeners = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<ProviderServiceRegistration> registrations = new CopyOnWriteArrayList<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConnectionState {
        DISCONNECTED,
        CONNECTING,
        CONNECTED,
        RECONNECTING
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onConnectionStateChanged(ConnectionState connectionState, Exception exc);
    }

    public CaptureSourceClient(@NonNull Context context, long j, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull ConsumerServiceConfiguration consumerServiceConfiguration, @NonNull RetryStrategy retryStrategy, boolean z) {
        this.context = context;
        this.timeoutMs = j;
        this.workerScheduler = scheduledExecutorService;
        this.serviceConfig = consumerServiceConfiguration;
        this.retryStrategy = retryStrategy;
        this.autoReconnect = z;
    }

    private void attemptAutoReconnect(Exception exc) {
        Log.i(TAG, "Attempting auto-reconnect");
        setConnectionState(ConnectionState.RECONNECTING, exc);
        connectWithRetry(this.timeoutMs).thenAccept((Consumer<? super ICaptureSourceConsumer>) new CaptureSourceClient$$ExternalSyntheticLambda1(this, 1)).exceptionally((Function<Throwable, ? extends Void>) new CaptureSourceClient$$ExternalSyntheticLambda4(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* renamed from: attemptSingleConnectionAsync, reason: merged with bridge method [inline-methods] */
    public CompletableFuture<ICaptureSourceConsumer> lambda$connectWithRetry$4(long j) {
        final ConsumerServiceConnection createServiceConnection = createServiceConnection();
        Intent intent = new Intent();
        if (this.serviceConfig.getAction() != null) {
            intent.setAction(this.serviceConfig.getAction());
            intent.setPackage(this.serviceConfig.getPackageName());
        } else {
            intent.setComponent(new ComponentName(this.serviceConfig.getPackageName(), this.serviceConfig.getClassName()));
        }
        CompletableFuture<ICaptureSourceConsumer> connect = createServiceConnection.connect(intent);
        this.workerScheduler.schedule(new RootContext$$ExternalSyntheticLambda6(connect, j, 8), j, TimeUnit.MILLISECONDS);
        final int i = 0;
        CompletableFuture<U> thenApply = connect.thenApply(new Function(this) { // from class: com.amazon.rtvi.capture.client.CaptureSourceClient$$ExternalSyntheticLambda6
            public final /* synthetic */ CaptureSourceClient f$0;

            {
                this.f$0 = this;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ICaptureSourceConsumer lambda$attemptSingleConnectionAsync$6;
                ICaptureSourceConsumer lambda$attemptSingleConnectionAsync$7;
                switch (i) {
                    case 0:
                        lambda$attemptSingleConnectionAsync$6 = this.f$0.lambda$attemptSingleConnectionAsync$6(createServiceConnection, (ICaptureSourceConsumer) obj);
                        return lambda$attemptSingleConnectionAsync$6;
                    default:
                        lambda$attemptSingleConnectionAsync$7 = this.f$0.lambda$attemptSingleConnectionAsync$7(createServiceConnection, (Throwable) obj);
                        return lambda$attemptSingleConnectionAsync$7;
                }
            }
        });
        final int i2 = 1;
        return thenApply.exceptionally((Function<Throwable, ? extends U>) new Function(this) { // from class: com.amazon.rtvi.capture.client.CaptureSourceClient$$ExternalSyntheticLambda6
            public final /* synthetic */ CaptureSourceClient f$0;

            {
                this.f$0 = this;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ICaptureSourceConsumer lambda$attemptSingleConnectionAsync$6;
                ICaptureSourceConsumer lambda$attemptSingleConnectionAsync$7;
                switch (i2) {
                    case 0:
                        lambda$attemptSingleConnectionAsync$6 = this.f$0.lambda$attemptSingleConnectionAsync$6(createServiceConnection, (ICaptureSourceConsumer) obj);
                        return lambda$attemptSingleConnectionAsync$6;
                    default:
                        lambda$attemptSingleConnectionAsync$7 = this.f$0.lambda$attemptSingleConnectionAsync$7(createServiceConnection, (Throwable) obj);
                        return lambda$attemptSingleConnectionAsync$7;
                }
            }
        });
    }

    private void clearServiceAndConnection() {
        ConsumerServiceConnection consumerServiceConnection;
        synchronized (this.stateLock) {
            consumerServiceConnection = this.serviceConnection;
            this.serviceConnection = null;
            this.consumerService = null;
        }
        if (consumerServiceConnection != null) {
            try {
                CredentialConfig$$ExternalSyntheticOutline0.m(consumerServiceConnection);
            } catch (Exception e) {
                Log.w(TAG, "Error closing service connection", e);
            }
        }
    }

    @NonNull
    private Future<Void> connect(long j) {
        synchronized (this.stateLock) {
            if (this.clientClosed) {
                throw new IllegalStateException("Client has been closed");
            }
            if (this.connectionState != ConnectionState.DISCONNECTED) {
                throw new IllegalStateException("Already connected or connecting, current state: " + this.connectionState);
            }
            this.connectionState = ConnectionState.CONNECTING;
        }
        this.workerScheduler.execute(new CaptureSourceClient$$ExternalSyntheticLambda2(this, 1));
        return connectWithRetry(j).thenApply((Function<? super ICaptureSourceConsumer, ? extends U>) new CaptureSourceClient$$ExternalSyntheticLambda4(this, 2)).exceptionally((Function<Throwable, ? extends U>) new CaptureSourceClient$$ExternalSyntheticLambda4(this, 1));
    }

    @NonNull
    private CompletableFuture<ICaptureSourceConsumer> connectWithRetry(long j) {
        return new AsyncRetryExecutor(this.retryStrategy, this.workerScheduler).execute(new CaptureSourceClient$$ExternalSyntheticLambda0(this, j, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attemptAutoReconnect$8(ICaptureSourceConsumer iCaptureSourceConsumer) {
        synchronized (this.stateLock) {
            this.consumerService = iCaptureSourceConsumer;
        }
        setConnectionState(ConnectionState.CONNECTED, null);
        registerAvailableProviders();
        Log.i(TAG, "Auto-reconnect successful");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$attemptAutoReconnect$9(Throwable th) {
        Log.w(TAG, "Auto-reconnect failed", th);
        clearServiceAndConnection();
        Throwable unwrapException = unwrapException(th);
        setConnectionState(ConnectionState.DISCONNECTED, unwrapException instanceof Exception ? (Exception) unwrapException : new RuntimeException(unwrapException));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$attemptSingleConnectionAsync$5(CompletableFuture completableFuture, long j) {
        if (completableFuture.isDone()) {
            return;
        }
        completableFuture.completeExceptionally(new TimeoutException(AppLaunchChecker$$ExternalSyntheticOutline0.m("Connection timeout after ", j, "ms")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ICaptureSourceConsumer lambda$attemptSingleConnectionAsync$6(ConsumerServiceConnection consumerServiceConnection, ICaptureSourceConsumer iCaptureSourceConsumer) {
        synchronized (this.stateLock) {
            this.serviceConnection = consumerServiceConnection;
            this.serviceConnection.setDisconnectListener(new CaptureSourceClient$$ExternalSyntheticLambda1(this, 0));
        }
        return iCaptureSourceConsumer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ICaptureSourceConsumer lambda$attemptSingleConnectionAsync$7(ConsumerServiceConnection consumerServiceConnection, Throwable th) {
        try {
            consumerServiceConnection.close();
        } catch (Exception e) {
            Log.w(TAG, "Error closing failed connection attempt", e);
        }
        Throwable unwrapException = unwrapException(th);
        if (unwrapException instanceof RuntimeException) {
            throw ((RuntimeException) unwrapException);
        }
        throw new RuntimeException(unwrapException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$0() {
        setConnectionState(ConnectionState.DISCONNECTED, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connect$1() {
        notifyStateChanged(ConnectionState.CONNECTING, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$connect$2(ICaptureSourceConsumer iCaptureSourceConsumer) {
        synchronized (this.stateLock) {
            this.consumerService = iCaptureSourceConsumer;
        }
        setConnectionState(ConnectionState.CONNECTED, null);
        registerAvailableProviders();
        Log.i(TAG, "Connected to service: " + this.serviceConfig.getClassName());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$connect$3(Throwable th) {
        clearServiceAndConnection();
        Throwable unwrapException = unwrapException(th);
        setConnectionState(ConnectionState.DISCONNECTED, unwrapException instanceof Exception ? (Exception) unwrapException : new RuntimeException(unwrapException));
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new RuntimeException(th);
    }

    @NonNull
    public static CaptureSourceClientBuilder newBuilder(@NonNull Context context) {
        return new CaptureSourceClientBuilder(context);
    }

    private void notifyStateChanged(ConnectionState connectionState, Exception exc) {
        this.listeners.size();
        Objects.toString(connectionState);
        Iterator<Listener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onConnectionStateChanged(connectionState, exc);
            } catch (Exception e) {
                Log.e(TAG, "Error notifying listener of state change", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDisconnected(DisconnectReason disconnectReason) {
        Log.w(TAG, "Handling disconnection (reason=" + disconnectReason + MarkdownConstants.RIGHT_PARENTHESIS);
        clearServiceAndConnection();
        if (this.connectionState == ConnectionState.CONNECTED && this.autoReconnect && disconnectReason != DisconnectReason.NORMAL_UNBIND) {
            attemptAutoReconnect(new DisconnectException(disconnectReason, "Service disconnected"));
        } else {
            setConnectionState(ConnectionState.DISCONNECTED, new DisconnectException(disconnectReason, "Service disconnected"));
        }
    }

    private void registerAvailableProviders() {
        if (this.registrations.isEmpty()) {
            return;
        }
        Log.i(TAG, "Registering " + this.registrations.size() + " providers");
        Iterator<ProviderServiceRegistration> it2 = this.registrations.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            try {
                it2.next().attachConsumer(this.consumerService);
                i++;
            } catch (Exception e) {
                i2++;
                Log.w(TAG, "Failed to register provider", e);
            }
        }
        Log.i(TAG, ErrorUtils$$ExternalSyntheticOutline0.m(i, i2, "Provider registration completed: ", " successful, ", " failed"));
    }

    private void setConnectionState(ConnectionState connectionState, Exception exc) {
        ConnectionState connectionState2;
        boolean z;
        synchronized (this.stateLock) {
            try {
                connectionState2 = this.connectionState;
                z = connectionState2 != connectionState;
                if (z) {
                    this.connectionState = connectionState;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            Objects.toString(connectionState);
            return;
        }
        Objects.toString(connectionState2);
        Objects.toString(connectionState);
        notifyStateChanged(connectionState, exc);
    }

    private void shutdownAllRegistrations() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this.stateLock) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.registrations.clone();
            this.registrations.clear();
        }
        copyOnWriteArrayList.size();
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((ProviderServiceRegistration) it2.next()).shutdown();
            } catch (Exception e) {
                Log.w(TAG, "Error shutting down registration", e);
            }
        }
    }

    @NonNull
    private Throwable unwrapException(@NonNull Throwable th) {
        if ((th instanceof CompletionException) && th.getCause() != null) {
            th = th.getCause();
        }
        return (!(th instanceof ExecutionException) || th.getCause() == null) ? th : th.getCause();
    }

    @NonNull
    public AutoCloseable addListener(@NonNull Listener listener) {
        if (listener == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Listener cannot be null");
            return null;
        }
        if (!this.clientClosed) {
            return new ProviderServiceSubscription(listener, this.listeners);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Client has been closed");
        return null;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.stateLock) {
            try {
                if (this.clientClosed) {
                    return;
                }
                boolean z = true;
                this.clientClosed = true;
                if (this.connectionState != ConnectionState.DISCONNECTED) {
                    z = false;
                }
                shutdownAllRegistrations();
                clearServiceAndConnection();
                Log.i(TAG, "Closing client");
                if (!z) {
                    try {
                        this.workerScheduler.submit(new CaptureSourceClient$$ExternalSyntheticLambda2(this, 0)).get(2000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                        Log.w(TAG, "Timeout or error notifying listeners during close", e);
                        if (e instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.listeners.clear();
                ScheduledExecutorService scheduledExecutorService = this.workerScheduler;
                if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                    return;
                }
                this.workerScheduler.shutdownNow();
                Log.i(TAG, "Worker scheduler shutdown completed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ConsumerServiceConnection createServiceConnection() {
        return new ConsumerServiceConnection(this.context, this.workerScheduler);
    }

    @NonNull
    public ConnectionState getConnectionState() {
        return this.connectionState;
    }

    public CopyOnWriteArrayList<ProviderServiceRegistration> getProviderRegistrations() {
        return this.registrations;
    }

    @NonNull
    public RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    public long getTimeoutMs() {
        return this.timeoutMs;
    }

    public boolean isAutoReconnectEnabled() {
        return this.autoReconnect;
    }

    @NonNull
    public AutoCloseable registerProvider(@NonNull ICaptureSourceProvider iCaptureSourceProvider) throws RemoteException {
        ICaptureSourceConsumer iCaptureSourceConsumer;
        ProviderServiceRegistration providerServiceRegistration;
        synchronized (this.stateLock) {
            if (this.clientClosed) {
                throw new IllegalStateException("Client has been closed");
            }
            if (this.connectionState == ConnectionState.DISCONNECTED) {
                throw new IllegalStateException("Cannot register provider while disconnected. Call connect() first.");
            }
            iCaptureSourceConsumer = this.consumerService;
            providerServiceRegistration = new ProviderServiceRegistration(iCaptureSourceProvider, this.registrations);
        }
        if (iCaptureSourceConsumer == null) {
            Log.i(TAG, "Provider registration pending connection");
            return providerServiceRegistration;
        }
        providerServiceRegistration.attachConsumer(iCaptureSourceConsumer);
        Log.i(TAG, "Provider registered");
        return providerServiceRegistration;
    }

    @NonNull
    public Future<Void> connect(long j, @NonNull TimeUnit timeUnit) {
        return connect(timeUnit.toMillis(j));
    }

    @NonNull
    public Future<Void> connect() {
        return connect(this.timeoutMs);
    }
}
