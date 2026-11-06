package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.NotificationWithContentRequest;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda34 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ NotificationWithContentRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda34(AccessoriesRequestHandler accessoriesRequestHandler, NotificationWithContentRequest notificationWithContentRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = notificationWithContentRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource addOutgoingNotification$lambda$111;
        SingleSource updateOutgoingNotification$lambda$112;
        switch (this.$r8$classId) {
            case 0:
                addOutgoingNotification$lambda$111 = AccessoriesRequestHandler.addOutgoingNotification$lambda$111(this.f$0, this.f$1);
                return addOutgoingNotification$lambda$111;
            default:
                updateOutgoingNotification$lambda$112 = AccessoriesRequestHandler.updateOutgoingNotification$lambda$112(this.f$0, this.f$1);
                return updateOutgoingNotification$lambda$112;
        }
    }
}
