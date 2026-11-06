package com.amazon.alexa.accessoryservice.service.rxipc;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda11 implements ObservableOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda11(AccessoriesRequestHandler accessoriesRequestHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public final void subscribe(ObservableEmitter observableEmitter) {
        int i = this.$r8$classId;
        AccessoriesRequestHandler accessoriesRequestHandler = this.f$0;
        switch (i) {
            case 0:
                AccessoriesRequestHandler.observeSessionTransportChanged$lambda$25(accessoriesRequestHandler, observableEmitter);
                break;
            case 1:
                AccessoriesRequestHandler.observeSessionConnected$lambda$13(accessoriesRequestHandler, observableEmitter);
                break;
            case 2:
                AccessoriesRequestHandler.observeSessionDisconnected$lambda$16(accessoriesRequestHandler, observableEmitter);
                break;
            case 3:
                AccessoriesRequestHandler.observeOnBleAccessoryFoundNearby$lambda$52(accessoriesRequestHandler, observableEmitter);
                break;
            case 4:
                AccessoriesRequestHandler.observeOnBleDataBeaconFoundNearby$lambda$55(accessoriesRequestHandler, observableEmitter);
                break;
            case 5:
                AccessoriesRequestHandler.observeSessionCreated$lambda$10(accessoriesRequestHandler, observableEmitter);
                break;
            case 6:
                AccessoriesRequestHandler.observeSessionFailed$lambda$19(accessoriesRequestHandler, observableEmitter);
                break;
            case 7:
                AccessoriesRequestHandler.observeSessionReleased$lambda$22(accessoriesRequestHandler, observableEmitter);
                break;
            case 8:
                AccessoriesRequestHandler.observeOnConnectedAccessoryFound$lambda$58(accessoriesRequestHandler, observableEmitter);
                break;
            default:
                AccessoriesRequestHandler.observeOnConnectedAccessoryLost$lambda$61(accessoriesRequestHandler, observableEmitter);
                break;
        }
    }
}
