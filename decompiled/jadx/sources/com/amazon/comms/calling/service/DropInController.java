package com.amazon.comms.calling.service;

import com.amazon.comms.calling.service.Call;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface DropInController {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum UserPreference {
        NeverFrosted,
        AlwaysFrosted,
        Transition,
        AudioOnly
    }

    double getFrostedTransitionTime();

    double getTotalFrostTime();

    UserPreference getUserPreference();

    void initializeWithAcceptParams(Call.AcceptParams acceptParams);

    boolean shouldShowRemoteView(Call call);

    boolean shouldShowSelfView(Call call);

    void startDefrostTimer(Call call);
}
