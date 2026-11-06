package com.amazon.apl.player.neoplayer;

import android.media.AudioAttributes;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ITrackPlayer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onPlayerError(Exception exc);

        void onPlayerStateChanged(NeoPlayerState neoPlayerState);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum NeoPlayerState {
        STATE_DEFAULT,
        STATE_IDLE,
        STATE_PREPARING,
        STATE_BUFFERING,
        STATE_READY,
        STATE_ENDED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        STATE_STOPPED,
        STATE_CONFIGURED,
        STATE_RUNNING,
        STATE_RELEASED
    }

    long getCurrentPosition();

    void loadStream(InputStream inputStream) throws IOException, TimeoutException;

    void play() throws TimeoutException;

    void release();

    void setAttributes(AudioAttributes audioAttributes);

    void setListener(Listener listener);

    void stop() throws TimeoutException;
}
