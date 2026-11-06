package com.amazon.apl.player.neoplayer;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Trace;
import android.util.Log;
import com.amazon.apl.player.neoplayer.ITrackPlayer;
import com.amazon.apl.player.neoplayer.TrackPlayerThread;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TrackPlayer implements ITrackPlayer {
    private static final int MAX_CODEC_RETRIES = 4;
    private static final String TAG = "TrackPlayer";
    static Mp3Extractor mMediaExtractor;
    static Map<String, MediaCodecWrapper> sMediaCodecWrapperMap = new HashMap();
    AudioAttributes mAudioAttr;
    int mAudioSessionId;
    final int mAudioStream;
    NeoAudioTrack mAudioTrack;
    ITrackPlayer.Listener mExternalNeoPlayerEventListener;
    MediaCodecWrapperFactory mMediaCodecWrapperFactory;
    ITrackPlayer.State mState;
    TrackPlayerThread.StreamStateChangeListener mStreamListener;
    TrackPlayerThread mTrackPlayerThread;
    private final Object mTrackPlayerThreadLock;

    static {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mpeg", 24000, 1);
        createAudioFormat.setInteger("bitrate", 48000);
        try {
            getCodec(createAudioFormat, new MediaCodecWrapperFactory());
        } catch (CodecException e) {
            Log.wtf(TAG, "Could not create initial mp3 codec: " + e.getLocalizedMessage(), e);
        }
    }

    public TrackPlayer(int i, MediaCodecWrapperFactory mediaCodecWrapperFactory) {
        this.mTrackPlayerThreadLock = new Object();
        Trace.beginSection("TrackPlayer create");
        try {
            if (mediaCodecWrapperFactory == null) {
                throw new IllegalArgumentException("MediaCodecWrapperFactory cannot be null");
            }
            this.mMediaCodecWrapperFactory = mediaCodecWrapperFactory;
            this.mAudioStream = i;
            this.mAudioAttr = new AudioAttributes.Builder().setLegacyStreamType(i).build();
            mMediaExtractor = newMp3Extractor();
            this.mStreamListener = new TrackPlayerThread.StreamStateChangeListener() { // from class: com.amazon.apl.player.neoplayer.TrackPlayer.1
                @Override // com.amazon.apl.player.neoplayer.TrackPlayerThread.StreamStateChangeListener
                public void onStreamEnded(TrackPlayerThread trackPlayerThread) {
                    TrackPlayerThread trackPlayerThread2;
                    synchronized (TrackPlayer.this.mTrackPlayerThreadLock) {
                        try {
                            TrackPlayer trackPlayer = TrackPlayer.this;
                            if (trackPlayer.mExternalNeoPlayerEventListener != null && trackPlayer.mTrackPlayerThread.hasCompletedNormally() && (trackPlayerThread2 = TrackPlayer.this.mTrackPlayerThread) != null && trackPlayerThread2.equals(trackPlayerThread)) {
                                TrackPlayer.this.mExternalNeoPlayerEventListener.onPlayerStateChanged(ITrackPlayer.NeoPlayerState.STATE_ENDED);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                @Override // com.amazon.apl.player.neoplayer.TrackPlayerThread.StreamStateChangeListener
                public void onStreamError(TrackPlayerThread trackPlayerThread, Exception exc) {
                    TrackPlayerThread trackPlayerThread2;
                    Log.e(TrackPlayer.TAG, "onStreamError", exc);
                    synchronized (TrackPlayer.this.mTrackPlayerThreadLock) {
                        try {
                            TrackPlayer trackPlayer = TrackPlayer.this;
                            if (trackPlayer.mExternalNeoPlayerEventListener != null && (trackPlayerThread2 = trackPlayer.mTrackPlayerThread) != null && trackPlayerThread2.equals(trackPlayerThread)) {
                                TrackPlayer.this.mExternalNeoPlayerEventListener.onPlayerError(exc);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                @Override // com.amazon.apl.player.neoplayer.TrackPlayerThread.StreamStateChangeListener
                public void onStreamFlushed() {
                    try {
                        TrackPlayer.this.releaseAudioTrack();
                    } catch (RuntimeException e) {
                        Log.wtf(TrackPlayer.TAG, "Exception trying to release the audio track: " + e.getMessage());
                    }
                }

                @Override // com.amazon.apl.player.neoplayer.TrackPlayerThread.StreamStateChangeListener
                public void onStreamStarted() {
                    ITrackPlayer.Listener listener = TrackPlayer.this.mExternalNeoPlayerEventListener;
                    if (listener != null) {
                        listener.onPlayerStateChanged(ITrackPlayer.NeoPlayerState.STATE_READY);
                    }
                }
            };
            this.mState = ITrackPlayer.State.STATE_STOPPED;
            this.mAudioSessionId = 0;
        } finally {
            Trace.endSection();
        }
    }

    private synchronized void configureInternal() throws TimeoutException {
        Trace.beginSection("TrackPlayer configureInternal");
        try {
            try {
                stop();
                MediaFormat trackFormat = mMediaExtractor.getTrackFormat();
                trackFormat.toString();
                Trace.beginSection("TrackPlayer configureInternal mediaCodec");
                MediaCodecWrapper codec = getCodec(trackFormat, this.mMediaCodecWrapperFactory);
                Trace.endSection();
                Trace.beginSection("TrackPlayer configureInternal audioTrack");
                try {
                    NeoAudioTrack newAudioTrack = newAudioTrack(trackFormat.getInteger("sample-rate"));
                    this.mAudioTrack = newAudioTrack;
                    if (newAudioTrack.getState() != 1) {
                        Log.e(TAG, "AudioTrack failed to initialize. State: " + this.mAudioTrack.getState());
                    }
                    this.mAudioTrack.play();
                    this.mStreamListener.onStreamStarted();
                    Trace.endSection();
                    synchronized (this.mTrackPlayerThreadLock) {
                        this.mTrackPlayerThread = newTrackPlayerThread(codec);
                    }
                    this.mState = ITrackPlayer.State.STATE_CONFIGURED;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (CodecException e) {
                Log.wtf(TAG, "Could not create mp3 codec: " + e.getLocalizedMessage());
                ITrackPlayer.Listener listener = this.mExternalNeoPlayerEventListener;
                if (listener != null) {
                    listener.onPlayerError(e);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    private static int getBytesPerFrame(int i) {
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 4;
        }
        Single$$ExternalSyntheticBUOutline0.m("Unsupported format type!");
        return 0;
    }

    private static int getChannelCount(int i) {
        if (i == 4) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        Single$$ExternalSyntheticBUOutline0.m("Unsupported format type!");
        return 0;
    }

    public static MediaCodecWrapper getCodec(MediaFormat mediaFormat, MediaCodecWrapperFactory mediaCodecWrapperFactory) throws CodecException {
        getMediaFormatString(mediaFormat);
        MediaCodecWrapper mediaCodecWrapper = sMediaCodecWrapperMap.get(mediaFormat.toString());
        if (mediaCodecWrapper != null) {
            return mediaCodecWrapper;
        }
        new StringBuilder("Creating codec for format: ").append(getMediaFormatString(mediaFormat));
        try {
            MediaCodecWrapper createMediaCodec = mediaCodecWrapperFactory.createMediaCodec("audio/mpeg");
            createMediaCodec.configure(mediaFormat, null, null, 0);
            createMediaCodec.start();
            sMediaCodecWrapperMap.put(mediaFormat.toString(), createMediaCodec);
            return createMediaCodec;
        } catch (IllegalArgumentException e) {
            throw new CodecException("Could not initialize codec to parse mp3", e);
        }
    }

    private static String getMediaFormatString(MediaFormat mediaFormat) {
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("bitrate");
        return String.format("Media format = {channel-count=%d, bitrate=%d, mime=%s, sample-rate=%d}", Integer.valueOf(integer), Integer.valueOf(integer2), mediaFormat.getString("mime"), Integer.valueOf(mediaFormat.getInteger("sample-rate") / integer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void releaseAudioTrack() throws RuntimeException {
        NeoAudioTrack neoAudioTrack = this.mAudioTrack;
        if (neoAudioTrack != null) {
            neoAudioTrack.release();
        }
    }

    private void reset() {
        reset_internal();
    }

    public AudioAttributes getAttributes() {
        return this.mAudioAttr;
    }

    @Override // com.amazon.apl.player.neoplayer.ITrackPlayer
    public long getCurrentPosition() {
        return mMediaExtractor.getCurrentPosition();
    }

    public synchronized ITrackPlayer.State getCurrentState() {
        return this.mState;
    }

    public int getSessionId() {
        return this.mAudioSessionId;
    }

    @Override // com.amazon.apl.player.neoplayer.ITrackPlayer
    public synchronized void loadStream(InputStream inputStream) throws IOException, TimeoutException {
        Trace.beginSection("TrackPlayer loadStream");
        try {
            if (this.mState == ITrackPlayer.State.STATE_RELEASED) {
                throw new IllegalStateException("Tried to loadStream from " + this.mState);
            }
            stop();
            ITrackPlayer.Listener listener = this.mExternalNeoPlayerEventListener;
            if (listener != null) {
                listener.onPlayerStateChanged(ITrackPlayer.NeoPlayerState.STATE_PREPARING);
            }
            mMediaExtractor.setDataSource(inputStream);
            configureInternal();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public NeoAudioTrack newAudioTrack(int i) {
        Trace.beginSection("TrackPlayer newAudioTrack");
        try {
            return new NeoAudioTrack(this.mAudioAttr, new AudioFormat.Builder().setSampleRate(i).setEncoding(2).setChannelMask(4).build(), Math.max(((int) (getChannelCount(4) * i * 0.33d)) * getBytesPerFrame(2), AudioTrack.getMinBufferSize(i, 4, 2)), 1, this.mAudioSessionId);
        } finally {
            Trace.endSection();
        }
    }

    public Mp3Extractor newMp3Extractor() {
        if (mMediaExtractor == null) {
            mMediaExtractor = new Mp3Extractor();
        }
        return mMediaExtractor;
    }

    public TrackPlayerThread newTrackPlayerThread(MediaCodecWrapper mediaCodecWrapper) {
        return new TrackPlayerThread(this, mMediaExtractor, mediaCodecWrapper, this.mAudioTrack, this.mStreamListener);
    }

    @Override // com.amazon.apl.player.neoplayer.ITrackPlayer
    public synchronized void play() throws TimeoutException {
        Trace.beginSection("TrackPlayer play");
        try {
            Objects.toString(this.mState);
            if (this.mState != ITrackPlayer.State.STATE_CONFIGURED) {
                throw new IllegalStateException("Tried to play track when in state " + this.mState.name());
            }
            this.mTrackPlayerThread.startPlayback();
            this.mState = ITrackPlayer.State.STATE_RUNNING;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.amazon.apl.player.neoplayer.ITrackPlayer
    public synchronized void release() {
        Trace.beginSection("TrackPlayer release");
        try {
            if (this.mState == ITrackPlayer.State.STATE_RELEASED) {
                Log.w(TAG, "Releasing, but was already released.");
                return;
            }
            try {
                stop();
            } catch (TimeoutException e) {
                Log.e(TAG, "Stop timed out waiting from task to finish.", e);
            }
            this.mExternalNeoPlayerEventListener = null;
            this.mState = ITrackPlayer.State.STATE_RELEASED;
        } finally {
            Trace.endSection();
        }
    }

    public MediaCodecWrapper releaseAndRecreateCodec(MediaCodecWrapper mediaCodecWrapper) throws CodecException {
        Objects.toString(mediaCodecWrapper);
        MediaFormat trackFormat = mMediaExtractor.getTrackFormat();
        releaseCodec(mediaCodecWrapper);
        return getCodec(trackFormat, this.mMediaCodecWrapperFactory);
    }

    public void releaseCodec(MediaCodecWrapper mediaCodecWrapper) {
        Objects.toString(mediaCodecWrapper);
        if (mediaCodecWrapper != null) {
            mediaCodecWrapper.release();
            sMediaCodecWrapperMap.values().remove(mediaCodecWrapper);
        }
    }

    public List<Exception> reset_internal() {
        ArrayList arrayList = new ArrayList();
        Trace.beginSection("TrackPlayer reset");
        try {
            NeoAudioTrack neoAudioTrack = this.mAudioTrack;
            if (neoAudioTrack != null) {
                try {
                    neoAudioTrack.stop();
                } catch (RuntimeException e) {
                    Log.i(TAG, "Exception trying to stop the audio track: " + e.getMessage());
                    arrayList.add(e);
                }
                try {
                    releaseAudioTrack();
                } catch (RuntimeException e2) {
                    Log.i(TAG, "Exception trying to release the audio track: " + e2.getMessage());
                    arrayList.add(e2);
                }
                this.mAudioTrack = null;
            }
            this.mState = ITrackPlayer.State.STATE_STOPPED;
            ITrackPlayer.Listener listener = this.mExternalNeoPlayerEventListener;
            if (listener != null) {
                listener.onPlayerStateChanged(ITrackPlayer.NeoPlayerState.STATE_IDLE);
            }
            Objects.toString(this.mState);
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.amazon.apl.player.neoplayer.ITrackPlayer
    public void setAttributes(AudioAttributes audioAttributes) {
        this.mAudioAttr = new AudioAttributes.Builder(audioAttributes).build();
        reset();
    }

    @Override // com.amazon.apl.player.neoplayer.ITrackPlayer
    public synchronized void setListener(ITrackPlayer.Listener listener) {
        this.mExternalNeoPlayerEventListener = listener;
    }

    public void setSessionId(int i) {
        this.mAudioSessionId = i;
        reset();
    }

    @Override // com.amazon.apl.player.neoplayer.ITrackPlayer
    public synchronized void stop() throws TimeoutException {
        Trace.beginSection("TrackPlayer stop");
        try {
            Objects.toString(this.mState);
            if (this.mState == ITrackPlayer.State.STATE_RUNNING) {
                this.mTrackPlayerThread.stopAndWait();
                this.mState = ITrackPlayer.State.STATE_STOPPED;
            }
        } finally {
            reset();
            Trace.endSection();
        }
    }

    public TrackPlayer(int i) {
        this(i, new MediaCodecWrapperFactory());
    }
}
