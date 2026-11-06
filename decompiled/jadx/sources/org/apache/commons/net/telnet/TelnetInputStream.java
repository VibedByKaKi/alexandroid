package org.apache.commons.net.telnet;

import com.amazon.opus.OpusEncoder;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class TelnetInputStream extends BufferedInputStream implements Runnable {
    private static final int EOF = -1;
    static final int STATE_CR = 8;
    static final int STATE_DATA = 0;
    static final int STATE_DO = 4;
    static final int STATE_DONT = 5;
    static final int STATE_IAC = 1;
    static final int STATE_IAC_SB = 9;
    static final int STATE_SB = 6;
    static final int STATE_SE = 7;
    static final int STATE_WILL = 2;
    static final int STATE_WONT = 3;
    private static final int WOULD_BLOCK = -2;
    private int bytesAvailable;
    private final TelnetClient client;
    private boolean hasReachedEOF;
    private IOException ioException;
    private volatile boolean isClosed;
    private final int[] queue;
    private int queueHead;
    private int queueTail;
    private boolean readIsWaiting;
    private int receiveState;
    private final int[] suboption;
    private int suboptionCount;
    private final Thread thread;
    private volatile boolean threaded;

    public TelnetInputStream(InputStream inputStream, TelnetClient telnetClient, boolean z) {
        super(inputStream);
        this.client = telnetClient;
        this.receiveState = 0;
        this.isClosed = true;
        this.hasReachedEOF = false;
        this.queue = new int[OpusEncoder.OPUS_APPLICATION_AUDIO];
        this.queueHead = 0;
        this.queueTail = 0;
        this.suboption = new int[telnetClient.maxSubnegotiationLength];
        this.bytesAvailable = 0;
        this.ioException = null;
        this.readIsWaiting = false;
        this.threaded = false;
        if (z) {
            this.thread = new Thread(this);
        } else {
            this.thread = null;
        }
    }

    private boolean processChar(int i) throws InterruptedException {
        boolean z;
        synchronized (this.queue) {
            z = this.bytesAvailable == 0;
            while (this.bytesAvailable >= this.queue.length - 1) {
                if (!this.threaded) {
                    throw new IllegalStateException("Queue is full! Cannot process another character.");
                }
                this.queue.notify();
                try {
                    this.queue.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.readIsWaiting && this.threaded) {
                this.queue.notify();
            }
            int[] iArr = this.queue;
            int i2 = this.queueTail;
            iArr[i2] = i;
            this.bytesAvailable++;
            int i3 = i2 + 1;
            this.queueTail = i3;
            if (i3 >= iArr.length) {
                this.queueTail = 0;
            }
        }
        return z;
    }

    private int read(boolean z) throws IOException {
        while (true) {
            if (!z && super.available() == 0) {
                return -2;
            }
            int read = super.read();
            if (read < 0) {
                return -1;
            }
            int i = read & 255;
            synchronized (this.client) {
                this.client.processAYTResponse();
            }
            this.client.spyRead(i);
            switch (this.receiveState) {
                case 0:
                    break;
                case 1:
                    if (i != 240) {
                        switch (i) {
                            case 250:
                                this.suboptionCount = 0;
                                this.receiveState = 6;
                                break;
                            case 251:
                                this.receiveState = 2;
                                break;
                            case TelnetCommand.WONT /* 252 */:
                                this.receiveState = 3;
                                break;
                            case TelnetCommand.DO /* 253 */:
                                this.receiveState = 4;
                                break;
                            case TelnetCommand.DONT /* 254 */:
                                this.receiveState = 5;
                                break;
                            case 255:
                                this.receiveState = 0;
                                return i;
                            default:
                                this.receiveState = 0;
                                this.client.processCommand(i);
                                break;
                        }
                    } else {
                        this.receiveState = 0;
                        continue;
                    }
                case 2:
                    synchronized (this.client) {
                        this.client.processWill(i);
                        this.client.flushOutputStream();
                    }
                    this.receiveState = 0;
                    continue;
                case 3:
                    synchronized (this.client) {
                        this.client.processWont(i);
                        this.client.flushOutputStream();
                    }
                    this.receiveState = 0;
                    continue;
                case 4:
                    synchronized (this.client) {
                        this.client.processDo(i);
                        this.client.flushOutputStream();
                    }
                    this.receiveState = 0;
                    continue;
                case 5:
                    synchronized (this.client) {
                        this.client.processDont(i);
                        this.client.flushOutputStream();
                    }
                    this.receiveState = 0;
                    continue;
                case 6:
                    if (i != 255) {
                        int i2 = this.suboptionCount;
                        int[] iArr = this.suboption;
                        if (i2 < iArr.length) {
                            this.suboptionCount = i2 + 1;
                            iArr[i2] = i;
                        }
                        this.receiveState = 6;
                    } else {
                        this.receiveState = 9;
                        continue;
                    }
                case 7:
                default:
                    return i;
                case 8:
                    if (i != 0) {
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if (i != 240) {
                        if (i == 255) {
                            int i3 = this.suboptionCount;
                            int[] iArr2 = this.suboption;
                            if (i3 < iArr2.length) {
                                this.suboptionCount = i3 + 1;
                                iArr2[i3] = i;
                            }
                        }
                        this.receiveState = 6;
                    } else {
                        synchronized (this.client) {
                            this.client.processSuboption(this.suboption, this.suboptionCount);
                            this.client.flushOutputStream();
                        }
                        this.receiveState = 0;
                        continue;
                    }
            }
            if (i != 255) {
                if (i != 13) {
                    this.receiveState = 0;
                    return i;
                }
                synchronized (this.client) {
                    try {
                        if (this.client.requestedDont(0)) {
                            this.receiveState = 8;
                        } else {
                            this.receiveState = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return i;
            }
            this.receiveState = 1;
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        synchronized (this.queue) {
            try {
                boolean z = this.threaded;
                int i = this.bytesAvailable;
                if (z) {
                    return i;
                }
                return i + super.available();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        synchronized (this.queue) {
            try {
                this.hasReachedEOF = true;
                this.isClosed = true;
                Thread thread = this.thread;
                if (thread != null && thread.isAlive()) {
                    this.thread.interrupt();
                }
                this.queue.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        boolean z;
        while (!this.isClosed) {
            try {
                try {
                    read = read(true);
                } catch (InterruptedIOException e) {
                    synchronized (this.queue) {
                        this.ioException = e;
                        this.queue.notifyAll();
                        try {
                            this.queue.wait(100L);
                        } catch (InterruptedException unused) {
                            if (this.isClosed) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException unused2) {
                    super.close();
                }
                if (read < 0) {
                    break;
                }
                try {
                    z = processChar(read);
                } catch (InterruptedException unused3) {
                    if (this.isClosed) {
                        break;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.client.notifyInputListener();
                }
            } catch (IOException e2) {
                synchronized (this.queue) {
                    this.ioException = e2;
                    this.client.notifyInputListener();
                }
            }
        }
        synchronized (this.queue) {
            this.isClosed = true;
            this.hasReachedEOF = true;
            this.queue.notify();
        }
        this.threaded = false;
    }

    public void start() {
        if (this.thread == null) {
            return;
        }
        this.isClosed = false;
        int priority = Thread.currentThread().getPriority() + 1;
        if (priority > 10) {
            priority = 10;
        }
        this.thread.setPriority(priority);
        this.thread.setDaemon(true);
        this.thread.start();
        this.threaded = true;
    }

    public TelnetInputStream(InputStream inputStream, TelnetClient telnetClient) {
        this(inputStream, telnetClient, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        r7.readIsWaiting = false;
     */
    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read() throws java.io.IOException {
        /*
            r7 = this;
            int[] r0 = r7.queue
            monitor-enter(r0)
        L3:
            java.io.IOException r1 = r7.ioException     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L98
            int r1 = r7.bytesAvailable     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L7a
            boolean r1 = r7.hasReachedEOF     // Catch: java.lang.Throwable -> L14
            r4 = -1
            if (r1 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r4
        L14:
            r7 = move-exception
            goto L9c
        L17:
            boolean r1 = r7.threaded     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L32
            int[] r1 = r7.queue     // Catch: java.lang.Throwable -> L14
            r1.notify()     // Catch: java.lang.Throwable -> L14
            r7.readIsWaiting = r3     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L2a
            int[] r1 = r7.queue     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L2a
            r1.wait()     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L2a
            r7.readIsWaiting = r2     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L2a
            goto L3
        L2a:
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "Fatal thread interruption during read."
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r7     // Catch: java.lang.Throwable -> L14
        L32:
            r7.readIsWaiting = r3     // Catch: java.lang.Throwable -> L14
            r1 = r3
        L35:
            int r1 = r7.read(r1)     // Catch: java.lang.Throwable -> L14 java.io.InterruptedIOException -> L60
            r5 = -2
            if (r1 >= 0) goto L40
            if (r1 == r5) goto L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r1
        L40:
            if (r1 == r5) goto L4c
            r7.processChar(r1)     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L46
            goto L4c
        L46:
            boolean r1 = r7.isClosed     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L4c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r4
        L4c:
            int r1 = super.available()     // Catch: java.lang.Throwable -> L14
            if (r1 <= 0) goto L5d
            int r1 = r7.bytesAvailable     // Catch: java.lang.Throwable -> L14
            int[] r5 = r7.queue     // Catch: java.lang.Throwable -> L14
            int r5 = r5.length     // Catch: java.lang.Throwable -> L14
            int r5 = r5 - r3
            if (r1 < r5) goto L5b
            goto L5d
        L5b:
            r1 = r2
            goto L35
        L5d:
            r7.readIsWaiting = r2     // Catch: java.lang.Throwable -> L14
            goto L3
        L60:
            r1 = move-exception
            int[] r2 = r7.queue     // Catch: java.lang.Throwable -> L14
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L14
            r7.ioException = r1     // Catch: java.lang.Throwable -> L73
            int[] r1 = r7.queue     // Catch: java.lang.Throwable -> L73
            r1.notifyAll()     // Catch: java.lang.Throwable -> L73
            int[] r7 = r7.queue     // Catch: java.lang.Throwable -> L73 java.lang.InterruptedException -> L75
            r5 = 100
            r7.wait(r5)     // Catch: java.lang.Throwable -> L73 java.lang.InterruptedException -> L75
            goto L75
        L73:
            r7 = move-exception
            goto L78
        L75:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r4
        L78:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
            throw r7     // Catch: java.lang.Throwable -> L14
        L7a:
            int[] r4 = r7.queue     // Catch: java.lang.Throwable -> L14
            int r5 = r7.queueHead     // Catch: java.lang.Throwable -> L14
            r6 = r4[r5]     // Catch: java.lang.Throwable -> L14
            int r5 = r5 + r3
            r7.queueHead = r5     // Catch: java.lang.Throwable -> L14
            int r4 = r4.length     // Catch: java.lang.Throwable -> L14
            if (r5 < r4) goto L88
            r7.queueHead = r2     // Catch: java.lang.Throwable -> L14
        L88:
            int r1 = r1 - r3
            r7.bytesAvailable = r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L96
            boolean r1 = r7.threaded     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L96
            int[] r7 = r7.queue     // Catch: java.lang.Throwable -> L14
            r7.notify()     // Catch: java.lang.Throwable -> L14
        L96:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r6
        L98:
            r2 = 0
            r7.ioException = r2     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L9c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.TelnetInputStream.read():int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i2 < 1) {
            return 0;
        }
        synchronized (this.queue) {
            int i4 = this.bytesAvailable;
            if (i2 > i4) {
                i2 = i4;
            }
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        int i5 = i;
        while (true) {
            i3 = i5 + 1;
            bArr[i5] = (byte) read;
            i2--;
            if (i2 <= 0 || (read = read()) == -1) {
                break;
            }
            i5 = i3;
        }
        return i3 - i;
    }
}
