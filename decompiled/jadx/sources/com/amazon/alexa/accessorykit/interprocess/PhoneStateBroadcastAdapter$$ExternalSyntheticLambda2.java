package com.amazon.alexa.accessorykit.interprocess;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.alexa.accessorykit.interprocess.DefaultMessageNotificationStateMonitor;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class PhoneStateBroadcastAdapter$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PhoneStateBroadcastAdapter$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Context) obj2).sendBroadcast((Intent) obj);
                break;
            case 1:
                ((DefaultMessageNotificationStateMonitor.MessageNotificationStatusReceiver.MessageObserver) obj2).lambda$onChange$0((Boolean) obj);
                break;
            default:
                PhoneStateBroadcastReceiver.lambda$onReceive$1((BroadcastReceiver.PendingResult) obj2, (Throwable) obj);
                break;
        }
    }
}
