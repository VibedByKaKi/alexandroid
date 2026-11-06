package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface CardsApi {
    void deregisterListener(@NonNull AlexaAplCommandListener alexaAplCommandListener);

    void deregisterListener(@NonNull AlexaCardListener alexaCardListener);

    void deregisterListener(@NonNull AlexaPlayerInfoCardListener alexaPlayerInfoCardListener);

    void registerListener(@NonNull AlexaAplCommandListener alexaAplCommandListener);

    void registerListener(@NonNull AlexaCardListener alexaCardListener);

    void registerListener(@NonNull AlexaPlayerInfoCardListener alexaPlayerInfoCardListener);

    void reportAplState(@NonNull AplState aplState);
}
