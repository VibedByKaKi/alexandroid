package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client;

import com.amazon.alexa.mobilytics.configuration.DefaultRecordChecker;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.Preconditions;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.InternalSessionClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.Session;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.SessionStore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class DefaultSessionClient implements InternalSessionClient {
    protected static final long DEFAULT_RESTART_DELAY = 30000;
    protected static final long DEFAULT_RESUME_DELAY = 5000;
    protected static final String RESTART_DELAY_CONFIG_KEY = "sessionRestartDelay";
    protected static final String RESUME_DELAY_CONFIG_KEY = "sessionResumeDelay";
    public static final String SESSION_PAUSE_EVENT_TYPE = "_session.pause";
    public static final String SESSION_RESUME_EVENT_TYPE = "_session.resume";
    public static final String SESSION_START_EVENT_TYPE = "_session.start";
    public static final String SESSION_STOP_EVENT_TYPE = "_session.stop";
    private final SessionClientState ACTIVE_STATE;
    private final SessionClientState INACTIVE_STATE;
    private final SessionClientState PAUSED_STATE;
    protected final AnalyticsContext context;
    protected final InternalEventClient eventClient;
    private final long restartDelay;
    private final long resumeDelay;
    protected Session session;
    protected final SessionStore sessionStore;
    protected SessionClientState state;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.DefaultSessionClient$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$mobileconnectors$amazonmobileanalytics$internal$session$client$DefaultSessionClient$SessionState;

        static {
            int[] iArr = new int[SessionState.values().length];
            $SwitchMap$com$amazonaws$mobileconnectors$amazonmobileanalytics$internal$session$client$DefaultSessionClient$SessionState = iArr;
            try {
                iArr[SessionState.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$mobileconnectors$amazonmobileanalytics$internal$session$client$DefaultSessionClient$SessionState[SessionState.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazonaws$mobileconnectors$amazonmobileanalytics$internal$session$client$DefaultSessionClient$SessionState[SessionState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SessionState {
        INACTIVE,
        ACTIVE,
        PAUSED
    }

    public DefaultSessionClient(AnalyticsContext analyticsContext, InternalEventClient internalEventClient, SessionStore sessionStore) {
        SessionClientState inactiveSessionState = new InactiveSessionState(this);
        this.INACTIVE_STATE = inactiveSessionState;
        this.ACTIVE_STATE = new ActiveSessionState(this);
        SessionClientState pausedSessionState = new PausedSessionState(this);
        this.PAUSED_STATE = pausedSessionState;
        Preconditions.checkNotNull(analyticsContext, "A valid InsightsContext must be provided!");
        Preconditions.checkNotNull(internalEventClient, "A valid EventClient must be provided!");
        Preconditions.checkNotNull(sessionStore, "A valid SessionStore must be provided!");
        this.sessionStore = sessionStore;
        this.eventClient = internalEventClient;
        this.context = analyticsContext;
        Session session = sessionStore.getSession();
        this.session = session;
        if (session != null) {
            internalEventClient.setSessionId(session.getSessionID());
            internalEventClient.setSessionStartTime(this.session.getStartTime());
        }
        this.state = this.session != null ? pausedSessionState : inactiveSessionState;
        this.restartDelay = analyticsContext.getConfiguration().optLong(RESTART_DELAY_CONFIG_KEY, 30000L).longValue();
        this.resumeDelay = analyticsContext.getConfiguration().optLong(RESUME_DELAY_CONFIG_KEY, 5000L).longValue();
    }

    public synchronized void changeState(SessionState sessionState) {
        try {
            int i = AnonymousClass1.$SwitchMap$com$amazonaws$mobileconnectors$amazonmobileanalytics$internal$session$client$DefaultSessionClient$SessionState[sessionState.ordinal()];
            if (i == 1) {
                this.state = this.INACTIVE_STATE;
            } else if (i == 2) {
                this.state = this.ACTIVE_STATE;
            } else if (i == 3) {
                this.state = this.PAUSED_STATE;
            }
        } finally {
        }
    }

    public long getRestartDelay() {
        return this.restartDelay;
    }

    public long getResumeDelay() {
        return this.resumeDelay;
    }

    public Session getSession() {
        return this.session;
    }

    public SessionState getSessionState() {
        Session session = this.session;
        return session != null ? session.isPaused() ? SessionState.PAUSED : SessionState.ACTIVE : SessionState.INACTIVE;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.SessionClient
    public synchronized void pauseSession() {
        this.state.pause();
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.SessionClient
    public synchronized void resumeSession() {
        this.state.resume();
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.InternalSessionClient
    public synchronized void startSession() {
        this.state.start();
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.InternalSessionClient
    public synchronized void stopSession() {
        this.state.stop();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[DefaultSessionClient]\n- session: ");
        Session session = this.session;
        sb.append(session == null ? DefaultRecordChecker.Regex.EMPTY : session.getSessionID());
        Session session2 = this.session;
        sb.append((session2 == null || !session2.isPaused()) ? "" : ": paused");
        return sb.toString();
    }
}
