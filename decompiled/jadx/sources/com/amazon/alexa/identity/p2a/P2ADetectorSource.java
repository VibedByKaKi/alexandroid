package com.amazon.alexa.identity.p2a;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public interface P2ADetectorSource {
    @Nullable
    String currentPersonId();

    @WorkerThread
    P2ADetectionResult evaluateP2ATransition(String str);

    @WorkerThread
    boolean isProfileAuthenticatedForceRefresh(String str);
}
