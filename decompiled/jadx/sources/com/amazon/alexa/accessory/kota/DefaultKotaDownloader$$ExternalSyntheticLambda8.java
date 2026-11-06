package com.amazon.alexa.accessory.kota;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.kota.FirmwareSupplier;
import com.amazon.alexa.accessory.notificationpublisher.AccessoryNotifier;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultKotaDownloader$$ExternalSyntheticLambda8 implements Action {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DefaultKotaDownloader$$ExternalSyntheticLambda8(Accessory accessory, boolean z) {
        this.f$1 = accessory;
        this.f$0 = z;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DefaultKotaDownloader.lambda$downloadPackage$3(this.f$0, (FirmwareSupplier.StreamablePackage) this.f$1);
                break;
            default:
                AccessoryNotifier.lambda$onMessageNotification$0((Accessory) this.f$1, this.f$0);
                break;
        }
    }

    public /* synthetic */ DefaultKotaDownloader$$ExternalSyntheticLambda8(boolean z, FirmwareSupplier.StreamablePackage streamablePackage) {
        this.f$0 = z;
        this.f$1 = streamablePackage;
    }
}
