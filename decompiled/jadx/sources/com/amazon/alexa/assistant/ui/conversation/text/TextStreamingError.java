package com.amazon.alexa.assistant.ui.conversation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/text/TextStreamingError;", "", "<init>", "()V", "StreamingNotActive", "Lcom/amazon/alexa/assistant/ui/conversation/text/TextStreamingError$StreamingNotActive;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TextStreamingError extends Throwable {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/text/TextStreamingError$StreamingNotActive;", "Lcom/amazon/alexa/assistant/ui/conversation/text/TextStreamingError;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StreamingNotActive extends TextStreamingError {
        public static final int $stable = 0;

        @NotNull
        public static final StreamingNotActive INSTANCE = new StreamingNotActive();

        private StreamingNotActive() {
            super(null);
        }
    }

    public /* synthetic */ TextStreamingError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TextStreamingError() {
    }
}
