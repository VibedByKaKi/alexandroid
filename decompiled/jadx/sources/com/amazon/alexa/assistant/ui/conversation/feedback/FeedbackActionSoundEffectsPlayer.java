package com.amazon.alexa.assistant.ui.conversation.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.ra.core.features.feedback.FeedbackActionSoundEffectsPlayerApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/feedback/FeedbackActionSoundEffectsPlayer;", "Lcom/amazon/alexa/ra/core/features/feedback/FeedbackActionSoundEffectsPlayerApi;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "playDislikeFeedbackSound", "", "playLikeFeedbackSound", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FeedbackActionSoundEffectsPlayer implements FeedbackActionSoundEffectsPlayerApi {

    @NotNull
    private static final String TAG = "FeedbackActionSoundEffectsPlayer";

    @NotNull
    private final Logger logger;
    public static final int $stable = 8;

    public FeedbackActionSoundEffectsPlayer(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    @Override // com.amazon.alexa.ra.core.features.feedback.FeedbackActionSoundEffectsPlayerApi
    public void playDislikeFeedbackSound() {
        Logger.DefaultImpls.debug$default(this.logger, TAG, "playDislikeFeedbackSound called", null, 4, null);
    }

    @Override // com.amazon.alexa.ra.core.features.feedback.FeedbackActionSoundEffectsPlayerApi
    public void playLikeFeedbackSound() {
        Logger.DefaultImpls.debug$default(this.logger, TAG, "playLikeFeedbackSound called", null, 4, null);
    }
}
