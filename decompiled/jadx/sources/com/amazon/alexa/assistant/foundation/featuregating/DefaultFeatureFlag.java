package com.amazon.alexa.assistant.foundation.featuregating;

import com.amazon.alexa.assistant.foundation.featuregating.FeatureFlag;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/featuregating/DefaultFeatureFlag;", "Lcom/amazon/alexa/assistant/foundation/featuregating/FeatureFlag;", "flow", "Lkotlinx/coroutines/flow/StateFlow;", "", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;)V", "isEnabled", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultFeatureFlag implements FeatureFlag {

    @NotNull
    private final StateFlow<Boolean> flow;

    public DefaultFeatureFlag(@NotNull StateFlow<Boolean> stateFlow) {
        stateFlow.getClass();
        this.flow = stateFlow;
    }

    @Override // com.amazon.alexa.assistant.foundation.featuregating.FeatureFlag
    public boolean getEnabled() {
        return FeatureFlag.DefaultImpls.getEnabled(this);
    }

    @Override // com.amazon.alexa.assistant.foundation.featuregating.FeatureFlag
    @NotNull
    public StateFlow<Boolean> isEnabled() {
        return this.flow;
    }
}
