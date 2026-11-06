package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryExplorer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultCompanionDeviceModule$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DefaultCompanionDeviceModule$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((DefaultCompanionDeviceModule) this.f$0).lambda$requestCompanionDevice$0((String) this.f$1, (Disposable) obj);
                break;
            default:
                ((DefaultAccessoryExplorer.DeviceConnectivityObserver.AnonymousClass1) this.f$0).lambda$onSuccess$5((Accessory) this.f$1, (Boolean) obj);
                break;
        }
    }
}
