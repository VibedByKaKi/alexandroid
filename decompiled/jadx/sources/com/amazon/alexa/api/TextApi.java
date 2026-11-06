package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface TextApi {
    void deregisterListener(@NonNull AlexaCaptionListener alexaCaptionListener);

    void deregisterListener(@NonNull AlexaExpectTextListener alexaExpectTextListener);

    void deregisterListener(@NonNull AlexaLivePreviewListener alexaLivePreviewListener);

    void deregisterListener(@NonNull AlexaPlaybackSyncedCaptionListener alexaPlaybackSyncedCaptionListener);

    void deregisterListener(@NonNull AlexaTextResponseListener alexaTextResponseListener);

    void registerListener(@NonNull AlexaCaptionListener alexaCaptionListener);

    void registerListener(@NonNull AlexaExpectTextListener alexaExpectTextListener);

    void registerListener(@NonNull AlexaLivePreviewListener alexaLivePreviewListener);

    void registerListener(@NonNull AlexaPlaybackSyncedCaptionListener alexaPlaybackSyncedCaptionListener);

    void registerListener(@NonNull AlexaTextResponseListener alexaTextResponseListener);

    void sendMessage(@NonNull String str, @NonNull TextAlexaDialogExtras textAlexaDialogExtras);
}
