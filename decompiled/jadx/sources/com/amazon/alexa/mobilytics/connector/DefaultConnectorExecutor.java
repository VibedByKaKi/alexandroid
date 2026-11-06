package com.amazon.alexa.mobilytics.connector;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobilytics.MobilyticsConfiguration;
import com.amazon.alexa.mobilytics.connector.ConnectorExecutor;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatus;
import com.amazon.alexa.mobilytics.identity.MobilyticsRoute;
import com.amazon.alexa.mobilytics.identity.MobilyticsUser;
import com.amazon.alexa.mobilytics.session.MobilyticsSession;
import com.amazon.alexa.mobilytics.util.Log;
import com.google.common.base.Preconditions;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DefaultConnectorExecutor implements ConnectorExecutor, Handler.Callback {
    private static final String TAG = Log.tag((Class<?>) DefaultConnectorExecutor.class);
    private final MobilyticsConnector connector;

    @VisibleForTesting(otherwise = 4)
    public Handler handler;
    private HandlerThread handlerThread;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Singleton
    public static class Factory implements ConnectorExecutor.Factory {
        @Inject
        public Factory() {
        }

        @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor.Factory
        public ConnectorExecutor create(@NonNull MobilyticsConnector mobilyticsConnector) {
            return new DefaultConnectorExecutor(mobilyticsConnector);
        }
    }

    public DefaultConnectorExecutor(@NonNull MobilyticsConnector mobilyticsConnector) {
        this.connector = (MobilyticsConnector) Preconditions.checkNotNull(mobilyticsConnector);
        initialize();
    }

    private void initialize() {
        HandlerThread handlerThread = new HandlerThread(this.connector.name());
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper(), this);
    }

    private void postMessage(int i, @Nullable Object obj) {
        this.handler.sendMessage(this.handler.obtainMessage(i, obj));
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public String connectorName() {
        return this.connector.name();
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeEndpointsChanged() {
        postMessage(10);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeOnEntitlementStatusChanged(@Nullable MobilyticsEntitlementStatus mobilyticsEntitlementStatus) {
        postMessage(9, mobilyticsEntitlementStatus);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeOnFinalize() {
        postMessage(1);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeOnInitialize(@NonNull MobilyticsConfiguration mobilyticsConfiguration) {
        postMessage(0, mobilyticsConfiguration);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeRecordEvent(@NonNull MobilyticsEvent mobilyticsEvent) {
        postMessage(6, mobilyticsEvent);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeRecordInternalEvent(@NonNull MobilyticsEvent mobilyticsEvent) {
        postMessage(11, mobilyticsEvent);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeRouteChanged(@Nullable MobilyticsRoute mobilyticsRoute) {
        postMessage(8, mobilyticsRoute);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeSessionPause(@NonNull MobilyticsSession mobilyticsSession) {
        postMessage(3, mobilyticsSession);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeSessionResume(@NonNull MobilyticsSession mobilyticsSession) {
        postMessage(5, mobilyticsSession);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeSessionStart(@NonNull MobilyticsSession mobilyticsSession) {
        postMessage(2, mobilyticsSession);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeSessionStop(@NonNull MobilyticsSession mobilyticsSession) {
        postMessage(4, mobilyticsSession);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void executeUserChanged(@Nullable MobilyticsUser mobilyticsUser) {
        postMessage(7, mobilyticsUser);
    }

    @Override // com.amazon.alexa.mobilytics.connector.ConnectorExecutor
    public void flush() {
        this.connector.flush();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    this.connector.onInitialize((MobilyticsConfiguration) message.obj);
                    break;
                case 1:
                    this.connector.onFinalize();
                    break;
                case 2:
                    this.connector.onSessionStart((MobilyticsSession) message.obj);
                    break;
                case 3:
                    this.connector.onSessionPause((MobilyticsSession) message.obj);
                    break;
                case 4:
                    this.connector.onSessionStop((MobilyticsSession) message.obj);
                    break;
                case 5:
                    this.connector.onSessionResume((MobilyticsSession) message.obj);
                    break;
                case 6:
                    this.connector.onRecordEvent((MobilyticsEvent) message.obj);
                    break;
                case 7:
                    this.connector.onUserChanged((MobilyticsUser) message.obj);
                    break;
                case 8:
                    this.connector.onRouteChanged((MobilyticsRoute) message.obj);
                    break;
                case 9:
                    this.connector.onEntitlementStatusChanged((MobilyticsEntitlementStatus) message.obj);
                    break;
                case 10:
                    this.connector.onEndpointsChanged();
                    break;
                case 11:
                    MobilyticsConnector mobilyticsConnector = this.connector;
                    if (mobilyticsConnector instanceof InternalEventRecorder) {
                        ((InternalEventRecorder) mobilyticsConnector).onRecordInternalEvent((MobilyticsEvent) message.obj);
                        break;
                    }
                    break;
            }
            return true;
        } catch (Exception e) {
            Log.e(TAG, e, "Error executing action [%d] on connector: [%s]", Integer.valueOf(message.what), this.connector.name());
            return true;
        } catch (OutOfMemoryError e2) {
            String str = TAG;
            Log.e(str, "OutOfMemoryError executing action [%d] on connector: [%s]", Integer.valueOf(message.what), this.connector.name());
            Log.d(str, "OutOfMemoryError executing action [%d] on connector: [%s] \nStack trace: [%s]", Integer.valueOf(message.what), this.connector.name(), android.util.Log.getStackTraceString(e2));
            return true;
        }
    }

    private void postMessage(int i) {
        this.handler.sendEmptyMessage(i);
    }
}
