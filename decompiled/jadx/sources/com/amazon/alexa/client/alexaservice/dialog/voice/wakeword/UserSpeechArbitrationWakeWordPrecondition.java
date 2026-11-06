package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UserSpeechArbitrationWakeWordPrecondition extends InternalWakeWordPrecondition {
    private final AtomicBoolean isWakeWordAllowed = new AtomicBoolean(true);

    @Override // com.amazon.alexa.wakeword.precondition.WakeWordPrecondition
    public boolean isWakeWordAllowed() {
        return this.isWakeWordAllowed.get();
    }

    public void updateArbitrationState(boolean z) {
        if (this.isWakeWordAllowed.getAndSet(z) != z) {
            notifyStateChanged();
        }
    }

    @Override // com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition
    public void teardown() {
    }
}
