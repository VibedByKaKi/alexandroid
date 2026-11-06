package com.amazon.alexa.accessory.frames.accessproof;

import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.amazon.alexa.accessory.frames.utils.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AttestationRevocationListCache {

    @VisibleForTesting
    static final String BODY_KEY = "accessproof.crl.body";

    @VisibleForTesting
    static final String EXPIRES_AT_KEY = "accessproof.crl.expiresAtEpochMillis";
    private static final String MAX_AGE_DIRECTIVE = "max-age=";

    @VisibleForTesting
    static final long MAX_BODY_BYTES = 1048576;
    private static final String TAG = "AttestationRevocationCache";
    private boolean fetchedListInMemory;
    private final BodyFetcher fetcher;
    private final String statusUrl;
    private final KeyValueStore store;

    @VisibleForTesting
    static final long DEFAULT_MAX_AGE_MILLIS = 43200000;

    @VisibleForTesting
    static final long MAX_HONOURED_MAX_AGE_MILLIS = 86400000;
    private final AtomicReference<AttestationRevocationList> inMemory = new AtomicReference<>(AttestationRevocationList.EMPTY);
    private final AtomicReference<Long> expiresAtEpochMillis = new AtomicReference<>(0L);
    private final AtomicBoolean storedListLoaded = new AtomicBoolean(false);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface BodyFetcher {
        Fetched fetch(String str) throws IOException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static final class Fetched {
        private final String body;
        private final String cacheControl;

        @VisibleForTesting
        public Fetched(String str, String str2) {
            this.body = str;
            this.cacheControl = str2;
        }
    }

    @VisibleForTesting
    public AttestationRevocationListCache(KeyValueStore keyValueStore, BodyFetcher bodyFetcher, String str) {
        if (keyValueStore == null || bodyFetcher == null || str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("a cache needs a store, a fetcher and a url");
            throw null;
        }
        this.store = keyValueStore;
        this.fetcher = bodyFetcher;
        this.statusUrl = str;
    }

    public static AttestationRevocationListCache create() {
        return new AttestationRevocationListCache(new StorageWrapperKeyValueStore(), new OkHttpBodyFetcher(0), "https://android.googleapis.com/attestation/status");
    }

    private void loadFromStore() {
        try {
            String read = this.store.read(BODY_KEY);
            String read2 = this.store.read(EXPIRES_AT_KEY);
            if (read == null) {
                return;
            }
            AttestationRevocationList parseOrNull = AttestationRevocationList.parseOrNull(read);
            if (parseOrNull == null) {
                Log.w(TAG, "stored status list did not parse; treating it as stale");
                return;
            }
            synchronized (this) {
                try {
                    if (this.fetchedListInMemory) {
                        return;
                    }
                    this.inMemory.set(parseOrNull);
                    if (read2 != null) {
                        this.expiresAtEpochMillis.set(Long.valueOf(Long.parseLong(read2.trim())));
                    }
                    Log.i(TAG, "loaded a stored status list with %d entries", Integer.valueOf(parseOrNull.size()));
                } finally {
                }
            }
        } catch (NumberFormatException unused) {
            Log.w(TAG, "stored status list expiry was unreadable; treating the list as stale");
        } catch (RuntimeException e) {
            Log.w(TAG, "could not load a stored status list: %s", e.getMessage());
        }
    }

    @VisibleForTesting
    public static long maxAgeFrom(String str) {
        String str2;
        if (str == null) {
            return DEFAULT_MAX_AGE_MILLIS;
        }
        String[] split = str.toLowerCase(Locale.ROOT).split(",");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = null;
                break;
            }
            String trim = split[i].trim();
            if (trim.startsWith(MAX_AGE_DIRECTIVE)) {
                str2 = trim.substring(8);
                break;
            }
            i++;
        }
        if (str2 == null) {
            return DEFAULT_MAX_AGE_MILLIS;
        }
        int i2 = 0;
        while (i2 < str2.length() && Character.isDigit(str2.charAt(i2))) {
            i2++;
        }
        if (i2 == 0) {
            return DEFAULT_MAX_AGE_MILLIS;
        }
        try {
            long parseLong = Long.parseLong(str2.substring(0, i2));
            if (parseLong <= 0) {
                return 0L;
            }
            return Math.min(TimeUnit.SECONDS.toMillis(parseLong), MAX_HONOURED_MAX_AGE_MILLIS);
        } catch (NumberFormatException unused) {
            return DEFAULT_MAX_AGE_MILLIS;
        }
    }

    @VisibleForTesting
    public static String readBounded(InputStream inputStream, long j) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
            }
            j2 += read;
            if (j2 > j) {
                return null;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public AttestationRevocationList current() {
        return this.inMemory.get();
    }

    public boolean isStale() {
        return System.currentTimeMillis() >= this.expiresAtEpochMillis.get().longValue();
    }

    @WorkerThread
    public void loadStored() {
        if (this.storedListLoaded.compareAndSet(false, true)) {
            loadFromStore();
        }
    }

    @WorkerThread
    public boolean refreshIfStale() {
        loadStored();
        if (isStale()) {
            return refreshNow();
        }
        return false;
    }

    @WorkerThread
    public boolean refreshNow() {
        loadStored();
        try {
            Fetched fetch = this.fetcher.fetch(this.statusUrl);
            if (fetch == null) {
                Log.w(TAG, "status list unavailable; keeping the previous list");
                return false;
            }
            String str = fetch.body;
            long maxAgeFrom = maxAgeFrom(fetch.cacheControl);
            if (str == null) {
                return false;
            }
            AttestationRevocationList parseOrNull = AttestationRevocationList.parseOrNull(str);
            if (parseOrNull == null) {
                Log.e(TAG, "status list did not parse; keeping the previous list");
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() + maxAgeFrom;
            synchronized (this) {
                this.inMemory.set(parseOrNull);
                this.expiresAtEpochMillis.set(Long.valueOf(currentTimeMillis));
                this.fetchedListInMemory = true;
            }
            try {
                this.store.write(BODY_KEY, str);
                this.store.write(EXPIRES_AT_KEY, Long.toString(currentTimeMillis));
            } catch (RuntimeException e) {
                Log.w(TAG, "could not persist the status list: %s", e.getMessage());
            }
            Log.i(TAG, "status list refreshed: %d entries, expires in %d minutes", Integer.valueOf(parseOrNull.size()), Long.valueOf(maxAgeFrom / 60000));
            return true;
        } catch (IOException e2) {
            Log.w(TAG, "could not fetch the status list (%s); keeping the previous list", e2.getMessage());
            return false;
        } catch (RuntimeException e3) {
            Log.e(TAG, "status list fetch failed unexpectedly; keeping the previous list", e3);
            return false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OkHttpBodyFetcher implements BodyFetcher {
        private volatile OkHttpClient http;

        public /* synthetic */ OkHttpBodyFetcher(int i) {
            this();
        }

        private OkHttpClient client() {
            OkHttpClient okHttpClient;
            OkHttpClient okHttpClient2 = this.http;
            if (okHttpClient2 != null) {
                return okHttpClient2;
            }
            synchronized (this) {
                try {
                    if (this.http == null) {
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        this.http = builder.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).build();
                    }
                    okHttpClient = this.http;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return okHttpClient;
        }

        @Override // com.amazon.alexa.accessory.frames.accessproof.AttestationRevocationListCache.BodyFetcher
        public Fetched fetch(String str) throws IOException {
            Response execute = client().newCall(new Request.Builder().url(str).get().build()).execute();
            try {
                if (execute.isSuccessful() && execute.body() != null) {
                    long contentLength = execute.body().contentLength();
                    if (contentLength > 1048576) {
                        Log.w(AttestationRevocationListCache.TAG, "status list declares %d bytes, over the cap", Long.valueOf(contentLength));
                        execute.close();
                        return null;
                    }
                    String readBounded = AttestationRevocationListCache.readBounded(execute.body().byteStream(), 1048576L);
                    if (readBounded == null) {
                        Log.w(AttestationRevocationListCache.TAG, "status list body exceeded the cap");
                        execute.close();
                        return null;
                    }
                    Fetched fetched = new Fetched(readBounded, execute.header("Cache-Control"));
                    execute.close();
                    return fetched;
                }
                Log.w(AttestationRevocationListCache.TAG, "status list fetch returned %d", Integer.valueOf(execute.code()));
                execute.close();
                return null;
            } catch (Throwable th) {
                if (execute != null) {
                    try {
                        execute.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        private OkHttpBodyFetcher() {
        }
    }
}
