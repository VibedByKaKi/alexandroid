package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.StateRequest;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda71 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ StateRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda71(AccessoriesRequestHandler accessoriesRequestHandler, StateRequest stateRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = stateRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        CompletableSource state$lambda$33;
        ObservableSource queryState$lambda$34;
        switch (this.$r8$classId) {
            case 0:
                state$lambda$33 = AccessoriesRequestHandler.setState$lambda$33(this.f$0, this.f$1);
                return state$lambda$33;
            default:
                queryState$lambda$34 = AccessoriesRequestHandler.queryState$lambda$34(this.f$0, this.f$1);
                return queryState$lambda$34;
        }
    }
}
