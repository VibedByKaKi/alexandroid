package com.amazon.alexa.client.alexaservice.audio.mediaplaybackcontroller;

import android.net.Uri;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.amazon.alexa.api.AlexaMediaPlaybackMetadata;
import com.amazon.alexa.api.AlexaMediaPlaybackState;
import com.amazon.alexa.api.AlexaPlaybackState;
import com.amazon.alexa.api.AlexaPlayerInfoState;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MediaPlaybackUtil {
    @NonNull
    public static AlexaMediaPlaybackMetadata createAlexaMediaMetadata(@NonNull String str, @NonNull String str2, @NonNull MediaMetadataCompat mediaMetadataCompat) {
        AlexaMediaPlaybackMetadata.Builder builder = AlexaMediaPlaybackMetadata.builder(str);
        builder.setMediaServiceProvider(str2);
        builder.setSongName(mediaMetadataCompat.getString("android.media.metadata.TITLE"));
        builder.setAlbumName(mediaMetadataCompat.getString("android.media.metadata.ALBUM"));
        builder.setArtistName(mediaMetadataCompat.getString("android.media.metadata.ARTIST"));
        builder.setDuration(mediaMetadataCompat.getLong("android.media.metadata.DURATION"));
        String string = mediaMetadataCompat.getString("android.media.metadata.ALBUM_ART_URI");
        if (!TextUtils.isEmpty(string)) {
            builder.setAlbumArtUri(Uri.parse(string));
        }
        String string2 = mediaMetadataCompat.getString("android.media.metadata.ART_URI");
        if (!TextUtils.isEmpty(string2)) {
            builder.setSecondaryArtUri(Uri.parse(string2));
        }
        return builder.build();
    }

    @Nullable
    public static AlexaMediaPlaybackState createAlexaMediaPlaybackState(@Nullable String str, @NonNull PlaybackStateCompat playbackStateCompat) {
        AlexaPlayerInfoState mapPlaybackState = mapPlaybackState(playbackStateCompat.getState());
        if (mapPlaybackState == null) {
            return null;
        }
        AlexaMediaPlaybackState.Builder builder = AlexaMediaPlaybackState.builder();
        if (!TextUtils.isEmpty(str)) {
            builder.setMediaItemIdentifier(str);
        }
        builder.setPlaybackActions(mapPlaybackActions(playbackStateCompat.getActions()));
        builder.setPlayerState(mapPlaybackState);
        builder.setCurrentPosition(playbackStateCompat.getPosition());
        builder.setLastPositionUpdateTime(playbackStateCompat.getLastPositionUpdateTime());
        builder.setBufferedPosition(playbackStateCompat.getBufferedPosition());
        return builder.build();
    }

    @NonNull
    public static AlexaPlaybackState mapPlaybackActions(long j) {
        return (j & 72) == 72 ? AlexaPlaybackState.STOPPABLE_AND_NAVIGABLE : AlexaPlaybackState.STOPPABLE;
    }

    @Nullable
    public static AlexaPlayerInfoState mapPlaybackState(int i) {
        if (i == 0) {
            return AlexaPlayerInfoState.IDLE;
        }
        if (i == 1) {
            return AlexaPlayerInfoState.DONE;
        }
        if (i == 2) {
            return AlexaPlayerInfoState.PAUSED;
        }
        if (i == 3) {
            return AlexaPlayerInfoState.PLAYING;
        }
        if (i == 6) {
            return AlexaPlayerInfoState.BUFFERING;
        }
        if (i != 7) {
            return null;
        }
        return AlexaPlayerInfoState.ERROR;
    }
}
