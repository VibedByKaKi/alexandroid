package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface MetricsApi {
    void deregisterListener(@NonNull AlexaMetricsListener alexaMetricsListener);

    void registerListener(@NonNull AlexaMetricsListener alexaMetricsListener);

    void registerListener(@NonNull AlexaMetricsListener alexaMetricsListener, @NonNull AlexaMetricsFilter alexaMetricsFilter);

    void reportUiEvent(@NonNull AlexaResponseUiEvent alexaResponseUiEvent);

    void setAttributionTag(@NonNull String str);

    default void setConversationLoadSourceHistory(@NonNull ConversationLoadSourceHistory conversationLoadSourceHistory) {
    }
}
