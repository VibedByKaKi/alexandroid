package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.Errors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PlayerErrorInterpreter {
    public PlayerError interpret(PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null || playbackStateCompat.getState() != 7) {
            return null;
        }
        return Errors.PlayerErrors.forErrorCode(playbackStateCompat.getErrorCode());
    }
}
