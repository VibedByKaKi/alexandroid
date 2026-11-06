package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.QuerySessionStringRequest;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda18 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ QuerySessionStringRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda18(AccessoriesRequestHandler accessoriesRequestHandler, QuerySessionStringRequest querySessionStringRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = querySessionStringRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource connectUser$lambda$70;
        CompletableSource sendProfileInfo$lambda$78;
        SingleSource disconnectUser$lambda$71;
        ObservableSource awaitDeviceAccount$lambda$82;
        SingleSource unpairUser$lambda$72;
        switch (this.$r8$classId) {
            case 0:
                connectUser$lambda$70 = AccessoriesRequestHandler.connectUser$lambda$70(this.f$0, this.f$1);
                return connectUser$lambda$70;
            case 1:
                sendProfileInfo$lambda$78 = AccessoriesRequestHandler.sendProfileInfo$lambda$78(this.f$0, this.f$1);
                return sendProfileInfo$lambda$78;
            case 2:
                disconnectUser$lambda$71 = AccessoriesRequestHandler.disconnectUser$lambda$71(this.f$0, this.f$1);
                return disconnectUser$lambda$71;
            case 3:
                awaitDeviceAccount$lambda$82 = AccessoriesRequestHandler.awaitDeviceAccount$lambda$82(this.f$0, this.f$1);
                return awaitDeviceAccount$lambda$82;
            default:
                unpairUser$lambda$72 = AccessoriesRequestHandler.unpairUser$lambda$72(this.f$0, this.f$1);
                return unpairUser$lambda$72;
        }
    }
}
