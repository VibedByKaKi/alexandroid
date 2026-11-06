package com.amazon.alexa.identity;

import com.amazon.alexa.identity.AvatarURIModel;
import com.amazon.alexa.identity.MAPIdentityService;
import com.amazon.identity.auth.device.api.MAPRegulationConfig;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class AvatarURIModel$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AvatarURIModel$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$getAvatarUriForPersonId$1;
        Map lambda$onSuccess$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$getAvatarUriForPersonId$1 = AvatarURIModel.lambda$getAvatarUriForPersonId$1((AvatarURIModel.Profile) obj);
                return lambda$getAvatarUriForPersonId$1;
            case 1:
                lambda$onSuccess$0 = MAPIdentityService.AnonymousClass5.lambda$onSuccess$0((ArrayList) obj);
                return lambda$onSuccess$0;
            case 2:
                return ((MAPRegulationConfig.PrivacyObligation) obj).getPrivacyScope();
            default:
                return Boolean.valueOf(((MAPRegulationConfig.PrivacyObligation) obj).isApplicable());
        }
    }
}
