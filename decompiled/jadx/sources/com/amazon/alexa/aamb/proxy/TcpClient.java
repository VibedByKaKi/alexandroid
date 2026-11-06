package com.amazon.alexa.aamb.proxy;

import android.net.TrafficStats;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.photos.metrics.PhotosMetricsConstants;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class TcpClient {
    private static final int INCOMING_BUFFER_SIZE = 65536;
    private static final int MAX_DL_KILOBYTES_PER_SEC = 64;
    private static final int SOCKET_TIMEOUT = 10000;
    private static final String TAG = "TcpClient";
    private static final int THROTTLE_START_MS = 500;
    private static final long THROTTLE_WAIT_MS = 10;
    private final DataCallback dataCallback;

    @VisibleForTesting
    protected DataInputStream dataInputStream;

    @VisibleForTesting
    protected DataOutputStream dataOutputStream;
    private final String host;
    private final int port;
    private final boolean throttleDownloading;
    private final LinkedBlockingQueue<Chunk> outgoingQueue = new LinkedBlockingQueue<>();

    @VisibleForTesting
    protected Socket socket = new Socket();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Chunk {
        public byte[] buffer;
        public int len;
        public int off;

        public Chunk(byte[] bArr, int i, int i2) {
            this.buffer = bArr;
            this.off = i;
            this.len = i2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DataCallback {
        void onData(byte[] bArr, int i, int i2);

        void onError(Exception exc);
    }

    public TcpClient(String str, int i, DataCallback dataCallback, boolean z) {
        this.host = str;
        this.port = i;
        this.dataCallback = dataCallback;
        this.throttleDownloading = z;
    }

    public void close(Exception exc) {
        try {
            this.socket.close();
            DataCallback dataCallback = this.dataCallback;
            if (exc == null) {
                dataCallback.onData(null, 0, 0);
            } else {
                dataCallback.onError(exc);
            }
        } catch (Exception e) {
            Log.e(TAG, "failed to close socket", e);
        }
    }

    public void enqueueOutgoing(byte[] bArr, int i, int i2) throws InterruptedException {
        this.outgoingQueue.put(new Chunk(bArr, i, i2));
    }

    public void init() throws IOException {
        this.socket.connect(new InetSocketAddress(InetAddress.getByName(this.host), this.port), 10000);
        this.dataInputStream = new DataInputStream(this.socket.getInputStream());
        this.dataOutputStream = new DataOutputStream(this.socket.getOutputStream());
    }

    public void pullIncomingData() {
        byte[] array = ByteBuffer.allocate(65536).array();
        try {
            try {
                try {
                    TrafficStats.setThreadStatsTag(100);
                    long currentTimeMillis = System.currentTimeMillis();
                    Socket socket = this.socket;
                    long j = 0;
                    while (true) {
                        if (this.throttleDownloading) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 >= 500 + currentTimeMillis && j >= 65536 && j / (currentTimeMillis2 - currentTimeMillis) >= 64) {
                                Thread.sleep(10L);
                            }
                        }
                        int read = this.dataInputStream.read(array);
                        if (read <= 0) {
                            break;
                        }
                        String.format("read %d bytes", Integer.valueOf(read));
                        this.dataCallback.onData(array, 0, read);
                        j += read;
                    }
                    Log.i(TAG, "EOS reached for socket:" + socket);
                    close(null);
                    this.outgoingQueue.put(new Chunk(new byte[0], 0, 0));
                } catch (Exception e) {
                    Log.e(TAG, "failed to forward data." + e.getMessage());
                    if (!this.socket.isClosed()) {
                        close(e);
                    }
                    this.outgoingQueue.put(new Chunk(new byte[0], 0, 0));
                }
            } catch (InterruptedException unused) {
                Log.e(TAG, PhotosMetricsConstants.INTERRUPTED_EXCEPTION);
            }
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            try {
                this.outgoingQueue.put(new Chunk(new byte[0], 0, 0));
            } catch (InterruptedException unused2) {
                Log.e(TAG, PhotosMetricsConstants.INTERRUPTED_EXCEPTION);
            }
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    public void pushOutgoingData() {
        while (true) {
            try {
                try {
                    try {
                        Chunk take = this.outgoingQueue.take();
                        int i = take.len;
                        if (i == 0) {
                            this.dataInputStream.close();
                            this.dataOutputStream.close();
                            TrafficStats.clearThreadStatsTag();
                            return;
                        }
                        this.dataOutputStream.write(take.buffer, take.off, i);
                    } catch (IOException | InterruptedException unused) {
                        Log.e(TAG, "failed to push data.");
                        this.dataInputStream.close();
                        this.dataOutputStream.close();
                        TrafficStats.clearThreadStatsTag();
                        return;
                    }
                } catch (Exception unused2) {
                    Log.e(TAG, "failed to close streams.");
                    return;
                }
            } catch (Throwable th) {
                try {
                    this.dataInputStream.close();
                    this.dataOutputStream.close();
                    TrafficStats.clearThreadStatsTag();
                } catch (Exception unused3) {
                    Log.e(TAG, "failed to close streams.");
                }
                throw th;
            }
        }
    }
}
