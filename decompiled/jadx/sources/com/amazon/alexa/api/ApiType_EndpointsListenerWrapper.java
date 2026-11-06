package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_EndpointsListenerWrapper extends EndpointsListener implements AlexaEndpointsListener {
    private final AlexaEndpointsListener alexaEndpointsListener;

    public ApiType_EndpointsListenerWrapper(AlexaEndpointsListener alexaEndpointsListener) {
        this.alexaEndpointsListener = alexaEndpointsListener;
    }

    @Override // com.amazon.alexa.api.EndpointsListener, com.amazon.alexa.api.AlexaEndpointsListener
    public void onEndpointsUpdated(AlexaEndpointConfigurationList alexaEndpointConfigurationList) {
        this.alexaEndpointsListener.onEndpointsUpdated(alexaEndpointConfigurationList);
    }
}
