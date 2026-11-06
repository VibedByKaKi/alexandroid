package com.amazon.alexa.client.alexaservice.audio.core.opus;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.networking.attachments.DataFormat;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import com.amazon.opus.OpusEncoder;
import com.amazon.opus.OpusError;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class OpusEncodingInputStream extends InputStream {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final int NUMBER_OF_CHANNELS = 1;
    private static final int OPUS_APPLICATION_AUDIO = 2049;
    private static final int OPUS_BITRATE = 32000;
    private static final int OPUS_COMPLEXITY = 4;
    private static final int OPUS_ENCODED_SIZE_IN_BYTES = 80;
    private static final int OPUS_FRAME_SIZE_IN_SAMPLES = 320;
    private static final int PCM_FRAME_SIZE_IN_BYTES = 320;
    private static final int PIPE_BUFFER_SIZE = 48000;
    private static final int SAMPLE_RATE = 16000;
    private static final DataFormat SUPPORTED_DATA_FORMAT = DataFormat.LPCM16;
    private static final String TAG = "OpusEncodingInputStream";
    private static final int VALUE_OF_VBR = 0;
    private OpusEncoder encoder;
    private final ExecutorService executorService;
    private final PipedInputStream opusInputStream;
    private final InputStream originalInputStream;
    private final PipedOutputStream pipedOutputStream;
    private volatile boolean processing;

    @VisibleForTesting
    public OpusEncodingInputStream(InputStream inputStream, ExecutorService executorService) {
        this.processing = true;
        this.originalInputStream = inputStream;
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        this.pipedOutputStream = pipedOutputStream;
        PipedInputStream pipedInputStream = new PipedInputStream(48000);
        this.opusInputStream = pipedInputStream;
        this.executorService = executorService;
        try {
            pipedOutputStream.connect(pipedInputStream);
        } catch (IOException e) {
            Log.e(TAG, "Failed to connect stream", e);
        }
        executorService.submit(new EncodeOpusStreamRunnable(this, 0));
    }

    public static boolean isSupported(DataFormat dataFormat) {
        return SUPPORTED_DATA_FORMAT.equals(dataFormat);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.processing = false;
        this.executorService.shutdown();
        this.pipedOutputStream.close();
        this.originalInputStream.close();
        OpusEncoder opusEncoder = this.encoder;
        if (opusEncoder != null) {
            opusEncoder.close();
        }
        this.opusInputStream.close();
    }

    public OpusEncoder getEncoder() {
        if (this.encoder == null) {
            OpusEncoder opusEncoder = new OpusEncoder();
            this.encoder = opusEncoder;
            opusEncoder.init(16000, 1, 2049);
            this.encoder.setBitrate(OPUS_BITRATE);
            this.encoder.setComplexity(4);
            this.encoder.useVbr(0);
        }
        return this.encoder;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.opusInputStream.read();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class EncodeOpusStreamRunnable implements Runnable {
        private EncodeOpusStreamRunnable() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [com.amazon.alexa.client.alexaservice.audio.core.opus.OpusEncodingInputStream$EncodeOpusStreamRunnable] */
        /* JADX WARN: Type inference failed for: r9v1, types: [com.amazon.alexa.client.alexaservice.audio.core.opus.OpusEncodingInputStream$EncodeOpusStreamRunnable] */
        /* JADX WARN: Type inference failed for: r9v12, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r9v14, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v7 */
        @Override // java.lang.Runnable
        public void run() {
            int i;
            Log.i(OpusEncodingInputStream.TAG, "Beginning Opus encoding streams");
            try {
                try {
                    try {
                        try {
                            byte[] bArr = new byte[640];
                            byte[] bArr2 = new byte[80];
                            int i2 = 0;
                            int i3 = 0;
                            while (OpusEncodingInputStream.this.processing) {
                                try {
                                    i = OpusEncodingInputStream.this.originalInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                } catch (IOException unused) {
                                    int i4 = OpusEncodingInputStream.$r8$clinit;
                                    i = 0;
                                }
                                if (i > 0) {
                                    i2 += i;
                                    int encode = OpusEncodingInputStream.this.getEncoder().encode(bArr, 320, bArr2);
                                    if (encode > 0) {
                                        OpusEncodingInputStream.this.pipedOutputStream.write(bArr2);
                                        i3 += encode;
                                        Log.i(OpusEncodingInputStream.TAG, "Stats: totalRawBytesRead = " + i2 + ", totalEncodedBytesRead = " + i3);
                                    }
                                } else {
                                    OpusEncodingInputStream.this.processing = false;
                                }
                            }
                            OpusEncodingInputStream.this.opusInputStream.close();
                            OpusEncodingInputStream.this.pipedOutputStream.close();
                            this = OpusEncodingInputStream.this.originalInputStream;
                        } catch (OpusError e) {
                            Log.e(OpusEncodingInputStream.TAG, "Encountered an Opus encoding error", e);
                            OpusEncodingInputStream.this.opusInputStream.close();
                            OpusEncodingInputStream.this.pipedOutputStream.close();
                            this = OpusEncodingInputStream.this.originalInputStream;
                            this.close();
                            Log.i(OpusEncodingInputStream.TAG, "Ending Opus encoding");
                        }
                    } finally {
                        this.close();
                        Log.i(OpusEncodingInputStream.TAG, "Ending Opus encoding");
                    }
                    this.close();
                } catch (IOException unused2) {
                    Log.e(OpusEncodingInputStream.TAG, "Failed to close streams");
                }
                Log.i(OpusEncodingInputStream.TAG, "Ending Opus encoding");
            } catch (Throwable th) {
                try {
                    OpusEncodingInputStream.this.opusInputStream.close();
                    OpusEncodingInputStream.this.pipedOutputStream.close();
                    OpusEncodingInputStream.this.originalInputStream.close();
                } catch (IOException unused3) {
                    Log.e(OpusEncodingInputStream.TAG, "Failed to close streams");
                }
            }
        }

        public /* synthetic */ EncodeOpusStreamRunnable(OpusEncodingInputStream opusEncodingInputStream, int i) {
            this();
        }
    }

    public OpusEncodingInputStream(InputStream inputStream) {
        this(inputStream, ManagedExecutorFactory.newSingleThreadExecutor("opus-encoder"));
    }
}
