package com.amazon.comms.calling.foundation.metrics;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.comms.calling.foundation.metrics.providers.CallingMetricsParams;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\fH&J<\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u001c\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\tH&J\"\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0017H&J$\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u0017H&¨\u0006\u001a"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;", "", "recordCounterMetric", "", ShortcutConstants.METRIC_NAME_KEY, "", "callingParams", "Lcom/amazon/comms/calling/foundation/metrics/providers/CallingMetricsParams;", "incrementCounter", "", "recordAPIMetric", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams;", "recordErrorMetric", "error", "errorTitle", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "", "startTimerMetric", "endTimerMetric", AuthorizationDelegateAdapter.FAILURE_CANCELLED, "recordTimerDelta", "delta", "", "recordMetricWithValue", "value", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface MetricsManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void endTimerMetric$default(MetricsManager metricsManager, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: endTimerMetric");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            metricsManager.endTimerMetric(str, z);
        }

        public static /* synthetic */ void recordAPIMetric$default(MetricsManager metricsManager, String str, CallingMetricsParams callingMetricsParams, ApiMetricParams apiMetricParams, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: recordAPIMetric");
                return;
            }
            if ((i & 2) != 0) {
                callingMetricsParams = null;
            }
            metricsManager.recordAPIMetric(str, callingMetricsParams, apiMetricParams);
        }

        public static /* synthetic */ void recordCounterMetric$default(MetricsManager metricsManager, String str, CallingMetricsParams callingMetricsParams, boolean z, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: recordCounterMetric");
                return;
            }
            if ((i & 2) != 0) {
                callingMetricsParams = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            metricsManager.recordCounterMetric(str, callingMetricsParams, z);
        }

        public static /* synthetic */ void recordErrorMetric$default(MetricsManager metricsManager, String str, CallingMetricsParams callingMetricsParams, String str2, String str3, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: recordErrorMetric");
                return;
            }
            if ((i & 2) != 0) {
                callingMetricsParams = null;
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 8) != 0) {
                str3 = "";
            }
            if ((i & 16) != 0) {
                th = null;
            }
            metricsManager.recordErrorMetric(str, callingMetricsParams, str2, str3, th);
        }

        public static /* synthetic */ void recordMetricWithValue$default(MetricsManager metricsManager, String str, CallingMetricsParams callingMetricsParams, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: recordMetricWithValue");
                return;
            }
            if ((i & 2) != 0) {
                callingMetricsParams = null;
            }
            metricsManager.recordMetricWithValue(str, callingMetricsParams, j);
        }

        public static /* synthetic */ void startTimerMetric$default(MetricsManager metricsManager, String str, CallingMetricsParams callingMetricsParams, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: startTimerMetric");
                return;
            }
            if ((i & 2) != 0) {
                callingMetricsParams = null;
            }
            metricsManager.startTimerMetric(str, callingMetricsParams);
        }
    }

    void endTimerMetric(@NotNull String metricName, boolean cancelled);

    void recordAPIMetric(@NotNull String metricName, @Nullable CallingMetricsParams callingParams, @NotNull ApiMetricParams params);

    void recordCounterMetric(@NotNull String metricName, @Nullable CallingMetricsParams callingParams, boolean incrementCounter);

    void recordErrorMetric(@NotNull String metricName, @Nullable CallingMetricsParams callingParams, @NotNull String error, @NotNull String errorTitle, @Nullable Throwable exception);

    void recordMetricWithValue(@NotNull String metricName, @Nullable CallingMetricsParams callingParams, long value);

    void recordTimerDelta(@NotNull String metricName, @Nullable CallingMetricsParams callingParams, long delta);

    void startTimerMetric(@NotNull String metricName, @Nullable CallingMetricsParams callingParams);
}
