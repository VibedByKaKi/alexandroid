package com.amazon.alexa.mobile.assistant.capabilities;

import com.amazon.alexa.assistant.foundation.metric.model.Metric;
import com.amazon.alexa.mobile.assistant.capabilities.common.MetricsCallback;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/InternalNoOpMetricsCallback;", "Lcom/amazon/alexa/mobile/assistant/capabilities/common/MetricsCallback;", "<init>", "()V", "onMetric", "", ShortcutConstants.METRIC_NAME_KEY, "", "directiveName", "metric", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric;", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
final class InternalNoOpMetricsCallback implements MetricsCallback {

    @NotNull
    public static final InternalNoOpMetricsCallback INSTANCE = new InternalNoOpMetricsCallback();

    private InternalNoOpMetricsCallback() {
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.common.MetricsCallback
    public void onMetric(@NotNull String metricName, @NotNull String directiveName) {
        metricName.getClass();
        directiveName.getClass();
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.common.MetricsCallback
    public void onMetric(@NotNull Metric metric) {
        metric.getClass();
    }
}
