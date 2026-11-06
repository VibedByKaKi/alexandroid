package com.amazon.alexa.audiopersonalization.components;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ToneTask implements Runnable {
    private static final int NUM_CHANNELS = 2;
    private static final int SAMPLE_RATE = 44100;
    public static final double SCALAR_MAX_VOLUME = 1000.0d;
    private static final String TAG = "ToneTask";
    private final Tone mTone;

    public ToneTask(Tone tone) {
        this.mTone = tone;
    }

    private void adjustBufferToFadeIn(float[] fArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            float f = i2 / i;
            fArr[i3] = fArr[i3] * f;
            int i4 = i3 + 1;
            fArr[i4] = fArr[i4] * f;
        }
    }

    private void adjustBufferToFadeOut(float[] fArr, int i, int i2) {
        int i3 = 0;
        int i4 = i2;
        while (i3 < i && (i4 * 2) + 1 < fArr.length) {
            int i5 = i2 + i3;
            int i6 = i5 * 2;
            float f = (float) ((i - i3) / i);
            fArr[i6] = fArr[i6] * f;
            int i7 = i6 + 1;
            fArr[i7] = fArr[i7] * f;
            i3++;
            i4 = i5;
        }
    }

    private AudioTrack constructAudioTrack() {
        return new AudioTrack(new AudioAttributes.Builder().setContentType(2).setUsage(1).build(), new AudioFormat.Builder().setSampleRate(SAMPLE_RATE).setEncoding(4).setChannelMask(12).build(), AudioTrack.getMinBufferSize(SAMPLE_RATE, 12, 4), 1, 0);
    }

    private float[] generateAudioBuffer(Tone tone) {
        int i = (((tone.fade * 2) + tone.duration) * SAMPLE_RATE) / 1000;
        float[] fArr = new float[i * 2];
        for (int i2 = 0; i2 < i; i2++) {
            float sin = (float) ((Math.sin(((tone.frequency * 6.283185307179586d) * i2) / 44100.0d) * getScalarVolumeFromDBFS(tone.volume)) / 1000.0d);
            if (tone.isLeftChannelOn()) {
                fArr[i2 * 2] = sin;
            }
            if (tone.isRightChannelOn()) {
                fArr[(i2 * 2) + 1] = sin;
            }
        }
        return fArr;
    }

    private double getScalarVolumeFromDBFS(double d) {
        return Math.pow(10.0d, d / 20.0d) * 1000.0d;
    }

    private void playFadeOut(AudioTrack audioTrack, float[] fArr, int i, int i2) {
        String str = this.mTone.requestId;
        for (int i3 = 0; i3 < i2; i3++) {
            audioTrack.setVolume(0.0f);
            if (audioTrack.write(fArr, (i + i3) * 2, 2, 0) != 2) {
                Log.e(TAG, "Error writing data in tone fade out.");
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = this.mTone.requestId;
        AudioTrack constructAudioTrack = constructAudioTrack();
        float[] generateAudioBuffer = generateAudioBuffer(this.mTone);
        int i = (this.mTone.fade * SAMPLE_RATE) / 1000;
        adjustBufferToFadeIn(generateAudioBuffer, i);
        int length = generateAudioBuffer.length / 2;
        int i2 = length - i;
        float[] copyOf = Arrays.copyOf(generateAudioBuffer, generateAudioBuffer.length);
        adjustBufferToFadeOut(generateAudioBuffer, i, i2);
        constructAudioTrack.play();
        int i3 = 0;
        while (i3 < length && (!Thread.interrupted() || i3 >= i2)) {
            if (constructAudioTrack.write(generateAudioBuffer, i3 * 2, 2, 0) != 2) {
                Log.e(TAG, "Error writing tone audio data.");
            }
            i3++;
        }
        playFadeOut(constructAudioTrack, copyOf, i3, i);
        constructAudioTrack.release();
        String str2 = this.mTone.requestId;
    }
}
