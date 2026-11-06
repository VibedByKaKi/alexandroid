package com.amazon.alexa.accessory.avsclient.metrics;

import com.amazon.alexa.accessory.User;
import com.amazon.alexa.accessory.registration.FileSystemRegistrationSupplier;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryMetricsObserver$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map f$0;

    public /* synthetic */ AccessoryMetricsObserver$$ExternalSyntheticLambda0(Map map, int i) {
        this.$r8$classId = i;
        this.f$0 = map;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        Map lambda$getCustomAttributesForSession$4;
        Map lambda$getCustomAttributesForSession$6;
        Set lambda$queryRegistrations$2;
        int i = this.$r8$classId;
        Map map = this.f$0;
        switch (i) {
            case 0:
                lambda$getCustomAttributesForSession$4 = AccessoryMetricsObserver.lambda$getCustomAttributesForSession$4(map, (Set) obj);
                return lambda$getCustomAttributesForSession$4;
            case 1:
                lambda$getCustomAttributesForSession$6 = AccessoryMetricsObserver.lambda$getCustomAttributesForSession$6(map, (String) obj);
                return lambda$getCustomAttributesForSession$6;
            default:
                lambda$queryRegistrations$2 = FileSystemRegistrationSupplier.lambda$queryRegistrations$2(map, (User) obj);
                return lambda$queryRegistrations$2;
        }
    }
}
