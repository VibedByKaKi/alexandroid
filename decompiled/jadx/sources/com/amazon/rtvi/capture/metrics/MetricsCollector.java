package com.amazon.rtvi.capture.metrics;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.dee.app.metrics.MetricsConstants;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H&J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\"\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\bH&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u001b"}, d2 = {"Lcom/amazon/rtvi/capture/metrics/MetricsCollector;", "", "recordElapsedTimer", "", "metric", "", "subcomponent", "elapsedTimeMs", "", "finish", "", "recordOccurrence", "eventOccurred", "recordTimer", "finishTimer", "incrementCounter", "value", "recordCounter", "recordCriticalEvent", "errorTitle", "error", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "", "autoGenerateStacktrace", "recordWarningEvent", "recordInfoEvent", "Companion", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface MetricsCollector {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/rtvi/capture/metrics/MetricsCollector$Companion;", "", "<init>", "()V", AlexaEventBundleKeys.INSTANCE, "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/amazon/rtvi/capture/metrics/MetricsCollector;", MetricsConstants.Method.CACHE_GET, "setIfNotSet", "", "collector", "set", "", "reset", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final AtomicReference<MetricsCollector> instance = new AtomicReference<>(NoOpMetricsCollector.INSTANCE);

        private Companion() {
        }

        @NotNull
        public final MetricsCollector get() {
            MetricsCollector metricsCollector = instance.get();
            metricsCollector.getClass();
            return metricsCollector;
        }

        public final void reset() {
            instance.set(NoOpMetricsCollector.INSTANCE);
        }

        public final void set(@NotNull MetricsCollector collector) {
            collector.getClass();
            instance.set(collector);
        }

        public final boolean setIfNotSet(@NotNull MetricsCollector collector) {
            collector.getClass();
            AtomicReference<MetricsCollector> atomicReference = instance;
            NoOpMetricsCollector noOpMetricsCollector = NoOpMetricsCollector.INSTANCE;
            while (!atomicReference.compareAndSet(noOpMetricsCollector, collector)) {
                if (atomicReference.get() != noOpMetricsCollector) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void incrementCounter$default(MetricsCollector metricsCollector, String str, String str2, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: incrementCounter");
                return;
            }
            if ((i & 4) != 0) {
                j = 1;
            }
            metricsCollector.incrementCounter(str, str2, j);
        }

        public static /* synthetic */ void recordTimer$default(MetricsCollector metricsCollector, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: recordTimer");
                return;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            metricsCollector.recordTimer(str, str2, z);
        }
    }

    void finishTimer(@NotNull String metric, @NotNull String subcomponent);

    void incrementCounter(@NotNull String metric, @NotNull String subcomponent, long value);

    void recordCounter(@NotNull String metric, @NotNull String subcomponent);

    void recordCriticalEvent(@NotNull String errorTitle, @NotNull String error, @NotNull Throwable exception, @NotNull String subcomponent);

    void recordCriticalEvent(@NotNull String errorTitle, @NotNull String error, boolean autoGenerateStacktrace, @NotNull String subcomponent);

    void recordElapsedTimer(@NotNull String metric, @NotNull String subcomponent, long elapsedTimeMs, boolean finish);

    void recordInfoEvent(@NotNull String errorTitle, @NotNull String error, @NotNull Throwable exception, @NotNull String subcomponent);

    void recordInfoEvent(@NotNull String errorTitle, @NotNull String error, boolean autoGenerateStacktrace, @NotNull String subcomponent);

    void recordOccurrence(@NotNull String metric, boolean eventOccurred, @NotNull String subcomponent);

    void recordTimer(@NotNull String metric, @NotNull String subcomponent, boolean finish);

    void recordWarningEvent(@NotNull String errorTitle, @NotNull String error, @NotNull Throwable exception, @NotNull String subcomponent);

    void recordWarningEvent(@NotNull String errorTitle, @NotNull String error, boolean autoGenerateStacktrace, @NotNull String subcomponent);
}
