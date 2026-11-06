package com.amazon.dee.app.services.network.reachability;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class DefaultReachabilityService$$ExternalSyntheticLambda1 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultReachabilityService f$0;

    public /* synthetic */ DefaultReachabilityService$$ExternalSyntheticLambda1(DefaultReachabilityService defaultReachabilityService, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultReachabilityService;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        DefaultReachabilityService defaultReachabilityService = this.f$0;
        switch (i) {
            case 0:
                DefaultReachabilityService.observeSignOut$lambda$3(defaultReachabilityService, message);
                break;
            default:
                DefaultReachabilityService.observeAuthEvent$lambda$1(defaultReachabilityService, message);
                break;
        }
    }
}
