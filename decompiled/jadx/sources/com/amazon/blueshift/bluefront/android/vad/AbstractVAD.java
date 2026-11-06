package com.amazon.blueshift.bluefront.android.vad;

import android.os.SystemClock;
import com.amazon.blueshift.bluefront.android.vad.VoiceActivityDetector;
import com.amazon.blueshift.bluefront.android.vad.config.VADConfig;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class AbstractVAD<T extends VADConfig> implements VoiceActivityDetector {
    private static final int FRAME_DURATION = 10;
    private static final int VAD_FRAMES_PER_SEC = 100;
    private final int mEndpointingThreshold;
    private final int mSampleRate;
    private final ShortBuffer mSamplesBuffer;
    private long mStartpointedAt;
    private final int mStartpointingThreshold;
    private ByteBuffer mVAD;
    private final int mWakewordStartOfUtteranceEndpointingThreshold;
    private int mConsecutiveSpeechFrames = 0;
    private int mConsecutiveNonSpeechFrames = 0;
    private VoiceActivityDetector.VADState mVADState = VoiceActivityDetector.VADState.NOT_STARTPOINTED;

    static {
        System.loadLibrary("blueshift-audioprocessing");
    }

    public AbstractVAD(int i, T t) {
        this.mSampleRate = i;
        this.mStartpointingThreshold = t.getStartpointingThreshold();
        this.mEndpointingThreshold = t.getEndpointingThreshold();
        this.mWakewordStartOfUtteranceEndpointingThreshold = t.getWakewordStartOfUtteranceEndpointingThreshold();
        this.mVAD = setupVAD(t);
        this.mSamplesBuffer = ShortBuffer.wrap(new short[i / 100]);
    }

    private boolean atStartOfWakewordUtterance() {
        return (SystemClock.elapsedRealtime() - this.mStartpointedAt) / 10 < ((long) this.mWakewordStartOfUtteranceEndpointingThreshold);
    }

    @Override // com.amazon.blueshift.bluefront.android.vad.VoiceActivityDetector, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        ByteBuffer byteBuffer = this.mVAD;
        if (byteBuffer != null) {
            destroyVAD(byteBuffer);
            this.mVAD = null;
        }
    }

    public native ByteBuffer createVAD(boolean z);

    public native int destroyVAD(ByteBuffer byteBuffer);

    public native int isSpeech(ByteBuffer byteBuffer, short[] sArr, int i);

    @Override // com.amazon.blueshift.bluefront.android.vad.VoiceActivityDetector
    public final synchronized VoiceActivityDetector.VADState processSamples(short[] sArr, int i) throws VADException {
        try {
            if (this.mVAD == null) {
                throw new VADException("VAD is not initialized");
            }
            int i2 = 0;
            while (true) {
                int remaining = this.mSamplesBuffer.remaining();
                int i3 = i - i2;
                ShortBuffer shortBuffer = this.mSamplesBuffer;
                if (remaining <= i3) {
                    int remaining2 = shortBuffer.remaining();
                    this.mSamplesBuffer.put(sArr, i2, remaining2);
                    i2 += remaining2;
                    int isSpeech = isSpeech(this.mVAD, this.mSamplesBuffer.array(), this.mSampleRate);
                    this.mSamplesBuffer.clear();
                    if (isSpeech == 1) {
                        this.mConsecutiveSpeechFrames++;
                        this.mConsecutiveNonSpeechFrames = 0;
                    } else {
                        if (isSpeech != 0) {
                            throw new VADException("Error processing speech frames");
                        }
                        this.mConsecutiveNonSpeechFrames++;
                        this.mConsecutiveSpeechFrames = 0;
                    }
                    updateVADState();
                } else {
                    shortBuffer.put(sArr, i2, i3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mVADState;
    }

    public native int setDNNThreshold(ByteBuffer byteBuffer, float f);

    public native int setWebRtcCustomizedMode(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    public native int setWebRtcMode(ByteBuffer byteBuffer, int i);

    public abstract ByteBuffer setupVAD(T t);

    public void updateVADState() {
        VoiceActivityDetector.VADState vADState = this.mVADState;
        if (vADState == VoiceActivityDetector.VADState.NOT_STARTPOINTED && this.mConsecutiveSpeechFrames >= this.mStartpointingThreshold) {
            this.mVADState = VoiceActivityDetector.VADState.STARTPOINTED;
            this.mStartpointedAt = SystemClock.elapsedRealtime();
        } else {
            if (vADState != VoiceActivityDetector.VADState.STARTPOINTED || this.mConsecutiveNonSpeechFrames < this.mEndpointingThreshold) {
                return;
            }
            if (this.mWakewordStartOfUtteranceEndpointingThreshold == 0 || !atStartOfWakewordUtterance()) {
                this.mVADState = VoiceActivityDetector.VADState.ENDPOINTED;
            }
        }
    }
}
