package com.amazon.alexa.wakeword;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RecordingTracker {
    private final Precondition wakeWordPrecondition = new Precondition();

    @VisibleForTesting
    protected volatile State recordingState = State.IDLE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public enum State {
        IDLE,
        CREATED,
        ACTIVE
    }

    public Precondition getWakeWordPrecondition() {
        return this.wakeWordPrecondition;
    }

    public void onCapturerCreated() {
        this.recordingState = State.CREATED;
        this.wakeWordPrecondition.notifyStateChanged();
    }

    public void onCapturingFinished() {
        this.recordingState = State.IDLE;
        this.wakeWordPrecondition.notifyStateChanged();
    }

    public void onCapturingStarted() {
        this.recordingState = State.ACTIVE;
        this.wakeWordPrecondition.notifyStateChanged();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Precondition extends InternalWakeWordPrecondition {
        public Precondition() {
        }

        @Override // com.amazon.alexa.wakeword.precondition.WakeWordPrecondition
        public boolean isWakeWordAllowed() {
            return State.IDLE.equals(RecordingTracker.this.recordingState);
        }

        @Override // com.amazon.alexa.wakeword.precondition.BaseWakeWordPrecondition
        public void notifyStateChanged() {
            super.notifyStateChanged();
        }

        @Override // com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition
        public void teardown() {
        }
    }
}
