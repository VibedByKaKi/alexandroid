package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_PlaybackSyncedCaptionListenerWrapper extends PlaybackSyncedCaptionListener implements AlexaPlaybackSyncedCaptionListener {
    private final AlexaPlaybackSyncedCaptionListener alexaPlaybackSyncedCaptionListener;

    public ApiType_PlaybackSyncedCaptionListenerWrapper(AlexaPlaybackSyncedCaptionListener alexaPlaybackSyncedCaptionListener) {
        this.alexaPlaybackSyncedCaptionListener = alexaPlaybackSyncedCaptionListener;
    }

    @Override // com.amazon.alexa.api.PlaybackSyncedCaptionListener, com.amazon.alexa.api.AlexaPlaybackSyncedCaptionListener
    public void onReceivedCaption(CaptionResponse captionResponse) {
        this.alexaPlaybackSyncedCaptionListener.onReceivedCaption(captionResponse);
    }
}
