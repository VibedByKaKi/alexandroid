package com.amazon.alexa.accessorykit.finishsetup;

import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class FinishSetupInteractor$$ExternalSyntheticLambda3 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FinishSetupInteractor$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        Boolean lambda$isBlocklistedSession$2;
        Iterable lambda$observeNewlySetupDevices$3;
        List list = (List) obj;
        switch (this.$r8$classId) {
            case 0:
                lambda$isBlocklistedSession$2 = FinishSetupInteractor.lambda$isBlocklistedSession$2(list);
                return lambda$isBlocklistedSession$2;
            default:
                lambda$observeNewlySetupDevices$3 = InterProcessFASViewCoordinator.lambda$observeNewlySetupDevices$3(list);
                return lambda$observeNewlySetupDevices$3;
        }
    }
}
