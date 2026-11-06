package com.amazon.alexa.wakeword;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.utils.validation.Preconditions;
import com.amazon.alexa.wakeword.precondition.WakeWordPrecondition;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WakeWordArbitration {
    private static final String TAG = "WakeWordArbitration";
    private final Set<WakeWordPrecondition> preconditions = new HashSet();
    private final Set<ArbitrationListener> arbitrationListeners = new HashSet();
    private final PreconditionChangesListener preconditionChangesListener = new PreconditionChangesListener(this, 0);
    private final Object lock = new Object();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ArbitrationListener {
        void startDetectingWakeWord();

        void stopDetectingWakeWord();
    }

    private void clearPreconditions() {
        Iterator<WakeWordPrecondition> it2 = this.preconditions.iterator();
        while (it2.hasNext()) {
            it2.next().unsubscribe(this.preconditionChangesListener);
        }
        this.preconditions.clear();
    }

    private boolean isWakeWordDetectionAllowed() {
        if (this.preconditions.isEmpty()) {
            return false;
        }
        for (WakeWordPrecondition wakeWordPrecondition : this.preconditions) {
            if (!wakeWordPrecondition.isWakeWordAllowed()) {
                Log.i(TAG, "precondition: " + wakeWordPrecondition + " is not met");
                return false;
            }
        }
        return true;
    }

    public void addArbitrationListener(ArbitrationListener arbitrationListener) {
        Preconditions.notNull(arbitrationListener, "arbitration listener is null");
        synchronized (this.lock) {
            this.arbitrationListeners.add(arbitrationListener);
        }
    }

    public void addPrecondition(WakeWordPrecondition wakeWordPrecondition, boolean z) {
        Preconditions.notNull(wakeWordPrecondition, "precondition is null");
        Log.i(TAG, "add new wake word precondition: " + wakeWordPrecondition);
        synchronized (this.lock) {
            try {
                this.preconditions.add(wakeWordPrecondition);
                wakeWordPrecondition.subscribe(this.preconditionChangesListener);
                if (z) {
                    updateWakeWordDetectionState();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addPreconditions(WakeWordPrecondition... wakeWordPreconditionArr) {
        synchronized (this.lock) {
            try {
                for (WakeWordPrecondition wakeWordPrecondition : wakeWordPreconditionArr) {
                    addPrecondition(wakeWordPrecondition, false);
                }
                updateWakeWordDetectionState();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeArbitrationListener(ArbitrationListener arbitrationListener) {
        synchronized (this.lock) {
            this.arbitrationListeners.remove(arbitrationListener);
        }
    }

    public void removePreconditions(WakeWordPrecondition... wakeWordPreconditionArr) {
        synchronized (this.lock) {
            try {
                for (WakeWordPrecondition wakeWordPrecondition : wakeWordPreconditionArr) {
                    if (this.preconditions.contains(wakeWordPrecondition)) {
                        Log.i(TAG, "remove wake word precondition: " + wakeWordPrecondition);
                        this.preconditions.remove(wakeWordPrecondition);
                        wakeWordPrecondition.unsubscribe(this.preconditionChangesListener);
                    }
                }
                updateWakeWordDetectionState();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void teardown() {
        synchronized (this.lock) {
            clearPreconditions();
            this.arbitrationListeners.clear();
        }
    }

    @VisibleForTesting
    public void updateWakeWordDetectionState() {
        String str = TAG;
        Log.i(str, "updateWakeWordDetectionState");
        boolean isWakeWordDetectionAllowed = isWakeWordDetectionAllowed();
        Automotive$$ExternalSyntheticOutline0.m8396m("shouldBeDetecting: ", str, isWakeWordDetectionAllowed);
        for (ArbitrationListener arbitrationListener : this.arbitrationListeners) {
            if (isWakeWordDetectionAllowed) {
                arbitrationListener.startDetectingWakeWord();
            } else {
                arbitrationListener.stopDetectingWakeWord();
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class PreconditionChangesListener implements WakeWordPrecondition.ChangeListener {
        private PreconditionChangesListener() {
        }

        @Override // com.amazon.alexa.wakeword.precondition.WakeWordPrecondition.ChangeListener
        public void onPreconditionStateChanged(boolean z) {
            Log.i(WakeWordArbitration.TAG, "precondition state changed");
            synchronized (WakeWordArbitration.this.lock) {
                WakeWordArbitration.this.updateWakeWordDetectionState();
            }
        }

        public /* synthetic */ PreconditionChangesListener(WakeWordArbitration wakeWordArbitration, int i) {
            this();
        }
    }
}
