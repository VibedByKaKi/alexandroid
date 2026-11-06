package com.amazon.alexa.accessory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryConnection$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryConnection f$0;

    public /* synthetic */ AccessoryConnection$$ExternalSyntheticLambda1(AccessoryConnection accessoryConnection, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AccessoryConnection accessoryConnection = this.f$0;
        switch (i) {
            case 0:
                accessoryConnection.notifyConnectionKeepAlive();
                break;
            case 1:
                accessoryConnection.lambda$notifyConnectionOpened$1();
                break;
            case 2:
                accessoryConnection.lambda$notifyConnectionClosed$2();
                break;
            default:
                accessoryConnection.lambda$notifyConnectionKeepAlive$3();
                break;
        }
    }
}
