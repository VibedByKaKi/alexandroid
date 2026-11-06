package com.amazon.alexa.mobile.assistant.client.ui.featuregating;

import com.amazon.alexa.assistant.foundation.featuregating.FeatureFlag;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/DisabledFeatureFlag;", "Lcom/amazon/alexa/assistant/foundation/featuregating/FeatureFlag;", "<init>", "()V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "enabled", "getEnabled", "()Z", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
final class DisabledFeatureFlag implements FeatureFlag {

    @NotNull
    private final MutableStateFlow<Boolean> state = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    @Override // com.amazon.alexa.assistant.foundation.featuregating.FeatureFlag
    public boolean getEnabled() {
        return this.state.getValue().booleanValue();
    }

    @Override // com.amazon.alexa.assistant.foundation.featuregating.FeatureFlag
    @NotNull
    public StateFlow<Boolean> isEnabled() {
        return this.state;
    }
}
