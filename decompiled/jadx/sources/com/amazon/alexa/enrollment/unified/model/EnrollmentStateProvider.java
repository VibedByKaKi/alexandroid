package com.amazon.alexa.enrollment.unified.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.wakeword.WakeWordData;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentStateProvider {
    private static final int DEFAULT_NUM_WAKE_WORD_PHRASES = 4;
    private WakeWordData mCurrentWakeWordData;
    private int mNumUtterances = 4;

    @Nullable
    public WakeWordData getCurrentWakeWordData() {
        return this.mCurrentWakeWordData;
    }

    public int getNumUtterances() {
        return this.mNumUtterances;
    }

    public void setCurrentWakeWordData(@Nullable WakeWordData wakeWordData) {
        this.mCurrentWakeWordData = wakeWordData;
    }

    public void setNumUtterances(int i) {
        this.mNumUtterances = i;
    }
}
