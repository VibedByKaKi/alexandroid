package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.internal.interactor.CompanionDeviceInteractor;
import com.amazon.alexa.accessory.internal.interactor.ConnectivityInteractor;
import com.amazon.alexa.accessory.internal.interactor.DeviceInteractor;
import com.amazon.alexa.accessory.internal.interactor.RegistrationInteractor;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ConnectivityInteractor$$ExternalSyntheticLambda6 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Accessory f$0;

    public /* synthetic */ ConnectivityInteractor$$ExternalSyntheticLambda6(Accessory accessory, int i) {
        this.$r8$classId = i;
        this.f$0 = accessory;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Accessory accessory = this.f$0;
        switch (i) {
            case 0:
                ConnectivityInteractor.lambda$reconnect$6(accessory, (Throwable) obj);
                break;
            case 1:
                CompanionDeviceInteractor.AnonymousClass1.lambda$onAccessorySessionConnected$1(accessory, (Boolean) obj);
                break;
            case 2:
                CompanionDeviceInteractor.AnonymousClass1.lambda$onAccessorySessionConnected$2(accessory, (Throwable) obj);
                break;
            case 3:
                ConnectivityInteractor.SessionListener.lambda$onAccessorySessionFailed$3(accessory, (Throwable) obj);
                break;
            case 4:
                DeviceInteractor.AccessoryInteractorSessionListener.lambda$onAccessorySessionConnected$1(accessory, (Throwable) obj);
                break;
            default:
                RegistrationInteractor.AnonymousClass1.lambda$onAccessorySessionConnected$0(accessory, (List) obj);
                break;
        }
    }
}
