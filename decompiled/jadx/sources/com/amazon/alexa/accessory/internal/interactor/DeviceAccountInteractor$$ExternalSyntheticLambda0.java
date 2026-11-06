package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.User;
import com.amazon.alexa.accessory.registration.DeviceRegistration;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DeviceAccountInteractor$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeviceAccountInteractor f$0;

    public /* synthetic */ DeviceAccountInteractor$$ExternalSyntheticLambda0(DeviceAccountInteractor deviceAccountInteractor, int i) {
        this.$r8$classId = i;
        this.f$0 = deviceAccountInteractor;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        ObservableSource lambda$observeLogins$3;
        ObservableSource lambda$observeLogins$5;
        ObservableSource lambda$handle1PAccessoryRegistrations$2;
        int i = this.$r8$classId;
        DeviceAccountInteractor deviceAccountInteractor = this.f$0;
        switch (i) {
            case 0:
                lambda$observeLogins$3 = deviceAccountInteractor.lambda$observeLogins$3((User) obj);
                return lambda$observeLogins$3;
            case 1:
                lambda$observeLogins$5 = deviceAccountInteractor.lambda$observeLogins$5((User) obj);
                return lambda$observeLogins$5;
            default:
                lambda$handle1PAccessoryRegistrations$2 = deviceAccountInteractor.lambda$handle1PAccessoryRegistrations$2((DeviceRegistration) obj);
                return lambda$handle1PAccessoryRegistrations$2;
        }
    }
}
