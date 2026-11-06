package com.amazon.alexa.accessorykit.interprocess;

import com.amazon.alexa.accessorykit.interprocess.DefaultMessageNotificationStateMonitor;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DefaultMessageNotificationStateMonitor$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultMessageNotificationStateMonitor$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean executeActive;
        Boolean checkMessages;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                executeActive = ((DefaultMessageNotificationStateMonitor) obj).executeActive();
                return Boolean.valueOf(executeActive);
            default:
                checkMessages = ((DefaultMessageNotificationStateMonitor.MessageNotificationStatusReceiver.MessageObserver) obj).checkMessages();
                return checkMessages;
        }
    }
}
