package com.amazon.dee.app.services.metrics.kinesis.session.client;

import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.amazon.alexa.mobilytics.configuration.DefaultRecordChecker;
import com.amazon.dee.app.services.metrics.kinesis.context.KinesisContext;
import com.amazon.dee.app.services.metrics.kinesis.session.AppSession;
import com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient;
import com.amazon.dee.app.services.metrics.kinesis.session.AppSessionStore;
import com.amazon.dee.app.services.metrics.kinesis.session.SessionObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 ;2\u00020\u0001:\u0002:;B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020%H\u0016J\u0010\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020#H\u0016J\u0010\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020%H\u0016J\b\u0010-\u001a\u00020%H\u0016J\b\u0010.\u001a\u00020%H\u0016J\b\u0010/\u001a\u00020%H\u0016J\u000e\u00100\u001a\u00020%2\u0006\u00101\u001a\u000202J\u0015\u00103\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\b6J\b\u00107\u001a\u000208H\u0016J\u0006\u00109\u001a\u000205R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020 8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppDefaultSessionClient;", "Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSessionClient;", "kinesisContext", "Lcom/amazon/dee/app/services/metrics/kinesis/context/KinesisContext;", "appSessionStore", "Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSessionStore;", "<init>", "(Lcom/amazon/dee/app/services/metrics/kinesis/context/KinesisContext;Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSessionStore;)V", "getKinesisContext", "()Lcom/amazon/dee/app/services/metrics/kinesis/context/KinesisContext;", "getAppSessionStore", "()Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSessionStore;", "value", "Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSession;", "appSession", "getAppSession", "()Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSession;", "setAppSession$impl", "(Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSession;)V", "", "restartDelay", "getRestartDelay", "()J", "resumeDelay", "getResumeDelay", "inactiveState", "Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppInactiveSessionState;", "activeState", "Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppActiveSessionState;", "pausedState", "Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppPausedSessionState;", "state", "Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppSessionClientState;", "sessionObservers", "", "Lcom/amazon/dee/app/services/metrics/kinesis/session/SessionObserver;", "startSession", "", "stopSession", "pauseSession", "resumeSession", "registerSessionObserver", "sessionObserver", "unregisterSessionObserver", "fireSessionStartEvent", "fireSessionPauseEvent", "fireSessionResumeEvent", "fireSessionStopEvent", "updateSessionizationStrategy", "mobilyticsSession", "", "changeState", "sessionState", "Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppDefaultSessionClient$SessionState;", "changeState$impl", "toString", "", "getSessionState", "SessionState", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppDefaultSessionClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDefaultSessionClient.kt\ncom/amazon/dee/app/services/metrics/kinesis/session/client/AppDefaultSessionClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n1869#2,2:157\n1869#2,2:159\n1869#2,2:161\n1869#2,2:163\n*S KotlinDebug\n*F\n+ 1 AppDefaultSessionClient.kt\ncom/amazon/dee/app/services/metrics/kinesis/session/client/AppDefaultSessionClient\n*L\n71#1:157,2\n79#1:159,2\n87#1:161,2\n95#1:163,2\n*E\n"})
/* loaded from: classes5.dex */
public final class AppDefaultSessionClient implements AppSessionClient {

    @NotNull
    public static final String SESSION_PAUSE_EVENT_TYPE = "_session.pause";

    @NotNull
    public static final String SESSION_RESUME_EVENT_TYPE = "_session.resume";

    @NotNull
    public static final String SESSION_START_EVENT_TYPE = "_session.start";

    @NotNull
    public static final String SESSION_STOP_EVENT_TYPE = "_session.stop";

    @NotNull
    private final AppActiveSessionState activeState;

    @Nullable
    private AppSession appSession;

    @NotNull
    private final AppSessionStore appSessionStore;

    @NotNull
    private final AppInactiveSessionState inactiveState;

    @NotNull
    private final KinesisContext kinesisContext;

    @NotNull
    private final AppPausedSessionState pausedState;
    private long restartDelay;
    private long resumeDelay;

    @NotNull
    private final List<SessionObserver> sessionObservers;

    @JvmField
    @NotNull
    public AppSessionClientState state;
    private static final long DEFAULT_RESUME_DELAY = 5000;
    private static final long DEFAULT_RESTART_DELAY = 30000;
    private static final long DEFAULT_RESUME_DELAY_MOBILYTICS = 1800000;
    private static final long DEFAULT_RESTART_DELAY_MOBILYTICS = 1800000;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/session/client/AppDefaultSessionClient$SessionState;", "", "<init>", "(Ljava/lang/String;I)V", "INACTIVE", "ACTIVE", CareActorsStore.SubscriptionStatus.PAUSED, "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SessionState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SessionState[] $VALUES;
        public static final SessionState INACTIVE = new SessionState("INACTIVE", 0);
        public static final SessionState ACTIVE = new SessionState("ACTIVE", 1);
        public static final SessionState PAUSED = new SessionState(CareActorsStore.SubscriptionStatus.PAUSED, 2);

        private static final /* synthetic */ SessionState[] $values() {
            return new SessionState[]{INACTIVE, ACTIVE, PAUSED};
        }

