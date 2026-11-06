package com.amazon.alexa.client.alexaservice.audio.core;

import android.net.Uri;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AudioPlayerEventListener extends MediaSourceCallback {
    void onBuffering(PlayItem playItem);

    void onDrmLicenseKeyLoaded(boolean z);

    void onDrmLoadError(Exception exc);

    void onDrmManifestLoadError(Exception exc);

    void onDrmManifestLoaded(long j);

    @Override // com.amazon.alexa.client.alexaservice.audio.core.MediaSourceCallback
    void onDrmPlaybackInitiated(PlayItem playItem);

    void onPlaybackFailed(PlayItem playItem, long j, Exception exc);

    void onPlaybackFinished(PlayItem playItem);

    void onPlaybackNearlyFinished(PlayItem playItem);

    void onPlaybackPaused(PlayItem playItem);

    void onPlaybackPositionUpdated(PlayItem playItem, long j, long j2);

    void onPlaybackResumed(PlayItem playItem);

    void onPlaybackResuming(PlayItem playItem);

    void onPlaybackStarted(PlayItem playItem);

    void onPlaybackStarting(PlayItem playItem);

    void onPlaybackStopped(PlayItem playItem);

    void onStutterStarted(PlayItem playItem);

    void onStutterStopped(PlayItem playItem);

    @Override // com.amazon.alexa.client.alexaservice.audio.core.MediaSourceCallback
    default void onMediaSourceFromUnknownFormat(Uri uri) {
    }
}
