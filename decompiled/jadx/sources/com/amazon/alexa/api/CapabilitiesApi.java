package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface CapabilitiesApi {
    void cacheContexts(@NonNull Set<AlexaContext> set);

    void clearContextCache();

    void clearContextCache(@NonNull Set<String> set);

    void deregisterContextsProvider(@NonNull AlexaContextsProvider alexaContextsProvider);

    void registerContextsProvider(@NonNull AlexaContextsProvider alexaContextsProvider);

    void sendEvent(@NonNull AlexaEvent alexaEvent);

    void sendEvent(@NonNull AlexaEvent alexaEvent, boolean z);

    void sendEvent(@NonNull AlexaEvent alexaEvent, boolean z, @Nullable AlexaApiCallbacks alexaApiCallbacks);

    void sendSynchronizeStateEventWithGeolocation();

    void setContextCachingEnabled(@NonNull Set<String> set, boolean z);

    void setContextCachingEnabled(boolean z);
}