        static {
            SessionState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private SessionState(String str, int i) {
        }

        @NotNull
        public static EnumEntries<SessionState> getEntries() {
            return $ENTRIES;
        }

        public static SessionState valueOf(String str) {
            return (SessionState) Enum.valueOf(SessionState.class, str);
        }

        public static SessionState[] values() {
            return (SessionState[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SessionState.values().length];
            try {
                iArr[SessionState.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionState.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppDefaultSessionClient(@NotNull KinesisContext kinesisContext, @NotNull AppSessionStore appSessionStore) {
        kinesisContext.getClass();
        appSessionStore.getClass();
        this.kinesisContext = kinesisContext;
        this.appSessionStore = appSessionStore;
        this.appSession = appSessionStore.getSession();
        this.restartDelay = DEFAULT_RESTART_DELAY;
        this.resumeDelay = DEFAULT_RESUME_DELAY;
        AppInactiveSessionState appInactiveSessionState = new AppInactiveSessionState(this);
        this.inactiveState = appInactiveSessionState;
        this.activeState = new AppActiveSessionState(this);
        AppPausedSessionState appPausedSessionState = new AppPausedSessionState(this);
        this.pausedState = appPausedSessionState;
        this.state = this.appSession != null ? appPausedSessionState : appInactiveSessionState;
        this.sessionObservers = new ArrayList();
    }

    public final synchronized void changeState$impl(@NotNull SessionState sessionState) {
        AppSessionClientState appSessionClientState;
        try {
            sessionState.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[sessionState.ordinal()];
            if (i == 1) {
                appSessionClientState = this.inactiveState;
            } else if (i == 2) {
                appSessionClientState = this.activeState;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                appSessionClientState = this.pausedState;
            }
            this.state = appSessionClientState;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient
    public void fireSessionPauseEvent() {
        synchronized (this.sessionObservers) {
            try {
                AppSession appSession = this.appSession;
                if (appSession != null) {
                    Iterator<T> it2 = this.sessionObservers.iterator();
                    while (it2.hasNext()) {
                        ((SessionObserver) it2.next()).onSessionPause(appSession);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient
    public void fireSessionResumeEvent() {
        synchronized (this.sessionObservers) {
            try {
                AppSession appSession = this.appSession;
                if (appSession != null) {
                    Iterator<T> it2 = this.sessionObservers.iterator();
                    while (it2.hasNext()) {
                        ((SessionObserver) it2.next()).onSessionResume(appSession);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient
    public void fireSessionStartEvent() {
        synchronized (this.sessionObservers) {
            try {
                AppSession appSession = this.appSession;
                if (appSession != null) {
                    Iterator<T> it2 = this.sessionObservers.iterator();
                    while (it2.hasNext()) {
                        ((SessionObserver) it2.next()).onSessionStart(appSession);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient
    public void fireSessionStopEvent() {
        synchronized (this.sessionObservers) {
            try {
                AppSession appSession = this.appSession;
                if (appSession != null) {
                    Iterator<T> it2 = this.sessionObservers.iterator();
                    while (it2.hasNext()) {
                        ((SessionObserver) it2.next()).onSessionStop(appSession);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final AppSession getAppSession() {
        return this.appSession;
    }

    @NotNull
    public final AppSessionStore getAppSessionStore() {
        return this.appSessionStore;
    }

    @NotNull
    public final KinesisContext getKinesisContext() {
        return this.kinesisContext;
    }

    public final long getRestartDelay() {
        return this.restartDelay;
    }

    public final long getResumeDelay() {
        return this.resumeDelay;
    }

    @NotNull
    public final SessionState getSessionState() {
        AppSession appSession = this.appSession;
        return appSession == null ? SessionState.INACTIVE : appSession.isPaused() ? SessionState.PAUSED : SessionState.ACTIVE;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient
    public synchronized void pauseSession() {
        this.state.pause();
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient
    public void registerSessionObserver(@NotNull SessionObserver sessionObserver) {
        sessionObserver.getClass();
        synchronized (this.sessionObservers) {
            this.sessionObservers.add(sessionObserver);
        }
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient
    public synchronized void resumeSession() {
        this.state.resume();
    }

    public final void setAppSession$impl(@Nullable AppSession appSession) {
        this.appSession = appSession;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient
    public synchronized void startSession() {
        this.state.start();
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient
    public synchronized void stopSession() {
        this.state.stop();
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[AppDefaultSessionClient]\n- appSession: ");
        AppSession appSession = this.appSession;
        if (appSession == null || (str = appSession.getSessionID()) == null) {
            str = DefaultRecordChecker.Regex.EMPTY;
        }
        sb.append(str);
        AppSession appSession2 = this.appSession;
        if (appSession2 != null && appSession2.isPaused()) {
            sb.append(": paused");
        }
        return sb.toString();
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.session.AppSessionClient
    public void unregisterSessionObserver(@NotNull SessionObserver sessionObserver) {
        sessionObserver.getClass();
        synchronized (this.sessionObservers) {
            this.sessionObservers.remove(sessionObserver);
        }
    }

    public final void updateSessionizationStrategy(boolean mobilyticsSession) {
        if (mobilyticsSession) {
            this.resumeDelay = DEFAULT_RESUME_DELAY_MOBILYTICS;
            this.restartDelay = DEFAULT_RESTART_DELAY_MOBILYTICS;
        } else {
            this.resumeDelay = DEFAULT_RESUME_DELAY;
            this.restartDelay = DEFAULT_RESTART_DELAY;
        }
    }
}
