package com.amazon.alexa.accessorykit.findmy;

import android.location.Location;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class FindMyAccessoryManager$$ExternalSyntheticLambda11 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FindMyAccessoryManager f$0;
    public final /* synthetic */ FindMyAccessoryInformation f$1;

    public /* synthetic */ FindMyAccessoryManager$$ExternalSyntheticLambda11(FindMyAccessoryManager findMyAccessoryManager, FindMyAccessoryInformation findMyAccessoryInformation, int i) {
        this.$r8$classId = i;
        this.f$0 = findMyAccessoryManager;
        this.f$1 = findMyAccessoryInformation;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$queryDeviceForUssSettingAndReportLocation$7(this.f$1, (DeviceGroup) obj);
                break;
            case 1:
                this.f$0.lambda$fetchAndReportLocationInformation$0(this.f$1, (Location) obj);
                break;
            default:
                this.f$0.lambda$fetchAndReportLocationInformation$2(this.f$1, (Location) obj);
                break;
        }
    }
}
