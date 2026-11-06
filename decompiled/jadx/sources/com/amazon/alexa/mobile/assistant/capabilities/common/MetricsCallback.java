package com.amazon.alexa.mobile.assistant.capabilities.common;

import com.amazon.alexa.assistant.foundation.metric.model.Metric;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/common/MetricsCallback;", "", "onMetric", "", ShortcutConstants.METRIC_NAME_KEY, "", "directiveName", "metric", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric;", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface MetricsCallback {
    void onMetric(@NotNull Metric metric);

    void onMetric(@NotNull String metricName, @NotNull String directiveName);
}
