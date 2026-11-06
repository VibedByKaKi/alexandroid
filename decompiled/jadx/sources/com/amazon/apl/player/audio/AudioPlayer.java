package com.amazon.apl.player.audio;

import java.io.InputStream;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AudioPlayer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class AudioPlayerListener {
        public abstract void onPlayerError(Exception exc);

        public abstract void onPlayerStateChanged(boolean z, AudioPlayerState audioPlayerState);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioPlayerState {
        STATE_DEFAULT,
        STATE_IDLE,
        STATE_PREPARING,
        STATE_BUFFERING,
        STATE_READY,
        STATE_ENDED
    }

    long getCurrentPosition();

    void play();

    void prepare(InputStream inputStream);

    void release();

    void removeListener();

    void setListener(AudioPlayerListener audioPlayerListener);

    void stop() throws TimeoutException;
}
