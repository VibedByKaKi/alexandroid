package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.playbacksession;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlaybackSessionIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PlaybackSessionPredicates {
    private boolean isTransitioningFromStateNone(@Nullable PlaybackStateCompat playbackStateCompat, @Nullable PlaybackStateCompat playbackStateCompat2) {
        return (playbackStateCompat == null || playbackStateCompat.getState() == 0) && !(playbackStateCompat2 == null || playbackStateCompat2.getState() == 0);
    }

    private boolean isTransitioningToStateNone(@Nullable PlaybackStateCompat playbackStateCompat, @Nullable PlaybackStateCompat playbackStateCompat2) {
        return !(playbackStateCompat == null || playbackStateCompat.getState() == 0) && (playbackStateCompat2 == null || playbackStateCompat2.getState() == 0);
    }

    public boolean shouldEndPlaybackSession(PlaybackSessionIdentifier playbackSessionIdentifier, PlaybackSessionIdentifier playbackSessionIdentifier2, @Nullable PlaybackStateCompat playbackStateCompat, @Nullable PlaybackStateCompat playbackStateCompat2) {
        if (PlaybackSessionIdentifier.NONE.equals(playbackSessionIdentifier)) {
            return false;
        }
        return isTransitioningToStateNone(playbackStateCompat, playbackStateCompat2) || playbackSessionIdentifier2 != playbackSessionIdentifier;
    }

    public boolean shouldStartPlaybackSession(PlaybackSessionIdentifier playbackSessionIdentifier, PlaybackSessionIdentifier playbackSessionIdentifier2, @Nullable PlaybackStateCompat playbackStateCompat, @Nullable PlaybackStateCompat playbackStateCompat2) {
        return isTransitioningFromStateNone(playbackStateCompat, playbackStateCompat2) || playbackSessionIdentifier2 != playbackSessionIdentifier;
    }
}
