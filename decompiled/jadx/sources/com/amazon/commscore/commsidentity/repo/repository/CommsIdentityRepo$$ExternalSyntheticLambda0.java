package com.amazon.commscore.commsidentity.repo.repository;

import io.reactivex.rxjava3.functions.Supplier;
import org.reactivestreams.Publisher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class CommsIdentityRepo$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommsIdentityRepo f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CommsIdentityRepo$$ExternalSyntheticLambda0(CommsIdentityRepo commsIdentityRepo, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = commsIdentityRepo;
        this.f$1 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        Publisher lambda$getAccount$4;
        Publisher lambda$getIdentityV2$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$getAccount$4 = this.f$0.lambda$getAccount$4(this.f$1);
                return lambda$getAccount$4;
            default:
                lambda$getIdentityV2$3 = this.f$0.lambda$getIdentityV2$3(this.f$1);
                return lambda$getIdentityV2$3;
        }
    }
}
