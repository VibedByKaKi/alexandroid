package com.bugsnag.android;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.DateUtils;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.TaskType;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SessionTracker extends BaseObservable {
    private static final int DEFAULT_TIMEOUT_MS = 30000;
    final BackgroundTaskService backgroundTaskService;
    private final CallbackState callbackState;
    private final Client client;
    private final ImmutableConfig configuration;
    private volatile Session currentSession;
    private final Collection<String> foregroundActivities;
    private final ForegroundDetector foregroundDetector;
    private final AtomicLong lastEnteredForegroundMs;
    private final AtomicLong lastExitedForegroundMs;
    final Logger logger;
    final SessionStore sessionStore;
    private final long timeoutMs;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.bugsnag.android.SessionTracker$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$bugsnag$android$DeliveryStatus;

        static {
            int[] iArr = new int[DeliveryStatus.values().length];
            $SwitchMap$com$bugsnag$android$DeliveryStatus = iArr;
            try {
                iArr[DeliveryStatus.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bugsnag$android$DeliveryStatus[DeliveryStatus.UNDELIVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bugsnag$android$DeliveryStatus[DeliveryStatus.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SessionTracker(ImmutableConfig immutableConfig, CallbackState callbackState, Client client, long j, SessionStore sessionStore, Logger logger, BackgroundTaskService backgroundTaskService) {
        this.foregroundActivities = new ConcurrentLinkedQueue();
        this.lastExitedForegroundMs = new AtomicLong(0L);
        this.lastEnteredForegroundMs = new AtomicLong(0L);
        this.currentSession = null;
        this.configuration = immutableConfig;
        this.callbackState = callbackState;
        this.client = client;
        this.timeoutMs = j;
        this.sessionStore = sessionStore;
        this.foregroundDetector = new ForegroundDetector(client.getAppContext());
        this.backgroundTaskService = backgroundTaskService;
        this.logger = logger;
        notifyNdkInForeground();
    }

    private void flushInMemorySession(final Session session) {
        try {
            this.backgroundTaskService.submitTask(TaskType.SESSION_REQUEST, new Runnable() { // from class: com.bugsnag.android.SessionTracker.2
                @Override // java.lang.Runnable
                public void run() {
                    SessionTracker.this.deliverInMemorySession(session);
                }
            });
        } catch (RejectedExecutionException unused) {
            this.sessionStore.write(session);
        }
    }

    private void notifyNdkInForeground() {
        Boolean isInForeground = isInForeground();
        updateState(new StateEvent.UpdateInForeground(isInForeground != null ? isInForeground.booleanValue() : false, getContextActivity()));
    }

    private void notifySessionStartObserver(Session session) {
        updateState(new StateEvent.StartSession(session.getId(), DateUtils.toIso8601(session.getStartedAt()), session.getHandledCount(), session.getUnhandledCount()));
    }

    private boolean trackSessionIfNeeded(Session session) {
        this.logger.d("SessionTracker#trackSessionIfNeeded() - session captured by Client");
        session.setApp(this.client.getAppDataCollector().generateApp());
        session.setDevice(this.client.getDeviceDataCollector().generateDevice());
        if (!this.callbackState.runOnSessionTasks(session, this.logger) || !session.isTracked().compareAndSet(false, true)) {
            return false;
        }
        this.currentSession = session;
        notifySessionStartObserver(session);
        flushInMemorySession(session);
        flushAsync();
        return true;
    }

    public void deliverInMemorySession(Session session) {
        try {
            this.logger.d("SessionTracker#trackSessionIfNeeded() - attempting initial delivery");
            int i = AnonymousClass3.$SwitchMap$com$bugsnag$android$DeliveryStatus[deliverSessionPayload(session).ordinal()];
            if (i == 1) {
                this.logger.d("Sent 1 new session to Bugsnag");
                return;
            }
            if (i == 2) {
                this.logger.w("Storing session payload for future delivery");
                this.sessionStore.write(session);
            } else {
                if (i != 3) {
                    return;
                }
                this.logger.w("Dropping invalid session tracking payload");
            }
        } catch (Exception e) {
            this.logger.w("Session tracking payload failed", e);
        }
    }

    public DeliveryStatus deliverSessionPayload(Session session) {
        return this.configuration.getDelivery().deliver(session, this.configuration.getSessionApiDeliveryParams());
    }

    public void flushAsync() {
        try {
            this.backgroundTaskService.submitTask(TaskType.SESSION_REQUEST, new Runnable() { // from class: com.bugsnag.android.SessionTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    SessionTracker.this.flushStoredSessions();
                }
            });
        } catch (RejectedExecutionException e) {
            this.logger.w("Failed to flush session reports", e);
        }
    }

    public void flushStoredSession(File file) {
        this.logger.d("SessionTracker#flushStoredSession() - attempting delivery");
        Session session = new Session(file, this.client.getNotifier(), this.logger);
        if (!session.isV2Payload()) {
            session.setApp(this.client.getAppDataCollector().generateApp());
            session.setDevice(this.client.getDeviceDataCollector().generateDevice());
        }
        int i = AnonymousClass3.$SwitchMap$com$bugsnag$android$DeliveryStatus[deliverSessionPayload(session).ordinal()];
        if (i == 1) {
            this.sessionStore.deleteStoredFiles(Collections.singletonList(file));
            this.logger.d("Sent 1 new session to Bugsnag");
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.logger.w("Deleting invalid session tracking payload");
            this.sessionStore.deleteStoredFiles(Collections.singletonList(file));
            return;
        }
        if (!this.sessionStore.isTooOld(file)) {
            this.sessionStore.cancelQueuedFiles(Collections.singletonList(file));
            this.logger.w("Leaving session payload for future delivery");
            return;
        }
        this.logger.w("Discarding historical session (from {" + this.sessionStore.getCreationDate(file) + "}) after failed delivery");
        this.sessionStore.deleteStoredFiles(Collections.singletonList(file));
    }

    public void flushStoredSessions() {
        Iterator<File> it2 = this.sessionStore.findStoredFiles().iterator();
        while (it2.hasNext()) {
            flushStoredSession(it2.next());
        }
    }

    @Nullable
    public String getContextActivity() {
        if (this.foregroundActivities.isEmpty()) {
            return null;
        }
        int size = this.foregroundActivities.size();
        return ((String[]) this.foregroundActivities.toArray(new String[size]))[size - 1];
    }

    @Nullable
    public Session getCurrentSession() {
        Session session = this.currentSession;
        if (session == null || session.isPaused.get()) {
            return null;
        }
        return session;
    }

    public long getLastEnteredForegroundMs() {
        return this.lastEnteredForegroundMs.get();
    }

    public Session incrementHandledAndCopy() {
        Session currentSession = getCurrentSession();
        if (currentSession != null) {
            return currentSession.incrementHandledAndCopy();
        }
        return null;
    }

    public Session incrementUnhandledAndCopy() {
        Session currentSession = getCurrentSession();
        if (currentSession != null) {
            return currentSession.incrementUnhandledAndCopy();
        }
        return null;
    }

    @Nullable
    public Boolean isInForeground() {
        return this.foregroundDetector.isInForeground();
    }

    public void onActivityStarted(String str) {
        updateForegroundTracker(str, true, SystemClock.elapsedRealtime());
    }

    public void onActivityStopped(String str) {
        updateForegroundTracker(str, false, SystemClock.elapsedRealtime());
    }

    public void pauseSession() {
        Session session = this.currentSession;
        if (session != null) {
            session.isPaused.set(true);
            updateState(StateEvent.PauseSession.INSTANCE);
        }
    }

    @Nullable
    public Session registerExistingSession(@Nullable Date date, @Nullable String str, @Nullable User user, int i, int i2) {
        Session session = null;
        if (this.client.getConfig().shouldDiscardSession(false)) {
            return null;
        }
        if (date == null || str == null) {
            updateState(StateEvent.PauseSession.INSTANCE);
        } else {
            Session session2 = new Session(str, date, user, i, i2, this.client.getNotifier(), this.logger);
            notifySessionStartObserver(session2);
            session = session2;
        }
        this.currentSession = session;
        return session;
    }

    public boolean resumeSession() {
        Session session = this.currentSession;
        boolean z = false;
        if (session == null) {
            session = startSession(false);
        } else {
            z = session.isPaused.compareAndSet(true, false);
        }
        if (session != null) {
            notifySessionStartObserver(session);
        }
        return z;
    }

    @Nullable
    @VisibleForTesting
    public Session startNewSession(@NonNull Date date, @Nullable User user, boolean z) {
        if (this.client.getConfig().shouldDiscardSession(z)) {
            return null;
        }
        Session session = new Session(UUID.randomUUID().toString(), date, user, z, this.client.getNotifier(), this.logger);
        if (trackSessionIfNeeded(session)) {
            return session;
        }
        return null;
    }

    public Session startSession(boolean z) {
        if (this.client.getConfig().shouldDiscardSession(z)) {
            return null;
        }
        return startNewSession(new Date(), this.client.getUserImpl(), z);
    }

    public void updateForegroundTracker(String str, boolean z, long j) {
        if (z) {
            long j2 = j - this.lastExitedForegroundMs.get();
            if (this.foregroundActivities.isEmpty()) {
                this.lastEnteredForegroundMs.set(j);
                if (j2 >= this.timeoutMs && this.configuration.getAutoTrackSessions()) {
                    startNewSession(new Date(), this.client.getUserImpl(), true);
                }
            }
            this.foregroundActivities.add(str);
        } else {
            this.foregroundActivities.remove(str);
            if (this.foregroundActivities.isEmpty()) {
                this.lastExitedForegroundMs.set(j);
            }
        }
        this.client.getContextState().setAutomaticContext(getContextActivity());
        notifyNdkInForeground();
    }

    public SessionTracker(ImmutableConfig immutableConfig, CallbackState callbackState, Client client, SessionStore sessionStore, Logger logger, BackgroundTaskService backgroundTaskService) {
        this(immutableConfig, callbackState, client, 30000L, sessionStore, logger, backgroundTaskService);
    }
}
