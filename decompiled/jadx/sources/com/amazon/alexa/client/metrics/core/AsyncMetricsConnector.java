package com.amazon.alexa.client.metrics.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class AsyncMetricsConnector implements MetricsConnector, Handler.Callback {
    private static final int BEGIN_SESSION = 1;
    private static final int END_SESSION = 2;
    private static final int PAUSE_SESSION = 4;
    private static final int RECORD_EVENT = 5;
    private static final int RESUME_SESSION = 3;
    private static final String TAG = "AsyncMetricsConnector";
    protected final Lazy<MetricsClientConfiguration> clientConfiguration;
    protected String configuredServiceName;
    protected final Handler handler;
    private final HandlerThread handlerThread;
    private volatile boolean isInitialized;

    public AsyncMetricsConnector(@NonNull Lazy<MetricsClientConfiguration> lazy) {
        this.clientConfiguration = lazy;
        HandlerThread handlerThread = new HandlerThread(getClass().getName());
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper(), this);
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public final void beginSession() {
        this.handler.sendEmptyMessage(1);
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public final void endSession() {
        this.handler.sendEmptyMessage(2);
    }

    @VisibleForTesting
    public final HandlerThread getHandlerThread() {
        return this.handlerThread;
    }

    public String getServiceName(@NonNull DefaultAlexaMetricsEvent defaultAlexaMetricsEvent) {
        String serviceName = defaultAlexaMetricsEvent.getServiceName();
        if (serviceName != null) {
            return serviceName;
        }
        if (this.configuredServiceName == null) {
            this.configuredServiceName = this.clientConfiguration.get().getMetricsServiceName();
        }
        return this.configuredServiceName;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        initialize();
        int i = message.what;
        if (i == 1) {
            onBeginSession();
            return true;
        }
        if (i == 2) {
            onEndSession();
            return true;
        }
        if (i == 3) {
            onResumeSession();
            return true;
        }
        if (i == 4) {
            onPauseSession();
            return true;
        }
        if (i != 5) {
            return false;
        }
        onRecordEvent((DefaultAlexaMetricsEvent) message.obj);
        return true;
    }

    public void initialize() {
        if (this.isInitialized) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.isInitialized) {
                    this.isInitialized = true;
                    onInitialize();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public final void pauseSession() {
        this.handler.sendEmptyMessage(4);
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public final void recordEvent(AlexaMetricsEvent alexaMetricsEvent) {
        this.handler.sendMessage(this.handler.obtainMessage(5, alexaMetricsEvent));
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public final void resumeSession() {
        this.handler.sendEmptyMessage(3);
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsConnector
    public final void shutdown() {
        this.handlerThread.quitSafely();
        onShutdown();
    }

    public void onBeginSession() {
    }

    public void onEndSession() {
    }

    public void onInitialize() {
    }

    public void onPauseSession() {
    }

    public void onResumeSession() {
    }

    public void onShutdown() {
    }

    public void onRecordEvent(DefaultAlexaMetricsEvent defaultAlexaMetricsEvent) {
    }
}
