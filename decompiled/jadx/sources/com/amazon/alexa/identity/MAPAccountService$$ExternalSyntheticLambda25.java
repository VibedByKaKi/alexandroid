package com.amazon.alexa.identity;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import rx.Subscriber;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MAPAccountService$$ExternalSyntheticLambda25 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MAPAccountService$$ExternalSyntheticLambda25(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((MAPAccountService) obj).lambda$new$2(message);
                break;
            case 1:
                ((MAPAccountService) obj).lambda$new$1(message);
                break;
            default:
                MAPAccountService.lambda$handleBootstrapInvitationSignInChosenUserRefresh$26((Subscriber) obj, message);
                break;
        }
    }
}
