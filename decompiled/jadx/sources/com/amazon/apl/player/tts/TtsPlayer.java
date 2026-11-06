package com.amazon.apl.player.tts;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.apl.android.dependencies.ITtsPlayer;
import com.amazon.apl.android.media.TextTrack;
import com.amazon.apl.player.audio.AudioPlayer;
import com.amazon.apl.player.audio.NeoAudioPlayer;
import com.amazon.common.NativeBinding$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TtsPlayer extends AudioPlayer.AudioPlayerListener implements ITtsPlayer, ITtsPlayer.ISpeechMarksListener {
    private static final String TAG = "TtsPlayer";

    @NonNull
    private static final HandlerThread sHandlerThread;
    private TtsSpeechMarksEmitter mEmitter;
    private Handler mHandler;
    private ITtsPlayer.ISpeechMarksListener mMarksListener;
    private AudioPlayer mPlayer;
    private String mSource;
    private ITtsPlayer.IStateChangeListener mStateListener;

    static {
        HandlerThread handlerThread = new HandlerThread("TtsPlayer.Speak", -16);
        sHandlerThread = handlerThread;
        handlerThread.start();
    }

    public TtsPlayer(Context context, int i) {
        NeoAudioPlayer neoAudioPlayer = new NeoAudioPlayer(context, false, i);
        this.mPlayer = neoAudioPlayer;
        neoAudioPlayer.setListener(this);
        this.mEmitter = new TtsSpeechMarksEmitter(this, new Handler(Looper.getMainLooper()), context);
        this.mHandler = new Handler(sHandlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$0(InputStream inputStream) {
        try {
            this.mPlayer.prepare(AudioWordMarkDemuxer.split(inputStream, this.mEmitter).getMp3Stream());
        } catch (IOException unused) {
            Log.e(TAG, "Error while preparing TTS player.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$1(URL url) {
        try {
            this.mPlayer.prepare(AudioWordMarkDemuxer.split(url.openStream(), this.mEmitter).getMp3Stream());
        } catch (IOException unused) {
            Log.e(TAG, "Error while preparing TTS player.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$2(InputStream inputStream) {
        try {
            this.mPlayer.prepare(AudioWordMarkDemuxer.split(inputStream, this.mEmitter).getMp3Stream());
        } catch (IOException unused) {
            Log.e(TAG, "Error while preparing TTS player.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$3(URL url) {
        try {
            this.mPlayer.prepare(AudioWordMarkDemuxer.split(url.openStream(), this.mEmitter).getMp3Stream());
        } catch (IOException unused) {
            Log.e(TAG, "Error while preparing TTS player.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$4() {
        try {
            this.mPlayer.stop();
        } catch (TimeoutException unused) {
        }
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public String getSource() {
        return this.mSource;
    }

    @Override // com.amazon.apl.player.audio.AudioPlayer.AudioPlayerListener
    public void onPlayerError(Exception exc) {
        this.mEmitter.clear();
    }

    @Override // com.amazon.apl.player.audio.AudioPlayer.AudioPlayerListener
    public void onPlayerStateChanged(boolean z, @NonNull AudioPlayer.AudioPlayerState audioPlayerState) {
        ITtsPlayer.IStateChangeListener iStateChangeListener = this.mStateListener;
        if (iStateChangeListener != null) {
            iStateChangeListener.onStateChange(ITtsPlayer.IStateChangeListener.AudioPlayerState.values()[audioPlayerState.ordinal()]);
        }
        if (audioPlayerState == AudioPlayer.AudioPlayerState.STATE_READY) {
            this.mEmitter.start();
        }
        if (audioPlayerState == AudioPlayer.AudioPlayerState.STATE_ENDED) {
            this.mEmitter.clear();
        }
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer.ISpeechMarksListener
    public void onSpeechMark(ITtsPlayer.ISpeechMarksListener.SpeechMark speechMark) {
        ITtsPlayer.ISpeechMarksListener iSpeechMarksListener = this.mMarksListener;
        if (iSpeechMarksListener != null) {
            iSpeechMarksListener.onSpeechMark(speechMark);
        }
    }

    public void play() {
        Handler handler = this.mHandler;
        AudioPlayer audioPlayer = this.mPlayer;
        Objects.requireNonNull(audioPlayer);
        handler.post(new NativeBinding$$ExternalSyntheticLambda0(audioPlayer, 14));
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    @Deprecated
    public void prepare(String str, InputStream inputStream) {
        this.mSource = str;
        this.mHandler.post(new TtsPlayer$$ExternalSyntheticLambda2(this, inputStream, 1));
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void release() {
        this.mEmitter.clear();
        this.mPlayer.release();
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void setStateChangeListener(ITtsPlayer.IStateChangeListener iStateChangeListener) {
        this.mStateListener = iStateChangeListener;
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void setWordMarkListener(ITtsPlayer.ISpeechMarksListener iSpeechMarksListener) {
        this.mMarksListener = iSpeechMarksListener;
    }

    public void stop() {
        this.mHandler.post(new NativeBinding$$ExternalSyntheticLambda0(this, 15));
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    @Deprecated
    public void prepare(String str, @NonNull URL url) {
        this.mSource = str;
        this.mHandler.post(new TtsPlayer$$ExternalSyntheticLambda4(this, url, 0));
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void prepare(String str, InputStream inputStream, TextTrack textTrack) {
        this.mSource = str;
        this.mHandler.post(new TtsPlayer$$ExternalSyntheticLambda2(this, inputStream, 0));
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void prepare(String str, @NonNull URL url, TextTrack textTrack) {
        this.mSource = str;
        this.mHandler.post(new TtsPlayer$$ExternalSyntheticLambda4(this, url, 1));
    }
}
