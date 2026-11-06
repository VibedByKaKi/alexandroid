package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface EndpointsApi {
    void deregister(@NonNull AlexaEndpoint alexaEndpoint);

    void deregister(@NonNull AlexaEndpointsListener alexaEndpointsListener);

    void register(@NonNull AlexaEndpoint alexaEndpoint, @NonNull AlexaApiCallbacks alexaApiCallbacks);

    void register(@NonNull AlexaEndpointsListener alexaEndpointsListener);
}
