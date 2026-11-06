package com.amazon.alexa.client.alexaservice.vad.audio;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.client.alexaservice.vad.detector.VoiceActivityDetectionData;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VADAudioPipeline {
    private static final String TAG = "VADAudioPipeline";
    private final CircularAudioBuffer buffer;

    @Nullable
    private OutputStream currentStream;
    private final int prerollSamples;
    private volatile boolean streaming;

    public VADAudioPipeline(int i, int i2, int i3) {
        this.prerollSamples = (i * i2) / 1000;
        this.buffer = new CircularAudioBuffer(Math.max(0, i3) + i, i2);
    }

    @VisibleForTesting
    public static byte[] shortsToBytes(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i = 0; i < sArr.length; i++) {
            int i2 = i * 2;
            short s = sArr[i];
            bArr[i2] = (byte) (s & 255);
            bArr[i2 + 1] = (byte) ((s >> 8) & 255);
        }
        return bArr;
    }

    private void stopStreamingInternal() {
        OutputStream outputStream = this.currentStream;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                Log.e(TAG, "Error closing stream", e);
            }
            this.currentStream = null;
        }
        this.streaming = false;
    }

    public void clearBuffer() {
        this.buffer.clear();
    }

    @VisibleForTesting
    public AlexaAudioSink createAudioSink() throws IOException {
        return new AlexaAudioSink();
    }

    @VisibleForTesting
    public CircularAudioBuffer getBuffer() {
        return this.buffer;
    }

    public boolean isStreaming() {
        return this.streaming;
    }

    @Nullable
    public VoiceActivityDetectionData prepareSpeechData(long j, float f, int i) {
        AlexaAudioSink alexaAudioSink;
        OutputStream outputStream;
        try {
            alexaAudioSink = createAudioSink();
            try {
                outputStream = alexaAudioSink.openForWriting();
            } catch (Exception e) {
                e = e;
                outputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
            alexaAudioSink = null;
            outputStream = null;
        }
        try {
            short[] extractPreroll = this.buffer.extractPreroll(this.prerollSamples + Math.max(0, i));
            if (extractPreroll.length > 0) {
                outputStream.write(shortsToBytes(extractPreroll));
                outputStream.flush();
            }
            return new VoiceActivityDetectionData(alexaAudioSink, j, f);
        } catch (Exception e3) {
            e = e3;
            Log.e(TAG, "Failed to create audio sink or write preroll", e);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                    Log.e(TAG, "Error closing output stream during cleanup", e4);
                }
            }
            if (alexaAudioSink != null) {
                alexaAudioSink.abandon();
            }
            return null;
        }
    }

    public synchronized void startStreaming(OutputStream outputStream) {
        try {
            if (this.streaming) {
                stopStreamingInternal();
            }
            this.currentStream = outputStream;
            this.streaming = true;
            Log.i(TAG, "Streaming started");
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void stopStreaming() {
        stopStreamingInternal();
    }

    public void writeFrame(short[] sArr) {
        if (sArr == null || sArr.length == 0) {
            return;
        }
        this.buffer.write(sArr);
        if (this.streaming) {
            try {
                synchronized (this) {
                    try {
                        if (this.streaming && this.currentStream != null) {
                            this.currentStream.write(shortsToBytes(sArr));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IOException e) {
                Log.e(TAG, "Error writing to stream, stopping streaming", e);
                stopStreaming();
            }
        }
    }

    public VADAudioPipeline(int i, int i2) {
        this(i, i2, 0);
    }

    @Nullable
    public VoiceActivityDetectionData prepareSpeechData(long j, float f) {
        return prepareSpeechData(j, f, 0);
    }
}
