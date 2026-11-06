package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface ConversationsApi {
    @Deprecated
    void deleteConversations(@NonNull List<String> list);

    void deleteConversations(@NonNull List<String> list, @NonNull AlexaApiCallbacks alexaApiCallbacks);

    void deleteFragments(@NonNull String str, @NonNull List<String> list);

    void deregisterListener(@NonNull AlexaConversationsListener alexaConversationsListener);

    void deregisterListener(@NonNull AlexaFragmentsListener alexaFragmentsListener);

    @Deprecated
    void getFragments(@NonNull AlexaFragmentsMetadata alexaFragmentsMetadata);

    void getFragments(@NonNull AlexaFragmentsMetadata alexaFragmentsMetadata, @NonNull AlexaApiCallbacks alexaApiCallbacks);

    void getItemFragments(@NonNull AlexaItemFragmentsMetadata alexaItemFragmentsMetadata, @NonNull AlexaApiCallbacks alexaApiCallbacks);

    void registerListener(@NonNull AlexaConversationsListener alexaConversationsListener);

    void registerListener(@NonNull AlexaFragmentsListener alexaFragmentsListener);

    void sendEvent(@NonNull String str, @NonNull ConversationEventExtras conversationEventExtras, @NonNull String str2);

    @Deprecated
    void updateConversations(@NonNull AlexaConversationExtras alexaConversationExtras);

    void updateConversations(@NonNull AlexaConversationExtras alexaConversationExtras, @NonNull AlexaApiCallbacks alexaApiCallbacks);

    @Deprecated
    void updateEntitlementStatus(boolean z);

    void updateEntitlementStatus(boolean z, @Nullable String str);

    default void updateEntitlementStatus(boolean z, @Nullable String str, @Nullable List<String> list) {
        updateEntitlementStatus(z, str);
    }
}
