package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/Conversation;", "", OperationalEventType.SESSION, "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationSession;", "getSession", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationSession;", "speak", "", "text", "", "thenCapture", "", "resume", "work", "Lkotlin/Function0;", "finish", "end", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Conversation {
    void finish(@NotNull ConversationEnd end);

    @NotNull
    ConversationSession getSession();

    void resume(@NotNull Function0<Unit> work);

    void speak(@NotNull String text, boolean thenCapture);
}
