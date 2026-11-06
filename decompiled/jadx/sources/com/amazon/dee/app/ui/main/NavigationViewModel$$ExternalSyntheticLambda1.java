package com.amazon.dee.app.ui.main;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NavigationViewModel$$ExternalSyntheticLambda1 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NavigationViewModel f$0;

    public /* synthetic */ NavigationViewModel$$ExternalSyntheticLambda1(NavigationViewModel navigationViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = navigationViewModel;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        NavigationViewModel navigationViewModel = this.f$0;
        switch (i) {
            case 0:
                navigationViewModel.lambda$subscribeToAlexaPlusUpsellUpdates$6(message);
                break;
            case 1:
                navigationViewModel.lambda$subscribeToNotifications$1(message);
                break;
            case 2:
                navigationViewModel.lambda$subscribeToNotifications$2(message);
                break;
            default:
                navigationViewModel.lambda$updateUserProfileIcon$3(message);
                break;
        }
    }
}
