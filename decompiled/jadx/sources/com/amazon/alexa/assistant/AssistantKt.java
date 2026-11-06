package com.amazon.alexa.assistant;

import com.amazon.alexa.assistant.AssistantState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"DEFAULT_ASSISTANT_STATE", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/AssistantState;", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AssistantKt {

    @NotNull
    private static final StateFlow<AssistantState> DEFAULT_ASSISTANT_STATE = FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(AssistantState.Stopped.INSTANCE));
}
