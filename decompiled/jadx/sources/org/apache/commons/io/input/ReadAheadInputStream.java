package org.apache.commons.io.input;

import androidx.collection.SieveCacheKt;
import com.google.common.math.Stats$$ExternalSyntheticLambda0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.openjdk.tools.javac.util.Log$$ExternalSyntheticLambda0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class ReadAheadInputStream extends InputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ThreadLocal<byte[]> oneByte = ThreadLocal.withInitial(new Stats$$ExternalSyntheticLambda0(21));
    private ByteBuffer activeBuffer;
    private final Condition asyncReadComplete;
    private boolean endOfStream;
    private final ExecutorService executorService;
    private boolean isClosed;
    private boolean isReading;
    private boolean isUnderlyingInputStreamBeingClosed;
    private final AtomicBoolean isWaiting;
    private boolean readAborted;
    private ByteBuffer readAheadBuffer;
    private Throwable readException;
    private boolean readInProgress;
    private final boolean shutdownExecutorService;
    private final ReentrantLock stateChangeLock;
    private final InputStream underlyingInputStream;

    private ReadAheadInputStream(InputStream inputStream, int i, ExecutorService executorService, boolean z) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.stateChangeLock = reentrantLock;
        this.isWaiting = new AtomicBoolean(false);
        this.asyncReadComplete = reentrantLock.newCondition();
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "bufferSizeInBytes should be greater than 0, but the value is "));
            throw null;
        }
        Objects.requireNonNull(executorService, "executorService");
        this.executorService = executorService;
        Objects.requireNonNull(inputStream, "inputStream");
        this.underlyingInputStream = inputStream;
        this.shutdownExecutorService = z;
        this.activeBuffer = ByteBuffer.allocate(i);
        this.readAheadBuffer = ByteBuffer.allocate(i);
        this.activeBuffer.flip();
        this.readAheadBuffer.flip();
    }

    private void checkReadException() throws IOException {
        if (this.readAborted) {
            Throwable th = this.readException;
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            Buffer$$ExternalSyntheticBUOutline0.m$2(th);
        }
    }

    private void closeUnderlyingInputStreamIfNecessary() {
        this.stateChangeLock.lock();
        boolean z = false;
        try {
            this.isReading = false;
            if (this.isClosed) {
                if (!this.isUnderlyingInputStreamBeingClosed) {
                    z = true;
                }
            }
            if (z) {
                try {
                    this.underlyingInputStream.close();
                } catch (IOException unused) {
                }
            }
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    private boolean isEndOfStream() {
        return (this.activeBuffer.hasRemaining() || this.readAheadBuffer.hasRemaining() || !this.endOfStream) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readAsync$1(byte[] bArr) {
        this.stateChangeLock.lock();
        try {
            if (this.isClosed) {
                this.readInProgress = false;
                return;
            }
            this.isReading = true;
            this.stateChangeLock.unlock();
            int length = bArr.length;
            int i = 0;
            int i2 = 0;
            do {
                try {
                    i2 = this.underlyingInputStream.read(bArr, i, length);
                    if (i2 > 0) {
                        i += i2;
                        length -= i2;
                        if (length <= 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    try {
                        if (th instanceof Error) {
                            throw th;
                        }
                        this.stateChangeLock.lock();
                        try {
                            this.readAheadBuffer.limit(i);
                            if (i2 >= 0 && !(th instanceof EOFException)) {
                                this.readAborted = true;
                                this.readException = th;
                                this.readInProgress = false;
                                signalAsyncReadComplete();
                                this.stateChangeLock.unlock();
                                closeUnderlyingInputStreamIfNecessary();
                                return;
                            }
                            this.endOfStream = true;
                            this.readInProgress = false;
                            signalAsyncReadComplete();
                            this.stateChangeLock.unlock();
                            closeUnderlyingInputStreamIfNecessary();
                            return;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        this.stateChangeLock.lock();
                        try {
                            this.readAheadBuffer.limit(i);
                            if (i2 < 0 || (th instanceof EOFException)) {
                                this.endOfStream = true;
                            } else {
                                this.readAborted = true;
                                this.readException = th;
                            }
                            this.readInProgress = false;
                            signalAsyncReadComplete();
                            this.stateChangeLock.unlock();
                            closeUnderlyingInputStreamIfNecessary();
                            throw th2;
                        } finally {
                        }
                    }
                }
            } while (!this.isWaiting.get());
            this.stateChangeLock.lock();
            try {
                this.readAheadBuffer.limit(i);
                if (i2 < 0) {
                    this.endOfStream = true;
                }
                this.readInProgress = false;
                signalAsyncReadComplete();
                this.stateChangeLock.unlock();
                closeUnderlyingInputStreamIfNecessary();
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$static$0() {
        return new byte[1];
    }

    private static ExecutorService newExecutorService() {
        return Executors.newSingleThreadExecutor(new ReadAheadInputStream$$ExternalSyntheticLambda1(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "commons-io-read-ahead");
        thread.setDaemon(true);
        return thread;
    }

    private void readAsync() throws IOException {
        this.stateChangeLock.lock();
        try {
            byte[] array = this.readAheadBuffer.array();
            if (!this.endOfStream && !this.readInProgress) {
                checkReadException();
                this.readAheadBuffer.position(0);
                this.readAheadBuffer.flip();
                this.readInProgress = true;
                this.stateChangeLock.unlock();
                this.executorService.execute(new Log$$ExternalSyntheticLambda0(this, array, 12));
            }
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    private void signalAsyncReadComplete() {
        this.stateChangeLock.lock();
        try {
            this.asyncReadComplete.signalAll();
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    private long skipInternal(long j) throws IOException {
        waitForAsyncReadComplete();
        if (isEndOfStream()) {
            return 0L;
        }
        if (available() >= j) {
            int remaining = ((int) j) - this.activeBuffer.remaining();
            this.activeBuffer.position(0);
            this.activeBuffer.flip();
            ByteBuffer byteBuffer = this.readAheadBuffer;
            byteBuffer.position(byteBuffer.position() + remaining);
            swapBuffers();
            readAsync();
            return j;
        }
        long available = available();
        this.activeBuffer.position(0);
        this.activeBuffer.flip();
        this.readAheadBuffer.position(0);
        this.readAheadBuffer.flip();
        long skip = this.underlyingInputStream.skip(j - available);
        readAsync();
        return available + skip;
    }

    private void swapBuffers() {
        ByteBuffer byteBuffer = this.activeBuffer;
        this.activeBuffer = this.readAheadBuffer;
        this.readAheadBuffer = byteBuffer;
    }

    private void waitForAsyncReadComplete() throws IOException {
        this.stateChangeLock.lock();
        try {
            try {
                this.isWaiting.set(true);
                while (this.readInProgress) {
                    this.asyncReadComplete.await();
                }
                this.isWaiting.set(false);
                this.stateChangeLock.unlock();
                checkReadException();
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException(e.getMessage());
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        } catch (Throwable th) {
            this.isWaiting.set(false);
            this.stateChangeLock.unlock();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        this.stateChangeLock.lock();
        try {
            int min = (int) Math.min(SieveCacheKt.NodeLinkMask, this.activeBuffer.remaining() + this.readAheadBuffer.remaining());
            return min;
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.stateChangeLock.lock();
        try {
            if (this.isClosed) {
                return;
            }
            boolean z = true;
            this.isClosed = true;
            if (this.isReading) {
                z = false;
            } else {
                this.isUnderlyingInputStreamBeingClosed = true;
            }
            this.stateChangeLock.unlock();
            if (this.shutdownExecutorService) {
                try {
                    try {
                        this.executorService.shutdownNow();
                        this.executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException(e.getMessage());
                        interruptedIOException.initCause(e);
                        throw interruptedIOException;
                    }
                } finally {
                    if (z) {
                        this.underlyingInputStream.close();
                    }
                }
            }
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            Buffer$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        if (!this.activeBuffer.hasRemaining()) {
            this.stateChangeLock.lock();
            try {
                waitForAsyncReadComplete();
                if (!this.readAheadBuffer.hasRemaining()) {
                    readAsync();
                    waitForAsyncReadComplete();
                    if (isEndOfStream()) {
                        this.stateChangeLock.unlock();
                        return -1;
                    }
                }
                swapBuffers();
                readAsync();
            } finally {
                this.stateChangeLock.unlock();
            }
        }
        int min = Math.min(i2, this.activeBuffer.remaining());
        this.activeBuffer.get(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        if (j <= this.activeBuffer.remaining()) {
            ByteBuffer byteBuffer = this.activeBuffer;
            byteBuffer.position(byteBuffer.position() + ((int) j));
            return j;
        }
        this.stateChangeLock.lock();
        try {
            return skipInternal(j);
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    public ReadAheadInputStream(InputStream inputStream, int i, ExecutorService executorService) {
        this(inputStream, i, executorService, false);
    }

    public ReadAheadInputStream(InputStream inputStream, int i) {
        this(inputStream, i, newExecutorService(), true);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte b;
        if (this.activeBuffer.hasRemaining()) {
            b = this.activeBuffer.get();
        } else {
            byte[] bArr = oneByte.get();
            if (read(bArr, 0, 1) == -1) {
                return -1;
            }
            b = bArr[0];
        }
        return b & 255;
    }
}
