package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_CaptionListenerWrapper extends CaptionListener implements AlexaCaptionListener {
    private final AlexaCaptionListener alexaCaptionListener;

    public ApiType_CaptionListenerWrapper(AlexaCaptionListener alexaCaptionListener) {
        this.alexaCaptionListener = alexaCaptionListener;
    }

    @Override // com.amazon.alexa.api.CaptionListener, com.amazon.alexa.api.AlexaCaptionListener
    public void onReceivedCaption(CaptionResponse captionResponse) {
        this.alexaCaptionListener.onReceivedCaption(captionResponse);
    }
}
