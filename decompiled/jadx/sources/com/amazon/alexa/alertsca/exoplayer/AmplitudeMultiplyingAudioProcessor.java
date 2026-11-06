package com.amazon.alexa.alertsca.exoplayer;

import android.util.Log;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class AmplitudeMultiplyingAudioProcessor implements AudioProcessor {
    private static final String TAG = "AmplitudeMultiplyingAudioProcessor";
    private ByteBuffer buffer;
    private int channelCount;
    private boolean inputEnded;
    private boolean isAmplificationEnabled;
    private float multiplier = 1.0f;
    private ByteBuffer outputBuffer;
    private int sampleRateHz;

    @Inject
    public AmplitudeMultiplyingAudioProcessor() {
        init();
    }

    private void init() {
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = ByteBuffer.allocateDirect(byteBuffer.capacity()).order(ByteOrder.nativeOrder());
        this.outputBuffer = byteBuffer;
        this.channelCount = -1;
        this.sampleRateHz = -1;
        this.isAmplificationEnabled = false;
        this.multiplier = 1.0f;
    }

    private void prepareForOutput(int i) {
        if (this.buffer.capacity() < i) {
            this.buffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            return audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    public void enableAmplification(boolean z) {
        Automotive$$ExternalSyntheticOutline0.m8396m("amplification enabled: ", TAG, z);
        this.isAmplificationEnabled = z;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = ByteBuffer.allocateDirect(byteBuffer.capacity()).order(ByteOrder.nativeOrder());
        this.outputBuffer = byteBuffer;
        this.inputEnded = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return isAmplificationEnabled();
    }

    public boolean isAmplificationEnabled() {
        return this.isAmplificationEnabled;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        return this.inputEnded && this.outputBuffer == AudioProcessor.EMPTY_BUFFER;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
        this.inputEnded = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        prepareForOutput(byteBuffer.remaining());
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            ByteBuffer byteBuffer2 = this.buffer;
            if (!hasRemaining) {
                byteBuffer2.flip();
                this.outputBuffer = this.buffer;
                return;
            }
            byteBuffer2.putShort((short) (byteBuffer.getShort() * this.multiplier));
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        flush();
        init();
    }

    public void setMultiplier(float f) {
        Log.i(TAG, "setting multiplier to: " + f);
        this.multiplier = f;
    }
}
