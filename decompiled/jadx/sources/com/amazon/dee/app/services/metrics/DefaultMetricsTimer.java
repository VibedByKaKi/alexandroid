package com.amazon.dee.app.services.metrics;

import com.dee.app.metrics.MetricsTimer;
import io.ktor.client.utils.CacheControl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BG\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/amazon/dee/app/services/metrics/DefaultMetricsTimer;", "Lcom/amazon/dee/app/services/metrics/DefaultAlexaMetricsEvent;", "Lcom/dee/app/metrics/MetricsTimer;", "eventName", "", "componentName", "customEntries", "", "", "initialElapsedTime", "", "startTimer", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JZ)V", "isRunningMutex", "startingTime", "finishedTime", "lastStartTime", "elapsedTime", "isRunning", "finishTimer", "", "endTimeMillis", "(Ljava/lang/Long;)V", "pauseTimer", "resumeTimer", "getElapsedTime", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultMetricsTimer extends DefaultAlexaMetricsEvent implements MetricsTimer {
    private long elapsedTime;
    private long finishedTime;
    private boolean isRunning;

    @NotNull
    private final Object isRunningMutex;
    private long lastStartTime;
    private final long startingTime;

    @JvmOverloads
    public DefaultMetricsTimer(@Nullable String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, long j, boolean z) {
        super(str, str2, map);
        this.isRunningMutex = new Object();
        this.elapsedTime = j;
        this.isRunning = z;
        long eventDate = getEventDate();
        this.lastStartTime = eventDate;
        this.startingTime = eventDate;
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void finishTimer(@Nullable Long endTimeMillis) {
        synchronized (this.isRunningMutex) {
            try {
                if (this.isRunning) {
                    this.isRunning = false;
                    long longValue = endTimeMillis != null ? endTimeMillis.longValue() : System.currentTimeMillis();
                    this.finishedTime = longValue;
                    this.elapsedTime = (longValue - this.lastStartTime) + this.elapsedTime;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public long getElapsedTime() {
        long j;
        synchronized (this.isRunningMutex) {
            boolean z = this.isRunning;
            j = this.elapsedTime;
            if (z) {
                j = (j + System.currentTimeMillis()) - this.lastStartTime;
            }
        }
        return j;
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void pauseTimer() {
        synchronized (this.isRunningMutex) {
            try {
                if (this.isRunning) {
                    this.isRunning = false;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.finishedTime = currentTimeMillis;
                    this.elapsedTime = (currentTimeMillis - this.lastStartTime) + this.elapsedTime;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void resumeTimer() {
        synchronized (this.isRunningMutex) {
            try {
                if (!this.isRunning) {
                    this.isRunning = true;
                    this.lastStartTime = System.currentTimeMillis();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JvmOverloads
    public DefaultMetricsTimer(@Nullable String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, long j) {
        this(str, str2, map, j, false, 16, null);
    }

    public /* synthetic */ DefaultMetricsTimer(String str, String str2, Map map, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? true : z);
    }

    @JvmOverloads
    public DefaultMetricsTimer(@Nullable String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map) {
        this(str, str2, map, 0L, false, 24, null);
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void finishTimer() {
        synchronized (this.isRunningMutex) {
            try {
                if (this.isRunning) {
                    finishTimer(Long.valueOf(System.currentTimeMillis()));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
