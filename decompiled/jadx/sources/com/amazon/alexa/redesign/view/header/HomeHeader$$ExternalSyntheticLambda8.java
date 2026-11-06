package com.amazon.alexa.redesign.view.header;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeHeader$$ExternalSyntheticLambda8 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeHeader f$0;

    public /* synthetic */ HomeHeader$$ExternalSyntheticLambda8(HomeHeader homeHeader, int i) {
        this.$r8$classId = i;
        this.f$0 = homeHeader;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        HomeHeader homeHeader = this.f$0;
        switch (i) {
            case 0:
                homeHeader.lambda$subscribeToHomeTourCoachMarkEvents$13(message);
                break;
            case 1:
                homeHeader.lambda$startHomeModesSubscriptions$21(message);
                break;
            case 2:
                homeHeader.lambda$startHomeModesSubscriptions$22(message);
                break;
            case 3:
                homeHeader.showAppUpgrade(message);
                break;
            default:
                homeHeader.lambda$initNotificationCenter$8(message);
                break;
        }
    }
}
