package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_EndpointWrapper extends Endpoint implements AlexaEndpoint {
    private final AlexaEndpoint alexaEndpoint;

    public ApiType_EndpointWrapper(AlexaEndpoint alexaEndpoint) {
        this.alexaEndpoint = alexaEndpoint;
    }

    @Override // com.amazon.alexa.api.AlexaEndpoint
    public AlexaEndpointListener getAlexaEndpointListener() {
        return this.alexaEndpoint.getAlexaEndpointListener();
    }

    @Override // com.amazon.alexa.api.Endpoint
    public EndpointListener getAlexaEndpointListenerMethod() {
        return null;
    }

    @Override // com.amazon.alexa.api.Endpoint, com.amazon.alexa.api.AlexaEndpoint
    public AlexaEndpointConfiguration getConfiguration() {
        return this.alexaEndpoint.getConfiguration();
    }
}
