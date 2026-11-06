package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.AccessoryRequest;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda149 implements CompletableOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ AccessoryRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda149(AccessoriesRequestHandler accessoriesRequestHandler, AccessoryRequest accessoryRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = accessoryRequest;
    }

    @Override // io.reactivex.rxjava3.core.CompletableOnSubscribe
    public final void subscribe(CompletableEmitter completableEmitter) {
        switch (this.$r8$classId) {
            case 0:
                AccessoriesRequestHandler.linkAccessory$lambda$6(this.f$0, this.f$1, completableEmitter);
                break;
            default:
                AccessoriesRequestHandler.unlinkAccessory$lambda$7(this.f$0, this.f$1, completableEmitter);
                break;
        }
    }
}
