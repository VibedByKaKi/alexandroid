package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.CloudPairingSeedRequest;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda97 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ CloudPairingSeedRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda97(AccessoriesRequestHandler accessoriesRequestHandler, CloudPairingSeedRequest cloudPairingSeedRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = cloudPairingSeedRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource cloudPairingStatus$lambda$116;
        CompletableSource removeCloudPairingKeys$lambda$120;
        switch (this.$r8$classId) {
            case 0:
                cloudPairingStatus$lambda$116 = AccessoriesRequestHandler.getCloudPairingStatus$lambda$116(this.f$0, this.f$1);
                return cloudPairingStatus$lambda$116;
            default:
                removeCloudPairingKeys$lambda$120 = AccessoriesRequestHandler.removeCloudPairingKeys$lambda$120(this.f$0, this.f$1);
                return removeCloudPairingKeys$lambda$120;
        }
    }
}
