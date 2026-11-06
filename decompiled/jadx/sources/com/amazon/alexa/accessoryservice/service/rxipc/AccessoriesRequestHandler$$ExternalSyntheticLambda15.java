package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.QuerySessionBooleanRequest;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda15 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ QuerySessionBooleanRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda15(AccessoriesRequestHandler accessoriesRequestHandler, QuerySessionBooleanRequest querySessionBooleanRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = querySessionBooleanRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource requestCompleteSetup$lambda$36;
        SingleSource requestOverrideAssistant$lambda$35;
        SingleSource queryInventoryUpdateSet$lambda$47;
        switch (this.$r8$classId) {
            case 0:
                requestCompleteSetup$lambda$36 = AccessoriesRequestHandler.requestCompleteSetup$lambda$36(this.f$0, this.f$1);
                return requestCompleteSetup$lambda$36;
            case 1:
                requestOverrideAssistant$lambda$35 = AccessoriesRequestHandler.requestOverrideAssistant$lambda$35(this.f$0, this.f$1);
                return requestOverrideAssistant$lambda$35;
            default:
                queryInventoryUpdateSet$lambda$47 = AccessoriesRequestHandler.queryInventoryUpdateSet$lambda$47(this.f$0, this.f$1);
                return queryInventoryUpdateSet$lambda$47;
        }
    }
}
