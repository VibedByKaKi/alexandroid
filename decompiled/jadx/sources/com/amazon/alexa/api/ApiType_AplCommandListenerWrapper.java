package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_AplCommandListenerWrapper extends AplCommandListener implements AlexaAplCommandListener {
    private final AlexaAplCommandListener alexaAplCommandListener;

    public ApiType_AplCommandListenerWrapper(AlexaAplCommandListener alexaAplCommandListener) {
        this.alexaAplCommandListener = alexaAplCommandListener;
    }

    @Override // com.amazon.alexa.api.AplCommandListener, com.amazon.alexa.api.AlexaAplCommandListener
    public void onAplCommandReceived(AlexaAplCommand alexaAplCommand) {
        this.alexaAplCommandListener.onAplCommandReceived(alexaAplCommand);
    }
}
