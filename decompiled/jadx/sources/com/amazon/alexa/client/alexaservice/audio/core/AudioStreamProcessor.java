package com.amazon.alexa.client.alexaservice.audio.core;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class AudioStreamProcessor implements Callable<Void> {

    @VisibleForTesting
    private static final int BUFFER_SIZE_IN_BYTES = 960;
    private static final int SAMPLE_SIZE = 320;
    private static final String TAG = "AudioStreamProcessor";
    private final ScaledVolumeProcessor audioProcessor;
    private volatile boolean closed;
    private final InputStream inputStream;
    private final OutputStream outputStream;
    private final ByteBuffer activeListeningBuffer = ByteBuffer.allocate(960);
    private final AtomicReference<Float> lastScaledVolume = new AtomicReference<>();

    public AudioStreamProcessor(InputStream inputStream, OutputStream outputStream, ScaledVolumeProcessor scaledVolumeProcessor) {
        this.inputStream = inputStream;
        this.outputStream = outputStream;
        this.audioProcessor = scaledVolumeProcessor;
    }

    private void calculateVolumeIfBufferIsFull(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.activeListeningBuffer;
        byteBuffer.put(bArr, 0, Math.min(i, byteBuffer.remaining()));
        if (this.activeListeningBuffer.hasRemaining()) {
            return;
        }
        this.lastScaledVolume.set(Float.valueOf(this.audioProcessor.computeScaledVolume(this.activeListeningBuffer.array(), this.activeListeningBuffer.capacity())));
        this.activeListeningBuffer.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0058, code lost:
    
        android.util.Log.e(r1, "No data was written to the output stream");
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Void call() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 320(0x140, float:4.48E-43)
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = r1
        L6:
            boolean r3 = r5.closed     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            if (r3 != 0) goto L2f
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            java.io.InputStream r3 = r5.inputStream     // Catch: java.lang.Throwable -> L15
            int r3 = r3.read(r0)     // Catch: java.lang.Throwable -> L15
            if (r3 >= 0) goto L17
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L15
            goto L2f
        L15:
            r0 = move-exception
            goto L29
        L17:
            if (r3 <= 0) goto L27
            java.io.OutputStream r4 = r5.outputStream     // Catch: java.lang.Throwable -> L15
            r4.write(r0, r1, r3)     // Catch: java.lang.Throwable -> L15
            java.io.OutputStream r4 = r5.outputStream     // Catch: java.lang.Throwable -> L15
            r4.flush()     // Catch: java.lang.Throwable -> L15
            r5.calculateVolumeIfBufferIsFull(r0, r3)     // Catch: java.lang.Throwable -> L15
            r2 = 1
        L27:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L15
            goto L6
        L29:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L2b:
            r0 = move-exception
            goto L62
        L2d:
            r0 = move-exception
            goto L47
        L2f:
            if (r2 != 0) goto L38
            java.lang.String r0 = com.amazon.alexa.client.alexaservice.audio.core.AudioStreamProcessor.TAG
            java.lang.String r1 = "No data was written to the output stream"
            android.util.Log.e(r0, r1)
        L38:
            java.io.OutputStream r5 = r5.outputStream     // Catch: java.io.IOException -> L3e
        L3a:
            r5.close()     // Catch: java.io.IOException -> L3e
            goto L60
        L3e:
            r5 = move-exception
            java.lang.String r0 = com.amazon.alexa.client.alexaservice.audio.core.AudioStreamProcessor.TAG
            java.lang.String r1 = "Failed to close output stream"
            android.util.Log.e(r0, r1, r5)
            goto L60
        L47:
            java.lang.String r1 = com.amazon.alexa.client.alexaservice.audio.core.AudioStreamProcessor.TAG     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "Error transferring data from input stream to output stream"
            android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r5.closed     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L56
            if (r2 == 0) goto L55
            goto L56
        L55:
            throw r0     // Catch: java.lang.Throwable -> L2b
        L56:
            if (r2 != 0) goto L5d
            java.lang.String r0 = "No data was written to the output stream"
            android.util.Log.e(r1, r0)
        L5d:
            java.io.OutputStream r5 = r5.outputStream     // Catch: java.io.IOException -> L3e
            goto L3a
        L60:
            r5 = 0
            return r5
        L62:
            if (r2 != 0) goto L6b
            java.lang.String r1 = com.amazon.alexa.client.alexaservice.audio.core.AudioStreamProcessor.TAG
            java.lang.String r2 = "No data was written to the output stream"
            android.util.Log.e(r1, r2)
        L6b:
            java.io.OutputStream r5 = r5.outputStream     // Catch: java.io.IOException -> L71
            r5.close()     // Catch: java.io.IOException -> L71
            goto L79
        L71:
            r5 = move-exception
            java.lang.String r1 = com.amazon.alexa.client.alexaservice.audio.core.AudioStreamProcessor.TAG
            java.lang.String r2 = "Failed to close output stream"
            android.util.Log.e(r1, r2, r5)
        L79:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.client.alexaservice.audio.core.AudioStreamProcessor.call():java.lang.Void");
    }

    public void close() {
        this.closed = true;
    }

    @Nullable
    public Float getLatestScaledVolume() {
        return this.lastScaledVolume.get();
    }
}
