package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_EndpointListenerWrapper extends EndpointListener implements AlexaEndpointListener {
    private final AlexaEndpointListener alexaEndpointListener;

    public ApiType_EndpointListenerWrapper(AlexaEndpointListener alexaEndpointListener) {
        this.alexaEndpointListener = alexaEndpointListener;
    }

    @Override // com.amazon.alexa.api.EndpointListener, com.amazon.alexa.api.AlexaEndpointListener
    public boolean canHandle(AlexaDirective alexaDirective) {
        return this.alexaEndpointListener.canHandle(alexaDirective);
    }

    @Override // com.amazon.alexa.api.EndpointListener, com.amazon.alexa.api.AlexaEndpointListener
    public boolean onDirective(AlexaDirective alexaDirective) {
        return this.alexaEndpointListener.onDirective(alexaDirective);
    }
}
