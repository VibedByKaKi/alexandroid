package com.amazon.alexa.audiopersonalization.listeners;

import com.amazon.alexa.audiopersonalization.api.OnStart;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AppStateListener$$ExternalSyntheticLambda0 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AppStateListener$$ExternalSyntheticLambda0(Object obj, int i) {
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
                ((OnStart) obj).onStart();
                break;
            case 1:
                ((AccessoriesListener) obj).sendBudsInEarEvent(message);
                break;
            default:
                ((AppStateListener) obj).sendMpeSupport(message);
                break;
        }
    }
}
