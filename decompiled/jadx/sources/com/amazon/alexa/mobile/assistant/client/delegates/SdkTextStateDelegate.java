package com.amazon.alexa.mobile.assistant.client.delegates;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.foundation.attentionsystem.model.AttentionState;
import com.amazon.alexa.assistant.foundation.textstate.TextStateDelegate;
import com.amazon.alexa.assistant.foundation.textstate.model.TextState;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Objects;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/delegates/SdkTextStateDelegate;", "Lcom/amazon/alexa/assistant/foundation/textstate/TextStateDelegate;", "attentionStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState;", "textStateFlow", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextState;", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "textStateDidChange", "", "textState", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SdkTextStateDelegate implements TextStateDelegate {

    @NotNull
    private static final String TAG = "SdkTextStateDelegate";

    @NotNull
    private final MutableStateFlow<AttentionState> attentionStateFlow;

    @NotNull
    private final MutableStateFlow<TextState> textStateFlow;
    public static final int $stable = 8;

    public SdkTextStateDelegate(@NotNull MutableStateFlow<AttentionState> mutableStateFlow, @NotNull MutableStateFlow<TextState> mutableStateFlow2) {
        mutableStateFlow.getClass();
        mutableStateFlow2.getClass();
        this.attentionStateFlow = mutableStateFlow;
        this.textStateFlow = mutableStateFlow2;
    }

    @Override // com.amazon.alexa.assistant.foundation.textstate.TextStateDelegate
    public void textStateDidChange(@NotNull TextState textState) {
        textState.getClass();
        Objects.toString(textState);
        this.textStateFlow.setValue(textState);
        if (textState instanceof TextState.Processing) {
            boolean z = this.attentionStateFlow.getValue() instanceof AttentionState.Idle;
            MutableStateFlow<AttentionState> mutableStateFlow = this.attentionStateFlow;
            if (z) {
                mutableStateFlow.setValue(AttentionState.Thinking.INSTANCE);
                return;
            } else {
                Objects.toString(mutableStateFlow.getValue());
                return;
            }
        }
        if (!(textState instanceof TextState.Idle)) {
            PathKt$$ExternalSyntheticBUOutline0.m();
            return;
        }
        boolean z2 = this.attentionStateFlow.getValue() instanceof AttentionState.Thinking;
        MutableStateFlow<AttentionState> mutableStateFlow2 = this.attentionStateFlow;
        if (z2) {
            mutableStateFlow2.setValue(AttentionState.Idle.INSTANCE);
        } else {
            Objects.toString(mutableStateFlow2.getValue());
        }
    }
}
