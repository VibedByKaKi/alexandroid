package com.amazon.dee.app.ui.web;

import android.content.Context;
import android.media.MediaPlayer;
import androidx.annotation.NonNull;
import com.amazon.dee.app.core.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class JavaScriptPlayer {
    Context context;
    MediaPlayer mediaPlayer;
    MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() { // from class: com.amazon.dee.app.ui.web.JavaScriptPlayer$$ExternalSyntheticLambda0
        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            JavaScriptPlayer.this.lambda$new$0(mediaPlayer);
        }
    };
    MediaPlayer.OnErrorListener onErrorListener = new MediaPlayer.OnErrorListener() { // from class: com.amazon.dee.app.ui.web.JavaScriptPlayer$$ExternalSyntheticLambda1
        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            boolean lambda$new$1;
            lambda$new$1 = JavaScriptPlayer.this.lambda$new$1(mediaPlayer, i, i2);
            return lambda$new$1;
        }
    };
    LinkedList<PlayerListener> playerListeners = new LinkedList<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PlayerListener {
        void onComplete();

        void onError(@NonNull String str);
    }

    public JavaScriptPlayer(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(MediaPlayer mediaPlayer) {
        Iterator<PlayerListener> it2 = this.playerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onComplete();
            it2.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$1(MediaPlayer mediaPlayer, int i, int i2) {
        String string;
        if (i != 100) {
            Context context = this.context;
            string = i != 200 ? context.getString(R.string.media_player_unknown_error) : context.getString(R.string.media_player_progressive_playback_error);
        } else {
            string = this.context.getString(R.string.media_player_server_died_error);
        }
        Iterator<PlayerListener> it2 = this.playerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onError(string);
        }
        return false;
    }

    public void addPlayerListener(@NonNull PlayerListener playerListener) {
        this.playerListeners.add(playerListener);
    }

    public void play(@NonNull String str) throws IOException {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.mediaPlayer = mediaPlayer2;
            mediaPlayer2.setOnCompletionListener(this.onCompletionListener);
            this.mediaPlayer.setOnErrorListener(this.onErrorListener);
        } else {
            mediaPlayer.reset();
        }
        this.mediaPlayer.setAudioStreamType(3);
        this.mediaPlayer.setDataSource(str);
        this.mediaPlayer.prepare();
        this.mediaPlayer.start();
    }

    public void release() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    public void removePlayerListener(@NonNull PlayerListener playerListener) {
        this.playerListeners.remove(playerListener);
    }
}
