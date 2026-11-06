package com.amazon.alexa.crashreporting;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.bugsnag.android.Error;
import com.bugsnag.android.Stackframe;
import java.util.Optional;
import java.util.function.Function;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CustomGroupingHashProvider$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CustomGroupingHashProvider$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional signatureFor;
        String lambda$isEnabled$1;
        Boolean lambda$isEnabled$2;
        switch (this.$r8$classId) {
            case 0:
                signatureFor = CustomGroupingHashProvider.signatureFor((Error) obj);
                return signatureFor;
            case 1:
                lambda$isEnabled$1 = CustomGroupingHashProvider.lambda$isEnabled$1((FeatureServiceV2) obj);
                return lambda$isEnabled$1;
            case 2:
                lambda$isEnabled$2 = CustomGroupingHashProvider.lambda$isEnabled$2((String) obj);
                return lambda$isEnabled$2;
            case 3:
                return (Stackframe) ((Optional) obj).get();
            case 4:
                return (FeatureServiceV2) ((Provider) obj).get();
            default:
                return (String) ((Optional) obj).get();
        }
    }
}
