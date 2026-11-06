package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.playing;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\tH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/ConversationAudioPlaying;", "", "delegate", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/ConversationAudioPlayingDelegate;", "getDelegate", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/ConversationAudioPlayingDelegate;", "setDelegate", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/ConversationAudioPlayingDelegate;)V", "play", "", "text", "", "stop", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationAudioPlaying {
    @Nullable
    ConversationAudioPlayingDelegate getDelegate();

    void play(@NotNull String text);

    void setDelegate(@Nullable ConversationAudioPlayingDelegate conversationAudioPlayingDelegate);

    void stop();
}
