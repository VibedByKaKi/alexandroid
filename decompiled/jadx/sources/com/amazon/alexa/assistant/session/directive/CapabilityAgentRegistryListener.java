package com.amazon.alexa.assistant.session.directive;

import com.amazon.alexa.assistant.foundation.model.CapabilityAgent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/session/directive/CapabilityAgentRegistryListener;", "", "onCapabilityAgentsChanged", "", "capabilityAgents", "", "Lcom/amazon/alexa/assistant/foundation/model/CapabilityAgent;", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface CapabilityAgentRegistryListener {
    void onCapabilityAgentsChanged(@NotNull List<? extends CapabilityAgent> capabilityAgents);
}
