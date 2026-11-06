package com.amazon.leaderselection;

import android.content.ComponentName;
import android.content.Context;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class CandidateConnectionCache {
    private final Map<ComponentName, CandidateConnection> cachedConnections = new HashMap();

    private boolean shouldCreate(Context context, ComponentName componentName) {
        return (context == null || componentName == null || componentName.equals(ComponentNameFactory.UNKNOWN_COMPONENT_NAME) || context.getPackageName().equals(componentName.getPackageName())) ? false : true;
    }

    @Nullable
    public synchronized CandidateConnection get(Context context, ComponentName componentName) {
        if (!shouldCreate(context, componentName)) {
            return null;
        }
        CandidateConnection candidateConnection = this.cachedConnections.get(componentName);
        if (candidateConnection == null) {
            candidateConnection = new CandidateConnection(context, componentName);
            this.cachedConnections.put(componentName, candidateConnection);
        }
        return candidateConnection;
    }

    public synchronized void remove(CandidateConnection candidateConnection) {
        this.cachedConnections.remove(candidateConnection.getCandidateComponent());
    }

    public synchronized void teardown() {
        try {
            for (CandidateConnection candidateConnection : this.cachedConnections.values()) {
                if (candidateConnection.isConnected()) {
                    candidateConnection.disconnect();
                }
            }
            this.cachedConnections.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
