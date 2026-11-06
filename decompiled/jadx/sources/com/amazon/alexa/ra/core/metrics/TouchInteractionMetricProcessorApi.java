package com.amazon.alexa.ra.core.metrics;

import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/TouchInteractionMetricProcessorApi;", "", "onTapAttempt", "", JsonFields.COMPONENT, "Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent;", "onTapSuccess", "onTapFailure", AlexaMetricsConstants.AssistantSdkDimensions.FAILURE_REASON, "", "onTapCancel", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface TouchInteractionMetricProcessorApi {
    void onTapAttempt(@NotNull TouchUplComponent component);

    void onTapCancel();

    void onTapFailure(@NotNull String failureReason);

    void onTapSuccess();
}
