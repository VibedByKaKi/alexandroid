package com.amazon.alexa.assistant.ui.conversation.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.ra.core.metrics.TouchInteractionMetricProcessorApi;
import com.amazon.alexa.ra.core.metrics.TouchUplComponent;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/metrics/TouchInteractionMetricProcessor;", "Lcom/amazon/alexa/ra/core/metrics/TouchInteractionMetricProcessorApi;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "onTapAttempt", "", JsonFields.COMPONENT, "Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent;", "onTapSuccess", "onTapFailure", AlexaMetricsConstants.AssistantSdkDimensions.FAILURE_REASON, "", "onTapCancel", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TouchInteractionMetricProcessor implements TouchInteractionMetricProcessorApi {

    @NotNull
    private static final String TAG = "TouchInteractionMetricProcessor";

    @NotNull
    private final Logger logger;
    public static final int $stable = 8;

    public TouchInteractionMetricProcessor(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    @Override // com.amazon.alexa.ra.core.metrics.TouchInteractionMetricProcessorApi
    public void onTapAttempt(@NotNull TouchUplComponent component) {
        component.getClass();
        Logger.DefaultImpls.debug$default(this.logger, TAG, "onTapAttempt (retired, no-op): component=" + component, null, 4, null);
    }

    @Override // com.amazon.alexa.ra.core.metrics.TouchInteractionMetricProcessorApi
    public void onTapCancel() {
        Logger.DefaultImpls.debug$default(this.logger, TAG, "onTapCancel (retired, no-op)", null, 4, null);
    }

    @Override // com.amazon.alexa.ra.core.metrics.TouchInteractionMetricProcessorApi
    public void onTapFailure(@NotNull String failureReason) {
        failureReason.getClass();
        Logger.DefaultImpls.debug$default(this.logger, TAG, a$$ExternalSyntheticOutline0.m("onTapFailure (retired, no-op): reason=", failureReason), null, 4, null);
    }

    @Override // com.amazon.alexa.ra.core.metrics.TouchInteractionMetricProcessorApi
    public void onTapSuccess() {
        Logger.DefaultImpls.debug$default(this.logger, TAG, "onTapSuccess (retired, no-op)", null, 4, null);
    }
}
