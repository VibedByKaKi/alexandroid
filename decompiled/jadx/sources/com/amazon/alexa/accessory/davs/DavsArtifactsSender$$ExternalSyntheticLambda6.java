package com.amazon.alexa.accessory.davs;

import com.amazon.alexa.accessory.davs.DeviceArtifactContract;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DavsArtifactsSender$$ExternalSyntheticLambda6 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DavsArtifactsSender f$0;
    public final /* synthetic */ DeviceArtifactContract.ArtifactPackage f$1;

    public /* synthetic */ DavsArtifactsSender$$ExternalSyntheticLambda6(DavsArtifactsSender davsArtifactsSender, DeviceArtifactContract.ArtifactPackage artifactPackage, int i) {
        this.$r8$classId = i;
        this.f$0 = davsArtifactsSender;
        this.f$1 = artifactPackage;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getCacheComponentResponse$9(this.f$1, (Throwable) obj);
                break;
            default:
                this.f$0.lambda$verifyArtifactSignatureResponse$7(this.f$1, (Throwable) obj);
                break;
        }
    }
}
