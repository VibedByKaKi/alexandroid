package com.amazon.alexa.client.alexaservice.networking.attachments;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.audio.core.SpeechmarkDataSource;
import com.amazon.alexa.client.alexaservice.audio.core.SpeechmarkParser;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import com.amazon.alexa.utils.validation.Assertions;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class SpeechmarkParsingPipedOutputStream extends PipedOutputStream implements Runnable, SpeechmarkDataSource {
    private static final String TAG = "SpeechmarkParsingPipedOutputStream";
    private final AttachmentIdentifier attachmentIdentifier;
    private final Object closeObject;
    private int currentPosition;
    private final Object dataSyncObject;
    private final ExecutorService executorService;
    private boolean hasParsingStarted;
    private final ArrayList<Byte> incomingData;
    private boolean isCleanedUp;
    private boolean isPipeClosed;
    private int markPosition;
    private final SpeechmarkParser parser;

    @VisibleForTesting
    public SpeechmarkParsingPipedOutputStream(AttachmentIdentifier attachmentIdentifier, ExecutorService executorService, SpeechmarkParser speechmarkParser) {
        this.dataSyncObject = new Object();
        this.closeObject = new Object();
        this.incomingData = new ArrayList<>(100);
        this.hasParsingStarted = false;
        this.isPipeClosed = false;
        this.isCleanedUp = false;
        this.currentPosition = 0;
        this.markPosition = -1;
        this.attachmentIdentifier = attachmentIdentifier;
        this.executorService = executorService;
        this.parser = speechmarkParser;
    }

    private void cleanup() throws IOException {
        if (this.isCleanedUp) {
            return;
        }
        super.close();
        this.isCleanedUp = true;
        this.incomingData.clear();
        this.executorService.shutdown();
    }

    private int getTotalBytesAvailable(int i) {
        int size = this.incomingData.size() - this.currentPosition;
        Assertions.isFalse(size < 0, "remainingBytes should always be positive");
        return Math.min(size, i);
    }

    private void parseSpeechmark() {
        if (this.hasParsingStarted) {
            return;
        }
        this.hasParsingStarted = true;
        try {
            this.executorService.execute(this);
        } catch (RejectedExecutionException e) {
            Log.w(TAG, e.getMessage());
        }
    }

    private int readBytesInternal(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            synchronized (this.dataSyncObject) {
                try {
                    int totalBytesAvailable = getTotalBytesAvailable(i - i2);
                    int i3 = 0;
                    while (i3 < totalBytesAvailable) {
                        ArrayList<Byte> arrayList = this.incomingData;
                        int i4 = this.currentPosition;
                        this.currentPosition = i4 + 1;
                        bArr[i2] = arrayList.get(i4).byteValue();
                        i3++;
                        i2++;
                    }
                    if (this.isPipeClosed && i2 < i && this.currentPosition == this.incomingData.size()) {
                        cleanup();
                        throw new IOException("Stream is closed and no more data is available");
                    }
                } finally {
                }
            }
        }
        return i2;
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.dataSyncObject) {
            this.isPipeClosed = true;
        }
        synchronized (this.closeObject) {
            try {
                if (!this.hasParsingStarted) {
                    cleanup();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.SpeechmarkDataSource
    public boolean isAvailable() throws IOException {
        boolean z;
        synchronized (this.dataSyncObject) {
            try {
                z = !this.isPipeClosed || this.incomingData.size() - this.currentPosition > 0;
            } finally {
            }
        }
        return z;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.SpeechmarkDataSource
    public void mark() {
        synchronized (this.dataSyncObject) {
            this.markPosition = this.currentPosition;
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.SpeechmarkDataSource
    public int readBytes(byte[] bArr, int i) throws IOException {
        int readBytesInternal = readBytesInternal(bArr, i);
        synchronized (this.dataSyncObject) {
            try {
                if (this.isPipeClosed && this.currentPosition >= this.incomingData.size()) {
                    cleanup();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return readBytesInternal;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.SpeechmarkDataSource
    public void reset() throws IOException {
        synchronized (this.dataSyncObject) {
            try {
                int i = this.markPosition;
                if (i != -1) {
                    this.currentPosition = i;
                    this.markPosition = -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.closeObject) {
            try {
                this.parser.parse(this, this.attachmentIdentifier);
            } catch (IOException e) {
                Log.w(TAG, e.getMessage());
            }
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.SpeechmarkDataSource
    public long skipAudioData(int i) throws IOException {
        byte[] bArr = new byte[i];
        int readBytesInternal = readBytesInternal(bArr, i);
        super.write(bArr, 0, readBytesInternal);
        synchronized (this.dataSyncObject) {
            try {
                if (this.isPipeClosed && this.currentPosition >= this.incomingData.size()) {
                    cleanup();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return readBytesInternal;
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this.dataSyncObject) {
            try {
                if (this.isPipeClosed) {
                    Log.w(TAG, "Pipe is closed. Unable to write any more data");
                    return;
                }
                parseSpeechmark();
                for (int i3 = i; i3 < i + i2; i3++) {
                    this.incomingData.add(Byte.valueOf(bArr[i3]));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        synchronized (this.dataSyncObject) {
            try {
                if (this.isPipeClosed) {
                    Log.w(TAG, "Pipe is closed. Unable to write any more data");
                } else {
                    parseSpeechmark();
                    this.incomingData.add(Byte.valueOf((byte) i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SpeechmarkParsingPipedOutputStream(AttachmentIdentifier attachmentIdentifier, SpeechmarkParser speechmarkParser) {
        this(attachmentIdentifier, ManagedExecutorFactory.newSingleThreadScheduledExecutor("wakeword-output-stream" + attachmentIdentifier.getValue()), speechmarkParser);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        synchronized (this.dataSyncObject) {
            try {
                if (this.isPipeClosed) {
                    Log.w(TAG, "Pipe is closed. Unable to write any more data");
                    return;
                }
                parseSpeechmark();
                for (byte b : bArr) {
                    this.incomingData.add(Byte.valueOf(b));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
