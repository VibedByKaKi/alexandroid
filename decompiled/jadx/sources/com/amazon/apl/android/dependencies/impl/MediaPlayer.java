package com.amazon.apl.android.dependencies.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.dependencies.IMediaPlayer;
import com.amazon.apl.android.primitive.MediaSources;
import com.amazon.apl.enums.AudioTrack;
import com.amazon.apl.enums.VideoScale;
import com.amazon.common.NativeBinding$$ExternalSyntheticLambda0;
import com.amazon.dee.app.ui.video.VideoActivity$$ExternalSyntheticLambda0;
import com.amazon.dee.app.ui.video.VideoActivity$$ExternalSyntheticLambda2;
import com.amazon.deecomms.media.audio.AudioPlayer$$ExternalSyntheticLambda0;
import com.amazon.deecomms.media.audio.AudioPlayer$$ExternalSyntheticLambda1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaPlayer implements IMediaPlayer<TextureView> {
    private static final String ANDROID_ASSET_PATH = "/android_asset/";
    private static final float ATTENUATED_VOLUME = 0.25f;
    private static final AudioAttributes AUDIO_ATTRIBUTES = new AudioAttributes.Builder().setContentType(3).setUsage(1).build();
    private static final int POSITION_UPDATE_INTERVAL_MS = 1000;
    private static final String TAG = "MediaPlayer";
    private boolean isMuted;
    private Action mAction;
    private final AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener;
    private AudioManager mAudioManager;

    @NonNull
    private AudioTrack mAudioTrack;
    private Context mContext;
    private int mCurrentSeekPosition;

    @NonNull
    private IMediaPlayer.IMediaListener.MediaState mCurrentState;
    private int mCurrentTrackIndex;
    private Handler mHandler;
    private boolean mHasAudioFocus;
    private boolean mIsAttenuated;
    private final List<IMediaPlayer.IMediaListener> mListeners;
    private int mLoopCount;

    @Nullable
    private android.media.MediaPlayer mMediaPlayer;
    private final MediaPlayer.OnCompletionListener mOnCompletionListener;
    private final MediaPlayer.OnErrorListener mOnErrorListener;
    private final MediaPlayer.OnPreparedListener mOnPreparedListener;
    private final MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private final MediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private final Runnable mProgressUpdateTask;

    @NonNull
    private VideoScale mScale;
    private boolean mShouldNotifyProgress;
    private MediaSources mSources;

    @Nullable
    private Surface mSurface;
    private final TextureView.SurfaceTextureListener mSurfaceTextureListener;

    @Nullable
    private TextureView mTextureView;
    private boolean mWasPlaying;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.dependencies.impl.MediaPlayer$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$VideoScale;

        static {
            int[] iArr = new int[VideoScale.values().length];
            $SwitchMap$com$amazon$apl$enums$VideoScale = iArr;
            try {
                iArr[VideoScale.kVideoScaleBestFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$VideoScale[VideoScale.kVideoScaleBestFit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Action {
        NONE,
        PLAY,
        PAUSE,
        STOP,
        SEEK,
        SEEK_TO,
        USER_TRACK_UPDATE,
        INTERNAL_TRACK_UPDATE
    }

    @VisibleForTesting
    public MediaPlayer(@NonNull android.media.MediaPlayer mediaPlayer, @Nullable TextureView textureView, @NonNull Context context, @NonNull AudioManager audioManager) {
        this.mAudioTrack = AudioTrack.kAudioTrackForeground;
        this.mCurrentState = IMediaPlayer.IMediaListener.MediaState.IDLE;
        this.mAction = Action.NONE;
        this.mScale = VideoScale.kVideoScaleBestFit;
        this.mHasAudioFocus = false;
        this.mShouldNotifyProgress = false;
        this.mWasPlaying = false;
        this.isMuted = false;
        this.mIsAttenuated = false;
        this.mCurrentTrackIndex = 0;
        this.mLoopCount = 0;
        this.mCurrentSeekPosition = 0;
        VideoActivity$$ExternalSyntheticLambda2 videoActivity$$ExternalSyntheticLambda2 = new VideoActivity$$ExternalSyntheticLambda2(this, 1);
        this.mOnPreparedListener = videoActivity$$ExternalSyntheticLambda2;
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = new MediaPlayer.OnSeekCompleteListener() { // from class: com.amazon.apl.android.dependencies.impl.MediaPlayer$$ExternalSyntheticLambda1
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(android.media.MediaPlayer mediaPlayer2) {
                MediaPlayer.this.lambda$new$1(mediaPlayer2);
            }
        };
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.amazon.apl.android.dependencies.impl.MediaPlayer.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                MediaPlayer.this.mSurface = new Surface(surfaceTexture);
                if (MediaPlayer.this.mAction == Action.PLAY || MediaPlayer.this.mAction == Action.SEEK || MediaPlayer.this.mAction == Action.SEEK_TO) {
                    try {
                        MediaPlayer.this.preparePlayer();
                    } catch (Exception e) {
                        MediaPlayer.this.onPlayerError("Media player error on preparing track.", e);
                    }
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }
        };
        this.mSurfaceTextureListener = surfaceTextureListener;
        MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.amazon.apl.android.dependencies.impl.MediaPlayer$$ExternalSyntheticLambda2
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer2, int i, int i2) {
                MediaPlayer.this.lambda$new$2(mediaPlayer2, i, i2);
            }
        };
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
        this.mOnCompletionListener = new VideoActivity$$ExternalSyntheticLambda0(this, 4);
        this.mProgressUpdateTask = new NativeBinding$$ExternalSyntheticLambda0(this, 11);
        this.mAudioFocusChangeListener = new AudioPlayer$$ExternalSyntheticLambda1(this, 6);
        AudioPlayer$$ExternalSyntheticLambda0 audioPlayer$$ExternalSyntheticLambda0 = new AudioPlayer$$ExternalSyntheticLambda0(this, 4);
        this.mOnErrorListener = audioPlayer$$ExternalSyntheticLambda0;
        this.mMediaPlayer = mediaPlayer;
        this.mTextureView = textureView;
        this.mAudioManager = audioManager;
        this.mContext = context;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mListeners = new LinkedList();
        try {
            this.mMediaPlayer.setAudioAttributes(AUDIO_ATTRIBUTES);
            this.mMediaPlayer.setOnErrorListener(audioPlayer$$ExternalSyntheticLambda0);
            this.mMediaPlayer.setOnPreparedListener(videoActivity$$ExternalSyntheticLambda2);
            this.mMediaPlayer.setOnSeekCompleteListener(onSeekCompleteListener);
            this.mMediaPlayer.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
            TextureView textureView2 = this.mTextureView;
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(surfaceTextureListener);
            }
        } catch (Exception e) {
            onPlayerError("Error while initializing media player.", e);
        }
    }

    private boolean isPlayerReady() {
        IMediaPlayer.IMediaListener.MediaState mediaState;
        return (this.mMediaPlayer == null || (mediaState = this.mCurrentState) == IMediaPlayer.IMediaListener.MediaState.ERROR || mediaState == IMediaPlayer.IMediaListener.MediaState.IDLE || mediaState == IMediaPlayer.IMediaListener.MediaState.PREPARING) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(android.media.MediaPlayer mediaPlayer) {
        this.mCurrentState = IMediaPlayer.IMediaListener.MediaState.READY;
        notifyMediaState();
        Action action = this.mAction;
        Action action2 = Action.PLAY;
        if (action == action2 || action == Action.INTERNAL_TRACK_UPDATE || action == Action.SEEK || action == Action.SEEK_TO) {
            try {
                MediaSources.MediaSource at = this.mSources.at(this.mCurrentTrackIndex);
                Action action3 = this.mAction;
                if (action3 != Action.SEEK && action3 != Action.SEEK_TO) {
                    if (at.offset() > 0) {
                        seekInternal(0, this.mLoopCount, this.mAction);
                        return;
                    } else {
                        playInternal(this.mAction == action2);
                        return;
                    }
                }
                this.mAction = action2;
                seekInternal(this.mCurrentSeekPosition, this.mLoopCount, action2);
            } catch (Exception e) {
                onPlayerError("Media player error on starting playback.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(android.media.MediaPlayer mediaPlayer) {
        Action action = this.mAction;
        Action action2 = Action.PLAY;
        if (action == action2 || action == Action.INTERNAL_TRACK_UPDATE) {
            playInternal(action == action2);
            return;
        }
        try {
            notifyMediaState();
        } catch (Exception e) {
            onPlayerError("Error on progress update", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        TextureView textureView = this.mTextureView;
        if (textureView == null) {
            Log.e(TAG, "View not available, skipping scale adjustment.");
            return;
        }
        int width = textureView.getWidth();
        int height = this.mTextureView.getHeight();
        double d = i2 / i;
        if (AnonymousClass2.$SwitchMap$com$amazon$apl$enums$VideoScale[this.mScale.ordinal()] == 1 ? height <= (i3 = (int) (width * d)) : height > (i3 = (int) (width * d))) {
            i5 = i3;
            i4 = width;
        } else {
            i4 = (int) (height / d);
            i5 = height;
        }
        Matrix matrix = new Matrix();
        this.mTextureView.getTransform(matrix);
        matrix.setScale(i4 / width, i5 / height);
        matrix.postTranslate((width - i4) / 2, (height - i5) / 2);
        this.mTextureView.setTransform(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(android.media.MediaPlayer mediaPlayer) {
        onTrackCompletion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4() {
        try {
            notifyMediaState();
            if (this.mShouldNotifyProgress) {
                this.mHandler.postDelayed(this.mProgressUpdateTask, 1000L);
            }
            MediaSources.MediaSource at = this.mSources.at(this.mCurrentTrackIndex);
            if (at.duration() <= 0) {
                return;
            }
            if (this.mMediaPlayer.getCurrentPosition() >= Math.min(this.mMediaPlayer.getDuration(), at.duration())) {
                onTrackCompletion();
            }
        } catch (Exception e) {
            onPlayerError("Error on progress update", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$5(int i) {
        if (i == -3) {
            if (this.mAudioTrack != AudioTrack.kAudioTrackBackground) {
                pauseInternal(false);
                return;
            } else {
                this.mIsAttenuated = true;
                setVolumeIfNotMuted(0.25f);
                return;
            }
        }
        if (i == -2 || i == -1) {
            pauseInternal(false);
            return;
        }
        if (i != 1) {
            return;
        }
        this.mIsAttenuated = false;
        setVolumeIfNotMuted(1.0f);
        if (this.mWasPlaying) {
            play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$6(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        onPlayerError("Media player error. " + (i != -1010 ? i != -1007 ? i != -1004 ? i != -110 ? i != 100 ? i != 200 ? "Unknown error." : "The video container is not valid for progressive playback." : "Media server died." : "Time out." : "Network error." : "Media bitstream does not conform to the related coding standard." : "Unsupported media format.") + " extra code " + i2, null);
        try {
            try {
                this.mMediaPlayer.reset();
            } catch (Exception unused) {
                Log.e(TAG, "Media player error on reset.");
            }
            return true;
        } finally {
            this.mCurrentState = IMediaPlayer.IMediaListener.MediaState.IDLE;
        }
    }

    private void notifyMediaState() {
        Iterator it2 = new ArrayList(this.mListeners).iterator();
        while (it2.hasNext()) {
            ((IMediaPlayer.IMediaListener) it2.next()).updateMediaState(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerError(String str, @Nullable Exception exc) {
        Log.e(TAG, str);
        if (exc != null) {
            exc.printStackTrace();
        }
        this.mCurrentState = IMediaPlayer.IMediaListener.MediaState.ERROR;
        notifyMediaState();
    }

    private void onTrackCompletion() {
        try {
            int repeatCount = this.mSources.at(this.mCurrentTrackIndex).repeatCount();
            int i = this.mLoopCount;
            if (i < repeatCount) {
                seekInternal(0, i + 1, Action.INTERNAL_TRACK_UPDATE);
            } else {
                if (this.mCurrentTrackIndex + 1 < this.mSources.size()) {
                    setTrackInternal(this.mCurrentTrackIndex + 1, Action.INTERNAL_TRACK_UPDATE);
                    return;
                }
                this.mCurrentState = IMediaPlayer.IMediaListener.MediaState.END;
                notifyMediaState();
                stop();
            }
        } catch (Exception e) {
            onPlayerError("Error while updating track.", e);
        }
    }

    private void pauseInternal(boolean z) {
        this.mWasPlaying = !z && isPlaying();
        Action action = this.mAction;
        Action action2 = Action.PAUSE;
        if (action == action2) {
            Log.e(TAG, "Pause already requested, ignoring this request.");
            return;
        }
        this.mAction = action2;
        if (z) {
            try {
                releaseAudioFocus();
            } catch (Exception e) {
                onPlayerError("Media player error on pause.", e);
                return;
            }
        }
        stopProgressUpdateTask();
        this.mMediaPlayer.pause();
        this.mCurrentState = IMediaPlayer.IMediaListener.MediaState.PAUSED;
        notifyMediaState();
        this.mShouldNotifyProgress = false;
    }

    private void playInternal(boolean z) throws IllegalStateException {
        requestAudioFocus();
        this.mMediaPlayer.start();
        startProgressUpdateTask();
        this.mCurrentState = IMediaPlayer.IMediaListener.MediaState.PLAYING;
        if (z) {
            notifyMediaState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preparePlayer() throws IllegalStateException, IOException {
        if (this.mSurface == null) {
            return;
        }
        MediaSources mediaSources = this.mSources;
        if (mediaSources == null || mediaSources.size() == 0) {
            Log.e(TAG, "No source to play");
            return;
        }
        if (isPlayerReady()) {
            playInternal(true);
            return;
        }
        IMediaPlayer.IMediaListener.MediaState mediaState = this.mCurrentState;
        IMediaPlayer.IMediaListener.MediaState mediaState2 = IMediaPlayer.IMediaListener.MediaState.PREPARING;
        if (mediaState == mediaState2 || this.mMediaPlayer == null) {
            Log.w(TAG, "Cannot prepare player or the player is already preparing itself");
            return;
        }
        stopInternal();
        MediaSources.MediaSource at = this.mSources.at(this.mCurrentTrackIndex);
        Map<String, String> headers = at.headers();
        setCompletionListener(at);
        Uri parse = Uri.parse(at.url());
        if (!headers.isEmpty()) {
            this.mMediaPlayer.setDataSource(this.mContext, parse, at.headers());
        } else if ("file".equalsIgnoreCase(parse.getScheme()) && parse.getPath() != null && parse.getPath().startsWith(ANDROID_ASSET_PATH)) {
            setMediaSourceFromAsset(parse);
        } else {
            this.mMediaPlayer.setDataSource(at.url());
        }
        this.mMediaPlayer.setSurface(this.mSurface);
        this.mMediaPlayer.setLooping(at.repeatCount() == -1);
        this.mMediaPlayer.prepareAsync();
        this.mCurrentState = mediaState2;
    }

    private void requestAudioFocus() {
        if (this.mAudioTrack == AudioTrack.kAudioTrackNone) {
            setVolumeIfNotMuted(0.0f);
        } else {
            if (this.mHasAudioFocus) {
                return;
            }
            this.mHasAudioFocus = this.mAudioManager.requestAudioFocus(this.mAudioFocusChangeListener, 3, 1) == 1;
        }
    }

    private void seekInternal(int i, int i2, Action action) throws IllegalStateException {
        seekToInternal(this.mSources.at(this.mCurrentTrackIndex).offset() + i, i2, action, 3);
    }

    private void seekToInternal(int i, int i2, Action action, int i3) throws IllegalStateException {
        this.mAction = action;
        this.mLoopCount = i2;
        MediaSources.MediaSource at = this.mSources.at(this.mCurrentTrackIndex);
        int duration = at.duration() <= 0 ? Integer.MAX_VALUE : at.duration();
        if (i <= at.offset()) {
            i = at.offset();
        } else if (i >= duration) {
            i = duration;
        }
        this.mMediaPlayer.seekTo(i, i3);
    }

    private void setCompletionListener(MediaSources.MediaSource mediaSource) {
        this.mMediaPlayer.setOnCompletionListener(mediaSource.duration() <= 0 ? this.mOnCompletionListener : null);
    }

    private void setMediaSourceFromAsset(Uri uri) throws IOException {
        AssetFileDescriptor openFd = this.mContext.getAssets().openFd(uri.getPath().substring(15));
        try {
            this.mMediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
        } catch (Throwable th) {
            if (openFd == null) {
                throw th;
            }
            try {
                openFd.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private void setTrackInternal(int i, Action action) throws IOException {
        MediaSources mediaSources = this.mSources;
        if (mediaSources == null || i < 0 || i >= mediaSources.size()) {
            return;
        }
        this.mAction = action;
        this.mLoopCount = 0;
        this.mCurrentTrackIndex = i;
        this.mCurrentState = IMediaPlayer.IMediaListener.MediaState.TRACK_UPDATE;
        notifyMediaState();
        if (isPlayerReady()) {
            stopInternal();
            preparePlayer();
        }
    }

    private void setVolumeIfNotMuted(float f) {
        android.media.MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            Log.e(TAG, "Unexpected: called setVolumeIfNotMuted when mMediaPlayer is NULL");
        } else if (this.isMuted) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(f, f);
        }
    }

    private void startProgressUpdateTask() {
        if (this.mShouldNotifyProgress) {
            return;
        }
        this.mHandler.postDelayed(this.mProgressUpdateTask, 0L);
        this.mShouldNotifyProgress = true;
    }

    private void stopInternal() {
        IMediaPlayer.IMediaListener.MediaState mediaState = this.mCurrentState;
        IMediaPlayer.IMediaListener.MediaState mediaState2 = IMediaPlayer.IMediaListener.MediaState.IDLE;
        if (mediaState == mediaState2) {
            return;
        }
        stopProgressUpdateTask();
        this.mMediaPlayer.stop();
        this.mMediaPlayer.reset();
        this.mCurrentState = mediaState2;
    }

    private void stopProgressUpdateTask() {
        if (this.mShouldNotifyProgress) {
            this.mHandler.removeCallbacks(this.mProgressUpdateTask);
            this.mShouldNotifyProgress = false;
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void addMediaStateListener(@NonNull IMediaPlayer.IMediaListener iMediaListener) {
        this.mListeners.add(iMediaListener);
    }

    @VisibleForTesting
    public AudioManager.OnAudioFocusChangeListener getAudioFocusChangeListener() {
        return this.mAudioFocusChangeListener;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    @NonNull
    public IMediaPlayer.IMediaListener.MediaState getCurrentMediaState() {
        return this.mCurrentState;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public int getCurrentSeekPosition() {
        if (isPlayerReady()) {
            this.mCurrentSeekPosition = this.mMediaPlayer.getCurrentPosition();
        }
        return this.mCurrentSeekPosition;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public int getCurrentTrackIndex() {
        return this.mCurrentTrackIndex;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public int getDuration() {
        MediaSources mediaSources = this.mSources;
        if (mediaSources == null || this.mCurrentTrackIndex >= mediaSources.size() || !isPlayerReady()) {
            return 0;
        }
        MediaSources.MediaSource at = this.mSources.at(this.mCurrentTrackIndex);
        return Math.min(at.duration() <= 0 ? Integer.MAX_VALUE : at.duration(), this.mMediaPlayer.getDuration());
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public int getTrackCount() {
        MediaSources mediaSources = this.mSources;
        if (mediaSources == null) {
            return 0;
        }
        return mediaSources.size();
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public boolean isMuted() {
        return this.isMuted;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public boolean isPlaying() {
        android.media.MediaPlayer mediaPlayer = this.mMediaPlayer;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void mute() {
        if (this.isMuted) {
            return;
        }
        this.isMuted = true;
        setVolumeIfNotMuted(0.0f);
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void next() {
        if (isPlayerReady()) {
            try {
                setTrackInternal(this.mCurrentTrackIndex + 1, Action.USER_TRACK_UPDATE);
            } catch (Exception e) {
                onPlayerError("Media player error next.", e);
            }
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void pause() {
        if (isPlayerReady()) {
            pauseInternal(true);
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void play() {
        Action action = this.mAction;
        Action action2 = Action.PLAY;
        if (action == action2 || action == Action.SEEK || action == Action.SEEK_TO) {
            return;
        }
        this.mAction = action2;
        this.mWasPlaying = false;
        try {
            preparePlayer();
        } catch (Exception e) {
            onPlayerError("Media player error on play.", e);
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void previous() {
        if (isPlayerReady()) {
            try {
                setTrackInternal(this.mCurrentTrackIndex - 1, Action.USER_TRACK_UPDATE);
            } catch (Exception e) {
                onPlayerError("Media player error on previous.", e);
            }
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void release() {
        if (this.mMediaPlayer == null) {
            return;
        }
        try {
            pauseInternal(true);
            stop();
            releaseAudioFocus();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            TextureView textureView = this.mTextureView;
            if (textureView != null) {
                textureView.setSurfaceTextureListener(null);
            }
            this.mTextureView = null;
            Surface surface = this.mSurface;
            if (surface != null) {
                surface.release();
                this.mSurface = null;
            }
            this.mCurrentState = IMediaPlayer.IMediaListener.MediaState.RELEASED;
            notifyMediaState();
            this.mListeners.clear();
        } catch (Exception e) {
            onPlayerError("Media player on release.", e);
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void releaseAudioFocus() {
        if (this.mHasAudioFocus) {
            this.mAudioManager.abandonAudioFocus(this.mAudioFocusChangeListener);
            this.mHasAudioFocus = false;
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void removeMediaStateListener(@NonNull IMediaPlayer.IMediaListener iMediaListener) {
        this.mListeners.remove(iMediaListener);
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void rewind() {
        if (isPlayerReady()) {
            seekInternal(0, 0, Action.SEEK);
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void seek(int i) {
        try {
            if (isPlayerReady()) {
                seekInternal(i, this.mLoopCount, Action.SEEK);
                return;
            }
            this.mCurrentSeekPosition = i;
            this.mAction = Action.SEEK;
            preparePlayer();
        } catch (Exception e) {
            onPlayerError("Media player error on seek", e);
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void seekTo(int i) {
        try {
            if (isPlayerReady()) {
                seekToInternal(i, this.mLoopCount, Action.SEEK_TO, 0);
                return;
            }
            this.mCurrentSeekPosition = i;
            this.mAction = Action.SEEK_TO;
            preparePlayer();
        } catch (Exception e) {
            onPlayerError("Media player error on seekTo", e);
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void setAudioTrack(@NonNull AudioTrack audioTrack) {
        this.mAudioTrack = audioTrack;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void setMediaSources(@NonNull MediaSources mediaSources) {
        this.mSources = mediaSources;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void setTrack(int i) {
        Action action = Action.USER_TRACK_UPDATE;
        this.mAction = action;
        try {
            setTrackInternal(i, action);
        } catch (Exception e) {
            onPlayerError("Media player error on set track.", e);
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void setVideoScale(@NonNull VideoScale videoScale) {
        this.mScale = videoScale;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void stop() {
        if (isPlayerReady()) {
            Action action = this.mAction;
            Action action2 = Action.STOP;
            if (action == action2) {
                Log.e(TAG, "Stop already requested, ignoring this request.");
                return;
            }
            this.mAction = action2;
            this.mLoopCount = 0;
            try {
                releaseAudioFocus();
                stopInternal();
                notifyMediaState();
            } catch (Exception e) {
                onPlayerError("Media player error on stop.", e);
            }
        }
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void unmute() {
        if (this.isMuted) {
            this.isMuted = false;
            if (this.mIsAttenuated) {
                setVolumeIfNotMuted(0.25f);
            } else {
                setVolumeIfNotMuted(1.0f);
            }
        }
    }

    public MediaPlayer(@NonNull Context context, @Nullable TextureView textureView) {
        this(new android.media.MediaPlayer(), textureView, context, (AudioManager) context.getSystemService("audio"));
    }

    public MediaPlayer() {
        this.mAudioTrack = AudioTrack.kAudioTrackForeground;
        this.mCurrentState = IMediaPlayer.IMediaListener.MediaState.IDLE;
        this.mAction = Action.NONE;
        this.mScale = VideoScale.kVideoScaleBestFit;
        this.mHasAudioFocus = false;
        this.mShouldNotifyProgress = false;
        this.mWasPlaying = false;
        this.isMuted = false;
        this.mIsAttenuated = false;
        this.mCurrentTrackIndex = 0;
        this.mLoopCount = 0;
        this.mCurrentSeekPosition = 0;
        VideoActivity$$ExternalSyntheticLambda2 videoActivity$$ExternalSyntheticLambda2 = new VideoActivity$$ExternalSyntheticLambda2(this, 1);
        this.mOnPreparedListener = videoActivity$$ExternalSyntheticLambda2;
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = new MediaPlayer.OnSeekCompleteListener() { // from class: com.amazon.apl.android.dependencies.impl.MediaPlayer$$ExternalSyntheticLambda1
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(android.media.MediaPlayer mediaPlayer2) {
                MediaPlayer.this.lambda$new$1(mediaPlayer2);
            }
        };
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        this.mSurfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.amazon.apl.android.dependencies.impl.MediaPlayer.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                MediaPlayer.this.mSurface = new Surface(surfaceTexture);
                if (MediaPlayer.this.mAction == Action.PLAY || MediaPlayer.this.mAction == Action.SEEK || MediaPlayer.this.mAction == Action.SEEK_TO) {
                    try {
                        MediaPlayer.this.preparePlayer();
                    } catch (Exception e) {
                        MediaPlayer.this.onPlayerError("Media player error on preparing track.", e);
                    }
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }
        };
        MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.amazon.apl.android.dependencies.impl.MediaPlayer$$ExternalSyntheticLambda2
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer2, int i, int i2) {
                MediaPlayer.this.lambda$new$2(mediaPlayer2, i, i2);
            }
        };
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
        this.mOnCompletionListener = new VideoActivity$$ExternalSyntheticLambda0(this, 4);
        this.mProgressUpdateTask = new NativeBinding$$ExternalSyntheticLambda0(this, 11);
        this.mAudioFocusChangeListener = new AudioPlayer$$ExternalSyntheticLambda1(this, 6);
        AudioPlayer$$ExternalSyntheticLambda0 audioPlayer$$ExternalSyntheticLambda0 = new AudioPlayer$$ExternalSyntheticLambda0(this, 4);
        this.mOnErrorListener = audioPlayer$$ExternalSyntheticLambda0;
        this.mMediaPlayer = new android.media.MediaPlayer();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mListeners = new LinkedList();
        try {
            this.mMediaPlayer.setAudioAttributes(AUDIO_ATTRIBUTES);
            this.mMediaPlayer.setOnErrorListener(audioPlayer$$ExternalSyntheticLambda0);
            this.mMediaPlayer.setOnPreparedListener(videoActivity$$ExternalSyntheticLambda2);
            this.mMediaPlayer.setOnSeekCompleteListener(onSeekCompleteListener);
            this.mMediaPlayer.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        } catch (Exception e) {
            onPlayerError("Error while initializing media player.", e);
        }
    }
}
