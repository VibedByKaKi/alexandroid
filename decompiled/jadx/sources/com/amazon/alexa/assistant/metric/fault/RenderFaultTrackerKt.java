package com.amazon.alexa.assistant.metric.fault;

import com.amazon.alexa.assistant.foundation.metric.model.RenderSignal;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u001e\u0010\f\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u001e\u0010\r\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"RENDER_FAILURES_INTERRUPTED_BY_BACKGROUND", "", "Lcom/amazon/alexa/assistant/metric/fault/RenderFailureCategory;", "CONVERSATION_NAMESPACE", "", "ADD_FRAGMENTS_NAME", "hasRequiredSignals", "", "signals", "Lcom/amazon/alexa/assistant/foundation/metric/model/RenderSignal;", "deeplinkLaunched", "answerRenderStartedNotRendered", "hasAnswerRendered", "isAnimationCompleteTerminal", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RenderFaultTrackerKt {

    @NotNull
    private static final String ADD_FRAGMENTS_NAME = "AddFragments";

    @NotNull
    private static final String CONVERSATION_NAMESPACE = "Alexa.Conversation";

    @NotNull
    private static final Set<RenderFailureCategory> RENDER_FAILURES_INTERRUPTED_BY_BACKGROUND = SetsKt.setOf((Object[]) new RenderFailureCategory[]{RenderFailureCategory.UI_RENDERING_FAILURE, RenderFailureCategory.UI_RENDERING_FAILURE_FRAGMENT_PARSED, RenderFailureCategory.UI_RENDERING_FAILURE_FRAGMENT_NOT_PARSED});

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean answerRenderStartedNotRendered(Set<? extends RenderSignal> set, boolean z) {
        return (set.contains(RenderSignal.REMOTE_VISUAL_RESPONSE_RENDER_STARTED) || set.contains(RenderSignal.REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION)) && !(hasAnswerRendered(set, z) || set.contains(RenderSignal.REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasAnswerRendered(Set<? extends RenderSignal> set, boolean z) {
        return set.contains(RenderSignal.REMOTE_VISUAL_RESPONSE_RENDERED) || isAnimationCompleteTerminal(set, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasRequiredSignals(Set<? extends RenderSignal> set, boolean z) {
        return hasAnswerRendered(set, z) || set.contains(RenderSignal.REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAnimationCompleteTerminal(Set<? extends RenderSignal> set, boolean z) {
        if (set.contains(RenderSignal.ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_ANIMATION_COMPLETE) && !z) {
            return !set.contains(RenderSignal.REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING) || set.contains(RenderSignal.REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE);
        }
        return false;
    }
}
