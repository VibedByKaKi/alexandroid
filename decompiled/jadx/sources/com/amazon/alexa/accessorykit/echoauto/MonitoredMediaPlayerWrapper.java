package com.amazon.alexa.accessorykit.echoauto;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.dee.app.ui.video.VideoActivity$$ExternalSyntheticLambda0;
import com.amazon.deecomms.media.audio.AudioPlayer$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class MonitoredMediaPlayerWrapper {
    private static final int MAX_LOOPS = 20;
    private static final String TAG = "MonitoredMediaPlayerWrapper";
    private MediaPlayer.OnCompletionListener handleMediaPlayerCompletion;
    private MediaPlayer.OnErrorListener handleMediaPlayerError;
    private final MediaPlayer mediaPlayer;
    private final MediaSessionCompat mediaSession;
    private Thread monitorThread;
    private final MediaPlayerMonitorRunnable monitorThreadRunnable;
    private PlaybackProgressCallbackInterface playbackProgressCallback;
    private final PlaybackStateCompat.Builder playbackStateBuilder;
    private int playbackLoopCount = 0;
    public boolean shouldLoopPlayback = false;
    private volatile boolean isMediaPlayerStopRequested = false;
    private volatile boolean isPrepared = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PlaybackProgressCallbackInterface {
        void onPlaybackPercentageChange(Double d);

        void onPlaybackStopped();
    }

    public MonitoredMediaPlayerWrapper(Context context, int i, PlaybackProgressCallbackInterface playbackProgressCallbackInterface) {
        int i2 = 2;
        this.handleMediaPlayerCompletion = new VideoActivity$$ExternalSyntheticLambda0(this, i2);
        this.handleMediaPlayerError = new AudioPlayer$$ExternalSyntheticLambda0(this, i2);
        MediaPlayer create = MediaPlayer.create(context, i);
        this.mediaPlayer = create;
        create.setOnCompletionListener(this.handleMediaPlayerCompletion);
        create.setOnErrorListener(this.handleMediaPlayerError);
        this.mediaSession = new MediaSessionCompat(context, getClass().getName());
        this.playbackStateBuilder = new PlaybackStateCompat.Builder();
        this.playbackProgressCallback = playbackProgressCallbackInterface;
        this.monitorThreadRunnable = new MediaPlayerMonitorRunnable(this, 0);
        onPrepared();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(MediaPlayer mediaPlayer) {
        int i = this.playbackLoopCount + 1;
        this.playbackLoopCount = i;
        if (i >= 20) {
            stopMonitoring();
            onPlaybackStopped();
            triggerPlaybackStoppedCallback();
        } else {
            if (!this.shouldLoopPlayback || this.isMediaPlayerStopRequested) {
                return;
            }
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$1(MediaPlayer mediaPlayer, int i, int i2) {
        stop();
        triggerPlaybackStoppedCallback();
        return false;
    }

    private void onPlaybackStopped() {
        this.mediaSession.setActive(false);
        this.mediaSession.release();
    }

    private void onPlaybackWillStart() {
        this.playbackStateBuilder.setState(3, this.mediaPlayer.getCurrentPosition(), 0.0f);
        this.playbackStateBuilder.setActions(4L);
        if (!this.mediaSession.isActive()) {
            this.mediaSession.setActive(true);
        }
        this.mediaSession.setPlaybackState(this.playbackStateBuilder.build());
    }

    private void onPrepared() {
        this.isPrepared = true;
        play();
    }

    private void stopMonitoring() {
        if (this.monitorThread != null) {
            this.monitorThreadRunnable.stop();
            this.monitorThread = null;
        }
    }

    private void triggerPlaybackStoppedCallback() {
        PlaybackProgressCallbackInterface playbackProgressCallbackInterface = this.playbackProgressCallback;
        if (playbackProgressCallbackInterface != null) {
            playbackProgressCallbackInterface.onPlaybackStopped();
        }
    }

    public double getDuration() {
        if (this.mediaPlayer != null) {
            return r2.getDuration();
        }
        return 0.0d;
    }

    public void pause() {
        if (this.mediaPlayer == null || !this.isPrepared) {
            return;
        }
        this.mediaPlayer.pause();
        this.isMediaPlayerStopRequested = true;
    }

    public void play() {
        this.isMediaPlayerStopRequested = false;
        onPlaybackWillStart();
        if (this.mediaPlayer != null && this.isPrepared) {
            this.mediaPlayer.start();
        }
        if (this.monitorThread == null) {
            Thread thread = new Thread(this.monitorThreadRunnable);
            this.monitorThread = thread;
            thread.setName("MediaPlayerMonitorRunnable");
            this.monitorThread.start();
        }
    }

    public void release() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }

    public void seekTo(int i) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i);
        }
    }

    public void stop() {
        this.isMediaPlayerStopRequested = true;
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                this.mediaPlayer.stop();
            }
        } catch (IllegalStateException e) {
            Logger.e("%s: Exception while trying to stop media player", e, TAG);
        }
        stopMonitoring();
        onPlaybackStopped();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class MediaPlayerMonitorRunnable implements Runnable {
        private static final int MONITOR_INTERVAL_MILLIS = 50;
        private volatile boolean isStopRequested;

        private MediaPlayerMonitorRunnable() {
            this.isStopRequested = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            MonitoredMediaPlayerWrapper.this.playbackLoopCount = 0;
            this.isStopRequested = false;
            double d = 0.0d;
            while (MonitoredMediaPlayerWrapper.this.playbackProgressCallback != null && MonitoredMediaPlayerWrapper.this.mediaPlayer != null && !this.isStopRequested) {
                try {
                    if (MonitoredMediaPlayerWrapper.this.mediaPlayer.isPlaying()) {
                        double duration = MonitoredMediaPlayerWrapper.this.mediaPlayer.getDuration();
                        double currentPosition = duration == 0.0d ? 0.0d : MonitoredMediaPlayerWrapper.this.mediaPlayer.getCurrentPosition() / duration;
                        if (MonitoredMediaPlayerWrapper.this.playbackProgressCallback != null && currentPosition != d) {
                            MonitoredMediaPlayerWrapper.this.playbackProgressCallback.onPlaybackPercentageChange(Double.valueOf(currentPosition));
                        }
                        d = currentPosition;
                    }
                    Thread.sleep(50L);
                } catch (InterruptedException unused) {
                    this.isStopRequested = true;
                }
            }
        }

        public void stop() {
            this.isStopRequested = true;
        }

        public /* synthetic */ MediaPlayerMonitorRunnable(MonitoredMediaPlayerWrapper monitoredMediaPlayerWrapper, int i) {
            this();
        }
    }
}
