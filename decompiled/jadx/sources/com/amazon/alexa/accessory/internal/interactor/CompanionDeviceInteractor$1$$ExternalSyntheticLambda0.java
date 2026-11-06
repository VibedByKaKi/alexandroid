package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessorySessionListener;
import com.amazon.alexa.accessory.internal.interactor.CompanionDeviceInteractor;
import com.amazon.alexa.accessory.internal.interactor.ConnectivityInteractor;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class CompanionDeviceInteractor$1$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessorySessionListener f$0;
    public final /* synthetic */ Accessory f$1;

    public /* synthetic */ CompanionDeviceInteractor$1$$ExternalSyntheticLambda0(AccessorySessionListener accessorySessionListener, Accessory accessory, int i) {
        this.$r8$classId = i;
        this.f$0 = accessorySessionListener;
        this.f$1 = accessory;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        Boolean lambda$onAccessorySessionConnected$0;
        Long lambda$onAccessorySessionFailed$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$onAccessorySessionConnected$0 = ((CompanionDeviceInteractor.AnonymousClass1) this.f$0).lambda$onAccessorySessionConnected$0(this.f$1, (DeviceGroup) obj);
                return lambda$onAccessorySessionConnected$0;
            default:
                lambda$onAccessorySessionFailed$1 = ((ConnectivityInteractor.SessionListener) this.f$0).lambda$onAccessorySessionFailed$1(this.f$1, (Boolean) obj);
                return lambda$onAccessorySessionFailed$1;
        }
    }
}
