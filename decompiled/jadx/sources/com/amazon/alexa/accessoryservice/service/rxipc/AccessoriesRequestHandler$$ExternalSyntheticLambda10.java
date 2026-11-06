package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.QueryCameraRequest;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda10 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ QueryCameraRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda10(AccessoriesRequestHandler accessoriesRequestHandler, QueryCameraRequest queryCameraRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = queryCameraRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource cameraSetting$lambda$149;
        SingleSource cameraConfiguration$lambda$147;
        switch (this.$r8$classId) {
            case 0:
                cameraSetting$lambda$149 = AccessoriesRequestHandler.getCameraSetting$lambda$149(this.f$0, this.f$1);
                return cameraSetting$lambda$149;
            default:
                cameraConfiguration$lambda$147 = AccessoriesRequestHandler.getCameraConfiguration$lambda$147(this.f$0, this.f$1);
                return cameraConfiguration$lambda$147;
        }
    }
}
