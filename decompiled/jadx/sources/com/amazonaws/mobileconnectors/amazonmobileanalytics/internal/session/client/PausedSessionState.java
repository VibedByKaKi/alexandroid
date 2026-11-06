package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class PausedSessionState extends SessionClientState {
    private static final String TAG = "PausedSessionState";

    public PausedSessionState(DefaultSessionClient defaultSessionClient) {
        super(defaultSessionClient);
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.SessionClientState
    public void pause() {
        Log.i(TAG, "Session Pause Failed: Session is already paused.");
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.SessionClientState
    public void resume() {
        if (System.currentTimeMillis() - this.client.session.getStopTime().longValue() < this.client.getResumeDelay()) {
            super.executeResume();
        } else {
            Log.i(TAG, "Session has expired. Starting a fresh one...");
            start();
        }
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.SessionClientState
    public void start() {
        super.executeStop();
        super.executeStart();
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.SessionClientState
    public void stop() {
        super.executeStop();
    }
}
