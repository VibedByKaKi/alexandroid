package org.apache.thrift.orig;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TNonblockingMultiFetchClient {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) TNonblockingMultiFetchClient.class);
    private final int fetchTimeoutSeconds;
    private final int maxRecvBufBytesPerServer;
    private final ByteBuffer requestBuf;
    private ByteBuffer requestBufDuplication;
    private final List<InetSocketAddress> servers;
    private final TNonblockingMultiFetchStats stats = new TNonblockingMultiFetchStats();
    private ByteBuffer[] recvBuf = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class MultiFetch implements Runnable {
        private Selector selector;

        private MultiFetch() {
        }

        public void close() {
            try {
                if (this.selector.isOpen()) {
                    Iterator<SelectionKey> it2 = this.selector.keys().iterator();
                    while (it2.hasNext()) {
                        ((SocketChannel) it2.next().channel()).close();
                    }
                    this.selector.close();
                }
            } catch (IOException e) {
                TNonblockingMultiFetchClient.LOGGER.error("Free resource error", (Throwable) e);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            char c;
            char c2;
            Integer num;
            SocketChannel socketChannel;
            int read;
            SelectionKey selectionKey;
            long currentTimeMillis = System.currentTimeMillis();
            int size = TNonblockingMultiFetchClient.this.servers.size();
            TNonblockingMultiFetchClient.this.stats.setNumTotalServers(size);
            TNonblockingMultiFetchClient.this.recvBuf = new ByteBuffer[size];
            ByteBuffer[] byteBufferArr = new ByteBuffer[size];
            long[] jArr = new long[size];
            int[] iArr = new int[size];
            boolean[] zArr = new boolean[size];
            try {
                this.selector = Selector.open();
                int i = 0;
                while (true) {
                    c = 4;
                    if (i >= size) {
                        break;
                    }
                    byteBufferArr[i] = TNonblockingMultiFetchClient.this.requestBuf.duplicate();
                    TNonblockingMultiFetchClient.this.recvBuf[i] = ByteBuffer.allocate(4);
                    TNonblockingMultiFetchClient.this.stats.incTotalRecvBufBytes(4);
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) TNonblockingMultiFetchClient.this.servers.get(i);
                    SocketChannel socketChannel2 = null;
                    SelectionKey selectionKey2 = null;
                    try {
                        SocketChannel open = SocketChannel.open();
                        try {
                            open.configureBlocking(false);
                            open.connect(inetSocketAddress);
                            selectionKey2 = open.register(this.selector, open.validOps());
                            selectionKey2.attach(Integer.valueOf(i));
                        } catch (Exception e) {
                            e = e;
                            selectionKey = selectionKey2;
                            socketChannel2 = open;
                            TNonblockingMultiFetchClient.this.stats.incNumConnectErrorServers();
                            TNonblockingMultiFetchClient.LOGGER.error("Set up socket to server {} error", inetSocketAddress, e);
                            if (socketChannel2 != null) {
                                try {
                                    socketChannel2.close();
                                } catch (Exception e2) {
                                    TNonblockingMultiFetchClient.LOGGER.error("failed to free up socket", (Throwable) e2);
                                }
                            }
                            if (selectionKey != null) {
                                selectionKey.cancel();
                            }
                            i++;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        selectionKey = null;
                    }
                    i++;
                }
                while (TNonblockingMultiFetchClient.this.stats.getNumConnectErrorServers() + TNonblockingMultiFetchClient.this.stats.getNumReadCompletedServers() < TNonblockingMultiFetchClient.this.stats.getNumTotalServers() && !Thread.currentThread().isInterrupted()) {
                    try {
                        this.selector.select();
                        Iterator<SelectionKey> it2 = this.selector.selectedKeys().iterator();
                        while (it2.hasNext()) {
                            SelectionKey next = it2.next();
                            it2.remove();
                            Integer num2 = (Integer) next.attachment();
                            int intValue = num2.intValue();
                            if (next.isValid() && next.isConnectable()) {
                                try {
                                    ((SocketChannel) next.channel()).finishConnect();
                                } catch (Exception e4) {
                                    TNonblockingMultiFetchClient.this.stats.incNumConnectErrorServers();
                                    TNonblockingMultiFetchClient.LOGGER.error("Socket {} connects to server {} error", num2, TNonblockingMultiFetchClient.this.servers.get(intValue), e4);
                                }
                            }
                            if (next.isValid() && next.isWritable() && byteBufferArr[intValue].hasRemaining()) {
                                try {
                                    ((SocketChannel) next.channel()).write(byteBufferArr[intValue]);
                                } catch (Exception e5) {
                                    TNonblockingMultiFetchClient.LOGGER.error("Socket {} writes to server {} error", num2, TNonblockingMultiFetchClient.this.servers.get(intValue), e5);
                                }
                            }
                            if (next.isValid() && next.isReadable()) {
                                try {
                                    socketChannel = (SocketChannel) next.channel();
                                    read = socketChannel.read(TNonblockingMultiFetchClient.this.recvBuf[intValue]);
                                } catch (Exception e6) {
                                    e = e6;
                                    c2 = c;
                                    num = num2;
                                }
                                if (read > 0) {
                                    c2 = c;
                                    num = num2;
                                    try {
                                        jArr[intValue] = jArr[intValue] + read;
                                    } catch (Exception e7) {
                                        e = e7;
                                        TNonblockingMultiFetchClient.LOGGER.error("Socket {} reads from server {} error", num, TNonblockingMultiFetchClient.this.servers.get(intValue), e);
                                        c = c2;
                                    }
                                    if (!zArr[intValue] && TNonblockingMultiFetchClient.this.recvBuf[intValue].remaining() == 0) {
                                        int i2 = TNonblockingMultiFetchClient.this.recvBuf[intValue].getInt(0);
                                        iArr[intValue] = i2;
                                        if (i2 <= 0) {
                                            TNonblockingMultiFetchClient.this.stats.incNumInvalidFrameSize();
                                            TNonblockingMultiFetchClient.LOGGER.error("Read an invalid frame size {} from {}. Does the server use TFramedTransport?", Integer.valueOf(iArr[intValue]), TNonblockingMultiFetchClient.this.servers.get(intValue));
                                            socketChannel.close();
                                        } else {
                                            if (i2 + 4 > TNonblockingMultiFetchClient.this.stats.getMaxResponseBytes()) {
                                                TNonblockingMultiFetchClient.this.stats.setMaxResponseBytes(iArr[intValue] + 4);
                                            }
                                            int i3 = iArr[intValue] + 4;
                                            int i4 = TNonblockingMultiFetchClient.this.maxRecvBufBytesPerServer;
                                            TNonblockingMultiFetchClient tNonblockingMultiFetchClient = TNonblockingMultiFetchClient.this;
                                            if (i3 > i4) {
                                                tNonblockingMultiFetchClient.stats.incNumOverflowedRecvBuf();
                                                TNonblockingMultiFetchClient.LOGGER.error("Read frame size {} from {}, total buffer size would exceed limit {}", Integer.valueOf(iArr[intValue]), TNonblockingMultiFetchClient.this.servers.get(intValue), Integer.valueOf(TNonblockingMultiFetchClient.this.maxRecvBufBytesPerServer));
                                                socketChannel.close();
                                            } else {
                                                tNonblockingMultiFetchClient.recvBuf[intValue] = ByteBuffer.allocate(iArr[intValue] + 4);
                                                TNonblockingMultiFetchClient.this.recvBuf[intValue].putInt(iArr[intValue]);
                                                TNonblockingMultiFetchClient.this.stats.incTotalRecvBufBytes(iArr[intValue]);
                                                zArr[intValue] = true;
                                            }
                                        }
                                        c = c2;
                                    }
                                    if (zArr[intValue] && jArr[intValue] >= iArr[intValue] + 4) {
                                        socketChannel.close();
                                        TNonblockingMultiFetchClient.this.stats.incNumReadCompletedServers();
                                        TNonblockingMultiFetchClient.this.stats.setReadTime(System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    c = c2;
                                }
                            }
                            c2 = c;
                            c = c2;
                        }
                    } catch (Exception e8) {
                        TNonblockingMultiFetchClient.LOGGER.error("Selector selects error", (Throwable) e8);
                        c = c;
                    }
                }
            } catch (IOException e9) {
                TNonblockingMultiFetchClient.LOGGER.error("Selector opens error", (Throwable) e9);
            }
        }
    }

    public TNonblockingMultiFetchClient(int i, int i2, ByteBuffer byteBuffer, List<InetSocketAddress> list) {
        this.maxRecvBufBytesPerServer = i;
        this.fetchTimeoutSeconds = i2;
        this.requestBuf = byteBuffer;
        this.servers = list;
    }

    public synchronized ByteBuffer[] fetch() {
        this.recvBuf = null;
        this.stats.clear();
        List<InetSocketAddress> list = this.servers;
        if (list != null && list.size() != 0 && this.requestBuf != null && this.fetchTimeoutSeconds > 0) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            MultiFetch multiFetch = new MultiFetch();
            FutureTask futureTask = new FutureTask(multiFetch, null);
            newSingleThreadExecutor.execute(futureTask);
            try {
                try {
                    futureTask.get(this.fetchTimeoutSeconds, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    futureTask.cancel(true);
                    LOGGER.error("Interrupted during fetch", (Throwable) e);
                }
            } catch (ExecutionException e2) {
                futureTask.cancel(true);
                LOGGER.error("Exception during fetch", (Throwable) e2);
            } catch (TimeoutException e3) {
                futureTask.cancel(true);
                LOGGER.error("Timeout for fetch", (Throwable) e3);
            }
            newSingleThreadExecutor.shutdownNow();
            multiFetch.close();
            return this.recvBuf;
        }
        return this.recvBuf;
    }

    public synchronized TNonblockingMultiFetchStats getFetchStats() {
        return this.stats;
    }

    public synchronized int getFetchTimeoutSeconds() {
        return this.fetchTimeoutSeconds;
    }

    public synchronized int getMaxRecvBufBytesPerServer() {
        return this.maxRecvBufBytesPerServer;
    }

    public synchronized ByteBuffer getRequestBuf() {
        try {
            ByteBuffer byteBuffer = this.requestBuf;
            if (byteBuffer == null) {
                return null;
            }
            if (this.requestBufDuplication == null) {
                this.requestBufDuplication = byteBuffer.duplicate();
            }
            return this.requestBufDuplication;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized List<InetSocketAddress> getServerList() {
        List<InetSocketAddress> list = this.servers;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }
}
