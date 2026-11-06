package com.amazon.alexa.client.alexaservice.audio.audioplayer;

import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface MediaPlaybackAuthority {
    String getAlbum();

    Bitmap getAlbumArt();

    String getArtist();

    MediaSessionCompat.Token getMediaSessionToken();

    String getTitle();

    boolean isAlexaPlaying();

    boolean isAlexaPlayingContent();

    boolean isAnotherAppPlayingContent();

    boolean isAnyMusicActive();

    boolean isCurrentTrackPlaying();

    boolean isPlaying();

    void setCallback(MediaSessionCompat.Callback callback);

    void teardown();
}
