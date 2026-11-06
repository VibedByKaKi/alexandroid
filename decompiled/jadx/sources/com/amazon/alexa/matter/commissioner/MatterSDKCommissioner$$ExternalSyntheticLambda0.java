package com.amazon.alexa.matter.commissioner;

import com.amazon.alexa.matter.client.gordonservice.model.SetupRequirementsRequest;
import com.amazon.alexa.matter.eventbus.schema.SetupPayload;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MatterSDKCommissioner$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MatterSDKCommissioner f$0;

    public /* synthetic */ MatterSDKCommissioner$$ExternalSyntheticLambda0(MatterSDKCommissioner matterSDKCommissioner, int i) {
        this.$r8$classId = i;
        this.f$0 = matterSDKCommissioner;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$openSession$0;
        SingleSource lambda$openSession$2;
        int i = this.$r8$classId;
        MatterSDKCommissioner matterSDKCommissioner = this.f$0;
        switch (i) {
            case 0:
                lambda$openSession$0 = matterSDKCommissioner.lambda$openSession$0((SetupRequirementsRequest) obj);
                return lambda$openSession$0;
            default:
                lambda$openSession$2 = matterSDKCommissioner.lambda$openSession$2((SetupPayload) obj);
                return lambda$openSession$2;
        }
    }
}
