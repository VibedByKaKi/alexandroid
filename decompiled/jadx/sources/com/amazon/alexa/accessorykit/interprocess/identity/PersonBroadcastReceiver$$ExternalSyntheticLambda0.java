package com.amazon.alexa.accessorykit.interprocess.identity;

import android.content.BroadcastReceiver;
import com.amazon.alexa.accessorykit.interprocess.mobilytics.AccessoryMobilyticsDevice;
import com.amazon.alexa.accessorykit.interprocess.mobilytics.MobilyticsDeviceBroadcastReceiver;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class PersonBroadcastReceiver$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BroadcastReceiver.PendingResult f$0;

    public /* synthetic */ PersonBroadcastReceiver$$ExternalSyntheticLambda0(BroadcastReceiver.PendingResult pendingResult, int i) {
        this.$r8$classId = i;
        this.f$0 = pendingResult;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        BroadcastReceiver.PendingResult pendingResult = this.f$0;
        switch (i) {
            case 0:
                PersonBroadcastReceiver.lambda$persistPerson$0(pendingResult, (Person) obj);
                break;
            case 1:
                pendingResult.finish();
                break;
            default:
                MobilyticsDeviceBroadcastReceiver.lambda$persistDevice$0(pendingResult, (AccessoryMobilyticsDevice) obj);
                break;
        }
    }
}
