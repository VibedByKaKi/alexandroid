package com.amazon.alexa.assistant.transport;

import com.amazon.alexa.assistant.transport.model.ClientState;
import com.amazon.alexa.assistant.transport.model.MetricName;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u0001BW\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\"\u001a\u00020\u0005R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u00020\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/amazon/alexa/assistant/transport/TokenHold;", "", "waitsIn", "Lkotlin/Function1;", "Lcom/amazon/alexa/assistant/transport/model/ClientState;", "", "inFlight", "Lkotlinx/coroutines/flow/StateFlow;", "held", "Lkotlin/Function0;", "cap", "Lkotlin/time/Duration;", "timedOutMetric", "Lcom/amazon/alexa/assistant/transport/model/MetricName;", "label", "", "failsAfterRedial", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;JLcom/amazon/alexa/assistant/transport/model/MetricName;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWaitsIn", "()Lkotlin/jvm/functions/Function1;", "getInFlight", "()Lkotlinx/coroutines/flow/StateFlow;", "getHeld", "()Lkotlin/jvm/functions/Function0;", "getCap-UwyO8pc", "()J", "J", "getTimedOutMetric", "()Lcom/amazon/alexa/assistant/transport/model/MetricName;", "getLabel", "()Ljava/lang/String;", "getFailsAfterRedial", "()Z", "coming", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TokenHold {
    private final long cap;
    private final boolean failsAfterRedial;

    @NotNull
    private final Function0<Boolean> held;

    @NotNull
    private final StateFlow<Boolean> inFlight;

    @NotNull
    private final String label;

    @NotNull
    private final MetricName timedOutMetric;

    @NotNull
    private final Function1<ClientState, Boolean> waitsIn;

    /* JADX WARN: Multi-variable type inference failed */
    private TokenHold(Function1<? super ClientState, Boolean> function1, StateFlow<Boolean> stateFlow, Function0<Boolean> function0, long j, MetricName metricName, String str, boolean z) {
        function1.getClass();
        stateFlow.getClass();
        function0.getClass();
        metricName.getClass();
        str.getClass();
        this.waitsIn = function1;
        this.inFlight = stateFlow;
        this.held = function0;
        this.cap = j;
        this.timedOutMetric = metricName;
        this.label = str;
        this.failsAfterRedial = z;
    }

    public final boolean coming() {
        return this.inFlight.getValue().booleanValue() || this.held.invoke().booleanValue();
    }

    /* renamed from: getCap-UwyO8pc, reason: not valid java name and from getter */
    public final long getCap() {
        return this.cap;
    }

    public final boolean getFailsAfterRedial() {
        return this.failsAfterRedial;
    }

    @NotNull
    public final Function0<Boolean> getHeld() {
        return this.held;
    }

    @NotNull
    public final StateFlow<Boolean> getInFlight() {
        return this.inFlight;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final MetricName getTimedOutMetric() {
        return this.timedOutMetric;
    }

    @NotNull
    public final Function1<ClientState, Boolean> getWaitsIn() {
        return this.waitsIn;
    }

    public /* synthetic */ TokenHold(Function1 function1, StateFlow stateFlow, Function0 function0, long j, MetricName metricName, String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, stateFlow, function0, j, metricName, str, z);
    }
}
