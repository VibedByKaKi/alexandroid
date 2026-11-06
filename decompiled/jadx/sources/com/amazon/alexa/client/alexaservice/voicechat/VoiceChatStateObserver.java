package com.amazon.alexa.client.alexaservice.voicechat;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.api.VoiceChatModeState;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.LiveModeOnboardingVisibilityChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.VoiceChatModeStateChangedEvent;
import com.amazon.alexa.client.alexaservice.vad.events.VADMetricCounterEvent;
import com.amazon.alexa.ttcf.TTCFService$$ExternalSyntheticLambda0;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VoiceChatStateObserver {

    @VisibleForTesting
    static final String METRIC_ONBOARDING_HEARTBEAT_MISSED = "LiveModeOnboarding.HeartbeatMissed";

    @VisibleForTesting
    static final long ONBOARDING_HIDE_GRACE_MS = 1000;

    @VisibleForTesting
    static final long ONBOARDING_VISIBILITY_TIMEOUT_MS = 12000;
    private static final String TAG = "VoiceChatStateObserver";
    private final Context context;
    private final AlexaClientEventBus eventBus;

    @Nullable
    private ExtendedClient onboardingClient;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable onboardingVisibilityExpiry = new TTCFService$$ExternalSyntheticLambda0(this, 3);
    private VoiceChatModeState voiceChatState = VoiceChatModeState.INACTIVE;
    private boolean onboardingSuppressing = false;
    private boolean awaitingSessionHandoff = false;
    private long onboardingVisibleUntilMs = 0;
    private boolean onboardingHidePending = false;
    private boolean lastPublishedActive = false;

    @Inject
    public VoiceChatStateObserver(@NonNull Context context, @NonNull AlexaClientEventBus alexaClientEventBus) {
        this.context = context;
        this.eventBus = alexaClientEventBus;
        VoiceChatState.setActive(false);
        context.getContentResolver().notifyChange(VoiceChatContract.getContentUri(context), null);
        alexaClientEventBus.register(this);
    }

    private void clearOnboardingSuppression() {
        this.handler.removeCallbacks(this.onboardingVisibilityExpiry);
        this.onboardingSuppressing = false;
        this.onboardingClient = null;
        this.onboardingHidePending = false;
        this.awaitingSessionHandoff = false;
    }

    @VisibleForTesting
    public static boolean isVoiceChatActive(VoiceChatModeState voiceChatModeState) {
        return voiceChatModeState == VoiceChatModeState.ACTIVE || voiceChatModeState == VoiceChatModeState.MUTED;
    }

    private synchronized void onOnboardingVisibilityChanged(@Nullable ExtendedClient extendedClient, boolean z) {
        if (!z) {
            if (!this.onboardingSuppressing) {
                return;
            }
        }
        this.handler.removeCallbacks(this.onboardingVisibilityExpiry);
        this.onboardingSuppressing = true;
        if (extendedClient != null) {
            this.onboardingClient = extendedClient;
        }
        this.awaitingSessionHandoff = false;
        this.onboardingHidePending = !z;
        long uptimeMillis = SystemClock.uptimeMillis() + (z ? 12000L : 1000L);
        this.onboardingVisibleUntilMs = uptimeMillis;
        this.handler.postAtTime(this.onboardingVisibilityExpiry, uptimeMillis);
        if (z) {
            publishIfChanged("Live Mode onboarding visibility changed to true");
        } else {
            Log.i(TAG, "Live Mode onboarding hidden; clearing after 1000ms grace");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onOnboardingVisibilityExpired() {
        String str;
        if (this.onboardingSuppressing && SystemClock.uptimeMillis() >= this.onboardingVisibleUntilMs) {
            boolean z = this.onboardingHidePending;
            if (z && this.voiceChatState == VoiceChatModeState.STARTING) {
                Log.i(TAG, "Live Mode onboarding hidden but session still STARTING; holding until it settles");
                this.onboardingHidePending = false;
                this.awaitingSessionHandoff = true;
                long uptimeMillis = SystemClock.uptimeMillis() + 12000;
                this.onboardingVisibleUntilMs = uptimeMillis;
                this.handler.postAtTime(this.onboardingVisibilityExpiry, uptimeMillis);
                return;
            }
            if (z) {
                str = "Live Mode onboarding visibility changed to false after 1000ms grace";
            } else if (this.awaitingSessionHandoff) {
                str = "Live Mode session still STARTING 12000ms after onboarding closed";
            } else {
                str = "Live Mode onboarding visibility expired after 12000ms without refresh";
                this.eventBus.post(VADMetricCounterEvent.create(METRIC_ONBOARDING_HEARTBEAT_MISSED));
            }
            clearOnboardingSuppression();
            publishIfChanged(str);
        }
    }

    private void publishIfChanged(@NonNull String str) {
        boolean z = isVoiceChatActive(this.voiceChatState) || this.onboardingSuppressing;
        if (z == this.lastPublishedActive) {
            return;
        }
        this.lastPublishedActive = z;
        VoiceChatState.setActive(z);
        Uri contentUri = VoiceChatContract.getContentUri(this.context);
        this.context.getContentResolver().notifyChange(contentUri, null);
        Log.i(TAG, str + " (active=" + z + "); notified " + contentUri);
    }

    @Subscribe
    public synchronized void on(@NonNull VoiceChatModeStateChangedEvent voiceChatModeStateChangedEvent) {
        try {
            VoiceChatModeState state = voiceChatModeStateChangedEvent.getState();
            this.voiceChatState = state;
            if (this.awaitingSessionHandoff && state != VoiceChatModeState.STARTING) {
                clearOnboardingSuppression();
            }
            publishIfChanged("Voice Chat Mode state changed to " + this.voiceChatState);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void teardown() {
        this.eventBus.unregister(this);
        synchronized (this) {
            clearOnboardingSuppression();
            this.voiceChatState = VoiceChatModeState.INACTIVE;
            publishIfChanged("teardown");
        }
    }

    @Subscribe
    public void on(@NonNull LiveModeOnboardingVisibilityChangedEvent liveModeOnboardingVisibilityChangedEvent) {
        onOnboardingVisibilityChanged(liveModeOnboardingVisibilityChangedEvent.getClient(), liveModeOnboardingVisibilityChangedEvent.isVisible());
    }

    @Subscribe
    public synchronized void on(@NonNull ClientDisconnectedEvent clientDisconnectedEvent) {
        ExtendedClient extendedClient;
        if (this.onboardingSuppressing && (extendedClient = this.onboardingClient) != null && extendedClient.equals(clientDisconnectedEvent.getClient())) {
            clearOnboardingSuppression();
            publishIfChanged("Live Mode onboarding client disconnected");
        }
    }
}
