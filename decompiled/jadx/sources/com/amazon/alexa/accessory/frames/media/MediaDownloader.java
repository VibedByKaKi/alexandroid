package com.amazon.alexa.accessory.frames.media;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.http.HttpClient;
import com.amazon.alexa.accessory.frames.http.HttpClientConstants;
import com.amazon.alexa.accessory.frames.media.exceptions.MediaDownloaderException;
import com.amazon.alexa.accessory.frames.utils.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class MediaDownloader {
    private static final double BYTES_PER_MIB = 1048576.0d;
    private static final String DOWNLOAD_CANCELLED_MESSAGE = "Download cancelled";
    private static final int MAX_RETRIES = 3;
    private static final double NANOS_PER_SECOND = 1.0E9d;
    private static final long RETRY_DELAY_MS = 1000;
    private static final String TAG = "MediaDownloader";
    private static volatile MediaDownloader mediaDownloader;
    protected final AtomicBoolean cancelled;

    @Nullable
    private final HttpClient httpClient;

    public MediaDownloader(Context context) {
        this.cancelled = new AtomicBoolean(false);
        this.httpClient = null;
    }

    private static HttpClient buildHttpClient(String str, @Nullable byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            Log.e(TAG, "buildHttpClient - no TLS fingerprint, refusing to build SoftAP client");
            Single$$ExternalSyntheticBUOutline0.m$2("TLS fingerprint required for SoftAP media download — firmware did not provide tlsCertInfo.fingerprintSha256");
            return null;
        }
        Base64.Encoder encoder = Base64.getEncoder();
        String encodeToString = encoder.encodeToString(encoder.encode(HttpClientConstants.SESSION_TOKEN.getBytes(StandardCharsets.UTF_8)));
        String encodeToString2 = encoder.encodeToString(bArr);
        Log.i(TAG, "buildHttpClient - using pinned TLS for host: " + str);
        return new HttpClient(HttpClient.buildPinnedOkHttpClient(str, encodeToString2), str, "8080", encodeToString);
    }

    @VisibleForTesting
    public static double calculateMiBPerSecond(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0.0d;
        }
        return (j / BYTES_PER_MIB) / (j2 / NANOS_PER_SECOND);
    }

    private static String formatDurationSeconds(long j) {
        return String.format(Locale.US, "%.1f", Double.valueOf(j / NANOS_PER_SECOND));
    }

    private static String formatMiBPerSecond(long j, long j2) {
        return String.format(Locale.US, "%.1f", Double.valueOf(calculateMiBPerSecond(j, j2)));
    }

    public static MediaDownloader getInstance(Context context, String str, @Nullable byte[] bArr) {
        MediaDownloader mediaDownloader2;
        synchronized (MediaDownloader.class) {
            try {
                if (mediaDownloader != null) {
                    mediaDownloader.teardown();
                }
                mediaDownloader = new MediaDownloader(context, buildHttpClient(str, bArr));
                mediaDownloader2 = mediaDownloader;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaDownloader2;
    }

    private static void logDownloadComplete(String str, long j, long j2) {
        String str2 = TAG;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("SoftAP download complete: file=", str, ", bytes=", j);
        m.append(", duration=");
        m.append(formatDurationSeconds(j2));
        m.append("s, averageSpeed=");
        m.append(formatMiBPerSecond(j, j2));
        m.append(" MiB/s");
        Log.i(str2, m.toString());
    }

    public void cancelAllRequests() {
        Log.i(TAG, "cancelAllRequests - cancelling all in-flight OkHttp calls");
        this.cancelled.set(true);
        HttpClient httpClient = this.httpClient;
        if (httpClient != null) {
            httpClient.cancelAllRequests();
        }
    }

    @VisibleForTesting
    public HttpClient createHttpClient(String str, @Nullable byte[] bArr) {
        return buildHttpClient(str, bArr);
    }

    public MediaDownloadResult fetchMediaData(String str) throws IOException {
        Automotive$$ExternalSyntheticOutline0.m("fetchMediaData: ", str, TAG);
        IOException e = null;
        for (int i = 1; i <= 3; i++) {
            if (this.cancelled.get()) {
                Log.i(TAG, "fetchMediaData - cancelled, aborting retries for: " + str);
                Buffer$$ExternalSyntheticBUOutline0.m$2(DOWNLOAD_CANCELLED_MESSAGE);
                return null;
            }
            long nanoTime = System.nanoTime();
            try {
                HttpClient.HttpClientResponse fetchAsset = this.httpClient.fetchAsset(HttpClient.AssetType.MEDIA, str);
                byte[] content = fetchAsset.getContent();
                logDownloadComplete(str, content == null ? 0L : content.length, System.nanoTime() - nanoTime);
                Log.i(TAG, "fetchMediaData - Download Successful: " + str + ", MIME type: " + fetchAsset.getContentType());
                return new MediaDownloadResult(content, fetchAsset.getContentType());
            } catch (IOException e2) {
                e = e2;
                if (this.cancelled.get()) {
                    Log.i(TAG, "fetchMediaData - cancelled mid-request, aborting retries for: " + str);
                    Buffer$$ExternalSyntheticBUOutline0.m$2(DOWNLOAD_CANCELLED_MESSAGE);
                    return null;
                }
                Log.w(TAG, "fetchMediaData - Attempt %d failed to fetch %s: %s", Integer.valueOf(i), str, e.getMessage());
                if (i < 3) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e3) {
                        Thread.currentThread().interrupt();
                        Buffer$$ExternalSyntheticBUOutline0.m("Download interrupted", e3);
                        return null;
                    }
                }
            }
        }
        Log.e(TAG, "fetchMediaData - All %d attempts failed to fetch %s: %s", 3, str, e.getMessage());
        if (e instanceof MediaDownloaderException) {
            ((MediaDownloaderException) e).publishErrorEventBusMessage();
        }
        throw e;
    }

    public boolean isCancelled() {
        return this.cancelled.get();
    }

    public void resetCancellation() {
        this.cancelled.set(false);
    }

    public MediaDownloadResult streamMediaData(@NonNull String str, @NonNull OutputStream outputStream) throws IOException {
        String str2 = TAG;
        Automotive$$ExternalSyntheticOutline0.m("streamMediaData: ", str, str2);
        if (this.httpClient == null) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("streamMediaData called on a downloader with no HttpClient — subclass must override this method");
            return null;
        }
        if (isCancelled()) {
            Log.i(str2, "streamMediaData - cancelled before request: " + str);
            Buffer$$ExternalSyntheticBUOutline0.m$2(DOWNLOAD_CANCELLED_MESSAGE);
            return null;
        }
        long nanoTime = System.nanoTime();
        try {
            HttpClient.HttpClientStreamResult streamAsset = this.httpClient.streamAsset(HttpClient.AssetType.MEDIA, str, outputStream);
            logDownloadComplete(str, streamAsset.getBytesWritten(), System.nanoTime() - nanoTime);
            Log.i(str2, "streamMediaData - Download Successful: " + str + ", MIME type: " + streamAsset.getContentType() + ", bytes: " + streamAsset.getBytesWritten());
            return new MediaDownloadResult(null, streamAsset.getContentType(), streamAsset.getBytesWritten());
        } catch (IOException e) {
            if (!isCancelled()) {
                Log.e(TAG, "streamMediaData - Failed to fetch %s: %s", str, e.getMessage());
                throw e;
            }
            Log.i(TAG, "streamMediaData - cancelled during request: " + str);
            Buffer$$ExternalSyntheticBUOutline0.m(DOWNLOAD_CANCELLED_MESSAGE, e);
            return null;
        }
    }

    public synchronized void teardown() {
        mediaDownloader = null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MediaDownloadResult {
        private final long bytesWritten;
        private final byte[] content;
        private final String mimeType;

        public MediaDownloadResult(byte[] bArr, String str) {
            this(bArr, str, bArr == null ? -1L : bArr.length);
        }

        public long getBytesWritten() {
            return this.bytesWritten;
        }

        public byte[] getContent() {
            return this.content;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public MediaDownloadResult(byte[] bArr, String str, long j) {
            this.content = bArr;
            this.mimeType = str;
            this.bytesWritten = j;
        }
    }

    public MediaDownloader(Context context, @Nullable HttpClient httpClient) {
        this.cancelled = new AtomicBoolean(false);
        this.httpClient = httpClient;
    }

    public static MediaDownloader getInstance(Context context) {
        if (mediaDownloader == null) {
            synchronized (MediaDownloader.class) {
                try {
                    if (mediaDownloader == null) {
                        mediaDownloader = new MediaDownloader(context);
                    }
                } finally {
                }
            }
        }
        return mediaDownloader;
    }
}
