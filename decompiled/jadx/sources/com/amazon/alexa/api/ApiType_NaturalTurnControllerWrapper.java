package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_NaturalTurnControllerWrapper extends NaturalTurnController implements AlexaNaturalTurnController {
    private final AlexaNaturalTurnController alexaNaturalTurnController;

    public ApiType_NaturalTurnControllerWrapper(AlexaNaturalTurnController alexaNaturalTurnController) {
        this.alexaNaturalTurnController = alexaNaturalTurnController;
    }

    @Override // com.amazon.alexa.api.NaturalTurnController, com.amazon.alexa.api.AlexaNaturalTurnController
    public NaturalTurnControllerConfiguration getConfiguration() {
        return this.alexaNaturalTurnController.getConfiguration();
    }

    @Override // com.amazon.alexa.api.NaturalTurnController, com.amazon.alexa.api.AlexaNaturalTurnController
    public NaturalTurnSessionState getState() {
        return this.alexaNaturalTurnController.getState();
    }

    @Override // com.amazon.alexa.api.AlexaNaturalTurnController
    public void muteSession(AlexaNaturalTurnSession alexaNaturalTurnSession) {
        this.alexaNaturalTurnController.muteSession(alexaNaturalTurnSession);
    }

    @Override // com.amazon.alexa.api.NaturalTurnController, com.amazon.alexa.api.AlexaNaturalTurnController
    public void onSessionDenied(NaturalTurnSessionDeniedReason naturalTurnSessionDeniedReason) {
        this.alexaNaturalTurnController.onSessionDenied(naturalTurnSessionDeniedReason);
    }

    @Override // com.amazon.alexa.api.AlexaNaturalTurnController
    public void startSession(AlexaNaturalTurnSession alexaNaturalTurnSession) {
        this.alexaNaturalTurnController.startSession(alexaNaturalTurnSession);
    }

    @Override // com.amazon.alexa.api.AlexaNaturalTurnController
    public void stopSession(AlexaNaturalTurnSession alexaNaturalTurnSession) {
        this.alexaNaturalTurnController.stopSession(alexaNaturalTurnSession);
    }

    @Override // com.amazon.alexa.api.AlexaNaturalTurnController
    public void unmuteSession(AlexaNaturalTurnSession alexaNaturalTurnSession) {
        this.alexaNaturalTurnController.unmuteSession(alexaNaturalTurnSession);
    }

    @Override // com.amazon.alexa.api.NaturalTurnController
    public void muteSession(NaturalTurnSession naturalTurnSession) {
    }

    @Override // com.amazon.alexa.api.NaturalTurnController
    public void startSession(NaturalTurnSession naturalTurnSession) {
    }

    @Override // com.amazon.alexa.api.NaturalTurnController
    public void stopSession(NaturalTurnSession naturalTurnSession) {
    }

    @Override // com.amazon.alexa.api.NaturalTurnController
    public void unmuteSession(NaturalTurnSession naturalTurnSession) {
    }
}
