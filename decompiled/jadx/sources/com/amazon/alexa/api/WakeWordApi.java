package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface WakeWordApi {
    void deregisterWakeWordListener(@NonNull AlexaWakeWordListener alexaWakeWordListener);

    @Deprecated
    void disable();

    @Deprecated
    void disable(@NonNull String str);

    @Deprecated
    void enable();

    @Deprecated
    void enable(@NonNull AlexaDialogExtras alexaDialogExtras);

    @Deprecated
    void enable(@NonNull String str);

    @Deprecated
    void enable(@NonNull String str, @NonNull AlexaDialogExtras alexaDialogExtras);

    void registerWakeWordListener(@NonNull AlexaWakeWordListener alexaWakeWordListener);

    void setWakeWords(@NonNull List<String> list);

    void setWakeWords(@NonNull List<String> list, @NonNull AlexaApiCallbacks alexaApiCallbacks);

    void startListening();

    void startListening(@NonNull AlexaApiCallbacks alexaApiCallbacks);

    void startListening(@NonNull AlexaDialogExtras alexaDialogExtras);

    void startListening(@NonNull AlexaDialogExtras alexaDialogExtras, @NonNull AlexaApiCallbacks alexaApiCallbacks);

    void stopListening();
}
