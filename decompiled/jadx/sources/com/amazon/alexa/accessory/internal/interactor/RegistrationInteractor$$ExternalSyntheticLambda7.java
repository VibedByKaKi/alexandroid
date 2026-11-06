package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.User;
import com.amazon.alexa.accessory.registration.DeviceRegistration;
import io.reactivex.rxjava3.functions.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class RegistrationInteractor$$ExternalSyntheticLambda7 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RegistrationInteractor$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        boolean lambda$observeLogins$2;
        boolean lambda$observeLogins$4;
        boolean lambda$handle1PAccessoryRegistrations$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$observeLogins$2 = RegistrationInteractor.lambda$observeLogins$2((User) obj);
                return lambda$observeLogins$2;
            case 1:
                lambda$observeLogins$4 = DeviceAccountInteractor.lambda$observeLogins$4((User) obj);
                return lambda$observeLogins$4;
            default:
                lambda$handle1PAccessoryRegistrations$1 = DeviceAccountInteractor.lambda$handle1PAccessoryRegistrations$1((DeviceRegistration) obj);
                return lambda$handle1PAccessoryRegistrations$1;
        }
    }
}
