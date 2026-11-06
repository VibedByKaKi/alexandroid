package com.amazon.alexa.assistant.session.directive;

import com.amazon.alexa.assistant.foundation.model.CapabilityAgent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/session/directive/CapabilityAgentRegistry;", "", "registerCapabilityAgent", "", "agent", "Lcom/amazon/alexa/assistant/foundation/model/CapabilityAgent;", "registerCapabilityAgents", "", "", "agents", "unregisterCapabilityAgent", "interfaceName", "getCapabilityAgent", "getCapabilityAgents", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface CapabilityAgentRegistry {
    @Nullable
    CapabilityAgent getCapabilityAgent(@NotNull String interfaceName);

    @NotNull
    List<CapabilityAgent> getCapabilityAgents();

    boolean registerCapabilityAgent(@NotNull CapabilityAgent agent);

    @NotNull
    List<String> registerCapabilityAgents(@NotNull List<? extends CapabilityAgent> agents);

    boolean unregisterCapabilityAgent(@NotNull String interfaceName);
}
