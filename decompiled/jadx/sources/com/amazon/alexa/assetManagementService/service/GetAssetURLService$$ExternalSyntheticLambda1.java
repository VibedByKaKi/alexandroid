package com.amazon.alexa.assetManagementService.service;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class GetAssetURLService$$ExternalSyntheticLambda1 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GetAssetURLService f$0;

    public /* synthetic */ GetAssetURLService$$ExternalSyntheticLambda1(GetAssetURLService getAssetURLService, int i) {
        this.$r8$classId = i;
        this.f$0 = getAssetURLService;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    public final void handle(Message message) {
        int i = this.$r8$classId;
        GetAssetURLService getAssetURLService = this.f$0;
        switch (i) {
            case 0:
                getAssetURLService.lambda$subscribeToElements$3(message);
                break;
            default:
                getAssetURLService.lambda$subscribeToSignOut$1(message);
                break;
        }
    }
}
