package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.internal.PeripheralConnectivity;
import com.amazon.alexa.accessory.internal.interactor.ConnectivityInteractor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ConnectivityInteractor$$ExternalSyntheticLambda7 implements PeripheralConnectivity.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Accessory f$1;

    public /* synthetic */ ConnectivityInteractor$$ExternalSyntheticLambda7(Object obj, Accessory accessory, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = accessory;
    }

    @Override // com.amazon.alexa.accessory.internal.PeripheralConnectivity.Callback
    public final void onConnectionStatus(PeripheralConnectivity.ConnectionStatus connectionStatus) {
        switch (this.$r8$classId) {
            case 0:
                ((ConnectivityInteractor) this.f$0).lambda$reconnectAfterDelay$7(this.f$1, connectionStatus);
                break;
            default:
                ((ConnectivityInteractor.SessionListener) this.f$0).lambda$onAccessorySessionFailed$4(this.f$1, connectionStatus);
                break;
        }
    }
}
