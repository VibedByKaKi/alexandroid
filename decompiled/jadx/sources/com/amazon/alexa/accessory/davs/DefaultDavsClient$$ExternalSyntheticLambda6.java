package com.amazon.alexa.accessory.davs;

import com.amazon.alexa.accessory.User;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultDavsClient$$ExternalSyntheticLambda6 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultDavsClient f$0;
    public final /* synthetic */ DeviceArtifactsRequest f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ DefaultDavsClient$$ExternalSyntheticLambda6(DefaultDavsClient defaultDavsClient, DeviceArtifactsRequest deviceArtifactsRequest, String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultDavsClient;
        this.f$1 = deviceArtifactsRequest;
        this.f$2 = str;
        this.f$3 = str2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$fetchDavsManifest$1;
        SingleSource lambda$getDavsI18nConfig$7;
        switch (this.$r8$classId) {
            case 0:
                lambda$fetchDavsManifest$1 = this.f$0.lambda$fetchDavsManifest$1(this.f$1, this.f$2, this.f$3, (User) obj);
                return lambda$fetchDavsManifest$1;
            default:
                lambda$getDavsI18nConfig$7 = this.f$0.lambda$getDavsI18nConfig$7(this.f$1, this.f$2, this.f$3, (User) obj);
                return lambda$getDavsI18nConfig$7;
        }
    }
}
