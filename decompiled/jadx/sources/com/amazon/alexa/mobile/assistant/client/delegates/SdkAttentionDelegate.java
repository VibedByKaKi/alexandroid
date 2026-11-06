package com.amazon.alexa.mobile.assistant.client.delegates;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.foundation.attentionsystem.AttentionSystemDelegate;
import com.amazon.alexa.assistant.foundation.attentionsystem.model.AttentionState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/delegates/SdkAttentionDelegate;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/AttentionSystemDelegate;", "attentionStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState;", "volumeLevelFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "attentionStateDidChange", "", "attentionState", "inputSoundLevelDidChange", "inputSoundLevel", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SdkAttentionDelegate implements AttentionSystemDelegate {
    public static final int $stable = 8;

    @NotNull
    private final MutableStateFlow<AttentionState> attentionStateFlow;

    @NotNull
    private final MutableSharedFlow<Double> volumeLevelFlow;

    public SdkAttentionDelegate(@NotNull MutableStateFlow<AttentionState> mutableStateFlow, @NotNull MutableSharedFlow<Double> mutableSharedFlow) {
        mutableStateFlow.getClass();
        mutableSharedFlow.getClass();
        this.attentionStateFlow = mutableStateFlow;
        this.volumeLevelFlow = mutableSharedFlow;
    }

    @Override // com.amazon.alexa.assistant.foundation.attentionsystem.AttentionSystemDelegate
    public void attentionStateDidChange(@NotNull AttentionState attentionState) {
        attentionState.getClass();
        this.attentionStateFlow.setValue(attentionState);
    }

    @Override // com.amazon.alexa.assistant.foundation.attentionsystem.AttentionSystemDelegate
    public void inputSoundLevelDidChange(double inputSoundLevel) {
        this.volumeLevelFlow.tryEmit(Double.valueOf(inputSoundLevel));
    }
}
