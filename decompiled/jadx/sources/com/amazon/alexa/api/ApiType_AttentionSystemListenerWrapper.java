package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_AttentionSystemListenerWrapper extends AttentionSystemListener implements AlexaAttentionSystemListener {
    private final AlexaAttentionSystemListener alexaAttentionSystemListener;

    public ApiType_AttentionSystemListenerWrapper(AlexaAttentionSystemListener alexaAttentionSystemListener) {
        this.alexaAttentionSystemListener = alexaAttentionSystemListener;
    }

    @Override // com.amazon.alexa.api.AttentionSystemListener, com.amazon.alexa.api.AlexaAttentionSystemListener
    public void onAlexaStateChanged(AlexaState alexaState, AlexaStateExtras alexaStateExtras) {
        this.alexaAttentionSystemListener.onAlexaStateChanged(alexaState, alexaStateExtras);
    }
}
