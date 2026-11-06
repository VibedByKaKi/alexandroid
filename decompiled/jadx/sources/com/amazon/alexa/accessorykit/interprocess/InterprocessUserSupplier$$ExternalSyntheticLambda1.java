package com.amazon.alexa.accessorykit.interprocess;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.amazon.alexa.accessory.protocol.StateOuterClass;
import com.amazon.alexa.accessorykit.interprocess.DefaultMessageNotificationStateMonitor;
import com.amazon.alexa.accessorykit.interprocess.InterprocessUserSupplier;
import com.amazon.alexa.accessorykit.interprocess.LocationSensorAccessEmitter;
import io.reactivex.rxjava3.functions.BiFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class InterprocessUserSupplier$$ExternalSyntheticLambda1 implements DefaultMessageNotificationStateMonitor.MessageNotificationStatusReceiver.Callback, InterprocessUserSupplier.InterprocessAccountChangedListener.AccountChangedCallback, LocationSensorAccessEmitter.LocationCallback, BiFunction {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ InterprocessUserSupplier$$ExternalSyntheticLambda1(Object obj) {
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        StateOuterClass.State lambda$queryState$1;
        lambda$queryState$1 = ((InterprocessPhoneStatePlugin) this.f$0).lambda$queryState$1((StateOuterClass.State) obj, (StateOuterClass.State) obj2);
        return lambda$queryState$1;
    }

    @Override // com.amazon.alexa.accessorykit.interprocess.InterprocessUserSupplier.InterprocessAccountChangedListener.AccountChangedCallback
    public void onAccountChanged(BroadcastReceiver.PendingResult pendingResult) {
        ((InterprocessUserSupplier) this.f$0).userChanged(pendingResult);
    }

    @Override // com.amazon.alexa.accessorykit.interprocess.LocationSensorAccessEmitter.LocationCallback
    public void onLocationIntentReady(Intent intent) {
        ((LocationSensorAccessEmitter) this.f$0).lambda$emitCurrentLocation$0(intent);
    }

    @Override // com.amazon.alexa.accessorykit.interprocess.DefaultMessageNotificationStateMonitor.MessageNotificationStatusReceiver.Callback
    public void onMessageStateReceived(boolean z) {
        ((DefaultMessageNotificationStateMonitor) this.f$0).newMessageState(z);
    }
}
