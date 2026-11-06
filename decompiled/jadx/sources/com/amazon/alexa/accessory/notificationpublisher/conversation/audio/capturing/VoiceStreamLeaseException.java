package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing;

import com.amazon.alexa.accessory.repositories.voicestreaming.VoiceStreamStartResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/VoiceStreamLeaseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "result", "Lcom/amazon/alexa/accessory/repositories/voicestreaming/VoiceStreamStartResult;", "<init>", "(Lcom/amazon/alexa/accessory/repositories/voicestreaming/VoiceStreamStartResult;)V", "getResult", "()Lcom/amazon/alexa/accessory/repositories/voicestreaming/VoiceStreamStartResult;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VoiceStreamLeaseException extends Exception {

    @NotNull
    private final VoiceStreamStartResult result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceStreamLeaseException(@NotNull VoiceStreamStartResult voiceStreamStartResult) {
        super("Voice stream lease request returned: " + voiceStreamStartResult);
        voiceStreamStartResult.getClass();
        this.result = voiceStreamStartResult;
    }

    @NotNull
    public final VoiceStreamStartResult getResult() {
        return this.result;
    }
}
