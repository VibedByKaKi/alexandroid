package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.playing;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/ConversationPlaybackException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "failureCause", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/PlaybackFailureCause;", "message", "", "<init>", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/PlaybackFailureCause;Ljava/lang/String;)V", "getFailureCause", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/PlaybackFailureCause;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConversationPlaybackException extends IllegalStateException {

    @NotNull
    private final PlaybackFailureCause failureCause;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationPlaybackException(@NotNull PlaybackFailureCause playbackFailureCause, @NotNull String str) {
        super(str);
        playbackFailureCause.getClass();
        str.getClass();
        this.failureCause = playbackFailureCause;
    }

    @NotNull
    public final PlaybackFailureCause getFailureCause() {
        return this.failureCause;
    }
}
