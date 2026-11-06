package com.amazon.apl.devtools.models;

import android.util.Log;
import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import com.amazon.apl.devtools.controllers.impl.DTConnection;
import com.amazon.apl.devtools.models.Target;
import com.amazon.apl.devtools.models.common.Event;
import com.amazon.apl.devtools.models.common.SessionModel;
import com.amazon.apl.devtools.util.IdGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class Session<T extends Target> extends SessionModel {
    private static final String TAG = "Session";
    private static final IdGenerator sessionIdGenerator = new IdGenerator();
    private boolean isFrameMetricsEventsEnabled;
    private boolean isLogEnabled;
    private boolean isNetworkEnabled;
    private boolean isPerformanceEnabled;
    private final DTConnection mConnection;
    private final T mTarget;

    public Session(DTConnection dTConnection, T t) {
        super(sessionIdGenerator.generateId(OperationalEventType.SESSION));
        Log.i(TAG, "Creating session");
        this.mConnection = dTConnection;
        this.mTarget = t;
        dTConnection.registerSession(this);
        t.registerSession(this);
    }

    public void destroy() {
        this.mConnection.unregisterSession(getSessionId());
        this.mTarget.unregisterSession(getSessionId());
    }

    public DTConnection getConnection() {
        return this.mConnection;
    }

    public T getTarget() {
        return this.mTarget;
    }

    public boolean isFrameMetricsEventsEnabled() {
        return this.isFrameMetricsEventsEnabled;
    }

    public boolean isLogEnabled() {
        return this.isLogEnabled;
    }

    public boolean isNetworkEnabled() {
        return this.isNetworkEnabled;
    }

    public boolean isPerformanceEnabled() {
        return this.isPerformanceEnabled;
    }

    public <TEvent extends Event> void sendEvent(TEvent tevent) {
        this.mConnection.sendEvent(tevent);
    }

    public void setFrameMetricsEventsEnabled(boolean z) {
        this.isFrameMetricsEventsEnabled = z;
    }

    public void setLogEnabled(boolean z) {
        com.amazon.apl.android.Session.setSensitiveLoggingEnabled(z);
        this.isLogEnabled = z;
    }

    public void setNetworkEnabled(boolean z) {
        this.isNetworkEnabled = z;
    }

    public void setPerformanceEnabled(boolean z) {
        this.isPerformanceEnabled = z;
    }
}
