package com.amazon.alexa.eventbus.core;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.Subscriber;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class LocalDispatcher$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ LocalDispatcher$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LocalDispatcher) this.f$0).lambda$dispatch$1((Message) this.f$1);
                break;
            case 1:
                LocalDispatcher.lambda$stop$2((ExecutorService) this.f$0, (ExecutorService) this.f$1);
                break;
            default:
                ((Subscriber) this.f$0).onMessageReceived((Message) this.f$1);
                break;
        }
    }
}
