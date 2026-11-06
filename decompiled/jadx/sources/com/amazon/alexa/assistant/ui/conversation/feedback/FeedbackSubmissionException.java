package com.amazon.alexa.assistant.ui.conversation.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/feedback/FeedbackSubmissionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "responseCode", "", "message", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getResponseCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FeedbackSubmissionException extends Exception {
    public static final int $stable = 0;

    @Nullable
    private final Integer responseCode;

    public /* synthetic */ FeedbackSubmissionException(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, str);
    }

    @Nullable
    public final Integer getResponseCode() {
        return this.responseCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSubmissionException(@Nullable Integer num, @NotNull String str) {
        super(str);
        str.getClass();
        this.responseCode = num;
    }
}
