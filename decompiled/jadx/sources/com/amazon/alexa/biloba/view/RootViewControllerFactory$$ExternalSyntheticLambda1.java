package com.amazon.alexa.biloba.view;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class RootViewControllerFactory$$ExternalSyntheticLambda1 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RootViewControllerFactory f$0;

    public /* synthetic */ RootViewControllerFactory$$ExternalSyntheticLambda1(RootViewControllerFactory rootViewControllerFactory, int i) {
        this.$r8$classId = i;
        this.f$0 = rootViewControllerFactory;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        RootViewControllerFactory rootViewControllerFactory = this.f$0;
        switch (i) {
            case 0:
                rootViewControllerFactory.lambda$subscribeToSignout$3(message);
                break;
            default:
                rootViewControllerFactory.lambda$resetTTCFWhenAppBackgrounds$1(message);
                break;
        }
    }
}
