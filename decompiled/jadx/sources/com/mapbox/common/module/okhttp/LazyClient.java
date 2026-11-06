package com.mapbox.common.module.okhttp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mapbox.common.HttpSslConfig;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class LazyClient {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long DEFAULT_CONNECT_TIMEOUT_SEC = 30;
    private static final long DEFAULT_PING_INTERVAL_SEC = 20;
    private static final long DEFAULT_READ_TIMEOUT_SEC = 60;
    private static final ConnectionPool connectionPool = new ConnectionPool(5, 2, TimeUnit.MINUTES);
    private volatile int builtWithSslConfigGeneration;
    private volatile OkHttpClient client;
    private final boolean disableHttp2;
    private final EventListener.Factory eventListenerFactory;
    private byte maxRequestsPerHost;
    private final long pingIntervalSec;
    private final SocketFactory socketFactory;

    public LazyClient(@Nullable SocketFactory socketFactory, boolean z, long j, @NonNull EventListener.Factory factory) {
        this.maxRequestsPerHost = (byte) 0;
        this.builtWithSslConfigGeneration = -1;
        this.socketFactory = socketFactory;
        this.disableHttp2 = z;
        this.pingIntervalSec = j;
        this.eventListenerFactory = factory;
    }

    private static OkHttpClient buildOkHttpClient(@Nullable SocketFactory socketFactory, boolean z, long j, @NonNull EventListener.Factory factory) {
        OkHttpClient.Builder eventListenerFactory = new OkHttpClient.Builder().eventListenerFactory(factory);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder connectionPool2 = eventListenerFactory.connectTimeout(30L, timeUnit).readTimeout(60L, timeUnit).pingInterval(j, timeUnit).connectionPool(connectionPool);
        if (socketFactory != null) {
            connectionPool2.socketFactory(socketFactory);
        }
        Pair<SSLSocketFactory, X509TrustManager> pair = HttpSslConfig.INSTANCE.get();
        if (pair != null) {
            connectionPool2.sslSocketFactory(pair.getFirst(), pair.getSecond());
        }
        if (z) {
            connectionPool2.protocols(Arrays.asList(Protocol.HTTP_1_1));
        }
        return connectionPool2.build();
    }

    public static void evictIdleConnections() {
        connectionPool.evictAll();
    }

    public OkHttpClient get() {
        HttpSslConfig httpSslConfig = HttpSslConfig.INSTANCE;
        int generation = httpSslConfig.getGeneration();
        if (this.client == null || generation != this.builtWithSslConfigGeneration) {
            synchronized (this) {
                try {
                    int generation2 = httpSslConfig.getGeneration();
                    if (this.client != null) {
                        if (generation2 != this.builtWithSslConfigGeneration) {
                        }
                    }
                    this.client = buildOkHttpClient(this.socketFactory, this.disableHttp2, this.pingIntervalSec, this.eventListenerFactory);
                    this.builtWithSslConfigGeneration = generation2;
                    if (this.maxRequestsPerHost != 0) {
                        this.client.dispatcher().setMaxRequestsPerHost(this.maxRequestsPerHost);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.client;
    }

    public synchronized void setMaxRequestsPerHost(byte b) {
        this.maxRequestsPerHost = b;
        if (b != 0) {
            synchronized (this) {
                try {
                    OkHttpClient okHttpClient = this.client;
                    if (okHttpClient != null) {
                        okHttpClient.dispatcher().setMaxRequestsPerHost(b);
                    }
                } finally {
                }
            }
        }
    }

    public LazyClient(@Nullable SocketFactory socketFactory, boolean z) {
        this(socketFactory, z, 20L, NetworkUsageListener.FACTORY);
    }
}
