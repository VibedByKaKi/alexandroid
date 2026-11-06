package com.amazon.alexa.assistant.conversation;

import com.amazon.alexa.assistant.conversation.model.CardTranscript;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.coroutines.Continuation;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/CardTranscriptService;", "", "cardTranscript", "Lcom/amazon/alexa/assistant/conversation/model/CardTranscript;", "itemId", "", "before", "after", "paginationMaxResults", "Lkotlin/UInt;", "cardTranscript-iC4mN9g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/UInt;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CardTranscriptService {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* renamed from: cardTranscript-iC4mN9g$default, reason: not valid java name */
        public static /* synthetic */ Object m15011cardTranscriptiC4mN9g$default(CardTranscriptService cardTranscriptService, String str, String str2, String str3, UInt uInt, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: cardTranscript-iC4mN9g");
                return null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                uInt = null;
            }
            return cardTranscriptService.mo15010cardTranscriptiC4mN9g(str, str2, str3, uInt, continuation);
        }
    }

    @Nullable
    /* renamed from: cardTranscript-iC4mN9g, reason: not valid java name */
    Object mo15010cardTranscriptiC4mN9g(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable UInt uInt, @NotNull Continuation<? super CardTranscript> continuation);
}
