package com.amazon.rtvi.capture.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.deecomms.util.LogsUtil$$ExternalSyntheticLambda0;
import com.amazon.rtvi.capture.client.exception.ConnectException;
import com.amazon.rtvi.capture.client.exception.DisconnectReason;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ConsumerServiceConnection implements ServiceConnection, AutoCloseable {
    private static final String TAG = "ConsumerServiceConnection";
    private final Context applicationContext;
    private volatile IBinder.DeathRecipient deathRecipient;
    private volatile IBinder serviceBinder;
    private final ExecutorService workerExecutor;
    private final AtomicReference<Consumer<DisconnectReason>> disconnectCallback = new AtomicReference<>();
    private final CompletableFuture<ICaptureSourceConsumer> connectionFuture = new CompletableFuture<>();
    private final AtomicBoolean closed = new AtomicBoolean(false);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.rtvi.capture.client.ConsumerServiceConnection$1, reason: invalid class name */
    public class AnonymousClass1 implements IBinder.DeathRecipient {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$binderDied$0() {
            Log.w(ConsumerServiceConnection.TAG, "Service binder died, notifying disconnect");
            ConsumerServiceConnection.this.handleDisconnected(DisconnectReason.SERVICE_DEATH);
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            ConsumerServiceConnection.this.workerExecutor.execute(new CaptureSourceClient$$ExternalSyntheticLambda2(this, 2));
        }
    }

    public ConsumerServiceConnection(@NonNull Context context, @NonNull ExecutorService executorService) {
        Objects.requireNonNull(context, "Application context cannot be null");
        this.applicationContext = context;
        Objects.requireNonNull(executorService, "Worker executor cannot be null");
        this.workerExecutor = executorService;
        this.deathRecipient = new AnonymousClass1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDisconnected(DisconnectReason disconnectReason) {
        if (this.closed.compareAndSet(false, true)) {
            Objects.toString(disconnectReason);
            if (!this.connectionFuture.isDone()) {
                this.connectionFuture.completeExceptionally(new ConnectException("Service disconnected: " + disconnectReason));
            }
            performCleanup();
            Consumer<DisconnectReason> andSet = this.disconnectCallback.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.accept(disconnectReason);
                } catch (Exception e) {
                    Log.e(TAG, "Error in disconnect callback", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleServiceConnected, reason: merged with bridge method [inline-methods] */
    public void lambda$onServiceConnected$0(ComponentName componentName, IBinder iBinder) {
        if (this.closed.get()) {
            Log.w(TAG, "Service connected after close, ignoring");
            return;
        }
        if (iBinder == null) {
            Log.w(TAG, "Service connected with null binder");
            handleDisconnected(DisconnectReason.NULL_BINDING);
            return;
        }
        Log.i(TAG, "Service connected: " + componentName);
        this.serviceBinder = iBinder;
        try {
            iBinder.linkToDeath(this.deathRecipient, 0);
            Objects.toString(componentName);
            this.connectionFuture.complete(ICaptureSourceConsumer.Stub.asInterface(iBinder));
        } catch (RemoteException e) {
            Log.e(TAG, "Failed to link to death recipient", e);
            handleDisconnected(DisconnectReason.SERVICE_DEATH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindingDied$2(ComponentName componentName) {
        Log.w(TAG, "Service binding died: " + componentName);
        handleDisconnected(DisconnectReason.BINDING_DIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNullBinding$3(ComponentName componentName) {
        Log.w(TAG, "Service returned null binding: " + componentName);
        handleDisconnected(DisconnectReason.NULL_BINDING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceDisconnected$1(ComponentName componentName) {
        Log.w(TAG, "Service disconnected: " + componentName);
        handleDisconnected(DisconnectReason.SERVICE_DEATH);
    }

    private void performCleanup() {
        if (this.serviceBinder != null && this.deathRecipient != null) {
            try {
                this.serviceBinder.unlinkToDeath(this.deathRecipient, 0);
            } catch (Exception e) {
                Log.w(TAG, "Error unlinking death recipient", e);
            }
        }
        Context context = this.applicationContext;
        if (context != null) {
            try {
                context.unbindService(this);
            } catch (Exception e2) {
                Log.w(TAG, "Error unbinding service", e2);
            }
        }
        this.serviceBinder = null;
        this.deathRecipient = null;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed.compareAndSet(false, true)) {
            if (!this.connectionFuture.isDone()) {
                this.connectionFuture.completeExceptionally(new ConnectException("Connection closed before completion"));
            }
            performCleanup();
        }
    }

    @NonNull
    public CompletableFuture<ICaptureSourceConsumer> connect(@NonNull Intent intent) {
        if (this.closed.get()) {
            Single$$ExternalSyntheticBUOutline0.m$2("Connection is closed");
            return null;
        }
        if (this.connectionFuture.isDone()) {
            Single$$ExternalSyntheticBUOutline0.m$2("Already connected or connection attempted");
            return null;
        }
        Objects.requireNonNull(intent, "Intent cannot be null");
        try {
        } catch (Exception e) {
            this.connectionFuture.completeExceptionally(e);
        }
        if (this.applicationContext.bindService(intent, 65, this.workerExecutor, this)) {
            Objects.toString(intent.getComponent());
            return this.connectionFuture;
        }
        this.connectionFuture.completeExceptionally(new ConnectException("Failed to bind to service: " + intent.getComponent()));
        return this.connectionFuture;
    }

    public boolean isConnected() {
        return (!this.connectionFuture.isDone() || this.connectionFuture.isCompletedExceptionally() || this.closed.get()) ? false : true;
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        this.workerExecutor.execute(new ConsumerServiceConnection$$ExternalSyntheticLambda0(this, componentName, 2));
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        this.workerExecutor.execute(new ConsumerServiceConnection$$ExternalSyntheticLambda0(this, componentName, 0));
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.workerExecutor.execute(new LogsUtil$$ExternalSyntheticLambda0(this, 29, componentName, iBinder));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.workerExecutor.execute(new ConsumerServiceConnection$$ExternalSyntheticLambda0(this, componentName, 1));
    }

    @NonNull
    public ConsumerServiceConnection setDisconnectListener(@NonNull Consumer<DisconnectReason> consumer) {
        if (consumer != null) {
            this.disconnectCallback.set(consumer);
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Callback cannot be null");
        return null;
    }
}
