package com.amazon.dee.app.services.metrics;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent;
import com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent;
import com.dee.app.metrics.AlexaMetricsEvent;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b&\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\r\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0016J\r\u0010#\u001a\u00020\fH ¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\fH ¢\u0006\u0002\b&J\r\u0010'\u001a\u00020\fH ¢\u0006\u0002\b(J\r\u0010)\u001a\u00020\fH\u0010¢\u0006\u0002\b*J\r\u0010+\u001a\u00020\fH\u0010¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H ¢\u0006\u0002\b.J\u0015\u0010/\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0010¢\u0006\u0002\b0J\u0015\u00101\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0010¢\u0006\u0002\b2J\u0015\u00103\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0010¢\u0006\u0002\b4R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/amazon/dee/app/services/metrics/AsyncMetricsConnector;", "Lcom/amazon/dee/app/services/metrics/MetricsConnector;", "Landroid/os/Handler$Callback;", "<init>", "()V", "handlerLock", "", "handler", "Landroid/os/Handler;", "isInitialized", "", "initialize", "", "getHandler", "getHandler$impl", "shutdown", "beginSession", "pauseSession", "resumeSession", "endSession", "recordEvent", "event", "Lcom/dee/app/metrics/AlexaMetricsEvent;", "recordOperationalEvent", "operationalEvent", "Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsOperationalEvent;", "recordUserInteractionEvent", "userInteractionEvent", "Lcom/amazon/alexa/mobilytics/event/userinteraction/MobilyticsUserInteractionEvent;", "userChanged", "userIdentity", "Lcom/amazon/alexa/identity/api/UserIdentity;", "handleMessage", "message", "Landroid/os/Message;", "onInitialize", "onInitialize$impl", "onBeginSession", "onBeginSession$impl", "onEndSession", "onEndSession$impl", "onResumeSession", "onResumeSession$impl", "onPauseSession", "onPauseSession$impl", "onRecordEvent", "onRecordEvent$impl", "onRecordOperationalEvent", "onRecordOperationalEvent$impl", "onRecordUserInteractionEvent", "onRecordUserInteractionEvent$impl", "onUserChangedOrNull", "onUserChangedOrNull$impl", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AsyncMetricsConnector implements MetricsConnector, Handler.Callback {
    public static final int BEGIN_SESSION = 1;
    public static final int END_SESSION = 2;
    public static final int PAUSE_SESSION = 4;
    public static final int RECORD_EVENT = 5;
    public static final int RECORD_MOBILYTICS_OPERATIONAL_EVENT = 6;
    public static final int RECORD_MOBILYTICS_USER_INTERACTION_EVENT = 7;
    public static final int RESUME_SESSION = 3;
    public static final int USER_IDENTITY_CHANGED = 8;

    @GuardedBy("handlerLock")
    @Nullable
    private Handler handler;

    @NotNull
    private final Object handlerLock = new Object();
    private volatile boolean isInitialized;

    @Override // com.amazon.dee.app.services.metrics.MetricsConnector
    public final void beginSession() {
        getHandler$impl().sendEmptyMessage(1);
    }

    @Override // com.amazon.dee.app.services.metrics.MetricsConnector
    public final void endSession() {
        getHandler$impl().sendEmptyMessage(2);
    }

    @NotNull
    public final Handler getHandler$impl() {
        Handler handler;
        synchronized (this.handlerLock) {
            handler = this.handler;
            if (handler == null) {
                HandlerThread handlerThread = new HandlerThread(getClass().getName());
                handlerThread.start();
                Handler handler2 = new Handler(handlerThread.getLooper(), this);
                this.handler = handler2;
                handler = handler2;
            }
        }
        return handler;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message message) {
        message.getClass();
        initialize();
        switch (message.what) {
            case 1:
                onBeginSession$impl();
                return true;
            case 2:
                onEndSession$impl();
                return true;
            case 3:
                onResumeSession$impl();
                return true;
            case 4:
                onPauseSession$impl();
                return true;
            case 5:
                Object obj = message.obj;
                AlexaMetricsEvent alexaMetricsEvent = obj instanceof AlexaMetricsEvent ? (AlexaMetricsEvent) obj : null;
                if (alexaMetricsEvent == null) {
                    return false;
                }
                onRecordEvent$impl(alexaMetricsEvent);
                return true;
            case 6:
                Object obj2 = message.obj;
                MobilyticsOperationalEvent mobilyticsOperationalEvent = obj2 instanceof MobilyticsOperationalEvent ? (MobilyticsOperationalEvent) obj2 : null;
                if (mobilyticsOperationalEvent == null) {
                    return false;
                }
                onRecordOperationalEvent$impl(mobilyticsOperationalEvent);
                return true;
            case 7:
                Object obj3 = message.obj;
                MobilyticsUserInteractionEvent mobilyticsUserInteractionEvent = obj3 instanceof MobilyticsUserInteractionEvent ? (MobilyticsUserInteractionEvent) obj3 : null;
                if (mobilyticsUserInteractionEvent == null) {
                    return false;
                }
                onRecordUserInteractionEvent$impl(mobilyticsUserInteractionEvent);
                return true;
            case 8:
                Object obj4 = message.obj;
                UserIdentity userIdentity = obj4 instanceof UserIdentity ? (UserIdentity) obj4 : null;
                if (userIdentity == null) {
                    return false;
                }
                onUserChangedOrNull$impl(userIdentity);
                return true;
            default:
                return false;
        }
    }

    public final void initialize() {
        if (this.isInitialized) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.isInitialized) {
                    getHandler$impl();
                    onInitialize$impl();
                    this.isInitialized = true;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void onBeginSession$impl();

    public abstract void onEndSession$impl();

    public abstract void onInitialize$impl();

    public abstract void onRecordEvent$impl(@NotNull AlexaMetricsEvent event);

    public void onRecordOperationalEvent$impl(@NotNull MobilyticsOperationalEvent operationalEvent) {
        operationalEvent.getClass();
    }

    public void onRecordUserInteractionEvent$impl(@NotNull MobilyticsUserInteractionEvent userInteractionEvent) {
        userInteractionEvent.getClass();
    }

    public void onUserChangedOrNull$impl(@NotNull UserIdentity userIdentity) {
        userIdentity.getClass();
    }

    @Override // com.amazon.dee.app.services.metrics.MetricsConnector
    public final void pauseSession() {
        getHandler$impl().sendEmptyMessage(4);
    }

    @Override // com.amazon.dee.app.services.metrics.MetricsConnector
    public final void recordEvent(@NotNull AlexaMetricsEvent event) {
        event.getClass();
        Message obtainMessage = getHandler$impl().obtainMessage(5, event);
        obtainMessage.getClass();
        getHandler$impl().sendMessage(obtainMessage);
    }

    @Override // com.amazon.dee.app.services.metrics.MetricsConnector
    public void recordOperationalEvent(@NotNull MobilyticsOperationalEvent operationalEvent) {
        operationalEvent.getClass();
        Message obtainMessage = getHandler$impl().obtainMessage(6, operationalEvent);
        obtainMessage.getClass();
        getHandler$impl().sendMessage(obtainMessage);
    }

    @Override // com.amazon.dee.app.services.metrics.MetricsConnector
    public void recordUserInteractionEvent(@NotNull MobilyticsUserInteractionEvent userInteractionEvent) {
        userInteractionEvent.getClass();
        Message obtainMessage = getHandler$impl().obtainMessage(7, userInteractionEvent);
        obtainMessage.getClass();
        getHandler$impl().sendMessage(obtainMessage);
    }

    @Override // com.amazon.dee.app.services.metrics.MetricsConnector
    public final void resumeSession() {
        getHandler$impl().sendEmptyMessage(3);
    }

    @Override // com.amazon.dee.app.services.metrics.MetricsConnector
    public final void shutdown() {
        Looper looper;
        synchronized (this.handlerLock) {
            Handler handler = this.handler;
            if (handler != null && (looper = handler.getLooper()) != null) {
                looper.quitSafely();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.amazon.dee.app.services.metrics.MetricsConnector
    public final void userChanged(@NotNull UserIdentity userIdentity) {
        userIdentity.getClass();
        Message obtainMessage = getHandler$impl().obtainMessage(8, userIdentity);
        obtainMessage.getClass();
        getHandler$impl().sendMessage(obtainMessage);
    }

    public void onPauseSession$impl() {
    }

    public void onResumeSession$impl() {
    }
}
