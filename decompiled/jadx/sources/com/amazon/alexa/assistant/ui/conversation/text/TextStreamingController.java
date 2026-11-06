package com.amazon.alexa.assistant.ui.conversation.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H&J.\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\f0\u0012H&J\b\u0010\u0014\u001a\u00020\fH&J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/text/TextStreamingController;", "", "isStreamActive", "", "()Z", "currentDialogRequestId", "", "getCurrentDialogRequestId", "()Ljava/lang/String;", "currentMessage", "getCurrentMessage", "handleTextChange", "", "text", "submit", "submitTimestampMillis", "", "completion", "Lkotlin/Function1;", "", "cancelActiveStream", "dialogRequestId", "reason", "Lcom/amazon/alexa/assistant/ui/conversation/text/TextStreamCloseReason;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TextStreamingController {
    void cancelActiveStream();

    void cancelActiveStream(@NotNull String dialogRequestId, @NotNull TextStreamCloseReason reason);

    @Nullable
    String getCurrentDialogRequestId();

    @Nullable
    String getCurrentMessage();

    void handleTextChange(@NotNull String text);

    boolean isStreamActive();

    boolean submit(@NotNull String text, long submitTimestampMillis, @NotNull Function1<? super Throwable, Unit> completion);
}
