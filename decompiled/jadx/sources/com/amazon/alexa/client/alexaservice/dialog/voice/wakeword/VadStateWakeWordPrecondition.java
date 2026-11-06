package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.api.VoiceChatModeState;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.VoiceChatModeStateChangedEvent;
import com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VadStateWakeWordPrecondition extends InternalWakeWordPrecondition {
    private static final String TAG = "VadStateWWPrecondition";
    private final AlexaClientEventBus alexaClientEventBus;
    private final Object lock = new Object();
    private VoiceChatModeState currentState = VoiceChatModeState.INACTIVE;

    @Inject
    public VadStateWakeWordPrecondition(AlexaClientEventBus alexaClientEventBus) {
        this.alexaClientEventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    private static boolean isWakeWordAllowedInternal(VoiceChatModeState voiceChatModeState) {
        return voiceChatModeState == VoiceChatModeState.INACTIVE || voiceChatModeState == VoiceChatModeState.ERROR;
    }

    @Override // com.amazon.alexa.wakeword.precondition.WakeWordPrecondition
    public boolean isWakeWordAllowed() {
        boolean isWakeWordAllowedInternal;
        synchronized (this.lock) {
            isWakeWordAllowedInternal = isWakeWordAllowedInternal(this.currentState);
        }
        return isWakeWordAllowedInternal;
    }

    @Subscribe
    public void on(VoiceChatModeStateChangedEvent voiceChatModeStateChangedEvent) {
        boolean isWakeWordAllowedInternal;
        boolean isWakeWordAllowedInternal2;
        synchronized (this.lock) {
            isWakeWordAllowedInternal = isWakeWordAllowedInternal(this.currentState);
            VoiceChatModeState state = voiceChatModeStateChangedEvent.getState();
            this.currentState = state;
            isWakeWordAllowedInternal2 = isWakeWordAllowedInternal(state);
        }
        if (isWakeWordAllowedInternal != isWakeWordAllowedInternal2) {
            Objects.toString(voiceChatModeStateChangedEvent.getState());
            notifyStateChanged(isWakeWordAllowedInternal2);
        }
    }

    @Override // com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition
    public void teardown() {
        this.alexaClientEventBus.unregister(this);
    }
}
