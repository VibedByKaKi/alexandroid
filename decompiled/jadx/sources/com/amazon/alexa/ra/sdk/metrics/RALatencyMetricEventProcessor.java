package com.amazon.alexa.ra.sdk.metrics;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.AlexaMetadataBundleKey;
import com.amazon.alexa.api.compat.model.UiEventName;
import com.amazon.clouddrive.model.NodeType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0096@¢\u0006\u0002\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/sdk/metrics/RALatencyMetricEventProcessor;", "Lcom/amazon/alexa/ra/sdk/metrics/LatencyMetricEventProcessor;", "metricsReporter", "Lcom/amazon/alexa/ra/sdk/metrics/RaUiEventReporter;", "<init>", "(Lcom/amazon/alexa/ra/sdk/metrics/RaUiEventReporter;)V", "processEvent", "", "eventName", "Lcom/amazon/alexa/api/compat/model/UiEventName;", "latencyMillis", "", "eventSource", "", "customMetadata", "", "Lcom/amazon/alexa/api/compat/model/AlexaMetadataBundleKey;", "", "(Lcom/amazon/alexa/api/compat/model/UiEventName;JLjava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBundle", "Landroid/os/Bundle;", "getBundle$AVSMobileFramework_ra_android_ui_prodRelease", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class RALatencyMetricEventProcessor implements LatencyMetricEventProcessor {

    @NotNull
    private final RaUiEventReporter metricsReporter;
    public static final int $stable = 8;
    private static final String TAG = "RALatencyMetricEventProcessor";

    public RALatencyMetricEventProcessor(@NotNull RaUiEventReporter raUiEventReporter) {
        raUiEventReporter.getClass();
        this.metricsReporter = raUiEventReporter;
    }

    @VisibleForTesting
    @NotNull
    public final Bundle getBundle$AVSMobileFramework_ra_android_ui_prodRelease() {
        return new Bundle();
    }

    @Override // com.amazon.alexa.ra.sdk.metrics.LatencyMetricEventProcessor
    @Nullable
    public Object processEvent(@NotNull UiEventName uiEventName, long j, @Nullable String str, @NotNull Map<AlexaMetadataBundleKey, ? extends Object> map, @NotNull Continuation<? super Boolean> continuation) {
        if (j < 0) {
            Log.e(TAG, "Invalid latency reported: " + j + ", ignoring.");
            return Boxing.boxBoolean(false);
        }
        Bundle bundle$AVSMobileFramework_ra_android_ui_prodRelease = getBundle$AVSMobileFramework_ra_android_ui_prodRelease();
        for (Map.Entry<AlexaMetadataBundleKey, ? extends Object> entry : map.entrySet()) {
            AlexaMetadataBundleKey key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle$AVSMobileFramework_ra_android_ui_prodRelease.putString(key.name(), (String) value);
            } else if (value instanceof Long) {
                bundle$AVSMobileFramework_ra_android_ui_prodRelease.putLong(key.name(), ((Number) value).longValue());
            } else {
                Boxing.boxInt(Log.e(TAG, "Unsupported metadata type for key: " + key.name() + ", value: " + value));
            }
        }
        bundle$AVSMobileFramework_ra_android_ui_prodRelease.putLong("LATENCY_REALTIME_MS", j);
        if (str != null) {
            bundle$AVSMobileFramework_ra_android_ui_prodRelease.putString(NodeType.SOURCE, str);
        }
        this.metricsReporter.sendEvent(uiEventName, bundle$AVSMobileFramework_ra_android_ui_prodRelease);
        return Boxing.boxBoolean(true);
    }
}
