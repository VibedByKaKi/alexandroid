package com.amazon.alexa.accessory.kota;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultKotaDownloader$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UpdateRequest f$0;

    public /* synthetic */ DefaultKotaDownloader$$ExternalSyntheticLambda4(UpdateRequest updateRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = updateRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        UpdateRequest updateRequest = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                DefaultKotaDownloader.lambda$getInventoryUpdateCloud$16(updateRequest, th);
                break;
            default:
                DefaultKotaDownloader.lambda$downloadPackage$5(updateRequest, th);
                break;
        }
    }
}
