package com.amazon.alexa.accessory.registration;

import com.amazon.alexa.accessory.User;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class FileSystemRegistrationSupplier$$ExternalSyntheticLambda5 implements Function {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ FileSystemRegistrationSupplier f$0;
    public final /* synthetic */ User f$1;
    public final /* synthetic */ DeviceRegistrationRequest f$2;

    public /* synthetic */ FileSystemRegistrationSupplier$$ExternalSyntheticLambda5(FileSystemRegistrationSupplier fileSystemRegistrationSupplier, User user, DeviceRegistrationRequest deviceRegistrationRequest) {
        this.f$0 = fileSystemRegistrationSupplier;
        this.f$1 = user;
        this.f$2 = deviceRegistrationRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$registerCloudAndPersist$23;
        SingleSource lambda$getOrCreateDeviceRegistration$9;
        switch (this.$r8$classId) {
            case 0:
                User user = this.f$1;
                lambda$registerCloudAndPersist$23 = this.f$0.lambda$registerCloudAndPersist$23(user, this.f$2, (DeviceRegistration) obj);
                return lambda$registerCloudAndPersist$23;
            default:
                lambda$getOrCreateDeviceRegistration$9 = this.f$0.lambda$getOrCreateDeviceRegistration$9(this.f$2, this.f$1, (Throwable) obj);
                return lambda$getOrCreateDeviceRegistration$9;
        }
    }

    public /* synthetic */ FileSystemRegistrationSupplier$$ExternalSyntheticLambda5(FileSystemRegistrationSupplier fileSystemRegistrationSupplier, DeviceRegistrationRequest deviceRegistrationRequest, User user) {
        this.f$0 = fileSystemRegistrationSupplier;
        this.f$2 = deviceRegistrationRequest;
        this.f$1 = user;
    }
}
