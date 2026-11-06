package com.amazon.alexa.mobile.assistant.client;

import com.amazon.alexa.assistant.media.model.MediaPlaybackState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DefaultAlexaAssistantClient$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAlexaAssistantClient f$0;

    public /* synthetic */ DefaultAlexaAssistantClient$$ExternalSyntheticLambda6(DefaultAlexaAssistantClient defaultAlexaAssistantClient, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultAlexaAssistantClient;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit conversationsApiImplLazy$lambda$35$lambda$34$lambda$32;
        Unit audioPlaybackControlApiImpl$lambda$1$lambda$0;
        int i = this.$r8$classId;
        DefaultAlexaAssistantClient defaultAlexaAssistantClient = this.f$0;
        switch (i) {
            case 0:
                conversationsApiImplLazy$lambda$35$lambda$34$lambda$32 = DefaultAlexaAssistantClient.conversationsApiImplLazy$lambda$35$lambda$34$lambda$32(defaultAlexaAssistantClient, (String) obj);
                return conversationsApiImplLazy$lambda$35$lambda$34$lambda$32;
            default:
                audioPlaybackControlApiImpl$lambda$1$lambda$0 = DefaultAlexaAssistantClient.audioPlaybackControlApiImpl$lambda$1$lambda$0(defaultAlexaAssistantClient, (MediaPlaybackState) obj);
                return audioPlaybackControlApiImpl$lambda$1$lambda$0;
        }
    }
}
