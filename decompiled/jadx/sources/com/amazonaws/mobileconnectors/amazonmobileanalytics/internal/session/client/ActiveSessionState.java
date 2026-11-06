package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public final class ActiveSessionState extends SessionClientState {
    private static final String TAG = "ActiveSessoinState";

    public ActiveSessionState(DefaultSessionClient defaultSessionClient) {
        super(defaultSessionClient);
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.SessionClientState
    public void pause() {
        super.executePause();
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.SessionClientState
    public void resume() {
        Log.i(TAG, "Session Resume Failed: Session is already running.");
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.SessionClientState
    public void start() {
        if (System.currentTimeMillis() - this.client.session.getStartTime() <= this.client.getRestartDelay()) {
            Log.i(TAG, "Session Start Failed: Previous session was started too recently");
        } else {
            super.executeStop();
            super.executeStart();
        }
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.SessionClientState
    public void stop() {
        super.executeStop();
    }
}
