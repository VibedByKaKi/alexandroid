package com.amazon.alexa.assistant.toolkit.serverBoundMessage;

import com.amazon.alexa.assistant.foundation.model.Capability;
import com.amazon.alexa.assistant.foundation.model.CapabilityEventRequest;
import com.amazon.alexa.assistant.foundation.model.ContextProperty;
import com.amazon.alexa.assistant.foundation.model.EventContextConfigurationSource;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/serverBoundMessage/ServerBoundMessageSource;", "", "capability", "Lcom/amazon/alexa/assistant/foundation/model/Capability;", "getCapability", "()Lcom/amazon/alexa/assistant/foundation/model/Capability;", "context", "Lcom/amazon/alexa/assistant/foundation/model/ContextProperty;", "getContext", "()Lcom/amazon/alexa/assistant/foundation/model/ContextProperty;", "eventNamespace", "", "eventName", "additionalContext", "", "getAdditionalContext", "()Ljava/util/Set;", "capabilityEventRequestFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/amazon/alexa/assistant/foundation/model/CapabilityEventRequest;", "getCapabilityEventRequestFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "eventContextConfigurationSource", "Lcom/amazon/alexa/assistant/foundation/model/EventContextConfigurationSource;", "getEventContextConfigurationSource", "()Lcom/amazon/alexa/assistant/foundation/model/EventContextConfigurationSource;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ServerBoundMessageSource {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static ContextProperty context(@NotNull ServerBoundMessageSource serverBoundMessageSource, @NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return serverBoundMessageSource.getContext();
        }
    }

    @Nullable
    ContextProperty context(@NotNull String eventNamespace, @NotNull String eventName);

    @NotNull
    Set<ContextProperty> getAdditionalContext();

    @NotNull
    Capability getCapability();

    @Nullable
    SharedFlow<CapabilityEventRequest> getCapabilityEventRequestFlow();

    @Nullable
    ContextProperty getContext();

    @Nullable
    EventContextConfigurationSource getEventContextConfigurationSource();
}
