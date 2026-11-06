package com.amazon.alexa.wakeword.precondition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface WakeWordPrecondition {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ChangeListener {
        void onPreconditionStateChanged(boolean z);
    }

    boolean isWakeWordAllowed();

    void subscribe(ChangeListener changeListener);

    void unsubscribe(ChangeListener changeListener);
}
