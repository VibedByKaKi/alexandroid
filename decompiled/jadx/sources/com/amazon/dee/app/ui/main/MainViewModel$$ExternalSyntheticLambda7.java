package com.amazon.dee.app.ui.main;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MainViewModel$$ExternalSyntheticLambda7 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MainViewModel f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MainViewModel$$ExternalSyntheticLambda7(MainViewModel mainViewModel, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = mainViewModel;
        this.f$1 = obj;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$create$3((MainViewModel$$ExternalSyntheticLambda0) this.f$1, message);
                break;
            case 1:
                this.f$0.lambda$scheduleBottomBarCoachmark$19((MultiFilterSubscriber) this.f$1, message);
                break;
            default:
                this.f$0.lambda$scheduleNonCriticalTasks$12((MultiFilterSubscriber) this.f$1, message);
                break;
        }
    }
}
