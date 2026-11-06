package com.amazon.alexa.assistant.toolkit.session;

import com.amazon.alexa.assistant.toolkit.session.model.DiscoveryAgentCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/DiscoveryAgentCommandListener;", "", "onTriggerDiscoveryCommand", "", "discoveryCommand", "Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryAgentCommand;", "(Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryAgentCommand;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DiscoveryAgentCommandListener {
    @Nullable
    Object onTriggerDiscoveryCommand(@NotNull DiscoveryAgentCommand discoveryAgentCommand, @NotNull Continuation<? super Unit> continuation);
}
