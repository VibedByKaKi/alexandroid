package com.amazon.alexa.accessorykit.cloudpairing.keyrotation;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DefaultDpsClient$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultDpsClient f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ DefaultDpsClient$$ExternalSyntheticLambda2(DefaultDpsClient defaultDpsClient, long j, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultDpsClient;
        this.f$1 = j;
        this.f$2 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getPairingEnablementStatus$7(this.f$1, this.f$2, (Throwable) obj);
                break;
            case 1:
                this.f$0.lambda$acknowledgePairingData$11(this.f$1, this.f$2, (Throwable) obj);
                break;
            default:
                this.f$0.lambda$listPairedDevices$3(this.f$1, this.f$2, (Throwable) obj);
                break;
        }
    }
}
