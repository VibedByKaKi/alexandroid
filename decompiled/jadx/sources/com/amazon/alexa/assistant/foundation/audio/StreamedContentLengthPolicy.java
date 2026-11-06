package com.amazon.alexa.assistant.foundation.audio;

import com.amazon.alexa.apl.AplInteractor$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/StreamedContentLengthPolicy;", "", "advertisedLength", "", "captionCharacterCount", "", "(Ljava/lang/Integer;)J", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface StreamedContentLengthPolicy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/StreamedContentLengthPolicy$Companion;", "", "<init>", "()V", "SHORT_CAPTION_CHARACTERS", "", "SHORT_RESPONSE_BYTES", "", "LONG_RESPONSE_BYTES", "CaptionLengthHeuristic", "Lcom/amazon/alexa/assistant/foundation/audio/StreamedContentLengthPolicy;", "getCaptionLengthHeuristic", "()Lcom/amazon/alexa/assistant/foundation/audio/StreamedContentLengthPolicy;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final StreamedContentLengthPolicy CaptionLengthHeuristic = new AplInteractor$$ExternalSyntheticLambda0(13);
        private static final long LONG_RESPONSE_BYTES = 14000000;
        private static final int SHORT_CAPTION_CHARACTERS = 500;
        private static final long SHORT_RESPONSE_BYTES = 500000;

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long CaptionLengthHeuristic$lambda$0(Integer num) {
            return (num == null || num.intValue() > 500) ? LONG_RESPONSE_BYTES : SHORT_RESPONSE_BYTES;
        }

        @NotNull
        public final StreamedContentLengthPolicy getCaptionLengthHeuristic() {
            return CaptionLengthHeuristic;
        }
    }

    long advertisedLength(@Nullable Integer captionCharacterCount);
}
