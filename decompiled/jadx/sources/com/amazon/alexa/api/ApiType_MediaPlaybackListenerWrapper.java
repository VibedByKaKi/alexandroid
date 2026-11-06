package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_MediaPlaybackListenerWrapper extends MediaPlaybackListener implements AlexaMediaPlaybackListener {
    private final AlexaMediaPlaybackListener alexaMediaPlaybackListener;

    public ApiType_MediaPlaybackListenerWrapper(AlexaMediaPlaybackListener alexaMediaPlaybackListener) {
        this.alexaMediaPlaybackListener = alexaMediaPlaybackListener;
    }

    @Override // com.amazon.alexa.api.MediaPlaybackListener, com.amazon.alexa.api.AlexaMediaPlaybackListener
    public void onMediaMetadata(AlexaMediaPlaybackMetadata alexaMediaPlaybackMetadata) {
        this.alexaMediaPlaybackListener.onMediaMetadata(alexaMediaPlaybackMetadata);
    }

    @Override // com.amazon.alexa.api.MediaPlaybackListener, com.amazon.alexa.api.AlexaMediaPlaybackListener
    public void onMediaPlaybackStateUpdate(AlexaMediaPlaybackState alexaMediaPlaybackState) {
        this.alexaMediaPlaybackListener.onMediaPlaybackStateUpdate(alexaMediaPlaybackState);
    }
}
