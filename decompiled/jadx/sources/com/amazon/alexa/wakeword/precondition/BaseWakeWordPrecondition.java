package com.amazon.alexa.wakeword.precondition;

import com.amazon.alexa.wakeword.precondition.WakeWordPrecondition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class BaseWakeWordPrecondition implements WakeWordPrecondition {
    private WakeWordPrecondition.ChangeListener changeListener;

    public void notifyStateChanged() {
        WakeWordPrecondition.ChangeListener changeListener = this.changeListener;
        if (changeListener != null) {
            changeListener.onPreconditionStateChanged(isWakeWordAllowed());
        }
    }

    @Override // com.amazon.alexa.wakeword.precondition.WakeWordPrecondition
    public void subscribe(WakeWordPrecondition.ChangeListener changeListener) {
        this.changeListener = changeListener;
    }

    @Override // com.amazon.alexa.wakeword.precondition.WakeWordPrecondition
    public void unsubscribe(WakeWordPrecondition.ChangeListener changeListener) {
        if (this.changeListener.equals(changeListener)) {
            this.changeListener = null;
        }
    }

    public void notifyStateChanged(boolean z) {
        WakeWordPrecondition.ChangeListener changeListener = this.changeListener;
        if (changeListener != null) {
            changeListener.onPreconditionStateChanged(z);
        }
    }
}
