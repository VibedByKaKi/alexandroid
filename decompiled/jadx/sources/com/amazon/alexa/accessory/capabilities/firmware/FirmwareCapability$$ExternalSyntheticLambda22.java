package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.protocol.Firmware;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda22 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirmwareCapability f$0;
    public final /* synthetic */ Set f$1;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda22(FirmwareCapability firmwareCapability, Set set, int i) {
        this.$r8$classId = i;
        this.f$0 = firmwareCapability;
        this.f$1 = set;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$getFirmwareUpdatePreferenceSingle$14;
        SingleSource lambda$getFirmwareUpdatePreferenceSingle$16;
        switch (this.$r8$classId) {
            case 0:
                lambda$getFirmwareUpdatePreferenceSingle$14 = this.f$0.lambda$getFirmwareUpdatePreferenceSingle$14(this.f$1, (Firmware.FirmwareInformation) obj);
                return lambda$getFirmwareUpdatePreferenceSingle$14;
            default:
                lambda$getFirmwareUpdatePreferenceSingle$16 = this.f$0.lambda$getFirmwareUpdatePreferenceSingle$16(this.f$1, (Set) obj);
                return lambda$getFirmwareUpdatePreferenceSingle$16;
        }
    }
}
