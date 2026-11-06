package com.amazon.alexa.matter.commissioner;

import com.amazon.alexa.matter.client.credentiallockerservice.model.GetMatchingNetworksResponse;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MatterSDKCommissioningSession$$ExternalSyntheticLambda7 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MatterSDKCommissioningSession f$0;
    public final /* synthetic */ Optional f$1;
    public final /* synthetic */ Optional f$2;

    public /* synthetic */ MatterSDKCommissioningSession$$ExternalSyntheticLambda7(MatterSDKCommissioningSession matterSDKCommissioningSession, Optional optional, Optional optional2, int i) {
        this.$r8$classId = i;
        this.f$0 = matterSDKCommissioningSession;
        this.f$1 = optional;
        this.f$2 = optional2;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onScanNetworksSuccess$17(this.f$1, this.f$2, (GetMatchingNetworksResponse) obj);
                break;
            case 1:
                this.f$0.lambda$onGetMatchingNetworksResponse$20(this.f$1, this.f$2, (Throwable) obj);
                break;
            default:
                this.f$0.lambda$onScanNetworksSuccess$18(this.f$1, this.f$2, (Throwable) obj);
                break;
        }
    }
}
