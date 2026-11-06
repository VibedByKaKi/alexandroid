package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.QuerySessionIntListRequest;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda31 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ QuerySessionIntListRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda31(AccessoriesRequestHandler accessoriesRequestHandler, QuerySessionIntListRequest querySessionIntListRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = querySessionIntListRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        CompletableSource startLiveFitnessData$lambda$93;
        CompletableSource stopLiveFitnessData$lambda$94;
        switch (this.$r8$classId) {
            case 0:
                startLiveFitnessData$lambda$93 = AccessoriesRequestHandler.startLiveFitnessData$lambda$93(this.f$0, this.f$1);
                return startLiveFitnessData$lambda$93;
            default:
                stopLiveFitnessData$lambda$94 = AccessoriesRequestHandler.stopLiveFitnessData$lambda$94(this.f$0, this.f$1);
                return stopLiveFitnessData$lambda$94;
        }
    }
}
