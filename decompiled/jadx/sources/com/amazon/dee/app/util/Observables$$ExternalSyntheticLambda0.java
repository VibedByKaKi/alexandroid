package com.amazon.dee.app.util;

import com.amazon.dee.app.services.alexadevicebackground.DefaultBackgroundImageService;
import kotlin.jvm.functions.Function2;
import rx.functions.Func2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class Observables$$ExternalSyntheticLambda0 implements Func2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 f$0;

    public /* synthetic */ Observables$$ExternalSyntheticLambda0(Function2 function2, int i) {
        this.$r8$classId = i;
        this.f$0 = function2;
    }

    @Override // rx.functions.Func2
    public final Object call(Object obj, Object obj2) {
        Integer exponentialBackoff$lambda$3$lambda$0;
        Integer update$lambda$8$lambda$6$lambda$2;
        int i = this.$r8$classId;
        Function2 function2 = this.f$0;
        switch (i) {
            case 0:
                exponentialBackoff$lambda$3$lambda$0 = Observables.exponentialBackoff$lambda$3$lambda$0(function2, obj, obj2);
                return exponentialBackoff$lambda$3$lambda$0;
            default:
                update$lambda$8$lambda$6$lambda$2 = DefaultBackgroundImageService.update$lambda$8$lambda$6$lambda$2(function2, obj, obj2);
                return update$lambda$8$lambda$6$lambda$2;
        }
    }
}
