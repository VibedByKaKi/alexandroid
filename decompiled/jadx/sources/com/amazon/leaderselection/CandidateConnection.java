package com.amazon.leaderselection;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.util.Log;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.leaderselection.LeaderSelectionServiceInterface;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class CandidateConnection implements ServiceConnection {
    private static final long CANDIDATE_CONNECTION_TIMEOUT_MS = 1000;
    private static final String TAG = "CandidateConnection";
    private volatile boolean boundToCandidate;
    private final ComponentName candidateComponent;
    private ConditionVariable connectingVariable = new ConditionVariable();
    private final Context context;
    private LeaderSelectionServiceInterface leaderSelectionServiceInterface;

    public CandidateConnection(Context context, ComponentName componentName) {
        this.context = context;
        this.candidateComponent = componentName;
    }

    private void connect() {
        Intent intent = new Intent();
        intent.setComponent(this.candidateComponent);
        if (this.context.bindService(intent, this, 1)) {
            return;
        }
        Log.e(TAG, "Error binding to leader selection service");
        this.context.unbindService(this);
        this.boundToCandidate = false;
        this.connectingVariable.open();
    }

    public void disconnect() {
        this.connectingVariable.block(1000L);
        if (this.boundToCandidate) {
            this.boundToCandidate = false;
            this.leaderSelectionServiceInterface = null;
            this.context.unbindService(this);
            this.connectingVariable.close();
        }
    }

    @Nullable
    public LeaderSelectionServiceInterface get() {
        connect();
        this.connectingVariable.block(1000L);
        return this.leaderSelectionServiceInterface;
    }

    public ComponentName getCandidateComponent() {
        return this.candidateComponent;
    }

    public boolean isConnected() {
        return this.boundToCandidate;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (!this.candidateComponent.equals(componentName)) {
            Log.e(TAG, "Connected to an unexpected service: " + componentName);
            return;
        }
        this.context.getPackageName();
        Objects.toString(componentName);
        this.leaderSelectionServiceInterface = LeaderSelectionServiceInterface.Stub.asInterface(iBinder);
        this.boundToCandidate = true;
        this.connectingVariable.open();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Objects.toString(componentName);
        this.boundToCandidate = false;
        this.leaderSelectionServiceInterface = null;
        this.connectingVariable.open();
    }
}
