package com.amazon.comms.calling.infrastructure;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.amazon.comms.calling.data.util.Constants;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.media.audio.AudioPlayer$$ExternalSyntheticLambda0;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 '2\u00020\u0001:\u0001'B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019J.\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0019J\u0012\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\b\u0010&\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/amazon/comms/calling/infrastructure/CallAudioPlayer;", "", "mContext", "Landroid/content/Context;", "audioManager", "Landroid/media/AudioManager;", "vibrationProvider", "Lcom/amazon/comms/calling/infrastructure/VibrationProvider;", "<init>", "(Landroid/content/Context;Landroid/media/AudioManager;Lcom/amazon/comms/calling/infrastructure/VibrationProvider;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "kotlin.jvm.PlatformType", "Lcom/amazon/comms/log/CommsLogger;", "AUDIO_RESOURCE_ID", "", "AUDIO_SHOULD_REPEAT", "AUDIO_STREAM_TYPE", "audioPlayerHandler", "Landroid/os/Handler;", "mediaPlayer", "Landroid/media/MediaPlayer;", "play", "", "resId", "", "repeat", "", "streamType", "message", "requestVibration", "stop", "newHandler", "getNewHandler", "()Landroid/os/Handler;", "handlePlay", "data", "Landroid/os/Bundle;", "destroyMediaPlayer", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallAudioPlayer {
    public static final int MSG_PLAY_AUDIO = 2;
    public static final int MSG_PLAY_RINGTONE = 1;

    @NotNull
    private final String AUDIO_RESOURCE_ID;

    @NotNull
    private final String AUDIO_SHOULD_REPEAT;

    @NotNull
    private final String AUDIO_STREAM_TYPE;
    private final CommsLogger LOG;

    @NotNull
    private final AudioManager audioManager;

    @Nullable
    private Handler audioPlayerHandler;

    @NotNull
    private final Context mContext;

    @Nullable
    private MediaPlayer mediaPlayer;

    @NotNull
    private final VibrationProvider vibrationProvider;

    @Inject
    public CallAudioPlayer(@NotNull Context context, @NotNull AudioManager audioManager, @NotNull VibrationProvider vibrationProvider) {
        context.getClass();
        audioManager.getClass();
        vibrationProvider.getClass();
        this.mContext = context;
        this.audioManager = audioManager;
        this.vibrationProvider = vibrationProvider;
        this.LOG = CommsLogger.getLogger(Constants.LOG_TAG, CallAudioPlayer.class);
        this.AUDIO_RESOURCE_ID = "RESOURCE_ID";
        this.AUDIO_SHOULD_REPEAT = "REPEAT";
        this.AUDIO_STREAM_TYPE = "STREAM_TYPE";
    }

    private final void destroyMediaPlayer() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.release();
        }
        this.mediaPlayer = null;
    }

    private final Handler getNewHandler() {
        HandlerThread handlerThread = new HandlerThread("AudioHandlerThread");
        handlerThread.start();
        final Looper looper = handlerThread.getLooper();
        return new Handler(looper) { // from class: com.amazon.comms.calling.infrastructure.CallAudioPlayer$newHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                CommsLogger commsLogger;
                msg.getClass();
                int i = msg.what;
                if (i == 1 || i == 2) {
                    CallAudioPlayer.this.handlePlay(msg.getData());
                } else {
                    commsLogger = CallAudioPlayer.this.LOG;
                    commsLogger.w("Message is not recognized. This should not happen." + msg);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void handlePlay(Bundle data) {
        Handler handler = this.audioPlayerHandler;
        CommsLogger commsLogger = this.LOG;
        if (handler == null) {
            commsLogger.e("AudioHandler is Null. Stopping play");
            return;
        }
        commsLogger.i("Handling play");
        if (data == null) {
            this.LOG.e("Empty data for handling audio");
            return;
        }
        int i = data.getInt(this.AUDIO_STREAM_TYPE);
        boolean z = data.getBoolean(this.AUDIO_SHOULD_REPEAT);
        int i2 = data.getInt(this.AUDIO_RESOURCE_ID);
        if (this.mediaPlayer != null) {
            this.LOG.i("Destroying previously created MediaPlayer object");
            destroyMediaPlayer();
        }
        if (i2 == 0) {
            this.LOG.e("Invalid resource ID passed to play Audio");
            return;
        }
        this.mediaPlayer = new MediaPlayer();
        try {
            AssetFileDescriptor openRawResourceFd = this.mContext.getResources().openRawResourceFd(i2);
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getDeclaredLength());
                mediaPlayer.setAudioStreamType(i);
                mediaPlayer.setOnErrorListener(new AudioPlayer$$ExternalSyntheticLambda0(this, 5));
                mediaPlayer.setLooping(z);
            }
            if (this.audioManager.getStreamVolume(i) != 0) {
                try {
                    MediaPlayer mediaPlayer2 = this.mediaPlayer;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.prepare();
                    }
                    MediaPlayer mediaPlayer3 = this.mediaPlayer;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.start();
                    }
                } catch (IOException e) {
                    this.LOG.e("Exception while preparing Media player", e);
                    destroyMediaPlayer();
                }
            }
        } catch (Resources.NotFoundException e2) {
            this.LOG.e("Exception while trying to play.", e2);
            destroyMediaPlayer();
        } catch (IOException e3) {
            this.LOG.e("Exception while trying to play.", e3);
            destroyMediaPlayer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handlePlay$lambda$4$lambda$3(CallAudioPlayer callAudioPlayer, MediaPlayer mediaPlayer, int i, int i2) {
        callAudioPlayer.LOG.e("OnError called for media player, what:" + i + ",extra:" + i2);
        return false;
    }

    public final synchronized void play(int resId, boolean repeat, int streamType, int message) {
        if (resId == 0) {
            this.LOG.e("Invalid resource ID passed to play Audio");
            return;
        }
        if (this.audioPlayerHandler == null) {
            this.audioPlayerHandler = getNewHandler();
        }
        if (this.mediaPlayer != null) {
            this.LOG.i("Trying to play a sound while we are playing another sound");
            Handler handler = this.audioPlayerHandler;
            if (handler != null && handler.hasMessages(message)) {
                handler.removeMessages(message);
            }
        }
        this.LOG.i("Playing audio: " + message);
        Handler handler2 = this.audioPlayerHandler;
        if (handler2 != null) {
            Message obtainMessage = handler2.obtainMessage(message);
            obtainMessage.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt(this.AUDIO_RESOURCE_ID, resId);
            bundle.putBoolean(this.AUDIO_SHOULD_REPEAT, repeat);
            bundle.putInt(this.AUDIO_STREAM_TYPE, streamType);
            obtainMessage.setData(bundle);
            handler2.sendMessage(obtainMessage);
        }
    }

    public final synchronized void stop(int message) {
        try {
            if (this.audioPlayerHandler == null) {
                return;
            }
            this.LOG.i("Stopping audio.");
            if (this.mediaPlayer != null) {
                destroyMediaPlayer();
            }
            Handler handler = this.audioPlayerHandler;
            if (handler != null) {
                if (handler.hasMessages(message)) {
                    handler.removeMessages(message);
                }
                handler.getLooper().quitSafely();
            }
            this.audioPlayerHandler = null;
            this.vibrationProvider.stopRingerVibration();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void play(int resId, boolean repeat, int streamType, boolean requestVibration, int message) {
        if (resId == 0) {
            this.LOG.e("Invalid resource ID passed to play Audio");
            return;
        }
        play(resId, repeat, streamType, message);
        if (requestVibration) {
            this.vibrationProvider.performRingerVibration();
        }
    }
}
