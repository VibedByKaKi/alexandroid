package com.amazon.alexa.accessory.internal.connection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ConnectionTransportReceiver$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConnectionTransportReceiver f$0;

    public /* synthetic */ ConnectionTransportReceiver$$ExternalSyntheticLambda0(ConnectionTransportReceiver connectionTransportReceiver, int i) {
        this.$r8$classId = i;
        this.f$0 = connectionTransportReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ConnectionTransportReceiver connectionTransportReceiver = this.f$0;
        switch (i) {
            case 0:
                connectionTransportReceiver.lambda$notifyDisconnected$2();
                break;
            case 1:
                connectionTransportReceiver.lambda$notifyIdle$3();
                break;
            case 2:
                connectionTransportReceiver.lambda$notifyActive$4();
                break;
            case 3:
                connectionTransportReceiver.lambda$notifyConnected$0();
                break;
            case 4:
                connectionTransportReceiver.notifyIdle();
                break;
            default:
                connectionTransportReceiver.notifyActive();
                break;
        }
    }
}
