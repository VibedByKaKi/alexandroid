package com.amazon.commscore.commsidentity.implementation;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Supplier;
import org.reactivestreams.Publisher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class CommsCoreIdentityViewModel$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommsCoreIdentityViewModel f$0;

    public /* synthetic */ CommsCoreIdentityViewModel$$ExternalSyntheticLambda0(CommsCoreIdentityViewModel commsCoreIdentityViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = commsCoreIdentityViewModel;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        Publisher lambda$getCommsCoreIdentity$2;
        CompletableSource lambda$refreshCommsIdentity$0;
        int i = this.$r8$classId;
        CommsCoreIdentityViewModel commsCoreIdentityViewModel = this.f$0;
        switch (i) {
            case 0:
                lambda$getCommsCoreIdentity$2 = commsCoreIdentityViewModel.lambda$getCommsCoreIdentity$2();
                return lambda$getCommsCoreIdentity$2;
            default:
                lambda$refreshCommsIdentity$0 = commsCoreIdentityViewModel.lambda$refreshCommsIdentity$0();
                return lambda$refreshCommsIdentity$0;
        }
    }
}
