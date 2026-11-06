package com.amazon.alexa.biloba.view.dashboard;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class RemoteManagementInactivityHandler$$ExternalSyntheticLambda0 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RemoteManagementInactivityHandler f$0;

    public /* synthetic */ RemoteManagementInactivityHandler$$ExternalSyntheticLambda0(RemoteManagementInactivityHandler remoteManagementInactivityHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = remoteManagementInactivityHandler;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        RemoteManagementInactivityHandler remoteManagementInactivityHandler = this.f$0;
        switch (i) {
            case 0:
                remoteManagementInactivityHandler.lambda$getRouteChangeSubscriberHandler$1(message);
                break;
            case 1:
                remoteManagementInactivityHandler.lambda$getTerminationSubscriberHandler$2(message);
                break;
            default:
                remoteManagementInactivityHandler.lambda$getSignOutSubscriberHandler$3(message);
                break;
        }
    }
}
