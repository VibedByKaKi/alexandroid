package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.QuerySessionLocaleRequest;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda100 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ QuerySessionLocaleRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda100(AccessoriesRequestHandler accessoriesRequestHandler, QuerySessionLocaleRequest querySessionLocaleRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = querySessionLocaleRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource locale$lambda$75;
        SingleSource localeAsync$lambda$79;
        switch (this.$r8$classId) {
            case 0:
                locale$lambda$75 = AccessoriesRequestHandler.setLocale$lambda$75(this.f$0, this.f$1);
                return locale$lambda$75;
            default:
                localeAsync$lambda$79 = AccessoriesRequestHandler.setLocaleAsync$lambda$79(this.f$0, this.f$1);
                return localeAsync$lambda$79;
        }
    }
}
