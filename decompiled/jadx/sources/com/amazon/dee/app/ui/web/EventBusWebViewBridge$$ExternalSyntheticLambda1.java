package com.amazon.dee.app.ui.web;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.dee.app.ui.web.OOBEBridge;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class EventBusWebViewBridge$$ExternalSyntheticLambda1 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ EventBusWebViewBridge$$ExternalSyntheticLambda1(Object obj, int i) {
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
                ((EventBusWebViewBridge) obj).onTCommMessage(message);
                break;
            case 1:
                ((OOBEBridge.StartVoiceEnrollment) obj).enrollmentComplete(message);
                break;
            default:
                ((EnvironmentWebNavigator) obj).lambda$initialize$0(message);
                break;
        }
    }
}
