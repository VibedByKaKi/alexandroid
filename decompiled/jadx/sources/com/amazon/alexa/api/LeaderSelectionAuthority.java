package com.amazon.alexa.api;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.amazon.alexa.utils.Provider;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import com.amazon.alexa.utils.validation.Preconditions;
import com.amazon.leaderselection.Leader;
import com.amazon.leaderselection.LeaderSelector;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class LeaderSelectionAuthority {
    private static final String LEADER_SELECTION_EXECUTOR_NAME = "leader-selection";
    private static final String L_S_TIMEOUT_EXECUTOR_NAME = "l-s-timeout";
    private static final String TAG = "LeaderSelectionAuthority";
    public static final long WAIT_FOR_LEADING_ALEXA_SERVICE_TIMEOUT = 10000;
    private final Context context;
    private final ExecutorService executorService;
    private final Provider<LeaderSelector> leaderSelectorProvider;
    private final ScheduledExecutorService timeoutScheduler;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum LeaderSelectionFailureReason {
        UNKNOWN_REASON,
        UNKNOWN_LEADER,
        TIMEOUT,
        NOT_VERIFIED,
        MISSING_PACKAGE,
        DISABLED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LeaderSelectionListener {
        void onLeaderSelected(ComponentName componentName);

        void onLeaderSelectionFailed(LeaderSelectionFailureReason leaderSelectionFailureReason, Throwable th);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LeaderSelectionListenerLifecycle implements LeaderSelectionListener {
        private final AtomicReference<LeaderSelectionListener> listenerReference;

        private LeaderSelectionListenerLifecycle(LeaderSelectionListener leaderSelectionListener) {
            this.listenerReference = new AtomicReference<>(leaderSelectionListener);
        }

        @Override // com.amazon.alexa.api.LeaderSelectionAuthority.LeaderSelectionListener
        public void onLeaderSelected(ComponentName componentName) {
            LeaderSelectionListener andSet = this.listenerReference.getAndSet(null);
            if (andSet != null) {
                andSet.onLeaderSelected(componentName);
            }
        }

        @Override // com.amazon.alexa.api.LeaderSelectionAuthority.LeaderSelectionListener
        public void onLeaderSelectionFailed(LeaderSelectionFailureReason leaderSelectionFailureReason, Throwable th) {
            LeaderSelectionListener andSet = this.listenerReference.getAndSet(null);
            if (andSet != null) {
                andSet.onLeaderSelectionFailed(leaderSelectionFailureReason, th);
            }
        }
    }

    public LeaderSelectionAuthority(final Context context) {
        this(context, ManagedExecutorFactory.newSingleThreadExecutor(LEADER_SELECTION_EXECUTOR_NAME), ManagedExecutorFactory.newSingleThreadScheduledExecutor(L_S_TIMEOUT_EXECUTOR_NAME), new Provider<LeaderSelector>() { // from class: com.amazon.alexa.api.LeaderSelectionAuthority.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.utils.Provider
            public LeaderSelector get() {
                return new LeaderSelector(context);
            }
        });
    }

    public static /* synthetic */ Context access$100(LeaderSelectionAuthority leaderSelectionAuthority) {
        return leaderSelectionAuthority.context;
    }

    public static /* synthetic */ String access$200() {
        return TAG;
    }

    public static /* synthetic */ ExecutorService access$300(LeaderSelectionAuthority leaderSelectionAuthority) {
        return leaderSelectionAuthority.executorService;
    }

    public static /* synthetic */ ScheduledExecutorService access$400(LeaderSelectionAuthority leaderSelectionAuthority) {
        return leaderSelectionAuthority.timeoutScheduler;
    }

    private ScheduledFuture<?> scheduleTimeout(final LeaderSelectionListenerLifecycle leaderSelectionListenerLifecycle) {
        return this.timeoutScheduler.schedule(new Runnable() { // from class: com.amazon.alexa.api.LeaderSelectionAuthority.3
            @Override // java.lang.Runnable
            public void run() {
                Log.e(LeaderSelectionAuthority.TAG, "Leader Selection timed out after 10000ms");
                leaderSelectionListenerLifecycle.onLeaderSelectionFailed(LeaderSelectionFailureReason.TIMEOUT, new TimeoutException("leader selection timeout"));
                LeaderSelectionAuthority.this.timeoutScheduler.shutdown();
            }
        }, 10000L, TimeUnit.MILLISECONDS);
    }

    public void pickAlexaService(final String str, LeaderSelectionListener leaderSelectionListener) {
        Preconditions.notNull(leaderSelectionListener, "Leader selection listener was null");
        final LeaderSelectionListenerLifecycle leaderSelectionListenerLifecycle = new LeaderSelectionListenerLifecycle(leaderSelectionListener);
        final ScheduledFuture<?> scheduleTimeout = scheduleTimeout(leaderSelectionListenerLifecycle);
        Log.i(TAG, "Looking for leading Alexa service " + leaderSelectionListener);
        this.executorService.submit(new Runnable() { // from class: com.amazon.alexa.api.LeaderSelectionAuthority.2
            /*  JADX ERROR: Types fix failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    Method dump skipped, instructions count: 390
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.api.LeaderSelectionAuthority.AnonymousClass2.run():void");
            }
        });
    }

    public Leader selectLeader(String str) {
        Leader select = this.leaderSelectorProvider.get().select(str);
        Objects.toString(select);
        return select;
    }

    public LeaderSelectionAuthority(Context context, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, Provider<LeaderSelector> provider) {
        this.context = context;
        this.executorService = executorService;
        this.timeoutScheduler = scheduledExecutorService;
        this.leaderSelectorProvider = provider;
    }
}
