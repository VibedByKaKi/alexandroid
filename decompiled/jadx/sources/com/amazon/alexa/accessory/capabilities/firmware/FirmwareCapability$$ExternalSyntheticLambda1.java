package com.amazon.alexa.accessory.capabilities.firmware;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareCapability$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirmwareCapability f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ List f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ FirmwareCapability$$ExternalSyntheticLambda1(FirmwareCapability firmwareCapability, String str, List list, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = firmwareCapability;
        this.f$1 = str;
        this.f$2 = list;
        this.f$3 = str2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$getDesiredArtifactsList$34;
        ObservableSource lambda$getDesiredArtifactsList$33;
        switch (this.$r8$classId) {
            case 0:
                lambda$getDesiredArtifactsList$34 = this.f$0.lambda$getDesiredArtifactsList$34(this.f$1, this.f$2, this.f$3, (List) obj);
                return lambda$getDesiredArtifactsList$34;
            default:
                lambda$getDesiredArtifactsList$33 = this.f$0.lambda$getDesiredArtifactsList$33(this.f$1, this.f$2, this.f$3, (String) obj);
                return lambda$getDesiredArtifactsList$33;
        }
    }
}
