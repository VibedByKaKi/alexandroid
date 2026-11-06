package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_NaturalTurnSessionWrapper extends NaturalTurnSession implements AlexaNaturalTurnSession {
    private final AlexaNaturalTurnSession alexaNaturalTurnSession;

    public ApiType_NaturalTurnSessionWrapper(AlexaNaturalTurnSession alexaNaturalTurnSession) {
        this.alexaNaturalTurnSession = alexaNaturalTurnSession;
    }

    @Override // com.amazon.alexa.api.NaturalTurnSession, com.amazon.alexa.api.AlexaNaturalTurnSession
    public void onError(NaturalTurnSessionError naturalTurnSessionError) {
        this.alexaNaturalTurnSession.onError(naturalTurnSessionError);
    }

    @Override // com.amazon.alexa.api.NaturalTurnSession, com.amazon.alexa.api.AlexaNaturalTurnSession
    public void onStateChanged(NaturalTurnSessionState naturalTurnSessionState) {
        this.alexaNaturalTurnSession.onStateChanged(naturalTurnSessionState);
    }
}
