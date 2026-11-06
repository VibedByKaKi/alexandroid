package com.amazon.alexa.app.notification.nc;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class NotificationCenterService$$ExternalSyntheticLambda1 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NotificationCenterService f$0;

    public /* synthetic */ NotificationCenterService$$ExternalSyntheticLambda1(NotificationCenterService notificationCenterService, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterService;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    public final void handle(Message message) {
        int i = this.$r8$classId;
        NotificationCenterService notificationCenterService = this.f$0;
        switch (i) {
            case 0:
                notificationCenterService.lambda$setupDirectiveProcessor$1(message);
                break;
            default:
                notificationCenterService.lambda$setupHomePullToRefreshSubscription$0(message);
                break;
        }
    }
}
