package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.LiveAccessoryContextRequest;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda29 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ LiveAccessoryContextRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda29(AccessoriesRequestHandler accessoriesRequestHandler, LiveAccessoryContextRequest liveAccessoryContextRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = liveAccessoryContextRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        CompletableSource stopLiveAccessoryContext$lambda$122;
        ObservableSource startLiveAccessoryContext$lambda$121;
        switch (this.$r8$classId) {
            case 0:
                stopLiveAccessoryContext$lambda$122 = AccessoriesRequestHandler.stopLiveAccessoryContext$lambda$122(this.f$0, this.f$1);
                return stopLiveAccessoryContext$lambda$122;
            default:
                startLiveAccessoryContext$lambda$121 = AccessoriesRequestHandler.startLiveAccessoryContext$lambda$121(this.f$0, this.f$1);
                return startLiveAccessoryContext$lambda$121;
        }
    }
}
