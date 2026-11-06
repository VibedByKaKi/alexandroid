package com.amazon.dee.app.ui.main;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MainViewModel$$ExternalSyntheticLambda5 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MainViewModel f$0;

    public /* synthetic */ MainViewModel$$ExternalSyntheticLambda5(MainViewModel mainViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = mainViewModel;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        MainViewModel mainViewModel = this.f$0;
        switch (i) {
            case 0:
                mainViewModel.lambda$subscribeToEdgeToEdgeRoutes$16(message);
                break;
            default:
                mainViewModel.lambda$scheduleNonCriticalTasks$14(message);
                break;
        }
    }
}
