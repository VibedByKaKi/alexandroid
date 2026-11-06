package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_ArtifactDownloadListenerWrapper extends ArtifactDownloadListener implements AlexaArtifactDownloadListener {
    private final AlexaArtifactDownloadListener alexaArtifactDownloadListener;

    public ApiType_ArtifactDownloadListenerWrapper(AlexaArtifactDownloadListener alexaArtifactDownloadListener) {
        this.alexaArtifactDownloadListener = alexaArtifactDownloadListener;
    }

    @Override // com.amazon.alexa.api.ArtifactDownloadListener, com.amazon.alexa.api.AlexaArtifactDownloadListener
    public void onArtifactAlreadyUpToDate(java.util.Locale locale) {
        this.alexaArtifactDownloadListener.onArtifactAlreadyUpToDate(locale);
    }

    @Override // com.amazon.alexa.api.ArtifactDownloadListener, com.amazon.alexa.api.AlexaArtifactDownloadListener
    public void onArtifactDownloadFailure(ArtifactDownloadListenerFailure artifactDownloadListenerFailure) {
        this.alexaArtifactDownloadListener.onArtifactDownloadFailure(artifactDownloadListenerFailure);
    }

    @Override // com.amazon.alexa.api.ArtifactDownloadListener, com.amazon.alexa.api.AlexaArtifactDownloadListener
    public void onArtifactDownloadSuccess(java.util.Locale locale) {
        this.alexaArtifactDownloadListener.onArtifactDownloadSuccess(locale);
    }
}
