package com.amazon.alexa.elements.api;

import com.amazon.alexa.eventing.Event;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ReactReadinessService {
    InitializationPhase getCurrentPhase();

    boolean getIsReady();

    boolean isBridgelessEnabled();

    boolean isReadyToRender();

    Event<Boolean> onReadyChange();

    void registerListener(Runnable runnable);

    void runWhenReadyToRender(Runnable runnable);

    void setIsReady(boolean z);

    void setPhaseReady(InitializationPhase initializationPhase);
}
