package com.amazon.alexa.accessorykit.interprocess;

import android.content.BroadcastReceiver;
import com.amazon.alexa.accessory.internal.util.ObservableUtils;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class PhoneStateBroadcastReceiver$$ExternalSyntheticLambda1 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PhoneStateBroadcastReceiver$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((BroadcastReceiver.PendingResult) obj).finish();
                break;
            case 1:
                InterprocessPrivacyModeEmitter.lambda$observeActiveCall$7((AtomicReference) obj);
                break;
            default:
                ObservableUtils.release((Subject) obj);
                break;
        }
    }
}
