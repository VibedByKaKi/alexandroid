package com.amazon.alexa.assistant.foundation.model;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH&J*\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001f\u0012\u0004\u0012\u00020\u00170\u001eH&J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/CapabilityAgent;", "", "capability", "Lcom/amazon/alexa/assistant/foundation/model/Capability;", "getCapability", "()Lcom/amazon/alexa/assistant/foundation/model/Capability;", "context", "Lcom/amazon/alexa/assistant/foundation/model/ContextProperty;", "getContext", "()Lcom/amazon/alexa/assistant/foundation/model/ContextProperty;", "eventNamespace", "", "eventName", "additionalContext", "", "getAdditionalContext", "()Ljava/util/Set;", "capabilityEventRequestFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/amazon/alexa/assistant/foundation/model/CapabilityEventRequest;", "getCapabilityEventRequestFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "start", "", "stop", "prepare", "directive", "Lcom/amazon/alexa/assistant/foundation/model/Directive;", "consume", "completion", "Lkotlin/Function1;", "Lkotlin/Result;", "cancel", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CapabilityAgent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static ContextProperty context(@NotNull CapabilityAgent capabilityAgent, @NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return capabilityAgent.getContext();
        }

        @NotNull
        public static Set<ContextProperty> getAdditionalContext(@NotNull CapabilityAgent capabilityAgent) {
            return SetsKt.emptySet();
        }
    }

    void cancel(@NotNull Directive directive);

    void consume(@NotNull Directive directive, @NotNull Function1<? super Result<Unit>, Unit> completion);

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

    void prepare(@NotNull Directive directive);

    void start();

    void stop();
}
