package com.amazon.apl.android.media;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.amazon.apl.android.dependencies.IMediaPlayer;
import com.amazon.apl.android.primitive.MediaSources;
import com.amazon.apl.android.utils.HttpUtils;
import com.amazon.apl.enums.AudioTrack;
import com.amazon.apl.enums.MediaPlayerEventType;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda2;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaPlayer implements IMediaPlayer.IMediaListener {
    private static final String TAG = "MediaPlayer";
    private final long mAddress;
    private int mCurrentSeekPosition;
    private int mCurrentTrackIndex;
    private boolean mMuted;
    private IMediaPlayer mPlayer;
    private IMediaPlayer.IMediaListener.MediaState mState = IMediaPlayer.IMediaListener.MediaState.IDLE;
    private final Queue<Runnable> mQueuedTasks = new LinkedList();
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private MediaSources mMediaSources = MediaSources.create();
    private AudioTrack mAudioTrack = AudioTrack.kAudioTrackForeground;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.media.MediaPlayer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState;

        static {
            int[] iArr = new int[IMediaPlayer.IMediaListener.MediaState.values().length];
            $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState = iArr;
            try {
                iArr[IMediaPlayer.IMediaListener.MediaState.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState[IMediaPlayer.IMediaListener.MediaState.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState[IMediaPlayer.IMediaListener.MediaState.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState[IMediaPlayer.IMediaListener.MediaState.TRACK_UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState[IMediaPlayer.IMediaListener.MediaState.PLAYING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState[IMediaPlayer.IMediaListener.MediaState.PAUSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MediaPlayer(long j) {
        this.mAddress = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$next$2() {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pause$1() {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$play$0() {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$previous$3() {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.previous();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$9() {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.mPlayer.release();
            this.mPlayer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$rewind$4() {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.rewind();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seek$5(int i) {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.seek(iMediaPlayer.getCurrentSeekPosition() + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekTo$6(int i) {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.seekTo(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioTrack$10(int i) {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.setAudioTrack(AudioTrack.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMute$11(boolean z) {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            if (z) {
                iMediaPlayer.mute();
            } else {
                iMediaPlayer.unmute();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrackIndex$8(int i) {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.setTrack(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrackList$7(MediaSources mediaSources) {
        IMediaPlayer iMediaPlayer = this.mPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.setMediaSources(mediaSources);
            if (this.mPlayer.getCurrentMediaState() == IMediaPlayer.IMediaListener.MediaState.PLAYING) {
                this.mPlayer.setTrack(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateMediaState$12(int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4, MediaPlayerEventType mediaPlayerEventType) {
        nUpdateMediaState(this.mAddress, this.mCurrentTrackIndex, i, this.mCurrentSeekPosition, i2, z, z2, z3, i3, i4, mediaPlayerEventType.getIndex());
    }

    private static native void nUpdateMediaState(long j, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, int i6, int i7);

    private void runOrDeferFunction(String str, Runnable runnable) {
        if (this.mPlayer != null) {
            runnable.run();
        } else {
            this.mQueuedTasks.add(runnable);
        }
    }

    private void runQueuedOperations() {
        Runnable poll = this.mQueuedTasks.poll();
        while (poll != null) {
            poll.run();
            poll = this.mQueuedTasks.poll();
        }
    }

    @NonNull
    public AudioTrack getCurrentAudioTrack() {
        return this.mAudioTrack;
    }

    public int getCurrentSeekPosition() {
        return this.mCurrentSeekPosition;
    }

    public int getCurrentTrackIndex() {
        return this.mCurrentTrackIndex;
    }

    public IMediaPlayer getMediaPlayer() {
        return this.mPlayer;
    }

    @NonNull
    public MediaSources getMediaSources() {
        return this.mMediaSources;
    }

    public boolean isCurrentlyMuted() {
        return this.mMuted;
    }

    public boolean isCurrentlyPlaying() {
        return this.mState == IMediaPlayer.IMediaListener.MediaState.PLAYING;
    }

    public void next() {
        runOrDeferFunction("next", new MediaPlayer$$ExternalSyntheticLambda1(this, 1));
    }

    public void pause() {
        runOrDeferFunction("pause", new MediaPlayer$$ExternalSyntheticLambda1(this, 0));
    }

    public void play() {
        runOrDeferFunction("play", new MediaPlayer$$ExternalSyntheticLambda1(this, 4));
    }

    public void previous() {
        runOrDeferFunction(VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, new MediaPlayer$$ExternalSyntheticLambda1(this, 5));
    }

    public void release() {
        Log.e(TAG, "Release is called");
        runOrDeferFunction("release", new MediaPlayer$$ExternalSyntheticLambda1(this, 2));
    }

    public void rewind() {
        runOrDeferFunction("rewind", new MediaPlayer$$ExternalSyntheticLambda1(this, 3));
    }

    public void seek(int i) {
        runOrDeferFunction(VoiceBridgePayloadUtil.PayloadCommand.SEEK, new MediaPlayer$$ExternalSyntheticLambda0(this, i, 1));
    }

    public void seekTo(int i) {
        runOrDeferFunction("seekTo", new MediaPlayer$$ExternalSyntheticLambda0(this, i, 0));
    }

    public void setAudioTrack(int i) {
        this.mAudioTrack = AudioTrack.valueOf(i);
        runOrDeferFunction("setAudioTrack", new MediaPlayer$$ExternalSyntheticLambda0(this, i, 3));
    }

    public void setMediaPlayer(IMediaPlayer iMediaPlayer) {
        this.mPlayer = iMediaPlayer;
        iMediaPlayer.addMediaStateListener(this);
        runQueuedOperations();
    }

    public void setMute(boolean z) {
        this.mMuted = z;
        runOrDeferFunction("setMute", new LifecycleUtils$$ExternalSyntheticLambda2(this, z, 7));
    }

    public void setTrackIndex(int i) {
        runOrDeferFunction("setTrackIndex", new MediaPlayer$$ExternalSyntheticLambda0(this, i, 2));
    }

    public void setTrackList(List<MediaTrack> list) {
        MediaSources create = MediaSources.create();
        for (MediaTrack mediaTrack : list) {
            create.add(MediaSources.MediaSource.builder().url(mediaTrack.getUrl()).duration(mediaTrack.getDuration()).offset(mediaTrack.getOffset()).repeatCount(mediaTrack.getRepeatCount()).headers(HttpUtils.listToHeadersMap(mediaTrack.getHeaders())).textTracks(Arrays.asList(mediaTrack.getTextTracks())).build());
        }
        this.mMediaSources = create;
        runOrDeferFunction("setTrackList", new MediaPlayer$$ExternalSyntheticLambda8(this, create, 0));
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer.IMediaListener
    public void updateMediaState(IMediaPlayer iMediaPlayer) {
        if (iMediaPlayer == null) {
            return;
        }
        IMediaPlayer.IMediaListener.MediaState currentMediaState = iMediaPlayer.getCurrentMediaState();
        int currentTrackIndex = iMediaPlayer.getCurrentTrackIndex();
        int currentSeekPosition = iMediaPlayer.getCurrentSeekPosition();
        if (currentSeekPosition < 0) {
            ArcMode$$ExternalSyntheticOutline0.m(currentSeekPosition, "Current seek position is ", TAG);
        }
        if (currentMediaState == IMediaPlayer.IMediaListener.MediaState.RELEASED || currentTrackIndex < 0) {
            this.mState = currentMediaState;
            return;
        }
        MediaPlayerEventType mediaPlayerEventType = MediaPlayerEventType.kMediaPlayerEventTimeUpdate;
        if (this.mState != iMediaPlayer.getCurrentMediaState()) {
            switch (AnonymousClass1.$SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState[currentMediaState.ordinal()]) {
                case 1:
                    mediaPlayerEventType = MediaPlayerEventType.kMediaPlayerEventTrackFail;
                    break;
                case 2:
                    mediaPlayerEventType = MediaPlayerEventType.kMediaPlayerEventEnd;
                    break;
                case 3:
                    mediaPlayerEventType = MediaPlayerEventType.kMediaPlayerEventTrackReady;
                    break;
                case 4:
                    mediaPlayerEventType = MediaPlayerEventType.kMediaPlayerEventTrackUpdate;
                    break;
                case 5:
                    mediaPlayerEventType = MediaPlayerEventType.kMediaPlayerEventPlay;
                    break;
                case 6:
                    mediaPlayerEventType = MediaPlayerEventType.kMediaPlayerEventPause;
                    break;
            }
            this.mState = currentMediaState;
        }
        final MediaPlayerEventType mediaPlayerEventType2 = mediaPlayerEventType;
        this.mCurrentTrackIndex = currentTrackIndex;
        this.mCurrentSeekPosition = currentSeekPosition;
        final int trackCount = iMediaPlayer.getTrackCount();
        final int duration = iMediaPlayer.getDuration();
        final boolean z = !iMediaPlayer.isPlaying();
        final boolean z2 = currentMediaState == IMediaPlayer.IMediaListener.MediaState.END;
        final boolean isMuted = iMediaPlayer.isMuted();
        final int trackState = iMediaPlayer.getTrackState();
        final int currentError = iMediaPlayer.getCurrentError();
        this.mMainHandler.post(new Runnable() { // from class: com.amazon.apl.android.media.MediaPlayer$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayer.this.lambda$updateMediaState$12(trackCount, duration, z, z2, isMuted, trackState, currentError, mediaPlayerEventType2);
            }
        });
    }
}
