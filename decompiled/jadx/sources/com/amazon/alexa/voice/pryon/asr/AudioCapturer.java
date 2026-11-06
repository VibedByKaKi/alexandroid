package com.amazon.alexa.voice.pryon.asr;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AudioCapturer {
    private static final int SIXTEEN_KHZ = 16000;
    private static final String TAG = "AudioCapturer";
    private static final int TEST_SAMPLE_RATE = 44100;
    private AcousticEchoCanceler acousticEchoCanceler;
    private short[] audioBuffer;
    private AudioRecord audioRecord;
    private final int bufferSize;
    private final int bytesBufferSize;
    private NoiseSuppressor noiseSuppressor;

    public AudioCapturer(int i, boolean z, boolean z2, boolean z3) {
        this.bufferSize = i;
        this.bytesBufferSize = i * 2;
        this.audioBuffer = new short[i];
        this.acousticEchoCanceler = null;
        this.noiseSuppressor = null;
        try {
            AudioRecord buildAudioRecord = buildAudioRecord(z3);
            this.audioRecord = buildAudioRecord;
            if (z) {
                requestAcousticEchoCanceler(buildAudioRecord.getAudioSessionId());
            }
            if (z2) {
                requestNoiseSuppressor(this.audioRecord.getAudioSessionId());
            }
            try {
                this.audioRecord.startRecording();
            } catch (IllegalStateException e) {
                String str = "AudioRecord startRecording() failed. " + logCurrentAudioRecord();
                this.audioRecord.release();
                throw new AudioRecordException(str + logTestAudioRecord(TEST_SAMPLE_RATE), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new AudioRecordException("Unable to instantiate test Audio Record object with audioSource: 1, sampleRate: 16000, channel: 16, encoding: 2, bufferSize: " + this.bytesBufferSize, e2);
        }
    }

    private AudioRecord buildAudioRecord(boolean z) {
        String str = TAG;
        Log.i(str, "AudioCapturer AudioRecord is constructed.");
        int i = z ? 6 : 1;
        Log.i(str, "Using Audio source as : " + i);
        return new AudioRecord(i, 16000, 16, 2, this.bytesBufferSize);
    }

    private String buildAudioRecordData(int i, int i2, int i3, int i4, int i5) {
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "AudioRecord {audioSource: ", ", sampleRate: ", ", channel: ");
        TableInfo$$ExternalSyntheticOutline0.m(m29m, i3, ", encoding: ", i4, ", bufferSize: ");
        m29m.append(i5);
        return m29m.toString();
    }

    private String checkAudioRecord(AudioRecord audioRecord, int i) {
        String str = buildAudioRecordData(audioRecord.getAudioSource(), audioRecord.getSampleRate(), audioRecord.getChannelConfiguration(), audioRecord.getAudioFormat(), i) + ", minRequiredBufferSize: " + AudioRecord.getMinBufferSize(audioRecord.getSampleRate(), audioRecord.getChannelConfiguration(), audioRecord.getAudioFormat()) + ", ";
        return audioRecord.getState() == 1 ? str.concat("initialized: true} ") : str.concat("initialized: false} ");
    }

    private String logCurrentAudioRecord() {
        return checkAudioRecord(this.audioRecord, this.bytesBufferSize);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String logTestAudioRecord(int r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Testing if device supports sampling rate of "
            java.lang.String r1 = ". "
            java.lang.String r0 = defpackage.a$$ExternalSyntheticOutline0.m(r9, r0, r1)
            android.media.AudioRecord r1 = new android.media.AudioRecord     // Catch: java.lang.IllegalArgumentException -> L16
            int r6 = r8.bytesBufferSize     // Catch: java.lang.IllegalArgumentException -> L16
            r2 = 1
            r4 = 16
            r5 = 2
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L17
            r2 = r8
            goto L2a
        L16:
            r3 = r9
        L17:
            r6 = 2
            int r7 = r8.bytesBufferSize
            r4 = r3
            r3 = 1
            r5 = 16
            r2 = r8
            java.lang.String r8 = r2.buildAudioRecordData(r3, r4, r5, r6, r7)
            java.lang.String r9 = "Unable to instantiate test Audio Record object with "
            java.lang.String r0 = defpackage.a$$ExternalSyntheticOutline0.m$1(r0, r9, r8)
            r1 = 0
        L2a:
            if (r1 == 0) goto L40
            java.lang.StringBuilder r8 = androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0.m(r0)
            int r9 = r2.bytesBufferSize
            java.lang.String r9 = r2.checkAudioRecord(r1, r9)
            r8.append(r9)
            java.lang.String r0 = r8.toString()
            r1.release()
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.voice.pryon.asr.AudioCapturer.logTestAudioRecord(int):java.lang.String");
    }

    private void releaseAcousticEchoCanceler() {
        AcousticEchoCanceler acousticEchoCanceler = this.acousticEchoCanceler;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.setEnabled(false);
            this.acousticEchoCanceler.release();
            this.acousticEchoCanceler = null;
        }
    }

    private void releaseNoiseSuppressor() {
        NoiseSuppressor noiseSuppressor = this.noiseSuppressor;
        if (noiseSuppressor != null) {
            noiseSuppressor.setEnabled(false);
            this.noiseSuppressor.release();
            this.noiseSuppressor = null;
        }
    }

    private void requestAcousticEchoCanceler(int i) {
        if (!AcousticEchoCanceler.isAvailable()) {
            Log.i(TAG, "AcousticEchoCanceller is not available");
            return;
        }
        AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
        this.acousticEchoCanceler = create;
        if (create != null) {
            create.setEnabled(true);
        } else {
            Log.i(TAG, "Device does not implement AcousticEchoCanceler");
        }
    }

    private void requestNoiseSuppressor(int i) {
        if (!NoiseSuppressor.isAvailable()) {
            Log.i(TAG, "NoiseSuppressor is not available");
            return;
        }
        NoiseSuppressor create = NoiseSuppressor.create(i);
        this.noiseSuppressor = create;
        if (create != null) {
            create.setEnabled(true);
        } else {
            Log.i(TAG, "NoiseSuppressor.create() returned null.");
        }
    }

    public short[] read() throws IOException {
        int read = this.audioRecord.read(this.audioBuffer, 0, this.bufferSize);
        if (this.bufferSize == read) {
            return this.audioBuffer;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(ParcelCompat$$ExternalSyntheticOutline0.m(" many shorts, but got ", this.bufferSize, read, new StringBuilder("Buffer underrun -- wanted ")));
        return null;
    }

    public void release() {
        Log.i(TAG, "AudioCapturer AudioRecord.stop() and AudioRecord.release() are called.");
        releaseAcousticEchoCanceler();
        releaseNoiseSuppressor();
        this.audioRecord.stop();
        this.audioRecord.release();
        this.audioRecord = null;
    }

    public AudioCapturer(int i, boolean z, boolean z2) {
        this(i, z, z2, false);
    }
}
