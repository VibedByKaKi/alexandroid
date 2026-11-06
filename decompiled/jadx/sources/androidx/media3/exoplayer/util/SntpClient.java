package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.Loader;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class SntpClient {
    public static final String DEFAULT_NTP_HOST = "time.android.com";
    public static final int DEFAULT_TIMEOUT_MS = 1000;
    private static final int MAX_RETRY_COUNT = 10;
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TRANSMIT_TIME_OFFSET = 40;

    @GuardedBy("valueLock")
    private static long elapsedRealtimeOffsetMs = 0;

    @GuardedBy("valueLock")
    private static boolean isInitialized = false;

    @GuardedBy("valueLock")
    private static long lastUpdateElapsedRealtime = -9223372036854775807L;

    @GuardedBy("valueLock")
    private static long maxElapsedTimeUntilUpdateMs = -9223372036854775807L;

    @GuardedBy("valueLock")
    private static String ntpHost = "time.android.com";

    @GuardedBy("valueLock")
    private static int timeoutMs = 1000;
    private static final Object loaderLock = new Object();
    private static final Object valueLock = new Object();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface InitializationCallback {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    private SntpClient() {
    }

    private static void checkValidServerReply(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("SNTP: Unsynchronized server");
            return;
        }
        if (b2 != 4 && b2 != 5) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(b2, "SNTP: Untrusted mode: "));
            return;
        }
        if (i == 0 || i > 15) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(i, "SNTP: Untrusted stratum: "));
        } else {
            if (j != 0) {
                return;
            }
            Buffer$$ExternalSyntheticBUOutline0.m$2("SNTP: Zero transmitTime");
        }
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j;
        synchronized (valueLock) {
            try {
                j = isInitialized ? elapsedRealtimeOffsetMs : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public static long getMaxElapsedTimeUntilUpdateMs() {
        long j;
        synchronized (valueLock) {
            j = maxElapsedTimeUntilUpdateMs;
        }
        return j;
    }

    public static String getNtpHost() {
        String str;
        synchronized (valueLock) {
            str = ntpHost;
        }
        return str;
    }

    public static int getTimeoutMs() {
        int i;
        synchronized (valueLock) {
            i = timeoutMs;
        }
        return i;
    }

    public static void initialize(@Nullable Loader loader, @Nullable InitializationCallback initializationCallback) {
        if (isInitialized()) {
            if (initializationCallback != null) {
                initializationCallback.onInitialized();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.startLoading(new NtpTimeLoadable(), new NtpTimeCallback(initializationCallback), 1);
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (valueLock) {
            try {
                if (lastUpdateElapsedRealtime != -9223372036854775807L && maxElapsedTimeUntilUpdateMs != -9223372036854775807L) {
                    isInitialized = isInitialized && SystemClock.elapsedRealtime() - lastUpdateElapsedRealtime < maxElapsedTimeUntilUpdateMs;
                }
                z = isInitialized;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long loadNtpTimeOffsetMs() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(getTimeoutMs());
            InetAddress[] allByName = InetAddress.getAllByName(getNtpHost());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i], 123);
                bArr[0] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                writeTimestamp(bArr, 40, currentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b = bArr[0];
                    int i3 = bArr[1] & 255;
                    long readTimestamp = readTimestamp(bArr, 24);
                    long readTimestamp2 = readTimestamp(bArr, 32);
                    long readTimestamp3 = readTimestamp(bArr, 40);
                    checkValidServerReply((byte) ((b >> 6) & 3), (byte) (b & 7), i3, readTimestamp3);
                    long j2 = (j + (((readTimestamp3 - j) + (readTimestamp2 - readTimestamp)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j2;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e;
                    } else {
                        socketTimeoutException.addSuppressed(e);
                    }
                    int i4 = i2 + 1;
                    if (i2 >= 10) {
                        break;
                    }
                    i++;
                    i2 = i4;
                }
            }
            throw ((SocketTimeoutException) Assertions.checkNotNull(socketTimeoutException));
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long read32(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    private static long readTimestamp(byte[] bArr, int i) {
        long read32 = read32(bArr, i);
        long read322 = read32(bArr, i + 4);
        if (read32 == 0 && read322 == 0) {
            return 0L;
        }
        return ((read322 * 1000) / 4294967296L) + ((read32 - 2208988800L) * 1000);
    }

    public static void setMaxElapsedTimeUntilUpdateMs(long j) {
        synchronized (valueLock) {
            maxElapsedTimeUntilUpdateMs = j;
        }
    }

    public static void setNtpHost(String str) {
        synchronized (valueLock) {
            try {
                if (!ntpHost.equals(str)) {
                    ntpHost = str;
                    isInitialized = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setTimeoutMs(int i) {
        synchronized (valueLock) {
            try {
                if (timeoutMs != i) {
                    timeoutMs = i;
                    isInitialized = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void writeTimestamp(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        bArr[i] = (byte) (r2 >> 24);
        bArr[i + 1] = (byte) (r2 >> 16);
        bArr[i + 2] = (byte) (r2 >> 8);
        bArr[i + 3] = (byte) (j2 + 2208988800L);
        long j4 = (j3 * 4294967296L) / 1000;
        bArr[i + 4] = (byte) (j4 >> 24);
        bArr[i + 5] = (byte) (j4 >> 16);
        bArr[i + 6] = (byte) (j4 >> 8);
        bArr[i + 7] = (byte) (Math.random() * 255.0d);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NtpTimeLoadable implements Loader.Loadable {
        private NtpTimeLoadable() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() throws IOException {
            synchronized (SntpClient.loaderLock) {
                synchronized (SntpClient.valueLock) {
                    if (SntpClient.isInitialized) {
                        return;
                    }
                    long loadNtpTimeOffsetMs = SntpClient.loadNtpTimeOffsetMs();
                    synchronized (SntpClient.valueLock) {
                        long unused = SntpClient.lastUpdateElapsedRealtime = SystemClock.elapsedRealtime();
                        long unused2 = SntpClient.elapsedRealtimeOffsetMs = loadNtpTimeOffsetMs;
                        boolean unused3 = SntpClient.isInitialized = true;
                    }
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {

        @Nullable
        private final InitializationCallback callback;

        public NtpTimeCallback(@Nullable InitializationCallback initializationCallback) {
            this.callback = initializationCallback;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(Loader.Loadable loadable, long j, long j2) {
            if (this.callback != null) {
                boolean isInitialized = SntpClient.isInitialized();
                InitializationCallback initializationCallback = this.callback;
                if (isInitialized) {
                    initializationCallback.onInitialized();
                } else {
                    initializationCallback.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
            InitializationCallback initializationCallback = this.callback;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(iOException);
            }
            return Loader.DONT_RETRY;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(Loader.Loadable loadable, long j, long j2, boolean z) {
        }
    }
}
