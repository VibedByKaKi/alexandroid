package com.mapbox.maps;

import com.dee.app.metrics.MetricsConstants;
import com.mapbox.common.LogThrottler;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0007H\u0086\u0002J\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/LogThrottlers;", "", "defaultInterval", "", "(J)V", "throttlers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/mapbox/common/LogThrottler;", MetricsConstants.Method.CACHE_CLEAR, "", MetricsConstants.Method.CACHE_GET, "key", "interval", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class LogThrottlers {
    public static final long LOG_THROTTLE_INTERVAL_MS = 300;
    private final long defaultInterval;

    @NotNull
    private final ConcurrentHashMap<String, LogThrottler> throttlers;

    public LogThrottlers(long j) {
        this.defaultInterval = j;
        this.throttlers = new ConcurrentHashMap<>();
    }

    public final void clear() {
        this.throttlers.clear();
    }

    @NotNull
    public final LogThrottler get(@NotNull String key, long interval) {
        key.getClass();
        LogThrottler logThrottler = this.throttlers.get(key);
        if (logThrottler != null) {
            return logThrottler;
        }
        LogThrottler logThrottler2 = new LogThrottler(Long.valueOf(interval));
        LogThrottler putIfAbsent = this.throttlers.putIfAbsent(key, logThrottler2);
        return putIfAbsent == null ? logThrottler2 : putIfAbsent;
    }

    public LogThrottlers() {
        this(0L, 1, null);
    }

    public /* synthetic */ LogThrottlers(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 300L : j);
    }

    @NotNull
    public final LogThrottler get(@NotNull String key) {
        key.getClass();
        return get(key, this.defaultInterval);
    }
}
