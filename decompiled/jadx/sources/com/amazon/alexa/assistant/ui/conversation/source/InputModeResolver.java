package com.amazon.alexa.assistant.ui.conversation.source;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.foundation.attentionsystem.model.AttentionState;
import com.amazon.alexa.assistant.foundation.textstate.model.TextState;
import com.amazon.alexa.presence.utils.MetricsUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/source/InputModeResolver;", "", "<init>", "()V", MetricsUtil.MetricsId.RESOLVE, "Lcom/amazon/alexa/assistant/ui/conversation/source/InputMode;", "attentionState", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState;", "textState", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextState;", "isVoiceActive", "", "isTextActive", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InputModeResolver {
    public static final int $stable = 0;

    @NotNull
    public static final InputModeResolver INSTANCE = new InputModeResolver();

    private InputModeResolver() {
    }

    public final boolean isTextActive(@NotNull AttentionState attentionState, @NotNull TextState textState) {
        attentionState.getClass();
        textState.getClass();
        return (attentionState instanceof AttentionState.Idle) && (textState instanceof TextState.Processing);
    }

    public final boolean isVoiceActive(@NotNull AttentionState attentionState) {
        attentionState.getClass();
        return !(attentionState instanceof AttentionState.Idle);
    }

    @NotNull
    public final InputMode resolve(@NotNull AttentionState attentionState, @NotNull TextState textState) {
        attentionState.getClass();
        textState.getClass();
        return !(attentionState instanceof AttentionState.Idle) ? InputMode.VOICE : textState instanceof TextState.Processing ? InputMode.TEXT : InputMode.IDLE;
    }
}
