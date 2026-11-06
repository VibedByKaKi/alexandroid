package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/ConversationAudioCapturing;", "", "delegate", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/ConversationAudioCapturingDelegate;", "getDelegate", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/ConversationAudioCapturingDelegate;", "setDelegate", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/ConversationAudioCapturingDelegate;)V", "beginCapture", "", "flushAndStream", "endCapture", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationAudioCapturing {
    void beginCapture();

    void endCapture();

    void flushAndStream();

    @Nullable
    ConversationAudioCapturingDelegate getDelegate();

    void setDelegate(@Nullable ConversationAudioCapturingDelegate conversationAudioCapturingDelegate);
}
