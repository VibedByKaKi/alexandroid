package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class WakeWordAudioCapturer {
    private static final String TAG = "WakeWordAudioCapturer";
    private final byte[] audioBuffer;
    private final int bufferShortsSize;
    private int bytesRead;
    private final InputStream inputStream;
    private final OutputStream outputStream;
    private boolean canRead = true;
    private volatile boolean processing = true;

    public WakeWordAudioCapturer(InputStream inputStream, OutputStream outputStream, int i) {
        this.inputStream = inputStream;
        this.outputStream = outputStream;
        int i2 = i * 2;
        this.bufferShortsSize = i2;
        this.audioBuffer = new byte[i2];
    }

    @VisibleForTesting
    public static short[] convertBytesToShorts(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        short[] sArr = new short[wrap.limit() / 2];
        wrap.asShortBuffer().get(sArr);
        return sArr;
    }

    public boolean canRead() {
        return this.processing && this.canRead;
    }

    public short[] read() throws IOException {
        transferData();
        int i = this.bytesRead;
        if (i == this.bufferShortsSize) {
            return convertBytesToShorts(this.audioBuffer);
        }
        if (i == -1) {
            Buffer$$ExternalSyntheticBUOutline0.m$3("Stream closed early");
            return null;
        }
        throw new IOException("Buffer underrun -- wanted " + this.bufferShortsSize + " samples, but got " + this.bytesRead);
    }

    public void release() {
        Log.i(TAG, "release");
        try {
            this.inputStream.close();
            this.outputStream.close();
        } catch (IOException e) {
            Log.e(TAG, "Failed to close input stream", e);
        }
    }

    public void stopProcessing() {
        Log.i(TAG, "wake word: stopProcessing");
        this.processing = false;
    }

    public void transferData() throws IOException {
        int read = this.inputStream.read(this.audioBuffer, 0, this.bufferShortsSize);
        this.bytesRead = read;
        if (read > 0 && this.processing) {
            this.outputStream.write(this.audioBuffer, 0, this.bytesRead);
        }
        this.canRead = this.bytesRead == this.bufferShortsSize;
    }
}
