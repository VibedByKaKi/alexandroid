package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.InternalAlexaState;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.AlexaStateChangedEvent;
import com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaStateWakeWordPrecondition extends InternalWakeWordPrecondition {
    private static final Set<InternalAlexaState> WAKE_WORD_BLOCKING_STATES = Collections.unmodifiableSet(EnumSet.of(InternalAlexaState.PREPARING_TO_LISTEN, InternalAlexaState.LISTENING, InternalAlexaState.THINKING, InternalAlexaState.REQUEST_PROCESSING, InternalAlexaState.PREPARING_TO_SPEAK));
    private final AlexaClientEventBus alexaClientEventBus;
    private final Object lock = new Object();
    private InternalAlexaState currentState = InternalAlexaState.UNKNOWN;

    @Inject
    public AlexaStateWakeWordPrecondition(AlexaClientEventBus alexaClientEventBus) {
        this.alexaClientEventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    private boolean isInBlockingState() {
        return WAKE_WORD_BLOCKING_STATES.contains(this.currentState);
    }

    @Override // com.amazon.alexa.wakeword.precondition.WakeWordPrecondition
    public boolean isWakeWordAllowed() {
        boolean z;
        synchronized (this.lock) {
            z = !isInBlockingState();
        }
        return z;
    }

    @Subscribe
    public void on(AlexaStateChangedEvent alexaStateChangedEvent) {
        boolean z;
        boolean z2;
        synchronized (this.lock) {
            try {
                if (alexaStateChangedEvent.getAlexaState() != this.currentState) {
                    this.currentState = alexaStateChangedEvent.getAlexaState();
                    z = isWakeWordAllowed();
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            notifyStateChanged(z);
        }
    }

    @Override // com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition
    public void teardown() {
        this.alexaClientEventBus.unregister(this);
    }
}
