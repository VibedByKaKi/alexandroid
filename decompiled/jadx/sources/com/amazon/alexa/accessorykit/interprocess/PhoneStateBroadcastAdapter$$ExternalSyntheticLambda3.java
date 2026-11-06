package com.amazon.alexa.accessorykit.interprocess;

import android.util.Pair;
import com.amazon.alexa.accessory.internal.util.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class PhoneStateBroadcastAdapter$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PhoneStateBroadcastAdapter$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                PhoneStateBroadcastAdapter.lambda$emitStates$2((Throwable) obj);
                break;
            case 1:
                Logger.e("Error executing onChange", (Throwable) obj);
                break;
            case 2:
                InterprocessLocationSensorAccessProvider.lambda$fetchLocation$0((Throwable) obj);
                break;
            case 3:
                InterprocessPrivacyModeEmitter.lambda$sessionIsConnected$3((Pair) obj);
                break;
            default:
                InterprocessPrivacyModeEmitter.lambda$sessionIsConnected$4((Throwable) obj);
                break;
        }
    }
}
