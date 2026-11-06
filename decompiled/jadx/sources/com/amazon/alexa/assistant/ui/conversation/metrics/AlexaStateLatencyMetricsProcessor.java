package com.amazon.alexa.assistant.ui.conversation.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.metrics.AlexaStateLatencyMetricsProcessorApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/metrics/AlexaStateLatencyMetricsProcessor;", "Lcom/amazon/alexa/ra/core/metrics/AlexaStateLatencyMetricsProcessorApi;", "onUserCancelTapped", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "onStopButtonPressed", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AlexaStateLatencyMetricsProcessor implements AlexaStateLatencyMetricsProcessorApi {
    public static final int $stable = 0;

    @NotNull
    private final Function0<Unit> onUserCancelTapped;

    public AlexaStateLatencyMetricsProcessor(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.onUserCancelTapped = function0;
    }

    @Override // com.amazon.alexa.ra.core.metrics.AlexaStateLatencyMetricsProcessorApi
    public void onStopButtonPressed() {
        this.onUserCancelTapped.invoke();
    }
}
