package com.amazon.alexa.accessory.frames.translation.session;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.accessory.frames.translation.util.LiveTranslationMetrics;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.amazon.alexa.presence.service.PresenceBleService;
import com.amazon.devicesetup.common.v1.WifiConnectionState;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0002R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/session/TranslationSessionManager;", "", "<init>", "()V", "value", "Lcom/amazon/alexa/accessory/frames/translation/session/TranslationSessionManager$State;", "currentState", "getCurrentState", "()Lcom/amazon/alexa/accessory/frames/translation/session/TranslationSessionManager$State;", "transitionTo", "", "targetState", "forceIdle", "", "isSessionActive", "()Z", "canStart", "getCanStart", "canStop", "getCanStop", "canPause", "getCanPause", "canResume", "getCanResume", "isValidTransition", "from", TypedValues.TransitionType.S_TO, "Companion", "State", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TranslationSessionManager {

    @NotNull
    private static final String TAG = "TranslationSessionManager";

    @NotNull
    private volatile State currentState = State.IDLE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/session/TranslationSessionManager$State;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, PresenceBleService.ServiceState.STARTING, "ACTIVE", CareActorsStore.SubscriptionStatus.PAUSED, PresenceBleService.ServiceState.STOPPING, "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE = new State(WifiConnectionState.IDLE, 0);
        public static final State STARTING = new State(PresenceBleService.ServiceState.STARTING, 1);
        public static final State ACTIVE = new State("ACTIVE", 2);
        public static final State PAUSED = new State(CareActorsStore.SubscriptionStatus.PAUSED, 3);
        public static final State STOPPING = new State(PresenceBleService.ServiceState.STOPPING, 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{IDLE, STARTING, ACTIVE, PAUSED, STOPPING};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private State(String str, int i) {
        }

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[State.STOPPING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean isValidTransition(State from, State to) {
        int i = WhenMappings.$EnumSwitchMapping$0[from.ordinal()];
        if (i == 1) {
            return to == State.STARTING;
        }
        if (i == 2) {
            return to == State.ACTIVE || to == State.STOPPING || to == State.IDLE;
        }
        if (i == 3) {
            return to == State.PAUSED || to == State.STOPPING || to == State.IDLE;
        }
        if (i == 4) {
            return to == State.ACTIVE || to == State.STOPPING || to == State.IDLE;
        }
        if (i == 5) {
            return to == State.IDLE;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return false;
    }

    public final synchronized void forceIdle() {
        Log.i(TAG, "Force transition to IDLE from " + this.currentState);
        this.currentState = State.IDLE;
    }

    public final boolean getCanPause() {
        return this.currentState == State.ACTIVE;
    }

    public final boolean getCanResume() {
        return this.currentState == State.PAUSED;
    }

    public final boolean getCanStart() {
        return this.currentState == State.IDLE;
    }

    public final boolean getCanStop() {
        return this.currentState == State.ACTIVE || this.currentState == State.PAUSED || this.currentState == State.STARTING;
    }

    @NotNull
    public final State getCurrentState() {
        return this.currentState;
    }

    public final boolean isSessionActive() {
        return this.currentState == State.ACTIVE || this.currentState == State.PAUSED;
    }

    public final synchronized boolean transitionTo(@NotNull State targetState) {
        boolean isValidTransition;
        try {
            targetState.getClass();
            isValidTransition = isValidTransition(this.currentState, targetState);
            if (isValidTransition) {
                Log.i(TAG, "State transition: " + this.currentState + " → " + targetState);
                this.currentState = targetState;
            } else {
                Log.w(TAG, "Invalid state transition: " + this.currentState + " → " + targetState + " (ignored)");
                LiveTranslationMetrics.INSTANCE.recordInvalidStateTransition();
            }
        } catch (Throwable th) {
            throw th;
        }
        return isValidTransition;
    }
}
