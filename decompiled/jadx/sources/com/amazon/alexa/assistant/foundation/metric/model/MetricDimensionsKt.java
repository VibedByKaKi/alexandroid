package com.amazon.alexa.assistant.foundation.metric.model;

import com.amazon.alexa.assistant.foundation.metric.model.MetricDimensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"buildMetricDimensions", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions;", "block", "Lkotlin/Function1;", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions$Builder;", "", "Lkotlin/ExtensionFunctionType;", "foundation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MetricDimensionsKt {
    @NotNull
    public static final MetricDimensions buildMetricDimensions(@NotNull Function1<? super MetricDimensions.Builder, Unit> function1) {
        function1.getClass();
        MetricDimensions.Builder builder = new MetricDimensions.Builder();
        function1.invoke(builder);
        return builder.build();
    }
}
