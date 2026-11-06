package com.amazon.alexa.accessory.davs;

import com.amazon.alexa.accessory.User;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultDavsClient$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultDavsClient f$0;
    public final /* synthetic */ User f$1;
    public final /* synthetic */ DeviceArtifactsRequest f$2;

    public /* synthetic */ DefaultDavsClient$$ExternalSyntheticLambda0(DefaultDavsClient defaultDavsClient, User user, DeviceArtifactsRequest deviceArtifactsRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultDavsClient;
        this.f$1 = user;
        this.f$2 = deviceArtifactsRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$getDavsI18nConfig$4;
        SingleSource lambda$getDavsI18nConfig$5;
        switch (this.$r8$classId) {
            case 0:
                lambda$getDavsI18nConfig$4 = this.f$0.lambda$getDavsI18nConfig$4(this.f$1, this.f$2, (DavsI18nConfig) obj);
                return lambda$getDavsI18nConfig$4;
            default:
                lambda$getDavsI18nConfig$5 = this.f$0.lambda$getDavsI18nConfig$5(this.f$1, this.f$2, (DeviceArtifactsResponse) obj);
                return lambda$getDavsI18nConfig$5;
        }
    }
}
