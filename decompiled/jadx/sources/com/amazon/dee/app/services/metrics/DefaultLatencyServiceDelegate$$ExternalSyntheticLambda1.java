package com.amazon.dee.app.services.metrics;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.dee.app.services.metrics.DefaultLatencyServiceDelegate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class DefaultLatencyServiceDelegate$$ExternalSyntheticLambda1 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultLatencyServiceDelegate f$0;

    public /* synthetic */ DefaultLatencyServiceDelegate$$ExternalSyntheticLambda1(DefaultLatencyServiceDelegate defaultLatencyServiceDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultLatencyServiceDelegate;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        DefaultLatencyServiceDelegate defaultLatencyServiceDelegate = this.f$0;
        switch (i) {
            case 0:
                DefaultLatencyServiceDelegate.startListening$lambda$11(defaultLatencyServiceDelegate, message);
                break;
            case 1:
                DefaultLatencyServiceDelegate.startListening$lambda$12(defaultLatencyServiceDelegate, message);
                break;
            default:
                DefaultLatencyServiceDelegate.FirstRenderObserver.onActivityStart$lambda$0(defaultLatencyServiceDelegate, message);
                break;
        }
    }
}
