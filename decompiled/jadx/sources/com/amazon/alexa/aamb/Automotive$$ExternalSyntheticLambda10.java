package com.amazon.alexa.aamb;

import com.amazon.alexa.accessoryclient.common.api.AccessoryInquiryResult;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Automotive$$ExternalSyntheticLambda10 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Automotive f$0;

    public /* synthetic */ Automotive$$ExternalSyntheticLambda10(Automotive automotive, int i) {
        this.$r8$classId = i;
        this.f$0 = automotive;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Automotive automotive = this.f$0;
        switch (i) {
            case 0:
                automotive.lambda$observeOnAccessoryFound$15((AccessoryInquiryResult) obj);
                break;
            case 1:
                automotive.lambda$updateMobileDeviceInformation$10((Throwable) obj);
                break;
            case 2:
                automotive.lambda$observeNotifyMobileBridgeStatus$12((Throwable) obj);
                break;
            case 3:
                automotive.lambda$observeOnClient$19((Boolean) obj);
                break;
            case 4:
                automotive.lambda$observeCarFeature$14((Throwable) obj);
                break;
            case 5:
                automotive.lambda$onFeatureEnabled$20((Map) obj);
                break;
            default:
                automotive.lambda$observeOnAccessoryLost$17((AccessoryInquiryResult) obj);
                break;
        }
    }
}
