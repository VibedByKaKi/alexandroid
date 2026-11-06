package com.amazon.alexa.ra.sdk.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.ra.core.metrics.TouchInteractionMetricProcessorApi;
import com.amazon.alexa.ra.core.metrics.TouchUplComponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/sdk/metrics/TouchInteractionMetricProcessor;", "Lcom/amazon/alexa/ra/core/metrics/TouchInteractionMetricProcessorApi;", "<init>", "()V", "onTapAttempt", "", JsonFields.COMPONENT, "Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent;", "onTapSuccess", "onTapFailure", AlexaMetricsConstants.AssistantSdkDimensions.FAILURE_REASON, "", "onTapCancel", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TouchInteractionMetricProcessor implements TouchInteractionMetricProcessorApi {
    public static final int $stable = 0;

    @Override // com.amazon.alexa.ra.core.metrics.TouchInteractionMetricProcessorApi
    public void onTapAttempt(@NotNull TouchUplComponent component) {
        component.getClass();
    }

    @Override // com.amazon.alexa.ra.core.metrics.TouchInteractionMetricProcessorApi
    public void onTapFailure(@NotNull String failureReason) {
        failureReason.getClass();
    }

    @Override // com.amazon.alexa.ra.core.metrics.TouchInteractionMetricProcessorApi
    public void onTapCancel() {
    }

    @Override // com.amazon.alexa.ra.core.metrics.TouchInteractionMetricProcessorApi
    public void onTapSuccess() {
    }
}
