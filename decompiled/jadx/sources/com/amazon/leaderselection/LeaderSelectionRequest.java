package com.amazon.leaderselection;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class LeaderSelectionRequest {
    private static final String TAG = "LeaderSelectionRequest";
    private Leader leader = Leader.UNKNOWN;
    private final String serviceFullyQualifiedName;
    private final CandidateConnection thisCandidateConnection;

    public LeaderSelectionRequest(String str, CandidateConnection candidateConnection) {
        this.serviceFullyQualifiedName = str;
        this.thisCandidateConnection = candidateConnection;
    }

    public Leader select() {
        try {
            try {
                LeaderSelectionServiceInterface leaderSelectionServiceInterface = this.thisCandidateConnection.get();
                if (leaderSelectionServiceInterface != null) {
                    Leader select = leaderSelectionServiceInterface.select(this.serviceFullyQualifiedName);
                    this.leader = select;
                    return select;
                }
            } catch (RemoteException unused) {
                Log.e(TAG, "Failed to select leader");
            }
            return Leader.UNKNOWN;
        } finally {
            this.thisCandidateConnection.disconnect();
        }
    }
}
