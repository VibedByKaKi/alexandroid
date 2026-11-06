package com.amazon.leaderselection;

import android.content.ComponentName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class CandidateInformation {
    private final CandidateRegistration candidateRegistration;
    private final ComponentName componentName;

    public CandidateInformation(ComponentName componentName, CandidateRegistration candidateRegistration) {
        this.componentName = componentName;
        this.candidateRegistration = candidateRegistration;
    }

    public CandidateRegistration getCandidateRegistration() {
        return this.candidateRegistration;
    }

    public ComponentName getComponentName() {
        return this.componentName;
    }
}
